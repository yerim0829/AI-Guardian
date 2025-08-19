package com.java.AI_Guardian.message.shelter.service;

import com.java.AI_Guardian.ApiCaller;
import com.java.AI_Guardian.message.dto.SwelterShelterDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SwelterShelterService {

    private final ApiCaller apiCaller;

    public List<SwelterShelterDto.Response> getSwelterShelter(SwelterShelterDto.Request request) {
        return apiCaller.callApi(request);
    }
}
