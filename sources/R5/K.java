package R5;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    private final int f9301a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f9302b;

    public K(int i8, Object obj) {
        this.f9301a = i8;
        this.f9302b = obj;
    }

    public final int a() {
        return this.f9301a;
    }

    public final Object b() {
        return this.f9302b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k8 = (K) obj;
        if (this.f9301a == k8.f9301a && AbstractC3292y.d(this.f9302b, k8.f9302b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i8 = this.f9301a * 31;
        Object obj = this.f9302b;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return i8 + hashCode;
    }

    public String toString() {
        return "IndexedValue(index=" + this.f9301a + ", value=" + this.f9302b + ')';
    }
}
