import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class TestMaximumMain {
	
	public int maxNumber(Stream<Integer> stream) {
		return stream.max(Integer::compareTo).get();
	}
	
	public Float maxFloat(Stream<Float> stream) {
		return stream.max(Float::compareTo).get();
	}

	public static void main( String[] args ) {
		
	TestMaximumMain buildObj = new TestMaximumMain();
    	Scanner sc= new Scanner(System.in);
    	System.out.println("Input 3 integers: ");
    	System.out.print("Int 1: ");
    	int num1 = sc.nextInt();
    	System.out.print("Int 2: ");
    	int num2 = sc.nextInt();
    	System.out.print("Int 3: ");
    	int num3 = sc.nextInt();
    	
    	Integer num_arr[] = new Integer[]{num1,num2,num3};
    	Float fl_arr[] = new Float[] {(float) num1,(float) num2,(float) num3};
    	Stream<Integer> num_stream=Arrays.stream(num_arr);
    	Stream<Float> fl_stream=Arrays.stream(fl_arr);
    	System.out.println("Maximum integer = "+buildObj.maxNumber(num_stream));
    	System.out.println("Maximum float = "+buildObj.maxFloat(fl_stream));
    	sc.close();
    }
}
