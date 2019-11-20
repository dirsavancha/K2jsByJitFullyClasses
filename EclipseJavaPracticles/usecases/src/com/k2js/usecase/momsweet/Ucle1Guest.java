package com.k2js.usecase.momsweet;

public class Ucle1Guest {
	public static void main(String[] args) {

		/*
		 * SonCarrotSweet scs = new SonCarrotSweet(); scs.step1_buyItems();
		 * scs.step2_pealCarrot(); scs.step3_gradeCarrpt();
		 * scs.step4_switchOntheStove(); scs.step5_boilMilk();
		 * scs.step6_momMakesSugarSyrup(); scs.step7_mixedGeadedCarrotinSugarSyrup();
		 * scs.step8_momTurnedOffStove(); scs.step9_addedCashew();
		 * scs.specialStep_addGarnish();
		 */

		// bring moms sweet // If we upcast only parent parent class methods will get

		MomCarrotHalwa mch = new SonCarrotSweet() {
			@Override
			void specialStep_addGarnish() {
				System.out.println("Uncle garnished");
			}
		};
		mch.step1_buyItems();
		mch.step2_pealCarrot();
		mch.step3_gradeCarrpt();
		mch.step4_switchOntheStove();
		mch.step5_boilMilk();
		mch.step6_momMakesSugarSyrup();
		mch.step7_mixedGeadedCarrotinSugarSyrup();
		mch.step8_momTurnedOffStove(); // mch.step7_addedCashew();
		mch.specialStep_addGarnish();
		

	}

}
