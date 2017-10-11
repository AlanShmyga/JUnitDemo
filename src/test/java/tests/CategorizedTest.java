package tests;

import categories.CategorizedTestsCategory;
import categories.IntegrationTestsCategory;
import categories.SmokeTestsCategory;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class CategorizedTest {

    @Category({SmokeTestsCategory.class, CategorizedTestsCategory.class})
    @Test
    public void someBaseTest() {
        System.out.println("This is a first base categorized test");
    }

    @Category({IntegrationTestsCategory.class, CategorizedTestsCategory.class})
    @Test
    public void someAnotherTest() {
        System.out.println("This is a second categorized test");
    }
}
