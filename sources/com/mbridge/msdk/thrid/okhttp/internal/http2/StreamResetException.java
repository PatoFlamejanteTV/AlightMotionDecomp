package com.mbridge.msdk.thrid.okhttp.internal.http2;

import java.io.IOException;

/* loaded from: classes4.dex */
public final class StreamResetException extends IOException {
    public final ErrorCode errorCode;

    public StreamResetException(ErrorCode errorCode) {
        super("stream was reset: " + errorCode);
        this.errorCode = errorCode;
    }
}
