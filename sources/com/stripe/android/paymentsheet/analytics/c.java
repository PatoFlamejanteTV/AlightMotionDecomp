package com.stripe.android.paymentsheet.analytics;

import B2.InterfaceC0949a;
import D3.f;
import R5.AbstractC1435t;
import R5.Q;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.os.EnvironmentCompat;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.w;
import g3.EnumC2906e;
import g3.z;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import m6.C3374a;
import q2.AbstractC3631a;
import v3.EnumC4126f;
import y3.AbstractC4244b;
import y3.AbstractC4245c;

/* loaded from: classes4.dex */
public abstract class c implements InterfaceC0949a {

    /* renamed from: a, reason: collision with root package name */
    public static final d f27059a = new d(null);

    /* loaded from: classes4.dex */
    public static final class a extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f27060b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f27061c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f27062d;

        /* renamed from: e, reason: collision with root package name */
        private final String f27063e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f27064f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String type, boolean z8, boolean z9, boolean z10) {
            super(null);
            AbstractC3292y.i(type, "type");
            this.f27060b = z8;
            this.f27061c = z9;
            this.f27062d = z10;
            this.f27063e = "autofill_" + h(type);
            this.f27064f = Q.h();
        }

        private final String h(String str) {
            String lowerCase = new l6.j("(?<=.)(?=\\p{Upper})").f(str, "_").toLowerCase(Locale.ROOT);
            AbstractC3292y.h(lowerCase, "toLowerCase(...)");
            return lowerCase;
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            return this.f27063e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f27064f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f27062d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f27061c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f27060b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f27065b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f27066c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f27067d;

        /* renamed from: e, reason: collision with root package name */
        private final String f27068e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f27069f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EventReporter.Mode mode) {
            super(null);
            AbstractC3292y.i(mode, "mode");
            this.f27068e = c.f27059a.d(mode, "cannot_return_from_link_and_lpms");
            this.f27069f = Q.h();
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            return this.f27068e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f27069f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f27067d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f27065b;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f27066c;
        }
    }

    /* renamed from: com.stripe.android.paymentsheet.analytics.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0601c extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f27070b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f27071c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f27072d;

        /* renamed from: e, reason: collision with root package name */
        private final String f27073e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f27074f;

        public C0601c(boolean z8, boolean z9, boolean z10) {
            super(null);
            this.f27070b = z8;
            this.f27071c = z9;
            this.f27072d = z10;
            this.f27073e = "mc_card_number_completed";
            this.f27074f = Q.h();
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            return this.f27073e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f27074f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f27072d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f27071c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f27070b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class d {
        private d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String c(D3.f fVar) {
            boolean z8;
            if (AbstractC3292y.d(fVar, f.c.f1258a)) {
                return "googlepay";
            }
            if (fVar instanceof f.C0023f) {
                return "savedpm";
            }
            if (AbstractC3292y.d(fVar, f.d.f1259a)) {
                z8 = true;
            } else {
                z8 = fVar instanceof f.e.c;
            }
            if (z8) {
                return "link";
            }
            if (fVar instanceof f.e) {
                return "newpm";
            }
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String d(EventReporter.Mode mode, String str) {
            return "mc_" + mode + "_" + str;
        }

        public /* synthetic */ d(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f27075b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f27076c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f27077d;

        /* renamed from: e, reason: collision with root package name */
        private final String f27078e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f27079f;

        public e(boolean z8, boolean z9, boolean z10) {
            super(null);
            this.f27075b = z8;
            this.f27076c = z9;
            this.f27077d = z10;
            this.f27078e = "mc_dismiss";
            this.f27079f = Q.h();
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            return this.f27078e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f27079f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f27077d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f27076c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f27075b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f27080b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f27081c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f27082d;

        /* renamed from: e, reason: collision with root package name */
        private final String f27083e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f27084f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Throwable error, boolean z8, boolean z9, boolean z10) {
            super(null);
            AbstractC3292y.i(error, "error");
            this.f27080b = z8;
            this.f27081c = z9;
            this.f27082d = z10;
            this.f27083e = "mc_elements_session_load_failed";
            this.f27084f = Q.q(Q.e(Q5.x.a("error_message", N3.k.a(error).a())), p3.i.f36196a.c(error));
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            return this.f27083e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f27084f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f27082d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f27081c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f27080b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f27085b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f27086c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f27087d;

        /* renamed from: e, reason: collision with root package name */
        private final String f27088e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f27089f;

        public g(boolean z8, boolean z9, boolean z10) {
            super(null);
            this.f27085b = z8;
            this.f27086c = z9;
            this.f27087d = z10;
            this.f27088e = "mc_cancel_edit_screen";
            this.f27089f = Q.h();
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            return this.f27088e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f27089f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f27087d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f27086c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f27085b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f27090b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f27091c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f27092d;

        /* renamed from: e, reason: collision with root package name */
        private final String f27093e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f27094f;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class a {

            /* renamed from: b, reason: collision with root package name */
            public static final a f27095b = new a("Edit", 0, "edit");

            /* renamed from: c, reason: collision with root package name */
            public static final a f27096c = new a("Add", 1, "add");

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ a[] f27097d;

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ W5.a f27098e;

            /* renamed from: a, reason: collision with root package name */
            private final String f27099a;

            static {
                a[] a9 = a();
                f27097d = a9;
                f27098e = W5.b.a(a9);
            }

            private a(String str, int i8, String str2) {
                this.f27099a = str2;
            }

            private static final /* synthetic */ a[] a() {
                return new a[]{f27095b, f27096c};
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) f27097d.clone();
            }

            public final String b() {
                return this.f27099a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(a source, EnumC2906e enumC2906e, boolean z8, boolean z9, boolean z10) {
            super(0 == true ? 1 : 0);
            AbstractC3292y.i(source, "source");
            this.f27090b = z8;
            this.f27091c = z9;
            this.f27092d = z10;
            this.f27093e = "mc_close_cbc_dropdown";
            this.f27094f = Q.k(Q5.x.a("cbc_event_source", source.b()), Q5.x.a("selected_card_brand", enumC2906e != null ? enumC2906e.f() : null));
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            return this.f27093e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f27094f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f27092d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f27091c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f27090b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends c {

        /* renamed from: b, reason: collision with root package name */
        private final EventReporter.Mode f27100b;

        /* renamed from: c, reason: collision with root package name */
        private final w.g f27101c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f27102d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f27103e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f27104f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(EventReporter.Mode mode, w.g configuration, boolean z8, boolean z9, boolean z10) {
            super(null);
            AbstractC3292y.i(mode, "mode");
            AbstractC3292y.i(configuration, "configuration");
            this.f27100b = mode;
            this.f27101c = configuration;
            this.f27102d = z8;
            this.f27103e = z9;
            this.f27104f = z10;
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            String str;
            String str2;
            String str3;
            List list = null;
            if (this.f27101c.l() != null) {
                str = "customer";
            } else {
                str = null;
            }
            if (this.f27101c.u() != null) {
                str2 = "googlepay";
            } else {
                str2 = null;
            }
            List r8 = AbstractC1435t.r(str, str2);
            if (!r8.isEmpty()) {
                list = r8;
            }
            if (list == null || (str3 = AbstractC1435t.w0(list, "_", null, null, 0, null, null, 62, null)) == null) {
                str3 = "default";
            }
            return c.f27059a.d(this.f27100b, "init_" + str3);
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            boolean z8;
            String str;
            boolean z9;
            boolean z10;
            boolean z11;
            w.h a9;
            if (this.f27101c.l() != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            Q5.r a10 = Q5.x.a("customer", Boolean.valueOf(z8));
            w.i l8 = this.f27101c.l();
            if (l8 != null && (a9 = l8.a()) != null) {
                str = a9.g();
            } else {
                str = null;
            }
            Q5.r a11 = Q5.x.a("customer_access_provider", str);
            if (this.f27101c.u() != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            Q5.r a12 = Q5.x.a("googlepay", Boolean.valueOf(z9));
            if (this.f27101c.z() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            Q5.r a13 = Q5.x.a("primary_button_color", Boolean.valueOf(z10));
            w.c p8 = this.f27101c.p();
            if (p8 != null && p8.i()) {
                z11 = true;
            } else {
                z11 = false;
            }
            return Q.e(Q5.x.a("mpe_config", Q.k(a10, a11, a12, a13, Q5.x.a("default_billing_details", Boolean.valueOf(z11)), Q5.x.a("allows_delayed_payment_methods", Boolean.valueOf(this.f27101c.a())), Q5.x.a("appearance", AbstractC3631a.b(this.f27101c.h())), Q5.x.a("payment_method_order", this.f27101c.x()), Q5.x.a("allows_payment_methods_requiring_shipping_address", Boolean.valueOf(this.f27101c.b())), Q5.x.a("allows_removal_of_last_saved_payment_method", Boolean.valueOf(this.f27101c.f())), Q5.x.a("billing_details_collection_configuration", AbstractC3631a.c(this.f27101c.i())), Q5.x.a("preferred_networks", AbstractC3631a.d(this.f27101c.y())), Q5.x.a("external_payment_methods", AbstractC3631a.a(this.f27101c)))));
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f27104f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f27103e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f27102d;
        }
    }

    /* loaded from: classes4.dex */
    public static final class j extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f27105b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f27106c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f27107d;

        /* renamed from: e, reason: collision with root package name */
        private final String f27108e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f27109f;

        public /* synthetic */ j(C3374a c3374a, Throwable th, boolean z8, boolean z9, boolean z10, AbstractC3284p abstractC3284p) {
            this(c3374a, th, z8, z9, z10);
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            return this.f27108e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f27109f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f27107d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f27106c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f27105b;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private j(C3374a c3374a, Throwable error, boolean z8, boolean z9, boolean z10) {
            super(0 == true ? 1 : 0);
            AbstractC3292y.i(error, "error");
            this.f27105b = z8;
            this.f27106c = z9;
            this.f27107d = z10;
            this.f27108e = "mc_load_failed";
            this.f27109f = Q.q(Q.k(Q5.x.a(TypedValues.TransitionType.S_DURATION, c3374a != null ? Float.valueOf(AbstractC4245c.a(c3374a.P())) : null), Q5.x.a("error_message", N3.k.a(error).a())), p3.i.f36196a.c(error));
        }
    }

    /* loaded from: classes4.dex */
    public static final class k extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f27110b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f27111c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f27112d;

        /* renamed from: e, reason: collision with root package name */
        private final String f27113e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f27114f;

        public k(boolean z8, boolean z9, boolean z10, boolean z11) {
            super(null);
            this.f27110b = z8;
            this.f27111c = z9;
            this.f27112d = z10;
            this.f27113e = "mc_load_started";
            this.f27114f = Q.e(Q5.x.a("compose", Boolean.valueOf(z11)));
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            return this.f27113e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f27114f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f27112d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f27111c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f27110b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class l extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f27115b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f27116c;

        /* renamed from: d, reason: collision with root package name */
        private final String f27117d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f27118e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f27119f;

        public /* synthetic */ l(D3.f fVar, w.l lVar, List list, C3374a c3374a, g3.y yVar, boolean z8, boolean z9, boolean z10, AbstractC3284p abstractC3284p) {
            this(fVar, lVar, list, c3374a, yVar, z8, z9, z10);
        }

        private final String h(D3.f fVar) {
            String str;
            if (fVar instanceof f.c) {
                return "google_pay";
            }
            if (fVar instanceof f.d) {
                return "link";
            }
            if (fVar instanceof f.C0023f) {
                o.p pVar = ((f.C0023f) fVar).r().f25635e;
                if (pVar == null || (str = pVar.f25773a) == null) {
                    return "saved";
                }
                return str;
            }
            return "none";
        }

        private final String i(w.l lVar) {
            if (lVar instanceof w.l.a) {
                w.m.d a9 = ((w.l.a) lVar).b().a();
                if (a9 instanceof w.m.d.a) {
                    return "deferred_payment_intent";
                }
                if (a9 instanceof w.m.d.b) {
                    return "deferred_setup_intent";
                }
                throw new Q5.p();
            }
            if (lVar instanceof w.l.b) {
                return "payment_intent";
            }
            if (lVar instanceof w.l.c) {
                return "setup_intent";
            }
            throw new Q5.p();
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            return this.f27117d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f27119f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f27116c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f27118e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f27115b;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private l(D3.f fVar, w.l initializationMode, List orderedLpms, C3374a c3374a, g3.y yVar, boolean z8, boolean z9, boolean z10) {
            super(0 == true ? 1 : 0);
            AbstractC3292y.i(initializationMode, "initializationMode");
            AbstractC3292y.i(orderedLpms, "orderedLpms");
            this.f27115b = z8;
            this.f27116c = z9;
            this.f27117d = "mc_load_succeeded";
            this.f27118e = yVar != null;
            Map k8 = Q.k(Q5.x.a(TypedValues.TransitionType.S_DURATION, c3374a != null ? Float.valueOf(AbstractC4245c.a(c3374a.P())) : null), Q5.x.a("selected_lpm", h(fVar)), Q5.x.a("intent_type", i(initializationMode)), Q5.x.a("ordered_lpms", AbstractC1435t.w0(orderedLpms, ",", null, null, 0, null, null, 62, null)), Q5.x.a("require_cvc_recollection", Boolean.valueOf(z10)));
            Map e8 = yVar != null ? Q.e(Q5.x.a("link_mode", z.a(yVar))) : null;
            this.f27119f = Q.q(k8, e8 == null ? Q.h() : e8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class m extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f27120b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f27121c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f27122d;

        /* renamed from: e, reason: collision with root package name */
        private final String f27123e;

        /* renamed from: f, reason: collision with root package name */
        private final String f27124f;

        /* renamed from: g, reason: collision with root package name */
        private final Map f27125g;

        public m(boolean z8, boolean z9, boolean z10, String str) {
            super(null);
            this.f27120b = z8;
            this.f27121c = z9;
            this.f27122d = z10;
            this.f27123e = str;
            this.f27124f = "luxe_serialize_failure";
            this.f27125g = Q.e(Q5.x.a("error_message", str));
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            return this.f27124f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f27125g;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f27122d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f27121c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f27120b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class n extends c {

        /* renamed from: b, reason: collision with root package name */
        private final a f27126b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f27127c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f27128d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f27129e;

        /* renamed from: f, reason: collision with root package name */
        private final EnumC4126f f27130f;

        /* renamed from: g, reason: collision with root package name */
        private final String f27131g;

        /* renamed from: h, reason: collision with root package name */
        private final Map f27132h;

        /* loaded from: classes4.dex */
        public interface a {

            /* renamed from: com.stripe.android.paymentsheet.analytics.c$n$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0602a {
                public static String a(a aVar) {
                    if (aVar instanceof C0603c) {
                        return "success";
                    }
                    if (aVar instanceof b) {
                        return "failure";
                    }
                    throw new Q5.p();
                }
            }

            /* loaded from: classes4.dex */
            public static final class b implements a {

                /* renamed from: a, reason: collision with root package name */
                private final AbstractC4244b f27133a;

                public b(AbstractC4244b error) {
                    AbstractC3292y.i(error, "error");
                    this.f27133a = error;
                }

                public final AbstractC4244b a() {
                    return this.f27133a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && AbstractC3292y.d(this.f27133a, ((b) obj).f27133a);
                }

                @Override // com.stripe.android.paymentsheet.analytics.c.n.a
                public String g() {
                    return C0602a.a(this);
                }

                public int hashCode() {
                    return this.f27133a.hashCode();
                }

                public String toString() {
                    return "Failure(error=" + this.f27133a + ")";
                }
            }

            /* renamed from: com.stripe.android.paymentsheet.analytics.c$n$a$c, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0603c implements a {

                /* renamed from: a, reason: collision with root package name */
                public static final C0603c f27134a = new C0603c();

                private C0603c() {
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C0603c);
                }

                @Override // com.stripe.android.paymentsheet.analytics.c.n.a
                public String g() {
                    return C0602a.a(this);
                }

                public int hashCode() {
                    return 1616357393;
                }

                public String toString() {
                    return "Success";
                }
            }

            String g();
        }

        public /* synthetic */ n(EventReporter.Mode mode, a aVar, C3374a c3374a, D3.f fVar, String str, boolean z8, boolean z9, boolean z10, EnumC4126f enumC4126f, AbstractC3284p abstractC3284p) {
            this(mode, aVar, c3374a, fVar, str, z8, z9, z10, enumC4126f);
        }

        private final Map h() {
            Map map;
            EnumC4126f enumC4126f = this.f27130f;
            if (enumC4126f != null) {
                map = Q.e(Q5.x.a("deferred_intent_confirmation_type", enumC4126f.b()));
            } else {
                map = null;
            }
            if (map == null) {
                return Q.h();
            }
            return map;
        }

        private final Map i() {
            a aVar = this.f27126b;
            if (aVar instanceof a.C0603c) {
                return Q.h();
            }
            if (aVar instanceof a.b) {
                return B4.b.a(Q.k(Q5.x.a("error_message", ((a.b) aVar).a().a()), Q5.x.a("error_code", ((a.b) this.f27126b).a().b())));
            }
            throw new Q5.p();
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            return this.f27131g;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f27132h;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f27129e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f27128d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f27127c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private n(EventReporter.Mode mode, a result, C3374a c3374a, D3.f fVar, String str, boolean z8, boolean z9, boolean z10, EnumC4126f enumC4126f) {
            super(0 == true ? 1 : 0);
            AbstractC3292y.i(mode, "mode");
            AbstractC3292y.i(result, "result");
            this.f27126b = result;
            this.f27127c = z8;
            this.f27128d = z9;
            this.f27129e = z10;
            this.f27130f = enumC4126f;
            d dVar = c.f27059a;
            this.f27131g = dVar.d(mode, "payment_" + dVar.c(fVar) + "_" + result.g());
            this.f27132h = Q.q(Q.q(Q.q(Q.k(Q5.x.a(TypedValues.TransitionType.S_DURATION, c3374a != null ? Float.valueOf(AbstractC4245c.a(c3374a.P())) : null), Q5.x.a("currency", str)), h()), AbstractC4245c.b(fVar)), i());
        }
    }

    /* loaded from: classes4.dex */
    public static final class o extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f27135b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f27136c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f27137d;

        /* renamed from: e, reason: collision with root package name */
        private final String f27138e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f27139f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String code, boolean z8, boolean z9, boolean z10) {
            super(null);
            AbstractC3292y.i(code, "code");
            this.f27135b = z8;
            this.f27136c = z9;
            this.f27137d = z10;
            this.f27138e = "mc_form_interacted";
            this.f27139f = Q.e(Q5.x.a("selected_lpm", code));
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            return this.f27138e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f27139f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f27137d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f27136c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f27135b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class p extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f27140b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f27141c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f27142d;

        /* renamed from: e, reason: collision with root package name */
        private final String f27143e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f27144f;

        public /* synthetic */ p(String str, C3374a c3374a, String str2, String str3, boolean z8, boolean z9, boolean z10, AbstractC3284p abstractC3284p) {
            this(str, c3374a, str2, str3, z8, z9, z10);
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            return this.f27143e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f27144f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f27142d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f27141c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f27140b;
        }

        private p(String str, C3374a c3374a, String str2, String str3, boolean z8, boolean z9, boolean z10) {
            super(0 == true ? 1 : 0);
            this.f27140b = z8;
            this.f27141c = z9;
            this.f27142d = z10;
            this.f27143e = "mc_confirm_button_tapped";
            this.f27144f = B4.b.a(Q.k(Q5.x.a(TypedValues.TransitionType.S_DURATION, c3374a != null ? Float.valueOf(AbstractC4245c.a(c3374a.P())) : null), Q5.x.a("currency", str), Q5.x.a("selected_lpm", str2), Q5.x.a("link_context", str3)));
        }
    }

    /* loaded from: classes4.dex */
    public static final class q extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f27145b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f27146c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f27147d;

        /* renamed from: e, reason: collision with root package name */
        private final String f27148e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f27149f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String code, String str, boolean z8, boolean z9, boolean z10) {
            super(null);
            AbstractC3292y.i(code, "code");
            this.f27145b = z8;
            this.f27146c = z9;
            this.f27147d = z10;
            this.f27148e = "mc_carousel_payment_method_tapped";
            this.f27149f = Q.k(Q5.x.a("currency", str), Q5.x.a("selected_lpm", code));
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            return this.f27148e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f27149f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f27147d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f27146c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f27145b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class r extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f27150b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f27151c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f27152d;

        /* renamed from: e, reason: collision with root package name */
        private final String f27153e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f27154f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(EventReporter.Mode mode, D3.f fVar, String str, boolean z8, boolean z9, boolean z10) {
            super(null);
            AbstractC3292y.i(mode, "mode");
            this.f27150b = z8;
            this.f27151c = z9;
            this.f27152d = z10;
            d dVar = c.f27059a;
            this.f27153e = dVar.d(mode, "paymentoption_" + dVar.c(fVar) + "_select");
            this.f27154f = Q.e(Q5.x.a("currency", str));
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            return this.f27153e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f27154f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f27152d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f27151c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f27150b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class s extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f27155b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f27156c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f27157d;

        /* renamed from: e, reason: collision with root package name */
        private final String f27158e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f27159f;

        public s(boolean z8, boolean z9, boolean z10) {
            super(null);
            this.f27155b = z8;
            this.f27156c = z9;
            this.f27157d = z10;
            this.f27158e = "mc_open_edit_screen";
            this.f27159f = Q.h();
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            return this.f27158e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f27159f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f27157d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f27156c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f27155b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class t extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f27160b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f27161c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f27162d;

        /* renamed from: e, reason: collision with root package name */
        private final String f27163e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f27164f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(EventReporter.Mode mode, String str, boolean z8, boolean z9, boolean z10) {
            super(null);
            AbstractC3292y.i(mode, "mode");
            this.f27160b = z8;
            this.f27161c = z9;
            this.f27162d = z10;
            this.f27163e = c.f27059a.d(mode, "sheet_savedpm_show");
            this.f27164f = Q.e(Q5.x.a("currency", str));
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            return this.f27163e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f27164f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f27162d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f27161c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f27160b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class u extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f27165b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f27166c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f27167d;

        /* renamed from: e, reason: collision with root package name */
        private final String f27168e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f27169f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(EventReporter.Mode mode, String str, boolean z8, boolean z9, boolean z10) {
            super(null);
            AbstractC3292y.i(mode, "mode");
            this.f27165b = z8;
            this.f27166c = z9;
            this.f27167d = z10;
            this.f27168e = c.f27059a.d(mode, "sheet_newpm_show");
            this.f27169f = Q.e(Q5.x.a("currency", str));
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            return this.f27168e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f27169f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f27167d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f27166c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f27165b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class v extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f27170b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f27171c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f27172d;

        /* renamed from: e, reason: collision with root package name */
        private final String f27173e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f27174f;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class a {

            /* renamed from: b, reason: collision with root package name */
            public static final a f27175b = new a("Edit", 0, "edit");

            /* renamed from: c, reason: collision with root package name */
            public static final a f27176c = new a("Add", 1, "add");

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ a[] f27177d;

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ W5.a f27178e;

            /* renamed from: a, reason: collision with root package name */
            private final String f27179a;

            static {
                a[] a9 = a();
                f27177d = a9;
                f27178e = W5.b.a(a9);
            }

            private a(String str, int i8, String str2) {
                this.f27179a = str2;
            }

            private static final /* synthetic */ a[] a() {
                return new a[]{f27175b, f27176c};
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) f27177d.clone();
            }

            public final String b() {
                return this.f27179a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(a source, EnumC2906e selectedBrand, boolean z8, boolean z9, boolean z10) {
            super(null);
            AbstractC3292y.i(source, "source");
            AbstractC3292y.i(selectedBrand, "selectedBrand");
            this.f27170b = z8;
            this.f27171c = z9;
            this.f27172d = z10;
            this.f27173e = "mc_open_cbc_dropdown";
            this.f27174f = Q.k(Q5.x.a("cbc_event_source", source.b()), Q5.x.a("selected_card_brand", selectedBrand.f()));
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            return this.f27173e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f27174f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f27172d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f27171c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f27170b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class w extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f27180b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f27181c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f27182d;

        /* renamed from: e, reason: collision with root package name */
        private final String f27183e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f27184f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(String code, boolean z8, boolean z9, boolean z10) {
            super(null);
            AbstractC3292y.i(code, "code");
            this.f27180b = z8;
            this.f27181c = z9;
            this.f27182d = z10;
            this.f27183e = "mc_form_shown";
            this.f27184f = Q.e(Q5.x.a("selected_lpm", code));
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            return this.f27183e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f27184f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f27182d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f27181c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f27180b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class x extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f27185b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f27186c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f27187d;

        /* renamed from: e, reason: collision with root package name */
        private final String f27188e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f27189f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(EnumC2906e selectedBrand, Throwable error, boolean z8, boolean z9, boolean z10) {
            super(null);
            AbstractC3292y.i(selectedBrand, "selectedBrand");
            AbstractC3292y.i(error, "error");
            this.f27185b = z8;
            this.f27186c = z9;
            this.f27187d = z10;
            this.f27188e = "mc_update_card_failed";
            this.f27189f = Q.q(Q.k(Q5.x.a("selected_card_brand", selectedBrand.f()), Q5.x.a("error_message", error.getMessage())), p3.i.f36196a.c(error));
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            return this.f27188e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f27189f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f27187d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f27186c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f27185b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class y extends c {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f27190b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f27191c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f27192d;

        /* renamed from: e, reason: collision with root package name */
        private final String f27193e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f27194f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(EnumC2906e selectedBrand, boolean z8, boolean z9, boolean z10) {
            super(null);
            AbstractC3292y.i(selectedBrand, "selectedBrand");
            this.f27190b = z8;
            this.f27191c = z9;
            this.f27192d = z10;
            this.f27193e = "mc_update_card";
            this.f27194f = Q.e(Q5.x.a("selected_card_brand", selectedBrand.f()));
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            return this.f27193e;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected Map b() {
            return this.f27194f;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean c() {
            return this.f27192d;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean d() {
            return this.f27191c;
        }

        @Override // com.stripe.android.paymentsheet.analytics.c
        protected boolean f() {
            return this.f27190b;
        }
    }

    private c() {
    }

    private final Map g(boolean z8, boolean z9, boolean z10) {
        return Q.k(Q5.x.a("is_decoupled", Boolean.valueOf(z8)), Q5.x.a("link_enabled", Boolean.valueOf(z9)), Q5.x.a("google_pay_enabled", Boolean.valueOf(z10)));
    }

    protected abstract Map b();

    protected abstract boolean c();

    protected abstract boolean d();

    public final Map e() {
        return Q.q(g(f(), d(), c()), b());
    }

    protected abstract boolean f();

    public /* synthetic */ c(AbstractC3284p abstractC3284p) {
        this();
    }
}
