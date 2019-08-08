package com.codingdojo.zookeeper;

class Gorilla extends Mammal {
	public void throwSomething() {
		setEnergyLevel(getEnergyLevel() - 5);
		System.out.println("The Gorilla threw a plane!! Lost 5 energy");
	}
	public void eatBananas() {
		setEnergyLevel(getEnergyLevel() + 10);
		System.out.println("The Gorilla ate a Human to recover!! Gained 10 energy!!");
	}
	public void climb() {
		setEnergyLevel(getEnergyLevel() - 10);
		System.out.println("The Gorilla is climbing the building!!");
	}
}
