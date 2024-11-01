package kotlin.jvm.internal;

import java.io.Serializable;

/* renamed from: kotlin.jvm.internal.z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3293z implements InterfaceC3287t, Serializable {
    private final int arity;

    public AbstractC3293z(int i8) {
        this.arity = i8;
    }

    @Override // kotlin.jvm.internal.InterfaceC3287t
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String j8 = U.j(this);
        AbstractC3292y.h(j8, "renderLambdaToString(...)");
        return j8;
    }
}
