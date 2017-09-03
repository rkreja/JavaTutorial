package rkreja.notes;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> contacts = new ArrayList();
		contacts.add("Reja");
		contacts.add("12626");
		contacts.size();
		contacts.addAll(Arrays.asList("sa","sasas","dsdsd"));
		for(String s:contacts) {
			System.out.println(s);
		}
		
		
	}

}
