package com.java.AI_Guardian.message.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

public class IntegratedShelterDto {

    @Getter
    @Builder
    @AllArgsConstructor
    @RequiredArgsConstructor
    @ToString
    public static class Request {
        private int numOfRows;
        private int pageNo;
        private String resultType;
        private String startLot;
        private String endLot;
        private String startLat;
        private String endLat;
    }

    @Getter
    @Builder
    @AllArgsConstructor
    @RequiredArgsConstructor
    @ToString
    public static class Response {

        private Header header;

        private int numOfRows;
        private int pageNo;
        private int totalCount;

        private List<Body> body;

        @Getter
        @Setter
        @ToString
        public static class Header {
            private String resultMsg;
            private String resultCode;
            private String errorMsg;
        }

        @Getter
        @Setter
        @ToString
        public static class Body {

            @JsonProperty("REARE_NM")
            private String reareNm;

            @JsonProperty("LOT")
            private Double lot;

            @JsonProperty("MNG_SN")
            private String mngSn;

            @JsonProperty("RONA_DADDR")
            private String ronaDaddr;

            @JsonProperty("SHLT_SE_NM")
            private String shltSeNm;

            @JsonProperty("LAT")
            private Double lat;

            @JsonProperty("SHLT_SE_CD")
            private String shltSeCd;
        }
    }
}
