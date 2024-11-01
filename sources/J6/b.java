package J6;

import com.inmobi.cmp.core.model.portalconfig.GBCConsentValue;
import kotlin.jvm.internal.AbstractC3292y;
import w5.AbstractC4157a;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f4481a;

    /* renamed from: b, reason: collision with root package name */
    public final GBCConsentValue f4482b;

    public b(int i8, GBCConsentValue defaultValue) {
        AbstractC3292y.i(defaultValue, "defaultValue");
        this.f4481a = i8;
        this.f4482b = defaultValue;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f4481a == bVar.f4481a && this.f4482b == bVar.f4482b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f4482b.hashCode() + (this.f4481a * 31);
    }

    public String toString() {
        StringBuilder a9 = AbstractC4157a.a("GBCApplicablePurpose(id=");
        a9.append(this.f4481a);
        a9.append(", defaultValue=");
        a9.append(this.f4482b);
        a9.append(')');
        return a9.toString();
    }
}
