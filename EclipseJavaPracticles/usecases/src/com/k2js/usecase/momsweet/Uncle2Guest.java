package com.k2js.usecase.momsweet;

public class Uncle2Guest {
	

	public static void main(String[] args) {
		CarrotSweet cs = new Aunt2CarrotSweet();
		cs.step1_buyItems();
		cs.step2_pealCarrot();
		cs.step3_gradeCarrpt();
		cs.step4_switchOntheStove();
		cs.step5_boilMilk();
		cs.step6_momMakesSugarSyrup();
		cs.step7_mixedGeadedCarrotinSugarSyrup();
		cs.step8_momTurnedOffStove();
		
		System.out.println("===============================");
		
		MomCarrotHalwa mcs=new MomCarrotHalwa() {
			
			@Override
			void specialStep_addGarnish() {
				System.out.println("Added garnish");
			}
		};
		mcs.step1_buyItems();
		mcs.step2_pealCarrot();
		mcs.step3_gradeCarrpt();
		mcs.step4_switchOntheStove();
		mcs.step5_boilMilk();
		mcs.step6_momMakesSugarSyrup();
		mcs.step7_mixedGeadedCarrotinSugarSyrup();
		mcs.step8_momTurnedOffStove();
		mcs.specialStep_addGarnish();
		System.out.println("=============================");
		Servent.serventCarrotSweet(mcs);
		System.out.println("=============================");
		Servent.serventCarrotSweet(cs);
		
	}

}
