package androidx.compose.material.internal;

import Q5.I;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRectKt;
import e6.AbstractC2829a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$5 extends AbstractC3293z implements Function1 {
    final /* synthetic */ PopupLayout $popupLayout;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$5(PopupLayout popupLayout) {
        super(1);
        this.$popupLayout = popupLayout;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LayoutCoordinates) obj);
        return I.f8786a;
    }

    public final void invoke(LayoutCoordinates childCoordinates) {
        AbstractC3292y.i(childCoordinates, "childCoordinates");
        LayoutCoordinates parentLayoutCoordinates = childCoordinates.getParentLayoutCoordinates();
        AbstractC3292y.f(parentLayoutCoordinates);
        long mo4115getSizeYbymL2g = parentLayoutCoordinates.mo4115getSizeYbymL2g();
        long positionInWindow = LayoutCoordinatesKt.positionInWindow(parentLayoutCoordinates);
        this.$popupLayout.setParentBounds(IntRectKt.m5311IntRectVbeCjmY(IntOffsetKt.IntOffset(AbstractC2829a.d(Offset.m2712getXimpl(positionInWindow)), AbstractC2829a.d(Offset.m2713getYimpl(positionInWindow))), mo4115getSizeYbymL2g));
        this.$popupLayout.updatePosition();
    }
}
