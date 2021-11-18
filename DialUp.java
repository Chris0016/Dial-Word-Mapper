import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;

public class DialUp{
	private HashMap <Integer, HashSet<String>> map ;


	public DialUp(){
		map = new HashMap<Integer, HashSet<String>>();
	}

	public void insertWord(Word word){
		HashSet<String> holder = map.get(word.getKey());
		if ( holder != null)
			holder.add(word.getWord());
		else {

			holder = new HashSet<String>();
			holder.add(word.getWord());
			map.put(word.getKey(), holder);
		}
	}


	public void insertWords(Word[] wordList){
		int len = wordList.length;

		for (int i = 0; i < len; i++ ){
			insertWord(wordList[i]);
		}
	}

	public void insertStrings(String[] stringList){
		int len = stringList.length;

		for (int i = 0; i < len; i++ ){
			insertWord(new Word(stringList[i]));
		}
	}

	public HashSet getHashSetByKey(int key){
		return map.get(key);
	}

	public void printHashSet(HashSet<String> in){
		for(String i : in)
			System.out.print(i + " ");
		System.out.println();
	}
}