package com.k2js.usecase.teastall;

public class GingerTea extends Tea {

	public GingerTea(String teaType) {
		super(teaType);
	}

	@Override
	public void teaPrice() {
		System.out.println("GingerTea Price: Rs50");
	}

}
