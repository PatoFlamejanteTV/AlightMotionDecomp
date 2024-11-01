package androidx.compose.material3;

import Q5.I;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.window.DialogProperties;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidAlertDialog_androidKt$AlertDialog$2 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC2072n $confirmButton;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ InterfaceC2072n $dismissButton;
    final /* synthetic */ InterfaceC2072n $icon;
    final /* synthetic */ long $iconContentColor;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0 $onDismissRequest;
    final /* synthetic */ DialogProperties $properties;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ InterfaceC2072n $text;
    final /* synthetic */ long $textContentColor;
    final /* synthetic */ InterfaceC2072n $title;
    final /* synthetic */ long $titleContentColor;
    final /* synthetic */ float $tonalElevation;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidAlertDialog_androidKt$AlertDialog$2(Function0 function0, InterfaceC2072n interfaceC2072n, Modifier modifier, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3, InterfaceC2072n interfaceC2072n4, InterfaceC2072n interfaceC2072n5, Shape shape, long j8, long j9, long j10, long j11, float f8, DialogProperties dialogProperties, int i8, int i9, int i10) {
        super(2);
        this.$onDismissRequest = function0;
        this.$confirmButton = interfaceC2072n;
        this.$modifier = modifier;
        this.$dismissButton = interfaceC2072n2;
        this.$icon = interfaceC2072n3;
        this.$title = interfaceC2072n4;
        this.$text = interfaceC2072n5;
        this.$shape = shape;
        this.$containerColor = j8;
        this.$iconContentColor = j9;
        this.$titleContentColor = j10;
        this.$textContentColor = j11;
        this.$tonalElevation = f8;
        this.$properties = dialogProperties;
        this.$$changed = i8;
        this.$$changed1 = i9;
        this.$$default = i10;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        AndroidAlertDialog_androidKt.m1430AlertDialogOix01E0(this.$onDismissRequest, this.$confirmButton, this.$modifier, this.$dismissButton, this.$icon, this.$title, this.$text, this.$shape, this.$containerColor, this.$iconContentColor, this.$titleContentColor, this.$textContentColor, this.$tonalElevation, this.$properties, composer, this.$$changed | 1, this.$$changed1, this.$$default);
    }
}
