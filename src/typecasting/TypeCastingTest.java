package typecasting;

import com.timeandtraining.humans.Doctor;
import com.timeandtraining.humans.Human;

public class TypeCastingTest {

	public static void main(String[] args) {

//		double //4.94065645841246544e-324d to 1.79769313486231570e+308d (positive or negative)
//		float //1.40129846432481707e-45 to 3.40282346638528860e+38 (positive or negative)
//		long //-9223372036854775808 to 9223372036854775807
//		int //-214483648 to 2147483647
//		short//-32768 to 32767		
//		byte//-128 to 127
		
		Human human = new Human("");
		Doctor doctor = new Doctor("");		

		human =doctor;//up casting / automatic conversion
		doctor = (Doctor)human; //  down casting
		
		
		double d=10.00;
		int i=5;
		
		d=i; // up casting /automatic conversion
		i=(int) d;// down casting //narrowing
		
		
	}

}
