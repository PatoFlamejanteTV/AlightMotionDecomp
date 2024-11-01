package androidx.compose.foundation;

import Q5.I;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class AndroidOverscrollKt$StretchOverscrollNonClippingLayer$2 extends AbstractC3293z implements InterfaceC2073o {
    public static final AndroidOverscrollKt$StretchOverscrollNonClippingLayer$2 INSTANCE = new AndroidOverscrollKt$StretchOverscrollNonClippingLayer$2();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.AndroidOverscrollKt$StretchOverscrollNonClippingLayer$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function1 {
        final /* synthetic */ int $extraSizePx;
        final /* synthetic */ Placeable $placeable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Placeable placeable, int i8) {
            super(1);
            this.$placeable = placeable;
            this.$extraSizePx = i8;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Placeable.PlacementScope) obj);
            return I.f8786a;
        }

        public final void invoke(Placeable.PlacementScope layout) {
            AbstractC3292y.i(layout, "$this$layout");
            Placeable placeable = this.$placeable;
            int i8 = this.$extraSizePx;
            Placeable.PlacementScope.place$default(layout, placeable, i8 / 2, i8 / 2, 0.0f, 4, null);
        }
    }

    AndroidOverscrollKt$StretchOverscrollNonClippingLayer$2() {
        super(3);
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m257invoke3p2s80s((MeasureScope) obj, (Measurable) obj2, ((Constraints) obj3).m5129unboximpl());
    }

    /* renamed from: invoke-3p2s80s, reason: not valid java name */
    public final MeasureResult m257invoke3p2s80s(MeasureScope layout, Measurable measurable, long j8) {
        AbstractC3292y.i(layout, "$this$layout");
        AbstractC3292y.i(measurable, "measurable");
        Placeable mo4108measureBRTryo0 = measurable.mo4108measureBRTryo0(j8);
        int mo419roundToPx0680j_4 = layout.mo419roundToPx0680j_4(Dp.m5155constructorimpl(ClipScrollableContainerKt.getMaxSupportedElevation() * 2));
        return MeasureScope.CC.q(layout, mo4108measureBRTryo0.getWidth() + mo419roundToPx0680j_4, mo4108measureBRTryo0.getHeight() + mo419roundToPx0680j_4, null, new AnonymousClass1(mo4108measureBRTryo0, mo419roundToPx0680j_4), 4, null);
    }
}
