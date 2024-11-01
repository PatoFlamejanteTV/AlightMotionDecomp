package com.mbridge.msdk.playercommon.exoplayer2.upstream;

/* loaded from: classes4.dex */
public interface BandwidthMeter {

    /* loaded from: classes4.dex */
    public interface EventListener {
        void onBandwidthSample(int i8, long j8, long j9);
    }

    long getBitrateEstimate();
}
