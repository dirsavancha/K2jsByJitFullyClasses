package com.k2js.usecase.teastall;

public class TeaStall {
	public static void orderTea(String teaType) {
		Tea tea = null;
		
		if(teaType.equalsIgnoreCase("Gingertea")) {
			 tea =  new GingerTea(teaType);
			 tea.teaPrice();
			 
		}else if(teaType.equalsIgnoreCase("leamontea")){
			tea =  new LeamonTea("leamontea");
			tea.teaPrice();
		}else
		{
			System.out.println(" Sorry "+teaType+" not available");
		}
	} 

}
