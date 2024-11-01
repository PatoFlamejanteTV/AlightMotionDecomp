package com.mbridge.msdk.playercommon.exoplayer2.extractor.ts;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsPayloadReader;
import com.mbridge.msdk.playercommon.exoplayer2.util.CodecSpecificDataUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableBitArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import java.util.Collections;

/* loaded from: classes4.dex */
public final class LatmReader implements ElementaryStreamReader {
    private static final int INITIAL_BUFFER_SIZE = 1024;
    private static final int STATE_FINDING_SYNC_1 = 0;
    private static final int STATE_FINDING_SYNC_2 = 1;
    private static final int STATE_READING_HEADER = 2;
    private static final int STATE_READING_SAMPLE = 3;
    private static final int SYNC_BYTE_FIRST = 86;
    private static final int SYNC_BYTE_SECOND = 224;
    private int audioMuxVersionA;
    private int bytesRead;
    private int channelCount;
    private Format format;
    private String formatId;
    private int frameLengthType;
    private final String language;
    private int numSubframes;
    private long otherDataLenBits;
    private boolean otherDataPresent;
    private TrackOutput output;
    private final ParsableBitArray sampleBitArray;
    private final ParsableByteArray sampleDataBuffer;
    private long sampleDurationUs;
    private int sampleRateHz;
    private int sampleSize;
    private int secondHeaderByte;
    private int state;
    private boolean streamMuxRead;
    private long timeUs;

    public LatmReader(String str) {
        this.language = str;
        ParsableByteArray parsableByteArray = new ParsableByteArray(1024);
        this.sampleDataBuffer = parsableByteArray;
        this.sampleBitArray = new ParsableBitArray(parsableByteArray.data);
    }

    private static long latmGetValue(ParsableBitArray parsableBitArray) {
        return parsableBitArray.readBits((parsableBitArray.readBits(2) + 1) * 8);
    }

    private void parseAudioMuxElement(ParsableBitArray parsableBitArray) throws ParserException {
        if (!parsableBitArray.readBit()) {
            this.streamMuxRead = true;
            parseStreamMuxConfig(parsableBitArray);
        } else if (!this.streamMuxRead) {
            return;
        }
        if (this.audioMuxVersionA == 0) {
            if (this.numSubframes == 0) {
                parsePayloadMux(parsableBitArray, parsePayloadLengthInfo(parsableBitArray));
                if (this.otherDataPresent) {
                    parsableBitArray.skipBits((int) this.otherDataLenBits);
                    return;
                }
                return;
            }
            throw new ParserException();
        }
        throw new ParserException();
    }

    private int parseAudioSpecificConfig(ParsableBitArray parsableBitArray) throws ParserException {
        int bitsLeft = parsableBitArray.bitsLeft();
        Pair<Integer, Integer> parseAacAudioSpecificConfig = CodecSpecificDataUtil.parseAacAudioSpecificConfig(parsableBitArray, true);
        this.sampleRateHz = ((Integer) parseAacAudioSpecificConfig.first).intValue();
        this.channelCount = ((Integer) parseAacAudioSpecificConfig.second).intValue();
        return bitsLeft - parsableBitArray.bitsLeft();
    }

    private void parseFrameLength(ParsableBitArray parsableBitArray) {
        int readBits = parsableBitArray.readBits(3);
        this.frameLengthType = readBits;
        if (readBits != 0) {
            if (readBits != 1) {
                if (readBits != 3 && readBits != 4 && readBits != 5) {
                    if (readBits == 6 || readBits == 7) {
                        parsableBitArray.skipBits(1);
                        return;
                    }
                    return;
                }
                parsableBitArray.skipBits(6);
                return;
            }
            parsableBitArray.skipBits(9);
            return;
        }
        parsableBitArray.skipBits(8);
    }

    private int parsePayloadLengthInfo(ParsableBitArray parsableBitArray) throws ParserException {
        int readBits;
        if (this.frameLengthType == 0) {
            int i8 = 0;
            do {
                readBits = parsableBitArray.readBits(8);
                i8 += readBits;
            } while (readBits == 255);
            return i8;
        }
        throw new ParserException();
    }

    private void parsePayloadMux(ParsableBitArray parsableBitArray, int i8) {
        int position = parsableBitArray.getPosition();
        if ((position & 7) == 0) {
            this.sampleDataBuffer.setPosition(position >> 3);
        } else {
            parsableBitArray.readBits(this.sampleDataBuffer.data, 0, i8 * 8);
            this.sampleDataBuffer.setPosition(0);
        }
        this.output.sampleData(this.sampleDataBuffer, i8);
        this.output.sampleMetadata(this.timeUs, 1, i8, 0, null);
        this.timeUs += this.sampleDurationUs;
    }

