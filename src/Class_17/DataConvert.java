package Class_17;

public class DataConvert {
		public static void main(String[] args) {
			
			String x = "100";
			System.out.println(x+20);
			
			int i = Integer.parseInt(x);
			System.out.println(x);
			
			String y = "12.33";
			System.out.println(y+100);
			
			Double d = Double.parseDouble(y);
			System.out.println(d+100);
			
			String p ="100P";
			System.out.println(p+100);
			
			//int k = Integer.parseInt(p);
			//System.out.println(k+p);
			
			int m = 100;
			//System.out.println(m+20);
			String n = String.valueOf(m);
			System.out.println(n);
			
			
			
		}
}
