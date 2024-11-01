package com.mbridge.msdk.playercommon.exoplayer2.util;

import android.os.Trace;

/* loaded from: classes4.dex */
public final class TraceUtil {
    private TraceUtil() {
    }

    public static void beginSection(String str) {
        if (Util.SDK_INT >= 18) {
            beginSectionV18(str);
        }
    }

    private static void beginSectionV18(String str) {
        Trace.beginSection(str);
    }

    public static void endSection() {
        if (Util.SDK_INT >= 18) {
            endSectionV18();
        }
    }

    private static void endSectionV18() {
        Trace.endSection();
    }
}
