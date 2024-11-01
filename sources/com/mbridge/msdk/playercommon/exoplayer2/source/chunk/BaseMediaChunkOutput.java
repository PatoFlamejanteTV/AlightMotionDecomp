package com.mbridge.msdk.playercommon.exoplayer2.source.chunk;

import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.DummyTrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.source.SampleQueue;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkExtractorWrapper;

/* loaded from: classes4.dex */
public final class BaseMediaChunkOutput implements ChunkExtractorWrapper.TrackOutputProvider {
    private static final String TAG = "BaseMediaChunkOutput";
    private final SampleQueue[] sampleQueues;
    private final int[] trackTypes;

    public BaseMediaChunkOutput(int[] iArr, SampleQueue[] sampleQueueArr) {
        this.trackTypes = iArr;
        this.sampleQueues = sampleQueueArr;
    }

    public final int[] getWriteIndices() {
        int[] iArr = new int[this.sampleQueues.length];
        int i8 = 0;
        while (true) {
            SampleQueue[] sampleQueueArr = this.sampleQueues;
            if (i8 < sampleQueueArr.length) {
                SampleQueue sampleQueue = sampleQueueArr[i8];
                if (sampleQueue != null) {
                    iArr[i8] = sampleQueue.getWriteIndex();
                }
                i8++;
            } else {
                return iArr;
            }
        }
    }

    public final void setSampleOffsetUs(long j8) {
        for (SampleQueue sampleQueue : this.sampleQueues) {
            if (sampleQueue != null) {
                sampleQueue.setSampleOffsetUs(j8);
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkExtractorWrapper.TrackOutputProvider
    public final TrackOutput track(int i8, int i9) {
        int i10 = 0;
        while (true) {
            int[] iArr = this.trackTypes;
            if (i10 < iArr.length) {
                if (i9 == iArr[i10]) {
                    return this.sampleQueues[i10];
                }
                i10++;
            } else {
                Log.e(TAG, "Unmatched track of type: " + i9);
                return new DummyTrackOutput();
            }
        }
    }
}
