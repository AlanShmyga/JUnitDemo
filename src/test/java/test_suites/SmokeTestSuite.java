package test_suites;

import categories.SmokeTestsCategory;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import tests.CategorizedTest;

@RunWith(Categories.class)
@IncludeCategory(SmokeTestsCategory.class)
@SuiteClasses(CategorizedTest.class)
public class SmokeTestSuite {
}
