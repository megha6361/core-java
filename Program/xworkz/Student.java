class Student {
    String name;
    int age;
    String course;
    int rollNo;
    String grade;
	
	void setName(String name);
	{
		this.name = name;
	}
	void setAge(int age);
	void setCourse(String course);
	void setrollno(int rollno);
	void setGrade(String grade);
	
	void display()
	{
		System.out.println("Student:" + name + ", Age: " + age + ", Course: " + course + ", Roll No: " + rollNo + ", Grade: " + grade);
}

}