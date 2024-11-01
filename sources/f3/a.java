package F3;

import com.stripe.android.paymentsheet.w;
import g4.C2918b;
import h4.InterfaceC2949a;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import w3.C4154a;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f2220a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2949a f2221b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2222c;

    /* renamed from: d, reason: collision with root package name */
    private final C2918b f2223d;

    /* renamed from: e, reason: collision with root package name */
    private final w.c f2224e;

    /* renamed from: f, reason: collision with root package name */
    private final C4154a f2225f;

    /* renamed from: g, reason: collision with root package name */
    private final w.d f2226g;

    public a(String paymentMethodCode, InterfaceC2949a cbcEligibility, String merchantName, C2918b c2918b, w.c cVar, C4154a c4154a, w.d billingDetailsCollectionConfiguration) {
        AbstractC3292y.i(paymentMethodCode, "paymentMethodCode");
        AbstractC3292y.i(cbcEligibility, "cbcEligibility");
        AbstractC3292y.i(merchantName, "merchantName");
        AbstractC3292y.i(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
        this.f2220a = paymentMethodCode;
        this.f2221b = cbcEligibility;
        this.f2222c = merchantName;
        this.f2223d = c2918b;
        this.f2224e = cVar;
        this.f2225f = c4154a;
        this.f2226g = billingDetailsCollectionConfiguration;
    }

    public final C2918b a() {
        return this.f2223d;
    }

    public final w.c b() {
        return this.f2224e;
    }

    public final w.d c() {
        return this.f2226g;
    }

    public final String d() {
        return this.f2222c;
    }

    public final String e() {
        return this.f2220a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (AbstractC3292y.d(this.f2220a, aVar.f2220a) && AbstractC3292y.d(this.f2221b, aVar.f2221b) && AbstractC3292y.d(this.f2222c, aVar.f2222c) && AbstractC3292y.d(this.f2223d, aVar.f2223d) && AbstractC3292y.d(this.f2224e, aVar.f2224e) && AbstractC3292y.d(this.f2225f, aVar.f2225f) && AbstractC3292y.d(this.f2226g, aVar.f2226g)) {
            return true;
        }
        return false;
    }

    public final C4154a f() {
        return this.f2225f;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((((this.f2220a.hashCode() * 31) + this.f2221b.hashCode()) * 31) + this.f2222c.hashCode()) * 31;
        C2918b c2918b = this.f2223d;
        int i8 = 0;
        if (c2918b == null) {
            hashCode = 0;
        } else {
            hashCode = c2918b.hashCode();
        }
        int i9 = (hashCode3 + hashCode) * 31;
        w.c cVar = this.f2224e;
        if (cVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = cVar.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        C4154a c4154a = this.f2225f;
        if (c4154a != null) {
            i8 = c4154a.hashCode();
        }
        return ((i10 + i8) * 31) + this.f2226g.hashCode();
    }

    public String toString() {
        return "FormArguments(paymentMethodCode=" + this.f2220a + ", cbcEligibility=" + this.f2221b + ", merchantName=" + this.f2222c + ", amount=" + this.f2223d + ", billingDetails=" + this.f2224e + ", shippingDetails=" + this.f2225f + ", billingDetailsCollectionConfiguration=" + this.f2226g + ")";
    }

    public /* synthetic */ a(String str, InterfaceC2949a interfaceC2949a, String str2, C2918b c2918b, w.c cVar, C4154a c4154a, w.d dVar, int i8, AbstractC3284p abstractC3284p) {
        this(str, interfaceC2949a, str2, (i8 & 8) != 0 ? null : c2918b, (i8 & 16) != 0 ? null : cVar, (i8 & 32) != 0 ? null : c4154a, (i8 & 64) != 0 ? new w.d(null, null, null, null, false, 31, null) : dVar);
    }
}
