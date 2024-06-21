package dictionary;

public class Word {

	private String english;
	private String mean;
	public Word() {
		
	}
	public Word(String english, String mean) {
		this.english = english;
		this.mean = mean;
	}
	public String getEnglish() {
		return english;
	}
	public void setEnglish(String english) {
		this.english = english;
	}
	public String getMean() {
		return mean;
	}
	public void setMean(String mean) {
		this.mean = mean;
	}
	@Override
	public String toString() {
		return String.format("Word [English=%s, mean=%s]\n",this.english,this.mean);
	}
	
}
