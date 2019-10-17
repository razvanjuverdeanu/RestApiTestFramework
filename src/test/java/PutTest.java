import Constants.RequestMethod;
import Constants.Constants;
import Constants.StatusCodeConstants;
import Model.PostPutEmployee;
import io.restassured.response.Response;
import org.junit.Test;

public class PutTest extends BaseTest {

    @Test
    public void TestPutEmployee() {

        PostPutEmployee employee = new PostPutEmployee(Constants.UPDATE_NAME, Constants.UPDATE_SALARY, Constants.UPDATE_AGE);
        String employeeAsString = jsonTransformer.transformObjectToJson(employee);

        Response response = restAssuredHelper.SelectMethodAndSendRequest(RequestMethod.PUT, "/update/1", employeeAsString);
        AssertStatusCode(response, StatusCodeConstants.OK);
        AssertMapContent(employee, response);
    }
}
