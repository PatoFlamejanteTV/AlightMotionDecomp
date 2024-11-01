package androidx.core.text;

import android.text.Spannable;
import android.text.SpannableString;

/* loaded from: classes3.dex */
public final class SpannableStringKt {
    public static final void clearSpans(Spannable spannable) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            spannable.removeSpan(obj);
        }
    }

    public static final void set(Spannable spannable, int i8, int i9, Object obj) {
        spannable.setSpan(obj, i8, i9, 17);
    }

    public static final Spannable toSpannable(CharSequence charSequence) {
        return SpannableString.valueOf(charSequence);
    }

    public static final void set(Spannable spannable, i6.i iVar, Object obj) {
        spannable.setSpan(obj, iVar.getStart().intValue(), iVar.getEndInclusive().intValue(), 17);
    }
}
