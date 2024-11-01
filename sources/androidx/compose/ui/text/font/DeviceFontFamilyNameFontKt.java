package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.FontVariation;

/* loaded from: classes.dex */
public final class DeviceFontFamilyNameFontKt {
    /* renamed from: Font-vxs03AY, reason: not valid java name */
    public static final Font m4752Fontvxs03AY(String str, FontWeight fontWeight, int i8, FontVariation.Settings settings) {
        return new DeviceFontFamilyNameFont(str, fontWeight, i8, settings, null);
    }

    /* renamed from: Font-vxs03AY$default, reason: not valid java name */
    public static /* synthetic */ Font m4753Fontvxs03AY$default(String str, FontWeight fontWeight, int i8, FontVariation.Settings settings, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i9 & 4) != 0) {
            i8 = FontStyle.Companion.m4786getNormal_LCdwA();
        }
        if ((i9 & 8) != 0) {
            settings = new FontVariation.Settings(new FontVariation.Setting[0]);
        }
        return m4752Fontvxs03AY(str, fontWeight, i8, settings);
    }
}
