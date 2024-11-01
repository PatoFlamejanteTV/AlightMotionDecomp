package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* loaded from: classes.dex */
public abstract /* synthetic */ class d {
    static {
        String str = TypedValues.MotionScene.NAME;
    }

    public static int a(String str) {
        str.hashCode();
        if (!str.equals(TypedValues.MotionScene.S_DEFAULT_DURATION)) {
            if (!str.equals(TypedValues.MotionScene.S_LAYOUT_DURING_TRANSITION)) {
                return -1;
            }
            return 601;
        }
        return 600;
    }

    public static int b(int i8) {
        if (i8 != 600) {
            if (i8 != 601) {
                return -1;
            }
            return 1;
        }
        return 2;
    }
}
