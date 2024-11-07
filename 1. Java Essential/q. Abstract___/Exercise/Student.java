abstract class Student{
	private String name;
	// private int[] test;
	private String result;
	private int[] test = new int[4];

    public Student(String name) {
        this.name = name;
    }

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int[] getTest() {
		return test;
	}

	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}

	public void setTestScore(int testNumber, int testScore) {
		this.test[testNumber] = testScore;
    }

    public abstract void generateResult();
	
}