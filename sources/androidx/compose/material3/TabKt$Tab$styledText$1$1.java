package androidx.compose.material3;

import Q5.I;
import androidx.compose.material3.tokens.PrimaryNavigationTabTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TabKt$Tab$styledText$1$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ InterfaceC2072n $text;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabKt$Tab$styledText$1$1(InterfaceC2072n interfaceC2072n, int i8) {
        super(2);
        this.$text = interfaceC2072n;
        this.$$dirty = i8;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i8) {
        TextStyle m4691copyHL5avdY;
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(708874428, i8, -1, "androidx.compose.material3.Tab.<anonymous>.<anonymous> (Tab.kt:103)");
        }
        m4691copyHL5avdY = r4.m4691copyHL5avdY((r42 & 1) != 0 ? r4.spanStyle.m4628getColor0d7_KjU() : 0L, (r42 & 2) != 0 ? r4.spanStyle.m4629getFontSizeXSAIIZE() : 0L, (r42 & 4) != 0 ? r4.spanStyle.getFontWeight() : null, (r42 & 8) != 0 ? r4.spanStyle.m4630getFontStyle4Lr2A7w() : null, (r42 & 16) != 0 ? r4.spanStyle.m4631getFontSynthesisZQGJjVo() : null, (r42 & 32) != 0 ? r4.spanStyle.getFontFamily() : null, (r42 & 64) != 0 ? r4.spanStyle.getFontFeatureSettings() : null, (r42 & 128) != 0 ? r4.spanStyle.m4632getLetterSpacingXSAIIZE() : 0L, (r42 & 256) != 0 ? r4.spanStyle.m4627getBaselineShift5SSeXJ0() : null, (r42 & 512) != 0 ? r4.spanStyle.getTextGeometricTransform() : null, (r42 & 1024) != 0 ? r4.spanStyle.getLocaleList() : null, (r42 & 2048) != 0 ? r4.spanStyle.m4626getBackground0d7_KjU() : 0L, (r42 & 4096) != 0 ? r4.spanStyle.getTextDecoration() : null, (r42 & 8192) != 0 ? r4.spanStyle.getShadow() : null, (r42 & 16384) != 0 ? TextAlign.m5052boximpl(r4.paragraphStyle.m4584getTextAligne0LSkKk()) : TextAlign.m5052boximpl(TextAlign.Companion.m5059getCentere0LSkKk()), (r42 & 32768) != 0 ? TextDirection.m5066boximpl(r4.paragraphStyle.m4586getTextDirections_7Xco()) : null, (r42 & 65536) != 0 ? r4.paragraphStyle.m4582getLineHeightXSAIIZE() : 0L, (r42 & 131072) != 0 ? TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer, 6), PrimaryNavigationTabTokens.INSTANCE.getLabelTextFont()).paragraphStyle.getTextIndent() : null);
        TextKt.ProvideTextStyle(m4691copyHL5avdY, this.$text, composer, (this.$$dirty >> 9) & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
