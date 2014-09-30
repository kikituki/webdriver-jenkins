
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 動作確認用
 */
public class SampleTest {
    private WebDriver driver;
    
    /**
     * 初期処理。
     * 「@Before」をつけたメソッドは、各テストメソッドの開始前に毎回実行される。
     */
    @Before
    public void setUp() {
        // WebDriverのインスタンスを生成しブラウザを起動
        driver = new FirefoxDriver();
        // 暗黙の待ち時間を設定（これをしないとページがロードする前に処理が進みエラーとなってしまう）
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    
    /**
     * 終了処理。
     * 「@After」をつけたメソッドは、各テストメソッドの終了後に毎回実行される。    
     */
    @After
    public void tearDown() {
        // ブラウザを閉じ、WebDriverを終了する
        driver.quit();
    }
    
    /**
     * メインとなるテスト処理。
     * JUnitは、「@Test」がついたメソッドをテストメソッドとして実行する。
     */
    @Test
    public void test() {
        
        // トップページを表示
        String url = "http://www.google.com/";        
        driver.get(url);
       
    }
}
