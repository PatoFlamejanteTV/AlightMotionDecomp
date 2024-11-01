package B2;

import R5.Q;
import android.os.Build;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class D {

    /* renamed from: b, reason: collision with root package name */
    public static final b f383b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Function1 f384c = a.f386a;

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f385a;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f386a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String name) {
            AbstractC3292y.i(name, "name");
            String property = System.getProperty(name);
            if (property == null) {
                return "";
            }
            return property;
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

    public D(Function1 systemPropertySupplier) {
        AbstractC3292y.i(systemPropertySupplier, "systemPropertySupplier");
        this.f385a = systemPropertySupplier;
    }

    public final Map a(v2.c cVar) {
        return Q.e(Q5.x.a("X-Stripe-Client-User-Agent", b(cVar).toString()));
    }

    public final JSONObject b(v2.c cVar) {
        Map map;
        Map k8 = Q.k(Q5.x.a("os.name", "android"), Q5.x.a("os.version", String.valueOf(Build.VERSION.SDK_INT)), Q5.x.a("bindings.version", "20.51.0"), Q5.x.a("lang", "Java"), Q5.x.a("publisher", "Stripe"), Q5.x.a("http.agent", this.f385a.invoke("http.agent")));
        if (cVar != null) {
            map = cVar.a();
        } else {
            map = null;
        }
        if (map == null) {
            map = Q.h();
        }
        return new JSONObject(Q.q(k8, map));
    }

    public /* synthetic */ D(Function1 function1, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? f384c : function1);
    }
}
