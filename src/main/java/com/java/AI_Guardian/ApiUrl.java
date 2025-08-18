package com.java.AI_Guardian;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Component
public class ApiUrl {

    private static final String BASE_URL = "https://www.safetydata.go.kr/";
    @Value("V2/api/DSSP-IF-10804?serviceKey=W3HV579YEDVK850D")
    private String coldShelterURL;
    @Value("V2/api/DSSP-IF-10748?serviceKey=54900QA3GC4Z5734")
    private String emergencyMessageURL;
    @Value("V2/api/DSSP-IF-10944?serviceKey=JTVDF9G204FVNN20")
    private String tsunamiShelterURL;
    @Value("V2/api/DSSP-IF-10941?serviceKey=7MB062LYP8Z2SXNT")
    private String integratedShelterURL;
    @Value("V2/api/DSSP-IF-10942?serviceKey=6U5P68HBD1J45SUA")
    private String swelterShelterURL;
    @Value("V2/api/DSSP-IF-00247?serviceKey=294489N0IAGO30XG")
    private String disasterMessageURL;

    public String getBaseUrl() {
        return BASE_URL;
    }
}