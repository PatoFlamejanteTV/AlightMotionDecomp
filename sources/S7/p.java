package S7;

import D5.t;
import kotlin.jvm.internal.AbstractC3292y;
import w5.AbstractC4157a;

/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f9944a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9945b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9946c;

    public p(int i8, String label, String state) {
        AbstractC3292y.i(label, "label");
        AbstractC3292y.i(state, "state");
        this.f9944a = i8;
        this.f9945b = label;
        this.f9946c = state;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f9944a == pVar.f9944a && AbstractC3292y.d(this.f9945b, pVar.f9945b) && AbstractC3292y.d(this.f9946c, pVar.f9946c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f9946c.hashCode() + t.a(this.f9945b, this.f9944a * 31, 31);
    }

    public String toString() {
        StringBuilder a9 = AbstractC4157a.a("StackInfo(id=");
        a9.append(this.f9944a);
        a9.append(", label=");
        a9.append(this.f9945b);
        a9.append(", state=");
        a9.append(this.f9946c);
        a9.append(')');
        return a9.toString();
    }
}
