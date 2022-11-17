package com.angular.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Questionnaire {
	
	@Id
	@Column
	private long id;
	
	@Column
	private String title;
	
	@Column
	private String des;
	
	public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
    
    public void setTitle(String title) {
    	this.title = title;
    }
    
    public String getTitle() {
    	return title;
    }
    
    public void setDescription(String des) {
    	this.des = des;
    }
    
    public String getDescription() {
    	return des;
    }
}
