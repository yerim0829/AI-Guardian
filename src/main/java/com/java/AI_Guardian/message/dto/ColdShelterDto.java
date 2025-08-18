package com.java.AI_Guardian.message.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

/**
 * 요청변수(Request Parameter)
 * 항목명(국문)	항목명(영문)	타입	항목크기	항목구분	항목설명
 * 서비스키	serviceKey	STRING	50	Y	서비스키
 * 페이지당개수	numOfRows	NUMBER	30	N	페이지당개수
 * 페이지번호	pageNo	NUMBER	30	N	페이지번호
 * 응답타입(json,xml)	returnType	VARCHAR	30	N	응답타입(json,xml)
 * 시작경도	startLot	STRING		N	시작경도
 * 종료경도	endLot	STRING		N	종료경도
 * 시작위도	startLat	STRING		N	시작위도
 * 종료위도	endLat	STRING		N	종료위도
 * 대피소구분코드(한파쉼터:1,무더위쉼터:2,지진옥외대피장소:3,지진해일긴급대피장소:4)	shlt_se_cd	STRING		N	대피소구분코드(한파쉼터:1,무더위쉼터:2,지진옥외대피장소:3,지진해일긴급대피장소:4)
 */

public class ColdShelterDto {

    @Getter
    @Builder
    @ToString
    @AllArgsConstructor
    @RequiredArgsConstructor
    public static class Request {
        private int numOfRows;//페이지당 데이터 개수
        private int pageNo;//페이지 번호 1 ~
//        private String returnType = "json";//json,xml

        private String startLot;//시작경도
        private String endLot;//종료경도
        private String startLat;//시작위도
        private String endLat;//종료위도
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

            @JsonProperty("SNDY_OPER_BGNG_HR")
            private String sndyOperBgngHr;

            @JsonProperty("MDFCN_HR")
            private String mdfcnHr;

            @JsonProperty("RONA_DADDR")
            private String ronaDaddr;

            @JsonProperty("LHLDY_OPER_END_HR")
            private String lhlDyOperEndHr;

            @JsonProperty("DADDR")
            private String daddr;

            @JsonProperty("UTZTN_PSBLTY_TNOP")
            private int utztnPsbltyTnop;

            @JsonProperty("WKDY_OPER_BGNG_HR")
            private String wkdyOperBgngHr;

            @JsonProperty("STDY_OPER_END_HR")
            private String stdyOperEndHr;

            @JsonProperty("SNDY_OPER_END_HR")
            private String sndyOperEndHr;

            @JsonProperty("FCLT_TYPE")
            private String fcltType;

            @JsonProperty("FCLTY_SCLAS")
            private String fcltySclas;

            @JsonProperty("REARE_FCLT_NO")
            private long reareFcltNo;

            @JsonProperty("LOT")
            private double lot;

            @JsonProperty("STDY_OPER_BGNG_HR")
            private String stdyOperBgngHr;

            @JsonProperty("RMRK")
            private String rmrk;

            @JsonProperty("LHLDY_OPER_BGNG_HR")
            private String lhlDyOperBgngHr;

            @JsonProperty("WKDY_OPER_END_HR")
            private String wkdyOperEndHr;

            @JsonProperty("LAT")
            private double lat;
        }
    }


}
