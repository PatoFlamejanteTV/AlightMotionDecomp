package androidx.compose.ui.text;

import R5.AbstractC1435t;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SaversKt$SpanStyleSaver$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final SaversKt$SpanStyleSaver$1 INSTANCE = new SaversKt$SpanStyleSaver$1();

    SaversKt$SpanStyleSaver$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(SaverScope saverScope, SpanStyle spanStyle) {
        Color m2938boximpl = Color.m2938boximpl(spanStyle.m4628getColor0d7_KjU());
        Color.Companion companion = Color.Companion;
        Object save = SaversKt.save(m2938boximpl, SaversKt.getSaver(companion), saverScope);
        TextUnit m5332boximpl = TextUnit.m5332boximpl(spanStyle.m4629getFontSizeXSAIIZE());
        TextUnit.Companion companion2 = TextUnit.Companion;
        return AbstractC1435t.g(save, SaversKt.save(m5332boximpl, SaversKt.getSaver(companion2), saverScope), SaversKt.save(spanStyle.getFontWeight(), SaversKt.getSaver(FontWeight.Companion), saverScope), SaversKt.save(spanStyle.m4630getFontStyle4Lr2A7w()), SaversKt.save(spanStyle.m4631getFontSynthesisZQGJjVo()), SaversKt.save(-1), SaversKt.save(spanStyle.getFontFeatureSettings()), SaversKt.save(TextUnit.m5332boximpl(spanStyle.m4632getLetterSpacingXSAIIZE()), SaversKt.getSaver(companion2), saverScope), SaversKt.save(spanStyle.m4627getBaselineShift5SSeXJ0(), SaversKt.getSaver(BaselineShift.Companion), saverScope), SaversKt.save(spanStyle.getTextGeometricTransform(), SaversKt.getSaver(TextGeometricTransform.Companion), saverScope), SaversKt.save(spanStyle.getLocaleList(), SaversKt.getSaver(LocaleList.Companion), saverScope), SaversKt.save(Color.m2938boximpl(spanStyle.m4626getBackground0d7_KjU()), SaversKt.getSaver(companion), saverScope), SaversKt.save(spanStyle.getTextDecoration(), SaversKt.getSaver(TextDecoration.Companion), saverScope), SaversKt.save(spanStyle.getShadow(), SaversKt.getSaver(Shadow.Companion), saverScope));
    }
}
