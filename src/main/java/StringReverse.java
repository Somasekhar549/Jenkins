import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.net.HttpURLConnection;
import java.net.URL;



public class StringReverse {

    @Test
    public void evenOrOdd(){
        int i = 9;
        if (i%2==0){
            System.out.println(i+ " is even");
        }
        else {
            System.out.println(i+ " is odd");
        }
    }
}
