import bootstrap.Datatables;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class Tests {

    private final String COLUMN_NAME = "Office";
    private final String COLUMN_VALUE = "San Francisco";

    @Test
    public void chackValueInTable(){
        open("https://mdbootstrap.com/docs/jquery/tables/datatables/");
        boolean isValueExists = new Datatables()
                .searchForValueInColumnTable(COLUMN_NAME, COLUMN_VALUE);

        Assert.assertTrue(isValueExists, String.format("Expected value( %s ) in not present in column '%s'.", COLUMN_VALUE, COLUMN_NAME));
    }
}
