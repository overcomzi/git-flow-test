package org.example;

import org.example.services.PetService;

public class RestWrapper {
    private static String BASE_URL = "https://petstore.swagger.io/v2";

    private PetService petService;

    private RestWrapper() {
        petService = new PetService();
    }

    public static  RestWrapper prepare() {
       return new RestWrapper();
    }

    public static String getBaseUrl() {
        return BASE_URL;
    }

    public static void setBaseUrl(String baseUrl) {
        BASE_URL = baseUrl;
    }

    public PetService getPetService() {
        return petService;
    }

    private void setPetService(PetService petService) {
        this.petService = petService;
    }
}
