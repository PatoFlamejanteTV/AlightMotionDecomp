package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.AndroidFontUtils_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.TypefaceHelperMethodsApi28;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class AndroidDefaultTypeface implements AndroidTypeface {
    public static final int $stable = 0;
    private final FontFamily fontFamily = FontFamily.Companion.getDefault();

    @Override // androidx.compose.ui.text.font.Typeface
    public FontFamily getFontFamily() {
        return this.fontFamily;
    }

    @Override // androidx.compose.ui.text.platform.AndroidTypeface
    /* renamed from: getNativeTypeface-PYhJU0U, reason: not valid java name */
    public Typeface mo4909getNativeTypefacePYhJU0U(FontWeight fontWeight, int i8, int i9) {
        if (Build.VERSION.SDK_INT < 28) {
            return Typeface.defaultFromStyle(AndroidFontUtils_androidKt.m4734getAndroidTypefaceStyleFO1MlWM(fontWeight, i8));
        }
        return TypefaceHelperMethodsApi28.INSTANCE.create(Typeface.DEFAULT, fontWeight.getWeight(), FontStyle.m4779equalsimpl0(i8, FontStyle.Companion.m4785getItalic_LCdwA()));
    }
}
