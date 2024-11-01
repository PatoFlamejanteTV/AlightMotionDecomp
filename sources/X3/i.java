package X3;

import R5.AbstractC1435t;
import R5.Q;
import android.os.Build;
import e4.InterfaceC2820d;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    private final int f11176a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2820d f11177b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f11178b = new a("MARKET_OR_REGION_RESTRICTION", 0, "RE01");

        /* renamed from: c, reason: collision with root package name */
        public static final a f11179c = new a("PLATFORM_VERSION", 1, "RE02");

        /* renamed from: d, reason: collision with root package name */
        public static final a f11180d = new a("PERMISSION", 2, "RE03");

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ a[] f11181e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ W5.a f11182f;

        /* renamed from: a, reason: collision with root package name */
        private final String f11183a;

        static {
            a[] a9 = a();
            f11181e = a9;
            f11182f = W5.b.a(a9);
        }

        private a(String str, int i8, String str2) {
            this.f11183a = str2;
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f11178b, f11179c, f11180d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f11181e.clone();
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f11183a;
        }
    }

    public i(int i8, InterfaceC2820d hardwareIdSupplier) {
        AbstractC3292y.i(hardwareIdSupplier, "hardwareIdSupplier");
        this.f11176a = i8;
        this.f11177b = hardwareIdSupplier;
    }

    @Override // X3.h
    public Map a() {
        return Q.q(Q.q(b(), d()), c());
    }

    public final Map b() {
        HashMap hashMap = new HashMap();
        List p8 = AbstractC1435t.p(g.f11105b, g.f11108c, g.f11111d, g.f11114e, g.f11117f, g.f11120g, g.f11123h, g.f11126i);
        for (g gVar : g.b()) {
            if (!p8.contains(gVar)) {
                hashMap.put(gVar.toString(), a.f11178b.toString());
            }
        }
        return hashMap;
    }

    public final Map c() {
        HashMap hashMap = new HashMap();
        String gVar = g.f11067O.toString();
        a aVar = a.f11180d;
        hashMap.put(gVar, aVar.toString());
        hashMap.put(g.f11070P.toString(), aVar.toString());
        hashMap.put(g.f11073Q.toString(), aVar.toString());
        hashMap.put(g.f11076R.toString(), aVar.toString());
        hashMap.put(g.f11079S.toString(), aVar.toString());
        hashMap.put(g.f11082T.toString(), aVar.toString());
        hashMap.put(g.f11085U.toString(), aVar.toString());
        hashMap.put(g.f11088V.toString(), aVar.toString());
        hashMap.put(g.f11091W.toString(), aVar.toString());
        hashMap.put(g.f11094X.toString(), aVar.toString());
        hashMap.put(g.f11097Y.toString(), aVar.toString());
        hashMap.put(g.f11134l.toString(), aVar.toString());
        hashMap.put(g.f11136m.toString(), aVar.toString());
        if (!((j) this.f11177b.get()).b()) {
            hashMap.put(g.f11123h.toString(), a.f11179c.toString());
        }
        hashMap.put(g.f11129j.toString(), aVar.toString());
        hashMap.put(g.f11100Z.toString(), aVar.toString());
        hashMap.put(g.f11143p0.toString(), aVar.toString());
        hashMap.put(g.f11146q0.toString(), aVar.toString());
        hashMap.put(g.f11138n.toString(), aVar.toString());
        hashMap.put(g.f11140o.toString(), aVar.toString());
        hashMap.put(g.f11142p.toString(), aVar.toString());
        hashMap.put(g.f11145q.toString(), aVar.toString());
        hashMap.put(g.f11034D.toString(), aVar.toString());
        hashMap.put(g.f11040F.toString(), aVar.toString());
        hashMap.put(g.f11043G.toString(), aVar.toString());
        hashMap.put(g.f11058L.toString(), aVar.toString());
        hashMap.put(g.f11064N.toString(), aVar.toString());
        hashMap.put(g.f11032C0.toString(), aVar.toString());
        hashMap.put(g.f11101Z0.toString(), aVar.toString());
        return hashMap;
    }

    public final Map d() {
        HashMap hashMap = new HashMap();
        if (this.f11176a < 26) {
            String gVar = g.f11142p.toString();
            a aVar = a.f11179c;
            hashMap.put(gVar, aVar.toString());
            hashMap.put(g.f11032C0.toString(), aVar.toString());
            hashMap.put(g.f11101Z0.toString(), aVar.toString());
        }
        if (this.f11176a < 23) {
            String gVar2 = g.f11169y.toString();
            a aVar2 = a.f11179c;
            hashMap.put(gVar2, aVar2.toString());
            hashMap.put(g.f11049I.toString(), aVar2.toString());
            hashMap.put(g.f11058L.toString(), aVar2.toString());
            hashMap.put(g.f11064N.toString(), aVar2.toString());
            hashMap.put(g.f11059L0.toString(), aVar2.toString());
            hashMap.put(g.f11062M0.toString(), aVar2.toString());
            hashMap.put(g.f11065N0.toString(), aVar2.toString());
            hashMap.put(g.f11027A1.toString(), aVar2.toString());
            hashMap.put(g.f11087U1.toString(), aVar2.toString());
        }
        if (this.f11176a > 23) {
            hashMap.put(g.f11109c1.toString(), a.f11179c.toString());
        }
        if (this.f11176a < 22) {
            hashMap.put(g.f11061M.toString(), a.f11179c.toString());
        }
        return hashMap;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(InterfaceC2820d hardwareIdSupplier) {
        this(Build.VERSION.SDK_INT, hardwareIdSupplier);
        AbstractC3292y.i(hardwareIdSupplier, "hardwareIdSupplier");
    }
}
