package com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorsFactory;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.GaplessInfoHolder;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.Id3Peeker;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.MpegAudioHeader;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.PositionHolder;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class Mp3Extractor implements Extractor {
    public static final int FLAG_DISABLE_ID3_METADATA = 2;
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING = 1;
    private static final int MAX_SNIFF_BYTES = 16384;
    private static final int MAX_SYNC_BYTES = 131072;
    private static final int MPEG_AUDIO_HEADER_MASK = -128000;
    private static final int SCRATCH_LENGTH = 10;
    private static final int SEEK_HEADER_UNSET = 0;
    private long basisTimeUs;
    private ExtractorOutput extractorOutput;
    private final int flags;
    private final long forcedFirstSampleTimestampUs;
    private final GaplessInfoHolder gaplessInfoHolder;
    private final Id3Peeker id3Peeker;
    private Metadata metadata;
    private int sampleBytesRemaining;
    private long samplesRead;
    private final ParsableByteArray scratch;
    private Seeker seeker;
    private final MpegAudioHeader synchronizedHeader;
    private int synchronizedHeaderData;
    private TrackOutput trackOutput;
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Mp3Extractor.1
        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorsFactory
        public Extractor[] createExtractors() {
            return new Extractor[]{new Mp3Extractor()};
        }
    };
    private static final int SEEK_HEADER_XING = Util.getIntegerCodeForString("Xing");
    private static final int SEEK_HEADER_INFO = Util.getIntegerCodeForString("Info");
    private static final int SEEK_HEADER_VBRI = Util.getIntegerCodeForString("VBRI");

    /* loaded from: classes4.dex */
    public @interface Flags {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public interface Seeker extends SeekMap {
        long getTimeUs(long j8);
    }

    public Mp3Extractor() {
        this(0);
    }

    private Seeker getConstantBitrateSeeker(ExtractorInput extractorInput) throws IOException, InterruptedException {
        extractorInput.peekFully(this.scratch.data, 0, 4);
        this.scratch.setPosition(0);
        MpegAudioHeader.populateHeader(this.scratch.readInt(), this.synchronizedHeader);
        return new ConstantBitrateSeeker(extractorInput.getLength(), extractorInput.getPosition(), this.synchronizedHeader);
    }

    private static int getSeekFrameHeader(ParsableByteArray parsableByteArray, int i8) {
        if (parsableByteArray.limit() >= i8 + 4) {
            parsableByteArray.setPosition(i8);
            int readInt = parsableByteArray.readInt();
            if (readInt == SEEK_HEADER_XING || readInt == SEEK_HEADER_INFO) {
                return readInt;
            }
        }
        if (parsableByteArray.limit() >= 40) {
            parsableByteArray.setPosition(36);
            int readInt2 = parsableByteArray.readInt();
            int i9 = SEEK_HEADER_VBRI;
            if (readInt2 == i9) {
                return i9;
            }
            return 0;
        }
        return 0;
    }

    private static boolean headersMatch(int i8, long j8) {
        return ((long) (i8 & MPEG_AUDIO_HEADER_MASK)) == (j8 & (-128000));
    }

    private Seeker maybeReadSeekFrame(ExtractorInput extractorInput) throws IOException, InterruptedException {
        int i8;
        ParsableByteArray parsableByteArray = new ParsableByteArray(this.synchronizedHeader.frameSize);
        extractorInput.peekFully(parsableByteArray.data, 0, this.synchronizedHeader.frameSize);
        MpegAudioHeader mpegAudioHeader = this.synchronizedHeader;
        if ((mpegAudioHeader.version & 1) != 0) {
            if (mpegAudioHeader.channels != 1) {
                i8 = 36;
            }
            i8 = 21;
        } else {
            if (mpegAudioHeader.channels == 1) {
                i8 = 13;
            }
            i8 = 21;
        }
        int seekFrameHeader = getSeekFrameHeader(parsableByteArray, i8);
        if (seekFrameHeader != SEEK_HEADER_XING && seekFrameHeader != SEEK_HEADER_INFO) {
            if (seekFrameHeader == SEEK_HEADER_VBRI) {
                VbriSeeker create = VbriSeeker.create(extractorInput.getLength(), extractorInput.getPosition(), this.synchronizedHeader, parsableByteArray);
                extractorInput.skipFully(this.synchronizedHeader.frameSize);
                return create;
            }
            extractorInput.resetPeekPosition();
            return null;
        }
        XingSeeker create2 = XingSeeker.create(extractorInput.getLength(), extractorInput.getPosition(), this.synchronizedHeader, parsableByteArray);
        if (create2 != null && !this.gaplessInfoHolder.hasGaplessInfo()) {
            extractorInput.resetPeekPosition();
            extractorInput.advancePeekPosition(i8 + 141);
            extractorInput.peekFully(this.scratch.data, 0, 3);
            this.scratch.setPosition(0);
            this.gaplessInfoHolder.setFromXingHeaderValue(this.scratch.readUnsignedInt24());
        }
        extractorInput.skipFully(this.synchronizedHeader.frameSize);
        if (create2 != null && !create2.isSeekable() && seekFrameHeader == SEEK_HEADER_INFO) {
            return getConstantBitrateSeeker(extractorInput);
        }
        return create2;
    }

    private int readSample(ExtractorInput extractorInput) throws IOException, InterruptedException {
        if (this.sampleBytesRemaining == 0) {
            extractorInput.resetPeekPosition();
            if (!extractorInput.peekFully(this.scratch.data, 0, 4, true)) {
                return -1;
            }
            this.scratch.setPosition(0);
            int readInt = this.scratch.readInt();
            if (headersMatch(readInt, this.synchronizedHeaderData) && MpegAudioHeader.getFrameSize(readInt) != -1) {
                MpegAudioHeader.populateHeader(readInt, this.synchronizedHeader);
                if (this.basisTimeUs == C.TIME_UNSET) {
                    this.basisTimeUs = this.seeker.getTimeUs(extractorInput.getPosition());
                    if (this.forcedFirstSampleTimestampUs != C.TIME_UNSET) {
                        this.basisTimeUs += this.forcedFirstSampleTimestampUs - this.seeker.getTimeUs(0L);
                    }
                }
                this.sampleBytesRemaining = this.synchronizedHeader.frameSize;
            } else {
                extractorInput.skipFully(1);
                this.synchronizedHeaderData = 0;
                return 0;
            }
        }
        int sampleData = this.trackOutput.sampleData(extractorInput, this.sampleBytesRemaining, true);
        if (sampleData == -1) {
            return -1;
        }
        int i8 = this.sampleBytesRemaining - sampleData;
        this.sampleBytesRemaining = i8;
        if (i8 > 0) {
            return 0;
        }
        this.trackOutput.sampleMetadata(this.basisTimeUs + ((this.samplesRead * 1000000) / r14.sampleRate), 1, this.synchronizedHeader.frameSize, 0, null);
        this.samplesRead += this.synchronizedHeader.samplesPerFrame;
        this.sampleBytesRemaining = 0;
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x009a, code lost:            if (r14 == false) goto L49;     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x009c, code lost:            r13.skipFully(r2 + r4);     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a4, code lost:            r12.synchronizedHeaderData = r3;     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a6, code lost:            return true;     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a1, code lost:            r13.resetPeekPosition();     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean synchronize(com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput r13, boolean r14) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r12 = this;
            if (r14 == 0) goto L5
            r0 = 16384(0x4000, float:2.2959E-41)
            goto L7
        L5:
            r0 = 131072(0x20000, float:1.83671E-40)
        L7:
            r13.resetPeekPosition()
            long r1 = r13.getPosition()
            r3 = 0
            r5 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L3c
            int r1 = r12.flags
            r1 = r1 & 2
            if (r1 == 0) goto L1e
            com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.Id3Decoder$FramePredicate r1 = com.mbridge.msdk.playercommon.exoplayer2.extractor.GaplessInfoHolder.GAPLESS_INFO_ID3_FRAME_PREDICATE
            goto L1f
        L1e:
            r1 = 0
        L1f:
            com.mbridge.msdk.playercommon.exoplayer2.extractor.Id3Peeker r2 = r12.id3Peeker
            com.mbridge.msdk.playercommon.exoplayer2.metadata.Metadata r1 = r2.peekId3Data(r13, r1)
            r12.metadata = r1
            if (r1 == 0) goto L2e
            com.mbridge.msdk.playercommon.exoplayer2.extractor.GaplessInfoHolder r2 = r12.gaplessInfoHolder
            r2.setFromMetadata(r1)
        L2e:
            long r1 = r13.getPeekPosition()
            int r2 = (int) r1
            if (r14 != 0) goto L38
            r13.skipFully(r2)
        L38:
            r1 = 0
        L39:
            r3 = 0
            r4 = 0
            goto L3f
        L3c:
            r1 = 0
            r2 = 0
            goto L39
        L3f:
            com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray r6 = r12.scratch
            byte[] r6 = r6.data
            r7 = 1
            if (r1 <= 0) goto L48
            r8 = 1
            goto L49
        L48:
            r8 = 0
        L49:
            r9 = 4
            boolean r6 = r13.peekFully(r6, r5, r9, r8)
            if (r6 != 0) goto L51
            goto L9a
        L51:
            com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray r6 = r12.scratch
            r6.setPosition(r5)
            com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray r6 = r12.scratch
            int r6 = r6.readInt()
            if (r3 == 0) goto L65
            long r10 = (long) r3
            boolean r8 = headersMatch(r6, r10)
            if (r8 == 0) goto L6c
        L65:
            int r8 = com.mbridge.msdk.playercommon.exoplayer2.extractor.MpegAudioHeader.getFrameSize(r6)
            r10 = -1
            if (r8 != r10) goto L8d
        L6c:
            int r1 = r4 + 1
            if (r4 != r0) goto L7b
            if (r14 == 0) goto L73
            return r5
        L73:
            com.mbridge.msdk.playercommon.exoplayer2.ParserException r13 = new com.mbridge.msdk.playercommon.exoplayer2.ParserException
            java.lang.String r14 = "Searched too many bytes."
            r13.<init>(r14)
            throw r13
        L7b:
            if (r14 == 0) goto L86
            r13.resetPeekPosition()
            int r3 = r2 + r1
            r13.advancePeekPosition(r3)
            goto L89
        L86:
            r13.skipFully(r7)
        L89:
            r4 = r1
            r1 = 0
            r3 = 0
            goto L3f
        L8d:
            int r1 = r1 + 1
            if (r1 != r7) goto L98
            com.mbridge.msdk.playercommon.exoplayer2.extractor.MpegAudioHeader r3 = r12.synchronizedHeader
            com.mbridge.msdk.playercommon.exoplayer2.extractor.MpegAudioHeader.populateHeader(r6, r3)
            r3 = r6
            goto La7
        L98:
            if (r1 != r9) goto La7
        L9a:
            if (r14 == 0) goto La1
            int r2 = r2 + r4
            r13.skipFully(r2)
            goto La4
        La1:
            r13.resetPeekPosition()
        La4:
            r12.synchronizedHeaderData = r3
            return r7
        La7:
            int r8 = r8 + (-4)
            r13.advancePeekPosition(r8)
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Mp3Extractor.synchronize(com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput, boolean):boolean");
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public final void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        this.trackOutput = extractorOutput.track(0, 1);
        this.extractorOutput.endTracks();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public final int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException, InterruptedException {
        Metadata metadata;
        if (this.synchronizedHeaderData == 0) {
            try {
                synchronize(extractorInput, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.seeker == null) {
            Seeker maybeReadSeekFrame = maybeReadSeekFrame(extractorInput);
            this.seeker = maybeReadSeekFrame;
            if (maybeReadSeekFrame == null || (!maybeReadSeekFrame.isSeekable() && (this.flags & 1) != 0)) {
                this.seeker = getConstantBitrateSeeker(extractorInput);
            }
            this.extractorOutput.seekMap(this.seeker);
            TrackOutput trackOutput = this.trackOutput;
            MpegAudioHeader mpegAudioHeader = this.synchronizedHeader;
            String str = mpegAudioHeader.mimeType;
            int i8 = mpegAudioHeader.channels;
            int i9 = mpegAudioHeader.sampleRate;
            GaplessInfoHolder gaplessInfoHolder = this.gaplessInfoHolder;
            int i10 = gaplessInfoHolder.encoderDelay;
            int i11 = gaplessInfoHolder.encoderPadding;
            if ((this.flags & 2) != 0) {
                metadata = null;
            } else {
                metadata = this.metadata;
            }
            trackOutput.format(Format.createAudioSampleFormat(null, str, null, -1, 4096, i8, i9, -1, i10, i11, null, null, 0, null, metadata));
        }
        return readSample(extractorInput);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public final void release() {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public final void seek(long j8, long j9) {
        this.synchronizedHeaderData = 0;
        this.basisTimeUs = C.TIME_UNSET;
        this.samplesRead = 0L;
        this.sampleBytesRemaining = 0;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public final boolean sniff(ExtractorInput extractorInput) throws IOException, InterruptedException {
        return synchronize(extractorInput, true);
    }

    public Mp3Extractor(int i8) {
        this(i8, C.TIME_UNSET);
    }

    public Mp3Extractor(int i8, long j8) {
        this.flags = i8;
        this.forcedFirstSampleTimestampUs = j8;
        this.scratch = new ParsableByteArray(10);
        this.synchronizedHeader = new MpegAudioHeader();
        this.gaplessInfoHolder = new GaplessInfoHolder();
        this.basisTimeUs = C.TIME_UNSET;
        this.id3Peeker = new Id3Peeker();
    }
}
