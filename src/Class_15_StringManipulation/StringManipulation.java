package Class_15_StringManipulation;

public class StringManipulation {
	
		public static void main(String[] args) {
			
			String str="This is my java code and I am so happys";
			System.out.println(str.length());
			
			System.out.println(str.charAt(1));
			System.out.println(str.charAt(0));
			
			//System.out.println(str.charAt(38));		//StringIndexofbound exception
			
			System.out.println(str.indexOf("m"));
			
			System.out.println(str.indexOf("java"));
			
			System.out.println(str.indexOf("hello"));
			
			System.out.println(str.indexOf("s"));
			System.out.println(str.indexOf("s",4));
			System.out.println(str.indexOf("s",str.indexOf("s")+1));	//2nd occurence of S
			
			String msg="Welcome null";
			if(msg.indexOf("Admin")>0) {
				System.out.println("pass");
			}
			else {
				System.out.println("fail");
			}
			
			System.out.println(str.indexOf('h'));
			
			//compare strings
			String s1="Hello World";
			String s2="hello World";
			
			System.out.println(s1.equals(s2));
			System.out.println(s1.equalsIgnoreCase(s2));
			
			//trim 
			String p="   hello world   ";
			System.out.println(p.trim());
			
			//replace
			System.out.println(p.trim().replace(" ",""));
			
			String dob="01-01-1990";	//01/01/1990
			System.out.println(dob.replace("-", "/"));
			
			//UCASE and LCASE
			String h1="This is Selenium";
			System.out.println(h1.toLowerCase());
			System.out.println(h1.toUpperCase());
			
			//sub string
			String st="Transaction id is 1234";
			System.out.println(st.substring(6));     //String II be started from 6
			System.out.println(st.substring(0,12));
			System.out.println(st.substring(18));
			System.out.println(st.length());
			
			
			//split
			String data="Tom;25;male;1000;USA";
			String dataVal[]=data.split(";");
			
			System.out.println(dataVal[0]);
			System.out.println();
			for(int i=0;i<dataVal.length;i++) {
				System.out.println(dataVal[i]);
			}
			
			String test="xXJavaXxXPythonxXRubyxXSelenium";
			String val[]=test.split("xX");
			System.out.println(val[1]);
			System.out.println(val[3]);
			
			String name="Tom Peter Steve";
			System.out.println(name.split(" ")[0]);
			System.out.println(name.split(" ")[1]);
			System.out.println(name.split(" ")[2]);
			
			
			for(int i=0; i<name.split(" ").length;i++){
				System.out.println(name.split(" ")[i]);
				
			}
			
			String credentials = "admin;testpassword";
			String	username = credentials.split(";")[0];
			String password = credentials.split(";")[1];
			
			doLogin(username,password);
		}
		
		public static void doLogin(String un,String pwd) {
			System.out.println("login to app with "+un+" "+pwd);
		}
}
