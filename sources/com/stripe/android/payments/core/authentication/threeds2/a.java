package com.stripe.android.payments.core.authentication.threeds2;

import c4.m;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import k3.C3237c;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: com.stripe.android.payments.core.authentication.threeds2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0547a extends a {

        /* renamed from: a, reason: collision with root package name */
        private final C3237c f26424a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0547a(C3237c result) {
            super(null);
            AbstractC3292y.i(result, "result");
            this.f26424a = result;
        }

        public final C3237c a() {
            return this.f26424a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0547a) && AbstractC3292y.d(this.f26424a, ((C0547a) obj).f26424a);
        }

        public int hashCode() {
            return this.f26424a.hashCode();
        }

        public String toString() {
            return "Complete(result=" + this.f26424a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        private final m f26425a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(m args) {
            super(null);
            AbstractC3292y.i(args, "args");
            this.f26425a = args;
        }

        public final m a() {
            return this.f26425a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC3292y.d(this.f26425a, ((b) obj).f26425a);
        }

        public int hashCode() {
            return this.f26425a.hashCode();
        }

        public String toString() {
            return "StartChallenge(args=" + this.f26425a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        private final PaymentBrowserAuthContract.a f26426a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(PaymentBrowserAuthContract.a args) {
            super(null);
            AbstractC3292y.i(args, "args");
            this.f26426a = args;
        }

        public final PaymentBrowserAuthContract.a a() {
            return this.f26426a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC3292y.d(this.f26426a, ((c) obj).f26426a);
        }

        public int hashCode() {
            return this.f26426a.hashCode();
        }

        public String toString() {
            return "StartFallback(args=" + this.f26426a + ")";
        }
    }

    private a() {
    }

    public /* synthetic */ a(AbstractC3284p abstractC3284p) {
        this();
    }
}
