import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Q {
	private WebDriver q=null;
	
	public Q(F f) {
		R qj= new R();
		q=qj.Instance(f);
	}
	public void Qqq(String url) {
		q.get(url);
	}
	public void Quit() {
		q.quit();
	}
	public Object JS(String z) {
		return ((JS)q).e(z);
		
	}
	public  WebElement t() {
		//Expected conditions
		
	}
}
