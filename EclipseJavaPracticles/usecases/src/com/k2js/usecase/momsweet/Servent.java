package com.k2js.usecase.momsweet;

public class Servent {

	public static void serventCarrotSweet(CarrotSweet cs) {

		if (cs instanceof MomCarrotHalwa) {
			((MomCarrotHalwa) cs).specialStep_addGarnish();
		}
		cs.step1_buyItems();
		cs.step2_pealCarrot();
		cs.step3_gradeCarrpt();
		cs.step4_switchOntheStove();
		cs.step5_boilMilk();
		cs.step6_momMakesSugarSyrup();
		cs.step7_mixedGeadedCarrotinSugarSyrup();
		cs.step8_momTurnedOffStove();

	}

}
