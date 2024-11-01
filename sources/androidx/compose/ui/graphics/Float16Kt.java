package androidx.compose.ui.graphics;

/* loaded from: classes.dex */
public final class Float16Kt {
    /* renamed from: max-AoSsdG0, reason: not valid java name */
    public static final short m3093maxAoSsdG0(short s8, short s9) {
        if (!Float16.m3066isNaNimpl(s8) && !Float16.m3066isNaNimpl(s9)) {
            if (Float16.m3053compareTo41bOqos(s8, s9) < 0) {
                return s9;
            }
            return s8;
        }
        return Float16.Companion.m3088getNaNslo4al4();
    }

    /* renamed from: min-AoSsdG0, reason: not valid java name */
    public static final short m3094minAoSsdG0(short s8, short s9) {
        if (!Float16.m3066isNaNimpl(s8) && !Float16.m3066isNaNimpl(s9)) {
            if (Float16.m3053compareTo41bOqos(s8, s9) > 0) {
                return s9;
            }
            return s8;
        }
        return Float16.Companion.m3088getNaNslo4al4();
    }
}
