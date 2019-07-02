package bootstrap;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$$x;

public class Datatables {

    public boolean searchValyeInColumnTable(String columnName, String value){
        int columnNumber = getAllColumn(columnName);
        // $$x(".//*[@id='dtBasicExample']/tbody/tr").get(0).$$x("td").get(0).text()
        ElementsCollection columnValuesColl = $$x(".//*[@id='dtBasicExample']/tbody/tr"); ///td["+ columnNumber +"]");
        List<String> valuesList = new ArrayList<>();
        for (SelenideElement element : columnValuesColl ) {
            valuesList.add(element.$$x("td").get(columnNumber).text());
        }

//        List<SelenideElement> tr = columnValuesColl.forEach(row -> row.$$x("td"));
//        return columnValues.texts().contains(value);
        return true;

    }

    public int getAllColumn(String columnName){
        return $$("#dtBasicExample .th-sm").texts().indexOf(columnName) + 1;
    }

}
