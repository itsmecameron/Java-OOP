package com.codingdojo.objectmaster;

public class HumanTest{

	public static void main(String[] args) {
		Human Jack = new Human();
		Human Maiya = new Human();
		
		Jack.attack(Maiya);
		Maiya.attack(Jack);
	}	
}
