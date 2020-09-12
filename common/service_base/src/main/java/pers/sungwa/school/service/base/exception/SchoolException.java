package pers.sungwa.school.service.base.exception;

import lombok.Data;
import pers.sungwa.school.common.base.result.ResultCodeEnum;

/**
 * @author sungwa
 * @date 9/12/2020
 */
@Data
public class SchoolException extends RuntimeException{

    private Integer code;

    public SchoolException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public SchoolException(ResultCodeEnum resultCodeEnum) {
        super(resultCodeEnum.getMessage());
        this.code = resultCodeEnum.getCode();
    }

    @Override
    public String toString() {
        return "GuliException{" +
                "code=" + code +
                ", message=" + this.getMessage() +
                '}';
    }
}
