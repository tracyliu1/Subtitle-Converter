package com.sri.subtitlessupport.utils;

/**
 * Created by DELL on 2018/1/8.
 */
class Utils {

    public static String getLangEncoding(String language) {
        String lang = language.toLowerCase();

        if (lang.equals("korean") ||
                lang.equals("japanese") ||
                lang.equals("vietnamese") ||
                lang.equals("hindi") ||
                lang.equals("thai")
                ) {
            return "utf-8";
        } else if (lang.equals("russian") ||
                lang.equals("ukrainian")) {
            return "iso-8859-5";
        } else if (lang.equals("arabic")) {
            return "Windows-1256";
        } else if (lang.equals("hebrew")) {
            return "iso-8859-8";
        } else if (lang.equals("chinese")) {
            return "GB2312";
        } else
            return "ISO-8859-1";
    }
}
