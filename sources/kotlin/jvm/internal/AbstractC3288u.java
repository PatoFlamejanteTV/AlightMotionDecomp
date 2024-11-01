package kotlin.jvm.internal;

import j6.InterfaceC3213b;
import j6.InterfaceC3216e;

/* renamed from: kotlin.jvm.internal.u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3288u extends AbstractC3279k implements InterfaceC3287t, InterfaceC3216e {
    private final int arity;
    private final int flags;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractC3288u(int r9, java.lang.Object r10, java.lang.Class r11, java.lang.String r12, java.lang.String r13, int r14) {
        /*
            r8 = this;
            r0 = r14 & 1
            r1 = 1
            if (r0 != r1) goto L7
            r7 = 1
            goto L9
        L7:
            r0 = 0
            r7 = 0
        L9:
            r2 = r8
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            r8.arity = r9
            int r9 = r14 >> 1
            r8.flags = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AbstractC3288u.<init>(int, java.lang.Object, java.lang.Class, java.lang.String, java.lang.String, int):void");
    }

    @Override // kotlin.jvm.internal.AbstractC3279k
    protected InterfaceC3213b computeReflected() {
        return U.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3288u) {
            AbstractC3288u abstractC3288u = (AbstractC3288u) obj;
            if (getName().equals(abstractC3288u.getName()) && getSignature().equals(abstractC3288u.getSignature()) && this.flags == abstractC3288u.flags && this.arity == abstractC3288u.arity && AbstractC3292y.d(getBoundReceiver(), abstractC3288u.getBoundReceiver()) && AbstractC3292y.d(getOwner(), abstractC3288u.getOwner())) {
                return true;
            }
            return false;
        }
        if (!(obj instanceof InterfaceC3216e)) {
            return false;
        }
        return obj.equals(compute());
    }

    @Override // kotlin.jvm.internal.InterfaceC3287t
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        int hashCode;
        if (getOwner() == null) {
            hashCode = 0;
        } else {
            hashCode = getOwner().hashCode() * 31;
        }
        return ((hashCode + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // j6.InterfaceC3216e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // j6.InterfaceC3216e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // j6.InterfaceC3216e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // j6.InterfaceC3216e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.AbstractC3279k, j6.InterfaceC3213b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        InterfaceC3213b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.AbstractC3279k
    public InterfaceC3216e getReflected() {
        return (InterfaceC3216e) super.getReflected();
    }
}
