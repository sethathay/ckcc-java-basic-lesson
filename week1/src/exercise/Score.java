package exercise;

public class Score {
	public static void main(String[] arguments){
		double javaProgramming = 65;
		double cProgramming = 80.5;
		double php = 90;
		double cSharp = 55.5;
		double html = 70;
		double totalScore = javaProgramming + cProgramming + php + cSharp + html;
		double averageScore = totalScore / 5;
		System.out.println(averageScore);
	}
}
