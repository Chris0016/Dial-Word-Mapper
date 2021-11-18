/**
*@author Christopher Perez
*@version 1.0.0
*/

import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;

public class CustomMap{
	private HashMap <Long, HashSet<String>> map ;


	public CustomMap(){
		map = new HashMap<Long, HashSet<String>>();
	}

	public HashMap <Long, HashSet<String>> getMap(){
		return this.map;
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

	public HashSet getHashSetByKey(long key){
		return map.get(key);
	}

	
}