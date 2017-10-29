package lectures.misc;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberTest {

	public static void main(String[] args) {
		
		
		System.out.println(ThreadLocalRandom.current().nextInt(1, 100));

	}

}
