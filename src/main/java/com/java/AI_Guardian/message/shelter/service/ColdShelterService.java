package com.java.AI_Guardian.message.shelter.service;

import com.java.AI_Guardian.ApiCaller;
import com.java.AI_Guardian.message.dto.ColdShelterDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ColdShelterService {

    private final ApiCaller apiCaller;
    public List<ColdShelterDto.Response> getColdShelter(ColdShelterDto.Request request) {
        List<ColdShelterDto.Response> responses = apiCaller.callApi(request);
        System.out.println("responses = " + responses);
        return responses;
    }

}
