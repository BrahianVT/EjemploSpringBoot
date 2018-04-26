package com.example.spring;

public class TextEditor {

	private SpellChecker spellChecker;

	 // a setter method to inject the dependency.
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	// a getter method to return spellChecker
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	
	public void spellCkeck(){
		spellChecker.checkSpelling();
	}
	
	
}
