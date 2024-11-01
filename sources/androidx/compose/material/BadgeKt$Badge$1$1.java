package androidx.compose.material;

import Q5.I;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BadgeKt$Badge$1$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$dirty;
    final /* synthetic */ InterfaceC2073o $content;
    final /* synthetic */ RowScope $this_Row;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.BadgeKt$Badge$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements InterfaceC2072n {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$dirty;
        final /* synthetic */ InterfaceC2073o $content;
        final /* synthetic */ RowScope $this_Row;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(InterfaceC2073o interfaceC2073o, RowScope rowScope, int i8, int i9) {
            super(2);
            this.$content = interfaceC2073o;
            this.$this_Row = rowScope;
            this.$$changed = i8;
            this.$$dirty = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(915155142, i8, -1, "androidx.compose.material.Badge.<anonymous>.<anonymous>.<anonymous> (Badge.kt:160)");
            }
            this.$content.invoke(this.$this_Row, composer, Integer.valueOf((this.$$changed & 14) | ((this.$$dirty >> 6) & 112)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeKt$Badge$1$1(InterfaceC2073o interfaceC2073o, RowScope rowScope, int i8, int i9) {
        super(2);
        this.$content = interfaceC2073o;
        this.$this_Row = rowScope;
        this.$$changed = i8;
        this.$$dirty = i9;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i8) {
        long j8;
        TextStyle m4696copyv2rsoow;
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1784526485, i8, -1, "androidx.compose.material.Badge.<anonymous>.<anonymous> (Badge.kt:156)");
        }
        TextStyle button = MaterialTheme.INSTANCE.getTypography(composer, 6).getButton();
        j8 = BadgeKt.BadgeContentFontSize;
        m4696copyv2rsoow = button.m4696copyv2rsoow((r48 & 1) != 0 ? button.spanStyle.m4628getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? button.spanStyle.m4629getFontSizeXSAIIZE() : j8, (r48 & 4) != 0 ? button.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? button.spanStyle.m4630getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? button.spanStyle.m4631getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? button.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? button.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? button.spanStyle.m4632getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? button.spanStyle.m4627getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? button.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? button.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? button.spanStyle.m4626getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? button.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? button.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? button.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? TextAlign.m5052boximpl(button.paragraphStyle.m4584getTextAligne0LSkKk()) : null, (r48 & 65536) != 0 ? TextDirection.m5066boximpl(button.paragraphStyle.m4586getTextDirections_7Xco()) : null, (r48 & 131072) != 0 ? button.paragraphStyle.m4582getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? button.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? button.platformStyle : null, (r48 & 1048576) != 0 ? button.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? LineBreak.m4972boximpl(button.paragraphStyle.m4581getLineBreakrAG3T2k()) : null, (r48 & 4194304) != 0 ? Hyphens.m4962boximpl(button.paragraphStyle.m4579getHyphensvmbZdU8()) : null, (r48 & 8388608) != 0 ? button.paragraphStyle.getTextMotion() : null);
        TextKt.ProvideTextStyle(m4696copyv2rsoow, ComposableLambdaKt.composableLambda(composer, 915155142, true, new AnonymousClass1(this.$content, this.$this_Row, this.$$changed, this.$$dirty)), composer, 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
