package androidx.compose.material;

import Q5.I;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BottomNavigationKt$BottomNavigationItem$styledLabel$1$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ InterfaceC2072n $label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomNavigationKt$BottomNavigationItem$styledLabel$1$1(InterfaceC2072n interfaceC2072n, int i8) {
        super(2);
        this.$label = interfaceC2072n;
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
        TextStyle m4696copyv2rsoow;
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1343298261, i8, -1, "androidx.compose.material.BottomNavigationItem.<anonymous>.<anonymous> (BottomNavigation.kt:159)");
        }
        m4696copyv2rsoow = r3.m4696copyv2rsoow((r48 & 1) != 0 ? r3.spanStyle.m4628getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r3.spanStyle.m4629getFontSizeXSAIIZE() : 0L, (r48 & 4) != 0 ? r3.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r3.spanStyle.m4630getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r3.spanStyle.m4631getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r3.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r3.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r3.spanStyle.m4632getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? r3.spanStyle.m4627getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r3.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r3.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r3.spanStyle.m4626getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r3.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r3.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r3.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? TextAlign.m5052boximpl(r3.paragraphStyle.m4584getTextAligne0LSkKk()) : TextAlign.m5052boximpl(TextAlign.Companion.m5059getCentere0LSkKk()), (r48 & 65536) != 0 ? TextDirection.m5066boximpl(r3.paragraphStyle.m4586getTextDirections_7Xco()) : null, (r48 & 131072) != 0 ? r3.paragraphStyle.m4582getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r3.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r3.platformStyle : null, (r48 & 1048576) != 0 ? r3.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? LineBreak.m4972boximpl(r3.paragraphStyle.m4581getLineBreakrAG3T2k()) : null, (r48 & 4194304) != 0 ? Hyphens.m4962boximpl(r3.paragraphStyle.m4579getHyphensvmbZdU8()) : null, (r48 & 8388608) != 0 ? MaterialTheme.INSTANCE.getTypography(composer, 6).getCaption().paragraphStyle.getTextMotion() : null);
        TextKt.ProvideTextStyle(m4696copyv2rsoow, this.$label, composer, (this.$$dirty >> 15) & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
