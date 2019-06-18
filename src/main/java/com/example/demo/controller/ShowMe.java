package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnResource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "showme")
@PropertySource(value = { "classpath:application-location.properties",
		"file:C:\\tools\\data.properties" }, ignoreResourceNotFound = true)
public class ShowMe {

	@Value("${location.ShowMe.hello:${ShowMe.hello:defaultHand}}")
	private String hand;
	@Value("${location.ShowMe.foot:${ShowMe.foot:defaultFoot}}")
	private String foot;
	@Value("${location.ShowMe.hello:${ShowMe.hello:defaultHello}}")
	private String hello;

	@Value("${remote.driverClassName:${spring.datasource.druid.driverClassName}}")
	private String driverClassName;
	@Value("${remote.url:${spring.datasource.druid.url}}")
	private String url;
	@Value("${remote.username:${spring.datasource.druid.username}}")
	private String username;
	@Value("${remote.password:${spring.datasource.druid.password}}")
	private String password;
	@Value("onlyyou")
	private String only;

	public String getOnly() {
		return only;
	}

	public void setOnly(String only) {
		this.only = only;
	}

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getHand() {
		return hand;
	}

	public void setHand(String hand) {
		this.hand = hand;
	}

	public String getFoot() {
		return foot;
	}

	public void setFoot(String foot) {
		this.foot = foot;
	}

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}

	@Override
	public String toString() {
		return "ShowMe [hand=" + hand + ", foot=" + foot + "]";
	}

}
