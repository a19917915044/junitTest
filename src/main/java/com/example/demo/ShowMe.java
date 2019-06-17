package com.example.demo;

public class ShowMe {

	private String hand;
	private String foot;
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
	@Override
	public String toString() {
		return "ShowMe [hand=" + hand + ", foot=" + foot + "]";
	}
	
	
}
