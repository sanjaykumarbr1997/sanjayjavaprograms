package inheritance.hierarchialinheritance;

public class HierarchialDemo {

	public static void main(String[] args) {
		
		Exam exam = new Exam();
		Science science = new Science();
		Math math = new Math();
		English english = new English();
		
		science.score();
		science.totalMarks();
		math.score();
		math.totalMarks();
		english.score();
		exam.totalMarks();

	}

}
