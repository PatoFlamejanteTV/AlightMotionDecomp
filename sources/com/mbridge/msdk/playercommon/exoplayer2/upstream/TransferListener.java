package com.mbridge.msdk.playercommon.exoplayer2.upstream;

/* loaded from: classes4.dex */
public interface TransferListener<S> {
    void onBytesTransferred(S s8, int i8);

    void onTransferEnd(S s8);

    void onTransferStart(S s8, DataSpec dataSpec);
}
