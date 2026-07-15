package nestedframes;
import Pages.Frames;
import Pages.nestedFrame;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FrameTest extends Base {
    private Frames frames;
    private nestedFrame nestedFrames;

    @BeforeMethod
    public void beforeMethod() {
        frames = new Frames(driver);
        nestedFrames = new nestedFrame(driver);
    }
    @Test
    public void testNestedFrames() {
        homePage.clickFrameLink();
        frames.clickNestedFrameLink();
        nestedFrames.switchToLeftFrame();
        nestedFrames.switchToBottomFrame();

        Assert.assertEquals(nestedFrames.switchToLeftFrame(),"LEFT","you not correct frame");
        Assert.assertEquals(nestedFrames.switchToBottomFrame(),"BOTTOM","you not correct frame");
        driver.quit();




    }



}
