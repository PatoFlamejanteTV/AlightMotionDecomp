package com.mbridge.msdk.playercommon.exoplayer2.source;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.FormatHolder;
import com.mbridge.msdk.playercommon.exoplayer2.SeekParameters;
import com.mbridge.msdk.playercommon.exoplayer2.decoder.DecoderInputBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSpec;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.Loader;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class SingleSampleMediaPeriod implements MediaPeriod, Loader.Callback<SourceLoadable> {
    private static final int INITIAL_SAMPLE_SIZE = 1024;
    private final DataSource.Factory dataSourceFactory;
    private final DataSpec dataSpec;
    private final long durationUs;
    private int errorCount;
    private final MediaSourceEventListener.EventDispatcher eventDispatcher;
    final Format format;
    boolean loadingFinished;
    boolean loadingSucceeded;
    private final int minLoadableRetryCount;
    boolean notifiedReadingStarted;
    byte[] sampleData;
    int sampleSize;
    private final TrackGroupArray tracks;
    final boolean treatLoadErrorsAsEndOfStream;
    private final ArrayList<SampleStreamImpl> sampleStreams = new ArrayList<>();
    final Loader loader = new Loader("Loader:SingleSampleMediaPeriod");

    /* loaded from: classes4.dex */
    private final class SampleStreamImpl implements SampleStream {
        private static final int STREAM_STATE_END_OF_STREAM = 2;
        private static final int STREAM_STATE_SEND_FORMAT = 0;
        private static final int STREAM_STATE_SEND_SAMPLE = 1;
        private boolean formatSent;
        private int streamState;

        private SampleStreamImpl() {
        }

        private void sendFormat() {
            if (!this.formatSent) {
                SingleSampleMediaPeriod.this.eventDispatcher.downstreamFormatChanged(MimeTypes.getTrackType(SingleSampleMediaPeriod.this.format.sampleMimeType), SingleSampleMediaPeriod.this.format, 0, null, 0L);
                this.formatSent = true;
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream
        public final boolean isReady() {
            return SingleSampleMediaPeriod.this.loadingFinished;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream
        public final void maybeThrowError() throws IOException {
            SingleSampleMediaPeriod singleSampleMediaPeriod = SingleSampleMediaPeriod.this;
            if (!singleSampleMediaPeriod.treatLoadErrorsAsEndOfStream) {
                singleSampleMediaPeriod.loader.maybeThrowError();
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream
        public final int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, boolean z8) {
            int i8 = this.streamState;
            if (i8 == 2) {
                decoderInputBuffer.addFlag(4);
                return -4;
            }
            if (!z8 && i8 != 0) {
                SingleSampleMediaPeriod singleSampleMediaPeriod = SingleSampleMediaPeriod.this;
                if (singleSampleMediaPeriod.loadingFinished) {
                    if (singleSampleMediaPeriod.loadingSucceeded) {
                        decoderInputBuffer.timeUs = 0L;
                        decoderInputBuffer.addFlag(1);
                        decoderInputBuffer.ensureSpaceForWrite(SingleSampleMediaPeriod.this.sampleSize);
                        ByteBuffer byteBuffer = decoderInputBuffer.data;
                        SingleSampleMediaPeriod singleSampleMediaPeriod2 = SingleSampleMediaPeriod.this;
                        byteBuffer.put(singleSampleMediaPeriod2.sampleData, 0, singleSampleMediaPeriod2.sampleSize);
                        sendFormat();
                    } else {
                        decoderInputBuffer.addFlag(4);
                    }
                    this.streamState = 2;
                    return -4;
                }
                return -3;
            }
            formatHolder.format = SingleSampleMediaPeriod.this.format;
            this.streamState = 1;
            return -5;
        }

        public final void reset() {
            if (this.streamState == 2) {
                this.streamState = 1;
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream
        public final int skipData(long j8) {
            if (j8 > 0 && this.streamState != 2) {
                this.streamState = 2;
                sendFormat();
                return 1;
            }
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class SourceLoadable implements Loader.Loadable {
        private final DataSource dataSource;
        public final DataSpec dataSpec;
        private byte[] sampleData;
        private int sampleSize;

        public SourceLoadable(DataSpec dataSpec, DataSource dataSource) {
            this.dataSpec = dataSpec;
            this.dataSource = dataSource;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Loader.Loadable
        public final void cancelLoad() {
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Loader.Loadable
        public final void load() throws IOException, InterruptedException {
            int i8 = 0;
            this.sampleSize = 0;
            try {
                this.dataSource.open(this.dataSpec);
                while (i8 != -1) {
                    int i9 = this.sampleSize + i8;
                    this.sampleSize = i9;
                    byte[] bArr = this.sampleData;
                    if (bArr == null) {
                        this.sampleData = new byte[1024];
                    } else if (i9 == bArr.length) {
                        this.sampleData = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    DataSource dataSource = this.dataSource;
                    byte[] bArr2 = this.sampleData;
                    int i10 = this.sampleSize;
                    i8 = dataSource.read(bArr2, i10, bArr2.length - i10);
                }
                Util.closeQuietly(this.dataSource);
            } catch (Throwable th) {
                Util.closeQuietly(this.dataSource);
                throw th;
            }
        }
    }

    public SingleSampleMediaPeriod(DataSpec dataSpec, DataSource.Factory factory, Format format, long j8, int i8, MediaSourceEventListener.EventDispatcher eventDispatcher, boolean z8) {
        this.dataSpec = dataSpec;
        this.dataSourceFactory = factory;
        this.format = format;
        this.durationUs = j8;
        this.minLoadableRetryCount = i8;
        this.eventDispatcher = eventDispatcher;
        this.treatLoadErrorsAsEndOfStream = z8;
        this.tracks = new TrackGroupArray(new TrackGroup(format));
        eventDispatcher.mediaPeriodCreated();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod, com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    public final boolean continueLoading(long j8) {
        if (!this.loadingFinished && !this.loader.isLoading()) {
            this.eventDispatcher.loadStarted(this.dataSpec, 1, -1, this.format, 0, null, 0L, this.durationUs, this.loader.startLoading(new SourceLoadable(this.dataSpec, this.dataSourceFactory.createDataSource()), this, this.minLoadableRetryCount));
            return true;
        }
        return false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public final void discardBuffer(long j8, boolean z8) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public final long getAdjustedSeekPositionUs(long j8, SeekParameters seekParameters) {
        return j8;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod, com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    public final long getBufferedPositionUs() {
        if (this.loadingFinished) {
            return Long.MIN_VALUE;
        }
        return 0L;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod, com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    public final long getNextLoadPositionUs() {
        if (!this.loadingFinished && !this.loader.isLoading()) {
            return 0L;
        }
        return Long.MIN_VALUE;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public final TrackGroupArray getTrackGroups() {
        return this.tracks;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public final void maybeThrowPrepareError() throws IOException {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public final void prepare(MediaPeriod.Callback callback, long j8) {
        callback.onPrepared(this);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public final long readDiscontinuity() {
        if (!this.notifiedReadingStarted) {
            this.eventDispatcher.readingStarted();
            this.notifiedReadingStarted = true;
            return C.TIME_UNSET;
        }
        return C.TIME_UNSET;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod, com.mbridge.msdk.playercommon.exoplayer2.source.SequenceableLoader
    public final void reevaluateBuffer(long j8) {
    }

    public final void release() {
        this.loader.release();
        this.eventDispatcher.mediaPeriodReleased();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public final long seekToUs(long j8) {
        for (int i8 = 0; i8 < this.sampleStreams.size(); i8++) {
            this.sampleStreams.get(i8).reset();
        }
        return j8;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaPeriod
    public final long selectTracks(TrackSelection[] trackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j8) {
        for (int i8 = 0; i8 < trackSelectionArr.length; i8++) {
            SampleStream sampleStream = sampleStreamArr[i8];
            if (sampleStream != null && (trackSelectionArr[i8] == null || !zArr[i8])) {
                this.sampleStreams.remove(sampleStream);
                sampleStreamArr[i8] = null;
            }
            if (sampleStreamArr[i8] == null && trackSelectionArr[i8] != null) {
                SampleStreamImpl sampleStreamImpl = new SampleStreamImpl();
                this.sampleStreams.add(sampleStreamImpl);
                sampleStreamArr[i8] = sampleStreamImpl;
                zArr2[i8] = true;
            }
        }
        return j8;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Loader.Callback
    public final void onLoadCanceled(SourceLoadable sourceLoadable, long j8, long j9, boolean z8) {
        this.eventDispatcher.loadCanceled(sourceLoadable.dataSpec, 1, -1, null, 0, null, 0L, this.durationUs, j8, j9, sourceLoadable.sampleSize);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Loader.Callback
    public final void onLoadCompleted(SourceLoadable sourceLoadable, long j8, long j9) {
        this.eventDispatcher.loadCompleted(sourceLoadable.dataSpec, 1, -1, this.format, 0, null, 0L, this.durationUs, j8, j9, sourceLoadable.sampleSize);
        this.sampleSize = sourceLoadable.sampleSize;
        this.sampleData = sourceLoadable.sampleData;
        this.loadingFinished = true;
        this.loadingSucceeded = true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Loader.Callback
    public final int onLoadError(SourceLoadable sourceLoadable, long j8, long j9, IOException iOException) {
        int i8 = this.errorCount + 1;
        this.errorCount = i8;
        boolean z8 = this.treatLoadErrorsAsEndOfStream && i8 >= this.minLoadableRetryCount;
        this.eventDispatcher.loadError(sourceLoadable.dataSpec, 1, -1, this.format, 0, null, 0L, this.durationUs, j8, j9, sourceLoadable.sampleSize, iOException, z8);
        if (!z8) {
            return 0;
        }
        this.loadingFinished = true;
        return 2;
    }
}
