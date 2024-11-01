package com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.PositionHolder;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class StreamReader {
    private static final int STATE_END_OF_INPUT = 3;
    private static final int STATE_READ_HEADERS = 0;
    private static final int STATE_READ_PAYLOAD = 2;
    private static final int STATE_SKIP_HEADERS = 1;
    private long currentGranule;
    private ExtractorOutput extractorOutput;
    private boolean formatSet;
    private long lengthOfReadPacket;
    private final OggPacket oggPacket = new OggPacket();
    private OggSeeker oggSeeker;
    private long payloadStartPosition;
    private int sampleRate;
    private boolean seekMapSet;
    private SetupData setupData;
    private int state;
    private long targetGranule;
    private TrackOutput trackOutput;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class SetupData {
        Format format;
        OggSeeker oggSeeker;

        SetupData() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class UnseekableOggSeeker implements OggSeeker {
        private UnseekableOggSeeker() {
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggSeeker
        public final SeekMap createSeekMap() {
            return new SeekMap.Unseekable(C.TIME_UNSET);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggSeeker
        public final long read(ExtractorInput extractorInput) throws IOException, InterruptedException {
            return -1L;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggSeeker
        public final long startSeek(long j8) {
            return 0L;
        }
    }

    private int readHeaders(ExtractorInput extractorInput) throws IOException, InterruptedException {
        boolean z8 = true;
        while (z8) {
            if (!this.oggPacket.populate(extractorInput)) {
                this.state = 3;
                return -1;
            }
            this.lengthOfReadPacket = extractorInput.getPosition() - this.payloadStartPosition;
            z8 = readHeaders(this.oggPacket.getPayload(), this.payloadStartPosition, this.setupData);
            if (z8) {
                this.payloadStartPosition = extractorInput.getPosition();
            }
        }
        Format format = this.setupData.format;
        this.sampleRate = format.sampleRate;
        if (!this.formatSet) {
            this.trackOutput.format(format);
            this.formatSet = true;
        }
        OggSeeker oggSeeker = this.setupData.oggSeeker;
        if (oggSeeker != null) {
            this.oggSeeker = oggSeeker;
        } else if (extractorInput.getLength() == -1) {
            this.oggSeeker = new UnseekableOggSeeker();
        } else {
            OggPageHeader pageHeader = this.oggPacket.getPageHeader();
            this.oggSeeker = new DefaultOggSeeker(this.payloadStartPosition, extractorInput.getLength(), this, pageHeader.headerSize + pageHeader.bodySize, pageHeader.granulePosition);
        }
        this.setupData = null;
        this.state = 2;
        this.oggPacket.trimPayload();
        return 0;
    }

    private int readPayload(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException, InterruptedException {
        long read = this.oggSeeker.read(extractorInput);
        if (read >= 0) {
            positionHolder.position = read;
            return 1;
        }
        if (read < -1) {
            onSeekEnd(-(read + 2));
        }
        if (!this.seekMapSet) {
            this.extractorOutput.seekMap(this.oggSeeker.createSeekMap());
            this.seekMapSet = true;
        }
        if (this.lengthOfReadPacket <= 0 && !this.oggPacket.populate(extractorInput)) {
            this.state = 3;
            return -1;
        }
        this.lengthOfReadPacket = 0L;
        ParsableByteArray payload = this.oggPacket.getPayload();
        long preparePayload = preparePayload(payload);
        if (preparePayload >= 0) {
            long j8 = this.currentGranule;
            if (j8 + preparePayload >= this.targetGranule) {
                long convertGranuleToTime = convertGranuleToTime(j8);
                this.trackOutput.sampleData(payload, payload.limit());
                this.trackOutput.sampleMetadata(convertGranuleToTime, 1, payload.limit(), 0, null);
                this.targetGranule = -1L;
            }
        }
        this.currentGranule += preparePayload;
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long convertGranuleToTime(long j8) {
        return (j8 * 1000000) / this.sampleRate;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long convertTimeToGranule(long j8) {
        return (this.sampleRate * j8) / 1000000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void init(ExtractorOutput extractorOutput, TrackOutput trackOutput) {
        this.extractorOutput = extractorOutput;
        this.trackOutput = trackOutput;
        reset(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onSeekEnd(long j8) {
        this.currentGranule = j8;
    }

    protected abstract long preparePayload(ParsableByteArray parsableByteArray);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException, InterruptedException {
        int i8 = this.state;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 == 2) {
                    return readPayload(extractorInput, positionHolder);
                }
                throw new IllegalStateException();
            }
            extractorInput.skipFully((int) this.payloadStartPosition);
            this.state = 2;
            return 0;
        }
        return readHeaders(extractorInput);
    }

    protected abstract boolean readHeaders(ParsableByteArray parsableByteArray, long j8, SetupData setupData) throws IOException, InterruptedException;

    /* JADX INFO: Access modifiers changed from: protected */
    public void reset(boolean z8) {
        if (z8) {
            this.setupData = new SetupData();
            this.payloadStartPosition = 0L;
            this.state = 0;
        } else {
            this.state = 1;
        }
        this.targetGranule = -1L;
        this.currentGranule = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void seek(long j8, long j9) {
        this.oggPacket.reset();
        if (j8 == 0) {
            reset(!this.seekMapSet);
        } else if (this.state != 0) {
            this.targetGranule = this.oggSeeker.startSeek(j9);
            this.state = 2;
        }
    }
}
