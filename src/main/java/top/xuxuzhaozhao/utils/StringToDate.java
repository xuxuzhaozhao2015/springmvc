package top.xuxuzhaozhao.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 自定义日期转换
 * 2000-10-10
 */
public class StringToDate implements Converter<String, Date> {

    @Override
    public Date convert(String s) {
        if (s == null) {
            throw new RuntimeException("无数据");
        }

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        try {
            return df.parse(s);
        } catch (ParseException e) {
            throw new RuntimeException("日期转换异常。");
        }
    }
}
