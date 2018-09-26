package com.gumingyu.common.utilities;

import lombok.extern.slf4j.Slf4j;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期工具类
 */
@Slf4j
public final class DateUtil {

    /**
     * 空构造函数
     */
    private DateUtil() {}

    /**
     * @param date 日期
     * @return yyyy-MM-dd
     */
    public static String formatDate(Date date) {
        if (date == null) {
            DateUtil.log.warn("date is null");
            return null;
        }

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        return df.format(date);
    }

}
