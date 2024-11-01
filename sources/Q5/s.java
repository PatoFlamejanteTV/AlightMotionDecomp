package Q5;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class s implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f8810b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Object f8811a;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public static final class b implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f8812a;

        public b(Throwable exception) {
            AbstractC3292y.i(exception, "exception");
            this.f8812a = exception;
        }

        public boolean equals(Object obj) {
            if ((obj instanceof b) && AbstractC3292y.d(this.f8812a, ((b) obj).f8812a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f8812a.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f8812a + ')';
        }
    }

    private /* synthetic */ s(Object obj) {
        this.f8811a = obj;
    }

    public static final /* synthetic */ s a(Object obj) {
        return new s(obj);
    }

    public static boolean c(Object obj, Object obj2) {
        if (!(obj2 instanceof s) || !AbstractC3292y.d(obj, ((s) obj2).j())) {
            return false;
        }
        return true;
    }

    public static final boolean d(Object obj, Object obj2) {
        return AbstractC3292y.d(obj, obj2);
    }

    public static final Throwable e(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f8812a;
        }
        return null;
    }

    public static int f(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean g(Object obj) {
        return obj instanceof b;
    }

    public static final boolean h(Object obj) {
        return !(obj instanceof b);
    }

    public static String i(Object obj) {
        if (obj instanceof b) {
            return obj.toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f8811a, obj);
    }

    public int hashCode() {
        return f(this.f8811a);
    }

    public final /* synthetic */ Object j() {
        return this.f8811a;
    }

    public String toString() {
        return i(this.f8811a);
    }

    public static Object b(Object obj) {
        return obj;
    }
}
