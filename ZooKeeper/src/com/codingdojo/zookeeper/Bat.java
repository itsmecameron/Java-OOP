package com.codingdojo.zookeeper;

class Bat extends Mammal{
	public void fly() {
		setBatEnergyLevel(getBatEnergyLevel() - 50);
		System.out.println("Wooshh Wooshh!! Lost 50 energy");
	}
	public void eatHuman() {
		setBatEnergyLevel(getBatEnergyLevel() + 25);
		System.out.println("Krunch Krunch!! Gained 25 energy!!");
	}
	public void attackTown() {
		setBatEnergyLevel(getBatEnergyLevel() - 100);
		System.out.println("BA-BOOM!! LOST 100 ENERGY");
	}
}
