package java8;

public class java8 {
	
	
	
	String PopulateReleaseIntrestRequest(String transactionType){
		String Code="";
		
		switch (transactionType) {
		  case "Rmt":
		    Code="ReleaseRequestType";
		    break;
		  case "Rls":
		    Code="PaperTitle";
		    break;
		  case "Pmt":
		    Code="Confirm Address";
		    break;
		  default:
			Code=  "";
			
			
		
	}
		return Code;

	}
}
