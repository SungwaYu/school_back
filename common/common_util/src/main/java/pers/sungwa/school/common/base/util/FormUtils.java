package pers.sungwa.school.common.base.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author sungwa
 * @date 9/12/2020
 */
public class FormUtils {

    /**
     * 手机号验证
     */
    public static boolean isMobile(String str) {
        Pattern p = Pattern.compile("^[1][3,4,5,7,8,9][0-9]{9}$"); // 验证手机号
        Matcher m = p.matcher(str);
        return m.matches();
    }

}