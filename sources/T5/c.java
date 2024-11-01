package T5;

import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class c extends b {
    public static float b(float f8, float... other) {
        AbstractC3292y.i(other, "other");
        for (float f9 : other) {
            f8 = Math.max(f8, f9);
        }
        return f8;
    }

    public static Comparable c(Comparable a9, Comparable b9) {
        AbstractC3292y.i(a9, "a");
        AbstractC3292y.i(b9, "b");
        if (a9.compareTo(b9) < 0) {
            return b9;
        }
        return a9;
    }

    public static float d(float f8, float... other) {
        AbstractC3292y.i(other, "other");
        for (float f9 : other) {
            f8 = Math.min(f8, f9);
        }
        return f8;
    }
}
