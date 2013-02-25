package it.slow;

import com.atlassian.confluence.plugin.functest.AbstractConfluencePluginWebTestCase;
import com.atlassian.confluence.plugin.functest.helper.PageHelper;
import com.atlassian.confluence.plugin.functest.helper.SpaceHelper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ITPerformanceTests extends AbstractConfluencePluginWebTestCase {

    static final String TEST_SPACE_KEY = "SLOWIT";
    private SpaceHelper spaceHelper;
    private PageHelper pageHelper;
    private final int NUM_PAGES = 0;
    private boolean once = true;

    @Before
    public void setUp() throws Exception {
        super.setUp();

        spaceHelper = getSpaceHelper();
        spaceHelper.setKey(TEST_SPACE_KEY);
        spaceHelper.setName("Slow Integration Test Space");
        spaceHelper.setDescription("The SLOWIT Space");
        assertTrue(spaceHelper.create());

        pageHelper = getPageHelper();
        if (once){
            gotoPage("");
            System.out.println("Confluence Version : " + getElementTextByXPath("//span[@id='footer-build-information']"));
            once = false;
        }
    }
    
    @After
    public void tearDown(){
        spaceHelper.delete();    
    }

    @Test
    public void testSetupAndDestroyTestSpace1() {
           createPages(NUM_PAGES);
    }
    @Test
    public void testSetupAndDestroyTestSpace2() {
        createPages(NUM_PAGES);

    }
    @Test
    public void testSetupAndDestroyTestSpace3() {
        createPages(NUM_PAGES);

    }
    @Test
    public void testSetupAndDestroyTestSpace4() {
        createPages(NUM_PAGES);

    }
    @Test
    public void testSetupAndDestroyTestSpace5() {
        createPages(NUM_PAGES);

    }
    @Test
    public void testSetupAndDestroyTestSpace6() {
        createPages(NUM_PAGES);

    }
    @Test
    public void testSetupAndDestroyTestSpace7() {
        createPages(NUM_PAGES);

    }
    @Test
    public void testSetupAndDestroyTestSpace8() {
        createPages(NUM_PAGES);

    }
    @Test
    public void testSetupAndDestroyTestSpace9() {
        createPages(NUM_PAGES);

    }
    @Test
    public void testSetupAndDestroyTestSpace10() {
        createPages(NUM_PAGES);

    }
    @Test
    public void testSetupAndDestroyTestSpace11() {
        createPages(NUM_PAGES);

    }
    @Test
    public void testSetupAndDestroyTestSpace12() {
        createPages(NUM_PAGES);

    }
    @Test
    public void testSetupAndDestroyTestSpace13() {
        createPages(NUM_PAGES);

    }
    @Test
    public void testSetupAndDestroyTestSpace14() {
        createPages(NUM_PAGES);

    }
    @Test
    public void testSetupAndDestroyTestSpace15() {
        createPages(NUM_PAGES);

    }
    @Test
    public void testSetupAndDestroyTestSpace16() {
        createPages(NUM_PAGES);

    }
    @Test
    public void testSetupAndDestroyTestSpace17() {
        createPages(NUM_PAGES);

    }
    @Test
    public void testSetupAndDestroyTestSpace18() {
        createPages(NUM_PAGES);

    }
    @Test
    public void testSetupAndDestroyTestSpace19() {
        createPages(NUM_PAGES);

    }
    @Test
    public void testSetupAndDestroyTestSpace20() {
        createPages(NUM_PAGES);

    }

    private void createPages(int num){

        long homePageId = spaceHelper.getHomePageId();
        for(int i = 0; i < num; i++){
            pageHelper.setSpaceKey(TEST_SPACE_KEY);
            pageHelper.setTitle("Page " + i);
            pageHelper.setParentId(homePageId);
            pageHelper.setContent("Test Page " + i);
            assertTrue( pageHelper.create());
            gotoPage("/pages/viewpage.action?pageId="+pageHelper.getId());
        }

    }

}
