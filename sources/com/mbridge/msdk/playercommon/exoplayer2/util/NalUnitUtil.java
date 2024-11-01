package com.mbridge.msdk.playercommon.exoplayer2.util;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class NalUnitUtil {
    public static final int EXTENDED_SAR = 255;
    private static final int H264_NAL_UNIT_TYPE_SEI = 6;
    private static final int H264_NAL_UNIT_TYPE_SPS = 7;
    private static final int H265_NAL_UNIT_TYPE_PREFIX_SEI = 39;
    private static final String TAG = "NalUnitUtil";
    public static final byte[] NAL_START_CODE = {0, 0, 0, 1};
    public static final float[] ASPECT_RATIO_IDC_VALUES = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object scratchEscapePositionsLock = new Object();
    private static int[] scratchEscapePositions = new int[10];

    /* loaded from: classes4.dex */
    public static final class PpsData {
        public final boolean bottomFieldPicOrderInFramePresentFlag;
        public final int picParameterSetId;
        public final int seqParameterSetId;

        public PpsData(int i8, int i9, boolean z8) {
            this.picParameterSetId = i8;
            this.seqParameterSetId = i9;
            this.bottomFieldPicOrderInFramePresentFlag = z8;
        }
    }

    /* loaded from: classes4.dex */
    public static final class SpsData {
        public final boolean deltaPicOrderAlwaysZeroFlag;
        public final boolean frameMbsOnlyFlag;
        public final int frameNumLength;
        public final int height;
        public final int picOrderCntLsbLength;
        public final int picOrderCountType;
        public final float pixelWidthAspectRatio;
        public final boolean separateColorPlaneFlag;
        public final int seqParameterSetId;
        public final int width;

        public SpsData(int i8, int i9, int i10, float f8, boolean z8, boolean z9, int i11, int i12, int i13, boolean z10) {
            this.seqParameterSetId = i8;
            this.width = i9;
            this.height = i10;
            this.pixelWidthAspectRatio = f8;
            this.separateColorPlaneFlag = z8;
            this.frameMbsOnlyFlag = z9;
            this.frameNumLength = i11;
            this.picOrderCountType = i12;
            this.picOrderCntLsbLength = i13;
            this.deltaPicOrderAlwaysZeroFlag = z10;
        }
    }

    private NalUnitUtil() {
    }

    public static void clearPrefixFlags(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void discardToSps(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int i10 = i8 + 1;
            if (i10 < position) {
                int i11 = byteBuffer.get(i8) & 255;
                if (i9 == 3) {
                    if (i11 == 1 && (byteBuffer.get(i10) & 31) == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i8 - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                } else if (i11 == 0) {
                    i9++;
                }
                if (i11 != 0) {
                    i9 = 0;
                }
                i8 = i10;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0079, code lost:            r9 = true;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int findNalUnit(byte[] r8, int r9, int r10, boolean[] r11) {
        /*
            Method dump skipped, instructions count: 188
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.util.NalUnitUtil.findNalUnit(byte[], int, int, boolean[]):int");
    }

    private static int findNextUnescapeIndex(byte[] bArr, int i8, int i9) {
        while (i8 < i9 - 2) {
            if (bArr[i8] == 0 && bArr[i8 + 1] == 0 && bArr[i8 + 2] == 3) {
                return i8;
            }
            i8++;
        }
        return i9;
    }

    public static int getH265NalUnitType(byte[] bArr, int i8) {
        return (bArr[i8 + 3] & 126) >> 1;
    }

    public static int getNalUnitType(byte[] bArr, int i8) {
        return bArr[i8 + 3] & 31;
    }

    public static boolean isNalUnitSei(String str, byte b9) {
        if (MimeTypes.VIDEO_H264.equals(str) && (b9 & 31) == 6) {
            return true;
        }
        if (MimeTypes.VIDEO_H265.equals(str) && ((b9 & 126) >> 1) == 39) {
            return true;
        }
        return false;
    }

    public static PpsData parsePpsNalUnit(byte[] bArr, int i8, int i9) {
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i8, i9);
        parsableNalUnitBitArray.skipBits(8);
        int readUnsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int readUnsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.skipBit();
        return new PpsData(readUnsignedExpGolombCodedInt, readUnsignedExpGolombCodedInt2, parsableNalUnitBitArray.readBit());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.mbridge.msdk.playercommon.exoplayer2.util.NalUnitUtil.SpsData parseSpsNalUnit(byte[] r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.util.NalUnitUtil.parseSpsNalUnit(byte[], int, int):com.mbridge.msdk.playercommon.exoplayer2.util.NalUnitUtil$SpsData");
    }

    private static void skipScalingList(ParsableNalUnitBitArray parsableNalUnitBitArray, int i8) {
        int i9 = 8;
        int i10 = 8;
        for (int i11 = 0; i11 < i8; i11++) {
            if (i9 != 0) {
                i9 = ((parsableNalUnitBitArray.readSignedExpGolombCodedInt() + i10) + 256) % 256;
            }
            if (i9 != 0) {
                i10 = i9;
            }
        }
    }

    public static int unescapeStream(byte[] bArr, int i8) {
        int i9;
        synchronized (scratchEscapePositionsLock) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < i8) {
                try {
                    i10 = findNextUnescapeIndex(bArr, i10, i8);
                    if (i10 < i8) {
                        int[] iArr = scratchEscapePositions;
                        if (iArr.length <= i11) {
                            scratchEscapePositions = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        scratchEscapePositions[i11] = i10;
                        i10 += 3;
                        i11++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i9 = i8 - i11;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i11; i14++) {
                int i15 = scratchEscapePositions[i14] - i13;
                System.arraycopy(bArr, i13, bArr, i12, i15);
                int i16 = i12 + i15;
                int i17 = i16 + 1;
                bArr[i16] = 0;
                i12 = i16 + 2;
                bArr[i17] = 0;
                i13 += i15 + 3;
            }
            System.arraycopy(bArr, i13, bArr, i12, i9 - i12);
        }
        return i9;
    }
}
