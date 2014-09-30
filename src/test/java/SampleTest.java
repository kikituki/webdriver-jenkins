
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * ����m�F�p
 */
public class SampleTest {
    private WebDriver driver;
    
    /**
     * ���������B
     * �u@Before�v���������\�b�h�́A�e�e�X�g���\�b�h�̊J�n�O�ɖ�����s�����B
     */
    @Before
    public void setUp() {
        // WebDriver�̃C���X�^���X�𐶐����u���E�U���N��
        driver = new FirefoxDriver();
        // �Öق̑҂����Ԃ�ݒ�i��������Ȃ��ƃy�[�W�����[�h����O�ɏ������i�݃G���[�ƂȂ��Ă��܂��j
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    
    /**
     * �I�������B
     * �u@After�v���������\�b�h�́A�e�e�X�g���\�b�h�̏I����ɖ�����s�����B    
     */
    @After
    public void tearDown() {
        // �u���E�U����AWebDriver���I������
        driver.quit();
    }
    
    /**
     * ���C���ƂȂ�e�X�g�����B
     * JUnit�́A�u@Test�v���������\�b�h���e�X�g���\�b�h�Ƃ��Ď��s����B
     */
    @Test
    public void test() {
        
        // �g�b�v�y�[�W��\��
        String url = "http://www.google.com/";        
        driver.get(url);
       
    }
}
