package practice;

public class Student_Management {

	static class Student{
		private int id;
		private String name;
		private int marks;
		
		public Student(int id, String name, int marks){
			
			this.id=id;
			this.name=name;
			this.marks=marks;
			
		}
		public String calculateGrade() {
			
			if(marks>=75) {
				return "A";
			}else if(marks<50) {
				return "C";
			}else {
				return "B";
			}
		}
		public int getMarks() {
			return marks;
		}
		public String getName() {
			return name;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(12, "Ajjuthomas", 55);
		System.out.println(s1.calculateGrade());
	}

}
