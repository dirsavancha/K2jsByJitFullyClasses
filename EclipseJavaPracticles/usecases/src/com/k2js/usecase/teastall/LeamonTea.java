package com.k2js.usecase.teastall;

public class LeamonTea extends Tea {

	public LeamonTea(String teaType) {
		super(teaType);
	}

	@Override
	public void teaPrice() {
		System.out.println("Leamon TeaPrice: 40/-");
	}

}
