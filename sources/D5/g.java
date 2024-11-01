package D5;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;
import w5.AbstractC4157a;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public Long f1375a;

    /* renamed from: b, reason: collision with root package name */
    public Map f1376b;

    public g(Long l8, Map cmpInfoMap) {
        AbstractC3292y.i(cmpInfoMap, "cmpInfoMap");
        this.f1375a = l8;
        this.f1376b = cmpInfoMap;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (AbstractC3292y.d(this.f1375a, gVar.f1375a) && AbstractC3292y.d(this.f1376b, gVar.f1376b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        Long l8 = this.f1375a;
        if (l8 == null) {
            hashCode = 0;
        } else {
            hashCode = l8.hashCode();
        }
        return this.f1376b.hashCode() + (hashCode * 31);
    }

    public String toString() {
        StringBuilder a9 = AbstractC4157a.a("IabApprovedCmpList(lastUpdated=");
        a9.append(this.f1375a);
        a9.append(", cmpInfoMap=");
        a9.append(this.f1376b);
        a9.append(')');
        return a9.toString();
    }

    public /* synthetic */ g(Long l8, Map map, int i8) {
        this(null, (i8 & 2) != 0 ? new LinkedHashMap() : null);
    }
}
