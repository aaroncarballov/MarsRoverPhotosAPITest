package org.example.helpers;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.example.model.PhotoPOJO;
import org.example.utils.ConfigManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

import static org.testng.Assert.assertEquals;

public class PhotoHelper {
    private static final String BASE_URL = ConfigManager.getInstance().getString("baseUrl");
    private static final String API_KEY = ConfigManager.getInstance().getString("apiKey");

    public PhotoHelper(){
        RestAssured.baseURI = BASE_URL;
    }

    public List<PhotoPOJO> getPhotos(HashMap<String, String> params){
        params.put("api_key", API_KEY);
        Response response = RestAssured
                .given().log().all()
                .contentType(ContentType.JSON)
                .params(params)
                .get(BASE_URL)
                .andReturn();
        assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        JsonPath jsonPath = response.jsonPath();
        List<PhotoPOJO> photoPOJOList = new ArrayList<>();
        for (int i = 0; i < jsonPath.getInt("photos.size()"); i++){
            PhotoPOJO photoPOJO = jsonPath.getObject("photos[" + i + "]", PhotoPOJO.class);
            photoPOJOList.add(photoPOJO);
        }

        return photoPOJOList;
    }

    public boolean verifyPhotoRoverName(List<PhotoPOJO> photoPOJOList, String roverName){
        for (PhotoPOJO photoPOJO : photoPOJOList) {
            if (!Objects.equals(photoPOJO.getRover().getName(), roverName)) {
                return false;
            }
        }
        return true;
    }
}
