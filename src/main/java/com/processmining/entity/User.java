package com.processmining.entity;

import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


public class User {
    private Integer id;

    private String email;

    private String password;

    private Boolean banned;

    private Boolean activated;

    private Integer type;

    private String nickname;

    @Transient
    private String checkcode;
    
    public User(){
    	
    }
    
    public User(String email,String password,String nickname){
    	this.email = email;
    	this.password = password;
    	this.nickname = nickname;
    }
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Boolean getBanned() {
        return banned;
    }

    public void setBanned(Boolean banned) {
        this.banned = banned;
    }

    public Boolean getActivated() {
        return activated;
    }

    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

	public String getCheckcode() {
		return checkcode;
	}

	public void setCheckcode(String checkcode) {
		this.checkcode = checkcode;
	}
    
    
    
}