package ict.group1.imovie.common.constant;

public class HttpStatusConstant {
    //SUCCESS
    public final static String SUCCESS_CODE = "00000";
    public final static String SUCCESS_MESSAGE = "Successful";

    //FAILURE
    public final static String FAILURE_CODE = "11111";
    public final static String FAILURE_MESSAGE = "Failure";

    //COMMON ERROR
    public final static String UNAVAILABLE_CODE = "99999";
    public final static String UNAVAILABLE_MESSAGE = "Sorry, our service is temporarily interrupted. Please try again later";

    // SQL EXCEPTION
    public final static String SQL_CONNECTION_ERROR_CODE = "00001";
    public final static String SQL_CONNECTION_ERROR_MESSAGE = "Some thing wrong with connection of database";

    // Null pointer exception
    public final static String NULL_POINTER_OR_BAD_REQUEST_CODE = "00010";
    public final static String NULL_POINTER_OR_BAD_REQUEST_MESSAGE = "You passed wrong or blank input data!";

    //AUTH
    public final static String AUTHENTICATION_FAIL_CODE = "00020";
    public final static String AUTHENTICATION_FAIL_MESSAGE = "Username does not exist or Password is wrong!";

    public final static String UNAUTHORIZED_CODE = "00021";
    public final static String UNAUTHORIZED_MESSAGE = "You are unauthorized!";

    public final static String NOT_LOGGING_IN_CODE = "00022";
    public final static String NOT_LOGGING_IN_MESSAGE = "You are not logging in!";
}
