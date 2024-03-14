package com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.util;

import java.util.regex.Pattern;

public class Constants {

    public static final Pattern PRICE_CHECK_PATTERN = Pattern.compile("(?:0|[1-9](?:_*[0-9])*)[lL]?");
    public static final Pattern NAME_CHECK_PATTERN = Pattern.compile("^([a-zA-Z]{2,}?)");
    public static final Pattern COLOR_CHECK_PATTERN = Pattern.compile("^([a-zA-Z]{2,}?)");
    public static final Pattern SEARCH_QUERY_CHECK_PATTERN = Pattern.compile("^([a-zA-Z]{2,}?)");
    public static final String WRONG_PRICE_FORMAT_ERROR = "Wrong number format!";
    public static final String WRONG_NAME_FORMAT_ERROR = "Wrong name format!";
    public static final String WRONG_COLOR_FORMAT_ERROR = "Wrong color format!";
    public static final String WRONG_SEARCH_QUERY_FORMAT_ERROR = "Wrong query format!";
    public static final String WRONG_TITLE_ERROR = "Wrong title!";
    public static final int FIRST_INDEX = 0;
    public static final int EXTRA_INDEX = 1;
    public static final String DELIMITER = " ";
    public static final String LINE_SEPARATOR = System.lineSeparator();
    public static final String DOT_SEPARATOR = ". ";
    public static final String READ_FROM_CONSOLE_ERROR_MESSAGE =
            "Sorry, something went wrong while reading from the console ... ";
}
