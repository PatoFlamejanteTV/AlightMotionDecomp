package androidx.compose.material.internal;

import Q5.I;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.window.PopupPositionProvider;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$7 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC2072n $content;
    final /* synthetic */ Function0 $onDismissRequest;
    final /* synthetic */ PopupPositionProvider $popupPositionProvider;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$7(Function0 function0, PopupPositionProvider popupPositionProvider, InterfaceC2072n interfaceC2072n, int i8, int i9) {
        super(2);
        this.$onDismissRequest = function0;
        this.$popupPositionProvider = popupPositionProvider;
        this.$content = interfaceC2072n;
        this.$$changed = i8;
        this.$$default = i9;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        ExposedDropdownMenuPopupKt.ExposedDropdownMenuPopup(this.$onDismissRequest, this.$popupPositionProvider, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
