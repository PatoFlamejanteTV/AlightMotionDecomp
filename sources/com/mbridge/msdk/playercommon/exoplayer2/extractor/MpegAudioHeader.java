package com.mbridge.msdk.playercommon.exoplayer2.extractor;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes4.dex */
public final class MpegAudioHeader {
    public static final int MAX_FRAME_SIZE_BYTES = 4096;
    public int bitrate;
    public int channels;
    public int frameSize;
    public String mimeType;
    public int sampleRate;
    public int samplesPerFrame;
    public int version;
    private static final String[] MIME_TYPE_BY_LAYER = {MimeTypes.AUDIO_MPEG_L1, MimeTypes.AUDIO_MPEG_L2, MimeTypes.AUDIO_MPEG};
    private static final int[] SAMPLING_RATE_V1 = {44100, 48000, 32000};
    private static final int[] BITRATE_V1_L1 = {32, 64, 96, 128, 160, PsExtractor.AUDIO_STREAM, 224, 256, 288, 320, 352, 384, TypedValues.CycleType.TYPE_PATH_ROTATE, 448};
    private static final int[] BITRATE_V2_L1 = {32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, PsExtractor.AUDIO_STREAM, 224, 256};
    private static final int[] BITRATE_V1_L2 = {32, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, 256, 320, 384};
    private static final int[] BITRATE_V1_L3 = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, 256, 320};
    private static final int[] BITRATE_V2 = {8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160};

    public static int getFrameSize(int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if ((i8 & (-2097152)) != -2097152 || (i9 = (i8 >>> 19) & 3) == 1 || (i10 = (i8 >>> 17) & 3) == 0 || (i11 = (i8 >>> 12) & 15) == 0 || i11 == 15 || (i12 = (i8 >>> 10) & 3) == 3) {
            return -1;
        }
        int i15 = SAMPLING_RATE_V1[i12];
        if (i9 == 2) {
            i15 /= 2;
        } else if (i9 == 0) {
            i15 /= 4;
        }
        int i16 = (i8 >>> 9) & 1;
        if (i10 == 3) {
            if (i9 == 3) {
                i14 = BITRATE_V1_L1[i11 - 1];
            } else {
                i14 = BITRATE_V2_L1[i11 - 1];
            }
            return (((i14 * 12000) / i15) + i16) * 4;
        }
        if (i9 == 3) {
            if (i10 == 2) {
                i13 = BITRATE_V1_L2[i11 - 1];
            } else {
                i13 = BITRATE_V1_L3[i11 - 1];
            }
        } else {
            i13 = BITRATE_V2[i11 - 1];
        }
        int i17 = 144000;
        if (i9 == 3) {
            return ((i13 * 144000) / i15) + i16;
        }
        if (i10 == 1) {
            i17 = DefaultOggSeeker.MATCH_RANGE;
        }
        return ((i17 * i13) / i15) + i16;
    }

    public static boolean populateHeader(int i8, MpegAudioHeader mpegAudioHeader) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        if ((i8 & (-2097152)) != -2097152 || (i9 = (i8 >>> 19) & 3) == 1 || (i10 = (i8 >>> 17) & 3) == 0 || (i11 = (i8 >>> 12) & 15) == 0 || i11 == 15 || (i12 = (i8 >>> 10) & 3) == 3) {
            return false;
        }
        int i18 = SAMPLING_RATE_V1[i12];
        if (i9 == 2) {
            i18 /= 2;
        } else if (i9 == 0) {
            i18 /= 4;
        }
        int i19 = i18;
        int i20 = (i8 >>> 9) & 1;
        if (i10 == 3) {
            if (i9 == 3) {
                i13 = BITRATE_V1_L1[i11 - 1];
            } else {
                i13 = BITRATE_V2_L1[i11 - 1];
            }
            i16 = (((i13 * 12000) / i19) + i20) * 4;
            i15 = 384;
        } else {
            int i21 = 1152;
            if (i9 == 3) {
                if (i10 == 2) {
                    i13 = BITRATE_V1_L2[i11 - 1];
                } else {
                    i13 = BITRATE_V1_L3[i11 - 1];
                }
            } else {
                i13 = BITRATE_V2[i11 - 1];
                if (i10 == 1) {
                    i21 = 576;
                }
                if (i10 == 1) {
                    i14 = DefaultOggSeeker.MATCH_RANGE;
                    i15 = i21;
                    i16 = ((i14 * i13) / i19) + i20;
                }
            }
            i14 = 144000;
            i15 = i21;
            i16 = ((i14 * i13) / i19) + i20;
        }
        String str = MIME_TYPE_BY_LAYER[3 - i10];
        if (((i8 >> 6) & 3) == 3) {
            i17 = 1;
        } else {
            i17 = 2;
        }
        mpegAudioHeader.setValues(i9, str, i16, i19, i17, i13 * 1000, i15);
        return true;
    }

    private void setValues(int i8, String str, int i9, int i10, int i11, int i12, int i13) {
        this.version = i8;
        this.mimeType = str;
        this.frameSize = i9;
        this.sampleRate = i10;
        this.channels = i11;
        this.bitrate = i12;
        this.samplesPerFrame = i13;
    }
}
