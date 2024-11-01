package com.mbridge.msdk.playercommon.exoplayer2.source;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.FormatHolder;
import com.mbridge.msdk.playercommon.exoplayer2.SeekParameters;
import com.mbridge.msdk.playercommon.exoplayer2.decoder.DecoderInputBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class ClippingMediaPeriod implements MediaPeriod, MediaPeriod.Callback {
    private MediaPeriod.Callback callback;
    long endUs;
    public final MediaPeriod mediaPeriod;
    private long pendingInitialDiscontinuityPositionUs;
    private ClippingSampleStream[] sampleStreams = new ClippingSampleStream[0];
    long startUs;

    /* loaded from: classes4.dex */
    private final class ClippingSampleStream implements SampleStream {
        public final SampleStream childStream;
        private boolean sentEos;

        public ClippingSampleStream(SampleStream sampleStream) {
            this.childStream = sampleStream;
        }

        public final void clearSentEos() {
            this.sentEos = false;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream
        public final boolean isReady() {
            if (!ClippingMediaPeriod.this.isPendingInitialDiscontinuity() && this.childStream.isReady()) {
                return true;
            }
            return false;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream
        public final void maybeThrowError() throws IOException {
            this.childStream.maybeThrowError();
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream
        public final int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, boolean z8) {
            if (ClippingMediaPeriod.this.isPendingInitialDiscontinuity()) {
                return -3;
            }
            if (this.sentEos) {
                decoderInputBuffer.setFlags(4);
                return -4;
            }
            int readData = this.childStream.readData(formatHolder, decoderInputBuffer, z8);
            if (readData == -5) {
                Format format = formatHolder.format;
                int i8 = format.encoderDelay;
                if (i8 != 0 || format.encoderPadding != 0) {
                    ClippingMediaPeriod clippingMediaPeriod = ClippingMediaPeriod.this;
                    int i9 = 0;
                    if (clippingMediaPeriod.startUs != 0) {
                        i8 = 0;
                    }
                    if (clippingMediaPeriod.endUs == Long.MIN_VALUE) {
                        i9 = format.encoderPadding;
                    }
                    formatHolder.format = format.copyWithGaplessInfo(i8, i9);
                }
                return -5;
            }
            ClippingMediaPeriod clippingMediaPeriod2 = ClippingMediaPeriod.this;
            long j8 = clippingMediaPeriod2.endUs;
            if (j8 != Long.MIN_VALUE && ((readData == -4 && decoderInputBuffer.timeUs >= j8) || (readData == -3 && clippingMediaPeriod2.getBufferedPositionUs() == Long.MIN_VALUE))) {
                decoderInputBuffer.clear();
                decoderInputBuffer.setFlags(4);
                this.sentEos = true;
                return -4;
            }
            return readData;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream
        public final int skipData(long j8) {
            if (ClippingMediaPeriod.this.isPendingInitialDiscontinuity()) {
                return -3;
            }
            return this.childStream.skipData(j8);
        }
    }

    public ClippingMediaPeriod(MediaPeriod mediaPeriod, boolean z8, long j8, long j9) {
        long j10;
        this.mediaPeriod = mediaPeriod;
        if (z8) {
            j10 = j8;
        } else {
            j10 = C.TIME_UNSET;
        }
        this.pendingInitialDiscontinuityPositionUs = j10;
        this.startUs = j8;
        this.endUs = j9;
    }

    private SeekParameters clipSeekParameters(long j8, SeekParameters seekParameters) {
        long j9;
        long constrainValue = Util.constrainValue(seekParameters.toleranceBeforeUs, 0L, j8 - this.startUs);
        long j10 = seekParameters.toleranceAfterUs;
        long j11 = this.endUs;
        if (j11 == Long.MIN_VALUE) {
            j9 = Long.MAX_VALUE;
        } else {
            j9 = j11 - j8;
        }
        long constrainValue2 = Util.constrainValue(j10, 0L, j9);
        if (constrainValue == seekParameters.toleranceBeforeUs && constrainValue2 == seekParameters.toleranceAfterUs) {
            return seekParameters;
        }
        return new SeekParameters(constrainValue, constrainValue2);
    }

    private static boolean shouldKeepInitialDiscontinuity(long j8, TrackSelection[] trackSelectionArr) {
        if (j8 != 0) {
            for (TrackSelection trackSelection : trackSelectionArr) {
                if (trackSelection != null && !MimeTypes.isAudio(trackSelection.getSelectedFormat().sampleMimeType)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod, com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    public final boolean continueLoading(long j8) {
        return this.mediaPeriod.continueLoading(j8);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public final void discardBuffer(long j8, boolean z8) {
        this.mediaPeriod.discardBuffer(j8, z8);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public final long getAdjustedSeekPositionUs(long j8, SeekParameters seekParameters) {
        long j9 = this.startUs;
        if (j8 == j9) {
            return j9;
        }
        return this.mediaPeriod.getAdjustedSeekPositionUs(j8, clipSeekParameters(j8, seekParameters));
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod, com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    public final long getBufferedPositionUs() {
        long bufferedPositionUs = this.mediaPeriod.getBufferedPositionUs();
        if (bufferedPositionUs != Long.MIN_VALUE) {
            long j8 = this.endUs;
            if (j8 == Long.MIN_VALUE || bufferedPositionUs < j8) {
                return bufferedPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod, com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    public final long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.mediaPeriod.getNextLoadPositionUs();
        if (nextLoadPositionUs != Long.MIN_VALUE) {
            long j8 = this.endUs;
            if (j8 == Long.MIN_VALUE || nextLoadPositionUs < j8) {
                return nextLoadPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public final TrackGroupArray getTrackGroups() {
        return this.mediaPeriod.getTrackGroups();
    }

    final boolean isPendingInitialDiscontinuity() {
        if (this.pendingInitialDiscontinuityPositionUs != C.TIME_UNSET) {
            return true;
        }
        return false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public final void maybeThrowPrepareError() throws IOException {
        this.mediaPeriod.maybeThrowPrepareError();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod.Callback
    public final void onPrepared(MediaPeriod mediaPeriod) {
        this.callback.onPrepared(this);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public final void prepare(MediaPeriod.Callback callback, long j8) {
        this.callback = callback;
        this.mediaPeriod.prepare(this, j8);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public final long readDiscontinuity() {
        boolean z8;
        if (isPendingInitialDiscontinuity()) {
            long j8 = this.pendingInitialDiscontinuityPositionUs;
            this.pendingInitialDiscontinuityPositionUs = C.TIME_UNSET;
            long readDiscontinuity = readDiscontinuity();
            if (readDiscontinuity != C.TIME_UNSET) {
                return readDiscontinuity;
            }
            return j8;
        }
        long readDiscontinuity2 = this.mediaPeriod.readDiscontinuity();
        if (readDiscontinuity2 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        boolean z9 = false;
        if (readDiscontinuity2 >= this.startUs) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkState(z8);
        long j9 = this.endUs;
        if (j9 == Long.MIN_VALUE || readDiscontinuity2 <= j9) {
            z9 = true;
        }
        Assertions.checkState(z9);
        return readDiscontinuity2;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod, com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    public final void reevaluateBuffer(long j8) {
        this.mediaPeriod.reevaluateBuffer(j8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:            if (r0 > r7) goto L17;     */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long seekToUs(long r7) {
        /*
            r6 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.pendingInitialDiscontinuityPositionUs = r0
            com.mbridge.msdk.playercommon.exoplayer2.source.ClippingMediaPeriod$ClippingSampleStream[] r0 = r6.sampleStreams
            int r1 = r0.length
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.clearSentEos()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod r0 = r6.mediaPeriod
            long r0 = r0.seekToUs(r7)
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 == 0) goto L34
            long r7 = r6.startUs
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 < 0) goto L35
            long r7 = r6.endUs
            r3 = -9223372036854775808
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L34
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 > 0) goto L35
        L34:
            r2 = 1
        L35:
            com.mbridge.msdk.playercommon.exoplayer2.util.Assertions.checkState(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.source.ClippingMediaPeriod.seekToUs(long):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:            if (r2 > r4) goto L26;     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long selectTracks(com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection[] r13, boolean[] r14, com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            com.mbridge.msdk.playercommon.exoplayer2.source.ClippingMediaPeriod$ClippingSampleStream[] r2 = new com.mbridge.msdk.playercommon.exoplayer2.source.ClippingMediaPeriod.ClippingSampleStream[r2]
            r0.sampleStreams = r2
            int r2 = r1.length
            com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream[] r9 = new com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream[r2]
            r10 = 0
            r2 = 0
        Lc:
            int r3 = r1.length
            r11 = 0
            if (r2 >= r3) goto L21
            com.mbridge.msdk.playercommon.exoplayer2.source.ClippingMediaPeriod$ClippingSampleStream[] r3 = r0.sampleStreams
            r4 = r1[r2]
            com.mbridge.msdk.playercommon.exoplayer2.source.ClippingMediaPeriod$ClippingSampleStream r4 = (com.mbridge.msdk.playercommon.exoplayer2.source.ClippingMediaPeriod.ClippingSampleStream) r4
            r3[r2] = r4
            if (r4 == 0) goto L1c
            com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream r11 = r4.childStream
        L1c:
            r9[r2] = r11
            int r2 = r2 + 1
            goto Lc
        L21:
            com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod r2 = r0.mediaPeriod
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r16
            r7 = r17
            long r2 = r2.selectTracks(r3, r4, r5, r6, r7)
            boolean r4 = r12.isPendingInitialDiscontinuity()
            if (r4 == 0) goto L43
            long r4 = r0.startUs
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 != 0) goto L43
            r6 = r13
            boolean r4 = shouldKeepInitialDiscontinuity(r4, r13)
            if (r4 == 0) goto L43
            r4 = r2
            goto L48
        L43:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L48:
            r0.pendingInitialDiscontinuityPositionUs = r4
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L63
            long r4 = r0.startUs
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L61
            long r4 = r0.endUs
            r6 = -9223372036854775808
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L63
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L61
            goto L63
        L61:
            r4 = 0
            goto L64
        L63:
            r4 = 1
        L64:
            com.mbridge.msdk.playercommon.exoplayer2.util.Assertions.checkState(r4)
        L67:
            int r4 = r1.length
            if (r10 >= r4) goto L91
            r4 = r9[r10]
            if (r4 != 0) goto L73
            com.mbridge.msdk.playercommon.exoplayer2.source.ClippingMediaPeriod$ClippingSampleStream[] r4 = r0.sampleStreams
            r4[r10] = r11
            goto L88
        L73:
            r5 = r1[r10]
            if (r5 == 0) goto L7f
            com.mbridge.msdk.playercommon.exoplayer2.source.ClippingMediaPeriod$ClippingSampleStream[] r5 = r0.sampleStreams
            r5 = r5[r10]
            com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream r5 = r5.childStream
            if (r5 == r4) goto L88
        L7f:
            com.mbridge.msdk.playercommon.exoplayer2.source.ClippingMediaPeriod$ClippingSampleStream[] r5 = r0.sampleStreams
            com.mbridge.msdk.playercommon.exoplayer2.source.ClippingMediaPeriod$ClippingSampleStream r6 = new com.mbridge.msdk.playercommon.exoplayer2.source.ClippingMediaPeriod$ClippingSampleStream
            r6.<init>(r4)
            r5[r10] = r6
        L88:
            com.mbridge.msdk.playercommon.exoplayer2.source.ClippingMediaPeriod$ClippingSampleStream[] r4 = r0.sampleStreams
            r4 = r4[r10]
            r1[r10] = r4
            int r10 = r10 + 1
            goto L67
        L91:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.source.ClippingMediaPeriod.selectTracks(com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection[], boolean[], com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream[], boolean[], long):long");
    }

    public final void updateClipping(long j8, long j9) {
        this.startUs = j8;
        this.endUs = j9;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader.Callback
    public final void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
        this.callback.onContinueLoadingRequested(this);
    }
}
