package com.ceshiren.BrowserTest;

import com.ceshiren.BaseTest.webBaseTest;
import org.junit.jupiter.api.Test;

public class browerTest extends webBaseTest {

    @Test
    public void getChrome() throws InterruptedException {
        webDriver.get("https://www.baidu.com/");
        System.out.println("打开百度");
    }
}
