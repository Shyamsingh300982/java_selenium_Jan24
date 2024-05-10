	package java_selenium_Jan24;
	public class PatternMaking {
	public static void main (String[]args) {


//		// pattern 1
//		for (int i=1;i<=5;i++) {
//			
//			for (int j=1; j<=i; j++) {
//				System.out.print("*" + " ");
//		}
//		System.out.println();
//		}
//		System.out.println(" ");}}
	
		
//		 //pattern 2
//		int n = 5;
//		int i;
//		for ( i=n;i>=1;i--) {
//		
//			for (int j=1; j<=i; j++) {
//				System.out.print("*" + " ");
//		}
//		System.out.println();
//		}
//		System.out.println(" ");
//		}}

		
//		// Pattern 3
//		for (int i=5; i>=1;i--) {
//			
//			for (int j=1; j<=i;j++) {
//				System.out.print("*" + " ");
//			}
//			System.out.println();
//		}
//			System.out.println(" ");}}		
		
				
		//pattern 4
//		int n = 6;
//		int i;
//		for (i=1;i<n;i++) {
//		for (int j=1; j<n ; j++) {
//
//		if (j>=i) {
//		System.out.print("*");
//		}else {
//		System.out.print(" ");
//		}}
//	System.out.println();
//		}
//		}}
		
		
		 //pattern 5
//		int n = 5;
//		int i;
//		for ( i=0;i<n;i++) {
//		for (int j=0; j<n-i-1; j++) {
//		System.out.print(" ");
//		}
//		for(int k = 0; k<2*i+1; k++) {
//		System.out.print("*");
//		}
//		System.out.println();
//		}}}

		
		 //pattern 6
//		int n = 5;
//		int i;
//		for ( i=n;i>=1;i--) {
//		for (int j=0; j<n-i+1; j++) {
//		System.out.print(" ");
//		}
//		for(int k = 0; k<2*i-1; k++) {
//		System.out.print("*");
//		}
//		System.out.println();
//		}}}

		
		//pattern 7
//		int n = 5;
//		int i;
//		for ( i=0;i<n;i++) {
//		for (int j=0; j<n-i-1; j++) {
//		System.out.print(" ");
//		}
//		for(int k = 0; k<2*i+1; k++) {
//		System.out.print("*");
//		}
//		System.out.println();
//		}
//		
//		for ( i=n-2;i>=0;i--) {
//		for (int j=0; j<n-i-1; j++) {
//		System.out.print(" ");
//		}
//		for(int k = 0; k<2*i+1; k++) {
//		System.out.print("*");
//		}
//		System.out.println();
//		}}}
		
		
//		//Pattern 8
//		for (int i=1; i<=5; i++) {
//		for (int j=1;j<=i;j++) {
//		System.out.print("*");
//			}
//		System.out.println();
//			}
//		for (int i=4; i>=1; i--) {
//		for (int j=1; j<=i; j++) {
//		System.out.print("*");
//			}			
//		System.out.println(); }}}

	
	
			//Pattern 9
//			int i,j,k,n=5;
//		
//			for (i=0; i<n; i++) { 
//			for (j=0;j<n-i-1;j++) {	
//				
//			System.out.print(" ");
//			}
//			for(k =0;k<=i;k++) {
//			System.out.print("*");
//			}
//			System.out.println();
//			}
//			for (i=n-1; i>0; i--) {
//			for (j=0; j<n-i; j++) {
//				
//			System.out.print(" ");
//			}
//			for(k =0;k<i;k++) {
//			System.out.print("*");
//			}
//			System.out.println(); }}}

		
//		 //pattern 10
//		int n = 5;
//		int i;
//		for (i=0;i<n;i++) {
//		for (int j=0; j<n-i; j++) {
//		System.out.print(" ");
//		}
//		for(int k = 0; k<n; k++) {
//		System.out.print("*");
//		}
//		System.out.println();
//		}}}
		
		
		 //pattern 11
//		int n = 5;
//		int i;
//		for (i=0;i<n;i++) { 
//		for (int j=0;j<i; j++) {
//		System.out.print(" ");
//		}
//		for(int k = 0; k<n; k++) {
//		System.out.print("*");
//		}
//		System.out.println();
//		}}}
		
		
		
		//Pattern 12
//		int n = 5;
//		for (int i=n; i>=1; i--) {
//		for (int j=1;j<=i;j++) {
//		System.out.print("*");
//			}
//		System.out.println();
//			}
//		for (int i=2; i<=n; i++) {
//		for (int j=1; j<=i; j++) {
//		System.out.print("*");
//			}			
//		System.out.println(); }}}
	
		
		
		//Pattern 13
//		 int rows = 5;
//
//	       for (int i = 0; i < rows; i++) {
//	       for (int j = 0; j < rows; j++) {
//	       if (j >= i && j < rows) {
//	       System.out.print("*");
//	       } else {
//	       System.out.print(" ");
//	       }}
//	       System.out.println();
//	       }
//	       for (int i = rows - 2; i >= 0; i--) {
//	       for (int j = 0; j < rows; j++) {
//	       if (j >= i && j < rows) {
//	       System.out.print("*");
//	       } else {
//	       System.out.print(" ");
//	       }}
//	       System.out.println();
//	        }}}
//		
		
		
		//Pattern 14
//		 int rows = 7;
//	     int mid = rows / 2;
//	     
//	     for (int i = 0; i < rows; i++) {
//	     for (int j = 0; j < rows; j++) {
//	     if (i < mid) {
//	     if (j < i || j >= rows - i) {
//	     System.out.print(" ");
//	     } else {
//	     System.out.print("*");
//	     }
//	     
//	     } else {
//	     if (j < rows-i-1 || j > i) {
//	     System.out.print(" ");
//	     } else {
//	     System.out.print("*");
//	     }}}
//	     System.out.println();
//	     }}}
		
		
		//Pattern 15
//		 int n = 5;
//		 for (int i = 0; i < n; i++) {
//	     for (int j = 0; j <= i; j++) {
//	     if (j == i || j == 0 || i == n - 1) {
//	     System.out.print("*");
//	     } else {
//	     System.out.print(" ");
//	     }}
//	     System.out.println();
//	     }}}
	
	
		
		//Pattern 16
		int rows = 5;
        for (int i = 0; i < rows; i++) {
        for (int j = 0; j < rows; j++) {
        if (j == rows - i - 1 || j == rows - 1 || i == rows - 1) {
        System.out.print("*");
        } else {
        System.out.print(" ");
        }}
        System.out.println();
        }}}		