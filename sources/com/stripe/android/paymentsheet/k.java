package com.stripe.android.paymentsheet;

import D3.f;
import com.stripe.android.model.o;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public interface k {

    /* loaded from: classes4.dex */
    public static final class a implements k {

        /* renamed from: a, reason: collision with root package name */
        private final f.b f27348a;

        public a(f.b paymentSelection) {
            AbstractC3292y.i(paymentSelection, "paymentSelection");
            this.f27348a = paymentSelection;
        }

        @Override // com.stripe.android.paymentsheet.k
        public com.stripe.android.model.q a() {
            return null;
        }

        @Override // com.stripe.android.paymentsheet.k
        public String b() {
            return d().getType();
        }

        @Override // com.stripe.android.paymentsheet.k
        public com.stripe.android.model.p c() {
            return null;
        }

        @Override // com.stripe.android.paymentsheet.k
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public f.b d() {
            return this.f27348a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC3292y.d(this.f27348a, ((a) obj).f27348a);
        }

        @Override // com.stripe.android.paymentsheet.k
        public String getType() {
            return d().getType();
        }

        public int hashCode() {
            return this.f27348a.hashCode();
        }

        public String toString() {
            return "External(paymentSelection=" + this.f27348a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements k {

        /* renamed from: a, reason: collision with root package name */
        private final f.e f27349a;

        public b(f.e paymentSelection) {
            AbstractC3292y.i(paymentSelection, "paymentSelection");
            this.f27349a = paymentSelection;
        }

        @Override // com.stripe.android.paymentsheet.k
        public com.stripe.android.model.q a() {
            return d().i();
        }

        @Override // com.stripe.android.paymentsheet.k
        public String b() {
            boolean z8;
            f.e d8 = d();
            if (d8 instanceof f.e.c) {
                return o.p.f25755i.f25773a;
            }
            boolean z9 = true;
            if (d8 instanceof f.e.a) {
                z8 = true;
            } else {
                z8 = d8 instanceof f.e.d;
            }
            if (!z8) {
                z9 = d8 instanceof f.e.b;
            }
            if (z9) {
                return d().h().u();
            }
            throw new Q5.p();
        }

        @Override // com.stripe.android.paymentsheet.k
        public com.stripe.android.model.p c() {
            return d().h();
        }

        @Override // com.stripe.android.paymentsheet.k
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public f.e d() {
            return this.f27349a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC3292y.d(this.f27349a, ((b) obj).f27349a);
        }

        @Override // com.stripe.android.paymentsheet.k
        public String getType() {
            return d().h().u();
        }

        public int hashCode() {
            return this.f27349a.hashCode();
        }

        public String toString() {
            return "New(paymentSelection=" + this.f27349a + ")";
        }
    }

    com.stripe.android.model.q a();

    String b();

    com.stripe.android.model.p c();

    D3.f d();

    String getType();
}
