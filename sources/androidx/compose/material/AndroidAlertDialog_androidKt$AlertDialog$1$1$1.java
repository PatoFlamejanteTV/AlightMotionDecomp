package androidx.compose.material;

import Q5.I;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class AndroidAlertDialog_androidKt$AlertDialog$1$1$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ InterfaceC2072n $confirmButton;
    final /* synthetic */ InterfaceC2072n $dismissButton;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidAlertDialog_androidKt$AlertDialog$1$1$1(InterfaceC2072n interfaceC2072n, int i8, InterfaceC2072n interfaceC2072n2) {
        super(2);
        this.$dismissButton = interfaceC2072n;
        this.$$dirty = i8;
        this.$confirmButton = interfaceC2072n2;
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
            ComposerKt.traceEventStart(1789213604, i8, -1, "androidx.compose.material.AlertDialog.<anonymous>.<anonymous>.<anonymous> (AndroidAlertDialog.android.kt:83)");
        }
        InterfaceC2072n interfaceC2072n = this.$dismissButton;
        composer.startReplaceableGroup(-1046483318);
        if (interfaceC2072n != null) {
            interfaceC2072n.invoke(composer, Integer.valueOf((this.$$dirty >> 9) & 14));
            I i9 = I.f8786a;
        }
        composer.endReplaceableGroup();
        this.$confirmButton.invoke(composer, Integer.valueOf((this.$$dirty >> 3) & 14));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
