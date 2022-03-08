package com.javaex.day4;

public class TV {
	
	int channel;
	int volume;
	boolean power;
	
	private int getChannel() {
		return channel;
	}
	
	private int getVolume() {
		return volume;
	}
	
	private boolean isPower() {
		return power;
	}
	
	public TV(int channel, int volume, boolean power) {
		super();
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public void power(boolean on) {
//		if(true) 
//			power= true;
//		else
//			power = false;
		this.power = on;
	}
	
	public void channel(int channel) {
		if(channel >= 1 && channel <= 255)
			this.channel = channel;
	}
	
	public void channel(boolean up) {
		if(up)
			this.channel++;
		else
			this.channel--;
	}
	
	public void volume(int volume) {
		if(volume >= 1 && volume <= 100)
			this.volume = volume;
	}
	
	public void volume(boolean up) {
		if(up)
			this.volume++;
		else
			this.volume--;
	}
	
	public void status() {
		String power ="";
		if(this.isPower())
			power = "On";
		else
			power = "Off";
		
		System.out.println(channel+"\t"+volume+"\t"+power);
	}
}
