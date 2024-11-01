package S7;

import kotlin.jvm.internal.AbstractC3292y;
import w5.AbstractC4157a;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public e f9953a;

    /* renamed from: b, reason: collision with root package name */
    public n f9954b;

    /* renamed from: c, reason: collision with root package name */
    public i f9955c;

    public r(e coreUiLabels, n premiumUiLabels, i mobileUiLabels) {
        AbstractC3292y.i(coreUiLabels, "coreUiLabels");
        AbstractC3292y.i(premiumUiLabels, "premiumUiLabels");
        AbstractC3292y.i(mobileUiLabels, "mobileUiLabels");
        this.f9953a = coreUiLabels;
        this.f9954b = premiumUiLabels;
        this.f9955c = mobileUiLabels;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (AbstractC3292y.d(this.f9953a, rVar.f9953a) && AbstractC3292y.d(this.f9954b, rVar.f9954b) && AbstractC3292y.d(this.f9955c, rVar.f9955c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f9955c.hashCode() + ((this.f9954b.hashCode() + (this.f9953a.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder a9 = AbstractC4157a.a("TranslationsText(coreUiLabels=");
        a9.append(this.f9953a);
        a9.append(", premiumUiLabels=");
        a9.append(this.f9954b);
        a9.append(", mobileUiLabels=");
        a9.append(this.f9955c);
        a9.append(')');
        return a9.toString();
    }

    public /* synthetic */ r(e eVar, n nVar, i iVar, int i8) {
        this((i8 & 1) != 0 ? new e(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 262143) : null, (i8 & 2) != 0 ? new n(null, null, null, null, null, null, null, null, null, null, 1023) : null, (i8 & 4) != 0 ? new i(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767) : null);
    }
}
