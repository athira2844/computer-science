import java.util.*;
public class One
{ public static void main(String s[])
	{ int arr[]=new  int[0];
		System.out.println("Array"+arr.length);
int[][] dA;
Scanner scan = null;
dA = new int[2][];
scan = new Scanner(System.in);
for(int i=0;i<dA.length;i++){
System.out.print("Enter column: ");
int col=scan.nextInt();
dA[i] = new int[col];
System.out.println("Enter values");
for(int j=0;j<col;j++){
dA[i][j]=scan.nextInt();
}
System.out.println(" ");
}

System.out.println(""+Arrays.deepToString(dA));


	}

}