package test;

public class Test1 {

	public static void main(String[] args) {
	
		String name = "김태희";
		int score = 75; 
		char grade = ' ';
		String branch_name = "BrahcnX";
		
		if ((score>=90)&&(score<=100)) {
			grade = 'A';
		}
		else if((score>=80)&&(score<90)) {
			grade = 'B';
		}
		else if((score>=70)&&(score<80)) {
			grade = 'C';
		}
		else if((score>=60)&&(score<70)) {
			grade = 'D';
		}
		else if((score>0)&&(score<60)) {
			grade = 'F';
		}
		else { 
			System.out.println("잘못된 점수입니다.");
		}
		
		System.out.println("점수 : "+score+"\t학점 : "+grade );
		System.out.println("branch명 : " + branch_name);
	}
}