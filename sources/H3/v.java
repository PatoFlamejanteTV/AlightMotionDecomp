package h3;

import R5.AbstractC1435t;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.stripe.android.model.o;
import g3.EnumC2906e;
import i3.AbstractC2970a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class v implements A2.a {

    /* renamed from: b, reason: collision with root package name */
    private static final e f32621b = new e(null);

    /* loaded from: classes4.dex */
    public static final class a implements A2.a {

        /* renamed from: b, reason: collision with root package name */
        private static final C0753a f32622b = new C0753a(null);

        /* renamed from: h3.v$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        private static final class C0753a {
            private C0753a() {
            }

            public /* synthetic */ C0753a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        @Override // A2.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o.c a(JSONObject json) {
            AbstractC3292y.i(json, "json");
            return new o.c(z2.e.l(json, "bsb_number"), z2.e.l(json, "fingerprint"), z2.e.l(json, "last4"));
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements A2.a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f32623b = new a(null);

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        @Override // A2.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o.d a(JSONObject json) {
            AbstractC3292y.i(json, "json");
            return new o.d(z2.e.l(json, "fingerprint"), z2.e.l(json, "last4"), z2.e.l(json, "sort_code"));
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements A2.a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f32624b = new a(null);

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        @Override // A2.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o.e a(JSONObject json) {
            com.stripe.android.model.a aVar;
            AbstractC3292y.i(json, "json");
            JSONObject optJSONObject = json.optJSONObject("address");
            if (optJSONObject != null) {
                aVar = new C2940b().a(optJSONObject);
            } else {
                aVar = null;
            }
            return new o.e(aVar, z2.e.l(json, NotificationCompat.CATEGORY_EMAIL), z2.e.l(json, "name"), z2.e.l(json, HintConstants.AUTOFILL_HINT_PHONE));
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements A2.a {

        /* renamed from: b, reason: collision with root package name */
        private static final b f32625b = new b(null);

        /* loaded from: classes4.dex */
        public static final class a implements A2.a {

            /* renamed from: b, reason: collision with root package name */
            private static final C0754a f32626b = new C0754a(null);

            /* renamed from: h3.v$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            private static final class C0754a {
                private C0754a() {
                }

                public /* synthetic */ C0754a(AbstractC3284p abstractC3284p) {
                    this();
                }
            }

            @Override // A2.a
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public o.g.a a(JSONObject json) {
                AbstractC3292y.i(json, "json");
                return new o.g.a(z2.e.l(json, "address_line1_check"), z2.e.l(json, "address_postal_code_check"), z2.e.l(json, "cvc_check"));
            }
        }

        /* loaded from: classes4.dex */
        private static final class b {
            private b() {
            }

            public /* synthetic */ b(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class c implements A2.a {

            /* renamed from: b, reason: collision with root package name */
            private static final a f32627b = new a(null);

            /* loaded from: classes4.dex */
            private static final class a {
                private a() {
                }

                public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                    this();
                }
            }

            @Override // A2.a
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public o.g.c a(JSONObject json) {
                AbstractC3292y.i(json, "json");
                List a9 = z2.e.f41477a.a(json.optJSONArray("available"));
                if (a9 == null) {
                    a9 = AbstractC1435t.m();
                }
                List list = a9;
                ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().toString());
                }
                return new o.g.c(AbstractC1435t.b1(arrayList), z2.e.f41477a.f(json, "selection_mandatory"), z2.e.l(json, "preferred"));
            }
        }

        /* renamed from: h3.v$d$d, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0755d implements A2.a {

            /* renamed from: b, reason: collision with root package name */
            private static final a f32628b = new a(null);

            /* renamed from: h3.v$d$d$a */
            /* loaded from: classes4.dex */
            private static final class a {
                private a() {
                }

                public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                    this();
                }
            }

            @Override // A2.a
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public o.g.d a(JSONObject json) {
                AbstractC3292y.i(json, "json");
                return new o.g.d(z2.e.f41477a.f(json, "supported"));
            }
        }

        @Override // A2.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o.g a(JSONObject json) {
            o.g.a aVar;
            o.g.d dVar;
            AbstractC2970a abstractC2970a;
            o.g.c cVar;
            AbstractC3292y.i(json, "json");
            EnumC2906e b9 = EnumC2906e.f32115m.b(z2.e.l(json, "brand"));
            JSONObject optJSONObject = json.optJSONObject("checks");
            if (optJSONObject != null) {
                aVar = new a().a(optJSONObject);
            } else {
                aVar = null;
            }
            String l8 = z2.e.l(json, "country");
            z2.e eVar = z2.e.f41477a;
            Integer i8 = eVar.i(json, "exp_month");
            Integer i9 = eVar.i(json, "exp_year");
            String l9 = z2.e.l(json, "fingerprint");
            String l10 = z2.e.l(json, "funding");
            String l11 = z2.e.l(json, "last4");
            JSONObject optJSONObject2 = json.optJSONObject("three_d_secure_usage");
            if (optJSONObject2 != null) {
                dVar = new C0755d().a(optJSONObject2);
            } else {
                dVar = null;
            }
            JSONObject optJSONObject3 = json.optJSONObject("wallet");
            if (optJSONObject3 != null) {
                abstractC2970a = new C2937F().a(optJSONObject3);
            } else {
                abstractC2970a = null;
            }
            JSONObject optJSONObject4 = json.optJSONObject("networks");
            if (optJSONObject4 != null) {
                cVar = new c().a(optJSONObject4);
            } else {
                cVar = null;
            }
            return new o.g(b9, aVar, l8, i8, i9, l9, l10, l11, dVar, abstractC2970a, cVar, z2.e.l(json, "display_brand"));
        }
    }

    /* loaded from: classes4.dex */
    private static final class e {
        private e() {
        }

        public /* synthetic */ e(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class f implements A2.a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f32629b = new a(null);

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        @Override // A2.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o.k a(JSONObject json) {
            AbstractC3292y.i(json, "json");
            return new o.k(z2.e.l(json, "bank"), z2.e.l(json, "account_holder_type"));
        }
    }

    /* loaded from: classes4.dex */
    public static final class g implements A2.a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f32630b = new a(null);

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        @Override // A2.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o.l a(JSONObject json) {
            AbstractC3292y.i(json, "json");
            return new o.l(z2.e.l(json, "bank"), z2.e.l(json, "bic"));
        }
    }

    /* loaded from: classes4.dex */
    public static final class h implements A2.a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f32631b = new a(null);

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        @Override // A2.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o.m a(JSONObject json) {
            AbstractC3292y.i(json, "json");
            return new o.m(z2.e.l(json, "bank"));
        }
    }

    /* loaded from: classes4.dex */
    public static final class i implements A2.a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f32632b = new a(null);

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        @Override // A2.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o.n a(JSONObject json) {
            AbstractC3292y.i(json, "json");
            return new o.n(z2.e.l(json, "bank_code"), z2.e.l(json, "branch_code"), z2.e.l(json, "country"), z2.e.l(json, "fingerprint"), z2.e.l(json, "last4"));
        }
    }

    /* loaded from: classes4.dex */
    public static final class j implements A2.a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f32633b = new a(null);

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        @Override // A2.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o.C0517o a(JSONObject json) {
            AbstractC3292y.i(json, "json");
            return new o.C0517o(z2.e.l(json, "country"));
        }
    }

    /* loaded from: classes4.dex */
    public static final class k implements A2.a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f32634b = new a(null);

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        @Override // A2.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o.r a(JSONObject json) {
            JSONArray jSONArray;
            Object obj;
            Object obj2;
            o.r.c cVar;
            o.r.d dVar;
            AbstractC3292y.i(json, "json");
            Iterator<E> it = o.r.b.b().iterator();
            while (true) {
                jSONArray = null;
                if (it.hasNext()) {
                    obj = it.next();
                    if (AbstractC3292y.d(z2.e.l(json, "account_holder_type"), ((o.r.b) obj).f())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            o.r.b bVar = (o.r.b) obj;
            if (bVar == null) {
                bVar = o.r.b.f25788b;
            }
            o.r.b bVar2 = bVar;
            Iterator<E> it2 = o.r.c.b().iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj2 = it2.next();
                    if (AbstractC3292y.d(z2.e.l(json, "account_type"), ((o.r.c) obj2).f())) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            o.r.c cVar2 = (o.r.c) obj2;
            if (cVar2 == null) {
                cVar = o.r.c.f25794b;
            } else {
                cVar = cVar2;
            }
            String l8 = z2.e.l(json, "bank_name");
            String l9 = z2.e.l(json, "fingerprint");
            String l10 = z2.e.l(json, "last4");
            String l11 = z2.e.l(json, "financial_connections_account");
            if (json.has("networks")) {
                String l12 = z2.e.l(json.optJSONObject("networks"), "preferred");
                z2.e eVar = z2.e.f41477a;
                JSONObject optJSONObject = json.optJSONObject("networks");
                if (optJSONObject != null) {
                    jSONArray = optJSONObject.getJSONArray("supported");
                }
                List a9 = eVar.a(jSONArray);
                if (a9 == null) {
                    a9 = AbstractC1435t.m();
                }
                List list = a9;
                ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList.add(it3.next().toString());
                }
                dVar = new o.r.d(l12, arrayList);
            } else {
                dVar = null;
            }
            return new o.r(bVar2, cVar, l8, l9, l10, l11, dVar, z2.e.l(json, "routing_number"));
        }
    }

    /* loaded from: classes4.dex */
    public static final class l implements A2.a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f32635b = new a(null);

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        @Override // A2.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o.s a(JSONObject json) {
            AbstractC3292y.i(json, "json");
            return new o.s(z2.e.l(json, "vpa"));
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class m {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32636a;

        static {
            int[] iArr = new int[o.p.values().length];
            try {
                iArr[o.p.f25755i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.p.f25756j.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.p.f25758l.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o.p.f25757k.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[o.p.f25759m.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[o.p.f25760n.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[o.p.f25761o.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[o.p.f25762p.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[o.p.f25763q.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[o.p.f25731A.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[o.p.f25745O.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f32636a = iArr;
        }
    }

    @Override // A2.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.model.o a(JSONObject json) {
        o.e eVar;
        o.b bVar;
        int i8;
        Object obj;
        AbstractC3292y.i(json, "json");
        String l8 = z2.e.l(json, "type");
        o.p a9 = o.p.f25753g.a(l8);
        o.f i9 = new o.f().l(z2.e.l(json, "id")).r(a9).h(l8).i(z2.e.f41477a.j(json, "created"));
        JSONObject optJSONObject = json.optJSONObject("billing_details");
        o.g gVar = null;
        o.r rVar = null;
        o.m mVar = null;
        o.s sVar = null;
        o.C0517o c0517o = null;
        o.d dVar = null;
        o.c cVar = null;
        o.n nVar = null;
        o.k kVar = null;
        o.l lVar = null;
        if (optJSONObject != null) {
            eVar = new c().a(optJSONObject);
        } else {
            eVar = null;
        }
        o.f e8 = i9.e(eVar);
        String l9 = z2.e.l(json, "allow_redisplay");
        if (l9 != null) {
            Iterator<E> it = o.b.b().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (AbstractC3292y.d(l9, ((o.b) obj).f())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            bVar = (o.b) obj;
        } else {
            bVar = null;
        }
        o.f n8 = e8.b(bVar).j(z2.e.l(json, "customer")).n(json.optBoolean("livemode"));
        if (a9 == null) {
            i8 = -1;
        } else {
            i8 = m.f32636a[a9.ordinal()];
        }
        switch (i8) {
            case 1:
                JSONObject optJSONObject2 = json.optJSONObject(a9.f25773a);
                if (optJSONObject2 != null) {
                    gVar = new d().a(optJSONObject2);
                }
                n8.f(gVar);
                break;
            case 2:
                n8.g(o.h.f25717b.a());
                break;
            case 3:
                JSONObject optJSONObject3 = json.optJSONObject(a9.f25773a);
                if (optJSONObject3 != null) {
                    lVar = new g().a(optJSONObject3);
                }
                n8.m(lVar);
                break;
            case 4:
                JSONObject optJSONObject4 = json.optJSONObject(a9.f25773a);
                if (optJSONObject4 != null) {
                    kVar = new f().a(optJSONObject4);
                }
                n8.k(kVar);
                break;
            case 5:
                JSONObject optJSONObject5 = json.optJSONObject(a9.f25773a);
                if (optJSONObject5 != null) {
                    nVar = new i().a(optJSONObject5);
                }
                n8.p(nVar);
                break;
            case 6:
                JSONObject optJSONObject6 = json.optJSONObject(a9.f25773a);
                if (optJSONObject6 != null) {
                    cVar = new a().a(optJSONObject6);
                }
                n8.c(cVar);
                break;
            case 7:
                JSONObject optJSONObject7 = json.optJSONObject(a9.f25773a);
                if (optJSONObject7 != null) {
                    dVar = new b().a(optJSONObject7);
                }
                n8.d(dVar);
                break;
            case 8:
                JSONObject optJSONObject8 = json.optJSONObject(a9.f25773a);
                if (optJSONObject8 != null) {
                    c0517o = new j().a(optJSONObject8);
                }
                n8.q(c0517o);
                break;
            case 9:
                JSONObject optJSONObject9 = json.optJSONObject(a9.f25773a);
                if (optJSONObject9 != null) {
                    sVar = new l().a(optJSONObject9);
                }
                n8.t(sVar);
                break;
            case 10:
                JSONObject optJSONObject10 = json.optJSONObject(a9.f25773a);
                if (optJSONObject10 != null) {
                    mVar = new h().a(optJSONObject10);
                }
                n8.o(mVar);
                break;
            case 11:
                JSONObject optJSONObject11 = json.optJSONObject(a9.f25773a);
                if (optJSONObject11 != null) {
                    rVar = new k().a(optJSONObject11);
                }
                n8.s(rVar);
                break;
        }
        return n8.a();
    }
}
