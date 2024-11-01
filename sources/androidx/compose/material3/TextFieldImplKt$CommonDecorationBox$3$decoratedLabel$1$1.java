package androidx.compose.material3;

import Q5.I;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ InterfaceC2072n $it;
    final /* synthetic */ long $labelContentColor;
    final /* synthetic */ float $labelProgress;
    final /* synthetic */ long $labelTextStyleColor;
    final /* synthetic */ boolean $shouldOverrideTextStyleColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1(float f8, long j8, InterfaceC2072n interfaceC2072n, int i8, boolean z8, long j9) {
        super(2);
        this.$labelProgress = f8;
        this.$labelContentColor = j8;
        this.$it = interfaceC2072n;
        this.$$dirty = i8;
        this.$shouldOverrideTextStyleColor = z8;
        this.$labelTextStyleColor = j9;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    @Composable
    public final void invoke(Composer composer, int i8) {
        TextStyle textStyle;
        TextStyle m4691copyHL5avdY;
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1199990137, i8, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:115)");
        }
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        TextStyle lerp = TextStyleKt.lerp(materialTheme.getTypography(composer, 6).getBodyLarge(), materialTheme.getTypography(composer, 6).getBodySmall(), this.$labelProgress);
        boolean z8 = this.$shouldOverrideTextStyleColor;
        long j8 = this.$labelTextStyleColor;
        if (z8) {
            m4691copyHL5avdY = lerp.m4691copyHL5avdY((r42 & 1) != 0 ? lerp.spanStyle.m4628getColor0d7_KjU() : j8, (r42 & 2) != 0 ? lerp.spanStyle.m4629getFontSizeXSAIIZE() : 0L, (r42 & 4) != 0 ? lerp.spanStyle.getFontWeight() : null, (r42 & 8) != 0 ? lerp.spanStyle.m4630getFontStyle4Lr2A7w() : null, (r42 & 16) != 0 ? lerp.spanStyle.m4631getFontSynthesisZQGJjVo() : null, (r42 & 32) != 0 ? lerp.spanStyle.getFontFamily() : null, (r42 & 64) != 0 ? lerp.spanStyle.getFontFeatureSettings() : null, (r42 & 128) != 0 ? lerp.spanStyle.m4632getLetterSpacingXSAIIZE() : 0L, (r42 & 256) != 0 ? lerp.spanStyle.m4627getBaselineShift5SSeXJ0() : null, (r42 & 512) != 0 ? lerp.spanStyle.getTextGeometricTransform() : null, (r42 & 1024) != 0 ? lerp.spanStyle.getLocaleList() : null, (r42 & 2048) != 0 ? lerp.spanStyle.m4626getBackground0d7_KjU() : 0L, (r42 & 4096) != 0 ? lerp.spanStyle.getTextDecoration() : null, (r42 & 8192) != 0 ? lerp.spanStyle.getShadow() : null, (r42 & 16384) != 0 ? TextAlign.m5052boximpl(lerp.paragraphStyle.m4584getTextAligne0LSkKk()) : null, (r42 & 32768) != 0 ? TextDirection.m5066boximpl(lerp.paragraphStyle.m4586getTextDirections_7Xco()) : null, (r42 & 65536) != 0 ? lerp.paragraphStyle.m4582getLineHeightXSAIIZE() : 0L, (r42 & 131072) != 0 ? lerp.paragraphStyle.getTextIndent() : null);
            textStyle = m4691copyHL5avdY;
        } else {
            textStyle = lerp;
        }
        TextFieldImplKt.m1842DecorationKTwxG1Y(this.$labelContentColor, textStyle, this.$it, composer, (this.$$dirty >> 6) & 14, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
