package Q5;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class r implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final Object f8808a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f8809b;

    public r(Object obj, Object obj2) {
        this.f8808a = obj;
        this.f8809b = obj2;
    }

    public final Object a() {
        return this.f8808a;
    }

    public final Object b() {
        return this.f8809b;
    }

    public final Object c() {
        return this.f8808a;
    }

    public final Object d() {
        return this.f8809b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (AbstractC3292y.d(this.f8808a, rVar.f8808a) && AbstractC3292y.d(this.f8809b, rVar.f8809b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        Object obj = this.f8808a;
        int i8 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i9 = hashCode * 31;
        Object obj2 = this.f8809b;
        if (obj2 != null) {
            i8 = obj2.hashCode();
        }
        return i9 + i8;
    }

    public String toString() {
        return '(' + this.f8808a + ", " + this.f8809b + ')';
    }
}
