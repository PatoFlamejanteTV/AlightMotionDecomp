package androidx.compose.foundation.gestures;

import Q5.I;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3292y;
import n6.N;

/* loaded from: classes.dex */
final class DefaultTransformableState implements TransformableState {
    private final MutableState<Boolean> isTransformingState;
    private final InterfaceC2073o onTransformation;
    private final MutatorMutex transformMutex;
    private final TransformScope transformScope;

    public DefaultTransformableState(InterfaceC2073o onTransformation) {
        MutableState<Boolean> mutableStateOf$default;
        AbstractC3292y.i(onTransformation, "onTransformation");
        this.onTransformation = onTransformation;
        this.transformScope = new TransformScope() { // from class: androidx.compose.foundation.gestures.DefaultTransformableState$transformScope$1
            @Override // androidx.compose.foundation.gestures.TransformScope
            /* renamed from: transformBy-d-4ec7I, reason: not valid java name */
            public void mo355transformByd4ec7I(float f8, long j8, float f9) {
                DefaultTransformableState.this.getOnTransformation().invoke(Float.valueOf(f8), Offset.m2701boximpl(j8), Float.valueOf(f9));
            }
        };
        this.transformMutex = new MutatorMutex();
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.isTransformingState = mutableStateOf$default;
    }

    public final InterfaceC2073o getOnTransformation() {
        return this.onTransformation;
    }

    @Override // androidx.compose.foundation.gestures.TransformableState
    public boolean isTransformInProgress() {
        return this.isTransformingState.getValue().booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.TransformableState
    public Object transform(MutatePriority mutatePriority, InterfaceC2072n interfaceC2072n, U5.d dVar) {
        Object e8 = N.e(new DefaultTransformableState$transform$2(this, mutatePriority, interfaceC2072n, null), dVar);
        if (e8 == V5.b.e()) {
            return e8;
        }
        return I.f8786a;
    }
}
