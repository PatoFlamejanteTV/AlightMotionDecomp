package G2;

import B2.InterfaceC0949a;
import G2.b;
import Q5.x;
import R5.Q;
import g3.EnumC2906e;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import q2.AbstractC3631a;

/* loaded from: classes4.dex */
public abstract class a implements InterfaceC0949a {

    /* renamed from: a, reason: collision with root package name */
    public static final b f2762a = new b(null);

    /* renamed from: G2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0042a extends a {

        /* renamed from: b, reason: collision with root package name */
        private final String f2763b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f2764c;

        public C0042a() {
            super(null);
            this.f2763b = "cs_card_number_completed";
            this.f2764c = Q.h();
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            return this.f2763b;
        }

        @Override // G2.a
        public Map b() {
            return this.f2764c;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends a {

        /* renamed from: b, reason: collision with root package name */
        private final Map f2765b;

        /* renamed from: c, reason: collision with root package name */
        private final String f2766c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String type) {
            super(null);
            AbstractC3292y.i(type, "type");
            this.f2765b = Q.e(x.a("payment_method_type", type));
            this.f2766c = "cs_select_payment_method_screen_confirmed_savedpm_failure";
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            return this.f2766c;
        }

        @Override // G2.a
        public Map b() {
            return this.f2765b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends a {

        /* renamed from: b, reason: collision with root package name */
        private final Map f2767b;

        /* renamed from: c, reason: collision with root package name */
        private final String f2768c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String type) {
            super(null);
            AbstractC3292y.i(type, "type");
            this.f2767b = Q.e(x.a("payment_method_type", type));
            this.f2768c = "cs_select_payment_method_screen_confirmed_savedpm_success";
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            return this.f2768c;
        }

        @Override // G2.a
        public Map b() {
            return this.f2767b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends a {

        /* renamed from: b, reason: collision with root package name */
        private final Map f2769b;

        /* renamed from: c, reason: collision with root package name */
        private final String f2770c;

        public e() {
            super(null);
            this.f2769b = Q.h();
            this.f2770c = "cs_select_payment_method_screen_done_tapped";
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            return this.f2770c;
        }

        @Override // G2.a
        public Map b() {
            return this.f2769b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends a {

        /* renamed from: b, reason: collision with root package name */
        private final Map f2771b;

        /* renamed from: c, reason: collision with root package name */
        private final String f2772c;

        public f() {
            super(null);
            this.f2771b = Q.h();
            this.f2772c = "cs_select_payment_method_screen_edit_tapped";
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            return this.f2772c;
        }

        @Override // G2.a
        public Map b() {
            return this.f2771b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends a {

        /* renamed from: b, reason: collision with root package name */
        private final String f2773b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f2774c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: G2.a$g$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class EnumC0043a {

            /* renamed from: b, reason: collision with root package name */
            public static final EnumC0043a f2775b = new EnumC0043a("Edit", 0, "edit");

            /* renamed from: c, reason: collision with root package name */
            public static final EnumC0043a f2776c = new EnumC0043a("Add", 1, "add");

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ EnumC0043a[] f2777d;

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ W5.a f2778e;

            /* renamed from: a, reason: collision with root package name */
            private final String f2779a;

            static {
                EnumC0043a[] a9 = a();
                f2777d = a9;
                f2778e = W5.b.a(a9);
            }

            private EnumC0043a(String str, int i8, String str2) {
                this.f2779a = str2;
            }

            private static final /* synthetic */ EnumC0043a[] a() {
                return new EnumC0043a[]{f2775b, f2776c};
            }

            public static EnumC0043a valueOf(String str) {
                return (EnumC0043a) Enum.valueOf(EnumC0043a.class, str);
            }

            public static EnumC0043a[] values() {
                return (EnumC0043a[]) f2777d.clone();
            }

            public final String b() {
                return this.f2779a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(EnumC0043a source, EnumC2906e enumC2906e) {
            super(0 == true ? 1 : 0);
            AbstractC3292y.i(source, "source");
            this.f2773b = "cs_close_cbc_dropdown";
            this.f2774c = Q.k(x.a("cbc_event_source", source.b()), x.a("selected_card_brand", enumC2906e != null ? enumC2906e.f() : null));
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            return this.f2773b;
        }

        @Override // G2.a
        public Map b() {
            return this.f2774c;
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends a {

        /* renamed from: b, reason: collision with root package name */
        private final F2.c f2780b;

        /* renamed from: c, reason: collision with root package name */
        private final String f2781c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(F2.c configuration) {
            super(null);
            AbstractC3292y.i(configuration, "configuration");
            this.f2780b = configuration;
            this.f2781c = "cs_init";
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            return this.f2781c;
        }

        @Override // G2.a
        public Map b() {
            return Q.e(x.a("cs_config", Q.k(x.a("google_pay_enabled", Boolean.valueOf(this.f2780b.i())), x.a("default_billing_details", Boolean.valueOf(this.f2780b.h().i())), x.a("appearance", AbstractC3631a.b(this.f2780b.b())), x.a("allows_removal_of_last_saved_payment_method", Boolean.valueOf(this.f2780b.a())), x.a("payment_method_order", this.f2780b.s()), x.a("billing_details_collection_configuration", AbstractC3631a.c(this.f2780b.f())), x.a("preferred_networks", AbstractC3631a.d(this.f2780b.u())))));
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends a {

        /* renamed from: b, reason: collision with root package name */
        private final Map f2782b;

        /* renamed from: c, reason: collision with root package name */
        private final String f2783c;

        public i() {
            super(null);
            this.f2782b = Q.h();
            this.f2783c = "cs_select_payment_method_screen_removepm_failure";
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            return this.f2783c;
        }

        @Override // G2.a
        public Map b() {
            return this.f2782b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class j extends a {

        /* renamed from: b, reason: collision with root package name */
        private final Map f2784b;

        /* renamed from: c, reason: collision with root package name */
        private final String f2785c;

        public j() {
            super(null);
            this.f2784b = Q.h();
            this.f2785c = "cs_select_payment_method_screen_removepm_success";
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            return this.f2785c;
        }

        @Override // G2.a
        public Map b() {
            return this.f2784b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class k extends a {

        /* renamed from: b, reason: collision with root package name */
        private final Map f2786b;

        /* renamed from: c, reason: collision with root package name */
        private final String f2787c;

        /* renamed from: G2.a$k$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C0044a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f2788a;

            static {
                int[] iArr = new int[b.EnumC0047b.values().length];
                try {
                    iArr[b.EnumC0047b.f2811d.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f2788a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(b.EnumC0047b screen) {
            super(null);
            AbstractC3292y.i(screen, "screen");
            this.f2786b = Q.h();
            if (C0044a.f2788a[screen.ordinal()] == 1) {
                this.f2787c = "cs_cancel_edit_screen";
                return;
            }
            throw new IllegalArgumentException(screen.name() + " has no supported event for hiding screen!");
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            return this.f2787c;
        }

        @Override // G2.a
        public Map b() {
            return this.f2786b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class l extends a {

        /* renamed from: b, reason: collision with root package name */
        private final Map f2789b;

        /* renamed from: c, reason: collision with root package name */
        private final String f2790c;

        /* renamed from: G2.a$l$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C0045a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f2791a;

            static {
                int[] iArr = new int[b.EnumC0047b.values().length];
                try {
                    iArr[b.EnumC0047b.f2809b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.EnumC0047b.f2810c.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.EnumC0047b.f2811d.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f2791a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(b.EnumC0047b screen) {
            super(null);
            String str;
            AbstractC3292y.i(screen, "screen");
            this.f2789b = Q.h();
            int i8 = C0045a.f2791a[screen.ordinal()];
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 == 3) {
                        str = "cs_open_edit_screen";
                    } else {
                        throw new Q5.p();
                    }
                } else {
                    str = "cs_select_payment_method_screen_presented";
                }
            } else {
                str = "cs_add_payment_method_screen_presented";
            }
            this.f2790c = str;
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            return this.f2790c;
        }

        @Override // G2.a
        public Map b() {
            return this.f2789b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class m extends a {

        /* renamed from: b, reason: collision with root package name */
        private final String f2792b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f2793c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String code) {
            super(null);
            AbstractC3292y.i(code, "code");
            this.f2792b = "cs_carousel_payment_method_selected";
            this.f2793c = Q.e(x.a("selected_lpm", code));
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            return this.f2792b;
        }

        @Override // G2.a
        public Map b() {
            return this.f2793c;
        }
    }

    /* loaded from: classes4.dex */
    public static final class n extends a {

        /* renamed from: b, reason: collision with root package name */
        private final String f2794b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f2795c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: G2.a$n$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class EnumC0046a {

            /* renamed from: b, reason: collision with root package name */
            public static final EnumC0046a f2796b = new EnumC0046a("Edit", 0, "edit");

            /* renamed from: c, reason: collision with root package name */
            public static final EnumC0046a f2797c = new EnumC0046a("Add", 1, "add");

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ EnumC0046a[] f2798d;

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ W5.a f2799e;

            /* renamed from: a, reason: collision with root package name */
            private final String f2800a;

            static {
                EnumC0046a[] a9 = a();
                f2798d = a9;
                f2799e = W5.b.a(a9);
            }

            private EnumC0046a(String str, int i8, String str2) {
                this.f2800a = str2;
            }

            private static final /* synthetic */ EnumC0046a[] a() {
                return new EnumC0046a[]{f2796b, f2797c};
            }

            public static EnumC0046a valueOf(String str) {
                return (EnumC0046a) Enum.valueOf(EnumC0046a.class, str);
            }

            public static EnumC0046a[] values() {
                return (EnumC0046a[]) f2798d.clone();
            }

            public final String b() {
                return this.f2800a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(EnumC0046a source, EnumC2906e selectedBrand) {
            super(null);
            AbstractC3292y.i(source, "source");
            AbstractC3292y.i(selectedBrand, "selectedBrand");
            this.f2794b = "cs_open_cbc_dropdown";
            this.f2795c = Q.k(x.a("cbc_event_source", source.b()), x.a("selected_card_brand", selectedBrand.f()));
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            return this.f2794b;
        }

        @Override // G2.a
        public Map b() {
            return this.f2795c;
        }
    }

    /* loaded from: classes4.dex */
    public static final class o extends a {

        /* renamed from: b, reason: collision with root package name */
        private final String f2801b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f2802c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(EnumC2906e selectedBrand, Throwable error) {
            super(null);
            AbstractC3292y.i(selectedBrand, "selectedBrand");
            AbstractC3292y.i(error, "error");
            this.f2801b = "cs_update_card_failed";
            this.f2802c = Q.k(x.a("selected_card_brand", selectedBrand.f()), x.a("error_message", error.getMessage()));
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            return this.f2801b;
        }

        @Override // G2.a
        public Map b() {
            return this.f2802c;
        }
    }

    /* loaded from: classes4.dex */
    public static final class p extends a {

        /* renamed from: b, reason: collision with root package name */
        private final String f2803b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f2804c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(EnumC2906e selectedBrand) {
            super(null);
            AbstractC3292y.i(selectedBrand, "selectedBrand");
            this.f2803b = "cs_update_card";
            this.f2804c = Q.e(x.a("selected_card_brand", selectedBrand.f()));
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            return this.f2803b;
        }

        @Override // G2.a
        public Map b() {
            return this.f2804c;
        }
    }

    private a() {
    }

    public abstract Map b();

    public /* synthetic */ a(AbstractC3284p abstractC3284p) {
        this();
    }
}
