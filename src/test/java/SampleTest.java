
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleTest {
    private WebDriver driver;
    
    @Before
    public void setUp() {
        driver = new FirefoxDriver();
//        FirefoxBinary binary = new FirefoxBinary(new File("/usr/bin/firefox"));
//        binary.setEnvironmentProperty("DISPLAY",System.getProperty("lmportal.xvfb.id",":99"));
//        driver = new FirefoxDriver(binary,null);
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    
    @After
    public void tearDown() {
        driver.quit();
    }
    
    @Test
    public void test() {
        
        String url = "http://www.google.com/";        
        driver.get(url);
       
    }
}
