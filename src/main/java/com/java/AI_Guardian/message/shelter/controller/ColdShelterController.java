package com.java.AI_Guardian.message.shelter.controller;


import com.java.AI_Guardian.message.dto.ColdShelterDto;
import com.java.AI_Guardian.message.shelter.service.ColdShelterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("shelter/cold")
public class ColdShelterController {

    private final ColdShelterService coldShelterService;


    /**{
     *ex)
     "numOfRows": 10,
     "pageNo": 1,
     "startLot": 127.0,
     "endLot": 129.0,
     "startLat": 35.0,
     "endLat": 37.0
     }
     */
    @PostMapping
    public List<ColdShelterDto.Response> coldShelter(@RequestBody ColdShelterDto.Request request) {

        return coldShelterService.getColdShelter(request);
    }
}
