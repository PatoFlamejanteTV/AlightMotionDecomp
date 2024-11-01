package androidx.compose.material3;

import Q5.I;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SnackbarKt$Snackbar$actionComposable$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ long $actionColor;
    final /* synthetic */ String $actionLabel;
    final /* synthetic */ SnackbarData $snackbarData;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends AbstractC3293z implements InterfaceC2073o {
        final /* synthetic */ String $actionLabel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str) {
            super(3);
            this.$actionLabel = str;
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f8786a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(RowScope TextButton, Composer composer, int i8) {
            AbstractC3292y.i(TextButton, "$this$TextButton");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(521110564, i8, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:211)");
            }
            TextKt.m1856TextfLXpl1I(this.$actionLabel, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 0, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarKt$Snackbar$actionComposable$1(long j8, int i8, SnackbarData snackbarData, String str) {
        super(2);
        this.$actionColor = j8;
        this.$$dirty = i8;
        this.$snackbarData = snackbarData;
        this.$actionLabel = str;
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
            ComposerKt.traceEventStart(-1378313599, i8, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:207)");
        }
        ButtonColors m1462textButtonColorsro_MJ88 = ButtonDefaults.INSTANCE.m1462textButtonColorsro_MJ88(0L, this.$actionColor, 0L, 0L, composer, ((this.$$dirty >> 15) & 112) | 24576, 13);
        SnackbarData snackbarData = this.$snackbarData;
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(snackbarData);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new SnackbarKt$Snackbar$actionComposable$1$1$1(snackbarData);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        ButtonKt.TextButton((Function0) rememberedValue, null, false, null, m1462textButtonColorsro_MJ88, null, null, null, null, ComposableLambdaKt.composableLambda(composer, 521110564, true, new AnonymousClass2(this.$actionLabel)), composer, 805306368, 494);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
