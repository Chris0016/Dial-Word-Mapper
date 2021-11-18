/**
*@author Christopher Perez
*@version 1.0.0
*/

public class Main{

	public static void main(String[] args){
		Runner run = new Runner(634, "SmallDictionary.txt") ;
	}



}
/*
Instead of having all the main methods in the Main class, it is much more convienent to
have a dedicated separate class. The reasons are because the main class method uses
a static method which means that global variables cannot be used in and consequently all of the
other functions that have to the the common variables. 

Thus for methods of readability the a separate runner class is created. 

*/