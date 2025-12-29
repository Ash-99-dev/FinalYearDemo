package inheritance;

class player1{
	String name;
	int age;
	int bestScore;
	String country;
	String teamName;
	
	player1(String name, int age, int bestScore,String country,String teamName){
		this.name = name;
		this.age = age;
		this.bestScore = bestScore;
		this.country = country;
		this.teamName = teamName;
	}
}

class football1 extends player1{
	int goals;
	int assist;
	football1(int goals, int assist,String name, int age, int bestScore,String country,String teamName){
		super(name, age, bestScore,country,teamName);
		this.goals = goals;
		this.assist = assist;
	}
	void getDetils() {
		System.out.println("Footballer Details are\n"
				+"Name : "+this.name+",\nAge : "+this.age+",\nBestScore Made : "+this.bestScore+",\nCountry : "+this.country+",\nTeam Name : "+this.teamName
				+",\nGoals : "+this.goals+",\nNumber of Assist : "+this.assist+"\n");
	}
	
}
class cricket1 extends player1{
	int centuries;
	int halfCenturies;
	int average;
	int strickRate;
	cricket1(int centuries, int halfCenturies, int average,int strickRate,String name, int age, int bestScore,String country,String teamName){
		super(name, age, bestScore,country,teamName);
		this.centuries = centuries;
		this.halfCenturies = halfCenturies;
		this.average = average;
		this.strickRate = strickRate;
	}
	void getDetils() {
		System.out.println("Cricketer Details are\n"
				+"Name : "+this.name+",\nAge : "+this.age+",\nBestScore Made : "+this.bestScore+",\nCountry : "+this.country+",\nTeam Name : "+this.teamName
				+",\ncenturies : "+this.centuries+",\nhalf-centuries : "+this.halfCenturies+",\nAverage : "+this.average+",\nstrick Rate : "+this.strickRate);
	}
	
}
public class inheritanceFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new football1(5,3,"Aman",30,9,"Canada","Lassi da sag").getDetils();
		
		cricket1 c = new cricket1(10,6,7,99,"Aditya",40,50,"Bharat","Kaka Punjabi");
		c.getDetils();
	}

}
