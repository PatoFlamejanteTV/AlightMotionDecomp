package androidx.compose.foundation.layout;

import Q5.I;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BoxWithConstraintsKt$BoxWithConstraints$1$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ InterfaceC2073o $content;
    final /* synthetic */ MeasurePolicy $measurePolicy;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoxWithConstraintsKt$BoxWithConstraints$1$1(MeasurePolicy measurePolicy, InterfaceC2073o interfaceC2073o, int i8) {
        super(2);
        this.$measurePolicy = measurePolicy;
        this.$content = interfaceC2073o;
        this.$$dirty = i8;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m514invoke0kLqBqw((SubcomposeMeasureScope) obj, ((Constraints) obj2).m5129unboximpl());
    }

    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public final MeasureResult m514invoke0kLqBqw(SubcomposeMeasureScope SubcomposeLayout, long j8) {
        AbstractC3292y.i(SubcomposeLayout, "$this$SubcomposeLayout");
        return this.$measurePolicy.mo109measure3p2s80s(SubcomposeLayout, SubcomposeLayout.subcompose(I.f8786a, ComposableLambdaKt.composableLambdaInstance(-1945019079, true, new BoxWithConstraintsKt$BoxWithConstraints$1$1$measurables$1(this.$content, new BoxWithConstraintsScopeImpl(SubcomposeLayout, j8, null), this.$$dirty))), j8);
    }
}
