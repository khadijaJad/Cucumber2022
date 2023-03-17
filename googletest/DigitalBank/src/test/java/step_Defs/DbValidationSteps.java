package step_Defs;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import utilities.ConfigReader;
import utilities.Constant;
import utilities.DatabaseUtils;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DbValidationSteps {

    @Then("^verify all details updated in database$")
    public void verify_all_details_updated_in_database() throws SQLException {
        String email= Constant.inputDataOnUi.get("email");
        String query = ConfigReader.getProperties("fetch.userdata");
        query=String.format(query,email);//will replace %s on the query by email
        ResultSet rs = DatabaseUtils.executeQuery(query);
       // while(rs.next()){} we use this if we know that there will be many rows, in our case we have one row
        rs.next(); //but we have to use it one time because by default the cursor is pointing in the colum names row

        Constant.dataFromDB.put("email", rs.getString("email_address"));
        Constant.dataFromDB.put("title", rs.getString("email_address"));
        Constant.dataFromDB.put("firstName", rs.getString("first_name"));
        Constant.dataFromDB.put("lastName", rs.getString("last_name"));
        Constant.dataFromDB.put("gender", rs.getString("gender"));
        Constant.dataFromDB.put("dob", rs.getString("dob"));
        Constant.dataFromDB.put("ssn", rs.getString("ssn").replace("-",""));
        System.out.println("Data entered in Ui  - "+Constant.inputDataOnUi);
        System.out.println("Data from DB  - "+Constant.dataFromDB);

        Assert.assertTrue("Data from Ui is not matching Data from database",Constant.dataFromDB.equals(Constant.inputDataOnUi));
        }

    }


