package day4two;

public class Student implements Comparable<Student>{

	int rollNo;
	String name;
	int marks;
	public Student(int rollNo, String name, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		System.out.println("compareTo method");
		if(this.rollNo > o.rollNo)
			return -1;
		if(this.rollNo < o.rollNo)
			return 1;
		return 0;
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
}
