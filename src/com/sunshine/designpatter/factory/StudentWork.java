package com.sunshine.designpatter.factory;

public class StudentWork implements Work {

	@Override
	public void doWork() {
		System.out.println("学生*作业!");
	}

}
