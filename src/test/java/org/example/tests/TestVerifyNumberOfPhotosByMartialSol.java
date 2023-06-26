package org.example.tests;

import org.example.helpers.PhotoHelper;
import org.example.model.PhotoPOJO;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class TestVerifyNumberOfPhotosByMartialSol {
    private PhotoHelper photoHelper;

    @BeforeClass
    public void init(){
        photoHelper = new PhotoHelper();
    }

    @Test
    public void testVerifyNumberOfPhotosByMartialSol(){
        HashMap<String, String> params = new HashMap<>();
        params.put("sol","1000");
        List<PhotoPOJO> photoPOJOList = photoHelper.getPhotos(params);
        assertEquals(photoPOJOList.size(), 25);
    }
}
