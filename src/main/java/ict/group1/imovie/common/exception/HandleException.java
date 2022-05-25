package ict.group1.imovie.common.exception;


import ict.group1.imovie.common.constant.HttpStatusConstant;
import ict.group1.imovie.common.dto.GeneralResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLException;
import java.util.Arrays;

@RestControllerAdvice
@Slf4j
public class HandleException {

    @ExceptionHandler(BusinessException.class)
    public GeneralResponse<?> handleBusinessException(BusinessException ex) {
        return GeneralResponse.error(ex.getCode(), ex.getMessage());
    }

    @ExceptionHandler(UsernameNotFoundException.class)
    public GeneralResponse<?> handleUsernameNotFoundException(UsernameNotFoundException ex) {
        return GeneralResponse.error(HttpStatusConstant.USERNAME_NOT_EXIST_CODE, HttpStatusConstant.USERNAME_NOT_EXIST_MESSAGE);
    }

    @ExceptionHandler({NullPointerException.class})
    public GeneralResponse<?> handleNullPointerException(NullPointerException nullPointerException) {
        log.error("NullPointerException => rootCause: {}", Arrays.stream(nullPointerException.getStackTrace()).findFirst());
        log.error("NullPointerException => message: {}", nullPointerException.getMessage());
        return GeneralResponse.error(HttpStatusConstant.NULL_POINTER_OR_BAD_REQUEST_CODE, HttpStatusConstant.NULL_POINTER_OR_BAD_REQUEST_MESSAGE);
    }

    @ExceptionHandler({SQLException.class})
    public GeneralResponse<?> handleSQLException(SQLException ex) {
        log.error("SQLException => rootCause: {}", Arrays.stream(ex.getStackTrace()).findFirst());
        log.error("SQLException => message: {}", ex.getMessage());
        return GeneralResponse.error(HttpStatusConstant.SQL_CONNECTION_ERROR_CODE, HttpStatusConstant.SQL_CONNECTION_ERROR_MESSAGE);

    }

    @ExceptionHandler(Exception.class)
    public GeneralResponse<?> handleException(Exception ex) {
        log.error("Exception => rootCause: {}", Arrays.stream(ex.getStackTrace()).findFirst());
        log.error("Exception => message: {}", ex.getMessage());
        return GeneralResponse.error(HttpStatusConstant.UNAVAILABLE_CODE, HttpStatusConstant.UNAVAILABLE_MESSAGE);
    }
}
