package androidx.compose.foundation.gestures.snapping;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", l = {312}, m = "approach")
/* loaded from: classes.dex */
public final class SnapFlingBehaviorKt$approach$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SnapFlingBehaviorKt$approach$1(U5.d dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object approach;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        approach = SnapFlingBehaviorKt.approach(null, 0.0f, 0.0f, null, null, null, null, this);
        return approach;
    }
}
