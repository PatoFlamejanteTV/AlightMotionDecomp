package S7;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import w5.AbstractC4157a;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final List f9802a;

    public d(List disclosures) {
        AbstractC3292y.i(disclosures, "disclosures");
        this.f9802a = disclosures;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d) && AbstractC3292y.d(this.f9802a, ((d) obj).f9802a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f9802a.hashCode();
    }

    public String toString() {
        StringBuilder a9 = AbstractC4157a.a("CookieDisclosure(disclosures=");
        a9.append(this.f9802a);
        a9.append(')');
        return a9.toString();
    }

    public /* synthetic */ d(List list, int i8) {
        this((i8 & 1) != 0 ? new ArrayList() : null);
    }
}
