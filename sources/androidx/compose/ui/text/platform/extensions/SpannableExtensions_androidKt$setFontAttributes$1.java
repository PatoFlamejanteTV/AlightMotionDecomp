package androidx.compose.ui.text.platform.extensions;

import Q5.I;
import android.graphics.Typeface;
import android.text.Spannable;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.android.style.TypefaceSpan;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import c6.InterfaceC2073o;
import c6.InterfaceC2074p;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SpannableExtensions_androidKt$setFontAttributes$1 extends AbstractC3293z implements InterfaceC2073o {
    final /* synthetic */ InterfaceC2074p $resolveTypeface;
    final /* synthetic */ Spannable $this_setFontAttributes;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpannableExtensions_androidKt$setFontAttributes$1(Spannable spannable, InterfaceC2074p interfaceC2074p) {
        super(3);
        this.$this_setFontAttributes = spannable;
        this.$resolveTypeface = interfaceC2074p;
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((SpanStyle) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        return I.f8786a;
    }

    public final void invoke(SpanStyle spanStyle, int i8, int i9) {
        Spannable spannable = this.$this_setFontAttributes;
        InterfaceC2074p interfaceC2074p = this.$resolveTypeface;
        FontFamily fontFamily = spanStyle.getFontFamily();
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        FontStyle m4630getFontStyle4Lr2A7w = spanStyle.m4630getFontStyle4Lr2A7w();
        FontStyle m4776boximpl = FontStyle.m4776boximpl(m4630getFontStyle4Lr2A7w != null ? m4630getFontStyle4Lr2A7w.m4782unboximpl() : FontStyle.Companion.m4786getNormal_LCdwA());
        FontSynthesis m4631getFontSynthesisZQGJjVo = spanStyle.m4631getFontSynthesisZQGJjVo();
        spannable.setSpan(new TypefaceSpan((Typeface) interfaceC2074p.invoke(fontFamily, fontWeight, m4776boximpl, FontSynthesis.m4787boximpl(m4631getFontSynthesisZQGJjVo != null ? m4631getFontSynthesisZQGJjVo.m4795unboximpl() : FontSynthesis.Companion.m4796getAllGVVA2EU()))), i8, i9, 33);
    }
}
