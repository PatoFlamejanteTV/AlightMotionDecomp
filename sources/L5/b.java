package L5;

import kotlin.jvm.internal.AbstractC3292y;
import w5.AbstractC4157a;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f5403a;

    /* renamed from: b, reason: collision with root package name */
    public final a f5404b;

    public b(Integer num, a aVar) {
        this.f5403a = num;
        this.f5404b = aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (AbstractC3292y.d(this.f5403a, bVar.f5403a) && AbstractC3292y.d(this.f5404b, bVar.f5404b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        Integer num = this.f5403a;
        int i8 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i9 = hashCode * 31;
        a aVar = this.f5404b;
        if (aVar != null) {
            i8 = aVar.hashCode();
        }
        return i9 + i8;
    }

    public String toString() {
        StringBuilder a9 = AbstractC4157a.a("GBCPurpose(id=");
        a9.append(this.f5403a);
        a9.append(", banner=");
        a9.append(this.f5404b);
        a9.append(')');
        return a9.toString();
    }
}
