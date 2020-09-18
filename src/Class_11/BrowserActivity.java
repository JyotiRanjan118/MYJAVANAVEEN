package Class_11;

public class BrowserActivity {
		
		public void launchBrowser(String browser, String OS) {
			interactWithBrowser(browser, OS);
		}
		
		private void interactWithBrowser(String browser,String OS) {
			if(browser.equals("chrome")) {
				System.out.println("Launch chrome");
				interactWithChromeService(OS);
			}else if(browser.equals("firefox")) {
				System.out.println("Launch firefox");
				interactWithFireFoxServices(OS);
			}
		}
		private void interactWithChromeService(String OS) {
			if(OS.equals("WIN")) {
				System.out.println("WIN-Chrome");
			}
			else if(OS.equals("MAC")) {
				System.out.println("MAC--Chrome");
			}
			
			else if(OS.equals("LINUX")) {
				System.out.println("LINUX -- Chrome");
			}
		}
		
		private void interactWithFireFoxServices(String OS) {
			if(OS.equals("WIN")) {
				System.out.println("WIN -- Chrome");
			}
			else if(OS.equals("MAC")) {
				System.out.println("MAC -- FireFox");
			}
			
			else if(OS.equals("LINUX")) {
				System.out.println("Linux -- firefox");
			}
		}
}
