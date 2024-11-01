package S7;

import kotlin.jvm.internal.AbstractC3292y;
import w5.AbstractC4157a;

/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f9942a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9943b;

    public o(String label, String link) {
        AbstractC3292y.i(label, "label");
        AbstractC3292y.i(link, "link");
        this.f9942a = label;
        this.f9943b = link;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (AbstractC3292y.d(this.f9942a, oVar.f9942a) && AbstractC3292y.d(this.f9943b, oVar.f9943b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f9943b.hashCode() + (this.f9942a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder a9 = AbstractC4157a.a("PublisherCustomLink(label=");
        a9.append(this.f9942a);
        a9.append(", link=");
        a9.append(this.f9943b);
        a9.append(')');
        return a9.toString();
    }
}
