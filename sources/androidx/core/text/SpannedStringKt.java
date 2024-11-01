package androidx.core.text;

import android.text.Spanned;
import android.text.SpannedString;
import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class SpannedStringKt {
    public static final /* synthetic */ <T> T[] getSpans(Spanned spanned, int i8, int i9) {
        AbstractC3292y.n(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T[]) spanned.getSpans(i8, i9, Object.class);
    }

    public static /* synthetic */ Object[] getSpans$default(Spanned spanned, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = spanned.length();
        }
        AbstractC3292y.n(4, ExifInterface.GPS_DIRECTION_TRUE);
        return spanned.getSpans(i8, i9, Object.class);
    }

    public static final Spanned toSpanned(CharSequence charSequence) {
        return SpannedString.valueOf(charSequence);
    }
}
