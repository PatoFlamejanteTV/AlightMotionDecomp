package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.FontVariation;

/* loaded from: classes.dex */
public interface PlatformTypefaces {
    /* renamed from: createDefault-FO1MlWM, reason: not valid java name */
    android.graphics.Typeface mo4804createDefaultFO1MlWM(FontWeight fontWeight, int i8);

    /* renamed from: createNamed-RetOiIg, reason: not valid java name */
    android.graphics.Typeface mo4805createNamedRetOiIg(GenericFontFamily genericFontFamily, FontWeight fontWeight, int i8);

    /* renamed from: optionalOnDeviceFontFamilyByName-78DK7lM, reason: not valid java name */
    android.graphics.Typeface mo4806optionalOnDeviceFontFamilyByName78DK7lM(String str, FontWeight fontWeight, int i8, FontVariation.Settings settings, Context context);
}
