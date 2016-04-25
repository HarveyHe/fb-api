package com.harvey.fb.api.common.entity;


public class MessageEntity {

	private Boolean error;
	private String message;
	private Object result; 
	
	
	public MessageEntity() {
		super();
	}
	public MessageEntity(Boolean error, String message, Object result) {
		super();
		this.error = error;
		this.message = message;
		this.result = result;
	}
	public Boolean getError() {
		return error;
	}
	public MessageEntity setError(Boolean error) {
		this.error = error;
		return this;
	}
	public String getMessage() {
		return message;
	}
	public MessageEntity setMessage(String message) {
		this.message = message;
		return this;
		
	}
	public Object getResult() {
		return result;
	}
	public MessageEntity setResult(Object result) {
		this.result = result;
		return this;
	}
	
	public static MessageEntity getReturn(Boolean error,String message,Object obj) {
		MessageEntity result = new MessageEntity();
		result.setError(error);
		result.setMessage(message);
		result.setResult(obj);
		return result;
	} 
	public MessageEntity setReturn(Boolean error,String message,Object result){
		this.result=result;
		this.error=error;
		this.message=message;
		return this;
	}
}

