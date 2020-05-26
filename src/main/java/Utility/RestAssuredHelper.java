package Utility;


import Constants.RequestMethod;
import Constants.RestAssuredConstants;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredHelper {

    public Response SelectMethodAndSendRequest(RequestMethod requestMethod, String url, String modelAsString) {

        Response response = null;

        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.header(RestAssuredConstants.CONTENT_TYPE, RestAssuredConstants.APPLICATION_JSON);


        if (modelAsString != null) {
            requestSpecification.body(modelAsString);
        }

        switch (requestMethod) {
            case GET:
                response = requestSpecification.get(url);
                break;

            case DELETE:
                response = requestSpecification.delete(url);
                break;

            case POST:
                response = requestSpecification.post(url);
                break;

            case PUT:
                response = requestSpecification.put(url);
                break;

            default:
                throw new UnsupportedOperationException("Request type not supported");
        }

        return response;
    }


}
