package workshop;
import java.util.Scanner;
import java.util.Arrays;
public class day6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10,20,30,40,50,60};
		int ele = 35;
		int ind = 3;
		int [] res = new int[arr.length+1];
		for(int i=0; i<ind; i++) {
			res[i] = arr[i];
		}
		res[ind] = ele;
		for(int i=ind;i<=arr.length-1; i++) {
			res[i+1] = arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(res));
		
	}

}
