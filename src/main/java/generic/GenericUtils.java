package generic;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;

public class GenericUtils 
{
	public static void verifyBrokenLinks(List<WebElement> allLinks)
	{
		for(WebElement link:allLinks)
		{
			String text = link.getText();
			String href= link.getAttribute("href");
			
			System.out.println("Link: "+text);
			System.out.println("URL: "+href);
			
			try {
				URL url = new URL(href);
				HttpURLConnection con = (HttpURLConnection)url.openConnection();
				int code  = con.getResponseCode();
				if(code==200)
				{
					System.out.println("Link is not broken");
				}else {
					System.out.println("Link is broken 1");
					System.out.println(con.getResponseMessage());
				}
			} 
			catch (MalformedURLException e) 
			{
				System.out.println("Link is broken 2");
			} catch (IOException e) {
				System.out.println("check your network");
			}
			System.out.println("=================================================");
		}
	}
}
