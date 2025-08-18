package com.java.AI_Guardian.message.shelter.service;

import com.java.AI_Guardian.ApiCaller;
import com.java.AI_Guardian.message.dto.IntegratedShelterDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IntegratedShelterService {

    private final ApiCaller apiCaller;

    public List<IntegratedShelterDto.Response> getIntegratedShelter(IntegratedShelterDto.Request request) {
        return apiCaller.callApi(request);
    }
}
