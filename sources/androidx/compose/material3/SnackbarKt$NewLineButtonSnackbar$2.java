package androidx.compose.material3;

import Q5.I;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextStyle;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SnackbarKt$NewLineButtonSnackbar$2 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ InterfaceC2072n $action;
    final /* synthetic */ long $actionContentColor;
    final /* synthetic */ TextStyle $actionTextStyle;
    final /* synthetic */ InterfaceC2072n $dismissAction;
    final /* synthetic */ long $dismissActionContentColor;
    final /* synthetic */ InterfaceC2072n $text;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarKt$NewLineButtonSnackbar$2(InterfaceC2072n interfaceC2072n, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3, TextStyle textStyle, long j8, long j9, int i8) {
        super(2);
        this.$text = interfaceC2072n;
        this.$action = interfaceC2072n2;
        this.$dismissAction = interfaceC2072n3;
        this.$actionTextStyle = textStyle;
        this.$actionContentColor = j8;
        this.$dismissActionContentColor = j9;
        this.$$changed = i8;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        SnackbarKt.m1747NewLineButtonSnackbarkKq0p4A(this.$text, this.$action, this.$dismissAction, this.$actionTextStyle, this.$actionContentColor, this.$dismissActionContentColor, composer, this.$$changed | 1);
    }
}
