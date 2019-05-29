package features;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.Listeners.TestListener;

import static com.ohrm.utilities.OrangeHRMURL.*;


@Listeners({TestListener.class})
@Epic("Regression Tests")
@Feature("Home Page Navigation")
public class HomePageNavigationTest extends BaseTest {

    @Test(priority = 0, description = "Able to navigate to admin page")
    public void TC01_home_navigation() {
        userIsLandingToPage("home");
        homePage.goToModuleAdmin();
        homePage.verifyLandingToCorrectPage(ADMIN_PAGE);
    }

    @Test(priority = 0, description = "Able to navigate to PIM page")
    public void TC02_home_navigation() {
        userIsLandingToPage("home");
        homePage.goToModulePIM();
        homePage.verifyLandingToCorrectPage(PIM_PAGE);
    }

    @Test(priority = 0, description = "Able to navigate to leave page")
    public void TC03_home_navigation() {
        userIsLandingToPage("home");
        homePage.goToModuleLeave();
        homePage.verifyLandingToCorrectPage(LEAVE_PAGE);
    }

    @Test(priority = 0, description = "Able to navigate to time page")
    public void TC04_home_navigation() {
        userIsLandingToPage("home");
        homePage.goToModuleTime();
        homePage.verifyLandingToCorrectPage(TIME_PAGE);
    }

    @Test(priority = 0, description = "Able to navigate to recruitment page")
    public void TC05_home_navigation() {
        userIsLandingToPage("home");
        homePage.goToModuleRecruitment();
        homePage.verifyLandingToCorrectPage(RECRUITMENT_PAGE);
    }

    @Test(priority = 0, description = "Able to navigate to performance page")
    public void TC06_home_navigation() {
        userIsLandingToPage("home");
        homePage.goToModulePerformance();
        homePage.verifyLandingToCorrectPage(PERFORMANCE_PAGE);

    }

    @Test(priority = 0, description = "Able to navigate to dashboard page")
    public void TC07_home_navigation() {
        userIsLandingToPage("home");
        homePage.goToModuleDashboard();
        homePage.verifyLandingToCorrectPage(DASHBOARD_PAGE);
    }

    @Test(priority = 0, description = "Able to navigate to directory page")
    public void TC08_home_navigation() {
        userIsLandingToPage("home");
        homePage.goToModuleDirectory();
        homePage.verifyLandingToCorrectPage(DIRECTORY_PAGE);

    }

    @Test(priority = 0, description = "Able to navigate to About modal")
    public void TC09_home_navigation() {
        userIsLandingToPage("home");
        homePage.goToLinkWelcomeAdmin().clickLinkAbout();
        homePage.verifyModalIsDisplayedWithInformativeMessage();
    }

}
