package com.mbridge.msdk.playercommon.exoplayer2.mediacodec;

import android.media.MediaFormat;
import com.mbridge.msdk.playercommon.exoplayer2.video.ColorInfo;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes4.dex */
public final class MediaFormatUtil {
    private MediaFormatUtil() {
    }

    public static void maybeSetByteBuffer(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void maybeSetColorInfo(MediaFormat mediaFormat, ColorInfo colorInfo) {
        if (colorInfo != null) {
            maybeSetInteger(mediaFormat, "color-transfer", colorInfo.colorTransfer);
            maybeSetInteger(mediaFormat, "color-standard", colorInfo.colorSpace);
            maybeSetInteger(mediaFormat, "color-range", colorInfo.colorRange);
            maybeSetByteBuffer(mediaFormat, "hdr-static-info", colorInfo.hdrStaticInfo);
        }
    }

    public static void maybeSetFloat(MediaFormat mediaFormat, String str, float f8) {
        if (f8 != -1.0f) {
            mediaFormat.setFloat(str, f8);
        }
    }

    public static void maybeSetInteger(MediaFormat mediaFormat, String str, int i8) {
        if (i8 != -1) {
            mediaFormat.setInteger(str, i8);
        }
    }

    public static void setCsdBuffers(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            mediaFormat.setByteBuffer("csd-" + i8, ByteBuffer.wrap(list.get(i8)));
        }
    }

    public static void setString(MediaFormat mediaFormat, String str, String str2) {
        mediaFormat.setString(str, str2);
    }
}
