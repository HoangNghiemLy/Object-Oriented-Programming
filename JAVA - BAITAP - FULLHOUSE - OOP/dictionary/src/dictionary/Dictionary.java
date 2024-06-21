package dictionary;

import java.util.ArrayList;

public class Dictionary {
	private ArrayList<Word> wordList;
	public Dictionary() {
		this.wordList = new ArrayList<Word>();
	}
	public ArrayList<Word> getWordList() {
		return wordList;
	}
	public void setWordList(ArrayList<Word> wordList) {
		this.wordList = wordList;
	}
	public void addWord(String english, String mean) {
		for(Word w: this.wordList) {
			if(w.getEnglish().equals(english)) {
				System.out.println("\nAdd new word Failed\n");
				return;
			}
		}
		this.wordList.add(new Word(english, mean));
		System.out.println("\nAdd new word Success\n");
	}
	
	public void updateWord(String english, String mean) {
		for(Word w: this.wordList) {
			if(w.getEnglish().equals(english)) {
				w.setMean(mean);
				System.out.println("\nUpdate word Success\n");
				return;
			}
		}
		System.out.println("\nUpdate word Failed\n");
	}
	public void deleteWord(String english) {
		for(Word w: this.wordList) {
			if(w.getEnglish().equals(english)) {
				this.wordList.remove(w);
				System.out.println("\nDelete word Success\n");
				return;
			}
		}
		System.out.println("\nDelete word Failed\n");
	}
	public String searchWord(String english) {
		for(Word w: this.wordList) {
			if(w.getEnglish().equals(english)) {
				return w.getMean();
			}
		}
		return null;
	}
	public void showAll() {
		for(Word w: this.wordList) {
				System.out.println(w);
		}
	}
}
