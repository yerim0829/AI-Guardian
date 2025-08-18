package com.java.AI_Guardian.message.disaster.controller;

import com.java.AI_Guardian.message.disaster.dto.EmergencyMassageDto;
import com.java.AI_Guardian.message.disaster.service.EmergencyMessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("message/emergency")
public class EmergencyMessageController {

    private final EmergencyMessageService emergencyMessageService;

    /**
     * {
     * "numOfRows": 10,
     * "pageNo": 1,
     * }
     */
    @PostMapping
    public List<EmergencyMassageDto.Response> readEmergency(@RequestBody EmergencyMassageDto.Request emergencyMassageDto) {
        List<EmergencyMassageDto.Response> read = emergencyMessageService.read(emergencyMassageDto);
        return read;
    }
}
