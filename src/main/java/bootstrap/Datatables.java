package bootstrap;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$$x;

public class Datatables {

    public boolean searchValyeInColumnTable(String columnName, String value){
        int columnNumber = getAllColumn(columnName);
        // $$x(".//*[@id='dtBasicExample']/tbody/tr").get(0).$$x("td").get(0).text()
        ElementsCollection columnValues = $$x(".//*[@id='dtBasicExample']/tbody/tr"); ///td["+ columnNumber +"]");

        List<String> columnValues = columnValues.forEach(x -> x.);
        return columnValues.texts().contains(value);

    }

    public int getAllColumn(String columnName){
        return $$("#dtBasicExample .th-sm").texts().indexOf(columnName) + 1;
    }

}
