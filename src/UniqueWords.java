
/* Project:  Lab2
* Class: UniqueWords.java 
* Author:   Tyler Logan
* Date: 02/17/2022 
* This program prints the count of words in arraylist without them repeating
*/
import java.util.ArrayList;

public class UniqueWords {
	/**
	 * counts the number of unique strings in a list
	 * 
	 * @param list ArrayList of strings to be examined
	 * @return number of unique strings in the list
	 */
	public static int countUnique(ArrayList<String> list) {

		int count = 0;

		for (int i = 0; i < list.size(); i++) {								//loops threw the array
			boolean unique = true;
			ArrayList<String> one = new ArrayList<>();
			// count++;

			for (int j = 0; j < i; j++) {

				if (list.get(i).equalsIgnoreCase(list.get(j))) { // This if statement breaks the loop if a word repeats
					// one.add(i);
					unique = false;
					break;
				}

				/*
				 * for(int i=0; i<one.size(); i++){ 
				 * if(unique=false){ 
				 * one.add(i) 
				 * } 
				 * }
				 */

			}
			if (unique) {
				// one.get(i).add(j);
				count++; // adds up all of the unique words
			}
		}

		return count;
	}

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>();
		words.add("apple");
		words.add("orange");
		words.add("blackboard");
		words.add("apple");
		words.add("orange");
		words.add("sun");
		words.add("moon");

		int unique = countUnique(words);
		System.out.println(words + " has " + unique + " unique words");
		// System.out.println(one.size());

	}
}
