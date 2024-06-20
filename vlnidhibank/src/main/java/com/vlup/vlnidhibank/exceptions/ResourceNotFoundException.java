package com.vlup.vlnidhibank.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	
	 String resourceName;
	 String fieldName;
	 Integer Id;
	public ResourceNotFoundException(String resourceName, String fieldName, Integer id) {
		super(String.format("%s not found with %s : %s",resourceName,fieldName,id));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.Id = id;
	}
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public ResourceNotFoundException() {
		super();
	}
	 
	 
	 
	 
}
