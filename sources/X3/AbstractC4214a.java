package x3;

import B2.InterfaceC0949a;
import Q5.x;
import R5.Q;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: x3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4214a implements InterfaceC0949a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0933a f40953a = new C0933a(null);

    /* renamed from: x3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0933a {
        private C0933a() {
        }

        public /* synthetic */ C0933a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: x3.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC4214a {

        /* renamed from: b, reason: collision with root package name */
        private final String f40954b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f40955c;

        /* renamed from: d, reason: collision with root package name */
        private final Integer f40956d;

        /* renamed from: e, reason: collision with root package name */
        private final String f40957e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String country, boolean z8, Integer num) {
            super(null);
            AbstractC3292y.i(country, "country");
            this.f40954b = country;
            this.f40955c = z8;
            this.f40956d = num;
            this.f40957e = "mc_address_completed";
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            return this.f40957e;
        }

        @Override // x3.AbstractC4214a
        public Map b() {
            Map m8 = Q.m(x.a("address_country_code", this.f40954b), x.a("auto_complete_result_selected", Boolean.valueOf(this.f40955c)));
            Integer num = this.f40956d;
            if (num != null) {
                m8.put("edit_distance", Integer.valueOf(num.intValue()));
            }
            return Q.e(x.a("address_data_blob", m8));
        }
    }

    /* renamed from: x3.a$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC4214a {

        /* renamed from: b, reason: collision with root package name */
        private final String f40958b;

        /* renamed from: c, reason: collision with root package name */
        private final String f40959c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String country) {
            super(null);
            AbstractC3292y.i(country, "country");
            this.f40958b = country;
            this.f40959c = "mc_address_show";
        }

        @Override // B2.InterfaceC0949a
        public String a() {
            return this.f40959c;
        }

        @Override // x3.AbstractC4214a
        public Map b() {
            return Q.e(x.a("address_data_blob", Q.e(x.a("address_country_code", this.f40958b))));
        }
    }

    private AbstractC4214a() {
    }

    public abstract Map b();

    public /* synthetic */ AbstractC4214a(AbstractC3284p abstractC3284p) {
        this();
    }
}
