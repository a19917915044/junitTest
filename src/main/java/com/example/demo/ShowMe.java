package com.example.demo;

import org.springframework.context.annotation.PropertySource;

@PropertySource("Tommy")
public class ShowMe {

	private String hand;
	private String foot;
	private String hello;
	
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
