package androidx.compose.ui.text.font;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.ExperimentalTextApi;
import androidx.compose.ui.text.font.FontVariation;

/* loaded from: classes.dex */
public final class FontKt {
    @ExperimentalTextApi
    /* renamed from: Font-F3nL8kk, reason: not valid java name */
    public static final Font m4757FontF3nL8kk(int i8, FontWeight fontWeight, int i9, int i10, FontVariation.Settings settings) {
        return new ResourceFont(i8, fontWeight, i9, settings, i10, null);
    }

    /* renamed from: Font-F3nL8kk$default, reason: not valid java name */
    public static /* synthetic */ Font m4758FontF3nL8kk$default(int i8, FontWeight fontWeight, int i9, int i10, FontVariation.Settings settings, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i11 & 4) != 0) {
            i9 = FontStyle.Companion.m4786getNormal_LCdwA();
        }
        if ((i11 & 8) != 0) {
            i10 = FontLoadingStrategy.Companion.m4771getBlockingPKNRLFQ();
        }
        if ((i11 & 16) != 0) {
            settings = FontVariation.INSTANCE.m4801Settings6EWAqTQ(fontWeight, i9, new FontVariation.Setting[0]);
        }
        return m4757FontF3nL8kk(i8, fontWeight, i9, i10, settings);
    }

    @Stable
    /* renamed from: Font-RetOiIg, reason: not valid java name */
    public static final /* synthetic */ Font m4759FontRetOiIg(int i8, FontWeight fontWeight, int i9) {
        return new ResourceFont(i8, fontWeight, i9, null, FontLoadingStrategy.Companion.m4771getBlockingPKNRLFQ(), 8, null);
    }

    /* renamed from: Font-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ Font m4760FontRetOiIg$default(int i8, FontWeight fontWeight, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i10 & 4) != 0) {
            i9 = FontStyle.Companion.m4786getNormal_LCdwA();
        }
        return m4759FontRetOiIg(i8, fontWeight, i9);
    }

    @Stable
    /* renamed from: Font-YpTlLL0, reason: not valid java name */
    public static final Font m4761FontYpTlLL0(int i8, FontWeight fontWeight, int i9, int i10) {
        return new ResourceFont(i8, fontWeight, i9, new FontVariation.Settings(new FontVariation.Setting[0]), i10, null);
    }

    /* renamed from: Font-YpTlLL0$default, reason: not valid java name */
    public static /* synthetic */ Font m4762FontYpTlLL0$default(int i8, FontWeight fontWeight, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i11 & 4) != 0) {
            i9 = FontStyle.Companion.m4786getNormal_LCdwA();
        }
        if ((i11 & 8) != 0) {
            i10 = FontLoadingStrategy.Companion.m4771getBlockingPKNRLFQ();
        }
        return m4761FontYpTlLL0(i8, fontWeight, i9, i10);
    }

    @Stable
    public static final FontFamily toFontFamily(Font font) {
        return FontFamilyKt.FontFamily(font);
    }
}
