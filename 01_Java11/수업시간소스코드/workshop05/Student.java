package workshop05;

public class Student {

	private String name;
	private int korean;
	private int english;
	private int math;
	private int science;
	
	public Student() {}

	public Student(String name, int korean, int english, int math, int science) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}
	// 은닉화
	public double getAvg() {
		int sum = korean+english+math+science;
		return sum/4.0;
	}
	
	public String getGrade() {
		String grade=null;
		double avg = this.getAvg(); // getAvg() 동일
		
		if(avg >= 90) {
			grade ="A 학점";
		}else if(avg >= 70) {
			grade ="B 학점";
		}else if(avg >= 50) {
			grade ="C 학점";
		}else if(avg >= 30) {
			grade ="D 학점";
		}else {
			grade ="F 학점";
		}
		
		return grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}
	
}























