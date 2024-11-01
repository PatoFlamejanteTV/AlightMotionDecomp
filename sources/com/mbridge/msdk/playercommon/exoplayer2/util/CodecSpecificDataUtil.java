package com.mbridge.msdk.playercommon.exoplayer2.util;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class CodecSpecificDataUtil {
    private static final int AUDIO_OBJECT_TYPE_AAC_LC = 2;
    private static final int AUDIO_OBJECT_TYPE_ER_BSAC = 22;
    private static final int AUDIO_OBJECT_TYPE_ESCAPE = 31;
    private static final int AUDIO_OBJECT_TYPE_PS = 29;
    private static final int AUDIO_OBJECT_TYPE_SBR = 5;
    private static final int AUDIO_SPECIFIC_CONFIG_CHANNEL_CONFIGURATION_INVALID = -1;
    private static final int AUDIO_SPECIFIC_CONFIG_FREQUENCY_INDEX_ARBITRARY = 15;
    private static final byte[] NAL_START_CODE = {0, 0, 0, 1};
    private static final int[] AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] AUDIO_SPECIFIC_CONFIG_CHANNEL_COUNT_TABLE = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    private CodecSpecificDataUtil() {
    }

    public static byte[] buildAacAudioSpecificConfig(int i8, int i9, int i10) {
        return new byte[]{(byte) (((i8 << 3) & 248) | ((i9 >> 1) & 7)), (byte) (((i9 << 7) & 128) | ((i10 << 3) & 120))};
    }

    public static byte[] buildAacLcAudioSpecificConfig(int i8, int i9) {
        int i10 = 0;
        int i11 = 0;
        int i12 = -1;
        while (true) {
            int[] iArr = AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE;
            if (i11 >= iArr.length) {
                break;
            }
            if (i8 == iArr[i11]) {
                i12 = i11;
            }
            i11++;
        }
        int i13 = -1;
        while (true) {
            int[] iArr2 = AUDIO_SPECIFIC_CONFIG_CHANNEL_COUNT_TABLE;
            if (i10 >= iArr2.length) {
                break;
            }
            if (i9 == iArr2[i10]) {
                i13 = i10;
            }
            i10++;
        }
        if (i8 != -1 && i13 != -1) {
            return buildAacAudioSpecificConfig(2, i12, i13);
        }
        throw new IllegalArgumentException("Invalid sample rate or number of channels: " + i8 + ", " + i9);
    }

    public static byte[] buildNalUnit(byte[] bArr, int i8, int i9) {
        byte[] bArr2 = NAL_START_CODE;
        byte[] bArr3 = new byte[bArr2.length + i9];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i8, bArr3, bArr2.length, i9);
        return bArr3;
    }

    private static int findNalStartCode(byte[] bArr, int i8) {
        int length = bArr.length - NAL_START_CODE.length;
        while (i8 <= length) {
            if (isNalStartCode(bArr, i8)) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    private static int getAacAudioObjectType(ParsableBitArray parsableBitArray) {
        int readBits = parsableBitArray.readBits(5);
        if (readBits == 31) {
            return parsableBitArray.readBits(6) + 32;
        }
        return readBits;
    }

    private static int getAacSamplingFrequency(ParsableBitArray parsableBitArray) {
        boolean z8;
        int readBits = parsableBitArray.readBits(4);
        if (readBits == 15) {
            return parsableBitArray.readBits(24);
        }
        if (readBits < 13) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkArgument(z8);
        return AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE[readBits];
    }

    private static boolean isNalStartCode(byte[] bArr, int i8) {
        if (bArr.length - i8 <= NAL_START_CODE.length) {
            return false;
        }
        int i9 = 0;
        while (true) {
            byte[] bArr2 = NAL_START_CODE;
            if (i9 < bArr2.length) {
                if (bArr[i8 + i9] != bArr2[i9]) {
                    return false;
                }
                i9++;
            } else {
                return true;
            }
        }
    }

    public static Pair<Integer, Integer> parseAacAudioSpecificConfig(byte[] bArr) throws ParserException {
        return parseAacAudioSpecificConfig(new ParsableBitArray(bArr), false);
    }

    private static void parseGaSpecificConfig(ParsableBitArray parsableBitArray, int i8, int i9) {
        parsableBitArray.skipBits(1);
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(14);
        }
        boolean readBit = parsableBitArray.readBit();
        if (i9 != 0) {
            if (i8 == 6 || i8 == 20) {
                parsableBitArray.skipBits(3);
            }
            if (readBit) {
                if (i8 == 22) {
                    parsableBitArray.skipBits(16);
                }
                if (i8 == 17 || i8 == 19 || i8 == 20 || i8 == 23) {
                    parsableBitArray.skipBits(3);
                }
                parsableBitArray.skipBits(1);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException();
    }

    public static byte[][] splitNalUnits(byte[] bArr) {
        int length;
        if (!isNalStartCode(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        do {
            arrayList.add(Integer.valueOf(i8));
            i8 = findNalStartCode(bArr, i8 + NAL_START_CODE.length);
        } while (i8 != -1);
        byte[][] bArr2 = new byte[arrayList.size()];
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            int intValue = ((Integer) arrayList.get(i9)).intValue();
            if (i9 < arrayList.size() - 1) {
                length = ((Integer) arrayList.get(i9 + 1)).intValue();
            } else {
                length = bArr.length;
            }
            int i10 = length - intValue;
            byte[] bArr3 = new byte[i10];
            System.arraycopy(bArr, intValue, bArr3, 0, i10);
            bArr2[i9] = bArr3;
        }
        return bArr2;
    }

    public static Pair<Integer, Integer> parseAacAudioSpecificConfig(ParsableBitArray parsableBitArray, boolean z8) throws ParserException {
        int aacAudioObjectType = getAacAudioObjectType(parsableBitArray);
        int aacSamplingFrequency = getAacSamplingFrequency(parsableBitArray);
        int readBits = parsableBitArray.readBits(4);
        if (aacAudioObjectType == 5 || aacAudioObjectType == 29) {
            aacSamplingFrequency = getAacSamplingFrequency(parsableBitArray);
            aacAudioObjectType = getAacAudioObjectType(parsableBitArray);
            if (aacAudioObjectType == 22) {
                readBits = parsableBitArray.readBits(4);
            }
        }
        if (z8) {
            if (aacAudioObjectType != 1 && aacAudioObjectType != 2 && aacAudioObjectType != 3 && aacAudioObjectType != 4 && aacAudioObjectType != 6 && aacAudioObjectType != 7 && aacAudioObjectType != 17) {
                switch (aacAudioObjectType) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw new ParserException("Unsupported audio object type: " + aacAudioObjectType);
                }
            }
            parseGaSpecificConfig(parsableBitArray, aacAudioObjectType, readBits);
            switch (aacAudioObjectType) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int readBits2 = parsableBitArray.readBits(2);
                    if (readBits2 == 2 || readBits2 == 3) {
                        throw new ParserException("Unsupported epConfig: " + readBits2);
                    }
            }
        }
        int i8 = AUDIO_SPECIFIC_CONFIG_CHANNEL_COUNT_TABLE[readBits];
        Assertions.checkArgument(i8 != -1);
        return Pair.create(Integer.valueOf(aacSamplingFrequency), Integer.valueOf(i8));
    }
}
