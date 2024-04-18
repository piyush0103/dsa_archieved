package recursion;

public class Power1 {
public static void main(String[] args) {

int sys=power(5,3);	
System.out.println(sys+ "===?");	
	
}

private static int power(int i, int j) {
	// TODO Auto-generated method stub
	System.out.println(j+" ---"+i);
	if(j<=1) {
		return i;
	}else {
	i=i*5;

	}
	return power(i,j-1);
}
}
