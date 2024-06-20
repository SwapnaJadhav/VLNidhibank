package com.vlup.vlnidhibank.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdvisorDTO {

	        private Integer advisorCode;
	        //private LocalDateTime advisorJdate;
	        private String code;
	        private String advisorFirstName;
	        private String advisorLastName;
	        private String branchName;
	        private String introducerCode;
	        private String introducerName;
	        private String photoUrl; //field for photo URL
	        private String signatureUrl; //field for signature URL
	        // private IntroducerPosition introducerPosition;

	        // public enum IntroducerPosition {
	        //     ADVISOR, SALES_OFFICER, DEVELOPMENT_OFFICER, SR_DEVELOPMENT_OFFICER, BSM, ASM, RSM, STATE_HEAD, ZONAL_HEAD, DIRECTOR_SALES
	        // }

	        public Integer getAdvisorCode() {
	            return advisorCode;
	        }

	        public void setAdvisorCode(Integer advisorCode) {
	            this.advisorCode = advisorCode;
	        }


	        public String getCode() {
	            return code;
	        }

	        public void setCode(String code) {
	            this.code = code;
	        }

	        public String getAdvisorFirstName() {
	            return advisorFirstName;
	        }

	        public void setAdvisorFirstName(String advisorFirstName) {
	            this.advisorFirstName = advisorFirstName;
	        }

	        public String getAdvisorLastName() {
	            return advisorLastName;
	        }

	        public void setAdvisorLastName(String advisorLastName) {
	            this.advisorLastName = advisorLastName;
	        }

	        public String getBranchName() {
	            return branchName;
	        }

	        public void setBranchName(String branchName) {
	            this.branchName = branchName;
	        }

	        public String getIntroducerCode() {
	            return introducerCode;
	        }

	        public void setIntroducerCode(String introducerCode) {
	            this.introducerCode = introducerCode;
	        }

	        public String getIntroducerName() {
	            return introducerName;
	        }

	        public void setIntroducerName(String introducerName) {
	            this.introducerName = introducerName;
	        }

	        // public IntroducerPosition getIntroducerPosition() {
	        //     return introducerPosition;
	        // }

	        // public void setIntroducerPosition(IntroducerPosition introducerPosition) {
	        //     this.introducerPosition = introducerPosition;
	        // }
	        
	        public AdvisorDTO(Integer advisorCode, String code, String advisorFirstName, 
                    String advisorLastName, String branchName, String introducerCode, String introducerName) {
      this.advisorCode = advisorCode;
      
      this.code = code;
      this.advisorFirstName = advisorFirstName;
      this.advisorLastName = advisorLastName;
      this.branchName = branchName;
      this.introducerCode = introducerCode;
      this.introducerName = introducerName;
      // this.introducerPosition = introducerPosition;
  }

			public AdvisorDTO() {
				super();
			}

}


		

