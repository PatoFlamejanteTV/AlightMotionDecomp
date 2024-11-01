package com.stripe.android.payments.bankaccount.ui;

import com.stripe.android.payments.bankaccount.navigation.d;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: com.stripe.android.payments.bankaccount.ui.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0544a extends a {

        /* renamed from: a, reason: collision with root package name */
        private final d f26353a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0544a(d result) {
            super(null);
            AbstractC3292y.i(result, "result");
            this.f26353a = result;
        }

        public final d a() {
            return this.f26353a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0544a) && AbstractC3292y.d(this.f26353a, ((C0544a) obj).f26353a);
        }

        public int hashCode() {
            return this.f26353a.hashCode();
        }

        public String toString() {
            return "FinishWithResult(result=" + this.f26353a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        private final String f26354a;

        /* renamed from: b, reason: collision with root package name */
        private final String f26355b;

        /* renamed from: c, reason: collision with root package name */
        private final String f26356c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String publishableKey, String financialConnectionsSessionSecret, String str) {
            super(null);
            AbstractC3292y.i(publishableKey, "publishableKey");
            AbstractC3292y.i(financialConnectionsSessionSecret, "financialConnectionsSessionSecret");
            this.f26354a = publishableKey;
            this.f26355b = financialConnectionsSessionSecret;
            this.f26356c = str;
        }

        public final String a() {
            return this.f26355b;
        }

        public final String b() {
            return this.f26354a;
        }

        public final String c() {
            return this.f26356c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3292y.d(this.f26354a, bVar.f26354a) && AbstractC3292y.d(this.f26355b, bVar.f26355b) && AbstractC3292y.d(this.f26356c, bVar.f26356c);
        }

        public int hashCode() {
            int hashCode = ((this.f26354a.hashCode() * 31) + this.f26355b.hashCode()) * 31;
            String str = this.f26356c;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "OpenConnectionsFlow(publishableKey=" + this.f26354a + ", financialConnectionsSessionSecret=" + this.f26355b + ", stripeAccountId=" + this.f26356c + ")";
        }
    }

    private a() {
    }

    public /* synthetic */ a(AbstractC3284p abstractC3284p) {
        this();
    }
}
