package com.crushcoder.fasthub

import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.AndroidElement
import io.appium.java_client.remote.AndroidMobileCapabilityType
import io.appium.java_client.remote.MobileCapabilityType
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.openqa.selenium.By
import org.openqa.selenium.remote.DesiredCapabilities
import java.io.File
import java.net.URL


class LoginTest {
    var driver: AndroidDriver<AndroidElement>? = null

    @Before
    fun setup() {
        val classpathRoot = File(System.getProperty("user.dir"))
        val app = File(classpathRoot, "app/build/outputs/apk/debug/app-debug.apk")

        var capabilities = DesiredCapabilities()
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "86MDU16819000327")
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.crushcoder.fasthub")
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".ui.auth.MainActivity")
        capabilities.setCapability("app", app.absolutePath)
        driver = AndroidDriver(URL("http://127.0.0.1:4723/wd/hub"), capabilities)
    }

    @Test
    fun should_login_success() {
        driver!!.findElement(By.id("main_tv_login")).click()
        driver!!.findElement(By.id("username")).sendKeys("rajeshkumarkhadka")
        driver!!.findElement(By.id("password")).sendKeys("R@jesh1234")
        driver!!.findElement(By.id("floatingActionButton2")).click()
    }

    @After
    fun tearDown() {
        driver!!.quit()
    }
}
