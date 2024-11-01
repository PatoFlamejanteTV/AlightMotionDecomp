package androidx.compose.foundation;

import Q5.I;
import U5.d;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class NoOpOverscrollEffect implements OverscrollEffect {
    public static final NoOpOverscrollEffect INSTANCE = new NoOpOverscrollEffect();

    private NoOpOverscrollEffect() {
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: applyToFling-BMRW4eQ */
    public Object mo253applyToFlingBMRW4eQ(long j8, InterfaceC2072n interfaceC2072n, d dVar) {
        Object invoke = interfaceC2072n.invoke(Velocity.m5377boximpl(j8), dVar);
        if (invoke == V5.b.e()) {
            return invoke;
        }
        return I.f8786a;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: applyToScroll-Rhakbz0 */
    public long mo254applyToScrollRhakbz0(long j8, int i8, Function1 performScroll) {
        AbstractC3292y.i(performScroll, "performScroll");
        return ((Offset) performScroll.invoke(Offset.m2701boximpl(j8))).m2722unboximpl();
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public Modifier getEffectModifier() {
        return Modifier.Companion;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public boolean isInProgress() {
        return false;
    }
}
