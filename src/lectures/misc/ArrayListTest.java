package lectures.misc;
import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> name = new ArrayList<>();
		name.add(12);
		name.add(535);
		name.add(8484);
		name.add(68686);
		name.add(5656);
		name.add(5656);
		

		
		for(int i=0;i<name.size();i++) {
			System.out.println(name.get(i));
		}
		
		System.out.println("---");
		
		name.add(99999);
		
		
		for(int i=0;i<name.size();i++) {
			System.out.println(name.get(i));
		}
		System.out.println("---");
		name.remove(0);

		
		for(int i=0;i<name.size();i++) {
			System.out.println(name.get(i));
		}
		System.out.println("---");
	}

}
