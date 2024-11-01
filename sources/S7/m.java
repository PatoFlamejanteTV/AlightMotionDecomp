package S7;

import kotlin.jvm.internal.AbstractC3292y;
import w5.AbstractC4157a;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f9930a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9931b;

    public m(String disclosureLabel, String backLabel) {
        AbstractC3292y.i(disclosureLabel, "disclosureLabel");
        AbstractC3292y.i(backLabel, "backLabel");
        this.f9930a = disclosureLabel;
        this.f9931b = backLabel;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (AbstractC3292y.d(this.f9930a, mVar.f9930a) && AbstractC3292y.d(this.f9931b, mVar.f9931b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f9931b.hashCode() + (this.f9930a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder a9 = AbstractC4157a.a("PartnersDisclosureLabels(disclosureLabel=");
        a9.append(this.f9930a);
        a9.append(", backLabel=");
        a9.append(this.f9931b);
        a9.append(')');
        return a9.toString();
    }
}
