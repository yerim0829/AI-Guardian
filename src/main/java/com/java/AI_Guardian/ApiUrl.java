package com.java.AI_Guardian;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Component
public class ApiUrl {

    private static final String BASE_URL = "https://www.safetydata.go.kr/";
    @Value("COLDSHELTER_URL")
    private String coldShelterURL;
    @Value("EMERGENCY_TEXT_URL")
    private String emergencyMessageURL;
    @Value("TSUNAMI_URL")
    private String tsunamiShelterURL;
    @Value("INTEGRATED_URL")
    private String integratedShelterURL;
    @Value("SWELTER_URL")
    private String swelterShelterURL;
    @Value("DISASTER_TEXT_URL")
    private String disasterMessageURL;

    public String getBaseUrl() {
        return BASE_URL;
    }
}