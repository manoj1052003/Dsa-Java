package workshop;

public class day5 {
	
	public static int c_digit(int num) {
		int count = 0;
		while(num!=0) {
			num = num / 10;
			count++;
		}
		return count;
	}
	
	public static int c_arms(int num) {
		int digit = c_digit(num);
		int res = 0;
		while(num!=0) {
			int rem = num % 10;
			res = (int)Math.pow(rem, digit)+res;
			num = num / 10;
		}
		return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 152;
		int res = c_arms(num);
		if(num==res) {
			System.out.println("its armstrong");
		}
		else {
			System.out.println("its not");
		}
		
		

	}

}
