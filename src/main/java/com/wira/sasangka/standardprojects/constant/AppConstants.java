package com.wira.sasangka.standardprojects.constant;

import org.slf4j.helpers.MessageFormatter;

public final class AppConstants {
    // AbstractCrudView
    public static final String CANNOT_BE_BLANK = "%s cannot be blank";
    public static final String EMAIL_OR_USERNAME_NOT_PROVIDED_MSG = "E-mail is not registered.";
    public static final String PASSWORD_MISMATCH = "Wrong oldPassword. Please try again";
    public static final String USER_NOT_FOUND_MSG = "User is not found";
    public static final String PRODUCT_NOT_FOUND_MSG = "Product is not found";

    private AppConstants() {
        throw new IllegalStateException("Utility class");
    }

    public static String messageFormat(String message, String... s) {
        return MessageFormatter.format(message, s).getMessage();
    }
}
