package com.java.AI_Guardian.message.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

public class TsunamiShelterDto {
    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Request {
        private String serviceKey;    // 서비스키
        private Integer numOfRows;    // 페이지당개수
        private Integer pageNo;       // 페이지번호
        private String returnType;    // 응답타입(json,xml)
        private String startLot;      // 시작경도
        private String endLot;        // 종료경도
        private String startLat;      // 시작위도
        private String endLat;        // 종료위도
    }

    @Getter
    @Builder
    @ToString
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Response {

        private Header header;
        private Integer numOfRows;
        private Integer pageNo;
        private Integer totalCount;
        private List<Body> body;

        @Getter
        @Setter
        @NoArgsConstructor
        @AllArgsConstructor
        @Builder
        @ToString
        @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
        public static class Header {
            private String resultMsg;
            private String resultCode;
            private String errorMsg;
        }

        @Getter
        @Setter
        @NoArgsConstructor
        @AllArgsConstructor
        @Builder
        @ToString
        @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
        public static class Body {
            @JsonProperty("LO")
            private Double lo;

            @JsonProperty("LA")
            private Double la;

            @JsonProperty("SHNT_PLACE_SN")
            private Integer shntPlaceSn;

            @JsonProperty("SHNTDTR_SN")
            private Integer shntdtrSn;

            @JsonProperty("RN_DTL_ADRES")
            private String rnDtlAdres;

            @JsonProperty("SHNT_PLACE_NM")
            private String shntPlaceNm;

            @JsonProperty("EV_ANTCTY")
            private Integer evAntcty;

            @JsonProperty("ARCD")
            private String arcd;

            @JsonProperty("SHNT_PLACE_DTL_POSITION")
            private String shntPlaceDtlPosition;

            @JsonProperty("USE_AT")
            private String useAt;

            @JsonProperty("SHNT_PLACE_TY_CD")
            private String shntPlaceTyCd;

            @JsonProperty("ERTHQK_SHUNT_AT")
            private String erthqkShuntAt;

            @JsonProperty("PSBL_NMPR")
            private Integer psblNmpr;

            @JsonProperty("RDNMADR_CD")
            private String rdnmadrCd;
        }
    }
}
