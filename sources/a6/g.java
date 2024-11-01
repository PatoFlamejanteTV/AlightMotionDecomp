package A6;

import A6.f;
import C6.AbstractC1010c0;
import C6.AbstractC1016f0;
import C6.InterfaceC1022l;
import Q5.InterfaceC1416k;
import Q5.l;
import Q5.x;
import R5.AbstractC1428l;
import R5.AbstractC1435t;
import R5.K;
import R5.Q;
import i6.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes5.dex */
public final class g implements f, InterfaceC1022l {

    /* renamed from: a, reason: collision with root package name */
    private final String f265a;

    /* renamed from: b, reason: collision with root package name */
    private final j f266b;

    /* renamed from: c, reason: collision with root package name */
    private final int f267c;

    /* renamed from: d, reason: collision with root package name */
    private final List f268d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f269e;

    /* renamed from: f, reason: collision with root package name */
    private final String[] f270f;

    /* renamed from: g, reason: collision with root package name */
    private final f[] f271g;

    /* renamed from: h, reason: collision with root package name */
    private final List[] f272h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean[] f273i;

    /* renamed from: j, reason: collision with root package name */
    private final Map f274j;

    /* renamed from: k, reason: collision with root package name */
    private final f[] f275k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC1416k f276l;

    /* loaded from: classes5.dex */
    static final class a extends AbstractC3293z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            g gVar = g.this;
            return Integer.valueOf(AbstractC1016f0.a(gVar, gVar.f275k));
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends AbstractC3293z implements Function1 {
        b() {
            super(1);
        }

        public final CharSequence a(int i8) {
            return g.this.f(i8) + ": " + g.this.h(i8).a();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public g(String serialName, j kind, int i8, List typeParameters, A6.a builder) {
        AbstractC3292y.i(serialName, "serialName");
        AbstractC3292y.i(kind, "kind");
        AbstractC3292y.i(typeParameters, "typeParameters");
        AbstractC3292y.i(builder, "builder");
        this.f265a = serialName;
        this.f266b = kind;
        this.f267c = i8;
        this.f268d = builder.c();
        this.f269e = AbstractC1435t.U0(builder.f());
        String[] strArr = (String[]) builder.f().toArray(new String[0]);
        this.f270f = strArr;
        this.f271g = AbstractC1010c0.b(builder.e());
        this.f272h = (List[]) builder.d().toArray(new List[0]);
        this.f273i = AbstractC1435t.R0(builder.g());
        Iterable<K> b12 = AbstractC1428l.b1(strArr);
        ArrayList arrayList = new ArrayList(AbstractC1435t.x(b12, 10));
        for (K k8 : b12) {
            arrayList.add(x.a(k8.b(), Integer.valueOf(k8.a())));
        }
        this.f274j = Q.u(arrayList);
        this.f275k = AbstractC1010c0.b(typeParameters);
        this.f276l = l.b(new a());
    }

    private final int k() {
        return ((Number) this.f276l.getValue()).intValue();
    }

    @Override // A6.f
    public String a() {
        return this.f265a;
    }

    @Override // C6.InterfaceC1022l
    public Set b() {
        return this.f269e;
    }

    @Override // A6.f
    public boolean c() {
        return f.a.c(this);
    }

    @Override // A6.f
    public int d(String name) {
        AbstractC3292y.i(name, "name");
        Integer num = (Integer) this.f274j.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // A6.f
    public int e() {
        return this.f267c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            f fVar = (f) obj;
            if (AbstractC3292y.d(a(), fVar.a()) && Arrays.equals(this.f275k, ((g) obj).f275k) && e() == fVar.e()) {
                int e8 = e();
                for (int i8 = 0; i8 < e8; i8++) {
                    if (AbstractC3292y.d(h(i8).a(), fVar.h(i8).a()) && AbstractC3292y.d(h(i8).getKind(), fVar.h(i8).getKind())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // A6.f
    public String f(int i8) {
        return this.f270f[i8];
    }

    @Override // A6.f
    public List g(int i8) {
        return this.f272h[i8];
    }

    @Override // A6.f
    public List getAnnotations() {
        return this.f268d;
    }

    @Override // A6.f
    public j getKind() {
        return this.f266b;
    }

    @Override // A6.f
    public f h(int i8) {
        return this.f271g[i8];
    }

    public int hashCode() {
        return k();
    }

    @Override // A6.f
    public boolean i(int i8) {
        return this.f273i[i8];
    }

    @Override // A6.f
    public boolean isInline() {
        return f.a.b(this);
    }

    public String toString() {
        return AbstractC1435t.w0(m.s(0, e()), ", ", a() + '(', ")", 0, null, new b(), 24, null);
    }
}
