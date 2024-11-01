package androidx.compose.material3;

import Q5.I;
import androidx.compose.material3.tokens.NavigationBarTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NavigationBarKt$NavigationBarItem$styledLabel$1$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ NavigationBarItemColors $colors;
    final /* synthetic */ InterfaceC2072n $label;
    final /* synthetic */ boolean $selected;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledLabel$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements InterfaceC2072n {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ InterfaceC2072n $label;
        final /* synthetic */ TextStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TextStyle textStyle, InterfaceC2072n interfaceC2072n, int i8) {
            super(2);
            this.$style = textStyle;
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
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2061683080, i8, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous>.<anonymous> (NavigationBar.kt:183)");
            }
            TextKt.ProvideTextStyle(this.$style, this.$label, composer, (this.$$dirty >> 15) & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationBarKt$NavigationBarItem$styledLabel$1$1(NavigationBarItemColors navigationBarItemColors, boolean z8, int i8, InterfaceC2072n interfaceC2072n) {
        super(2);
        this.$colors = navigationBarItemColors;
        this.$selected = z8;
        this.$$dirty = i8;
        this.$label = interfaceC2072n;
    }

    /* renamed from: invoke$lambda-0, reason: not valid java name */
    private static final long m1687invoke$lambda0(State<Color> state) {
        return state.getValue().m2958unboximpl();
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
            ComposerKt.traceEventStart(1644987592, i8, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:180)");
        }
        TextStyle fromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer, 6), NavigationBarTokens.INSTANCE.getLabelTextFont());
        NavigationBarItemColors navigationBarItemColors = this.$colors;
        boolean z8 = this.$selected;
        int i9 = this.$$dirty;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2938boximpl(m1687invoke$lambda0(navigationBarItemColors.textColor$material3_release(z8, composer, ((i9 >> 21) & 112) | ((i9 >> 3) & 14)))))}, ComposableLambdaKt.composableLambda(composer, 2061683080, true, new AnonymousClass1(fromToken, this.$label, this.$$dirty)), composer, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
