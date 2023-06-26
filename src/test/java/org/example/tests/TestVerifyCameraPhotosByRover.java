package org.example.tests;

import org.example.helpers.PhotoHelper;
import org.example.model.PhotoPOJO;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.List;
import static org.testng.Assert.assertTrue;
public class TestVerifyCameraPhotosByRover {

    private PhotoHelper photoHelper;

    @BeforeClass
    public void init(){
        photoHelper = new PhotoHelper();
    }

    @Test
    public void testVerifyCameraPhotosByRover(){
        HashMap <String, String> params = new HashMap<>();
        params.put("camera","mast");
        List<PhotoPOJO> photoPOJOList = photoHelper.getPhotos(params);
        assertTrue(photoHelper.verifyPhotoRoverName(photoPOJOList, "Curiosity"));
    }

}
