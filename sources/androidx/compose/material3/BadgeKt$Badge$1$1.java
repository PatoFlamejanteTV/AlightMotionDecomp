package androidx.compose.material3;

import Q5.I;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.tokens.BadgeTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class BadgeKt$Badge$1$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty$1;
    final /* synthetic */ InterfaceC2073o $content;
    final /* synthetic */ RowScope $this_Row;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material3.BadgeKt$Badge$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements InterfaceC2072n {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ int $$dirty$1;
        final /* synthetic */ InterfaceC2073o $content;
        final /* synthetic */ RowScope $this_Row;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(InterfaceC2073o interfaceC2073o, RowScope rowScope, int i8, int i9) {
            super(2);
            this.$content = interfaceC2073o;
            this.$this_Row = rowScope;
            this.$$dirty = i8;
            this.$$dirty$1 = i9;
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
                ComposerKt.traceEventStart(-1175098791, i8, -1, "androidx.compose.material3.Badge.<anonymous>.<anonymous>.<anonymous> (Badge.kt:179)");
            }
            this.$content.invoke(this.$this_Row, composer, Integer.valueOf((this.$$dirty & 14) | ((this.$$dirty$1 >> 6) & 112)));
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
        this.$$dirty = i8;
        this.$$dirty$1 = i9;
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
            ComposerKt.traceEventStart(5609066, i8, -1, "androidx.compose.material3.Badge.<anonymous>.<anonymous> (Badge.kt:172)");
        }
        TextKt.ProvideTextStyle(IncludeFontPaddingHelper_androidKt.copyAndSetFontPadding(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer, 6), BadgeTokens.INSTANCE.getLargeLabelTextFont()), false), ComposableLambdaKt.composableLambda(composer, -1175098791, true, new AnonymousClass1(this.$content, this.$this_Row, this.$$dirty, this.$$dirty$1)), composer, 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
