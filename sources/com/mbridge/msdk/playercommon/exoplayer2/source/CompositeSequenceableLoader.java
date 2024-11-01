package com.mbridge.msdk.playercommon.exoplayer2.source;

/* loaded from: classes4.dex */
public class CompositeSequenceableLoader implements SequenceableLoader {
    protected final SequenceableLoader[] loaders;

    public CompositeSequenceableLoader(SequenceableLoader[] sequenceableLoaderArr) {
        this.loaders = sequenceableLoaderArr;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long j8) {
        boolean z8;
        boolean z9;
        boolean z10 = false;
        do {
            long nextLoadPositionUs = getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                break;
            }
            z8 = false;
            for (SequenceableLoader sequenceableLoader : this.loaders) {
                long nextLoadPositionUs2 = sequenceableLoader.getNextLoadPositionUs();
                if (nextLoadPositionUs2 != Long.MIN_VALUE && nextLoadPositionUs2 <= j8) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (nextLoadPositionUs2 == nextLoadPositionUs || z9) {
                    z8 |= sequenceableLoader.continueLoading(j8);
                }
            }
            z10 |= z8;
        } while (z8);
        return z10;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    public final long getBufferedPositionUs() {
        long j8 = Long.MAX_VALUE;
        for (SequenceableLoader sequenceableLoader : this.loaders) {
            long bufferedPositionUs = sequenceableLoader.getBufferedPositionUs();
            if (bufferedPositionUs != Long.MIN_VALUE) {
                j8 = Math.min(j8, bufferedPositionUs);
            }
        }
        if (j8 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j8;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    public final long getNextLoadPositionUs() {
        long j8 = Long.MAX_VALUE;
        for (SequenceableLoader sequenceableLoader : this.loaders) {
            long nextLoadPositionUs = sequenceableLoader.getNextLoadPositionUs();
            if (nextLoadPositionUs != Long.MIN_VALUE) {
                j8 = Math.min(j8, nextLoadPositionUs);
            }
        }
        if (j8 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j8;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    public final void reevaluateBuffer(long j8) {
        for (SequenceableLoader sequenceableLoader : this.loaders) {
            sequenceableLoader.reevaluateBuffer(j8);
        }
    }
}
