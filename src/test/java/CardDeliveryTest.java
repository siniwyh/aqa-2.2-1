import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

class CardDeliveryTest {
    @Test
    void shouldSendForm() {
        open("http://localhost:9999/");
        $("[data-test-id=city] input").setValue("Москва");
        $(".calendar-input__custom-control input").setValue("25072024");
        $("[data-test-id=name] input").setValue("Биба Бобов");
        $("[name='phone']").setValue("+79998887766");
        $(".checkbox__text").click();
        $(".button__content").click();
        $(".notification_visible").shouldBe(exist, Duration.ofSeconds(20));
    }


}
