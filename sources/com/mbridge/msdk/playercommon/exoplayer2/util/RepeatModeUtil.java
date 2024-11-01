package com.mbridge.msdk.playercommon.exoplayer2.util;

/* loaded from: classes4.dex */
public final class RepeatModeUtil {
    public static final int REPEAT_TOGGLE_MODE_ALL = 2;
    public static final int REPEAT_TOGGLE_MODE_NONE = 0;
    public static final int REPEAT_TOGGLE_MODE_ONE = 1;

    /* loaded from: classes4.dex */
    public @interface RepeatToggleModes {
    }

    private RepeatModeUtil() {
    }

    public static int getNextRepeatMode(int i8, int i9) {
        for (int i10 = 1; i10 <= 2; i10++) {
            int i11 = (i8 + i10) % 3;
            if (isRepeatModeEnabled(i11, i9)) {
                return i11;
            }
        }
        return i8;
    }

    public static boolean isRepeatModeEnabled(int i8, int i9) {
        if (i8 != 0) {
            return i8 != 1 ? i8 == 2 && (i9 & 2) != 0 : (i9 & 1) != 0;
        }
        return true;
    }
}
