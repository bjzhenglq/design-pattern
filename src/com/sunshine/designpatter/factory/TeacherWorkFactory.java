package com.sunshine.designpatter.factory;

public class TeacherWorkFactory implements IWorkFactory {

	@Override
	public Work getWork() {
		// TODO Auto-generated method stub
		return new TeacherWork();
	}

}
