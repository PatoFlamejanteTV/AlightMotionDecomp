package com.mbridge.msdk.playercommon.exoplayer2.source;

import android.os.Handler;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlayer;
import com.mbridge.msdk.playercommon.exoplayer2.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.Allocator;
import java.io.IOException;

/* loaded from: classes4.dex */
public interface MediaSource {

    /* loaded from: classes4.dex */
    public static final class MediaPeriodId {
        public final int adGroupIndex;
        public final int adIndexInAdGroup;
        public final int periodIndex;
        public final long windowSequenceNumber;

        public MediaPeriodId(int i8) {
            this(i8, -1L);
        }

        public final MediaPeriodId copyWithPeriodIndex(int i8) {
            if (this.periodIndex == i8) {
                return this;
            }
            return new MediaPeriodId(i8, this.adGroupIndex, this.adIndexInAdGroup, this.windowSequenceNumber);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || MediaPeriodId.class != obj.getClass()) {
                return false;
            }
            MediaPeriodId mediaPeriodId = (MediaPeriodId) obj;
            if (this.periodIndex == mediaPeriodId.periodIndex && this.adGroupIndex == mediaPeriodId.adGroupIndex && this.adIndexInAdGroup == mediaPeriodId.adIndexInAdGroup && this.windowSequenceNumber == mediaPeriodId.windowSequenceNumber) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return ((((((527 + this.periodIndex) * 31) + this.adGroupIndex) * 31) + this.adIndexInAdGroup) * 31) + ((int) this.windowSequenceNumber);
        }

        public final boolean isAd() {
            if (this.adGroupIndex != -1) {
                return true;
            }
            return false;
        }

        public MediaPeriodId(int i8, long j8) {
            this(i8, -1, -1, j8);
        }

        public MediaPeriodId(int i8, int i9, int i10, long j8) {
            this.periodIndex = i8;
            this.adGroupIndex = i9;
            this.adIndexInAdGroup = i10;
            this.windowSequenceNumber = j8;
        }
    }

    /* loaded from: classes4.dex */
    public interface SourceInfoRefreshListener {
        void onSourceInfoRefreshed(MediaSource mediaSource, Timeline timeline, Object obj);
    }

    void addEventListener(Handler handler, MediaSourceEventListener mediaSourceEventListener);

    MediaPeriod createPeriod(MediaPeriodId mediaPeriodId, Allocator allocator);

    void maybeThrowSourceInfoRefreshError() throws IOException;

    void prepareSource(ExoPlayer exoPlayer, boolean z8, SourceInfoRefreshListener sourceInfoRefreshListener);

    void releasePeriod(MediaPeriod mediaPeriod);

    void releaseSource(SourceInfoRefreshListener sourceInfoRefreshListener);

    void removeEventListener(MediaSourceEventListener mediaSourceEventListener);
}
