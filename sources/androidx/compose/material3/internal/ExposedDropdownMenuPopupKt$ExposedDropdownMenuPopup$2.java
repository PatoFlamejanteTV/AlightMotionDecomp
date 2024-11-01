package androidx.compose.material3.internal;

import Q5.I;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$2 extends AbstractC3293z implements Function0 {
    final /* synthetic */ LayoutDirection $layoutDirection;
    final /* synthetic */ Function0 $onDismissRequest;
    final /* synthetic */ PopupLayout $popupLayout;
    final /* synthetic */ String $testTag;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$2(PopupLayout popupLayout, Function0 function0, String str, LayoutDirection layoutDirection) {
        super(0);
        this.$popupLayout = popupLayout;
        this.$onDismissRequest = function0;
        this.$testTag = str;
        this.$layoutDirection = layoutDirection;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m1933invoke();
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m1933invoke() {
        this.$popupLayout.updateParameters(this.$onDismissRequest, this.$testTag, this.$layoutDirection);
    }
}
