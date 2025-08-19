package com.java.AI_Guardian.message.shelter.controller;

import com.java.AI_Guardian.message.dto.SwelterShelterDto;
import com.java.AI_Guardian.message.shelter.service.SwelterShelterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/shelter/swelter")
public class SwelterShelterController {

    private final SwelterShelterService swelterShelterService;

    public List<SwelterShelterDto.Response> swelterShelter(@RequestBody SwelterShelterDto.Request request) {
        return swelterShelterService.getSwelterShelter(request);
    }
}
