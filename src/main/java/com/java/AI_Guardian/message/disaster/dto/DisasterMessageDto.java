package com.java.AI_Guardian.message.disaster.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

public class DisasterMessageDto {

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @ToString
    public static class Request {
        private int numOfRows;
        private int pageNo;
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @ToString
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
        public static class Body {

            @JsonProperty("SN")
            private int sn;

            @JsonProperty("CRT_DT")
            private String crtDt;

            @JsonProperty("MSG_CN")
            private String msgCn;

            @JsonProperty("RCPTN_RGN_NM")
            private String rcptnRgnNm;

            @JsonProperty("EMRG_STEP_NM")
            private String emrgStepNm;

            @JsonProperty("DST_SE_NM")
            private String dstSeNm;

            @JsonProperty("REG_YMD")
            private String regYmd;

            @JsonProperty("MDFCN_YMD")
            private String mdfcnYmd;
        }
    }
}
