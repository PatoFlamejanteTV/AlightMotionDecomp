package androidx.datastore.core;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.datastore.core.RunOnce", f = "DataStoreImpl.kt", l = {552, TypedValues.PositionType.TYPE_SIZE_PERCENT}, m = "runIfNeeded")
/* loaded from: classes3.dex */
public final class RunOnce$runIfNeeded$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RunOnce this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RunOnce$runIfNeeded$1(RunOnce runOnce, U5.d dVar) {
        super(dVar);
        this.this$0 = runOnce;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.runIfNeeded(this);
    }
}
