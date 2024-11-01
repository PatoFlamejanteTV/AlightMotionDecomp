package androidx.compose.ui.text;

import i6.m;

/* loaded from: classes.dex */
public final class TextRangeKt {
    public static final long TextRange(int i8, int i9) {
        return TextRange.m4658constructorimpl(packWithCheck(i8, i9));
    }

    /* renamed from: coerceIn-8ffj60Q, reason: not valid java name */
    public static final long m4675coerceIn8ffj60Q(long j8, int i8, int i9) {
        int k8 = m.k(TextRange.m4669getStartimpl(j8), i8, i9);
        int k9 = m.k(TextRange.m4664getEndimpl(j8), i8, i9);
        if (k8 == TextRange.m4669getStartimpl(j8) && k9 == TextRange.m4664getEndimpl(j8)) {
            return j8;
        }
        return TextRange(k8, k9);
    }

    private static final long packWithCheck(int i8, int i9) {
        if (i8 >= 0) {
            if (i9 >= 0) {
                return (i9 & 4294967295L) | (i8 << 32);
            }
            throw new IllegalArgumentException(("end cannot be negative. [start: " + i8 + ", end: " + i9 + ']').toString());
        }
        throw new IllegalArgumentException(("start cannot be negative. [start: " + i8 + ", end: " + i9 + ']').toString());
    }

    /* renamed from: substring-FDrldGo, reason: not valid java name */
    public static final String m4676substringFDrldGo(CharSequence charSequence, long j8) {
        return charSequence.subSequence(TextRange.m4667getMinimpl(j8), TextRange.m4666getMaximpl(j8)).toString();
    }

    public static final long TextRange(int i8) {
        return TextRange(i8, i8);
    }
}
