import Constants.RequestMethod;
import Constants.StatusCodeConstants;
import Model.Employee;
import io.restassured.response.Response;
import org.junit.Test;

import static Constants.Constants.*;


public class GetTest extends BaseTest {

    private final String name = "Tiger Nixon";
    private final String salary = "320800";
    private final String id = "1";
    private final String age = "61";

    @Test
    public void testGetEmployee() {
        Response response = restAssuredHelper.SelectMethodAndSendRequest(RequestMethod.GET, EMPLOYEE_ID_PATH, null);
        AssertStatusCode(response, StatusCodeConstants.OK);

        Employee employee = new Employee("", name, salary, id, age);
        AssertMapContent(employee, response);
    }

    @Test
    public void testGetAllEmployees() {
        Response response = restAssuredHelper.SelectMethodAndSendRequest(RequestMethod.GET, EMPLOYEES_PATH, null);
        AssertStatusCode(response, StatusCodeConstants.OK);

        AssertResponseListContent(response);
    }
}
