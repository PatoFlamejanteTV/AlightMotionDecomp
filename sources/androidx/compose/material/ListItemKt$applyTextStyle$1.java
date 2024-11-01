package androidx.compose.material;

import Q5.I;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.text.TextStyle;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class ListItemKt$applyTextStyle$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ float $contentAlpha;
    final /* synthetic */ InterfaceC2072n $icon;
    final /* synthetic */ TextStyle $textStyle;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.ListItemKt$applyTextStyle$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements InterfaceC2072n {
        final /* synthetic */ InterfaceC2072n $icon;
        final /* synthetic */ TextStyle $textStyle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TextStyle textStyle, InterfaceC2072n interfaceC2072n) {
            super(2);
            this.$textStyle = textStyle;
            this.$icon = interfaceC2072n;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        @Composable
        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1665877604, i8, -1, "androidx.compose.material.applyTextStyle.<anonymous>.<anonymous> (ListItem.kt:423)");
            }
            TextKt.ProvideTextStyle(this.$textStyle, this.$icon, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListItemKt$applyTextStyle$1(float f8, TextStyle textStyle, InterfaceC2072n interfaceC2072n) {
        super(2);
        this.$contentAlpha = f8;
        this.$textStyle = textStyle;
        this.$icon = interfaceC2072n;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    @Composable
    public final void invoke(Composer composer, int i8) {
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-830176860, i8, -1, "androidx.compose.material.applyTextStyle.<anonymous> (ListItem.kt:422)");
        }
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(this.$contentAlpha))}, ComposableLambdaKt.composableLambda(composer, 1665877604, true, new AnonymousClass1(this.$textStyle, this.$icon)), composer, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
