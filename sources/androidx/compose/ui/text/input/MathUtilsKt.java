package androidx.compose.ui.text.input;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class MathUtilsKt {
    public static final int addExactOrElse(int i8, int i9, Function0 function0) {
        int i10 = i8 + i9;
        if (((i8 ^ i10) & (i9 ^ i10)) < 0) {
            return ((Number) function0.invoke()).intValue();
        }
        return i10;
    }

    public static final int subtractExactOrElse(int i8, int i9, Function0 function0) {
        int i10 = i8 - i9;
        if (((i8 ^ i10) & (i9 ^ i8)) < 0) {
            return ((Number) function0.invoke()).intValue();
        }
        return i10;
    }
}
