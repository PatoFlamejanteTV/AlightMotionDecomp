package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.LayoutDirection;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class Arrangement$spacedBy$3 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ Alignment.Vertical $alignment;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Arrangement$spacedBy$3(Alignment.Vertical vertical) {
        super(2);
        this.$alignment = vertical;
    }

    public final Integer invoke(int i8, LayoutDirection layoutDirection) {
        AbstractC3292y.i(layoutDirection, "<anonymous parameter 1>");
        return Integer.valueOf(this.$alignment.align(0, i8));
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), (LayoutDirection) obj2);
    }
}
