package com.mbridge.msdk.playercommon.exoplayer2.audio;

import com.google.android.material.internal.ViewUtils;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmInitData;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableBitArray;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class DtsUtil {
    private static final byte FIRST_BYTE_14B_BE = 31;
    private static final byte FIRST_BYTE_14B_LE = -1;
    private static final byte FIRST_BYTE_BE = Byte.MAX_VALUE;
    private static final byte FIRST_BYTE_LE = -2;
    private static final int SYNC_VALUE_14B_BE = 536864768;
    private static final int SYNC_VALUE_14B_LE = -14745368;
    private static final int SYNC_VALUE_BE = 2147385345;
    private static final int SYNC_VALUE_LE = -25230976;
    private static final int[] CHANNELS_BY_AMODE = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] SAMPLE_RATE_BY_SFREQ = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    private static final int[] TWICE_BITRATE_KBPS_BY_RATE = {64, 112, 128, PsExtractor.AUDIO_STREAM, 224, 256, 384, 448, 512, 640, ViewUtils.EDGE_TO_EDGE_FLAGS, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    private DtsUtil() {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int getDtsFrameSize(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 7
            r4 = 6
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4f
            r2 = -1
            if (r1 == r2) goto L3e
            r2 = 31
            if (r1 == r2) goto L26
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r3]
        L20:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
            goto L5e
        L26:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            r7 = r7[r1]
        L36:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = 1
            goto L5e
        L3e:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            r7 = r7[r1]
            goto L36
        L4f:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r4]
            goto L20
        L5e:
            if (r0 == 0) goto L64
            int r7 = r7 * 16
            int r7 = r7 / 14
        L64:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.audio.DtsUtil.getDtsFrameSize(byte[]):int");
    }

    private static ParsableBitArray getNormalizedFrameHeader(byte[] bArr) {
        if (bArr[0] == Byte.MAX_VALUE) {
            return new ParsableBitArray(bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        if (isLittleEndianFrameHeader(copyOf)) {
            for (int i8 = 0; i8 < copyOf.length - 1; i8 += 2) {
                byte b9 = copyOf[i8];
                int i9 = i8 + 1;
                copyOf[i8] = copyOf[i9];
                copyOf[i9] = b9;
            }
        }
        ParsableBitArray parsableBitArray = new ParsableBitArray(copyOf);
        if (copyOf[0] == 31) {
            ParsableBitArray parsableBitArray2 = new ParsableBitArray(copyOf);
            while (parsableBitArray2.bitsLeft() >= 16) {
                parsableBitArray2.skipBits(2);
                parsableBitArray.putInt(parsableBitArray2.readBits(14), 14);
            }
        }
        parsableBitArray.reset(copyOf);
        return parsableBitArray;
    }

    private static boolean isLittleEndianFrameHeader(byte[] bArr) {
        byte b9 = bArr[0];
        if (b9 != -2 && b9 != -1) {
            return false;
        }
        return true;
    }

    public static boolean isSyncWord(int i8) {
        return i8 == SYNC_VALUE_BE || i8 == SYNC_VALUE_LE || i8 == SYNC_VALUE_14B_BE || i8 == SYNC_VALUE_14B_LE;
    }

    public static int parseDtsAudioSampleCount(byte[] bArr) {
        int i8;
        byte b9;
        int i9;
        byte b10;
        byte b11 = bArr[0];
        if (b11 != -2) {
            if (b11 == -1) {
                i8 = (bArr[4] & 7) << 4;
                b10 = bArr[7];
            } else if (b11 != 31) {
                i8 = (bArr[4] & 1) << 6;
                b9 = bArr[5];
            } else {
                i8 = (bArr[5] & 7) << 4;
                b10 = bArr[6];
            }
            i9 = b10 & 60;
            return (((i9 >> 2) | i8) + 1) * 32;
        }
        i8 = (bArr[5] & 1) << 6;
        b9 = bArr[4];
        i9 = b9 & 252;
        return (((i9 >> 2) | i8) + 1) * 32;
    }

    public static Format parseDtsFormat(byte[] bArr, String str, String str2, DrmInitData drmInitData) {
        int i8;
        int i9;
        ParsableBitArray normalizedFrameHeader = getNormalizedFrameHeader(bArr);
        normalizedFrameHeader.skipBits(60);
        int i10 = CHANNELS_BY_AMODE[normalizedFrameHeader.readBits(6)];
        int i11 = SAMPLE_RATE_BY_SFREQ[normalizedFrameHeader.readBits(4)];
        int readBits = normalizedFrameHeader.readBits(5);
        int[] iArr = TWICE_BITRATE_KBPS_BY_RATE;
        if (readBits >= iArr.length) {
            i8 = -1;
        } else {
            i8 = (iArr[readBits] * 1000) / 2;
        }
        normalizedFrameHeader.skipBits(10);
        if (normalizedFrameHeader.readBits(2) > 0) {
            i9 = 1;
        } else {
            i9 = 0;
        }
        return Format.createAudioSampleFormat(str, MimeTypes.AUDIO_DTS, null, i8, -1, i10 + i9, i11, null, drmInitData, 0, str2);
    }

    public static int parseDtsAudioSampleCount(ByteBuffer byteBuffer) {
        int i8;
        byte b9;
        int i9;
        byte b10;
        int position = byteBuffer.position();
        byte b11 = byteBuffer.get(position);
        if (b11 != -2) {
            if (b11 == -1) {
                i8 = (byteBuffer.get(position + 4) & 7) << 4;
                b10 = byteBuffer.get(position + 7);
            } else if (b11 != 31) {
                i8 = (byteBuffer.get(position + 4) & 1) << 6;
                b9 = byteBuffer.get(position + 5);
            } else {
                i8 = (byteBuffer.get(position + 5) & 7) << 4;
                b10 = byteBuffer.get(position + 6);
            }
            i9 = b10 & 60;
            return (((i9 >> 2) | i8) + 1) * 32;
        }
        i8 = (byteBuffer.get(position + 5) & 1) << 6;
        b9 = byteBuffer.get(position + 4);
        i9 = b9 & 252;
        return (((i9 >> 2) | i8) + 1) * 32;
    }
}
