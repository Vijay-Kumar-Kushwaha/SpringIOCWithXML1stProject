package com.tap.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tap.classess.JavaTrainer;
import com.tap.classess.SQLTrainer;
import com.tap.classess.WebTrainer;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("beans.xml");
		JavaTrainer jt = (JavaTrainer)cpx.getBean("javaT");
		SQLTrainer st = (SQLTrainer)cpx.getBean("sqlT");
		WebTrainer wt = (WebTrainer)cpx.getBean("webT");
	
		System.out.println(jt.giveTask());
		System.out.println(st.giveTask());
		System.out.println(wt.giveTask());
	}
}





//JavaTrainer jt = new JavaTrainer();
//SQLTrainer st = new SQLTrainer();
//WebTrainer wt = new WebTrainer();
//
//System.out.println(jt.giveTask());
//System.out.println(st.giveTask());
//System.out.println(wt.giveTask());