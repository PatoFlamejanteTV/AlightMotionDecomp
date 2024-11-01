package androidx.compose.material;

import Q5.I;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class AndroidAlertDialog_androidKt$AlertDialog$3 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ InterfaceC2072n $buttons;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ InterfaceC2072n $text;
    final /* synthetic */ InterfaceC2072n $title;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidAlertDialog_androidKt$AlertDialog$3(InterfaceC2072n interfaceC2072n, Modifier modifier, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3, Shape shape, long j8, long j9, int i8) {
        super(2);
        this.$buttons = interfaceC2072n;
        this.$modifier = modifier;
        this.$title = interfaceC2072n2;
        this.$text = interfaceC2072n3;
        this.$shape = shape;
        this.$backgroundColor = j8;
        this.$contentColor = j9;
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
            ComposerKt.traceEventStart(-1787418772, i8, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:139)");
        }
        InterfaceC2072n interfaceC2072n = this.$buttons;
        Modifier modifier = this.$modifier;
        InterfaceC2072n interfaceC2072n2 = this.$title;
        InterfaceC2072n interfaceC2072n3 = this.$text;
        Shape shape = this.$shape;
        long j8 = this.$backgroundColor;
        long j9 = this.$contentColor;
        int i9 = this.$$dirty;
        AlertDialogKt.m1072AlertDialogContentWMdw5o4(interfaceC2072n, modifier, interfaceC2072n2, interfaceC2072n3, shape, j8, j9, composer, ((i9 >> 3) & 14) | ((i9 >> 3) & 112) | ((i9 >> 3) & 896) | ((i9 >> 3) & 7168) | ((i9 >> 3) & 57344) | ((i9 >> 3) & 458752) | ((i9 >> 3) & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
