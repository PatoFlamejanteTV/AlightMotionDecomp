package com.stripe.android.paymentsheet;

import com.stripe.android.model.StripeIntent;
import kotlin.jvm.internal.AbstractC3292y;
import v3.EnumC4126f;

/* loaded from: classes4.dex */
public interface p {

    /* loaded from: classes4.dex */
    public static final class a implements p {

        /* renamed from: a, reason: collision with root package name */
        private final v3.n f27394a;

        public a(v3.n action) {
            AbstractC3292y.i(action, "action");
            this.f27394a = action;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f27394a == ((a) obj).f27394a;
        }

        public int hashCode() {
            return this.f27394a.hashCode();
        }

        public String toString() {
            return "Canceled(action=" + this.f27394a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements p {

        /* renamed from: a, reason: collision with root package name */
        private final Throwable f27395a;

        /* renamed from: b, reason: collision with root package name */
        private final C2.c f27396b;

        /* renamed from: c, reason: collision with root package name */
        private final m f27397c;

        public b(Throwable cause, C2.c message, m type) {
            AbstractC3292y.i(cause, "cause");
            AbstractC3292y.i(message, "message");
            AbstractC3292y.i(type, "type");
            this.f27395a = cause;
            this.f27396b = message;
            this.f27397c = type;
        }

        public final Throwable a() {
            return this.f27395a;
        }

        public final C2.c b() {
            return this.f27396b;
        }

        public final m c() {
            return this.f27397c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3292y.d(this.f27395a, bVar.f27395a) && AbstractC3292y.d(this.f27396b, bVar.f27396b) && AbstractC3292y.d(this.f27397c, bVar.f27397c);
        }

        public int hashCode() {
            return (((this.f27395a.hashCode() * 31) + this.f27396b.hashCode()) * 31) + this.f27397c.hashCode();
        }

        public String toString() {
            return "Failed(cause=" + this.f27395a + ", message=" + this.f27396b + ", type=" + this.f27397c + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements p {

        /* renamed from: a, reason: collision with root package name */
        private final StripeIntent f27398a;

        /* renamed from: b, reason: collision with root package name */
        private final EnumC4126f f27399b;

        public c(StripeIntent intent, EnumC4126f enumC4126f) {
            AbstractC3292y.i(intent, "intent");
            this.f27398a = intent;
            this.f27399b = enumC4126f;
        }

        public final EnumC4126f a() {
            return this.f27399b;
        }

        public final StripeIntent b() {
            return this.f27398a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC3292y.d(this.f27398a, cVar.f27398a) && this.f27399b == cVar.f27399b;
        }

        public int hashCode() {
            int hashCode = this.f27398a.hashCode() * 31;
            EnumC4126f enumC4126f = this.f27399b;
            return hashCode + (enumC4126f == null ? 0 : enumC4126f.hashCode());
        }

        public String toString() {
            return "Succeeded(intent=" + this.f27398a + ", deferredIntentConfirmationType=" + this.f27399b + ")";
        }
    }
}
