package test_suites;

import categories.CategorizedTestsCategory;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import tests.CategorizedTest;
import tests.ParametrizedTest;

@RunWith(Categories.class)
@IncludeCategory(CategorizedTestsCategory.class)
@SuiteClasses(CategorizedTest.class)
public class CategorizedTestSuite {
}
