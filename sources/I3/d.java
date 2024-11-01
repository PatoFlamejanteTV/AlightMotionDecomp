package I3;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final String f3401a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3402b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3403c;

    /* renamed from: d, reason: collision with root package name */
    private final String f3404d;

    /* renamed from: e, reason: collision with root package name */
    private final C2.c f3405e;

    /* renamed from: f, reason: collision with root package name */
    private final C2.c f3406f;

    /* renamed from: g, reason: collision with root package name */
    private final C2.c f3407g;

    public d(String email, String nameOnAccount, String sortCode, String accountNumber, C2.c payer, C2.c supportAddressAsHtml, C2.c debitGuaranteeAsHtml) {
        AbstractC3292y.i(email, "email");
        AbstractC3292y.i(nameOnAccount, "nameOnAccount");
        AbstractC3292y.i(sortCode, "sortCode");
        AbstractC3292y.i(accountNumber, "accountNumber");
        AbstractC3292y.i(payer, "payer");
        AbstractC3292y.i(supportAddressAsHtml, "supportAddressAsHtml");
        AbstractC3292y.i(debitGuaranteeAsHtml, "debitGuaranteeAsHtml");
        this.f3401a = email;
        this.f3402b = nameOnAccount;
        this.f3403c = sortCode;
        this.f3404d = accountNumber;
        this.f3405e = payer;
        this.f3406f = supportAddressAsHtml;
        this.f3407g = debitGuaranteeAsHtml;
    }

    public final String a() {
        return this.f3404d;
    }

    public final C2.c b() {
        return this.f3407g;
    }

    public final String c() {
        return this.f3401a;
    }

    public final String d() {
        return this.f3402b;
    }

    public final C2.c e() {
        return this.f3405e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (AbstractC3292y.d(this.f3401a, dVar.f3401a) && AbstractC3292y.d(this.f3402b, dVar.f3402b) && AbstractC3292y.d(this.f3403c, dVar.f3403c) && AbstractC3292y.d(this.f3404d, dVar.f3404d) && AbstractC3292y.d(this.f3405e, dVar.f3405e) && AbstractC3292y.d(this.f3406f, dVar.f3406f) && AbstractC3292y.d(this.f3407g, dVar.f3407g)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f3403c;
    }

    public final C2.c g() {
        return this.f3406f;
    }

    public int hashCode() {
        return (((((((((((this.f3401a.hashCode() * 31) + this.f3402b.hashCode()) * 31) + this.f3403c.hashCode()) * 31) + this.f3404d.hashCode()) * 31) + this.f3405e.hashCode()) * 31) + this.f3406f.hashCode()) * 31) + this.f3407g.hashCode();
    }

    public String toString() {
        return "BacsMandateConfirmationViewState(email=" + this.f3401a + ", nameOnAccount=" + this.f3402b + ", sortCode=" + this.f3403c + ", accountNumber=" + this.f3404d + ", payer=" + this.f3405e + ", supportAddressAsHtml=" + this.f3406f + ", debitGuaranteeAsHtml=" + this.f3407g + ")";
    }
}
