package androidx.compose.foundation.text.modifiers;

import l6.n;

/* loaded from: classes.dex */
public final class MinLinesConstrainerKt {
    private static final int DefaultWidthCharCount = 10;
    private static final String EmptyTextReplacement;
    private static final String TwoLineTextReplacement;

    static {
        String v8 = n.v("H", 10);
        EmptyTextReplacement = v8;
        TwoLineTextReplacement = v8 + '\n' + v8;
    }
}
