package com.java.AI_Guardian.message.shelter.controller;

import com.java.AI_Guardian.message.dto.TsunamiShelterDto;
import com.java.AI_Guardian.message.shelter.service.TsunamiShelterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("shelter/tsunami")
public class TsunamiShelterController {

    private final TsunamiShelterService tsunamiShelterService;

    /**{
     *ex)한파 쉼터와 동일
     "numOfRows": 10,
     "pageNo": 1,
     "startLot": 127.0,
     "endLot": 129.0,
     "startLat": 35.0,
     "endLat": 37.0
     }
     */

    @PostMapping
    public List<TsunamiShelterDto.Response> tsunamiShelter(@RequestBody TsunamiShelterDto.Request request) {
        return tsunamiShelterService.tsunamiShelter(request);
    }
}
