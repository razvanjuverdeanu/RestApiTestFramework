import Constants.RequestMethod;
import Constants.StatusCodeConstants;
import Model.Employee;
import io.restassured.response.Response;
import org.junit.Test;

public class GetTest extends BaseTest {
    @Test
    public void testGetEmployee() {
        Response response = restAssuredHelper.SelectMethodAndSendRequest(RequestMethod.GET, "/employee/112346", null);
        AssertStatusCode(response, StatusCodeConstants.OK);

        Employee employee = new Employee("", "JustANormalUserCreated", "100", "112346", "21");
        AssertMapContent(employee, response);
    }

    @Test
    public void testGetAllEmployees() {
        Response response = restAssuredHelper.SelectMethodAndSendRequest(RequestMethod.GET, "/employees", null);
        AssertStatusCode(response, StatusCodeConstants.OK);

        AssertResponseListContent(response);
    }
}
