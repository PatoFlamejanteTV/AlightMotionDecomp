package com.stripe.android.model;

import R5.Q;
import com.stripe.android.model.o;
import com.stripe.android.model.p;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public interface d {

    /* loaded from: classes4.dex */
    public static final class a implements d {

        /* renamed from: a, reason: collision with root package name */
        private final String f25470a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25471b;

        /* renamed from: c, reason: collision with root package name */
        private final String f25472c;

        public a(String clientSecret, String str, String str2) {
            AbstractC3292y.i(clientSecret, "clientSecret");
            this.f25470a = clientSecret;
            this.f25471b = str;
            this.f25472c = str2;
        }

        @Override // com.stripe.android.model.d
        public Map a() {
            return B4.b.a(Q.k(Q5.x.a("client_secret", this.f25470a), Q5.x.a("hosted_surface", this.f25472c), Q5.x.a("product", "instant_debits"), Q5.x.a("attach_required", Boolean.TRUE), Q5.x.a("payment_method_data", new p(o.p.f25754h, null, null, null, null, null, null, null, null, null, null, null, null, null, new o.e(null, this.f25471b, null, null, 13, null), null, null, null, null, 507902, null).B())));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3292y.d(this.f25470a, aVar.f25470a) && AbstractC3292y.d(this.f25471b, aVar.f25471b) && AbstractC3292y.d(this.f25472c, aVar.f25472c);
        }

        public int hashCode() {
            int hashCode = this.f25470a.hashCode() * 31;
            String str = this.f25471b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f25472c;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "InstantDebits(clientSecret=" + this.f25470a + ", customerEmailAddress=" + this.f25471b + ", hostedSurface=" + this.f25472c + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements d {

        /* renamed from: a, reason: collision with root package name */
        private final String f25473a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25474b;

        /* renamed from: c, reason: collision with root package name */
        private final String f25475c;

        /* renamed from: d, reason: collision with root package name */
        private final String f25476d;

        public b(String clientSecret, String customerName, String str, String str2) {
            AbstractC3292y.i(clientSecret, "clientSecret");
            AbstractC3292y.i(customerName, "customerName");
            this.f25473a = clientSecret;
            this.f25474b = customerName;
            this.f25475c = str;
            this.f25476d = str2;
        }

        @Override // com.stripe.android.model.d
        public Map a() {
            return B4.b.a(Q.k(Q5.x.a("client_secret", this.f25473a), Q5.x.a("hosted_surface", this.f25476d), Q5.x.a("payment_method_data", p.e.n(p.f25804u, new o.e(null, this.f25475c, this.f25474b, null, 9, null), null, null, 6, null).B())));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3292y.d(this.f25473a, bVar.f25473a) && AbstractC3292y.d(this.f25474b, bVar.f25474b) && AbstractC3292y.d(this.f25475c, bVar.f25475c) && AbstractC3292y.d(this.f25476d, bVar.f25476d);
        }

        public int hashCode() {
            int hashCode = ((this.f25473a.hashCode() * 31) + this.f25474b.hashCode()) * 31;
            String str = this.f25475c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f25476d;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "USBankAccount(clientSecret=" + this.f25473a + ", customerName=" + this.f25474b + ", customerEmailAddress=" + this.f25475c + ", hostedSurface=" + this.f25476d + ")";
        }
    }

    Map a();
}
