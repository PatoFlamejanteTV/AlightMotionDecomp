package g4;

import R5.AbstractC1435t;
import R5.Q;
import R5.a0;
import com.stripe.android.model.a;
import com.stripe.android.model.o;
import com.stripe.android.model.q;
import com.stripe.android.model.r;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k6.AbstractC3258j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.Z;
import r4.G;
import r4.P;
import w4.C4156a;

/* loaded from: classes4.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final a f32298a = new a(null);

    /* loaded from: classes4.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: g4.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0746a extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0746a f32299a = new C0746a();

            C0746a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke(l6.h it) {
                AbstractC3292y.i(it, "it");
                return it.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final b f32300a = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(String it) {
                AbstractC3292y.i(it, "it");
                return Boolean.valueOf(it.length() == 0);
            }
        }

        private a() {
        }

        private final com.stripe.android.model.a b(Map map) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            a.C0496a c0496a = new a.C0496a();
            G.b bVar = G.Companion;
            C4156a c4156a = (C4156a) map.get(bVar.p());
            String str6 = null;
            if (c4156a != null) {
                str = c4156a.c();
            } else {
                str = null;
            }
            c0496a.e(str);
            C4156a c4156a2 = (C4156a) map.get(bVar.q());
            if (c4156a2 != null) {
                str2 = c4156a2.c();
            } else {
                str2 = null;
            }
            c0496a.f(str2);
            C4156a c4156a3 = (C4156a) map.get(bVar.k());
            if (c4156a3 != null) {
                str3 = c4156a3.c();
            } else {
                str3 = null;
            }
            c0496a.b(str3);
            C4156a c4156a4 = (C4156a) map.get(bVar.z());
            if (c4156a4 != null) {
                str4 = c4156a4.c();
            } else {
                str4 = null;
            }
            c0496a.h(str4);
            C4156a c4156a5 = (C4156a) map.get(bVar.l());
            if (c4156a5 != null) {
                str5 = c4156a5.c();
            } else {
                str5 = null;
            }
            c0496a.c(str5);
            C4156a c4156a6 = (C4156a) map.get(bVar.u());
            if (c4156a6 != null) {
                str6 = c4156a6.c();
            }
            c0496a.g(str6);
            return c0496a.a();
        }

        private final o.e c(Map map) {
            String str;
            String str2;
            String str3;
            o.e.a aVar = new o.e.a();
            G.b bVar = G.Companion;
            C4156a c4156a = (C4156a) map.get(bVar.r());
            if (c4156a != null) {
                str = c4156a.c();
            } else {
                str = null;
            }
            aVar.d(str);
            C4156a c4156a2 = (C4156a) map.get(bVar.n());
            if (c4156a2 != null) {
                str2 = c4156a2.c();
            } else {
                str2 = null;
            }
            aVar.c(str2);
            C4156a c4156a3 = (C4156a) map.get(bVar.t());
            if (c4156a3 != null) {
                str3 = c4156a3.c();
            } else {
                str3 = null;
            }
            aVar.e(str3);
            aVar.b(b(map));
            o.e a9 = aVar.a();
            if (!a9.a()) {
                return null;
            }
            return a9;
        }

        private final void d(String str, Map map, Map map2) {
            a(map, AbstractC1435t.e("type"), str);
            for (Map.Entry entry : map2.entrySet()) {
                a aVar = g.f32298a;
                aVar.a(map, aVar.e((String) entry.getKey()), (String) entry.getValue());
            }
        }

        private final Map f(Map map, String str) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (!((G) entry.getKey()).i0()) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(Q.d(linkedHashMap2.size()));
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                linkedHashMap3.put(entry2.getKey(), ((C4156a) entry2.getValue()).c());
            }
            LinkedHashMap linkedHashMap4 = new LinkedHashMap(Q.d(linkedHashMap3.size()));
            for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
                linkedHashMap4.put(((G) entry3.getKey()).j0(), entry3.getValue());
            }
            d(str, linkedHashMap, linkedHashMap4);
            return linkedHashMap;
        }

        public final void a(Map map, List keys, String str) {
            Map map2;
            AbstractC3292y.i(map, "map");
            AbstractC3292y.i(keys, "keys");
            if (!keys.isEmpty()) {
                String str2 = (String) keys.get(0);
                if (keys.size() == 1) {
                    map.put(str2, str);
                    return;
                }
                Object obj = map.get(str2);
                if (Z.j(obj)) {
                    map2 = (Map) obj;
                } else {
                    map2 = null;
                }
                if (map2 == null) {
                    map2 = new LinkedHashMap();
                    map.put(str2, map2);
                }
                a(map2, keys.subList(1, keys.size()), str);
            }
        }

        public final List e(String string) {
            AbstractC3292y.i(string, "string");
            return AbstractC3258j.D(AbstractC3258j.p(AbstractC3258j.g(AbstractC3258j.y(l6.j.d(new l6.j("[*([A-Za-z_0-9]+)]*"), string, 0, 2, null), C0746a.f32299a)), b.f32300a));
        }

        public final com.stripe.android.model.p g(Map fieldValuePairs, String code, boolean z8, o.b bVar) {
            Map b9;
            AbstractC3292y.i(fieldValuePairs, "fieldValuePairs");
            AbstractC3292y.i(code, "code");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : fieldValuePairs.entrySet()) {
                if (((G) entry.getKey()).h0() == P.a.f38104a) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                Object key = entry2.getKey();
                G.b bVar2 = G.Companion;
                if (!AbstractC3292y.d(key, bVar2.x()) && !AbstractC3292y.d(entry2.getKey(), bVar2.f())) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            b9 = h.b(f(linkedHashMap2, code));
            return com.stripe.android.model.p.f25804u.o(code, g.f32298a.c(linkedHashMap2), z8, Q.w(b9), a0.d("PaymentSheet"), bVar);
        }

        public final q h(Map fieldValuePairs, String code) {
            String c8;
            AbstractC3292y.i(fieldValuePairs, "fieldValuePairs");
            AbstractC3292y.i(code, "code");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : fieldValuePairs.entrySet()) {
                if (((G) entry.getKey()).h0() == P.b.f38108a) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            boolean d8 = AbstractC3292y.d(code, o.p.f25761o.f25773a);
            Boolean bool = null;
            if (!d8) {
                return null;
            }
            C4156a c4156a = (C4156a) linkedHashMap.get(G.Companion.c());
            if (c4156a != null && (c8 = c4156a.c()) != null) {
                bool = Boolean.valueOf(Boolean.parseBoolean(c8));
            }
            return new q.a(bool);
        }

        public final r i(Map fieldValuePairs, String code) {
            String str;
            String str2;
            AbstractC3292y.i(fieldValuePairs, "fieldValuePairs");
            AbstractC3292y.i(code, "code");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : fieldValuePairs.entrySet()) {
                if (((G) entry.getKey()).h0() == P.a.f38105b) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            if (AbstractC3292y.d(code, o.p.f25732B.f25773a)) {
                C4156a c4156a = (C4156a) linkedHashMap.get(G.Companion.e());
                if (c4156a != null) {
                    str2 = c4156a.c();
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    return null;
                }
                return new r.a(str2);
            }
            if (AbstractC3292y.d(code, o.p.f25748R.f25773a)) {
                C4156a c4156a2 = (C4156a) linkedHashMap.get(G.Companion.o());
                if (c4156a2 != null) {
                    str = c4156a2.c();
                } else {
                    str = null;
                }
                if (str == null) {
                    return null;
                }
                return new r.c(str);
            }
            if (!AbstractC3292y.d(code, o.p.f25733C.f25773a)) {
                return null;
            }
            return r.f.f25898c;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }
}
