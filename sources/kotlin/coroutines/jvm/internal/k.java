package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.InterfaceC3287t;
import kotlin.jvm.internal.U;

/* loaded from: classes5.dex */
public abstract class k extends j implements InterfaceC3287t {
    private final int arity;

    public k(int i8, U5.d dVar) {
        super(dVar);
        this.arity = i8;
    }

    @Override // kotlin.jvm.internal.InterfaceC3287t
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public String toString() {
        if (getCompletion() == null) {
            String i8 = U.i(this);
            AbstractC3292y.h(i8, "renderLambdaToString(...)");
            return i8;
        }
        return super.toString();
    }
}
