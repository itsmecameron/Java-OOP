package com.codingdojo.zookeeper;

public class Mammal {
	private int energyLevel = 100;
	private void displayEnergy() {
		System.out.println("Animals energy level: " + getEnergyLevel());
	}
	public int getEnergyLevel() {
		return energyLevel;
	}
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
}
