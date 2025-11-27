package oct9;

public class class7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//upper pattern
		int rows = 5;
		for(int i=1; i<=rows ; i++) {
			for(int j=1; j<=rows-i; j++) {//space
				System.out.print(" "+" ");
			}
			for(int j=rows+1-i ; j<=rows; j++) {// u_left
				System.out.print(j+" ");
			}
			for( int j = rows-1;  j>=rows+1-i ;j-- ) {//u_right
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		// bottom pattern
		for(int i=1; i<=rows-1; i++) {
			for(int j=1; j<=i; j++) { //bottom space
				System.out.print(" "+" ");
			}
			for(int j = i+1 ; j<=rows ; j++) {//b_left
				System.out.print(j+" ");
			}
			for(int j =rows-1 ; j>=i+1 ;j--) {//b_right
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
