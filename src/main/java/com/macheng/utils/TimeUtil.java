package com.macheng.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :TimeUtil
 * @date ：2023/5/8 12:00
 * @description：TODO
 */
public class TimeUtil {
    public static String getCurrentTime(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
        String lastLogin = simpleDateFormat.format(date).toString();
        return lastLogin;
    }
}
