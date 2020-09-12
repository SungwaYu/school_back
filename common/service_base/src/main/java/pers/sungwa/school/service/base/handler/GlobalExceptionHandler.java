package pers.sungwa.school.service.base.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.sungwa.school.common.base.result.R;
import pers.sungwa.school.common.base.result.ResultCodeEnum;
import pers.sungwa.school.common.base.util.ExceptionUtils;

/**
 * @author sungwa
 * @date 9/12/2020
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public R error(Exception e){
//        e.printStackTrace();
        log.error(ExceptionUtils.getMessage(e));
        return R.error();
    }

    @ExceptionHandler(BadSqlGrammarException.class)
    @ResponseBody
    public R error(BadSqlGrammarException e){
        log.error(ExceptionUtils.getMessage(e));
        return R.setResult(ResultCodeEnum.BAD_SQL_GRAMMAR);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    @ResponseBody
    public R error(HttpMessageNotReadableException e){
        log.error(ExceptionUtils.getMessage(e));
        return R.setResult(ResultCodeEnum.JSON_PARSE_ERROR);
    }
}