package com.mbridge.msdk.playercommon.exoplayer2.util;

import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class MimeTypes {
    public static final String APPLICATION_CAMERA_MOTION = "application/x-camera-motion";
    public static final String APPLICATION_CEA608 = "application/cea-608";
    public static final String APPLICATION_CEA708 = "application/cea-708";
    public static final String APPLICATION_DVBSUBS = "application/dvbsubs";
    public static final String APPLICATION_EMSG = "application/x-emsg";
    public static final String APPLICATION_EXIF = "application/x-exif";
    public static final String APPLICATION_ID3 = "application/id3";
    public static final String APPLICATION_M3U8 = "application/x-mpegURL";
    public static final String APPLICATION_MP4 = "application/mp4";
    public static final String APPLICATION_MP4CEA608 = "application/x-mp4-cea-608";
    public static final String APPLICATION_MP4VTT = "application/x-mp4-vtt";
    public static final String APPLICATION_MPD = "application/dash+xml";
    public static final String APPLICATION_PGS = "application/pgs";
    public static final String APPLICATION_RAWCC = "application/x-rawcc";
    public static final String APPLICATION_SCTE35 = "application/x-scte35";
    public static final String APPLICATION_SS = "application/vnd.ms-sstr+xml";
    public static final String APPLICATION_SUBRIP = "application/x-subrip";
    public static final String APPLICATION_TTML = "application/ttml+xml";
    public static final String APPLICATION_TX3G = "application/x-quicktime-tx3g";
    public static final String APPLICATION_VOBSUB = "application/vobsub";
    public static final String APPLICATION_WEBM = "application/webm";
    public static final String AUDIO_AAC = "audio/mp4a-latm";
    public static final String AUDIO_AC3 = "audio/ac3";
    public static final String AUDIO_ALAC = "audio/alac";
    public static final String AUDIO_ALAW = "audio/g711-alaw";
    public static final String AUDIO_AMR_NB = "audio/3gpp";
    public static final String AUDIO_AMR_WB = "audio/amr-wb";
    public static final String AUDIO_DTS = "audio/vnd.dts";
    public static final String AUDIO_DTS_EXPRESS = "audio/vnd.dts.hd;profile=lbr";
    public static final String AUDIO_DTS_HD = "audio/vnd.dts.hd";
    public static final String AUDIO_E_AC3 = "audio/eac3";
    public static final String AUDIO_E_AC3_JOC = "audio/eac3-joc";
    public static final String AUDIO_FLAC = "audio/flac";
    public static final String AUDIO_MLAW = "audio/g711-mlaw";
    public static final String AUDIO_MP4 = "audio/mp4";
    public static final String AUDIO_MPEG = "audio/mpeg";
    public static final String AUDIO_MPEG_L1 = "audio/mpeg-L1";
    public static final String AUDIO_MPEG_L2 = "audio/mpeg-L2";
    public static final String AUDIO_MSGSM = "audio/gsm";
    public static final String AUDIO_OPUS = "audio/opus";
    public static final String AUDIO_RAW = "audio/raw";
    public static final String AUDIO_TRUEHD = "audio/true-hd";
    public static final String AUDIO_UNKNOWN = "audio/x-unknown";
    public static final String AUDIO_VORBIS = "audio/vorbis";
    public static final String AUDIO_WEBM = "audio/webm";
    public static final String BASE_TYPE_APPLICATION = "application";
    public static final String BASE_TYPE_AUDIO = "audio";
    public static final String BASE_TYPE_TEXT = "text";
    public static final String BASE_TYPE_VIDEO = "video";
    public static final String TEXT_SSA = "text/x-ssa";
    public static final String TEXT_VTT = "text/vtt";
    public static final String VIDEO_H263 = "video/3gpp";
    public static final String VIDEO_H264 = "video/avc";
    public static final String VIDEO_H265 = "video/hevc";
    public static final String VIDEO_MP4 = "video/mp4";
    public static final String VIDEO_MP4V = "video/mp4v-es";
    public static final String VIDEO_MPEG = "video/mpeg";
    public static final String VIDEO_MPEG2 = "video/mpeg2";
    public static final String VIDEO_UNKNOWN = "video/x-unknown";
    public static final String VIDEO_VC1 = "video/wvc1";
    public static final String VIDEO_VP8 = "video/x-vnd.on2.vp8";
    public static final String VIDEO_VP9 = "video/x-vnd.on2.vp9";
    public static final String VIDEO_WEBM = "video/webm";
    private static final ArrayList<CustomMimeType> customMimeTypes = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class CustomMimeType {
        public final String codecPrefix;
        public final String mimeType;
        public final int trackType;

        public CustomMimeType(String str, String str2, int i8) {
            this.mimeType = str;
            this.codecPrefix = str2;
            this.trackType = i8;
        }
    }

    private MimeTypes() {
    }

    public static String getAudioMediaMimeType(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : Util.split(str, ",")) {
            String mediaMimeType = getMediaMimeType(str2);
            if (mediaMimeType != null && isAudio(mediaMimeType)) {
                return mediaMimeType;
            }
        }
        return null;
    }

    private static String getCustomMimeTypeForCodec(String str) {
        int size = customMimeTypes.size();
        for (int i8 = 0; i8 < size; i8++) {
            CustomMimeType customMimeType = customMimeTypes.get(i8);
            if (str.startsWith(customMimeType.codecPrefix)) {
                return customMimeType.mimeType;
            }
        }
        return null;
    }

    public static int getEncoding(String str) {
        str.hashCode();
        char c8 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(AUDIO_E_AC3_JOC)) {
                    c8 = 0;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals(AUDIO_DTS)) {
                    c8 = 1;
                    break;
                }
                break;
            case 187078296:
                if (str.equals(AUDIO_AC3)) {
                    c8 = 2;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals(AUDIO_E_AC3)) {
                    c8 = 3;
                    break;
                }
                break;
            case 1505942594:
                if (str.equals(AUDIO_DTS_HD)) {
                    c8 = 4;
                    break;
                }
                break;
            case 1556697186:
                if (str.equals(AUDIO_TRUEHD)) {
                    c8 = 5;
                    break;
                }
                break;
        }
        switch (c8) {
            case 0:
            case 3:
                return 6;
            case 1:
                return 7;
            case 2:
                return 5;
            case 4:
                return 8;
            case 5:
                return 14;
            default:
                return 0;
        }
    }

    public static String getMediaMimeType(String str) {
        String str2 = null;
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (!trim.startsWith("avc1") && !trim.startsWith("avc3")) {
            if (!trim.startsWith("hev1") && !trim.startsWith("hvc1")) {
                if (!trim.startsWith("vp9") && !trim.startsWith("vp09")) {
                    if (!trim.startsWith("vp8") && !trim.startsWith("vp08")) {
                        if (trim.startsWith("mp4a")) {
                            if (trim.startsWith("mp4a.")) {
                                String substring = trim.substring(5);
                                if (substring.length() >= 2) {
                                    try {
                                        str2 = getMimeTypeFromMp4ObjectType(Integer.parseInt(Util.toUpperInvariant(substring.substring(0, 2)), 16));
                                    } catch (NumberFormatException unused) {
                                    }
                                }
                            }
                            if (str2 == null) {
                                return AUDIO_AAC;
                            }
                            return str2;
                        }
                        if (!trim.startsWith("ac-3") && !trim.startsWith("dac3")) {
                            if (!trim.startsWith("ec-3") && !trim.startsWith("dec3")) {
                                if (trim.startsWith("ec+3")) {
                                    return AUDIO_E_AC3_JOC;
                                }
                                if (!trim.startsWith("dtsc") && !trim.startsWith("dtse")) {
                                    if (!trim.startsWith("dtsh") && !trim.startsWith("dtsl")) {
                                        if (trim.startsWith("opus")) {
                                            return AUDIO_OPUS;
                                        }
                                        if (trim.startsWith("vorbis")) {
                                            return AUDIO_VORBIS;
                                        }
                                        return getCustomMimeTypeForCodec(trim);
                                    }
                                    return AUDIO_DTS_HD;
                                }
                                return AUDIO_DTS;
                            }
                            return AUDIO_E_AC3;
                        }
                        return AUDIO_AC3;
                    }
                    return VIDEO_VP8;
                }
                return VIDEO_VP9;
            }
            return VIDEO_H265;
        }
        return VIDEO_H264;
    }

    public static String getMimeTypeFromMp4ObjectType(int i8) {
        if (i8 != 32) {
            if (i8 != 33) {
                if (i8 != 35) {
                    if (i8 != 64) {
                        if (i8 != 163) {
                            if (i8 != 177) {
                                if (i8 != 165) {
                                    if (i8 != 166) {
                                        switch (i8) {
                                            case 96:
                                            case 97:
                                            case 98:
                                            case 99:
                                            case 100:
                                            case 101:
                                                return VIDEO_MPEG2;
                                            case 102:
                                            case 103:
                                            case 104:
                                                return AUDIO_AAC;
                                            case 105:
                                            case 107:
                                                return AUDIO_MPEG;
                                            case 106:
                                                return VIDEO_MPEG;
                                            default:
                                                switch (i8) {
                                                    case 169:
                                                    case 172:
                                                        return AUDIO_DTS;
                                                    case 170:
                                                    case 171:
                                                        return AUDIO_DTS_HD;
                                                    case 173:
                                                        return AUDIO_OPUS;
                                                    default:
                                                        return null;
                                                }
                                        }
                                    }
                                    return AUDIO_E_AC3;
                                }
                                return AUDIO_AC3;
                            }
                            return VIDEO_VP9;
                        }
                        return VIDEO_VC1;
                    }
                    return AUDIO_AAC;
                }
                return VIDEO_H265;
            }
            return VIDEO_H264;
        }
        return VIDEO_MP4V;
    }

    private static String getTopLevelType(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        throw new IllegalArgumentException("Invalid mime type: " + str);
    }

    public static int getTrackType(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (isAudio(str)) {
            return 1;
        }
        if (isVideo(str)) {
            return 2;
        }
        if (!isText(str) && !APPLICATION_CEA608.equals(str) && !APPLICATION_CEA708.equals(str) && !APPLICATION_MP4CEA608.equals(str) && !APPLICATION_SUBRIP.equals(str) && !APPLICATION_TTML.equals(str) && !APPLICATION_TX3G.equals(str) && !APPLICATION_MP4VTT.equals(str) && !APPLICATION_RAWCC.equals(str) && !APPLICATION_VOBSUB.equals(str) && !APPLICATION_PGS.equals(str) && !APPLICATION_DVBSUBS.equals(str)) {
            if (!APPLICATION_ID3.equals(str) && !APPLICATION_EMSG.equals(str) && !APPLICATION_SCTE35.equals(str) && !APPLICATION_CAMERA_MOTION.equals(str)) {
                return getTrackTypeForCustomMimeType(str);
            }
            return 4;
        }
        return 3;
    }

    private static int getTrackTypeForCustomMimeType(String str) {
        int size = customMimeTypes.size();
        for (int i8 = 0; i8 < size; i8++) {
            CustomMimeType customMimeType = customMimeTypes.get(i8);
            if (str.equals(customMimeType.mimeType)) {
                return customMimeType.trackType;
            }
        }
        return -1;
    }

    public static int getTrackTypeOfCodec(String str) {
        return getTrackType(getMediaMimeType(str));
    }

    public static String getVideoMediaMimeType(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : Util.split(str, ",")) {
            String mediaMimeType = getMediaMimeType(str2);
            if (mediaMimeType != null && isVideo(mediaMimeType)) {
                return mediaMimeType;
            }
        }
        return null;
    }

    public static boolean isApplication(String str) {
        return BASE_TYPE_APPLICATION.equals(getTopLevelType(str));
    }

    public static boolean isAudio(String str) {
        return BASE_TYPE_AUDIO.equals(getTopLevelType(str));
    }

    public static boolean isText(String str) {
        return BASE_TYPE_TEXT.equals(getTopLevelType(str));
    }

    public static boolean isVideo(String str) {
        return BASE_TYPE_VIDEO.equals(getTopLevelType(str));
    }

    public static void registerCustomMimeType(String str, String str2, int i8) {
        CustomMimeType customMimeType = new CustomMimeType(str, str2, i8);
        int size = customMimeTypes.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                break;
            }
            ArrayList<CustomMimeType> arrayList = customMimeTypes;
            if (str.equals(arrayList.get(i9).mimeType)) {
                arrayList.remove(i9);
                break;
            }
            i9++;
        }
        customMimeTypes.add(customMimeType);
    }
}
