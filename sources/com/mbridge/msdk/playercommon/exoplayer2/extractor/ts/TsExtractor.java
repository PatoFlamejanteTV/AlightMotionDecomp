package com.mbridge.msdk.playercommon.exoplayer2.extractor.ts;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorsFactory;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.PositionHolder;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsPayloadReader;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableBitArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.TimestampAdjuster;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class TsExtractor implements Extractor {
    private static final int BUFFER_SIZE = 9400;
    private static final int MAX_PID_PLUS_ONE = 8192;
    public static final int MODE_HLS = 2;
    public static final int MODE_MULTI_PMT = 0;
    public static final int MODE_SINGLE_PMT = 1;
    private static final int SNIFF_TS_PACKET_COUNT = 5;
    private static final int TS_PACKET_SIZE = 188;
    private static final int TS_PAT_PID = 0;
    public static final int TS_STREAM_TYPE_AAC_ADTS = 15;
    public static final int TS_STREAM_TYPE_AAC_LATM = 17;
    public static final int TS_STREAM_TYPE_AC3 = 129;
    public static final int TS_STREAM_TYPE_DTS = 138;
    public static final int TS_STREAM_TYPE_DVBSUBS = 89;
    public static final int TS_STREAM_TYPE_E_AC3 = 135;
    public static final int TS_STREAM_TYPE_H262 = 2;
    public static final int TS_STREAM_TYPE_H264 = 27;
    public static final int TS_STREAM_TYPE_H265 = 36;
    public static final int TS_STREAM_TYPE_HDMV_DTS = 130;
    public static final int TS_STREAM_TYPE_ID3 = 21;
    public static final int TS_STREAM_TYPE_MPA = 3;
    public static final int TS_STREAM_TYPE_MPA_LSF = 4;
    public static final int TS_STREAM_TYPE_SPLICE_INFO = 134;
    private static final int TS_SYNC_BYTE = 71;
    private int bytesSinceLastSync;
    private final SparseIntArray continuityCounters;
    private TsPayloadReader id3Reader;
    private final int mode;
    private ExtractorOutput output;
    private final TsPayloadReader.Factory payloadReaderFactory;
    private int remainingPmts;
    private final List<TimestampAdjuster> timestampAdjusters;
    private final SparseBooleanArray trackIds;
    private boolean tracksEnded;
    private final ParsableByteArray tsPacketBuffer;
    private final SparseArray<TsPayloadReader> tsPayloadReaders;
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor.1
        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorsFactory
        public Extractor[] createExtractors() {
            return new Extractor[]{new TsExtractor()};
        }
    };
    private static final long AC3_FORMAT_IDENTIFIER = Util.getIntegerCodeForString("AC-3");
    private static final long E_AC3_FORMAT_IDENTIFIER = Util.getIntegerCodeForString("EAC3");
    private static final long HEVC_FORMAT_IDENTIFIER = Util.getIntegerCodeForString("HEVC");

    /* loaded from: classes4.dex */
    public @interface Mode {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class PatReader implements SectionPayloadReader {
        private final ParsableBitArray patScratch = new ParsableBitArray(new byte[4]);

        public PatReader() {
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.SectionPayloadReader
        public void consume(ParsableByteArray parsableByteArray) {
            if (parsableByteArray.readUnsignedByte() != 0) {
                return;
            }
            parsableByteArray.skipBytes(7);
            int bytesLeft = parsableByteArray.bytesLeft() / 4;
            for (int i8 = 0; i8 < bytesLeft; i8++) {
                parsableByteArray.readBytes(this.patScratch, 4);
                int readBits = this.patScratch.readBits(16);
                this.patScratch.skipBits(3);
                if (readBits == 0) {
                    this.patScratch.skipBits(13);
                } else {
                    int readBits2 = this.patScratch.readBits(13);
                    TsExtractor.this.tsPayloadReaders.put(readBits2, new SectionReader(new PmtReader(readBits2)));
                    TsExtractor.access$108(TsExtractor.this);
                }
            }
            if (TsExtractor.this.mode != 2) {
                TsExtractor.this.tsPayloadReaders.remove(0);
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.SectionPayloadReader
        public void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        }
    }

    /* loaded from: classes4.dex */
    private class PmtReader implements SectionPayloadReader {
        private static final int TS_PMT_DESC_AC3 = 106;
        private static final int TS_PMT_DESC_DTS = 123;
        private static final int TS_PMT_DESC_DVBSUBS = 89;
        private static final int TS_PMT_DESC_EAC3 = 122;
        private static final int TS_PMT_DESC_ISO639_LANG = 10;
        private static final int TS_PMT_DESC_REGISTRATION = 5;
        private final int pid;
        private final ParsableBitArray pmtScratch = new ParsableBitArray(new byte[5]);
        private final SparseArray<TsPayloadReader> trackIdToReaderScratch = new SparseArray<>();
        private final SparseIntArray trackIdToPidScratch = new SparseIntArray();

        public PmtReader(int i8) {
            this.pid = i8;
        }

        private TsPayloadReader.EsInfo readEsInfo(ParsableByteArray parsableByteArray, int i8) {
            int position = parsableByteArray.getPosition();
            int i9 = i8 + position;
            int i10 = -1;
            String str = null;
            ArrayList arrayList = null;
            while (parsableByteArray.getPosition() < i9) {
                int readUnsignedByte = parsableByteArray.readUnsignedByte();
                int position2 = parsableByteArray.getPosition() + parsableByteArray.readUnsignedByte();
                if (readUnsignedByte == 5) {
                    long readUnsignedInt = parsableByteArray.readUnsignedInt();
                    if (readUnsignedInt != TsExtractor.AC3_FORMAT_IDENTIFIER) {
                        if (readUnsignedInt != TsExtractor.E_AC3_FORMAT_IDENTIFIER) {
                            if (readUnsignedInt == TsExtractor.HEVC_FORMAT_IDENTIFIER) {
                                i10 = 36;
                            }
                        }
                        i10 = TsExtractor.TS_STREAM_TYPE_E_AC3;
                    }
                    i10 = TsExtractor.TS_STREAM_TYPE_AC3;
                } else {
                    if (readUnsignedByte != 106) {
                        if (readUnsignedByte != 122) {
                            if (readUnsignedByte == 123) {
                                i10 = TsExtractor.TS_STREAM_TYPE_DTS;
                            } else if (readUnsignedByte == 10) {
                                str = parsableByteArray.readString(3).trim();
                            } else if (readUnsignedByte == 89) {
                                ArrayList arrayList2 = new ArrayList();
                                while (parsableByteArray.getPosition() < position2) {
                                    String trim = parsableByteArray.readString(3).trim();
                                    int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                                    byte[] bArr = new byte[4];
                                    parsableByteArray.readBytes(bArr, 0, 4);
                                    arrayList2.add(new TsPayloadReader.DvbSubtitleInfo(trim, readUnsignedByte2, bArr));
                                }
                                arrayList = arrayList2;
                                i10 = 89;
                            }
                        }
                        i10 = TsExtractor.TS_STREAM_TYPE_E_AC3;
                    }
                    i10 = TsExtractor.TS_STREAM_TYPE_AC3;
                }
                parsableByteArray.skipBytes(position2 - parsableByteArray.getPosition());
            }
            parsableByteArray.setPosition(i9);
            return new TsPayloadReader.EsInfo(i10, str, arrayList, Arrays.copyOfRange(parsableByteArray.data, position, i9));
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.SectionPayloadReader
        public void consume(ParsableByteArray parsableByteArray) {
            TimestampAdjuster timestampAdjuster;
            int i8;
            TsPayloadReader createPayloadReader;
            if (parsableByteArray.readUnsignedByte() != 2) {
                return;
            }
            if (TsExtractor.this.mode != 1 && TsExtractor.this.mode != 2 && TsExtractor.this.remainingPmts != 1) {
                timestampAdjuster = new TimestampAdjuster(((TimestampAdjuster) TsExtractor.this.timestampAdjusters.get(0)).getFirstSampleTimestampUs());
                TsExtractor.this.timestampAdjusters.add(timestampAdjuster);
            } else {
                timestampAdjuster = (TimestampAdjuster) TsExtractor.this.timestampAdjusters.get(0);
            }
            parsableByteArray.skipBytes(2);
            int readUnsignedShort = parsableByteArray.readUnsignedShort();
            int i9 = 5;
            parsableByteArray.skipBytes(5);
            parsableByteArray.readBytes(this.pmtScratch, 2);
            int i10 = 4;
            this.pmtScratch.skipBits(4);
            parsableByteArray.skipBytes(this.pmtScratch.readBits(12));
            if (TsExtractor.this.mode == 2 && TsExtractor.this.id3Reader == null) {
                TsPayloadReader.EsInfo esInfo = new TsPayloadReader.EsInfo(21, null, null, new byte[0]);
                TsExtractor tsExtractor = TsExtractor.this;
                tsExtractor.id3Reader = tsExtractor.payloadReaderFactory.createPayloadReader(21, esInfo);
                TsExtractor.this.id3Reader.init(timestampAdjuster, TsExtractor.this.output, new TsPayloadReader.TrackIdGenerator(readUnsignedShort, 21, 8192));
            }
            this.trackIdToReaderScratch.clear();
            this.trackIdToPidScratch.clear();
            int bytesLeft = parsableByteArray.bytesLeft();
            while (bytesLeft > 0) {
                parsableByteArray.readBytes(this.pmtScratch, i9);
                int readBits = this.pmtScratch.readBits(8);
                this.pmtScratch.skipBits(3);
                int readBits2 = this.pmtScratch.readBits(13);
                this.pmtScratch.skipBits(i10);
                int readBits3 = this.pmtScratch.readBits(12);
                TsPayloadReader.EsInfo readEsInfo = readEsInfo(parsableByteArray, readBits3);
                if (readBits == 6) {
                    readBits = readEsInfo.streamType;
                }
                bytesLeft -= readBits3 + 5;
                if (TsExtractor.this.mode == 2) {
                    i8 = readBits;
                } else {
                    i8 = readBits2;
                }
                if (!TsExtractor.this.trackIds.get(i8)) {
                    if (TsExtractor.this.mode == 2 && readBits == 21) {
                        createPayloadReader = TsExtractor.this.id3Reader;
                    } else {
                        createPayloadReader = TsExtractor.this.payloadReaderFactory.createPayloadReader(readBits, readEsInfo);
                    }
                    if (TsExtractor.this.mode != 2 || readBits2 < this.trackIdToPidScratch.get(i8, 8192)) {
                        this.trackIdToPidScratch.put(i8, readBits2);
                        this.trackIdToReaderScratch.put(i8, createPayloadReader);
                    }
                }
                i9 = 5;
                i10 = 4;
            }
            int size = this.trackIdToPidScratch.size();
            for (int i11 = 0; i11 < size; i11++) {
                int keyAt = this.trackIdToPidScratch.keyAt(i11);
                TsExtractor.this.trackIds.put(keyAt, true);
                TsPayloadReader valueAt = this.trackIdToReaderScratch.valueAt(i11);
                if (valueAt != null) {
                    if (valueAt != TsExtractor.this.id3Reader) {
                        valueAt.init(timestampAdjuster, TsExtractor.this.output, new TsPayloadReader.TrackIdGenerator(readUnsignedShort, keyAt, 8192));
                    }
                    TsExtractor.this.tsPayloadReaders.put(this.trackIdToPidScratch.valueAt(i11), valueAt);
                }
            }
            if (TsExtractor.this.mode == 2) {
                if (!TsExtractor.this.tracksEnded) {
                    TsExtractor.this.output.endTracks();
                    TsExtractor.this.remainingPmts = 0;
                    TsExtractor.this.tracksEnded = true;
                    return;
                }
                return;
            }
            TsExtractor.this.tsPayloadReaders.remove(this.pid);
            TsExtractor tsExtractor2 = TsExtractor.this;
            tsExtractor2.remainingPmts = tsExtractor2.mode != 1 ? TsExtractor.this.remainingPmts - 1 : 0;
            if (TsExtractor.this.remainingPmts == 0) {
                TsExtractor.this.output.endTracks();
                TsExtractor.this.tracksEnded = true;
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.SectionPayloadReader
        public void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        }
    }

    public TsExtractor() {
        this(0);
    }

    static /* synthetic */ int access$108(TsExtractor tsExtractor) {
        int i8 = tsExtractor.remainingPmts;
        tsExtractor.remainingPmts = i8 + 1;
        return i8;
    }

    private void resetPayloadReaders() {
        this.trackIds.clear();
        this.tsPayloadReaders.clear();
        SparseArray<TsPayloadReader> createInitialPayloadReaders = this.payloadReaderFactory.createInitialPayloadReaders();
        int size = createInitialPayloadReaders.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.tsPayloadReaders.put(createInitialPayloadReaders.keyAt(i8), createInitialPayloadReaders.valueAt(i8));
        }
        this.tsPayloadReaders.put(0, new SectionReader(new PatReader()));
        this.id3Reader = null;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public final void init(ExtractorOutput extractorOutput) {
        this.output = extractorOutput;
        extractorOutput.seekMap(new SeekMap.Unseekable(C.TIME_UNSET));
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public final int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException, InterruptedException {
        boolean z8;
        boolean z9;
        TsPayloadReader tsPayloadReader;
        ParsableByteArray parsableByteArray = this.tsPacketBuffer;
        byte[] bArr = parsableByteArray.data;
        if (9400 - parsableByteArray.getPosition() < TS_PACKET_SIZE) {
            int bytesLeft = this.tsPacketBuffer.bytesLeft();
            if (bytesLeft > 0) {
                System.arraycopy(bArr, this.tsPacketBuffer.getPosition(), bArr, 0, bytesLeft);
            }
            this.tsPacketBuffer.reset(bArr, bytesLeft);
        }
        while (this.tsPacketBuffer.bytesLeft() < TS_PACKET_SIZE) {
            int limit = this.tsPacketBuffer.limit();
            int read = extractorInput.read(bArr, limit, 9400 - limit);
            if (read == -1) {
                return -1;
            }
            this.tsPacketBuffer.setLimit(limit + read);
        }
        int limit2 = this.tsPacketBuffer.limit();
        int position = this.tsPacketBuffer.getPosition();
        int i8 = position;
        while (i8 < limit2 && bArr[i8] != 71) {
            i8++;
        }
        this.tsPacketBuffer.setPosition(i8);
        int i9 = i8 + TS_PACKET_SIZE;
        if (i9 > limit2) {
            int i10 = this.bytesSinceLastSync + (i8 - position);
            this.bytesSinceLastSync = i10;
            if (this.mode != 2 || i10 <= 376) {
                return 0;
            }
            throw new ParserException("Cannot find sync byte. Most likely not a Transport Stream.");
        }
        this.bytesSinceLastSync = 0;
        int readInt = this.tsPacketBuffer.readInt();
        if ((8388608 & readInt) != 0) {
            this.tsPacketBuffer.setPosition(i9);
            return 0;
        }
        if ((4194304 & readInt) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        int i11 = (2096896 & readInt) >> 8;
        if ((readInt & 32) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if ((readInt & 16) != 0) {
            tsPayloadReader = this.tsPayloadReaders.get(i11);
        } else {
            tsPayloadReader = null;
        }
        if (tsPayloadReader == null) {
            this.tsPacketBuffer.setPosition(i9);
            return 0;
        }
        if (this.mode != 2) {
            int i12 = readInt & 15;
            int i13 = this.continuityCounters.get(i11, i12 - 1);
            this.continuityCounters.put(i11, i12);
            if (i13 == i12) {
                this.tsPacketBuffer.setPosition(i9);
                return 0;
            }
            if (i12 != ((i13 + 1) & 15)) {
                tsPayloadReader.seek();
            }
        }
        if (z9) {
            this.tsPacketBuffer.skipBytes(this.tsPacketBuffer.readUnsignedByte());
        }
        this.tsPacketBuffer.setLimit(i9);
        tsPayloadReader.consume(this.tsPacketBuffer, z8);
        this.tsPacketBuffer.setLimit(limit2);
        this.tsPacketBuffer.setPosition(i9);
        return 0;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public final void release() {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public final void seek(long j8, long j9) {
        int size = this.timestampAdjusters.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.timestampAdjusters.get(i8).reset();
        }
        this.tsPacketBuffer.reset();
        this.continuityCounters.clear();
        resetPayloadReaders();
        this.bytesSinceLastSync = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:            r1 = r1 + 1;     */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean sniff(com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput r7) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r6 = this;
            com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray r0 = r6.tsPacketBuffer
            byte[] r0 = r0.data
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.peekFully(r0, r2, r1)
            r1 = 0
        Lb:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L27
            r3 = 0
        L10:
            r4 = 5
            if (r3 != r4) goto L18
            r7.skipFully(r1)
            r7 = 1
            return r7
        L18:
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L24
            int r1 = r1 + 1
            goto Lb
        L24:
            int r3 = r3 + 1
            goto L10
        L27:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor.sniff(com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput):boolean");
    }

    public TsExtractor(int i8) {
        this(1, i8);
    }

    public TsExtractor(int i8, int i9) {
        this(i8, new TimestampAdjuster(0L), new DefaultTsPayloadReaderFactory(i9));
    }

    public TsExtractor(int i8, TimestampAdjuster timestampAdjuster, TsPayloadReader.Factory factory) {
        this.payloadReaderFactory = (TsPayloadReader.Factory) Assertions.checkNotNull(factory);
        this.mode = i8;
        if (i8 != 1 && i8 != 2) {
            ArrayList arrayList = new ArrayList();
            this.timestampAdjusters = arrayList;
            arrayList.add(timestampAdjuster);
        } else {
            this.timestampAdjusters = Collections.singletonList(timestampAdjuster);
        }
        this.tsPacketBuffer = new ParsableByteArray(new byte[BUFFER_SIZE], 0);
        this.trackIds = new SparseBooleanArray();
        this.tsPayloadReaders = new SparseArray<>();
        this.continuityCounters = new SparseIntArray();
        resetPayloadReaders();
    }
}
