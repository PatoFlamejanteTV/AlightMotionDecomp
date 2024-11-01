package com.mbridge.msdk.playercommon.exoplayer2.drm;

/* loaded from: classes4.dex */
public final class UnsupportedDrmException extends Exception {
    public static final int REASON_INSTANTIATION_ERROR = 2;
    public static final int REASON_UNSUPPORTED_SCHEME = 1;
    public final int reason;

    /* loaded from: classes4.dex */
    public @interface Reason {
    }

    public UnsupportedDrmException(int i8) {
        this.reason = i8;
    }

    public UnsupportedDrmException(int i8, Exception exc) {
        super(exc);
        this.reason = i8;
    }
}
