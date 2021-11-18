public class Word{
	private String word;
	private long key;
	private int wSize;

	public Word(String word, long key){
		this.word = word;
		this.key = key;
		wSize = word.length();
	}

	public Word(String word){
		this.word = word.toUpperCase();
		wSize = word.length();
		this.key = makeKey();

	}

	public void setKey(long key){
		this.key = key;
	
	}

	public void setWord(String word ){
		this.word = word.toUpperCase();
		wSize = word.length();
		this.key = makeKey();
	
	}

	public long getKey(){
		return this.key;
	
	}
	
	public String getWord(){
		return this.word;
	
	}

	public long makeKey(){
		String holder = "";

		for(int i = 0; i < wSize; i++){
			holder += getLetterHash(word.charAt(i));
			
		}


		return Long.parseLong(holder);
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
		
		if (holder < 0) //
			holder = 0;

		//System.out.println("Holder for : " + curr +" " + holder);
		else if (holder >= 23) // letter W or any letter after. 
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