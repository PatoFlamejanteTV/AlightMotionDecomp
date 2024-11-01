package com.mbridge.msdk.playercommon.exoplayer2.mediacodec;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class MediaCodecUtil {
    private static final SparseIntArray AVC_LEVEL_NUMBER_TO_CONST;
    private static final SparseIntArray AVC_PROFILE_NUMBER_TO_CONST;
    private static final String CODEC_ID_AVC1 = "avc1";
    private static final String CODEC_ID_AVC2 = "avc2";
    private static final String CODEC_ID_HEV1 = "hev1";
    private static final String CODEC_ID_HVC1 = "hvc1";
    private static final Map<String, Integer> HEVC_CODEC_STRING_TO_PROFILE_LEVEL;
    private static final String MTK_RAW_DECODER_NAME = "OMX.MTK.AUDIO.DECODER.RAW";
    private static final String TAG = "MediaCodecUtil";
    private static final String GOOGLE_RAW_DECODER_NAME = "OMX.google.raw.decoder";
    private static final MediaCodecInfo PASSTHROUGH_DECODER_INFO = MediaCodecInfo.newPassthroughInstance(GOOGLE_RAW_DECODER_NAME);
    private static final Pattern PROFILE_PATTERN = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap<CodecKey, List<MediaCodecInfo>> decoderInfosCache = new HashMap<>();
    private static int maxH264DecodableFrameSize = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class CodecKey {
        public final String mimeType;
        public final boolean secure;

        public CodecKey(String str, boolean z8) {
            this.mimeType = str;
            this.secure = z8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != CodecKey.class) {
                return false;
            }
            CodecKey codecKey = (CodecKey) obj;
            if (TextUtils.equals(this.mimeType, codecKey.mimeType) && this.secure == codecKey.secure) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int i8;
            String str = this.mimeType;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = (hashCode + 31) * 31;
            if (this.secure) {
                i8 = 1231;
            } else {
                i8 = 1237;
            }
            return i9 + i8;
        }
    }

    /* loaded from: classes4.dex */
    public static class DecoderQueryException extends Exception {
        private DecoderQueryException(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public interface MediaCodecListCompat {
        int getCodecCount();

        android.media.MediaCodecInfo getCodecInfoAt(int i8);

        boolean isSecurePlaybackSupported(String str, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean secureDecodersExplicit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class MediaCodecListCompatV16 implements MediaCodecListCompat {
        private MediaCodecListCompatV16() {
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public final int getCodecCount() {
            return MediaCodecList.getCodecCount();
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public final android.media.MediaCodecInfo getCodecInfoAt(int i8) {
            return MediaCodecList.getCodecInfoAt(i8);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public final boolean isSecurePlaybackSupported(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return MimeTypes.VIDEO_H264.equals(str);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public final boolean secureDecodersExplicit() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class MediaCodecListCompatV21 implements MediaCodecListCompat {
        private final int codecKind;
        private android.media.MediaCodecInfo[] mediaCodecInfos;

        public MediaCodecListCompatV21(boolean z8) {
            this.codecKind = z8 ? 1 : 0;
        }

        private void ensureMediaCodecInfosInitialized() {
            if (this.mediaCodecInfos == null) {
                this.mediaCodecInfos = new MediaCodecList(this.codecKind).getCodecInfos();
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public final int getCodecCount() {
            ensureMediaCodecInfosInitialized();
            return this.mediaCodecInfos.length;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public final android.media.MediaCodecInfo getCodecInfoAt(int i8) {
            ensureMediaCodecInfosInitialized();
            return this.mediaCodecInfos[i8];
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public final boolean isSecurePlaybackSupported(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported("secure-playback");
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public final boolean secureDecodersExplicit() {
            return true;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        AVC_PROFILE_NUMBER_TO_CONST = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        AVC_LEVEL_NUMBER_TO_CONST = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, 512);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, 2048);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, 65536);
        HashMap hashMap = new HashMap();
        HEVC_CODEC_STRING_TO_PROFILE_LEVEL = hashMap;
        hashMap.put("L30", 1);
        hashMap.put("L60", 4);
        hashMap.put("L63", 16);
        hashMap.put("L90", 64);
        hashMap.put("L93", 256);
        hashMap.put("L120", 1024);
        hashMap.put("L123", 4096);
        hashMap.put("L150", 16384);
        hashMap.put("L153", 65536);
        hashMap.put("L156", 262144);
        hashMap.put("L180", 1048576);
        hashMap.put("L183", 4194304);
        hashMap.put("L186", 16777216);
        hashMap.put("H30", 2);
        hashMap.put("H60", 8);
        hashMap.put("H63", 32);
        hashMap.put("H90", 128);
        hashMap.put("H93", 512);
        hashMap.put("H120", 2048);
        hashMap.put("H123", 8192);
        hashMap.put("H150", 32768);
        hashMap.put("H153", 131072);
        hashMap.put("H156", 524288);
        hashMap.put("H180", 2097152);
        hashMap.put("H183", 8388608);
        hashMap.put("H186", 33554432);
    }

    private MediaCodecUtil() {
    }

    private static void applyWorkarounds(List<MediaCodecInfo> list) {
        if (Util.SDK_INT < 26) {
            if (list.size() > 1 && MTK_RAW_DECODER_NAME.equals(list.get(0).name)) {
                for (int i8 = 1; i8 < list.size(); i8++) {
                    MediaCodecInfo mediaCodecInfo = list.get(i8);
                    if (GOOGLE_RAW_DECODER_NAME.equals(mediaCodecInfo.name)) {
                        list.remove(i8);
                        list.add(0, mediaCodecInfo);
                        return;
                    }
                }
            }
        }
    }

    private static int avcLevelToMaxFrameSize(int i8) {
        if (i8 == 1 || i8 == 2) {
            return 25344;
        }
        switch (i8) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            default:
                return -1;
        }
    }

    private static boolean codecNeedsDisableAdaptationWorkaround(String str) {
        if (Util.SDK_INT <= 22) {
            String str2 = Util.MODEL;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    private static Pair<Integer, Integer> getAvcProfileAndLevel(String str, String[] strArr) {
        Integer valueOf;
        Integer num;
        if (strArr.length < 2) {
            Log.w(TAG, "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                num = Integer.valueOf(Integer.parseInt(strArr[1].substring(0, 2), 16));
                valueOf = Integer.valueOf(Integer.parseInt(strArr[1].substring(4), 16));
            } else if (strArr.length >= 3) {
                Integer valueOf2 = Integer.valueOf(Integer.parseInt(strArr[1]));
                valueOf = Integer.valueOf(Integer.parseInt(strArr[2]));
                num = valueOf2;
            } else {
                Log.w(TAG, "Ignoring malformed AVC codec string: " + str);
                return null;
            }
            int i8 = AVC_PROFILE_NUMBER_TO_CONST.get(num.intValue(), -1);
            if (i8 == -1) {
                Log.w(TAG, "Unknown AVC profile: " + num);
                return null;
            }
            int i9 = AVC_LEVEL_NUMBER_TO_CONST.get(valueOf.intValue(), -1);
            if (i9 == -1) {
                Log.w(TAG, "Unknown AVC level: " + valueOf);
                return null;
            }
            return new Pair<>(Integer.valueOf(i8), Integer.valueOf(i9));
        } catch (NumberFormatException unused) {
            Log.w(TAG, "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0041, code lost:            if (r3.equals(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecUtil.CODEC_ID_AVC1) == false) goto L7;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> getCodecProfileAndLevel(java.lang.String r6) {
        /*
            r0 = 0
            r1 = 0
            if (r6 != 0) goto L5
            return r1
        L5:
            java.lang.String r2 = "\\."
            java.lang.String[] r2 = r6.split(r2)
            r3 = r2[r0]
            r3.hashCode()
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case 3006243: goto L3b;
                case 3006244: goto L30;
                case 3199032: goto L25;
                case 3214780: goto L1a;
                default: goto L18;
            }
        L18:
            r0 = -1
            goto L44
        L1a:
            java.lang.String r0 = "hvc1"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L23
            goto L18
        L23:
            r0 = 3
            goto L44
        L25:
            java.lang.String r0 = "hev1"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L2e
            goto L18
        L2e:
            r0 = 2
            goto L44
        L30:
            java.lang.String r0 = "avc2"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L39
            goto L18
        L39:
            r0 = 1
            goto L44
        L3b:
            java.lang.String r5 = "avc1"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L44
            goto L18
        L44:
            switch(r0) {
                case 0: goto L4d;
                case 1: goto L4d;
                case 2: goto L48;
                case 3: goto L48;
                default: goto L47;
            }
        L47:
            return r1
        L48:
            android.util.Pair r6 = getHevcProfileAndLevel(r6, r2)
            return r6
        L4d:
            android.util.Pair r6 = getAvcProfileAndLevel(r6, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecUtil.getCodecProfileAndLevel(java.lang.String):android.util.Pair");
    }

    public static MediaCodecInfo getDecoderInfo(String str, boolean z8) throws DecoderQueryException {
        List<MediaCodecInfo> decoderInfos = getDecoderInfos(str, z8);
        if (decoderInfos.isEmpty()) {
            return null;
        }
        return decoderInfos.get(0);
    }

    public static synchronized List<MediaCodecInfo> getDecoderInfos(String str, boolean z8) throws DecoderQueryException {
        MediaCodecListCompat mediaCodecListCompatV16;
        synchronized (MediaCodecUtil.class) {
            try {
                CodecKey codecKey = new CodecKey(str, z8);
                HashMap<CodecKey, List<MediaCodecInfo>> hashMap = decoderInfosCache;
                List<MediaCodecInfo> list = hashMap.get(codecKey);
                if (list != null) {
                    return list;
                }
                int i8 = Util.SDK_INT;
                if (i8 >= 21) {
                    mediaCodecListCompatV16 = new MediaCodecListCompatV21(z8);
                } else {
                    mediaCodecListCompatV16 = new MediaCodecListCompatV16();
                }
                ArrayList<MediaCodecInfo> decoderInfosInternal = getDecoderInfosInternal(codecKey, mediaCodecListCompatV16, str);
                if (z8 && decoderInfosInternal.isEmpty() && 21 <= i8 && i8 <= 23) {
                    mediaCodecListCompatV16 = new MediaCodecListCompatV16();
                    decoderInfosInternal = getDecoderInfosInternal(codecKey, mediaCodecListCompatV16, str);
                    if (!decoderInfosInternal.isEmpty()) {
                        Log.w(TAG, "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + decoderInfosInternal.get(0).name);
                    }
                }
                if (MimeTypes.AUDIO_E_AC3_JOC.equals(str)) {
                    decoderInfosInternal.addAll(getDecoderInfosInternal(new CodecKey(MimeTypes.AUDIO_E_AC3, codecKey.secure), mediaCodecListCompatV16, str));
                }
                applyWorkarounds(decoderInfosInternal);
                List<MediaCodecInfo> unmodifiableList = DesugarCollections.unmodifiableList(decoderInfosInternal);
                hashMap.put(codecKey, unmodifiableList);
                return unmodifiableList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:            if (r17.secure != r7) goto L21;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:            r3.add(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo.newInstance(r10, r4, r0, r2, false));     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0055, code lost:            if (r17.secure == false) goto L17;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.ArrayList<com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo> getDecoderInfosInternal(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecUtil.CodecKey r17, com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat r18, java.lang.String r19) throws com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecUtil.getDecoderInfosInternal(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecUtil$CodecKey, com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecUtil$MediaCodecListCompat, java.lang.String):java.util.ArrayList");
    }

    private static Pair<Integer, Integer> getHevcProfileAndLevel(String str, String[] strArr) {
        int i8;
        if (strArr.length < 4) {
            Log.w(TAG, "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        Matcher matcher = PROFILE_PATTERN.matcher(strArr[1]);
        if (!matcher.matches()) {
            Log.w(TAG, "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        String group = matcher.group(1);
        if ("1".equals(group)) {
            i8 = 1;
        } else if ("2".equals(group)) {
            i8 = 2;
        } else {
            Log.w(TAG, "Unknown HEVC profile string: " + group);
            return null;
        }
        Integer num = HEVC_CODEC_STRING_TO_PROFILE_LEVEL.get(strArr[3]);
        if (num == null) {
            Log.w(TAG, "Unknown HEVC level string: " + matcher.group(1));
            return null;
        }
        return new Pair<>(Integer.valueOf(i8), num);
    }

    public static MediaCodecInfo getPassthroughDecoderInfo() {
        return PASSTHROUGH_DECODER_INFO;
    }

    private static boolean isCodecUsableDecoder(android.media.MediaCodecInfo mediaCodecInfo, String str, boolean z8, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z8 && str.endsWith(".secure"))) {
            return false;
        }
        int i8 = Util.SDK_INT;
        if (i8 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i8 < 18 && "OMX.SEC.MP3.Decoder".equals(str)) {
            return false;
        }
        if (i8 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = Util.DEVICE;
            if ("a70".equals(str3) || ("Xiaomi".equals(Util.MANUFACTURER) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i8 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = Util.DEVICE;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i8 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = Util.DEVICE;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i8 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(Util.MANUFACTURER))) {
            String str6 = Util.DEVICE;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i8 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(Util.MANUFACTURER)) {
            String str7 = Util.DEVICE;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i8 <= 19 && Util.DEVICE.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        if (MimeTypes.AUDIO_E_AC3_JOC.equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) {
            return false;
        }
        return true;
    }

    public static int maxH264DecodableFrameSize() throws DecoderQueryException {
        int i8;
        if (maxH264DecodableFrameSize == -1) {
            int i9 = 0;
            MediaCodecInfo decoderInfo = getDecoderInfo(MimeTypes.VIDEO_H264, false);
            if (decoderInfo != null) {
                MediaCodecInfo.CodecProfileLevel[] profileLevels = decoderInfo.getProfileLevels();
                int length = profileLevels.length;
                int i10 = 0;
                while (i9 < length) {
                    i10 = Math.max(avcLevelToMaxFrameSize(profileLevels[i9].level), i10);
                    i9++;
                }
                if (Util.SDK_INT >= 21) {
                    i8 = 345600;
                } else {
                    i8 = 172800;
                }
                i9 = Math.max(i10, i8);
            }
            maxH264DecodableFrameSize = i9;
        }
        return maxH264DecodableFrameSize;
    }

    public static void warmDecoderInfoCache(String str, boolean z8) {
        try {
            getDecoderInfos(str, z8);
        } catch (DecoderQueryException e8) {
            Log.e(TAG, "Codec warming failed", e8);
        }
    }
}
