import Constants.RequestMethod;
import Constants.Constants;
import Constants.StatusCodeConstants;
import Model.PostPutEmployee;
import io.restassured.response.Response;
import org.junit.Test;

public class PostTest extends BaseTest {
    @Test
    public void testPostEmployee() {
        PostPutEmployee employee = new PostPutEmployee(Constants.CREATE_NAME, Constants.CREATE_SALARY, Constants.CREATE_AGE);
        String employeeAsString = jsonTransformer.transformObjectToJson(employee);

        Response response = restAssuredHelper.SelectMethodAndSendRequest(RequestMethod.POST, "/create", employeeAsString);

        AssertStatusCode(response, StatusCodeConstants.OK);
        AssertMapContent(employee, response);
    }
}
