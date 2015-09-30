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
		CheckStatusAction.message = message;
	}

	public String execute()
	{
		if(Integer.parseInt(this.request)%10 >= 5 )
		{
			this.setMessage(" The value "+Integer.parseInt(this.request)+" is greater than 5");
			return "success";	
		}
		this.setMessage(" The value "+Integer.parseInt(this.request)+" is lesser than 5");
		return "failure";
		
	}

}
