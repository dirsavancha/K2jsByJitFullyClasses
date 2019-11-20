// Requirment:-Abhishek went to his girl house to ask her father about his marriage to her daughter, but her father told if your father amitab agree i will also accept,but amitab allows only arranged marriage.

package com.k2js.usecase.amitab;

abstract class Amitab{
	
	int height=7;
	
	
	void awards(){
		System.out.println("5 awards");
	}
	
	void hitMovie(){
		System.out.println("Don");
	}
	
	void tvAdd(){
		System.out.println("Sony - KBC");
	}
	
	void marriageOpinion(){
		System.out.println("Arranged Marriage");
	}
}

class Abhishek extends Amitab{
	
	int height = 6;
	
	void sportsTeam(){
		System.out.println("Pro Kabadi :- Jaipur pink panther");
	}
	@Override
	public void marriageOpinion(){
		super.marriageOpinion();
		System.out.println("Also ok for Love marriage");
	}
}

class HeroeinFather{
	
	public static void main(String...abc){
		
		// Introducing about abhishek to HeroeinFather
		Abhishek abhi=new Abhishek();
		System.out.println(abhi.height);
		
		abhi.sportsTeam();
		abhi.awards();
	
		
		System.out.println(((Amitab)abhi).height);  // to get amitab height
		
		Amitab ami=new Abhishek();    // Upcasting  child is pointing to parent we get parent fetures we wont get child fetures
		System.out.println(ami.height);
		ami.awards();
		ami.marriageOpinion();
		
		Abhishek abhi1=(Abhishek)ami;
		System.out.println(abhi1.height);
		abhi1.sportsTeam();
		
		
	}
}