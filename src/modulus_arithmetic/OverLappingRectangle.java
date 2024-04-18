package modulus_arithmetic;

public class OverLappingRectangle {
public static void main(String[] args) {
	int A=0,B=0,C=4,D=4,E=2,F=2,G=4,H=4;
	
	int x=solve(A,B,C,D,E,F,G,H);
}

private static int solve(int A, int B, int C, int D, int E, int F, int G, int H) {
	// TODO Auto-generated method stub
	if(C<=E||D<=F) {
		return 1;
	}
	if(A<=G||B<=H) {
		return 1;
	}
	else {
		return 0;
	}
	
}
}