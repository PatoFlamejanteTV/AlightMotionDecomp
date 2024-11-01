package com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg;

import androidx.work.WorkRequest;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekPoint;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class DefaultOggSeeker implements OggSeeker {
    private static final int DEFAULT_OFFSET = 30000;
    public static final int MATCH_BYTE_RANGE = 100000;
    public static final int MATCH_RANGE = 72000;
    private static final int STATE_IDLE = 3;
    private static final int STATE_READ_LAST_PAGE = 1;
    private static final int STATE_SEEK = 2;
    private static final int STATE_SEEK_TO_END = 0;
    private long end;
    private long endGranule;
    private final long endPosition;
    private final OggPageHeader pageHeader = new OggPageHeader();
    private long positionBeforeSeekToEnd;
    private long start;
    private long startGranule;
    private final long startPosition;
    private int state;
    private final StreamReader streamReader;
    private long targetGranule;
    private long totalGranules;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class OggSeekMap implements SeekMap {
        private OggSeekMap() {
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
        public long getDurationUs() {
            return DefaultOggSeeker.this.streamReader.convertGranuleToTime(DefaultOggSeeker.this.totalGranules);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
        public SeekMap.SeekPoints getSeekPoints(long j8) {
            if (j8 == 0) {
                return new SeekMap.SeekPoints(new SeekPoint(0L, DefaultOggSeeker.this.startPosition));
            }
            long convertTimeToGranule = DefaultOggSeeker.this.streamReader.convertTimeToGranule(j8);
            DefaultOggSeeker defaultOggSeeker = DefaultOggSeeker.this;
            return new SeekMap.SeekPoints(new SeekPoint(j8, defaultOggSeeker.getEstimatedPosition(defaultOggSeeker.startPosition, convertTimeToGranule, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS)));
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
        public boolean isSeekable() {
            return true;
        }
    }

    public DefaultOggSeeker(long j8, long j9, StreamReader streamReader, int i8, long j10) {
        boolean z8;
        if (j8 >= 0 && j9 > j8) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkArgument(z8);
        this.streamReader = streamReader;
        this.startPosition = j8;
        this.endPosition = j9;
        if (i8 == j9 - j8) {
            this.totalGranules = j10;
            this.state = 3;
        } else {
            this.state = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getEstimatedPosition(long j8, long j9, long j10) {
        long j11 = this.endPosition;
        long j12 = this.startPosition;
        long j13 = j8 + (((j9 * (j11 - j12)) / this.totalGranules) - j10);
        if (j13 >= j12) {
            j12 = j13;
        }
        if (j12 >= j11) {
            return j11 - 1;
        }
        return j12;
    }

    public final long getNextSeekPosition(long j8, ExtractorInput extractorInput) throws IOException, InterruptedException {
        long j9 = 2;
        if (this.start == this.end) {
            return -(this.startGranule + 2);
        }
        long position = extractorInput.getPosition();
        if (!skipToNextPage(extractorInput, this.end)) {
            long j10 = this.start;
            if (j10 != position) {
                return j10;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.pageHeader.populate(extractorInput, false);
        extractorInput.resetPeekPosition();
        OggPageHeader oggPageHeader = this.pageHeader;
        long j11 = oggPageHeader.granulePosition;
        long j12 = j8 - j11;
        int i8 = oggPageHeader.headerSize + oggPageHeader.bodySize;
        if (j12 >= 0 && j12 <= 72000) {
            extractorInput.skipFully(i8);
            return -(this.pageHeader.granulePosition + 2);
        }
        if (j12 < 0) {
            this.end = position;
            this.endGranule = j11;
        } else {
            long j13 = i8;
            long position2 = extractorInput.getPosition() + j13;
            this.start = position2;
            this.startGranule = this.pageHeader.granulePosition;
            if ((this.end - position2) + j13 < 100000) {
                extractorInput.skipFully(i8);
                return -(this.startGranule + 2);
            }
        }
        long j14 = this.end;
        long j15 = this.start;
        if (j14 - j15 < 100000) {
            this.end = j15;
            return j15;
        }
        long j16 = i8;
        if (j12 > 0) {
            j9 = 1;
        }
        long position3 = extractorInput.getPosition() - (j16 * j9);
        long j17 = this.end;
        long j18 = this.start;
        return Math.min(Math.max(position3 + ((j12 * (j17 - j18)) / (this.endGranule - this.startGranule)), j18), this.end - 1);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggSeeker
    public final long read(ExtractorInput extractorInput) throws IOException, InterruptedException {
        int i8 = this.state;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 == 3) {
                        return -1L;
                    }
                    throw new IllegalStateException();
                }
                long j8 = this.targetGranule;
                long j9 = 0;
                if (j8 != 0) {
                    long nextSeekPosition = getNextSeekPosition(j8, extractorInput);
                    if (nextSeekPosition >= 0) {
                        return nextSeekPosition;
                    }
                    j9 = skipToPageOfGranule(extractorInput, this.targetGranule, -(nextSeekPosition + 2));
                }
                this.state = 3;
                return -(j9 + 2);
            }
        } else {
            long position = extractorInput.getPosition();
            this.positionBeforeSeekToEnd = position;
            this.state = 1;
            long j10 = this.endPosition - 65307;
            if (j10 > position) {
                return j10;
            }
        }
        this.totalGranules = readGranuleOfLastPage(extractorInput);
        this.state = 3;
        return this.positionBeforeSeekToEnd;
    }

    final long readGranuleOfLastPage(ExtractorInput extractorInput) throws IOException, InterruptedException {
        skipToNextPage(extractorInput);
        this.pageHeader.reset();
        while ((this.pageHeader.type & 4) != 4 && extractorInput.getPosition() < this.endPosition) {
            this.pageHeader.populate(extractorInput, false);
            OggPageHeader oggPageHeader = this.pageHeader;
            extractorInput.skipFully(oggPageHeader.headerSize + oggPageHeader.bodySize);
        }
        return this.pageHeader.granulePosition;
    }

    public final void resetSeeking() {
        this.start = this.startPosition;
        this.end = this.endPosition;
        this.startGranule = 0L;
        this.endGranule = this.totalGranules;
    }

    final void skipToNextPage(ExtractorInput extractorInput) throws IOException, InterruptedException {
        if (!skipToNextPage(extractorInput, this.endPosition)) {
            throw new EOFException();
        }
    }

    final long skipToPageOfGranule(ExtractorInput extractorInput, long j8, long j9) throws IOException, InterruptedException {
        this.pageHeader.populate(extractorInput, false);
        while (true) {
            OggPageHeader oggPageHeader = this.pageHeader;
            if (oggPageHeader.granulePosition < j8) {
                extractorInput.skipFully(oggPageHeader.headerSize + oggPageHeader.bodySize);
                OggPageHeader oggPageHeader2 = this.pageHeader;
                long j10 = oggPageHeader2.granulePosition;
                oggPageHeader2.populate(extractorInput, false);
                j9 = j10;
            } else {
                extractorInput.resetPeekPosition();
                return j9;
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggSeeker
    public final long startSeek(long j8) {
        boolean z8;
        int i8 = this.state;
        if (i8 != 3 && i8 != 2) {
            z8 = false;
        } else {
            z8 = true;
        }
        Assertions.checkArgument(z8);
        long j9 = 0;
        if (j8 != 0) {
            j9 = this.streamReader.convertTimeToGranule(j8);
        }
        this.targetGranule = j9;
        this.state = 2;
        resetSeeking();
        return this.targetGranule;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggSeeker
    public final OggSeekMap createSeekMap() {
        if (this.totalGranules != 0) {
            return new OggSeekMap();
        }
        return null;
    }

    final boolean skipToNextPage(ExtractorInput extractorInput, long j8) throws IOException, InterruptedException {
        int i8;
        long min = Math.min(j8 + 3, this.endPosition);
        int i9 = 2048;
        byte[] bArr = new byte[2048];
        while (true) {
            int i10 = 0;
            if (extractorInput.getPosition() + i9 > min && (i9 = (int) (min - extractorInput.getPosition())) < 4) {
                return false;
            }
            extractorInput.peekFully(bArr, 0, i9, false);
            while (true) {
                i8 = i9 - 3;
                if (i10 < i8) {
                    if (bArr[i10] == 79 && bArr[i10 + 1] == 103 && bArr[i10 + 2] == 103 && bArr[i10 + 3] == 83) {
                        extractorInput.skipFully(i10);
                        return true;
                    }
                    i10++;
                }
            }
            extractorInput.skipFully(i8);
        }
    }
}
