package com.java.AI_Guardian.message.shelter.controller;

import com.java.AI_Guardian.message.dto.IntegratedShelterDto;
import com.java.AI_Guardian.message.shelter.service.IntegratedShelterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/shelter/integrated")
public class IntegratedShelterController {

    private final IntegratedShelterService integratedShelterService;

    public List<IntegratedShelterDto.Response> integratedShelter(@RequestBody IntegratedShelterDto.Request request) {
        return integratedShelterService.getIntegratedShelter(request);
    }
}
