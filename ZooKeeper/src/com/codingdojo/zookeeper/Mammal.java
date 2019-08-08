package com.codingdojo.zookeeper;

public class Mammal {
	private int energyLevel = 100;
	private int batEnergyLevel = 300;
//	gorilla energy
	void displayEnergy() {
		System.out.println("Animals energy level: " + getEnergyLevel());
	}
	public int getEnergyLevel() {
		return energyLevel;
	}
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
//	bat energy
	public int getBatEnergyLevel() {
		return batEnergyLevel;
	}
	public void setBatEnergyLevel(int batEnergyLevel) {
		this.batEnergyLevel = batEnergyLevel;
	}
}
