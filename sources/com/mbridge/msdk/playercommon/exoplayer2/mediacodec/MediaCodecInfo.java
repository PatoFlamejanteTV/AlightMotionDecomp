package com.mbridge.msdk.playercommon.exoplayer2.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

/* loaded from: classes4.dex */
public final class MediaCodecInfo {
    public static final int MAX_SUPPORTED_INSTANCES_UNKNOWN = -1;
    public static final String TAG = "MediaCodecInfo";
    public final boolean adaptive;
    public final MediaCodecInfo.CodecCapabilities capabilities;
    public final String mimeType;
    public final String name;
    public final boolean passthrough;
    public final boolean secure;
    public final boolean tunneling;

    private MediaCodecInfo(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z8, boolean z9, boolean z10) {
        boolean z11;
        boolean z12;
        this.name = (String) Assertions.checkNotNull(str);
        this.mimeType = str2;
        this.capabilities = codecCapabilities;
        this.passthrough = z8;
        boolean z13 = false;
        if (!z9 && codecCapabilities != null && isAdaptive(codecCapabilities)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.adaptive = z11;
        if (codecCapabilities != null && isTunneling(codecCapabilities)) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.tunneling = z12;
        if (z10 || (codecCapabilities != null && isSecure(codecCapabilities))) {
            z13 = true;
        }
        this.secure = z13;
    }

    private static int adjustMaxInputChannelCount(String str, String str2, int i8) {
        int i9;
        if (i8 <= 1 && ((Util.SDK_INT < 26 || i8 <= 0) && !MimeTypes.AUDIO_MPEG.equals(str2) && !MimeTypes.AUDIO_AMR_NB.equals(str2) && !MimeTypes.AUDIO_AMR_WB.equals(str2) && !MimeTypes.AUDIO_AAC.equals(str2) && !MimeTypes.AUDIO_VORBIS.equals(str2) && !MimeTypes.AUDIO_OPUS.equals(str2) && !MimeTypes.AUDIO_RAW.equals(str2) && !MimeTypes.AUDIO_FLAC.equals(str2) && !MimeTypes.AUDIO_ALAW.equals(str2) && !MimeTypes.AUDIO_MLAW.equals(str2) && !MimeTypes.AUDIO_MSGSM.equals(str2))) {
            if (MimeTypes.AUDIO_AC3.equals(str2)) {
                i9 = 6;
            } else if (MimeTypes.AUDIO_E_AC3.equals(str2)) {
                i9 = 16;
            } else {
                i9 = 30;
            }
            Log.w(TAG, "AssumedMaxChannelAdjustment: " + str + ", [" + i8 + " to " + i9 + "]");
            return i9;
        }
        return i8;
    }

    private static boolean areSizeAndRateSupportedV21(MediaCodecInfo.VideoCapabilities videoCapabilities, int i8, int i9, double d8) {
        if (d8 != -1.0d && d8 > 0.0d) {
            return videoCapabilities.areSizeAndRateSupported(i8, i9, d8);
        }
        return videoCapabilities.isSizeSupported(i8, i9);
    }

    private static int getMaxSupportedInstancesV23(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        int maxSupportedInstances;
        maxSupportedInstances = codecCapabilities.getMaxSupportedInstances();
        return maxSupportedInstances;
    }

    private static boolean isAdaptive(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if (Util.SDK_INT >= 19 && isAdaptiveV19(codecCapabilities)) {
            return true;
        }
        return false;
    }

    private static boolean isAdaptiveV19(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private static boolean isSecure(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if (Util.SDK_INT >= 21 && isSecureV21(codecCapabilities)) {
            return true;
        }
        return false;
    }

    private static boolean isSecureV21(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean isTunneling(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if (Util.SDK_INT >= 21 && isTunnelingV21(codecCapabilities)) {
            return true;
        }
        return false;
    }

    private static boolean isTunnelingV21(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private void logAssumedSupport(String str) {
        Log.d(TAG, "AssumedSupport [" + str + "] [" + this.name + ", " + this.mimeType + "] [" + Util.DEVICE_DEBUG_INFO + "]");
    }

    private void logNoSupport(String str) {
        Log.d(TAG, "NoSupport [" + str + "] [" + this.name + ", " + this.mimeType + "] [" + Util.DEVICE_DEBUG_INFO + "]");
    }

    public static MediaCodecInfo newInstance(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return new MediaCodecInfo(str, str2, codecCapabilities, false, false, false);
    }

    public static MediaCodecInfo newPassthroughInstance(String str) {
        return new MediaCodecInfo(str, null, null, true, false, false);
    }

    public final Point alignVideoSizeV21(int i8, int i9) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            logNoSupport("align.caps");
            return null;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            logNoSupport("align.vCaps");
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(Util.ceilDivide(i8, widthAlignment) * widthAlignment, Util.ceilDivide(i9, heightAlignment) * heightAlignment);
    }

    public final int getMaxSupportedInstances() {
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        if (Util.SDK_INT >= 23 && (codecCapabilities = this.capabilities) != null) {
            return getMaxSupportedInstancesV23(codecCapabilities);
        }
        return -1;
    }

    public final MediaCodecInfo.CodecProfileLevel[] getProfileLevels() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            return new MediaCodecInfo.CodecProfileLevel[0];
        }
        return codecProfileLevelArr;
    }

    public final boolean isAudioChannelCountSupportedV21(int i8) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            logNoSupport("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            logNoSupport("channelCount.aCaps");
            return false;
        }
        if (adjustMaxInputChannelCount(this.name, this.mimeType, audioCapabilities.getMaxInputChannelCount()) < i8) {
            logNoSupport("channelCount.support, " + i8);
            return false;
        }
        return true;
    }

