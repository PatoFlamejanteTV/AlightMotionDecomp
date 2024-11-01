package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import java.io.IOException;

/* loaded from: classes4.dex */
public final class DataSourceException extends IOException {
    public static final int POSITION_OUT_OF_RANGE = 0;
    public final int reason;

    public DataSourceException(int i8) {
        this.reason = i8;
    }
}
