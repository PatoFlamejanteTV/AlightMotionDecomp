package E6;

import A6.j;
import R5.a0;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class H extends AbstractC1045c {

    /* renamed from: f, reason: collision with root package name */
    private final D6.v f1999f;

    /* renamed from: g, reason: collision with root package name */
    private final String f2000g;

    /* renamed from: h, reason: collision with root package name */
    private final A6.f f2001h;

    /* renamed from: i, reason: collision with root package name */
    private int f2002i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f2003j;

    public /* synthetic */ H(D6.a aVar, D6.v vVar, String str, A6.f fVar, int i8, AbstractC3284p abstractC3284p) {
        this(aVar, vVar, (i8 & 4) != 0 ? null : str, (i8 & 8) != 0 ? null : fVar);
    }

    private final boolean u0(A6.f fVar, int i8) {
        boolean z8;
        if (!d().d().h() && !fVar.i(i8) && fVar.h(i8).c()) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f2003j = z8;
        return z8;
    }

    private final boolean v0(A6.f fVar, int i8, String str) {
        D6.x xVar;
        D6.a d8 = d();
        A6.f h8 = fVar.h(i8);
        if (!h8.c() && (e0(str) instanceof D6.t)) {
            return true;
        }
        if (AbstractC3292y.d(h8.getKind(), j.b.f287a) && (!h8.c() || !(e0(str) instanceof D6.t))) {
            D6.i e02 = e0(str);
            String str2 = null;
            if (e02 instanceof D6.x) {
                xVar = (D6.x) e02;
            } else {
                xVar = null;
            }
            if (xVar != null) {
                str2 = D6.j.d(xVar);
            }
            if (str2 != null && C.h(h8, d8, str2) == -3) {
                return true;
            }
        }
        return false;
    }

    @Override // E6.AbstractC1045c, B6.c
    public void a(A6.f descriptor) {
        Set set;
        Set m8;
        AbstractC3292y.i(descriptor, "descriptor");
        if (!this.f2064e.i() && !(descriptor.getKind() instanceof A6.d)) {
            C.l(descriptor, d());
            if (!this.f2064e.m()) {
                m8 = C6.I.a(descriptor);
            } else {
                Set a9 = C6.I.a(descriptor);
                Map map = (Map) D6.z.a(d()).a(descriptor, C.f());
                if (map != null) {
                    set = map.keySet();
                } else {
                    set = null;
                }
                if (set == null) {
                    set = a0.f();
                }
                m8 = a0.m(a9, set);
            }
            for (String str : s0().keySet()) {
                if (!m8.contains(str) && !AbstractC3292y.d(str, this.f2000g)) {
                    throw B.f(str, s0().toString());
                }
            }
        }
    }

    @Override // C6.V
    protected String a0(A6.f descriptor, int i8) {
        Object obj;
        AbstractC3292y.i(descriptor, "descriptor");
        C.l(descriptor, d());
        String f8 = descriptor.f(i8);
        if (!this.f2064e.m()) {
            return f8;
        }
        if (s0().keySet().contains(f8)) {
            return f8;
        }
        Map e8 = C.e(d(), descriptor);
        Iterator<T> it = s0().keySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                Integer num = (Integer) e8.get((String) obj);
                if (num != null && num.intValue() == i8) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        String str = (String) obj;
        if (str != null) {
            return str;
        }
        return f8;
    }

    @Override // E6.AbstractC1045c, B6.e
    public B6.c c(A6.f descriptor) {
        AbstractC3292y.i(descriptor, "descriptor");
        if (descriptor == this.f2001h) {
            D6.a d8 = d();
            D6.i f02 = f0();
            A6.f fVar = this.f2001h;
            if (f02 instanceof D6.v) {
                return new H(d8, (D6.v) f02, this.f2000g, fVar);
            }
            throw B.d(-1, "Expected " + kotlin.jvm.internal.U.b(D6.v.class) + " as the serialized body of " + fVar.a() + ", but had " + kotlin.jvm.internal.U.b(f02.getClass()));
        }
        return super.c(descriptor);
    }

    @Override // E6.AbstractC1045c
    protected D6.i e0(String tag) {
        AbstractC3292y.i(tag, "tag");
        return (D6.i) R5.Q.i(s0(), tag);
    }

    @Override // E6.AbstractC1045c
    /* renamed from: w0 */
    public D6.v s0() {
        return this.f1999f;
    }

    @Override // E6.AbstractC1045c, B6.e
    public boolean x() {
        if (!this.f2003j && super.x()) {
            return true;
        }
        return false;
    }

    @Override // B6.c
    public int y(A6.f descriptor) {
        AbstractC3292y.i(descriptor, "descriptor");
        while (this.f2002i < descriptor.e()) {
            int i8 = this.f2002i;
            this.f2002i = i8 + 1;
            String V8 = V(descriptor, i8);
            int i9 = this.f2002i - 1;
            this.f2003j = false;
            if (s0().containsKey(V8) || u0(descriptor, i9)) {
                if (!this.f2064e.e() || !v0(descriptor, i9, V8)) {
                    return i9;
                }
            }
        }
        return -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(D6.a json, D6.v value, String str, A6.f fVar) {
        super(json, value, null);
        AbstractC3292y.i(json, "json");
        AbstractC3292y.i(value, "value");
        this.f1999f = value;
        this.f2000g = str;
        this.f2001h = fVar;
    }
}
