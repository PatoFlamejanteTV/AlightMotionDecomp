package com.mbridge.msdk.playercommon.exoplayer2.drm;

import android.media.MediaCrypto;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;

/* loaded from: classes4.dex */
public final class FrameworkMediaCrypto implements ExoMediaCrypto {
    private final boolean forceAllowInsecureDecoderComponents;
    private final MediaCrypto mediaCrypto;

    public FrameworkMediaCrypto(MediaCrypto mediaCrypto) {
        this(mediaCrypto, false);
    }

    public final MediaCrypto getWrappedMediaCrypto() {
        return this.mediaCrypto;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaCrypto
    public final boolean requiresSecureDecoderComponent(String str) {
        if (!this.forceAllowInsecureDecoderComponents && this.mediaCrypto.requiresSecureDecoderComponent(str)) {
            return true;
        }
        return false;
    }

    public FrameworkMediaCrypto(MediaCrypto mediaCrypto, boolean z8) {
        this.mediaCrypto = (MediaCrypto) Assertions.checkNotNull(mediaCrypto);
        this.forceAllowInsecureDecoderComponents = z8;
    }
}
