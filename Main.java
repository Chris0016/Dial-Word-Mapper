public class Main{


	public static void main(String[] args){
		Word myWord = new Word("JKL");

		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int size = alphabet.length();

		for(int i = 0; i < size; i++){
			myWord.setWord(Character.toString(alphabet.charAt(i)));
			System.out.println("Key for " +  myWord.getWord() + ": " + myWord.getKey());	
		}
		

	}
}