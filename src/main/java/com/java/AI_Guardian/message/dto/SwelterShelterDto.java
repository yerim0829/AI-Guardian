package com.java.AI_Guardian.message.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

public class SwelterShelterDto {

    @Getter
    @Builder
    @AllArgsConstructor
    @RequiredArgsConstructor
    @ToString
    public static class Request {
        private int numOfRows;
        private int pageNo;
        //        private String resultType;
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
            @JsonProperty("DTL_ADRES")
            private String dtlAdres;

            @JsonProperty("XCORD")
            private String xcord;

            @JsonProperty("LO")
            private Double lo;

            @JsonProperty("CHCK_MATTER_WKEND_HDAY_OPN_AT")
            private String chckMatterWkendHdayOpnAt;

            @JsonProperty("WKEND_HDAY_OPER_BEGIN_TIME")
            private String wkendHdayOperBeginTime;

            @JsonProperty("MODF_TIME")
            private String modfTime;

            @JsonProperty("ARCD")
            private String arcd;

            @JsonProperty("WKDAY_OPER_BEGIN_TIME")
            private String wkdayOperBeginTime;

            @JsonProperty("YEAR")
            private String year;

            @JsonProperty("USE_PSBL_NMPR")
            private int usePsblNmpr;

            @JsonProperty("CHCK_MATTER_NIGHT_OPN_AT")
            private String chckMatterNightOpnAt;

            @JsonProperty("RSTR_NM")
            private String rstrNm;

            @JsonProperty("WKEND_HDAY_OPER_END_TIME")
            private String wkendHdayOperEndTime;

            @JsonProperty("CHCK_MATTER_STAYNG_PSBL_AT")
            private String chckMatterStayngPsblAt;

            @JsonProperty("MNGDPT_CD")
            private String mngdptCd;

            @JsonProperty("COLR_HOLD_ARCNDTN")
            private int colrHoldArcndtn;

            @JsonProperty("RN_DTL_ADRES")
            private String rnDtlAdres;

            @JsonProperty("INPT_TIME")
            private String inptTime;

            @JsonProperty("DTL_POSITION")
            private String dtlPosition;

            @JsonProperty("WKDAY_OPER_END_TIME")
            private String wkdayOperEndTime;

            @JsonProperty("FCLTY_SCLAS")
            private String fcltySclas;

            @JsonProperty("COLR_HOLD_ELEFN")
            private int colrHoldElefn;

            @JsonProperty("AR")
            private int ar;

            @JsonProperty("YCORD")
            private String ycord;

            @JsonProperty("LA")
            private Double la;

            @JsonProperty("RSTR_FCLTY_NO")
            private int rstrFcltyNo;

            @JsonProperty("RM")
            private String rm;

            @JsonProperty("FCLTY_TY")
            private String fcltyTy;
        }
    }
}
