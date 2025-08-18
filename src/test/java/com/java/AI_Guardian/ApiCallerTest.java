package com.java.AI_Guardian;

import com.java.AI_Guardian.message.disaster.dto.EmergencyMassageDto;
import com.java.AI_Guardian.message.dto.ColdShelterDto;
import com.java.AI_Guardian.message.dto.TsunamiShelterDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class ApiCallerTest {

    @Autowired
    private ApiCaller apiCaller;

    @Test
    public void callApi() {
        ColdShelterDto.Request request = ColdShelterDto.Request.builder()
                .numOfRows(10)
                .pageNo(1)
                .startLot("129")
                .endLot("129.4389305")
                .startLat("36")
                .endLat("36.6774715")
                .build();
        List<ColdShelterDto.Response> responses = apiCaller.callApi(request);
        System.out.println("responses = " + responses);
    }

    @Test
    public void callApiTsunamiShelter() {
        TsunamiShelterDto.Request request = TsunamiShelterDto.Request.builder()
                .numOfRows(10)
                .pageNo(1)
                .startLot("129")
                .endLot("129.4389305")
                .startLat("36")
                .endLat("36.6774715")
                .build();
        List<TsunamiShelterDto.Response> responses = apiCaller.callApi(request);
        System.out.println("responses = " + responses);
    }

    @Test
    void callApiEmergencyMessage() {
        EmergencyMassageDto.Request request = EmergencyMassageDto.Request.builder()
                .numOfRows(10)
                .pageNo(1)
                .build();
        List<EmergencyMassageDto.Response> responses = apiCaller.callApi(request);
        System.out.println("responses = " + responses);
    }

}