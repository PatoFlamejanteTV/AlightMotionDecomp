package J6;

import H6.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import w5.AbstractC4157a;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final List f4502a;

    /* renamed from: b, reason: collision with root package name */
    public final List f4503b;

    /* renamed from: c, reason: collision with root package name */
    public final List f4504c;

    public g(List vendorBlacklist, List vendorWhitelist, List googleWhitelist) {
        AbstractC3292y.i(vendorBlacklist, "vendorBlacklist");
        AbstractC3292y.i(vendorWhitelist, "vendorWhitelist");
        AbstractC3292y.i(googleWhitelist, "googleWhitelist");
        this.f4502a = vendorBlacklist;
        this.f4503b = vendorWhitelist;
        this.f4504c = googleWhitelist;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (AbstractC3292y.d(this.f4502a, gVar.f4502a) && AbstractC3292y.d(this.f4503b, gVar.f4503b) && AbstractC3292y.d(this.f4504c, gVar.f4504c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f4504c.hashCode() + l.a(this.f4503b, this.f4502a.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder a9 = AbstractC4157a.a("PremiumProperties(vendorBlacklist=");
        a9.append(this.f4502a);
        a9.append(", vendorWhitelist=");
        a9.append(this.f4503b);
        a9.append(", googleWhitelist=");
        a9.append(this.f4504c);
        a9.append(')');
        return a9.toString();
    }

    public /* synthetic */ g(List list, List list2, List list3, int i8) {
        this((i8 & 1) != 0 ? new ArrayList() : null, (i8 & 2) != 0 ? new ArrayList() : null, (i8 & 4) != 0 ? new ArrayList() : null);
    }
}
