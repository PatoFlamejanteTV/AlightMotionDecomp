package androidx.compose.foundation.gestures.snapping;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", l = {362}, m = "animateDecay")
/* loaded from: classes.dex */
public final class SnapFlingBehaviorKt$animateDecay$1 extends d {
    float F$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SnapFlingBehaviorKt$animateDecay$1(U5.d dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object animateDecay;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        animateDecay = SnapFlingBehaviorKt.animateDecay(null, 0.0f, null, null, null, this);
        return animateDecay;
    }
}
