package androidx.compose.ui.text.input;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class GapBuffer_jvmKt {
    public static final void toCharArray(String str, char[] cArr, int i8, int i9, int i10) {
        AbstractC3292y.g(str, "null cannot be cast to non-null type java.lang.String");
        str.getChars(i9, i10, cArr, i8);
    }
}
