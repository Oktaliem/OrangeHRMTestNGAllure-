package utils;

import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.assertthat.selenium_shutterbug.utils.web.ScrollStrategy;
import org.openqa.selenium.WebDriver;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ScreenShootComparison{
    WebDriver driver;

    public boolean compareFullPageScreenShoot(String path, String fileName) throws IOException {
        File image = new File(path);
        BufferedImage expectedImage = ImageIO.read(image);
        boolean status = Shutterbug.shootPage(driver,ScrollStrategy.WHOLE_PAGE,500,true).withName(fileName).equals(expectedImage,0.1);
        return status;
    }
}
