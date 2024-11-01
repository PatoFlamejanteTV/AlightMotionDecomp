package androidx.compose.foundation.gestures.snapping;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", l = {407}, m = "animateSnap")
/* loaded from: classes.dex */
public final class SnapFlingBehaviorKt$animateSnap$1 extends d {
    float F$0;
    float F$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SnapFlingBehaviorKt$animateSnap$1(U5.d dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object animateSnap;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        animateSnap = SnapFlingBehaviorKt.animateSnap(null, 0.0f, 0.0f, null, null, null, this);
        return animateSnap;
    }
}
