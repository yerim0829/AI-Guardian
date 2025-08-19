package com.java.AI_Guardian.message.disaster.service;

import com.java.AI_Guardian.ApiCaller;
import com.java.AI_Guardian.message.disaster.dto.DisasterMessageDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DisasterMessageService {

    private final ApiCaller apiCaller;

    public List<DisasterMessageDto.Response> read(DisasterMessageDto.Request request) {
        return apiCaller.callApi(request);
    }
}
