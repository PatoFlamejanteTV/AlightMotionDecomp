package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import java.io.IOException;

/* loaded from: classes4.dex */
public interface LoaderErrorThrower {

    /* loaded from: classes4.dex */
    public static final class Dummy implements LoaderErrorThrower {
        @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.LoaderErrorThrower
        public final void maybeThrowError() throws IOException {
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.LoaderErrorThrower
        public final void maybeThrowError(int i8) throws IOException {
        }
    }

    void maybeThrowError() throws IOException;

    void maybeThrowError(int i8) throws IOException;
}
