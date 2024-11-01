package C6;

import A6.f;
import A6.k;
import Q5.InterfaceC1416k;
import R5.AbstractC1435t;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: C6.e0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1014e0 implements A6.f, InterfaceC1022l {

    /* renamed from: a, reason: collision with root package name */
    private final String f1044a;

    /* renamed from: b, reason: collision with root package name */
    private final C f1045b;

    /* renamed from: c, reason: collision with root package name */
    private final int f1046c;

    /* renamed from: d, reason: collision with root package name */
    private int f1047d;

    /* renamed from: e, reason: collision with root package name */
    private final String[] f1048e;

    /* renamed from: f, reason: collision with root package name */
    private final List[] f1049f;

    /* renamed from: g, reason: collision with root package name */
    private List f1050g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean[] f1051h;

    /* renamed from: i, reason: collision with root package name */
    private Map f1052i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC1416k f1053j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC1416k f1054k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC1416k f1055l;

    /* renamed from: C6.e0$a */
    /* loaded from: classes5.dex */
    static final class a extends AbstractC3293z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            C1014e0 c1014e0 = C1014e0.this;
            return Integer.valueOf(AbstractC1016f0.a(c1014e0, c1014e0.o()));
        }
    }

    /* renamed from: C6.e0$b */
    /* loaded from: classes5.dex */
    static final class b extends AbstractC3293z implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y6.b[] invoke() {
            y6.b[] c8;
            C c9 = C1014e0.this.f1045b;
            if (c9 == null || (c8 = c9.c()) == null) {
                return g0.f1063a;
            }
            return c8;
        }
    }

    /* renamed from: C6.e0$c */
    /* loaded from: classes5.dex */
    static final class c extends AbstractC3293z implements Function1 {
        c() {
            super(1);
        }

        public final CharSequence a(int i8) {
            return C1014e0.this.f(i8) + ": " + C1014e0.this.h(i8).a();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    /* renamed from: C6.e0$d */
    /* loaded from: classes5.dex */
    static final class d extends AbstractC3293z implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final A6.f[] invoke() {
            ArrayList arrayList;
            y6.b[] b9;
            C c8 = C1014e0.this.f1045b;
            if (c8 != null && (b9 = c8.b()) != null) {
                arrayList = new ArrayList(b9.length);
                for (y6.b bVar : b9) {
                    arrayList.add(bVar.a());
                }
            } else {
                arrayList = null;
            }
            return AbstractC1010c0.b(arrayList);
        }
    }

    public C1014e0(String serialName, C c8, int i8) {
        AbstractC3292y.i(serialName, "serialName");
        this.f1044a = serialName;
        this.f1045b = c8;
        this.f1046c = i8;
        this.f1047d = -1;
        String[] strArr = new String[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            strArr[i9] = "[UNINITIALIZED]";
        }
        this.f1048e = strArr;
        int i10 = this.f1046c;
        this.f1049f = new List[i10];
        this.f1051h = new boolean[i10];
        this.f1052i = R5.Q.h();
        Q5.o oVar = Q5.o.f8804b;
        this.f1053j = Q5.l.a(oVar, new b());
        this.f1054k = Q5.l.a(oVar, new d());
        this.f1055l = Q5.l.a(oVar, new a());
    }

    public static /* synthetic */ void l(C1014e0 c1014e0, String str, boolean z8, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 2) != 0) {
                z8 = false;
            }
            c1014e0.k(str, z8);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
    }

    private final Map m() {
        HashMap hashMap = new HashMap();
        int length = this.f1048e.length;
        for (int i8 = 0; i8 < length; i8++) {
            hashMap.put(this.f1048e[i8], Integer.valueOf(i8));
        }
        return hashMap;
    }

    private final y6.b[] n() {
        return (y6.b[]) this.f1053j.getValue();
    }

    private final int p() {
        return ((Number) this.f1055l.getValue()).intValue();
    }

    @Override // A6.f
    public String a() {
        return this.f1044a;
    }

    @Override // C6.InterfaceC1022l
    public Set b() {
        return this.f1052i.keySet();
    }

    @Override // A6.f
    public boolean c() {
        return f.a.c(this);
    }

    @Override // A6.f
    public int d(String name) {
        AbstractC3292y.i(name, "name");
        Integer num = (Integer) this.f1052i.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // A6.f
    public final int e() {
        return this.f1046c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1014e0) {
            A6.f fVar = (A6.f) obj;
            if (AbstractC3292y.d(a(), fVar.a()) && Arrays.equals(o(), ((C1014e0) obj).o()) && e() == fVar.e()) {
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
        return this.f1048e[i8];
    }

    @Override // A6.f
    public List g(int i8) {
        List list = this.f1049f[i8];
        if (list == null) {
            return AbstractC1435t.m();
        }
        return list;
    }

    @Override // A6.f
    public List getAnnotations() {
        List list = this.f1050g;
        if (list == null) {
            return AbstractC1435t.m();
        }
        return list;
    }

    @Override // A6.f
    public A6.j getKind() {
        return k.a.f288a;
    }

    @Override // A6.f
    public A6.f h(int i8) {
        return n()[i8].a();
    }

    public int hashCode() {
        return p();
    }

    @Override // A6.f
    public boolean i(int i8) {
        return this.f1051h[i8];
    }

    @Override // A6.f
    public boolean isInline() {
        return f.a.b(this);
    }

    public final void k(String name, boolean z8) {
        AbstractC3292y.i(name, "name");
        String[] strArr = this.f1048e;
        int i8 = this.f1047d + 1;
        this.f1047d = i8;
        strArr[i8] = name;
        this.f1051h[i8] = z8;
        this.f1049f[i8] = null;
        if (i8 == this.f1046c - 1) {
            this.f1052i = m();
        }
    }

    public final A6.f[] o() {
        return (A6.f[]) this.f1054k.getValue();
    }

    public final void q(Annotation annotation) {
        AbstractC3292y.i(annotation, "annotation");
        List list = this.f1049f[this.f1047d];
        if (list == null) {
            list = new ArrayList(1);
            this.f1049f[this.f1047d] = list;
        }
        list.add(annotation);
    }

    public final void r(Annotation a9) {
        AbstractC3292y.i(a9, "a");
        if (this.f1050g == null) {
            this.f1050g = new ArrayList(1);
        }
        List list = this.f1050g;
        AbstractC3292y.f(list);
        list.add(a9);
    }

    public String toString() {
        return AbstractC1435t.w0(i6.m.s(0, this.f1046c), ", ", a() + '(', ")", 0, null, new c(), 24, null);
    }

    public /* synthetic */ C1014e0(String str, C c8, int i8, int i9, AbstractC3284p abstractC3284p) {
        this(str, (i9 & 2) != 0 ? null : c8, i8);
    }
}
