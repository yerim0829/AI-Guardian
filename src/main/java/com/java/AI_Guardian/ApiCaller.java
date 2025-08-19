package com.java.AI_Guardian;

import com.java.AI_Guardian.message.disaster.dto.DisasterMessageDto;
import com.java.AI_Guardian.message.disaster.dto.EmergencyMassageDto;
import com.java.AI_Guardian.message.dto.ColdShelterDto;
import com.java.AI_Guardian.message.dto.IntegratedShelterDto;
import com.java.AI_Guardian.message.dto.SwelterShelterDto;
import com.java.AI_Guardian.message.dto.TsunamiShelterDto;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Component
public class ApiCaller {
    private final WebClient webClient;


    private final ApiUrl apiUrl;

    // 생성자 주입 방식 (Spring Bean으로 관리)
    public ApiCaller(WebClient.Builder webClientBuilder, ApiUrl apiUrl) {
        this.webClient = webClientBuilder.baseUrl(apiUrl.getBaseUrl()).build();
        this.apiUrl = apiUrl;
    }


    public List<ColdShelterDto.Response> callApi(ColdShelterDto.Request coldShelterDto) {

        System.out.println("apiUrl.getBaseUrl() = " + apiUrl.getBaseUrl());
        System.out.println("apiUrl.getColdShelterURL() = " + apiUrl.getColdShelterURL());
        System.out.println("coldShelterDto = " + coldShelterDto);
        return webClient.get()
                .uri(uriBuilder -> {
                    uriBuilder.path(apiUrl.getColdShelterURL())
                            .queryParam("startLot", coldShelterDto.getStartLot())
                            .queryParam("endLot", coldShelterDto.getEndLot())
                            .queryParam("startLat", coldShelterDto.getStartLat())
                            .queryParam("endLat", coldShelterDto.getEndLat())
                            .queryParam("numOfRows", coldShelterDto.getNumOfRows())
                            .queryParam("pageNo", coldShelterDto.getPageNo())
                            .queryParam("returnType", "json");
                    return uriBuilder.build();
                })  // baseUrl + "/data"
                .retrieve()
                .bodyToFlux(ColdShelterDto.Response.class)
                .collectList()
                .block();  // 동기 호출 (단순 API 호출이면 block() 써도 OK)
    }

    public List<TsunamiShelterDto.Response> callApi(TsunamiShelterDto.Request tsunamiShelterDto) {
        System.out.println("apiUrl.getBaseUrl() = " + apiUrl.getBaseUrl());
        System.out.println("apiUrl.getColdShelterURL() = " + apiUrl.getColdShelterURL());
        System.out.println("tsunamiShelterDto = " + tsunamiShelterDto);

        return webClient.get()
                .uri(uriBuilder -> {
                    uriBuilder.path(apiUrl.getTsunamiShelterURL())
                            .queryParam("startLot", tsunamiShelterDto.getStartLot())
                            .queryParam("endLot", tsunamiShelterDto.getEndLot())
                            .queryParam("startLat", tsunamiShelterDto.getStartLat())
                            .queryParam("endLat", tsunamiShelterDto.getEndLat())
                            .queryParam("numOfRows", tsunamiShelterDto.getNumOfRows())
                            .queryParam("pageNo", tsunamiShelterDto.getPageNo())
                            .queryParam("returnType", "json");
                    return uriBuilder.build();

                })
                .retrieve()
                .bodyToFlux(TsunamiShelterDto.Response.class)
                .collectList()
                .block();  // 동기 호출 (단순 API 호출이면 block() 써도 OK)
    }

    public List<IntegratedShelterDto.Response> callApi(IntegratedShelterDto.Request integratedShelterDto) {
        System.out.println("apiUrl.getBaseUrl() = " + apiUrl.getBaseUrl());
        System.out.println("apiUrl.getIntegratedShelterURL() = " + apiUrl.getIntegratedShelterURL());
        System.out.println("integratedShelterDto = " + integratedShelterDto);

        return webClient.get()
                .uri(uriBuilder -> {
                    uriBuilder.path(apiUrl.getIntegratedShelterURL())
                            .queryParam("startLot", integratedShelterDto.getStartLot())
                            .queryParam("endLot", integratedShelterDto.getEndLot())
                            .queryParam("startLat", integratedShelterDto.getStartLat())
                            .queryParam("endLat", integratedShelterDto.getEndLat())
                            .queryParam("numOfRows", integratedShelterDto.getNumOfRows())
                            .queryParam("pageNo", integratedShelterDto.getPageNo())
                            .queryParam("resultType", "json");
                    return uriBuilder.build();

                })
                .retrieve()
                .bodyToFlux(IntegratedShelterDto.Response.class)
                .collectList()
                .block();  // 동기 호출 (단순 API 호출이면 block() 써도 OK)
    }

    public List<SwelterShelterDto.Response> callApi(SwelterShelterDto.Request swelterShelterDto) {
        System.out.println("apiUrl.getBaseUrl() = " + apiUrl.getBaseUrl());
        System.out.println("apiUrl.getSwelterShelterURL() = " + apiUrl.getSwelterShelterURL());
        System.out.println("swelterShelterDto = " + swelterShelterDto);

        return webClient.get()
                .uri(uriBuilder -> {
                    uriBuilder.path(apiUrl.getSwelterShelterURL())
                            .queryParam("startLot", swelterShelterDto.getStartLot())
                            .queryParam("endLot", swelterShelterDto.getEndLot())
                            .queryParam("startLat", swelterShelterDto.getStartLat())
                            .queryParam("endLat", swelterShelterDto.getEndLat())
                            .queryParam("numOfRows", swelterShelterDto.getNumOfRows())
                            .queryParam("pageNo", swelterShelterDto.getPageNo())
                            .queryParam("resultType", "json");
                    return uriBuilder.build();

                })
                .retrieve()
                .bodyToFlux(SwelterShelterDto.Response.class)
                .collectList()
                .block();  // 동기 호출 (단순 API 호출이면 block() 써도 OK)
    }

    public List<DisasterMessageDto.Response> callApi(DisasterMessageDto.Request request) {
        return webClient.get()
                .uri(uriBuilder -> {
                    uriBuilder.path(apiUrl.getDisasterMessageURL())
                            .queryParam("numOfRows", request.getNumOfRows())
                            .queryParam("pageNo", request.getPageNo())
                            .queryParam("returnType", "json");
                    return uriBuilder.build();
                })
                .retrieve()
                .bodyToFlux(DisasterMessageDto.Response.class)
                .collectList()
                .block();  // 동기 호출 (단순 API 호출이면 block() 써도 OK)
    }

    public List<EmergencyMassageDto.Response> callApi(EmergencyMassageDto.Request request) {
        return webClient.get()
                .uri(uriBuilder -> {
                    uriBuilder.path(apiUrl.getEmergencyMessageURL())
                            .queryParam("numOfRows", request.getNumOfRows())
                            .queryParam("pageNo", request.getPageNo())
                            .queryParam("returnType", "json");
                    return uriBuilder.build();
                })
                .retrieve()
                .bodyToFlux(EmergencyMassageDto.Response.class)
                .collectList()
                .block();  // 동기 호출 (단순 API 호출이면 block() 써도 OK)
    }
}
