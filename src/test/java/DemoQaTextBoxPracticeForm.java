import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class DemoQaTextBoxPracticeForm {
    @BeforeAll
    static void beforeall(){
        Configuration.browserSize = "1450x700";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";

        @Test
                void fillFormTest() {
            open("/automation-practice-form");
        }
}
