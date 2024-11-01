package androidx.compose.foundation.layout;

import android.graphics.Insets;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import kotlin.jvm.internal.AbstractC3292y;

@RequiresApi(30)
/* loaded from: classes.dex */
interface SideCalculator {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final SideCalculator$Companion$LeftSideCalculator$1 LeftSideCalculator = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$LeftSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            public Insets adjustInsets(Insets oldInsets, int i8) {
                int i9;
                int i10;
                int i11;
                Insets of;
                AbstractC3292y.i(oldInsets, "oldInsets");
                i9 = oldInsets.top;
                i10 = oldInsets.right;
                i11 = oldInsets.bottom;
                of = Insets.of(i8, i9, i10, i11);
                AbstractC3292y.h(of, "of(newValue, oldInsets.t….right, oldInsets.bottom)");
                return of;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedOffsets-MK-Hz9U */
            public long mo605consumedOffsetsMKHz9U(long j8) {
                return androidx.compose.ui.geometry.OffsetKt.Offset(Offset.m2712getXimpl(j8), 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedVelocity-QWom1Mo */
            public long mo606consumedVelocityQWom1Mo(long j8, float f8) {
                return VelocityKt.Velocity(Velocity.m5386getXimpl(j8) - f8, 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public /* synthetic */ float hideMotion(float f8, float f9) {
                return f.a(this, f8, f9);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float f8, float f9) {
                return f8;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public /* synthetic */ float showMotion(float f8, float f9) {
                return f.b(this, f8, f9);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(Insets insets) {
                int i8;
                AbstractC3292y.i(insets, "insets");
                i8 = insets.left;
                return i8;
            }
        };
        private static final SideCalculator$Companion$TopSideCalculator$1 TopSideCalculator = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$TopSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            public Insets adjustInsets(Insets oldInsets, int i8) {
                int i9;
                int i10;
                int i11;
                Insets of;
                AbstractC3292y.i(oldInsets, "oldInsets");
                i9 = oldInsets.left;
                i10 = oldInsets.right;
                i11 = oldInsets.bottom;
                of = Insets.of(i9, i8, i10, i11);
                AbstractC3292y.h(of, "of(oldInsets.left, newVa….right, oldInsets.bottom)");
                return of;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedOffsets-MK-Hz9U */
            public long mo605consumedOffsetsMKHz9U(long j8) {
                return androidx.compose.ui.geometry.OffsetKt.Offset(0.0f, Offset.m2713getYimpl(j8));
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedVelocity-QWom1Mo */
            public long mo606consumedVelocityQWom1Mo(long j8, float f8) {
                return VelocityKt.Velocity(0.0f, Velocity.m5387getYimpl(j8) - f8);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public /* synthetic */ float hideMotion(float f8, float f9) {
                return f.a(this, f8, f9);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float f8, float f9) {
                return f9;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public /* synthetic */ float showMotion(float f8, float f9) {
                return f.b(this, f8, f9);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(Insets insets) {
                int i8;
                AbstractC3292y.i(insets, "insets");
                i8 = insets.top;
                return i8;
            }
        };
        private static final SideCalculator$Companion$RightSideCalculator$1 RightSideCalculator = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$RightSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            public Insets adjustInsets(Insets oldInsets, int i8) {
                int i9;
                int i10;
                int i11;
                Insets of;
                AbstractC3292y.i(oldInsets, "oldInsets");
                i9 = oldInsets.left;
                i10 = oldInsets.top;
                i11 = oldInsets.bottom;
                of = Insets.of(i9, i10, i8, i11);
                AbstractC3292y.h(of, "of(oldInsets.left, oldIn…wValue, oldInsets.bottom)");
                return of;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedOffsets-MK-Hz9U */
            public long mo605consumedOffsetsMKHz9U(long j8) {
                return androidx.compose.ui.geometry.OffsetKt.Offset(Offset.m2712getXimpl(j8), 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedVelocity-QWom1Mo */
            public long mo606consumedVelocityQWom1Mo(long j8, float f8) {
                return VelocityKt.Velocity(Velocity.m5386getXimpl(j8) + f8, 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public /* synthetic */ float hideMotion(float f8, float f9) {
                return f.a(this, f8, f9);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float f8, float f9) {
                return -f8;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public /* synthetic */ float showMotion(float f8, float f9) {
                return f.b(this, f8, f9);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(Insets insets) {
                int i8;
                AbstractC3292y.i(insets, "insets");
                i8 = insets.right;
                return i8;
            }
        };
        private static final SideCalculator$Companion$BottomSideCalculator$1 BottomSideCalculator = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$BottomSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            public Insets adjustInsets(Insets oldInsets, int i8) {
                int i9;
                int i10;
                int i11;
                Insets of;
                AbstractC3292y.i(oldInsets, "oldInsets");
                i9 = oldInsets.left;
                i10 = oldInsets.top;
                i11 = oldInsets.right;
                of = Insets.of(i9, i10, i11, i8);
                AbstractC3292y.h(of, "of(oldInsets.left, oldIn…ldInsets.right, newValue)");
                return of;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedOffsets-MK-Hz9U */
            public long mo605consumedOffsetsMKHz9U(long j8) {
                return androidx.compose.ui.geometry.OffsetKt.Offset(0.0f, Offset.m2713getYimpl(j8));
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedVelocity-QWom1Mo */
            public long mo606consumedVelocityQWom1Mo(long j8, float f8) {
                return VelocityKt.Velocity(0.0f, Velocity.m5387getYimpl(j8) + f8);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public /* synthetic */ float hideMotion(float f8, float f9) {
                return f.a(this, f8, f9);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float f8, float f9) {
                return -f9;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public /* synthetic */ float showMotion(float f8, float f9) {
                return f.b(this, f8, f9);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(Insets insets) {
                int i8;
                AbstractC3292y.i(insets, "insets");
                i8 = insets.bottom;
                return i8;
            }
        };

        private Companion() {
        }

        /* renamed from: chooseCalculator-ni1skBw, reason: not valid java name */
        public final SideCalculator m607chooseCalculatorni1skBw(int i8, LayoutDirection layoutDirection) {
            AbstractC3292y.i(layoutDirection, "layoutDirection");
            WindowInsetsSides.Companion companion = WindowInsetsSides.Companion;
            if (WindowInsetsSides.m657equalsimpl0(i8, companion.m671getLeftJoeWqyM())) {
                return LeftSideCalculator;
            }
            if (WindowInsetsSides.m657equalsimpl0(i8, companion.m674getTopJoeWqyM())) {
                return TopSideCalculator;
            }
            if (WindowInsetsSides.m657equalsimpl0(i8, companion.m672getRightJoeWqyM())) {
                return RightSideCalculator;
            }
            if (WindowInsetsSides.m657equalsimpl0(i8, companion.m668getBottomJoeWqyM())) {
                return BottomSideCalculator;
            }
            if (WindowInsetsSides.m657equalsimpl0(i8, companion.m673getStartJoeWqyM())) {
                if (layoutDirection == LayoutDirection.Ltr) {
                    return LeftSideCalculator;
                }
                return RightSideCalculator;
            }
            if (WindowInsetsSides.m657equalsimpl0(i8, companion.m669getEndJoeWqyM())) {
                if (layoutDirection == LayoutDirection.Ltr) {
                    return RightSideCalculator;
                }
                return LeftSideCalculator;
            }
            throw new IllegalStateException("Only Left, Top, Right, Bottom, Start and End are allowed".toString());
        }
    }

    Insets adjustInsets(Insets insets, int i8);

    /* renamed from: consumedOffsets-MK-Hz9U, reason: not valid java name */
    long mo605consumedOffsetsMKHz9U(long j8);

    /* renamed from: consumedVelocity-QWom1Mo, reason: not valid java name */
    long mo606consumedVelocityQWom1Mo(long j8, float f8);

    float hideMotion(float f8, float f9);

    float motionOf(float f8, float f9);

    float showMotion(float f8, float f9);

    int valueOf(Insets insets);
}
