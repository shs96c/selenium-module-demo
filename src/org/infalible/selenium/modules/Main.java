package org.infalible.selenium.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Main {

  public static void main(String[] args) {
    WebDriver driver = RemoteWebDriver.builder()
        .oneOf(new FirefoxOptions())
        .build();

    try {
      driver.get("http://www.google.com");
      WebElement element = driver.findElement(By.name("q"));
      element.sendKeys("cheese");
    } finally {
      driver.quit();
    }
  }

}
