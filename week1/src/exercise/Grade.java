package exercise;

public class Grade {
	
	public static String classifyGrade(double averageScore) {
		String grade;
		if(averageScore >= 90) {
			grade = "A";
		} else if(averageScore >= 80) {
			grade = "B";
		} else if(averageScore >= 70) {
			grade = "C";
		} else if(averageScore >= 60) {
			grade = "D";
		} else if(averageScore >= 50) {
			grade = "E";
		} else {
			grade = "F";
		}
		return grade;
	}

	public static void main(String[] arguments){
		double javaProgramming = 65;
		double cProgramming = 80.5;
		double php = 90;
		double cSharp = 55.5;
		double html = 70;
		double totalScore = javaProgramming + cProgramming + php + cSharp + html;
		double averageScore = totalScore / 5;
		System.out.println("Average Score: " + averageScore);
		System.out.println("You got: " + classifyGrade(averageScore) + " Grade");
	}
	
}
