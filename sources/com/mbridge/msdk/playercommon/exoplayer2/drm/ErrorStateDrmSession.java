package com.mbridge.msdk.playercommon.exoplayer2.drm;

import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSession;
import com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaCrypto;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.util.Map;

/* loaded from: classes4.dex */
public final class ErrorStateDrmSession<T extends ExoMediaCrypto> implements DrmSession<T> {
    private final DrmSession.DrmSessionException error;

    public ErrorStateDrmSession(DrmSession.DrmSessionException drmSessionException) {
        this.error = (DrmSession.DrmSessionException) Assertions.checkNotNull(drmSessionException);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSession
    public final DrmSession.DrmSessionException getError() {
        return this.error;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSession
    public final T getMediaCrypto() {
        return null;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSession
    public final byte[] getOfflineLicenseKeySetId() {
        return null;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSession
    public final int getState() {
        return 1;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSession
    public final Map<String, String> queryKeyStatus() {
        return null;
    }
}
