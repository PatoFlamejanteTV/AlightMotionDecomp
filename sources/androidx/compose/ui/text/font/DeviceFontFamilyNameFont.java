package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.FontVariation;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class DeviceFontFamilyNameFont extends AndroidFont {
    private final String familyName;
    private final int style;
    private final FontWeight weight;

    public /* synthetic */ DeviceFontFamilyNameFont(String str, FontWeight fontWeight, int i8, FontVariation.Settings settings, AbstractC3284p abstractC3284p) {
        this(str, fontWeight, i8, settings);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceFontFamilyNameFont)) {
            return false;
        }
        DeviceFontFamilyNameFont deviceFontFamilyNameFont = (DeviceFontFamilyNameFont) obj;
        if (DeviceFontFamilyName.m4748equalsimpl0(this.familyName, deviceFontFamilyNameFont.familyName) && AbstractC3292y.d(getWeight(), deviceFontFamilyNameFont.getWeight()) && FontStyle.m4779equalsimpl0(mo4735getStyle_LCdwA(), deviceFontFamilyNameFont.mo4735getStyle_LCdwA()) && AbstractC3292y.d(getVariationSettings(), deviceFontFamilyNameFont.getVariationSettings())) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.text.font.Font
    /* renamed from: getStyle-_-LCdwA */
    public int mo4735getStyle_LCdwA() {
        return this.style;
    }

    @Override // androidx.compose.ui.text.font.Font
    public FontWeight getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return (((((DeviceFontFamilyName.m4749hashCodeimpl(this.familyName) * 31) + getWeight().hashCode()) * 31) + FontStyle.m4780hashCodeimpl(mo4735getStyle_LCdwA())) * 31) + getVariationSettings().hashCode();
    }

    public final android.graphics.Typeface loadCached(Context context) {
        return PlatformTypefaces_androidKt.PlatformTypefaces().mo4806optionalOnDeviceFontFamilyByName78DK7lM(this.familyName, getWeight(), mo4735getStyle_LCdwA(), getVariationSettings(), context);
    }

    public String toString() {
        return "Font(familyName=\"" + ((Object) DeviceFontFamilyName.m4750toStringimpl(this.familyName)) + "\", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m4781toStringimpl(mo4735getStyle_LCdwA())) + ')';
    }

    private DeviceFontFamilyNameFont(String str, FontWeight fontWeight, int i8, FontVariation.Settings settings) {
        super(FontLoadingStrategy.Companion.m4772getOptionalLocalPKNRLFQ(), NamedFontLoader.INSTANCE, settings, null);
        this.familyName = str;
        this.weight = fontWeight;
        this.style = i8;
    }
}
