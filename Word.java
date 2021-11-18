public class Word{
	private String word;
	private int key;
	private byte wSize;

	public Word(String word, int key){
		this.word = word.toUpperCase();
		this.key = key;
		wSize = (byte)word.length();
	}

	public Word(String word){
		this.word = word.toUpperCase();
		wSize = (byte)word.length();
		this.key = makeKey();
		
		
	}


	public void setKey(int key){
		this.key = key;
	}

	public void setWord(String word ){
		this.word = word;
		wSize = (byte)word.length();
		this.key = makeKey();
	}

	public int getKey(){
		return this.key;
	}
	public String getWord(){
		return this.word;
	}

	public int makeKey(){
		String holder = "";

		for(byte i = 0; i < wSize; i++){
			holder += getLetterHash(word.charAt(i));
			
		}

		return Integer.parseInt(holder);
	}


	/*
		The dial standard is a bit tricky since first, the lettwers start from the number 2. 
		Second and most importantly, the letters aren't event distributed in a pattern that can be put into a simple equation. 
		For instance PQRS belong to 7 while TUV belong to 8 and WXYZ belong to 9. 

		To accomodate, the simplest option and most efficient was to make a series of if statements to filter the input. 

		The test can be found in testOut.txt
	*/
	private int getLetterHash(char curr){
		int holder =  (curr - 64);

		if (holder >= 23) // letter W or any letter after. 
			holder = 9;
		else if (holder >= 20) //letter T or any letter after. 
			holder = 8;
		else if (holder >= 16) //letter P or any letter after.
			holder = 7;
		else 
			holder = (int)Math.ceil( (holder/3d) + 1);
		
		return holder;

	}

}