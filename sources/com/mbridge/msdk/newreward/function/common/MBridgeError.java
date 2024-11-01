package com.mbridge.msdk.newreward.function.common;

/* loaded from: classes4.dex */
public class MBridgeError extends Exception {
    public static final int ERROR_CODE_DOWNLOAD_DOWNLOAD_TIMEOUT = 4;
    public static final int ERROR_CODE_DOWNLOAD_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_DOWNLOAD_NETWORK_TIMEOUT = 3;
    public static final int ERROR_CODE_DOWNLOAD_NO_CONNECTION = 1;
    public static final int ERROR_CODE_DOWNLOAD_RESOURCE_URL_ERROR = 5;
    public static final int ERROR_CODE_DOWNLOAD_UN_ZIP_ERROR = 6;
    public static final int ERROR_CODE_UN_KNOWN = 0;
    public static final String ERROR_DOWNLOAD_MESSAGE_NO_CONNECTION = "no connection";
    public static final String ERROR_MESSAGE_DOWNLOAD_BIG_TEMPLATE_ERROR = "big template error";
    public static final String ERROR_MESSAGE_DOWNLOAD_DOWNLOAD_TIMEOUT = "download timeout";
    public static final String ERROR_MESSAGE_DOWNLOAD_EC_TEMPLATE_ERROR = "ec template error";
    public static final String ERROR_MESSAGE_DOWNLOAD_NETWORK_ERROR = "network error";
    public static final String ERROR_MESSAGE_DOWNLOAD_NETWORK_TIMEOUT = "network timeout";
    public static final String ERROR_MESSAGE_DOWNLOAD_RESOURCE_URL_ERROR = "resource url error";
    public static final String ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR = "unzip error";
    public static final String ERROR_MESSAGE_DOWNLOAD_VIDEO_ERROR = "video error";
    public static final String ERROR_MESSAGE_DOWNLOAD_VIDEO_TEMPLATE_ERROR = "video template error";
    public static final String ERROR_MESSAGE_UN_KNOWN = "unknown error";
    private final int errorCode;
    private final String errorMessage;
    private Exception exception;

    public MBridgeError(int i8, String str) {
        this.errorCode = i8;
        this.errorMessage = str;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public Exception getException() {
        return this.exception;
    }

    public void setException(Exception exc) {
        this.exception = exc;
    }
}
