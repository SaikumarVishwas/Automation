import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class R {
	public WebDriver Instance(F f) {
		if(F.CHROME==f) {
			return new ChromeDriver();
		}
		if(F.IE==f) {
			return new InternetExplorerDriver();
		}
		if(F.FF==f) {
			return new FirefoxDriver();
		}
		return null;
		
	}
}
