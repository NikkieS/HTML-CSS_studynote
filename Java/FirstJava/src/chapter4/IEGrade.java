package chapter4;

public class IEGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 81;
		
		String grade = ""; // A+, A, A-, B+ ...
		
		// 100~98: A+, 97~94: A, 93~90: A-
		if(score >= 90) {
			grade = "A";
			
			if(score >= 98) {
				grade = grade + "+";
			}
			else if(score < 94) {
				grade = grade + "-";
			}
		}
		// 89~88: B+, 87~84: B, 83~80: B-
		else if(score >= 80) {
			grade = "B";
			
			if(score >= 88) {
				grade = grade + "+";
			}
			else if(score < 84) {
				grade = grade + "-";
			}
		}
		// 79~78: C+, 77~74: C, 73~70: C-
		else {
			grade = "C";
			
			if(score >= 78) {
				grade = grade + "+";
			}
			else if(score < 74) {
				grade = grade + "-";
			}
		}
		System.out.println(grade);
		

	}

}
