import bootstrap.Datatables;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class Tests {

    @Test
    public void chackValueInTable(){
        open("https://mdbootstrap.com/docs/jquery/tables/datatables/");
        boolean isValueExists = new Datatables()
                .searchValyeInColumnTable("Office", "San Francisco");

        Assert.assertTrue(isValueExists, "Expected name in not present in table");
    }
}
