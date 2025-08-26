package com.example.moodanalyzer;

public class MoodAnalyzer {
	
	public class MoodAnalyser {

	    public String analyseMood(String message) throws MoodAnalysisException {
	        if (message == null)
	            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NULL, "Mood is NULL");
	        if (message.isEmpty())
	            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.EMPTY, "Mood is EMPTY");

	        return message.contains("Sad") ? "SAD" : "HAPPY";
	    }
	}

}
