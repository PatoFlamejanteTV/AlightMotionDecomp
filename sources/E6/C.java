package E6;

import A6.j;
import A6.k;
import E6.C1062u;
import R5.AbstractC1435t;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes5.dex */
public abstract class C {

    /* renamed from: a, reason: collision with root package name */
    private static final C1062u.a f1988a = new C1062u.a();

    /* renamed from: b, reason: collision with root package name */
    private static final C1062u.a f1989b = new C1062u.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ A6.f f1990a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ D6.a f1991b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(A6.f fVar, D6.a aVar) {
            super(0);
            this.f1990a = fVar;
            this.f1991b = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Map invoke() {
            return C.b(this.f1990a, this.f1991b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map b(A6.f fVar, D6.a aVar) {
        String str;
        String[] names;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean d8 = d(aVar, fVar);
        l(fVar, aVar);
        int e8 = fVar.e();
        for (int i8 = 0; i8 < e8; i8++) {
            List g8 = fVar.g(i8);
            ArrayList arrayList = new ArrayList();
            for (Object obj : g8) {
                if (obj instanceof D6.r) {
                    arrayList.add(obj);
                }
            }
            D6.r rVar = (D6.r) AbstractC1435t.M0(arrayList);
            if (rVar != null && (names = rVar.names()) != null) {
                for (String str2 : names) {
                    if (d8) {
                        str2 = str2.toLowerCase(Locale.ROOT);
                        AbstractC3292y.h(str2, "toLowerCase(...)");
                    }
                    c(linkedHashMap, fVar, str2, i8);
                }
            }
            if (d8) {
                str = fVar.f(i8).toLowerCase(Locale.ROOT);
                AbstractC3292y.h(str, "toLowerCase(...)");
            } else {
                str = null;
            }
            if (str != null) {
                c(linkedHashMap, fVar, str, i8);
            }
        }
        if (linkedHashMap.isEmpty()) {
            return R5.Q.h();
        }
        return linkedHashMap;
    }

    private static final void c(Map map, A6.f fVar, String str, int i8) {
        String str2;
        if (AbstractC3292y.d(fVar.getKind(), j.b.f287a)) {
            str2 = "enum value";
        } else {
            str2 = "property";
        }
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i8));
            return;
        }
        throw new A("The suggested name '" + str + "' for " + str2 + ' ' + fVar.f(i8) + " is already one of the names for " + str2 + ' ' + fVar.f(((Number) R5.Q.i(map, str)).intValue()) + " in " + fVar);
    }

    private static final boolean d(D6.a aVar, A6.f fVar) {
        if (aVar.d().f() && AbstractC3292y.d(fVar.getKind(), j.b.f287a)) {
            return true;
        }
        return false;
    }

    public static final Map e(D6.a aVar, A6.f descriptor) {
        AbstractC3292y.i(aVar, "<this>");
        AbstractC3292y.i(descriptor, "descriptor");
        return (Map) D6.z.a(aVar).b(descriptor, f1988a, new a(descriptor, aVar));
    }

    public static final C1062u.a f() {
        return f1988a;
    }

    public static final String g(A6.f fVar, D6.a json, int i8) {
        AbstractC3292y.i(fVar, "<this>");
        AbstractC3292y.i(json, "json");
        l(fVar, json);
        return fVar.f(i8);
    }

    public static final int h(A6.f fVar, D6.a json, String name) {
        AbstractC3292y.i(fVar, "<this>");
        AbstractC3292y.i(json, "json");
        AbstractC3292y.i(name, "name");
        if (d(json, fVar)) {
            String lowerCase = name.toLowerCase(Locale.ROOT);
            AbstractC3292y.h(lowerCase, "toLowerCase(...)");
            return k(fVar, json, lowerCase);
        }
        l(fVar, json);
        int d8 = fVar.d(name);
        if (d8 != -3) {
            return d8;
        }
        if (!json.d().m()) {
            return d8;
        }
        return k(fVar, json, name);
    }

    public static final int i(A6.f fVar, D6.a json, String name, String suffix) {
        AbstractC3292y.i(fVar, "<this>");
        AbstractC3292y.i(json, "json");
        AbstractC3292y.i(name, "name");
        AbstractC3292y.i(suffix, "suffix");
        int h8 = h(fVar, json, name);
        if (h8 != -3) {
            return h8;
        }
        throw new y6.h(fVar.a() + " does not contain element with name '" + name + '\'' + suffix);
    }

    public static /* synthetic */ int j(A6.f fVar, D6.a aVar, String str, String str2, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            str2 = "";
        }
        return i(fVar, aVar, str, str2);
    }

    private static final int k(A6.f fVar, D6.a aVar, String str) {
        Integer num = (Integer) e(aVar, fVar).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final D6.s l(A6.f fVar, D6.a json) {
        AbstractC3292y.i(fVar, "<this>");
        AbstractC3292y.i(json, "json");
        if (AbstractC3292y.d(fVar.getKind(), k.a.f288a)) {
            json.d().j();
            return null;
        }
        return null;
    }
}
