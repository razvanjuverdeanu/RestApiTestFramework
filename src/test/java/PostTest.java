import Constants.RequestMethod;
import Constants.Constants;
import Constants.StatusCodeConstants;
import Model.PostPutEmployee;
import io.restassured.response.Response;
import org.junit.Test;

import static Constants.Constants.CREATE_PATH;

public class PostTest extends BaseTest {
    @Test
    public void testPostEmployee() {
        PostPutEmployee employee = new PostPutEmployee(Constants.CREATE_NAME, Constants.CREATE_SALARY, Constants.CREATE_AGE);
        String employeeAsString = jsonTransformer.transformObjectToJson(employee);

        Response response = restAssuredHelper.SelectMethodAndSendRequest(RequestMethod.POST, CREATE_PATH, employeeAsString);

        AssertStatusCode(response, StatusCodeConstants.OK);
        AssertMapContent(employee, response);
    }
}
