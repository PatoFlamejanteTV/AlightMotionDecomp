package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class HeightInLinesModifierKt$heightInLines$2 extends AbstractC3293z implements InterfaceC2073o {
    final /* synthetic */ int $maxLines;
    final /* synthetic */ int $minLines;
    final /* synthetic */ TextStyle $textStyle;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeightInLinesModifierKt$heightInLines$2(int i8, int i9, TextStyle textStyle) {
        super(3);
        this.$minLines = i8;
        this.$maxLines = i9;
        this.$textStyle = textStyle;
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final Modifier invoke(Modifier composed, Composer composer, int i8) {
        AbstractC3292y.i(composed, "$this$composed");
        composer.startReplaceableGroup(408240218);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(408240218, i8, -1, "androidx.compose.foundation.text.heightInLines.<anonymous> (HeightInLinesModifier.kt:58)");
        }
        HeightInLinesModifierKt.validateMinMaxLines(this.$minLines, this.$maxLines);
        if (this.$minLines == 1 && this.$maxLines == Integer.MAX_VALUE) {
            Modifier.Companion companion = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return companion;
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        FontFamily.Resolver resolver = (FontFamily.Resolver) composer.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        TextStyle textStyle = this.$textStyle;
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(textStyle) | composer.changed(layoutDirection);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = TextStyleKt.resolveDefaults(textStyle, layoutDirection);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        TextStyle textStyle2 = (TextStyle) rememberedValue;
        composer.startReplaceableGroup(511388516);
        boolean changed2 = composer.changed(resolver) | composer.changed(textStyle2);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            FontFamily fontFamily = textStyle2.getFontFamily();
            FontWeight fontWeight = textStyle2.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.Companion.getNormal();
            }
            FontStyle m4701getFontStyle4Lr2A7w = textStyle2.m4701getFontStyle4Lr2A7w();
            int m4782unboximpl = m4701getFontStyle4Lr2A7w != null ? m4701getFontStyle4Lr2A7w.m4782unboximpl() : FontStyle.Companion.m4786getNormal_LCdwA();
            FontSynthesis m4702getFontSynthesisZQGJjVo = textStyle2.m4702getFontSynthesisZQGJjVo();
            rememberedValue2 = resolver.mo4754resolveDPcqOEQ(fontFamily, fontWeight, m4782unboximpl, m4702getFontSynthesisZQGJjVo != null ? m4702getFontSynthesisZQGJjVo.m4795unboximpl() : FontSynthesis.Companion.m4796getAllGVVA2EU());
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        State state = (State) rememberedValue2;
        Object[] objArr = {density, resolver, this.$textStyle, layoutDirection, state.getValue()};
        composer.startReplaceableGroup(-568225417);
        boolean z8 = false;
        for (int i9 = 0; i9 < 5; i9++) {
            z8 |= composer.changed(objArr[i9]);
        }
        Object rememberedValue3 = composer.rememberedValue();
        if (z8 || rememberedValue3 == Composer.Companion.getEmpty()) {
            rememberedValue3 = Integer.valueOf(IntSize.m5320getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText(textStyle2, density, resolver, TextFieldDelegateKt.getEmptyTextReplacement(), 1)));
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        int intValue = ((Number) rememberedValue3).intValue();
        Object[] objArr2 = {density, resolver, this.$textStyle, layoutDirection, state.getValue()};
        composer.startReplaceableGroup(-568225417);
        boolean z9 = false;
        for (int i10 = 0; i10 < 5; i10++) {
            z9 |= composer.changed(objArr2[i10]);
        }
        Object rememberedValue4 = composer.rememberedValue();
        if (z9 || rememberedValue4 == Composer.Companion.getEmpty()) {
            rememberedValue4 = Integer.valueOf(IntSize.m5320getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText(textStyle2, density, resolver, TextFieldDelegateKt.getEmptyTextReplacement() + '\n' + TextFieldDelegateKt.getEmptyTextReplacement(), 2)));
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceableGroup();
        int intValue2 = ((Number) rememberedValue4).intValue() - intValue;
        int i11 = this.$minLines;
        Integer valueOf = i11 == 1 ? null : Integer.valueOf(((i11 - 1) * intValue2) + intValue);
        int i12 = this.$maxLines;
        Integer valueOf2 = i12 != Integer.MAX_VALUE ? Integer.valueOf(intValue + (intValue2 * (i12 - 1))) : null;
        Modifier m611heightInVpY3zN4 = SizeKt.m611heightInVpY3zN4(Modifier.Companion, valueOf != null ? density.mo422toDpu2uoSUM(valueOf.intValue()) : Dp.Companion.m5175getUnspecifiedD9Ej5fM(), valueOf2 != null ? density.mo422toDpu2uoSUM(valueOf2.intValue()) : Dp.Companion.m5175getUnspecifiedD9Ej5fM());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m611heightInVpY3zN4;
    }
}
