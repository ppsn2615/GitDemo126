package test;

public class Test1 {

	public static void main(String[] args) {
	
		String name = "김태희";
		int score = 75; 
		char grade = ' ';
		
		if ((score>=90)&&(score<=100)) {
			grade = 'A';
			System.out.println("점수 : "+score+"\t학점 : "+grade );
		}
		else if((score>=80)&&(score<90)) {
			grade = 'B';
			System.out.println("점수 : "+score+"\t학점 : "+grade );
		}
		else if((score>=70)&&(score<80)) {
			grade = 'C';
			System.out.println("점수 : "+score+"\t학점 : "+grade );
		}
		else if((score>=60)&&(score<70)) {
			grade = 'D';
			System.out.println("점수 : "+score+"\t학점 : "+grade );
		}
		else if((score>0)&&(score<60)) {
			grade = 'F';
			System.out.println("점수 : "+score+"\t학점 : "+grade );
		}
		else {
			System.out.println("잘못된 점수입니다.");
		}
		
	}
}