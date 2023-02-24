package com.ceshiren.BaseTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class webBaseTest {

    public static WebDriver webDriver;

    @BeforeAll
    public static void BeforeAllTest() {
        //创建浏览器驱动
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        System.out.println("浏览器驱动创建完毕");
    }

    @AfterAll
    public static void AfterAllTest() {
        //关闭浏览器
        webDriver.quit();
        System.out.println("浏览器销毁");
    }
}
