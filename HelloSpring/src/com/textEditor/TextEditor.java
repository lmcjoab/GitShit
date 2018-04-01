package com.textEditor;

public class TextEditor
{
	public TextEditor()
	{
		super();
	}
	
	/*public TextEditor(SpellChecker spellChecker)
	{
		System.out.println("Inside the TextEditor constructor." );
		this.spellChecker = spellChecker;
	}*/
	

	private SpellChecker spellChecker;

	public SpellChecker getSpellChecker()
	{
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker)
	{
		this.spellChecker = spellChecker;
	}

	public void spellCheck()
	{
		spellChecker.checkSpelling();
	}
}
