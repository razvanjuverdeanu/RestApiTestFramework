import Constants.RequestMethod;
import Constants.StatusCodeConstants;
import io.restassured.response.Response;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class DeleteTest extends BaseTest {

    private String expectedDeleteResponse = "deleted Records";

    @Test
    public void deleteEmployee() {
        Response response = restAssuredHelper.SelectMethodAndSendRequest(RequestMethod.DELETE, "/delete/110832", null);
        AssertStatusCode(response, StatusCodeConstants.OK);

        String deleteResponse = getDeleteContentResponse(response);
        assertTrue(deleteResponse.contains(expectedDeleteResponse));
    }

}
