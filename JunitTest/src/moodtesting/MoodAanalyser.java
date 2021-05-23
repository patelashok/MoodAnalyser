package moodtesting;

public class MoodAanalyser {
	public String moodcheck(String mood){
		
		if(mood.contains(("sad"))) {
			return "sad";
		}else {
			return "happy";
		}
		
	}
}
