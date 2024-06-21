package application_version_2;


public class Student {
	
	private int id;
	private String name;
	private double avg;
	
	public Student(int id, String name, double avg) {
		this.id = id;
		this.name = name;
		this.avg = avg;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAvg() {
		return this.avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "Student [id=" + this.id + ", name=" + this.name + ", avg=" + this.avg + "]";
	}

	public String writeToFile() {
		return this.id + ", " + this.name + ", " + this.avg;
	}
	
}
