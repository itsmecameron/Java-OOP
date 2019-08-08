package com.codingdojo.objectmaster;

public class HumanTest{

	public static void main(String[] args) {
		Human Jack = new Human();
		Human Maiya = new Human();
		
		Jack.attack(Maiya);
		Maiya.attack(Jack);
		
		Wizard Justin = new Wizard();
		Ninja Mary = new Ninja();
		Samurai Howard = new Samurai();
		Samurai Devon = new Samurai();
		
		Justin.fireball(Mary);
		Justin.heal(Jack);
		Mary.steal(Justin);
		Mary.runAway();
		Howard.deathBlow(Jack);
		Howard.meditate();
		Howard.howMany();
	}	
}
