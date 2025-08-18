package com.java.AI_Guardian.message.shelter.service;

import com.java.AI_Guardian.ApiCaller;
import com.java.AI_Guardian.message.dto.TsunamiShelterDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TsunamiShelterService {

    private final ApiCaller apiCaller;

    public List<TsunamiShelterDto.Response> tsunamiShelter(TsunamiShelterDto.Request request) {
        return apiCaller.callApi(request);
    }
}
