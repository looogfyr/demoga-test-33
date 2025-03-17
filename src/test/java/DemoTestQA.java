
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class DemoTestQA {
   @BeforeAll
   static void beforeall(){
       Configuration.browserSize = "1600x900";
       Configuration.baseUrl = "https://demoqa.com";
       Configuration.pageLoadStrategy = "eager";
   }

    @Test
    void fiilFormTest() {

        open("/text-box");
        $("#userName").setValue("Alexey");
        $("#userEmail").setValue("AlexGG@BBC.com");
        $("#currentAddress").setValue("Great Beketov Street");
        $("#permanentAddress").setValue("Big Gtreat Beketov Street");
        $("#submit").click();
        sleep(3000);

        $("#output #name").shouldHave(text("Alexey"));
        $("#output #email").shouldHave(text("AlexGG@BBC.com"));
        $("#output #currentAddress").shouldHave(text("Great Beketov Street"));
        $("#output #permanentAddress").shouldHave(text("Big Gtreat Beketov Street"));

    }
}


