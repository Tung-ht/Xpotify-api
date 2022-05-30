package ict.group1.imovie.auth.config.exceptionhandler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import ict.group1.imovie.common.constant.HttpStatusConstant;
import ict.group1.imovie.common.dto.GeneralResponse;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RestAuthenticationEntryPoint implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        GeneralResponse<?> generalResponse = GeneralResponse.error(HttpStatusConstant.AUTHENTICATION_FAIL_CODE, HttpStatusConstant.AUTHENTICATION_FAIL_MESSAGE);
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = ow.writeValueAsString(generalResponse);
        response.setContentType("application/json");
        response.setStatus(403); // Bad credentials
        response.getOutputStream().println(json);
    }
}
