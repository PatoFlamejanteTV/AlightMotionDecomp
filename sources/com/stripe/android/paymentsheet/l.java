package com.stripe.android.paymentsheet;

import com.stripe.android.model.StripeIntent;
import kotlin.jvm.internal.AbstractC3292y;
import v3.EnumC4126f;

/* loaded from: classes4.dex */
public interface l {

    /* loaded from: classes4.dex */
    public static final class a implements l {

        /* renamed from: a, reason: collision with root package name */
        private final StripeIntent f27350a;

        /* renamed from: b, reason: collision with root package name */
        private final n f27351b;

        /* renamed from: c, reason: collision with root package name */
        private final EnumC4126f f27352c;

        public a(StripeIntent intent, n confirmationOption, EnumC4126f enumC4126f) {
            AbstractC3292y.i(intent, "intent");
            AbstractC3292y.i(confirmationOption, "confirmationOption");
            this.f27350a = intent;
            this.f27351b = confirmationOption;
            this.f27352c = enumC4126f;
        }

        public final EnumC4126f a() {
            return this.f27352c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3292y.d(this.f27350a, aVar.f27350a) && AbstractC3292y.d(this.f27351b, aVar.f27351b) && this.f27352c == aVar.f27352c;
        }

        public int hashCode() {
            int hashCode = ((this.f27350a.hashCode() * 31) + this.f27351b.hashCode()) * 31;
            EnumC4126f enumC4126f = this.f27352c;
            return hashCode + (enumC4126f == null ? 0 : enumC4126f.hashCode());
        }

        public String toString() {
            return "Complete(intent=" + this.f27350a + ", confirmationOption=" + this.f27351b + ", deferredIntentConfirmationType=" + this.f27352c + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements l {

        /* renamed from: a, reason: collision with root package name */
        private final Throwable f27353a;

        /* renamed from: b, reason: collision with root package name */
        private final C2.c f27354b;

        /* renamed from: c, reason: collision with root package name */
        private final m f27355c;

        public b(Throwable cause, C2.c message, m errorType) {
            AbstractC3292y.i(cause, "cause");
            AbstractC3292y.i(message, "message");
            AbstractC3292y.i(errorType, "errorType");
            this.f27353a = cause;
            this.f27354b = message;
            this.f27355c = errorType;
        }

        public final Throwable a() {
            return this.f27353a;
        }

        public final C2.c b() {
            return this.f27354b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3292y.d(this.f27353a, bVar.f27353a) && AbstractC3292y.d(this.f27354b, bVar.f27354b) && AbstractC3292y.d(this.f27355c, bVar.f27355c);
        }

        public int hashCode() {
            return (((this.f27353a.hashCode() * 31) + this.f27354b.hashCode()) * 31) + this.f27355c.hashCode();
        }

        public String toString() {
            return "Fail(cause=" + this.f27353a + ", message=" + this.f27354b + ", errorType=" + this.f27355c + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements l {

        /* renamed from: a, reason: collision with root package name */
        private final Object f27356a;

        /* renamed from: b, reason: collision with root package name */
        private final EnumC4126f f27357b;

        public c(Object obj, EnumC4126f enumC4126f) {
            this.f27356a = obj;
            this.f27357b = enumC4126f;
        }

        public final EnumC4126f a() {
            return this.f27357b;
        }

        public final Object b() {
            return this.f27356a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC3292y.d(this.f27356a, cVar.f27356a) && this.f27357b == cVar.f27357b;
        }

        public int hashCode() {
            Object obj = this.f27356a;
            int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
            EnumC4126f enumC4126f = this.f27357b;
            return hashCode + (enumC4126f != null ? enumC4126f.hashCode() : 0);
        }

        public String toString() {
            return "Launch(launcherArguments=" + this.f27356a + ", deferredIntentConfirmationType=" + this.f27357b + ")";
        }
    }
}
