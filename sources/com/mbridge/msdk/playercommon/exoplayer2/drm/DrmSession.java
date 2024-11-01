package com.mbridge.msdk.playercommon.exoplayer2.drm;

import com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaCrypto;
import java.util.Map;

/* loaded from: classes4.dex */
public interface DrmSession<T extends ExoMediaCrypto> {
    public static final int STATE_ERROR = 1;
    public static final int STATE_OPENED = 3;
    public static final int STATE_OPENED_WITH_KEYS = 4;
    public static final int STATE_OPENING = 2;
    public static final int STATE_RELEASED = 0;

    /* loaded from: classes4.dex */
    public static class DrmSessionException extends Exception {
        public DrmSessionException(Throwable th) {
            super(th);
        }
    }

    /* loaded from: classes4.dex */
    public @interface State {
    }

    DrmSessionException getError();

    T getMediaCrypto();

    byte[] getOfflineLicenseKeySetId();

    int getState();

    Map<String, String> queryKeyStatus();
}
