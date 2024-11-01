package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.LayoutDirection;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class Arrangement$spacedBy$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final Arrangement$spacedBy$1 INSTANCE = new Arrangement$spacedBy$1();

    Arrangement$spacedBy$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), (LayoutDirection) obj2);
    }

    public final Integer invoke(int i8, LayoutDirection layoutDirection) {
        AbstractC3292y.i(layoutDirection, "layoutDirection");
        return Integer.valueOf(Alignment.Companion.getStart().align(0, i8, layoutDirection));
    }
}
