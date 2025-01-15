package com.tap.classess;

import com.tap.interfacess.Trainer;

public class SQLTrainer implements Trainer {
	@Override
	public String giveTask() {
		return "Sql Trainer says practice complex queries";
	}
}
