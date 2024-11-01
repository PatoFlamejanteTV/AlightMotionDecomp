package kotlin.jvm.internal;

import j6.InterfaceC3213b;

/* loaded from: classes5.dex */
public abstract class N extends AbstractC3279k implements j6.i {
    private final boolean syntheticJavaProperty;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public N(java.lang.Object r10, java.lang.Class r11, java.lang.String r12, java.lang.String r13, int r14) {
        /*
            r9 = this;
            r0 = r14 & 1
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L8
            r8 = 1
            goto L9
        L8:
            r8 = 0
        L9:
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            r10 = 2
            r11 = r14 & 2
            if (r11 != r10) goto L17
            r1 = 1
        L17:
            r9.syntheticJavaProperty = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.N.<init>(java.lang.Object, java.lang.Class, java.lang.String, java.lang.String, int):void");
    }

    @Override // kotlin.jvm.internal.AbstractC3279k
    public InterfaceC3213b compute() {
        if (this.syntheticJavaProperty) {
            return this;
        }
        return super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof N) {
            N n8 = (N) obj;
            if (getOwner().equals(n8.getOwner()) && getName().equals(n8.getName()) && getSignature().equals(n8.getSignature()) && AbstractC3292y.d(getBoundReceiver(), n8.getBoundReceiver())) {
                return true;
            }
            return false;
        }
        if (!(obj instanceof j6.i)) {
            return false;
        }
        return obj.equals(compute());
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // j6.i
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // j6.i
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        InterfaceC3213b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.AbstractC3279k
    public j6.i getReflected() {
        if (!this.syntheticJavaProperty) {
            return (j6.i) super.getReflected();
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
    }
}
