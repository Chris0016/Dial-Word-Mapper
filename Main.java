public class Main{


	public static void main(String[] args){
		Word myWord = new Word("JKL");
		String[] strings = {"JKL", "LKJ", "KJL", "LJK", "KLJ"};
		String[] strings2 = {"ABC", "CBA", "BAC", "CAB", "ACB", "AAA"};
		String[] strings3 = {"AB", "CA", "BAC", "CAB", "CB", "AAA"};

		DialUp dialUp = new DialUp();

		dialUp.insertStrings(strings);
		dialUp.printHashSet(dialUp.getHashSetByKey(555));


		dialUp.insertStrings(strings2);
		dialUp.printHashSet(dialUp.getHashSetByKey(222));

		dialUp.insertStrings(strings3);
		dialUp.printHashSet(dialUp.getHashSetByKey(22));

	}
}