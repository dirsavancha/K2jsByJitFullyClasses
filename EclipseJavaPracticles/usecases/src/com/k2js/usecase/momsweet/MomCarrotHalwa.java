package com.k2js.usecase.momsweet;

abstract  class MomCarrotHalwa implements CarrotSweet{

	 public void step1_buyItems() {
		System.out.println("step1_mom brought 500 gms carrot,100 gms sugar,500ms milk");
	}

	public void step2_pealCarrot() {
		System.out.println("step2_mom cleaned carrot and peeled");
	}

	public void step3_gradeCarrpt() {

		System.out.println("step3_mom graded carrot");

	}
	 public void step4_switchOntheStove() {
		System.out.println("step4_mom Switched on the stove");
		
	}
	public void step5_boilMilk() {
		System.out.println("step5_mom boiled milk");
	}
	public void step6_momMakesSugarSyrup() {
		System.out.println("step6_ mom made sugar syrup");
		
	}
	
	public void step7_mixedGeadedCarrotinSugarSyrup() {
		System.out.println("Mom mixed graded carrot in sugar syrup");
	}
	public void step8_momTurnedOffStove() {
		System.out.println("step8_mom switchoff the stove");
	}
	abstract void specialStep_addGarnish(); 
		
	

}
