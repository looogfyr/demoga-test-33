import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class DemoQaTextBoxPracticeForm {
    @BeforeAll
    static void beforeall() {
        Configuration.browserSize = "1450x700";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void fillPracticeForm() {

        open("/automation-practice-form");
        $("#firstName").setValue("Alexey");

        $("#lastName").setValue("Dubinin");

        $("#userEmail").setValue("Alexey@gmail.com");

        $("[for = gender-radio-1]").click();

        $("#userNumber").setValue("6061201200");

        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("January");
        $(".react-datepicker__year-select").selectOption("2000");
        $(".react-datepicker__day--001").click();

        $(".subjects-auto-complete__value-container--is-multi").click();
        $("#subjectsInput").setValue("C");
        $("input#subjectsInput").setValue("Computer Science").pressEnter();

        $("[for = hobbies-checkbox-1]").click();
        $("[for = hobbies-checkbox-3]").click();

        $("#uploadPicture").uploadFromClasspath("gomer.png");
        $("#currentAddress").setValue("Chita, st.Beketov 25, kv.28");

        $("#react-select-3-input").setValue("R");
        $("#react-select-3-option-3").click();
        $("#react-select-4-input").setValue("J");
        $("#react-select-4-option-1").click();

        $("#submit").click();

        $("div.modal-content table.table-dark").$(byText("Student Name")).parent().shouldHave(text("Alexey Dubinin"));

        $("div.modal-content table.table-dark").$(byText("Student Email")).parent().shouldHave(text("Alexey@gmail.com"));

        $("div.modal-content table.table-dark").$(byText("Gender")).parent().shouldHave(text("Male"));

        $("div.modal-content table.table-dark").$(byText("Mobile")).parent().shouldHave(text("6061201200"));

        $("div.modal-content table.table-dark").$(byText("Date of Birth")).parent().shouldHave(text("01 January,2000"));

        $("div.modal-content table.table-dark").$(byText("Date of Birth")).parent().shouldHave(text("01 January,2000"));

        $("div.modal-content table.table-dark").$(byText("Subjects")).parent().shouldHave(text("Computer Science"));

        $("div.modal-content table.table-dark").$(byText("Hobbies")).parent().shouldHave(text("Sports, Music"));

        $("div.modal-content table.table-dark").$(byText("Picture")).parent().shouldHave(text("gomer.png"));

        $("div.modal-content table.table-dark").$(byText("Address")).parent().shouldHave(text("Chita, st.Beketov 25, kv.28"));

        $("div.modal-content table.table-dark").$(byText("State and City")).parent().shouldHave(text("Rajasthan Jaiselmer"));

        sleep(10000);
    }
}


