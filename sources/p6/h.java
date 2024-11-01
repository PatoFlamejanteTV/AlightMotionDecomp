package p6;

import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final b f36417b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    private static final c f36418c = new c();

    /* renamed from: a, reason: collision with root package name */
    private final Object f36419a;

    /* loaded from: classes5.dex */
    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f36420a;

        public a(Throwable th) {
            this.f36420a = th;
        }

        public boolean equals(Object obj) {
            if ((obj instanceof a) && AbstractC3292y.d(this.f36420a, ((a) obj).f36420a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            Throwable th = this.f36420a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // p6.h.c
        public String toString() {
            return "Closed(" + this.f36420a + ')';
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public final Object a(Throwable th) {
            return h.c(new a(th));
        }

        public final Object b() {
            return h.c(h.f36418c);
        }

        public final Object c(Object obj) {
            return h.c(obj);
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    private /* synthetic */ h(Object obj) {
        this.f36419a = obj;
    }

    public static final /* synthetic */ h b(Object obj) {
        return new h(obj);
    }

    public static boolean d(Object obj, Object obj2) {
        if (!(obj2 instanceof h) || !AbstractC3292y.d(obj, ((h) obj2).k())) {
            return false;
        }
        return true;
    }

    public static final Throwable e(Object obj) {
        a aVar;
        if (obj instanceof a) {
            aVar = (a) obj;
        } else {
            aVar = null;
        }
        if (aVar == null) {
            return null;
        }
        return aVar.f36420a;
    }

    public static final Object f(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean h(Object obj) {
        return obj instanceof a;
    }

    public static final boolean i(Object obj) {
        return !(obj instanceof c);
    }

    public static String j(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f36419a, obj);
    }

    public int hashCode() {
        return g(this.f36419a);
    }

    public final /* synthetic */ Object k() {
        return this.f36419a;
    }

    public String toString() {
        return j(this.f36419a);
    }

    public static Object c(Object obj) {
        return obj;
    }
}
