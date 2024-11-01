package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SelectionRegistrarImpl$sort$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ LayoutCoordinates $containerLayoutCoordinates;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionRegistrarImpl$sort$1(LayoutCoordinates layoutCoordinates) {
        super(2);
        this.$containerLayoutCoordinates = layoutCoordinates;
    }

    @Override // c6.InterfaceC2072n
    public final Integer invoke(Selectable a9, Selectable b9) {
        long m2728getZeroF1C5BW0;
        long m2728getZeroF1C5BW02;
        int a10;
        AbstractC3292y.i(a9, "a");
        AbstractC3292y.i(b9, "b");
        LayoutCoordinates layoutCoordinates = a9.getLayoutCoordinates();
        LayoutCoordinates layoutCoordinates2 = b9.getLayoutCoordinates();
        if (layoutCoordinates != null) {
            m2728getZeroF1C5BW0 = this.$containerLayoutCoordinates.mo4116localPositionOfR5De75A(layoutCoordinates, Offset.Companion.m2728getZeroF1C5BW0());
        } else {
            m2728getZeroF1C5BW0 = Offset.Companion.m2728getZeroF1C5BW0();
        }
        if (layoutCoordinates2 != null) {
            m2728getZeroF1C5BW02 = this.$containerLayoutCoordinates.mo4116localPositionOfR5De75A(layoutCoordinates2, Offset.Companion.m2728getZeroF1C5BW0());
        } else {
            m2728getZeroF1C5BW02 = Offset.Companion.m2728getZeroF1C5BW0();
        }
        if (Offset.m2713getYimpl(m2728getZeroF1C5BW0) == Offset.m2713getYimpl(m2728getZeroF1C5BW02)) {
            a10 = T5.a.a(Float.valueOf(Offset.m2712getXimpl(m2728getZeroF1C5BW0)), Float.valueOf(Offset.m2712getXimpl(m2728getZeroF1C5BW02)));
        } else {
            a10 = T5.a.a(Float.valueOf(Offset.m2713getYimpl(m2728getZeroF1C5BW0)), Float.valueOf(Offset.m2713getYimpl(m2728getZeroF1C5BW02)));
        }
        return Integer.valueOf(a10);
    }
}
