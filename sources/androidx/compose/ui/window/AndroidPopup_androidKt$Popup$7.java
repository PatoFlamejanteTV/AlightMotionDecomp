package androidx.compose.ui.window;

import Q5.I;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidPopup_androidKt$Popup$7 extends AbstractC3293z implements Function1 {
    final /* synthetic */ PopupLayout $popupLayout;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$7(PopupLayout popupLayout) {
        super(1);
        this.$popupLayout = popupLayout;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LayoutCoordinates) obj);
        return I.f8786a;
    }

    public final void invoke(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        AbstractC3292y.f(parentLayoutCoordinates);
        this.$popupLayout.updateParentLayoutCoordinates(parentLayoutCoordinates);
    }
}
