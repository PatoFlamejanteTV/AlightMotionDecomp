package com.mbridge.msdk.playercommon.exoplayer2.audio;

import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmInitData;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableBitArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class Ac3Util {
    private static final int AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT = 1536;
    private static final int AUDIO_SAMPLES_PER_AUDIO_BLOCK = 256;
    public static final int TRUEHD_RECHUNK_SAMPLE_COUNT = 16;
    public static final int TRUEHD_SYNCFRAME_PREFIX_LENGTH = 10;
    private static final int[] BLOCKS_PER_SYNCFRAME_BY_NUMBLKSCOD = {1, 2, 3, 6};
    private static final int[] SAMPLE_RATE_BY_FSCOD = {48000, 44100, 32000};
    private static final int[] SAMPLE_RATE_BY_FSCOD2 = {24000, 22050, 16000};
    private static final int[] CHANNEL_COUNT_BY_ACMOD = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] BITRATE_BY_HALF_FRMSIZECOD = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] SYNCFRAME_SIZE_WORDS_BY_HALF_FRMSIZECOD_44_1 = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* loaded from: classes4.dex */
    public static final class SyncFrameInfo {
        public static final int STREAM_TYPE_TYPE0 = 0;
        public static final int STREAM_TYPE_TYPE1 = 1;
        public static final int STREAM_TYPE_TYPE2 = 2;
        public static final int STREAM_TYPE_UNDEFINED = -1;
        public final int channelCount;
        public final int frameSize;
        public final String mimeType;
        public final int sampleCount;
        public final int sampleRate;
        public final int streamType;

        /* loaded from: classes4.dex */
        public @interface StreamType {
        }

        private SyncFrameInfo(String str, int i8, int i9, int i10, int i11, int i12) {
            this.mimeType = str;
            this.streamType = i8;
            this.channelCount = i9;
            this.sampleRate = i10;
            this.frameSize = i11;
            this.sampleCount = i12;
        }
    }

    private Ac3Util() {
    }

    public static int findTrueHdSyncframeOffset(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i8 = position; i8 <= limit; i8++) {
            if ((byteBuffer.getInt(i8 + 4) & (-16777217)) == -1167101192) {
                return i8 - position;
            }
        }
        return -1;
    }

    public static int getAc3SyncframeAudioSampleCount() {
        return AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT;
    }

    private static int getAc3SyncframeSize(int i8, int i9) {
        int i10 = i9 / 2;
        if (i8 >= 0) {
            int[] iArr = SAMPLE_RATE_BY_FSCOD;
            if (i8 < iArr.length && i9 >= 0) {
                int[] iArr2 = SYNCFRAME_SIZE_WORDS_BY_HALF_FRMSIZECOD_44_1;
                if (i10 < iArr2.length) {
                    int i11 = iArr[i8];
                    if (i11 == 44100) {
                        return (iArr2[i10] + (i9 % 2)) * 2;
                    }
                    int i12 = BITRATE_BY_HALF_FRMSIZECOD[i10];
                    if (i11 == 32000) {
                        return i12 * 6;
                    }
                    return i12 * 4;
                }
                return -1;
            }
            return -1;
        }
        return -1;
    }

    public static Format parseAc3AnnexFFormat(ParsableByteArray parsableByteArray, String str, String str2, DrmInitData drmInitData) {
        int i8 = SAMPLE_RATE_BY_FSCOD[(parsableByteArray.readUnsignedByte() & PsExtractor.AUDIO_STREAM) >> 6];
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int i9 = CHANNEL_COUNT_BY_ACMOD[(readUnsignedByte & 56) >> 3];
        if ((readUnsignedByte & 4) != 0) {
            i9++;
        }
        return Format.createAudioSampleFormat(str, MimeTypes.AUDIO_AC3, null, -1, -1, i9, i8, null, drmInitData, 0, str2);
    }

    public static SyncFrameInfo parseAc3SyncframeInfo(ParsableBitArray parsableBitArray) {
        boolean z8;
        String str;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int readBits;
        int i13;
        int i14;
        int i15;
        String str2;
        int position = parsableBitArray.getPosition();
        parsableBitArray.skipBits(40);
        if (parsableBitArray.readBits(5) == 16) {
            z8 = true;
        } else {
            z8 = false;
        }
        parsableBitArray.setPosition(position);
        int i16 = -1;
        if (z8) {
            parsableBitArray.skipBits(16);
            int readBits2 = parsableBitArray.readBits(2);
            if (readBits2 != 0) {
                if (readBits2 != 1) {
                    if (readBits2 == 2) {
                        i16 = 2;
                    }
                } else {
                    i16 = 1;
                }
            } else {
                i16 = 0;
            }
            parsableBitArray.skipBits(3);
            int readBits3 = (parsableBitArray.readBits(11) + 1) * 2;
            int readBits4 = parsableBitArray.readBits(2);
            if (readBits4 == 3) {
                i14 = SAMPLE_RATE_BY_FSCOD2[parsableBitArray.readBits(2)];
                readBits = 3;
                i13 = 6;
            } else {
                readBits = parsableBitArray.readBits(2);
                i13 = BLOCKS_PER_SYNCFRAME_BY_NUMBLKSCOD[readBits];
                i14 = SAMPLE_RATE_BY_FSCOD[readBits4];
            }
            int i17 = i13 * 256;
            int readBits5 = parsableBitArray.readBits(3);
            boolean readBit = parsableBitArray.readBit();
            int i18 = CHANNEL_COUNT_BY_ACMOD[readBits5] + (readBit ? 1 : 0);
            parsableBitArray.skipBits(10);
            if (parsableBitArray.readBit()) {
                parsableBitArray.skipBits(8);
            }
            if (readBits5 == 0) {
                parsableBitArray.skipBits(5);
                if (parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(8);
                }
            }
            if (i16 == 1 && parsableBitArray.readBit()) {
                parsableBitArray.skipBits(16);
            }
            if (parsableBitArray.readBit()) {
                if (readBits5 > 2) {
                    parsableBitArray.skipBits(2);
                }
                if ((readBits5 & 1) != 0 && readBits5 > 2) {
                    parsableBitArray.skipBits(6);
                }
                if ((readBits5 & 4) != 0) {
                    parsableBitArray.skipBits(6);
                }
                if (readBit && parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(5);
                }
                if (i16 == 0) {
                    if (parsableBitArray.readBit()) {
                        parsableBitArray.skipBits(6);
                    }
                    if (readBits5 == 0 && parsableBitArray.readBit()) {
                        parsableBitArray.skipBits(6);
                    }
                    if (parsableBitArray.readBit()) {
                        parsableBitArray.skipBits(6);
                    }
                    int readBits6 = parsableBitArray.readBits(2);
                    if (readBits6 == 1) {
                        parsableBitArray.skipBits(5);
                    } else if (readBits6 == 2) {
                        parsableBitArray.skipBits(12);
                    } else if (readBits6 == 3) {
                        int readBits7 = parsableBitArray.readBits(5);
                        if (parsableBitArray.readBit()) {
                            parsableBitArray.skipBits(5);
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                if (parsableBitArray.readBit()) {
                                    parsableBitArray.skipBits(4);
                                }
                                if (parsableBitArray.readBit()) {
                                    parsableBitArray.skipBits(4);
                                }
                            }
                        }
                        if (parsableBitArray.readBit()) {
                            parsableBitArray.skipBits(5);
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(7);
                                if (parsableBitArray.readBit()) {
                                    parsableBitArray.skipBits(8);
                                }
                            }
                        }
                        parsableBitArray.skipBits((readBits7 + 2) * 8);
                        parsableBitArray.byteAlign();
                    }
                    if (readBits5 < 2) {
                        if (parsableBitArray.readBit()) {
                            parsableBitArray.skipBits(14);
                        }
                        if (readBits5 == 0 && parsableBitArray.readBit()) {
                            parsableBitArray.skipBits(14);
                        }
                    }
                    if (parsableBitArray.readBit()) {
                        if (readBits == 0) {
                            parsableBitArray.skipBits(5);
                        } else {
                            for (int i19 = 0; i19 < i13; i19++) {
                                if (parsableBitArray.readBit()) {
                                    parsableBitArray.skipBits(5);
                                }
                            }
                        }
                    }
                }
            }
            if (parsableBitArray.readBit()) {
                parsableBitArray.skipBits(5);
                if (readBits5 == 2) {
                    parsableBitArray.skipBits(4);
                }
                if (readBits5 >= 6) {
                    parsableBitArray.skipBits(2);
                }
                if (parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(8);
                }
                if (readBits5 == 0 && parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(8);
                }
                i15 = 3;
                if (readBits4 < 3) {
                    parsableBitArray.skipBit();
                }
            } else {
                i15 = 3;
            }
            if (i16 == 0 && readBits != i15) {
                parsableBitArray.skipBit();
            }
            if (i16 == 2 && (readBits == i15 || parsableBitArray.readBit())) {
                parsableBitArray.skipBits(6);
            }
            if (parsableBitArray.readBit() && parsableBitArray.readBits(6) == 1 && parsableBitArray.readBits(8) == 1) {
                str2 = MimeTypes.AUDIO_E_AC3_JOC;
            } else {
                str2 = MimeTypes.AUDIO_E_AC3;
            }
            str = str2;
            i11 = i16;
            i8 = readBits3;
            i9 = i14;
            i12 = i17;
            i10 = i18;
        } else {
            parsableBitArray.skipBits(32);
            int readBits8 = parsableBitArray.readBits(2);
            int ac3SyncframeSize = getAc3SyncframeSize(readBits8, parsableBitArray.readBits(6));
            parsableBitArray.skipBits(8);
            int readBits9 = parsableBitArray.readBits(3);
            if ((readBits9 & 1) != 0 && readBits9 != 1) {
                parsableBitArray.skipBits(2);
            }
            if ((readBits9 & 4) != 0) {
                parsableBitArray.skipBits(2);
            }
            if (readBits9 == 2) {
                parsableBitArray.skipBits(2);
            }
            int i20 = SAMPLE_RATE_BY_FSCOD[readBits8];
            int i21 = CHANNEL_COUNT_BY_ACMOD[readBits9] + (parsableBitArray.readBit() ? 1 : 0);
            str = MimeTypes.AUDIO_AC3;
            i8 = ac3SyncframeSize;
            i9 = i20;
            i10 = i21;
            i11 = -1;
            i12 = AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT;
        }
        return new SyncFrameInfo(str, i11, i10, i9, i8, i12);
    }

    public static int parseAc3SyncframeSize(byte[] bArr) {
        if (bArr.length < 5) {
            return -1;
        }
        byte b9 = bArr[4];
        return getAc3SyncframeSize((b9 & 192) >> 6, b9 & 63);
    }

    public static Format parseEAc3AnnexFFormat(ParsableByteArray parsableByteArray, String str, String str2, DrmInitData drmInitData) {
        String str3;
        parsableByteArray.skipBytes(2);
        int i8 = SAMPLE_RATE_BY_FSCOD[(parsableByteArray.readUnsignedByte() & PsExtractor.AUDIO_STREAM) >> 6];
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int i9 = CHANNEL_COUNT_BY_ACMOD[(readUnsignedByte & 14) >> 1];
        if ((readUnsignedByte & 1) != 0) {
            i9++;
        }
        if (((parsableByteArray.readUnsignedByte() & 30) >> 1) > 0 && (2 & parsableByteArray.readUnsignedByte()) != 0) {
            i9 += 2;
        }
        int i10 = i9;
        if (parsableByteArray.bytesLeft() > 0 && (parsableByteArray.readUnsignedByte() & 1) != 0) {
            str3 = MimeTypes.AUDIO_E_AC3_JOC;
        } else {
            str3 = MimeTypes.AUDIO_E_AC3;
        }
        return Format.createAudioSampleFormat(str, str3, null, -1, -1, i10, i8, null, drmInitData, 0, str2);
    }

    public static int parseEAc3SyncframeAudioSampleCount(ByteBuffer byteBuffer) {
        int i8 = 6;
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i8 = BLOCKS_PER_SYNCFRAME_BY_NUMBLKSCOD[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4];
        }
        return i8 * 256;
    }

    public static int parseTrueHdSyncframeAudioSampleCount(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b9 = bArr[7];
            if ((b9 & 254) == 186) {
                return 40 << ((bArr[(b9 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }

    public static int parseTrueHdSyncframeAudioSampleCount(ByteBuffer byteBuffer, int i8) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i8) + ((byteBuffer.get((byteBuffer.position() + i8) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }
}
