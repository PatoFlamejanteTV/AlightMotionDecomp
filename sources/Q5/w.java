package Q5;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class w implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final Object f8821a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f8822b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f8823c;

    public w(Object obj, Object obj2, Object obj3) {
        this.f8821a = obj;
        this.f8822b = obj2;
        this.f8823c = obj3;
    }

    public final Object a() {
        return this.f8821a;
    }

    public final Object b() {
        return this.f8822b;
    }

    public final Object c() {
        return this.f8823c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (AbstractC3292y.d(this.f8821a, wVar.f8821a) && AbstractC3292y.d(this.f8822b, wVar.f8822b) && AbstractC3292y.d(this.f8823c, wVar.f8823c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        Object obj = this.f8821a;
        int i8 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i9 = hashCode * 31;
        Object obj2 = this.f8822b;
        if (obj2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = obj2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        Object obj3 = this.f8823c;
        if (obj3 != null) {
            i8 = obj3.hashCode();
        }
        return i10 + i8;
    }

    public String toString() {
        return '(' + this.f8821a + ", " + this.f8822b + ", " + this.f8823c + ')';
    }
}
