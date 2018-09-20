public class Main {

    public static void main(String[] args) {
	// write your code here
        double D1toD2=Math.sqrt(Math.pow(5-4,2)+Math.pow(2-9,2)+Math.pow(-5-2,2));
        double D1toD3=Math.sqrt(Math.pow(5-(-3),2)+Math.pow(2-2,2)+Math.pow(-5-6,2));
        double D2toD3=Math.sqrt(Math.pow(4-(-3),2)+Math.pow(9-2,2)+Math.pow(2-6,2));
        System.out.println("Shortest distance is:"+Math.min(Math.min(D1toD2,D1toD3),Math.min(D1toD3,D2toD3)));
        System.out.println("Longest distance is:"+Math.max(Math.max(D1toD2,D1toD3),Math.max(D1toD3,D2toD3)));

    }
}
