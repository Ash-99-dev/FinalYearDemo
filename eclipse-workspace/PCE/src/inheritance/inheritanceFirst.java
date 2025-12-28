package inheritance;

class player{
	String name;
	int age;
	int bestScore;
	String country;
	String teamName;
	
	player(String name, int age, int bestScore,String country,String teamName){
		this.name = name;
		this.age = age;
		this.bestScore = bestScore;
		this.country = country;
		this.teamName = teamName;
	}
}

class football extends player{
	int goals;
	int assist;
	football(int goals, int assist,String name, int age, int bestScore,String country,String teamName){
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
class cricket extends player{
	int centuries;
	int halfCenturies;
	int average;
	int strickRate;
	cricket(int centuries, int halfCenturies, int average,int strickRate,String name, int age, int bestScore,String country,String teamName){
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
		new football(5,3,"Aman",30,9,"Canada","Lassi da sag").getDetils();
		
		cricket c = new cricket(10,6,7,99,"Aditya",40,50,"Bharat","Kaka Punjabi");
		c.getDetils();
	}

}
