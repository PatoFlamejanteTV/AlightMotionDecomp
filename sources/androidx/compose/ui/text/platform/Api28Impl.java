package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.text.style.TypefaceSpan;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(28)
/* loaded from: classes.dex */
final class Api28Impl {
    public static final Api28Impl INSTANCE = new Api28Impl();

    private Api28Impl() {
    }

    @DoNotInline
    public final TypefaceSpan createTypefaceSpan(Typeface typeface) {
        return new TypefaceSpan(typeface);
    }
}
