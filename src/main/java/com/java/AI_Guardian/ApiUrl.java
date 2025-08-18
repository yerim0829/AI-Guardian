package com.java.AI_Guardian;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Component
public class ApiUrl {

    private static final String BASE_URL = "https://www.safetydata.go.kr/";
    @Value("${cold.shelter.url}")
    private String coldShelterURL;
    @Value("${emergency.text.url}")
    private String emergencyMessageURL;
    @Value("${tsunami.shelter.url}")
    private String tsunamiShelterURL;

    public String getBaseUrl() {
        return BASE_URL;
    }
}