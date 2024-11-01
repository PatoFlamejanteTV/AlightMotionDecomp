package D6;

import E6.C1062u;
import E6.F;
import E6.G;
import E6.N;
import E6.Q;
import E6.T;
import E6.U;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import y6.InterfaceC4248a;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: d, reason: collision with root package name */
    public static final C0025a f1444d = new C0025a(null);

    /* renamed from: a, reason: collision with root package name */
    private final f f1445a;

    /* renamed from: b, reason: collision with root package name */
    private final F6.b f1446b;

    /* renamed from: c, reason: collision with root package name */
    private final C1062u f1447c;

    /* renamed from: D6.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0025a extends a {
        public /* synthetic */ C0025a(AbstractC3284p abstractC3284p) {
            this();
        }

        private C0025a() {
            super(new f(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, 32767, null), F6.c.a(), null);
        }
    }

    public /* synthetic */ a(f fVar, F6.b bVar, AbstractC3284p abstractC3284p) {
        this(fVar, bVar);
    }

    public final Object a(InterfaceC4248a deserializer, i element) {
        AbstractC3292y.i(deserializer, "deserializer");
        AbstractC3292y.i(element, "element");
        return T.a(this, element, deserializer);
    }

    public final Object b(InterfaceC4248a deserializer, String string) {
        AbstractC3292y.i(deserializer, "deserializer");
        AbstractC3292y.i(string, "string");
        Q q8 = new Q(string);
        Object w8 = new N(this, U.f2050c, q8, deserializer.a(), null).w(deserializer);
        q8.v();
        return w8;
    }

    public final String c(y6.i serializer, Object obj) {
        AbstractC3292y.i(serializer, "serializer");
        G g8 = new G();
        try {
            F.a(this, g8, serializer, obj);
            return g8.toString();
        } finally {
            g8.g();
        }
    }

    public final f d() {
        return this.f1445a;
    }

    public F6.b e() {
        return this.f1446b;
    }

    public final C1062u f() {
        return this.f1447c;
    }

    private a(f fVar, F6.b bVar) {
        this.f1445a = fVar;
        this.f1446b = bVar;
        this.f1447c = new C1062u();
    }
}
