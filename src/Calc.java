//읽으려면 get 셋팅하려면 set
public class Calc {
	private Student[] array;

	public Calc(Student[] array) {
		this.array = array;
	}

	public void calc(int count) { // count만큼만 loop돌거라서 for문을 사용한다.
		for (int i = 0; i < count; i++) {
			Student student = this.array[i];
			int total = this.calcTotal(student.getKor(), student.getEng(), student.getMat(), student.getEdp());
			double avg = this.calcAvg(total, 4); // total보내고 4과목 보내고
			char grade = this.calcGrade(avg);
			student.setTot(total);
			student.setAvg(avg);
			student.setGrade(grade);
		}
	}

	private int calcTotal(int kor, int eng, int mat, int edp) {
		return kor + eng + mat + edp;
	}

	private double calcAvg(int total, int su) {
		return (double) total / su;
	}

	private char calcGrade(double avg) {
		return (avg <= 100 && avg <= 90) ? 'A' : (avg <= 80) ? 'B' : (avg <= 70) ? 'C' : (avg <= 60) ? 'D' : 'F'; // 삼항연산자
																													// 짱빠름.
	}
}
