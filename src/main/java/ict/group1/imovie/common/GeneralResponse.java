package ict.group1.imovie.common;

import ict.group1.imovie.common.constant.HttpStatusConstant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GeneralResponse<T> implements Serializable {

    private String code;
    private String message;
    private T data;

    public static GeneralResponse<?> ok(Object data) {
        return GeneralResponse.builder().code(HttpStatusConstant.SUCCESS_CODE).message(HttpStatusConstant.SUCCESS_MESSAGE).data(data).build();
    }

    public static GeneralResponse<?> error(String code, String message) {
        return GeneralResponse.builder().code(code).message(message).build();
    }

    public static GeneralResponse<?> buildAll(String code, String message, Object data) {
        return GeneralResponse.builder().code(code).message(message).data(data).build();
    }
}
