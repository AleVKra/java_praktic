/*
 * Copyright (c) 2022 Tander, All Rights Reserved.
 */

package src.main.java.org.java.course.lection_1.lesson2.lectino2;

/**
 * Класс Dock
 */
public class Dock implements SuperFlyable, Swimable {

	@Override
	public void fly() {
		System.out.println("Утка летит");
	}

	@Override
	public void swim() {

	}

	@Override
	public void sooperDupaFly() {

	}
}