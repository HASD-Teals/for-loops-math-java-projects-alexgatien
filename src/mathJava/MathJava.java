package mathJava;

public class MathJava {

	public static void main(String[] args) {
		
		cuboidc(3,4,5);
		cuboidt(3,4,5);
	}
public static void cuboidc (int h,int w,int l) {

	System.out.println(2*h*(w+l));
	
	
}
public static void cuboidt (int h, int w, int l) {
	System.out.println(2*(h*w+w*l+h*l));
	
}
}
