import java.util.Arrays;
import java.util.Scanner;
=======
import java.util.stream.Collectors;

import java.util.stream.Stream;

public class TestMaximumMain <T extends Comparable<T>> {
	
	//Generic Method
	public <T extends Comparable<T>> T findMaximum(Stream<T> gen_str) {

		return gen_str.sorted().reduce((less,more) -> more).get();
=======
		return gen_str.collect(Collectors.maxBy(T::compareTo)).get();

	}

	public void getInput() {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter no of objects to input: ");
		int run_loop=sc.nextInt();
		
		for (int i=0;i<run_loop;i++) {
			System.out.print("Input "+(i+1)+": ");
	    	T input = (T) sc.next();
	    	push(input);
		}
    	sc.close();
	}
	
	public void push(T... input) {

    	Stream<T> gen_stream=Arrays.stream(input);
    	System.out.println("Maximum = "+findMaximum(gen_stream));
=======
		System.out.println("Please enter 3 objects: ");
    	System.out.print("Input 1: ");
    	T input1 = (T) sc.next();
    	System.out.print("Input 2: ");
    	T input2 = (T) sc.next();
    	System.out.print("Input 3: ");
    	T input3 = (T) sc.next();
    	
    	@SuppressWarnings("unchecked")
		T[] gen_arr = (T[])new Object[3];
    	gen_arr[0]=input1;
    	gen_arr[1]=input2;
    	gen_arr[2]=input3;
    	
    	Stream<T> gen_stream=Arrays.stream(gen_arr);
    	
    	System.out.println("Maximum = "+findMaximum(gen_stream));
    	sc.close();
	}

public static void main( String[] args ) {
		
		TestMaximumMain buildObj = new TestMaximumMain();
    	buildObj.getInput();
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

	public static void main( String[] args ) {
		
		TestMaximumMain buildObj = new TestMaximumMain();
      main
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
=======
    	Stream<Integer> stream=Arrays.stream(num_arr);
    	System.out.println("Maximum integer = "+buildObj.maxNumber(stream));
    	sc.close();

    }
}
