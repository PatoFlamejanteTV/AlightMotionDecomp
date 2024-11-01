package androidx.compose.material;

import Q5.I;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AlertDialogKt$AlertDialogContent$2 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ InterfaceC2072n $buttons;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ InterfaceC2072n $text;
    final /* synthetic */ InterfaceC2072n $title;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertDialogKt$AlertDialogContent$2(InterfaceC2072n interfaceC2072n, Modifier modifier, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3, Shape shape, long j8, long j9, int i8, int i9) {
        super(2);
        this.$buttons = interfaceC2072n;
        this.$modifier = modifier;
        this.$title = interfaceC2072n2;
        this.$text = interfaceC2072n3;
        this.$shape = shape;
        this.$backgroundColor = j8;
        this.$contentColor = j9;
        this.$$changed = i8;
        this.$$default = i9;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        AlertDialogKt.m1072AlertDialogContentWMdw5o4(this.$buttons, this.$modifier, this.$title, this.$text, this.$shape, this.$backgroundColor, this.$contentColor, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
