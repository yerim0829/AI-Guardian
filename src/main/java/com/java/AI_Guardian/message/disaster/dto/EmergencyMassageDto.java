package com.java.AI_Guardian.message.disaster.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

public class EmergencyMassageDto {


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

    @ToString
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
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
            @JsonProperty("REG_DT")
            private String regDt;

            @JsonProperty("ALRM_YN")
            private String alrmYn;

            @JsonProperty("IPHONE_TRSM_YN")
            private String iphoneTrsmYn;

            @JsonProperty("EXPSR_YN")
            private String expsrYn;

            @JsonProperty("EMRG_MSTN_LTR_EXGENC_STEP")
            private String emrgMstnLtrExgencStep;

            @JsonProperty("TRSN_PLTF_ID")
            private String trsnPltfId;

            @JsonProperty("MSTN_BRNE_CN")
            private String mstnBrneCn;

            @JsonProperty("MSTN_BRNE_NO")
            private String mstnBrneNo;

            @JsonProperty("TRSN_PLTF_UNQ_IDNTF_VL")
            private String trsnPltfUnqIdntfVl;

            @JsonProperty("ADRID_TRSM_YN")
            private String adridTrsmYn;

            @JsonProperty("RCLY_VER_ADRID_TRSM_YN")
            private String rclyVerAdridTrsmYn;

            @JsonProperty("RCLY_VER_IPHONE_TRSM_YN")
            private String rclyVerIphoneTrsmYn;

            @JsonProperty("MSTN_ID")
            private String mstnId;
        }

    }
}
