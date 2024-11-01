package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class AndroidTypefaceWrapper implements AndroidTypeface {
    public static final int $stable = 8;
    private final FontFamily fontFamily;
    private final Typeface typeface;

    public AndroidTypefaceWrapper(Typeface typeface) {
        this.typeface = typeface;
    }

    @Override // androidx.compose.ui.text.font.Typeface
    public FontFamily getFontFamily() {
        return this.fontFamily;
    }

    @Override // androidx.compose.ui.text.platform.AndroidTypeface
    /* renamed from: getNativeTypeface-PYhJU0U */
    public Typeface mo4909getNativeTypefacePYhJU0U(FontWeight fontWeight, int i8, int i9) {
        return this.typeface;
    }

    public final Typeface getTypeface() {
        return this.typeface;
    }
}
