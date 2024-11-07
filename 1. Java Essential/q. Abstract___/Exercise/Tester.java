class Tester{
	public static void main(String[] args) { 
                GraduateStudent stud1 = new GraduateStudent("Ajay");
                stud1.setTestScore(0, 70);
                stud1.setTestScore(1, 79);
                stud1.setTestScore(2, 71);
                stud1.setTestScore(3, 55);
                stud1.generateResult();

                UndergraduateStudent stud2 = new UndergraduateStudent("Mehul");
                stud2.setTestScore(0, 70);
                stud2.setTestScore(1, 69);
                stud2.setTestScore(2, 71);
                stud2.setTestScore(3, 55);
                stud2.generateResult();
	}
}