package com.tap.classess;

import com.tap.interfacess.Trainer;

public class JavaTrainer implements Trainer {
	@Override
	public String giveTask() {
		return "Java Trainer says practice coding";
	}
}
