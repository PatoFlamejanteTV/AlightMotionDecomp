package I3;

import com.stripe.android.model.p;
import com.stripe.android.paymentsheet.n;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final a f3408e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f3409a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3410b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3411c;

    /* renamed from: d, reason: collision with root package name */
    private final String f3412d;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final e a(n.a confirmationOption) {
            AbstractC3292y.i(confirmationOption, "confirmationOption");
            p b9 = confirmationOption.b();
            p.e eVar = p.f25804u;
            p.b i8 = eVar.i(b9);
            String r8 = eVar.r(b9);
            String q8 = eVar.q(b9);
            if (i8 != null && r8 != null && q8 != null) {
                return new e(r8, q8, i8.a(), i8.b());
            }
            return null;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public e(String name, String email, String accountNumber, String sortCode) {
        AbstractC3292y.i(name, "name");
        AbstractC3292y.i(email, "email");
        AbstractC3292y.i(accountNumber, "accountNumber");
        AbstractC3292y.i(sortCode, "sortCode");
        this.f3409a = name;
        this.f3410b = email;
        this.f3411c = accountNumber;
        this.f3412d = sortCode;
    }

    public final String a() {
        return this.f3411c;
    }

    public final String b() {
        return this.f3410b;
    }

    public final String c() {
        return this.f3409a;
    }

    public final String d() {
        return this.f3412d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (AbstractC3292y.d(this.f3409a, eVar.f3409a) && AbstractC3292y.d(this.f3410b, eVar.f3410b) && AbstractC3292y.d(this.f3411c, eVar.f3411c) && AbstractC3292y.d(this.f3412d, eVar.f3412d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f3409a.hashCode() * 31) + this.f3410b.hashCode()) * 31) + this.f3411c.hashCode()) * 31) + this.f3412d.hashCode();
    }

    public String toString() {
        return "BacsMandateData(name=" + this.f3409a + ", email=" + this.f3410b + ", accountNumber=" + this.f3411c + ", sortCode=" + this.f3412d + ")";
    }
}
