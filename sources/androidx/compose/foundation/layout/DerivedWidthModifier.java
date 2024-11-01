package androidx.compose.foundation.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Constraints;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

@Stable
/* loaded from: classes.dex */
final class DerivedWidthModifier extends InspectorValueInfo implements LayoutModifier, ModifierLocalConsumer {
    private final WindowInsets insets;
    private final MutableState unconsumedInsets$delegate;
    private final InterfaceC2073o widthCalc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DerivedWidthModifier(WindowInsets insets, Function1 inspectorInfo, InterfaceC2073o widthCalc) {
        super(inspectorInfo);
        MutableState mutableStateOf$default;
        AbstractC3292y.i(insets, "insets");
        AbstractC3292y.i(inspectorInfo, "inspectorInfo");
        AbstractC3292y.i(widthCalc, "widthCalc");
        this.insets = insets;
        this.widthCalc = widthCalc;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(insets, null, 2, null);
        this.unconsumedInsets$delegate = mutableStateOf$default;
    }

    private final WindowInsets getUnconsumedInsets() {
        return (WindowInsets) this.unconsumedInsets$delegate.getValue();
    }

    private final void setUnconsumedInsets(WindowInsets windowInsets) {
        this.unconsumedInsets$delegate.setValue(windowInsets);
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
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DerivedWidthModifier)) {
            return false;
        }
        DerivedWidthModifier derivedWidthModifier = (DerivedWidthModifier) obj;
        if (AbstractC3292y.d(this.insets, derivedWidthModifier.insets) && AbstractC3292y.d(this.widthCalc, derivedWidthModifier.widthCalc)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, InterfaceC2072n interfaceC2072n) {
        return androidx.compose.ui.b.c(this, obj, interfaceC2072n);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, InterfaceC2072n interfaceC2072n) {
        return androidx.compose.ui.b.d(this, obj, interfaceC2072n);
    }

    public int hashCode() {
        return (this.insets.hashCode() * 31) + this.widthCalc.hashCode();
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return androidx.compose.ui.layout.e.a(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return androidx.compose.ui.layout.e.b(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo133measure3p2s80s(MeasureScope measure, Measurable measurable, long j8) {
        AbstractC3292y.i(measure, "$this$measure");
        AbstractC3292y.i(measurable, "measurable");
        int intValue = ((Number) this.widthCalc.invoke(getUnconsumedInsets(), measure.getLayoutDirection(), measure)).intValue();
        if (intValue == 0) {
            return MeasureScope.CC.q(measure, 0, 0, null, DerivedWidthModifier$measure$1.INSTANCE, 4, null);
        }
        Placeable mo4108measureBRTryo0 = measurable.mo4108measureBRTryo0(Constraints.m5114copyZbe2FdA$default(j8, intValue, intValue, 0, 0, 12, null));
        return MeasureScope.CC.q(measure, intValue, mo4108measureBRTryo0.getHeight(), null, new DerivedWidthModifier$measure$2(mo4108measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return androidx.compose.ui.layout.e.c(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return androidx.compose.ui.layout.e.d(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(ModifierLocalReadScope scope) {
        AbstractC3292y.i(scope, "scope");
        setUnconsumedInsets(WindowInsetsKt.exclude(this.insets, (WindowInsets) scope.getCurrent(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets())));
    }

    @Override // androidx.compose.ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.a.a(this, modifier);
    }
}
