class Word{
	private String word;
	private short key;
	private byte wSize;

	public Word(String word, short key){
		this.word = word;
		this.key = key;
		wSize = (byte)word.length();
	}

	public Word(String word){
		this.word = word;
		this.key = makeKey();
	}


	public void setKey(short key){
		this.key = key;
	}

	public void setWord(String word ){
		this.word = word;
	}


	public short makeKey(){
		String holder = "";

		for(int i = 0; i < wSize; i++){
			holder += getLetterHash(word.charAt(i));
		}

		return Byte.parseShort(holder);
	}



	private short getLetterHash(char curr){
		return ((curr - 64) / 3) + 1;
	}

}