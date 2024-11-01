package F5;

import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import w5.AbstractC4157a;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f2711a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f2712b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2713c;

    public f(Boolean bool, Integer num, List list) {
        this.f2711a = bool;
        this.f2712b = num;
        this.f2713c = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (AbstractC3292y.d(this.f2711a, fVar.f2711a) && AbstractC3292y.d(this.f2712b, fVar.f2712b) && AbstractC3292y.d(this.f2713c, fVar.f2713c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        Boolean bool = this.f2711a;
        int i8 = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i9 = hashCode * 31;
        Integer num = this.f2712b;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        List list = this.f2713c;
        if (list != null) {
            i8 = list.hashCode();
        }
        return i10 + i8;
    }

    public String toString() {
        StringBuilder a9 = AbstractC4157a.a("EncodingOptions(isForVendors=");
        a9.append(this.f2711a);
        a9.append(", version=");
        a9.append(this.f2712b);
        a9.append(", segments=");
        a9.append(this.f2713c);
        a9.append(')');
        return a9.toString();
    }
}