    private void parseStreamMuxConfig(ParsableBitArray parsableBitArray) throws ParserException {
        int i8;
        boolean readBit;
        int readBits = parsableBitArray.readBits(1);
        if (readBits == 1) {
            i8 = parsableBitArray.readBits(1);
        } else {
            i8 = 0;
        }
        this.audioMuxVersionA = i8;
        if (i8 == 0) {
            if (readBits == 1) {
                latmGetValue(parsableBitArray);
            }
            if (parsableBitArray.readBit()) {
                this.numSubframes = parsableBitArray.readBits(6);
                int readBits2 = parsableBitArray.readBits(4);
                int readBits3 = parsableBitArray.readBits(3);
                if (readBits2 == 0 && readBits3 == 0) {
                    if (readBits == 0) {
                        int position = parsableBitArray.getPosition();
                        int parseAudioSpecificConfig = parseAudioSpecificConfig(parsableBitArray);
                        parsableBitArray.setPosition(position);
                        byte[] bArr = new byte[(parseAudioSpecificConfig + 7) / 8];
                        parsableBitArray.readBits(bArr, 0, parseAudioSpecificConfig);
                        Format createAudioSampleFormat = Format.createAudioSampleFormat(this.formatId, MimeTypes.AUDIO_AAC, null, -1, -1, this.channelCount, this.sampleRateHz, Collections.singletonList(bArr), null, 0, this.language);
                        if (!createAudioSampleFormat.equals(this.format)) {
                            this.format = createAudioSampleFormat;
                            this.sampleDurationUs = 1024000000 / createAudioSampleFormat.sampleRate;
                            this.output.format(createAudioSampleFormat);
                        }
                    } else {
                        parsableBitArray.skipBits(((int) latmGetValue(parsableBitArray)) - parseAudioSpecificConfig(parsableBitArray));
                    }
                    parseFrameLength(parsableBitArray);
                    boolean readBit2 = parsableBitArray.readBit();
                    this.otherDataPresent = readBit2;
                    this.otherDataLenBits = 0L;
                    if (readBit2) {
                        if (readBits == 1) {
                            this.otherDataLenBits = latmGetValue(parsableBitArray);
                        }
                        do {
                            readBit = parsableBitArray.readBit();
                            this.otherDataLenBits = (this.otherDataLenBits << 8) + parsableBitArray.readBits(8);
                        } while (readBit);
                    }
                    if (parsableBitArray.readBit()) {
                        parsableBitArray.skipBits(8);
                        return;
                    }
                    return;
                }
                throw new ParserException();
            }
            throw new ParserException();
        }
        throw new ParserException();
    }

    private void resetBufferForSize(int i8) {
        this.sampleDataBuffer.reset(i8);
        this.sampleBitArray.reset(this.sampleDataBuffer.data);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void consume(ParsableByteArray parsableByteArray) throws ParserException {
        while (parsableByteArray.bytesLeft() > 0) {
            int i8 = this.state;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 == 3) {
                            int min = Math.min(parsableByteArray.bytesLeft(), this.sampleSize - this.bytesRead);
                            parsableByteArray.readBytes(this.sampleBitArray.data, this.bytesRead, min);
                            int i9 = this.bytesRead + min;
                            this.bytesRead = i9;
                            if (i9 == this.sampleSize) {
                                this.sampleBitArray.setPosition(0);
                                parseAudioMuxElement(this.sampleBitArray);
                                this.state = 0;
                            }
                        }
                    } else {
                        int readUnsignedByte = ((this.secondHeaderByte & (-225)) << 8) | parsableByteArray.readUnsignedByte();
                        this.sampleSize = readUnsignedByte;
                        if (readUnsignedByte > this.sampleDataBuffer.data.length) {
                            resetBufferForSize(readUnsignedByte);
                        }
                        this.bytesRead = 0;
                        this.state = 3;
                    }
                } else {
                    int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                    if ((readUnsignedByte2 & 224) == 224) {
                        this.secondHeaderByte = readUnsignedByte2;
                        this.state = 2;
                    } else if (readUnsignedByte2 != 86) {
                        this.state = 0;
                    }
                }
            } else if (parsableByteArray.readUnsignedByte() == 86) {
                this.state = 1;
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.output = extractorOutput.track(trackIdGenerator.getTrackId(), 1);
        this.formatId = trackIdGenerator.getFormatId();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void packetFinished() {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void packetStarted(long j8, boolean z8) {
        this.timeUs = j8;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void seek() {
        this.state = 0;
        this.streamMuxRead = false;
    }
}
