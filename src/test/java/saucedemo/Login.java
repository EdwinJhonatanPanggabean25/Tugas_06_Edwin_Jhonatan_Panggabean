package saucedemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Login {
    @Test
    public void succes_login() {

        WebDriver driver;
        String baseURL = "https://www.saucedemo.com/";

        WebDriverManager.chromedriver().setup();

        //apply chrome driver setup
        //Membuka halaman Login
        driver = new ChromeDriver();
        driver.manage().window().maximize();//
        driver.get(baseURL);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        String LoginAssert = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]")).getText();
        Assert.assertEquals(LoginAssert, "Swag Labs");
        //Input email
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        //Input Password
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        //Click Login
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

        //Assert nama Toko di Dashboard Page
        String DashboardAssert = driver.findElement(By.xpath("//*[@id='header_container']/div[2]/span")).getText();
        Assert.assertEquals(DashboardAssert, "Products");
        driver.close();
    }

    @Test
    public void logout() {

        WebDriver driver;
        String baseURL = "https://www.saucedemo.com/";

        WebDriverManager.chromedriver().setup();

        //apply chrome driver setup
        //Membuka halaman Login
        driver = new ChromeDriver();
        driver.manage().window().maximize();//
        driver.get(baseURL);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        String LoginAssert = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]")).getText();
        Assert.assertEquals(LoginAssert, "Swag Labs");
        //Input email
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        //Input Password
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        //Click Login
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

        //Assert nama Toko di Dashboard Page
        String DashboardAssert = driver.findElement(By.xpath("//*[@id='header_container']/div[2]/span")).getText();
        Assert.assertEquals(DashboardAssert, "Products");

        //Click button Menu
        driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();

        //Click button Log Out
        driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();

        //Assert nama Toko di Dashboard Page
        String LogoutAssert = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]")).getText();
        Assert.assertEquals(LogoutAssert, "Swag Labs");
        //Close Browser
        driver.close();

    }

    @Test
    public void failed_login() {

        WebDriver driver;
        String baseURL = "https://www.saucedemo.com/";

        WebDriverManager.chromedriver().setup();

        //apply chrome driver setup
        //Membuka halaman Login
        driver = new ChromeDriver();
        driver.manage().window().maximize();//
        driver.get(baseURL);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        String LoginAssert = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]")).getText();
        Assert.assertEquals(LoginAssert, "Swag Labs");
        //Input email
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        //Input Password
        driver.findElement(By.id("password")).sendKeys("secret_");
        //Click Login
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

        //Assert nama Toko di Dashboard Page
        String ErrorLogin = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]")).getText();
        Assert.assertEquals(ErrorLogin, "Epic sadface: Username and password do not match any user in this service");
        driver.close();
    }

    @Test
    public void addtoCart_login() {

        WebDriver driver;
        String baseURL = "https://www.saucedemo.com/";

        WebDriverManager.chromedriver().setup();

        //apply chrome driver setup
        //Membuka halaman Login
        driver = new ChromeDriver();
        driver.manage().window().maximize();//
        driver.get(baseURL);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        String LoginAssert = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]")).getText();
        Assert.assertEquals(LoginAssert, "Swag Labs");
        //Input email
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        //Input Password
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        //Click Login
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        //Click Sauce Labs BackPack "add to cart"
        driver.findElement(By.xpath("//*[@id=\"item_4_img_link\"]/img")).click();
        //Click "add to cart"
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
        //Assert nama Toko di Dashboard Page
        //String ErrorLogin = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]")).getText();
        //Assert.assertEquals(ErrorLogin, "Epic sadface: Username and password do not match any user in this service");
        driver.close();
    }

    @Test
    public void Click_Keranjang() {

        WebDriver driver;
        String baseURL = "https://www.saucedemo.com/";

        WebDriverManager.chromedriver().setup();

        //apply chrome driver setup
        //Membuka halaman Login
        driver = new ChromeDriver();
        driver.manage().window().maximize();//
        driver.get(baseURL);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        String LoginAssert = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]")).getText();
        Assert.assertEquals(LoginAssert, "Swag Labs");
        //Input email
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        //Input Password
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        //Click Login
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        //Click Sauce Labs BackPack "add to cart"
        driver.findElement(By.xpath("//*[@id=\"item_4_img_link\"]/img")).click();
        //Click "add to cart"
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
        //Click Keranjang
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        //Assert Keranjang
        String Keranjang = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
        Assert.assertEquals(Keranjang, "Your Cart");

        //Click Checkout
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();


        driver.close();
    }

    @Test
    public void Checkout () {

        WebDriver driver;
        String baseURL = "https://www.saucedemo.com/";

        WebDriverManager.chromedriver().setup();

        //apply chrome driver setup
        //Membuka halaman Login
        driver = new ChromeDriver();
        driver.manage().window().maximize();//
        driver.get(baseURL);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        String LoginAssert = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]")).getText();
        Assert.assertEquals(LoginAssert, "Swag Labs");
        //Input email
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        //Input Password
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        //Click Login
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        //Click Sauce Labs BackPack "add to cart"
        driver.findElement(By.xpath("//*[@id=\"item_4_img_link\"]/img")).click();
        //Click "add to cart"
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
        //Click Keranjang
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        //Assert Keranjang
        String Keranjang = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
        Assert.assertEquals(Keranjang, "Your Cart");

        //Click Checkout
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();

        //Assert Checkout
        String Checkout = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
        Assert.assertEquals(Checkout, "Checkout: Your Information");

        //First Namse
        driver.findElement(By.id("first-name")).sendKeys("Budi");

        //last name
        driver.findElement(By.id("last-name")).sendKeys("Setiawan");

        //postalcode
        driver.findElement(By.id("postal-code")).sendKeys("12321");

        //Click Continue
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();

        //Assert CheckoutOverview
        String CheckoutOverview = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
        Assert.assertEquals(CheckoutOverview, "Checkout: Overview");

        //Click Finish
        driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();

        //Assert CheckoutComplete
        String CheckoutComplete = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
        Assert.assertEquals(CheckoutComplete, "Checkout: Complete!");

        driver.close();
    }
}


