import java.util.*;
class ReverseTriangle {
 public static void main(String[] args) {
  int spaceIndex = 1;
  
  System.out.println("Enter n:");
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  // How many * we want? n-rowCount
  // How many numbers we want per row: rowCount 
  
  // Row loop
  for (int i=1; i<=n; i++) {
        // space loop
  	for (spaceIndex=1; spaceIndex<=n-i; spaceIndex++) {
   	  System.out.print("   ");
  	}
	// number loop
  	for (int j=1; j <= i; j++) {
	  String space = j >=10 ? " " : "  ";
	  System.out.print(j + space);
  	} 
  	System.out.println();
  }
  sc.close();
 }
}