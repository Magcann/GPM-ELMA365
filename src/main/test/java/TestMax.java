import com.codeborne.selenide.Selenide;
        import org.openqa.selenium.By;
        import org.testng.annotations.Test;

        import static com.codeborne.selenide.Condition.enabled;
        import static com.codeborne.selenide.Selectors.*;
        import static com.codeborne.selenide.Selectors.byXpath;
        import static com.codeborne.selenide.Selenide.$;
        import static com.codeborne.selenide.Selenide.open;
        import static java.time.Duration.ofSeconds;
        import static org.testng.AssertJUnit.assertTrue;

        public class TestMax extends BaseTest {



        @Test
        public void test() {

        open("http://elmadev.gazprom-media.ru");
//Это блок авторизации
        $(byName("authLogin")).click();
        $(byName("authLogin")).setValue("m.magnichkin");
        $(byName("password")).click();
        $(byName("password")).setValue("uW2vHCxhnbwWKwL");
        $(By.cssSelector(".submit-button")).click();


//выполняем навигацию на меню НСИ
        $(byText("НСИ")).shouldBe(enabled,ofSeconds(5));
        $(byText("НСИ")).click();
//выполняем навигацию на меню Бренд
        $(byText("Бренд")).shouldBe(enabled,ofSeconds(5));
        $(byText("Бренд")).click();
//Нажимаем на кнопку + Бренд
        $(byText("+ Бренд")).shouldBe(enabled,ofSeconds(5));
        $(byText("+ Бренд")).click();



        //Вводим наименование Бренда
        $(byXpath("//elma-form-control/elma-type-string/div/input")).sendKeys("auto_test_a6"); // воткнуть переменную на имя бренд
//Выбор из справочника рекламодателей
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Рекламодатель'])[1]/following::button[1]")).click();
// Выбираем из справочника  бренд
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Тест отмены бренда 3'])[1]/preceding::span[8]")).shouldBe(enabled,ofSeconds(5));
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Тест отмены бренда 3'])[1]/preceding::span[8]")).click();

// Заполняем поле 'Сегмент SMA'
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Сегмент SMA'])[1]/following::button[1]")).shouldBe(enabled,ofSeconds(5));
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Сегмент SMA'])[1]/following::button[1]")).click();
// Выбираем из справочника 'Сегмент SMA'
        $(byText("Жевательная конфета")).shouldBe(enabled,ofSeconds(5));
        $(byText("Жевательная конфета")).click();
// Нажимаем сохранить
        $(byXpath("//*/text()[normalize-space(.)='Сохранить']/parent::*")).shouldBe(enabled,ofSeconds(5)).click();
//Ждем 5 секунд м нажимаем на созданный элемент
        $(byText("auto_test_a6")).shouldBe(enabled,ofSeconds(5));
        $(byText("auto_test_a6")).click();
        //$(byText(";ждаТь")).shouldBe(enabled,ofSeconds(15));





        }
                @Test
                public void test2() {

                        open("http://elmadev.gazprom-media.ru");
//Это блок авторизации
                       // $(byName("authLogin")).click();
                       // $(byName("authLogin")).setValue("m.magnichkin");
                       // $(byName("password")).click();
                       // $(byName("password")).setValue("uW2vHCxhnbwWKwL");
                       // $(By.cssSelector(".submit-button")).click();


//выполняем навигацию на меню НСИ
                        $(byText("НСИ")).shouldBe(enabled,ofSeconds(5));
                        $(byText("НСИ")).click();
//выполняем навигацию на меню Бренд
                        $(byText("Бренд")).shouldBe(enabled,ofSeconds(5));
                        $(byText("Бренд")).click();
//Нажимаем на кнопку + Бренд
                        $(byText("+ Бренд")).shouldBe(enabled,ofSeconds(5));
                        $(byText("+ Бренд")).click();



                        //Вводим наименование Бренда
                        $(byXpath("//elma-form-control/elma-type-string/div/input")).sendKeys("auto_test_12345654"); // воткнуть переменную на имя бренд
//Выбор из справочника рекламодателей
                        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Рекламодатель'])[1]/following::button[1]")).click();
// Выбираем из справочника  бренд
                        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Тест отмены бренда 3'])[1]/preceding::span[8]")).shouldBe(enabled,ofSeconds(5));
                        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Тест отмены бренда 3'])[1]/preceding::span[8]")).click();

// Заполняем поле 'Сегмент SMA'
                        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Сегмент SMA'])[1]/following::button[1]")).shouldBe(enabled,ofSeconds(5));
                        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Сегмент SMA'])[1]/following::button[1]")).click();
// Выбираем из справочника 'Сегмент SMA'
                        $(byText("Жевательная конфета")).shouldBe(enabled,ofSeconds(5));
                        $(byText("Жевательная конфета")).click();
// Нажимаем сохранить
                        $(byXpath("//*/text()[normalize-space(.)='Сохранить']/parent::*")).shouldBe(enabled,ofSeconds(25)).click();
//Ждем 5 секунд м нажимаем на созданный элемент
                        $(byText("auto_test_12345654")).shouldBe(enabled,ofSeconds(5));

                        $(byText("auo_test_123456_a")).click();
                        //$(byText(";ждаТь")).shouldBe(enabled,ofSeconds(25));



                }
        }