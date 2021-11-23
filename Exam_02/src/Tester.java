/*
 * Name: Mark Hudak
 * Date: 06/10/2020
 * Description: Exam 2
 */

import java.io.RandomAccessFile;
import java.util.HashMap;

public class Tester {

	public static void main(String[] args) {

		/*
		 * Uncomment each call to a question while testing 
		 */

		/* ================ Question 1 ================ */
		System.out.println( Question1(10) );

		/* ================ Question 2 ================ */
		System.out.println(Question2("Alabama Shakes"));

		/* ================ Question 3 ================ */
		System.out.println(Question3(new int[] {6, 5, 456, 6, -45 }));

		/* ================ Question 4 ================ */
		System.out.println(Question4("Did you see that doggy go", 'd', 'g'));

		/* ================ Question 5 ================ */
		System.out.println(Question5(new String[] { "Paula", "I", "love", "you", "gah", "kick", "bits"} , "gah"));

		/* ================ Question 6 ================ */
		//Question6();

	}

	//======================================================Recursion
	//=====Q1

	public static String Question1(int n) {
		return Question1(n, "");
	}
	private static String Question1(int n, String star) {
		if (n<=0) return "";
		star = "*";
		return star + Question1(n-1, star);

	}

	//=====Q2

	public static String Question2(String s) {
		return Question2(s, "", 0);
	}
	private static String Question2(String s, String newS, int i) {
		if (i>=s.length()) return newS;
		if (s.toLowerCase().charAt(i) != 'a' &&
				s.toLowerCase().charAt(i) != 'e' &&
				s.toLowerCase().charAt(i) != 'i' &&
				s.toLowerCase().charAt(i) != 'o' &&
				s.toLowerCase().charAt(i) != 'u' &&
				s.toLowerCase().charAt(i) != ' ' ) {
			return s.charAt(i) + Question2(s, newS, i+1);
		}
		return Question2(s, newS, i+1);
	}

	//=====Q3

	public static double Question3(int[] nums) {
		return Question3(nums, 0, 0.0)/nums.length;
	}
	private static double Question3(int[] nums, int i, double av) {
		if(i == nums.length) return av;
		av = nums[i];
		return av + Question3(nums, i+1, 0);
	}



	//=====Q4

	public static String Question4(String s, char f, char t) {
		if (s.length() == 0) return "";
		if(s.charAt(0) == f) return t + Question4(s.substring(1), f, t);
		return s.charAt(0) + Question4(s.substring(1), f, t);
	}


	//=====Q5   

	public static int Question5(String[] ss, String keyWord) {
		return Question5(ss, keyWord, 0, ss.length - 1);
	}
	private static int Question5(String[] ss, String keyWord, int lo, int hi) {
		if (lo>hi) return -1;
		int mid = (lo + hi)/2;
		int w = keyWord.compareTo(ss[mid]);
		if(w == 0) return mid;
		if(w > 0) Question5(ss, keyWord, lo, mid-1);
		return Question5(ss, keyWord, mid+1, hi);
	}
	 

	//=====Q6

	public static void Question6() {
		HashMap<String, Employee> employees = new HashMap<String, Employee>();
		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile("rafData.bin", "r");
			while(raf.getFilePointer() < raf.length()) {
				Employee e = new Employee(raf);
				employees.put(e.getId(), e);
			}
		} catch (Exception e) {
			e.printStackTrace(); 
		} finally {
			try { raf.close(); } catch (Exception e) {}
		}

		for(String s : employees.keySet()) System.out.println(employees.get(s));

		System.out.printf("Total number of employees: %d \n", employees.size());
		System.out.printf("User name and age: %-8s %-8s\n", employees.get("14095aee-4cc5-4162-b1e1-66171b2edc58").getName(),
				employees.get("14095aee-4cc5-4162-b1e1-66171b2edc58").getAge());

	}
}
