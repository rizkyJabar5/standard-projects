package com.wira.sasangka.standardprojects.constant;

public final class SecurityConst {
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String TOKEN_CREATED_SUCCESS = "Token created successfully as {}.";
    public static final String REFRESH_TOKEN_CREATED_SUCCESS = "Refresh token created successfully as {}.";
    public static final long ACCESS_TOKEN_EXPIRATION_TIME_MS = 3_600_000;
    public static final long REFRESH_TOKEN_EXPIRATION_TIME_MS = 86_400_000;
    private SecurityConst() {
    }
}
