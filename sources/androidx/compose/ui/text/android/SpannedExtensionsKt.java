package androidx.compose.ui.text.android;

import android.text.Spanned;

/* loaded from: classes.dex */
public final class SpannedExtensionsKt {
    public static final boolean hasSpan(Spanned spanned, Class<?> cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static final boolean hasSpan(Spanned spanned, Class<?> cls, int i8, int i9) {
        return spanned.nextSpanTransition(i8 - 1, i9, cls) != i9;
    }
}
