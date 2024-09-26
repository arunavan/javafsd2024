package com.var.javaconfig.components;

import org.springframework.stereotype.Component;

@Component
public class Bill {
	
	private Integer id;
	private String type;
	
	public Bill(){
		
	}
    
	public Bill(Integer id, String type) {
		super();
		this.id = id;
		this.type = type;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Bill [id=" + id + ", type=" + type + "]";
	}
	
	

}
