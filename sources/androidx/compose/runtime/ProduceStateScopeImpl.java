package androidx.compose.runtime;

import kotlin.jvm.functions.Function1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ProduceStateScopeImpl<T> implements ProduceStateScope<T>, MutableState<T> {
    private final /* synthetic */ MutableState<T> $$delegate_0;
    private final U5.g coroutineContext;

    public ProduceStateScopeImpl(MutableState<T> mutableState, U5.g gVar) {
        this.coroutineContext = gVar;
        this.$$delegate_0 = mutableState;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // androidx.compose.runtime.ProduceStateScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object awaitDispose(kotlin.jvm.functions.Function0 r5, U5.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1 r0 = (androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1 r0 = new androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            java.lang.Object r5 = r0.L$0
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            Q5.t.b(r6)     // Catch: java.lang.Throwable -> L35
            goto L5a
        L35:
            r6 = move-exception
            goto L60
        L37:
            Q5.t.b(r6)
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L35
            r0.label = r3     // Catch: java.lang.Throwable -> L35
            n6.p r6 = new n6.p     // Catch: java.lang.Throwable -> L35
            U5.d r2 = V5.b.c(r0)     // Catch: java.lang.Throwable -> L35
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L35
            r6.B()     // Catch: java.lang.Throwable -> L35
            java.lang.Object r6 = r6.y()     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = V5.b.e()     // Catch: java.lang.Throwable -> L35
            if (r6 != r2) goto L57
            kotlin.coroutines.jvm.internal.h.c(r0)     // Catch: java.lang.Throwable -> L35
        L57:
            if (r6 != r1) goto L5a
            return r1
        L5a:
            Q5.h r6 = new Q5.h     // Catch: java.lang.Throwable -> L35
            r6.<init>()     // Catch: java.lang.Throwable -> L35
            throw r6     // Catch: java.lang.Throwable -> L35
        L60:
            r5.invoke()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ProduceStateScopeImpl.awaitDispose(kotlin.jvm.functions.Function0, U5.d):java.lang.Object");
    }

    @Override // androidx.compose.runtime.MutableState
    public T component1() {
        return this.$$delegate_0.component1();
    }

    @Override // androidx.compose.runtime.MutableState
    public Function1 component2() {
        return this.$$delegate_0.component2();
    }

    @Override // androidx.compose.runtime.ProduceStateScope, n6.M
    public U5.g getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.compose.runtime.MutableState, androidx.compose.runtime.State
    public T getValue() {
        return this.$$delegate_0.getValue();
    }

    @Override // androidx.compose.runtime.MutableState
    public void setValue(T t8) {
        this.$$delegate_0.setValue(t8);
    }
}
