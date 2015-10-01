/**
 * 
 */
package com.dashboard;

/**
 * @author V776126
 *
 */
public class CheckStatusAction {
	
	public static String request;
	public static String message;
	public static String imageid;
	
	public String getRequest() {
		return request;
	}

	public void setRequest(String request) {
		this.request = request;
	}
	
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getImageid() {
		return imageid;
	}

	public void setImageid(String imageid) {
		this.imageid = imageid;
	}

	public String execute()
	{		
		setMessage("");
		if(this.request.isEmpty())
		{
			setMessage("The request id is empty");
			return "failure";
		}
		try{
			Integer.parseInt(this.request);
		}catch(NumberFormatException nfe)
		{
			setMessage("The request id is not a valid number");
			return "failure";
		}
		switch(Integer.parseInt(this.request)%7)
		{
		 case 1:
			 setImageid("The request is at the stage 1");
			 setMessage("<img alt=\"request is at stage \" src=\"images/stage1.jpg\" height=\"50%\" width=\"50%\">");
			 break;
		 case 2:
			 setImageid("The request is at the stage 2");
			 setMessage("<img alt=\"request is at stage \" src=\"images/stage2.jpg\" height=\"50%\" width=\"50%\">");
			 break;
		 case 3:
			 setImageid("The request is at the stage 3");
			 setMessage("<img alt=\"request is at stage \" src=\"images/stage3.jpg\" height=\"50%\" width=\"50%\">");
			 break;
		 case 4:
			 setImageid("The request is at the stage 4");
			 setMessage("<img alt=\"request is at stage \" src=\"images/stage4.jpg\" height=\"50%\" width=\"50%\">");
			 break;
		 case 5:
			 setImageid("The request is at the stage 5");
			 setMessage("<img alt=\"request is at stage \" src=\"images/stage5.jpg\" height=\"50%\" width=\"50%\">");
			 break;
		 case 6:
			 setImageid("The request is at the stage 6");
			 setMessage("<img alt=\"request is at stage \" src=\"images/stage6.jpg\" height=\"50%\" width=\"50%\">");
			 break;
		 case 0:
			 setImageid("The request is completed");
			 setMessage("<img alt=\"request is at stage \" src=\"images/stage7.jpg\" height=\"50%\" width=\"50%\">");
			 break;
		 default:
			 setImageid("The request is yet to start");
			 setMessage("<img alt=\"request is at stage \" src=\"images/stage0.jpg\" height=\"50%\" width=\"50%\">");
			 break;
		}
		return "success";
		
	}

}
