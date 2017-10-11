package tests;

import categories.CategorizedTestsCategory;
import categories.IntegrationTestsCategory;
import categories.SmokeTestsCategory;
import org.junit.*;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class) // указываем какой загрузчик использовать для запуска тестов в этом классе
public class ParametrizedTest {

    /*
        Переменные класса (полЯ)
    */
    int number;
    String value;

    /*
        Конструктор тестового класса который задает тестовые параметры
        (сохраняет входные параметры в переменные каждый раз при запуске теста)
    */
    public ParametrizedTest(int number, String value) {
        this.number = number;
        this.value = value;
    }

    /*
        Это метод, которы генерирует наши тестовые параметры.
        Все параметры которые созданы в этом методе будут поданы как входные параметры
        для каждого из наших тестов в этом классе.
    */
    @Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {1, "One"},
                {2, "two"},
                {3, "three"}};
    }

    /*
        Этот метод будет выполнен перед каждым тестом
    */
    @Before
    public void setup() {
        System.out.println("This text is precedes each test ==BEFORE==");
    }

    /*
        Этот метод будет выполнен после каждого теста
    */
    @After
    public void tearDown() {
        System.out.println("This text is follows by each test ==AFTER==");
    }

    /*
        Это первый параметризированный тест. Он использует входные параметры в своей логике, и, как и другие тесты
        в этом классе будет выполнен столько же раз, сколько параметров есть у нас в метоже параметров, описанном выше.
    */
    @Category(SmokeTestsCategory.class)
    @Test
    public void someBaseTest() {
        System.out.println(number + " : " + value);
    }

    /*
        Это второй параметризированный тест, и в то же время, это тест подходящий под категорию SmokeTests
    */
    @Category(IntegrationTestsCategory.class)
    @Test
    public void someAnotherTest() {
        System.out.println("This is the second parametrized test");
    }

    /*
        Этот тест не будет выполняться пока над ним есть аннотация @Ignore.
        Такую аннотацию полезно использовать для тех тестов,
        которые находятся в процессе разработки или которые падают по непонятным пока причинам.
    */
    @Ignore
    @Category({IntegrationTestsCategory.class, SmokeTestsCategory.class, CategorizedTestsCategory.class})
    @Test
    public void ignoredTest() {
        System.out.println("This is the second parametrized test");
    }
}