    public final boolean isAudioSampleRateSupportedV21(int i8) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            logNoSupport("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            logNoSupport("sampleRate.aCaps");
            return false;
        }
        if (!audioCapabilities.isSampleRateSupported(i8)) {
            logNoSupport("sampleRate.support, " + i8);
            return false;
        }
        return true;
    }

    public final boolean isCodecSupported(String str) {
        String mediaMimeType;
        if (str == null || this.mimeType == null || (mediaMimeType = MimeTypes.getMediaMimeType(str)) == null) {
            return true;
        }
        if (!this.mimeType.equals(mediaMimeType)) {
            logNoSupport("codec.mime " + str + ", " + mediaMimeType);
            return false;
        }
        Pair<Integer, Integer> codecProfileAndLevel = MediaCodecUtil.getCodecProfileAndLevel(str);
        if (codecProfileAndLevel == null) {
            return true;
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : getProfileLevels()) {
            if (codecProfileLevel.profile == ((Integer) codecProfileAndLevel.first).intValue() && codecProfileLevel.level >= ((Integer) codecProfileAndLevel.second).intValue()) {
                return true;
            }
        }
        logNoSupport("codec.profileLevel, " + str + ", " + mediaMimeType);
        return false;
    }

    public final boolean isVideoSizeAndRateSupportedV21(int i8, int i9, double d8) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            logNoSupport("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            logNoSupport("sizeAndRate.vCaps");
            return false;
        }
        if (!areSizeAndRateSupportedV21(videoCapabilities, i8, i9, d8)) {
            if (i8 < i9 && areSizeAndRateSupportedV21(videoCapabilities, i9, i8, d8)) {
                logAssumedSupport("sizeAndRate.rotated, " + i8 + "x" + i9 + "x" + d8);
                return true;
            }
            logNoSupport("sizeAndRate.support, " + i8 + "x" + i9 + "x" + d8);
            return false;
        }
        return true;
    }

    public static MediaCodecInfo newInstance(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z8, boolean z9) {
        return new MediaCodecInfo(str, str2, codecCapabilities, false, z8, z9);
    }
}
