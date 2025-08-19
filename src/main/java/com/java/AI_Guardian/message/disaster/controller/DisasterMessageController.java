package com.java.AI_Guardian.message.disaster.controller;

import com.java.AI_Guardian.message.disaster.dto.DisasterMessageDto;
import com.java.AI_Guardian.message.disaster.service.DisasterMessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("message/disaster")
public class DisasterMessageController {

    private final DisasterMessageService disasterMessageService;

    @PostMapping
    public List<DisasterMessageDto.Response> readDisaster(@RequestBody DisasterMessageDto.Request disasterMassageDto) {
        List<DisasterMessageDto.Response> read = disasterMessageService.read(disasterMassageDto);
        return read;
    }

}