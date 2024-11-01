package v3;

import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final List f40531a;

    /* renamed from: b, reason: collision with root package name */
    private final com.stripe.android.paymentsheet.r f40532b;

    public o(List items, com.stripe.android.paymentsheet.r rVar) {
        AbstractC3292y.i(items, "items");
        this.f40531a = items;
        this.f40532b = rVar;
    }

    public final List a() {
        return this.f40531a;
    }

    public final com.stripe.android.paymentsheet.r b() {
        return this.f40532b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (AbstractC3292y.d(this.f40531a, oVar.f40531a) && AbstractC3292y.d(this.f40532b, oVar.f40532b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f40531a.hashCode() * 31;
        com.stripe.android.paymentsheet.r rVar = this.f40532b;
        if (rVar == null) {
            hashCode = 0;
        } else {
            hashCode = rVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "PaymentOptionsState(items=" + this.f40531a + ", selectedItem=" + this.f40532b + ")";
    }
}
