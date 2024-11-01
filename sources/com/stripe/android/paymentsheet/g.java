package com.stripe.android.paymentsheet;

import com.stripe.android.model.b;
import com.stripe.android.paymentsheet.w;
import g3.InterfaceC2910i;
import kotlin.jvm.internal.AbstractC3292y;
import v3.EnumC4126f;
import v3.InterfaceC4121a;

/* loaded from: classes4.dex */
public interface g {

    /* renamed from: a, reason: collision with root package name */
    public static final a f27289a = a.f27290a;

    /* loaded from: classes4.dex */
    public interface b {

        /* loaded from: classes4.dex */
        public static final class a implements b {
        }

        /* renamed from: com.stripe.android.paymentsheet.g$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0609b implements b {

            /* renamed from: a, reason: collision with root package name */
            private final InterfaceC2910i f27291a;

            /* renamed from: b, reason: collision with root package name */
            private final boolean f27292b;

            public C0609b(InterfaceC2910i confirmParams, boolean z8) {
                AbstractC3292y.i(confirmParams, "confirmParams");
                this.f27291a = confirmParams;
                this.f27292b = z8;
            }

            @Override // com.stripe.android.paymentsheet.g.b
            public EnumC4126f a() {
                EnumC4126f enumC4126f = EnumC4126f.f40480b;
                if (!this.f27292b) {
                    return null;
                }
                return enumC4126f;
            }

            public final InterfaceC2910i b() {
                return this.f27291a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0609b)) {
                    return false;
                }
                C0609b c0609b = (C0609b) obj;
                return AbstractC3292y.d(this.f27291a, c0609b.f27291a) && this.f27292b == c0609b.f27292b;
            }

            public int hashCode() {
                return (this.f27291a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f27292b);
            }

            public String toString() {
                return "Confirm(confirmParams=" + this.f27291a + ", isDeferred=" + this.f27292b + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class c implements b {

            /* renamed from: a, reason: collision with root package name */
            private final Throwable f27293a;

            /* renamed from: b, reason: collision with root package name */
            private final C2.c f27294b;

            public c(Throwable cause, C2.c message) {
                AbstractC3292y.i(cause, "cause");
                AbstractC3292y.i(message, "message");
                this.f27293a = cause;
                this.f27294b = message;
            }

            @Override // com.stripe.android.paymentsheet.g.b
            public EnumC4126f a() {
                return null;
            }

            public final Throwable b() {
                return this.f27293a;
            }

            public final C2.c c() {
                return this.f27294b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return AbstractC3292y.d(this.f27293a, cVar.f27293a) && AbstractC3292y.d(this.f27294b, cVar.f27294b);
            }

            public int hashCode() {
                return (this.f27293a.hashCode() * 31) + this.f27294b.hashCode();
            }

            public String toString() {
                return "Fail(cause=" + this.f27293a + ", message=" + this.f27294b + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class d implements b {
            public abstract String b();
        }

        EnumC4126f a();
    }

    Object a(w.l lVar, com.stripe.android.model.p pVar, com.stripe.android.model.r rVar, b.d dVar, boolean z8, U5.d dVar2);

    Object b(w.l lVar, com.stripe.android.model.o oVar, com.stripe.android.model.r rVar, b.d dVar, U5.d dVar2);

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f27290a = new a();

        private a() {
        }

        public final InterfaceC4121a a() {
            return null;
        }

        public final void b(InterfaceC4121a interfaceC4121a) {
        }
    }
}
