package J6;

import H6.l;
import R5.AbstractC1435t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import w5.AbstractC4157a;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4483a;

    /* renamed from: b, reason: collision with root package name */
    public final List f4484b;

    /* renamed from: c, reason: collision with root package name */
    public final List f4485c;

    public c(boolean z8, List locations, List applicablePurposes) {
        AbstractC3292y.i(locations, "locations");
        AbstractC3292y.i(applicablePurposes, "applicablePurposes");
        this.f4483a = z8;
        this.f4484b = locations;
        this.f4485c = applicablePurposes;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f4483a == cVar.f4483a && AbstractC3292y.d(this.f4484b, cVar.f4484b) && AbstractC3292y.d(this.f4485c, cVar.f4485c)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z8 = this.f4483a;
        ?? r02 = z8;
        if (z8) {
            r02 = 1;
        }
        return this.f4485c.hashCode() + l.a(this.f4484b, r02 * 31, 31);
    }

    public String toString() {
        StringBuilder a9 = AbstractC4157a.a("GBCConfig(enabled=");
        a9.append(this.f4483a);
        a9.append(", locations=");
        a9.append(this.f4484b);
        a9.append(", applicablePurposes=");
        a9.append(this.f4485c);
        a9.append(')');
        return a9.toString();
    }

    public /* synthetic */ c(boolean z8, List list, List list2, int i8) {
        this((i8 & 1) != 0 ? false : z8, (i8 & 2) != 0 ? AbstractC1435t.m() : null, (i8 & 4) != 0 ? AbstractC1435t.m() : null);
    }
}
