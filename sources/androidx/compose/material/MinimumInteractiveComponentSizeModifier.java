package androidx.compose.material;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.e;
import androidx.compose.ui.unit.DpSize;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class MinimumInteractiveComponentSizeModifier implements LayoutModifier {
    private final long size;

    public /* synthetic */ MinimumInteractiveComponentSizeModifier(long j8, AbstractC3284p abstractC3284p) {
        this(j8);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return androidx.compose.ui.b.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return androidx.compose.ui.b.b(this, function1);
    }

    public boolean equals(Object obj) {
        MinimumInteractiveComponentSizeModifier minimumInteractiveComponentSizeModifier;
        if (obj instanceof MinimumInteractiveComponentSizeModifier) {
            minimumInteractiveComponentSizeModifier = (MinimumInteractiveComponentSizeModifier) obj;
        } else {
            minimumInteractiveComponentSizeModifier = null;
        }
        if (minimumInteractiveComponentSizeModifier == null) {
            return false;
        }
        return DpSize.m5250equalsimpl0(this.size, minimumInteractiveComponentSizeModifier.size);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, InterfaceC2072n interfaceC2072n) {
        return androidx.compose.ui.b.c(this, obj, interfaceC2072n);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, InterfaceC2072n interfaceC2072n) {
        return androidx.compose.ui.b.d(this, obj, interfaceC2072n);
    }

    /* renamed from: getSize-MYxV2XQ, reason: not valid java name */
    public final long m1252getSizeMYxV2XQ() {
        return this.size;
    }

    public int hashCode() {
        return DpSize.m5255hashCodeimpl(this.size);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return e.a(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return e.b(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo133measure3p2s80s(MeasureScope measure, Measurable measurable, long j8) {
        AbstractC3292y.i(measure, "$this$measure");
        AbstractC3292y.i(measurable, "measurable");
        Placeable mo4108measureBRTryo0 = measurable.mo4108measureBRTryo0(j8);
        int max = Math.max(mo4108measureBRTryo0.getWidth(), measure.mo419roundToPx0680j_4(DpSize.m5253getWidthD9Ej5fM(this.size)));
        int max2 = Math.max(mo4108measureBRTryo0.getHeight(), measure.mo419roundToPx0680j_4(DpSize.m5251getHeightD9Ej5fM(this.size)));
        return MeasureScope.CC.q(measure, max, max2, null, new MinimumInteractiveComponentSizeModifier$measure$1(max, mo4108measureBRTryo0, max2), 4, null);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return e.c(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return e.d(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    @Override // androidx.compose.ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.a.a(this, modifier);
    }

    private MinimumInteractiveComponentSizeModifier(long j8) {
        this.size = j8;
    }
}
