package bootstrap;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$$x;

public class Datatables {

    private String tableHeaderLoc = "#dtBasicExample .th-sm";
    private String tableRowLoc = ".//*[@id='dtBasicExample']/tbody/tr";

    public boolean searchForValueInColumnTable(String columnName, String value) {
        int columnNumber = getAllColumn(columnName);
        return isValuePresent(columnNumber, value);
        // $$x(".//*[@id='dtBasicExample']/tbody/tr").get(0).$$x("td").get(0).text()
    }

    private int getAllColumn(String columnName) {
        return $$(tableHeaderLoc).texts().indexOf(columnName);
    }

    private boolean isValuePresent(int columnNumber, String value) {
        ElementsCollection columnValuesColl = $$x(tableRowLoc); ///td["+ columnNumber +"]");
        List<String> valuesList = new ArrayList<>();

        for (SelenideElement element : columnValuesColl) {
            valuesList.add(element.$$x("td").get(columnNumber).text());
        }
        return valuesList.contains(value);
    }

}
