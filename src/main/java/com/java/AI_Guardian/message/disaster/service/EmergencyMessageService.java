package com.java.AI_Guardian.message.disaster.service;

import com.java.AI_Guardian.ApiCaller;
import com.java.AI_Guardian.message.disaster.dto.EmergencyMassageDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EmergencyMessageService {

    private final ApiCaller apiCaller;

    public List<EmergencyMassageDto.Response> read(EmergencyMassageDto.Request request) {
        return apiCaller.callApi(request);
    }
}
