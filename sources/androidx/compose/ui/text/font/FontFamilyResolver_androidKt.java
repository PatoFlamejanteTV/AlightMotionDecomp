package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.InternalTextApi;
import androidx.compose.ui.text.font.FontFamily;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class FontFamilyResolver_androidKt {
    public static final FontFamily.Resolver createFontFamilyResolver(Context context) {
        return new FontFamilyResolverImpl(new AndroidFontLoader(context), AndroidFontResolveInterceptor_androidKt.AndroidFontResolveInterceptor(context), null, null, null, 28, null);
    }

    @InternalTextApi
    public static final FontFamily.Resolver emptyCacheFontFamilyResolver(Context context) {
        return new FontFamilyResolverImpl(new AndroidFontLoader(context), null, new TypefaceRequestCache(), new FontListFontFamilyTypefaceAdapter(new AsyncTypefaceCache(), null, 2, null), null, 18, null);
    }

    /* renamed from: resolveAsTypeface-Wqqsr6A, reason: not valid java name */
    public static final State<android.graphics.Typeface> m4755resolveAsTypefaceWqqsr6A(FontFamily.Resolver resolver, FontFamily fontFamily, FontWeight fontWeight, int i8, int i9) {
        State mo4754resolveDPcqOEQ = resolver.mo4754resolveDPcqOEQ(fontFamily, fontWeight, i8, i9);
        AbstractC3292y.g(mo4754resolveDPcqOEQ, "null cannot be cast to non-null type androidx.compose.runtime.State<android.graphics.Typeface>");
        return mo4754resolveDPcqOEQ;
    }

    /* renamed from: resolveAsTypeface-Wqqsr6A$default, reason: not valid java name */
    public static /* synthetic */ State m4756resolveAsTypefaceWqqsr6A$default(FontFamily.Resolver resolver, FontFamily fontFamily, FontWeight fontWeight, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fontFamily = null;
        }
        if ((i10 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i10 & 4) != 0) {
            i8 = FontStyle.Companion.m4786getNormal_LCdwA();
        }
        if ((i10 & 8) != 0) {
            i9 = FontSynthesis.Companion.m4796getAllGVVA2EU();
        }
        return m4755resolveAsTypefaceWqqsr6A(resolver, fontFamily, fontWeight, i8, i9);
    }

    public static final FontFamily.Resolver createFontFamilyResolver(Context context, U5.g gVar) {
        return new FontFamilyResolverImpl(new AndroidFontLoader(context), AndroidFontResolveInterceptor_androidKt.AndroidFontResolveInterceptor(context), FontFamilyResolverKt.getGlobalTypefaceRequestCache(), new FontListFontFamilyTypefaceAdapter(FontFamilyResolverKt.getGlobalAsyncTypefaceCache(), gVar), null, 16, null);
    }
}
