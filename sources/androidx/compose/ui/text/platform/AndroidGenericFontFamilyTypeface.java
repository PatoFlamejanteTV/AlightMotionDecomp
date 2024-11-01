package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.AndroidFontUtils_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.text.font.TypefaceHelperMethodsApi28;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class AndroidGenericFontFamilyTypeface implements AndroidTypeface {
    public static final int $stable = 8;
    private final FontFamily fontFamily;
    private final Typeface nativeTypeface;

    public AndroidGenericFontFamilyTypeface(GenericFontFamily genericFontFamily) {
        this.fontFamily = genericFontFamily;
        Typeface create = Typeface.create(genericFontFamily.getName(), 0);
        AbstractC3292y.f(create);
        this.nativeTypeface = create;
    }

    /* renamed from: buildStyledTypeface-FO1MlWM, reason: not valid java name */
    private final Typeface m4910buildStyledTypefaceFO1MlWM(FontWeight fontWeight, int i8) {
        if (Build.VERSION.SDK_INT < 28) {
            return Typeface.create(this.nativeTypeface, AndroidFontUtils_androidKt.m4734getAndroidTypefaceStyleFO1MlWM(fontWeight, i8));
        }
        return TypefaceHelperMethodsApi28.INSTANCE.create(this.nativeTypeface, fontWeight.getWeight(), FontStyle.m4779equalsimpl0(i8, FontStyle.Companion.m4785getItalic_LCdwA()));
    }

    @Override // androidx.compose.ui.text.font.Typeface
    public FontFamily getFontFamily() {
        return this.fontFamily;
    }

    @Override // androidx.compose.ui.text.platform.AndroidTypeface
    /* renamed from: getNativeTypeface-PYhJU0U */
    public Typeface mo4909getNativeTypefacePYhJU0U(FontWeight fontWeight, int i8, int i9) {
        return m4910buildStyledTypefaceFO1MlWM(fontWeight, i8);
    }
}
