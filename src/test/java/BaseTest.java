import Utility.JsonTransformer;
import Utility.RestAssuredHelper;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.ArrayList;
import java.util.Map;

import static Constants.Constants.DATA;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class BaseTest {

    JsonTransformer jsonTransformer;
    RestAssuredHelper restAssuredHelper;

    public BaseTest() {
        setUri();
        jsonTransformer = new JsonTransformer();
        restAssuredHelper = new RestAssuredHelper();
    }

    public void setUri() {
        RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";

    }

    public void AssertStatusCode(Response response, int expectedStatusCode) {
        int actualStatusCode = response.getStatusCode();
        System.out.println("Response code is " + actualStatusCode);
        assertEquals(actualStatusCode, expectedStatusCode);
    }

    public void AssertMapContent(Object object, Response response) {
        Map<?, ?> actualResponse = response.jsonPath().getJsonObject(DATA);
        System.out.println("Actual response content:" + actualResponse);

        Map<?, ?> expectedResponse = jsonTransformer.transformObjectToMap(object);
        System.out.println("Expected " + expectedResponse);

        assertTrue(actualResponse.entrySet().containsAll(expectedResponse.entrySet()));
    }

    public void AssertResponseListContent(Response response) {
        ArrayList<?> content = response.jsonPath().getJsonObject(DATA);
        int contentSize = content.size();

        System.out.println("Response content has " + contentSize + " items:" + "\n" + content.toString());

        assertTrue(contentSize > 1);
    }

    public String getDeleteContentResponse(Response response) {
        String responseContent = response.jsonPath().get().toString();
        System.out.println(responseContent);
        return responseContent;
    }
}
