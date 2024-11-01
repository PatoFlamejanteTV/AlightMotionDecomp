package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontVariation;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi(28)
@VisibleForTesting
/* loaded from: classes.dex */
public final class PlatformTypefacesApi28 implements PlatformTypefaces {
    /* renamed from: createAndroidTypefaceApi28-RetOiIg, reason: not valid java name */
    private final android.graphics.Typeface m4810createAndroidTypefaceApi28RetOiIg(String str, FontWeight fontWeight, int i8) {
        android.graphics.Typeface create;
        android.graphics.Typeface create2;
        FontStyle.Companion companion = FontStyle.Companion;
        if (FontStyle.m4779equalsimpl0(i8, companion.m4786getNormal_LCdwA()) && AbstractC3292y.d(fontWeight, FontWeight.Companion.getNormal()) && (str == null || str.length() == 0)) {
            return android.graphics.Typeface.DEFAULT;
        }
        if (str == null) {
            create = android.graphics.Typeface.DEFAULT;
        } else {
            create = android.graphics.Typeface.create(str, 0);
        }
        create2 = android.graphics.Typeface.create(create, fontWeight.getWeight(), FontStyle.m4779equalsimpl0(i8, companion.m4785getItalic_LCdwA()));
        return create2;
    }

    /* renamed from: createAndroidTypefaceApi28-RetOiIg$default, reason: not valid java name */
    static /* synthetic */ android.graphics.Typeface m4811createAndroidTypefaceApi28RetOiIg$default(PlatformTypefacesApi28 platformTypefacesApi28, String str, FontWeight fontWeight, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = null;
        }
        return platformTypefacesApi28.m4810createAndroidTypefaceApi28RetOiIg(str, fontWeight, i8);
    }

    /* renamed from: loadNamedFromTypefaceCacheOrNull-RetOiIg, reason: not valid java name */
    private final android.graphics.Typeface m4812loadNamedFromTypefaceCacheOrNullRetOiIg(String str, FontWeight fontWeight, int i8) {
        if (str.length() == 0) {
            return null;
        }
        android.graphics.Typeface m4810createAndroidTypefaceApi28RetOiIg = m4810createAndroidTypefaceApi28RetOiIg(str, fontWeight, i8);
        if (AbstractC3292y.d(m4810createAndroidTypefaceApi28RetOiIg, TypefaceHelperMethodsApi28.INSTANCE.create(android.graphics.Typeface.DEFAULT, fontWeight.getWeight(), FontStyle.m4779equalsimpl0(i8, FontStyle.Companion.m4785getItalic_LCdwA()))) || AbstractC3292y.d(m4810createAndroidTypefaceApi28RetOiIg, m4810createAndroidTypefaceApi28RetOiIg(null, fontWeight, i8))) {
            return null;
        }
        return m4810createAndroidTypefaceApi28RetOiIg;
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* renamed from: createDefault-FO1MlWM */
    public android.graphics.Typeface mo4804createDefaultFO1MlWM(FontWeight fontWeight, int i8) {
        return m4810createAndroidTypefaceApi28RetOiIg(null, fontWeight, i8);
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* renamed from: createNamed-RetOiIg */
    public android.graphics.Typeface mo4805createNamedRetOiIg(GenericFontFamily genericFontFamily, FontWeight fontWeight, int i8) {
        return m4810createAndroidTypefaceApi28RetOiIg(genericFontFamily.getName(), fontWeight, i8);
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* renamed from: optionalOnDeviceFontFamilyByName-78DK7lM */
    public android.graphics.Typeface mo4806optionalOnDeviceFontFamilyByName78DK7lM(String str, FontWeight fontWeight, int i8, FontVariation.Settings settings, Context context) {
        android.graphics.Typeface m4812loadNamedFromTypefaceCacheOrNullRetOiIg;
        FontFamily.Companion companion = FontFamily.Companion;
        if (AbstractC3292y.d(str, companion.getSansSerif().getName())) {
            m4812loadNamedFromTypefaceCacheOrNullRetOiIg = mo4805createNamedRetOiIg(companion.getSansSerif(), fontWeight, i8);
        } else if (AbstractC3292y.d(str, companion.getSerif().getName())) {
            m4812loadNamedFromTypefaceCacheOrNullRetOiIg = mo4805createNamedRetOiIg(companion.getSerif(), fontWeight, i8);
        } else if (AbstractC3292y.d(str, companion.getMonospace().getName())) {
            m4812loadNamedFromTypefaceCacheOrNullRetOiIg = mo4805createNamedRetOiIg(companion.getMonospace(), fontWeight, i8);
        } else if (AbstractC3292y.d(str, companion.getCursive().getName())) {
            m4812loadNamedFromTypefaceCacheOrNullRetOiIg = mo4805createNamedRetOiIg(companion.getCursive(), fontWeight, i8);
        } else {
            m4812loadNamedFromTypefaceCacheOrNullRetOiIg = m4812loadNamedFromTypefaceCacheOrNullRetOiIg(str, fontWeight, i8);
        }
        return PlatformTypefaces_androidKt.setFontVariationSettings(m4812loadNamedFromTypefaceCacheOrNullRetOiIg, settings, context);
    }
}
