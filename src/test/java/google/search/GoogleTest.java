package google.search;

import com.codeborne.selenide.*;
import org.junit.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;

public class GoogleTest {

    @Test
    public void userCanSearch(){
        open("http://google.com");
        $(By.name("q")).setValue("Selenide").pressEnter();
        $$(By.xpath("//*[@id = 'ires']//*[@class='g']")).shouldHave(CollectionCondition.size(10));
        $(By.xpath("//*[@id = 'ires']//*[@class='g']")).shouldHave(Condition.text("Selenide: лаконичные и стабильные UI тесты на Java"));
    }
}
