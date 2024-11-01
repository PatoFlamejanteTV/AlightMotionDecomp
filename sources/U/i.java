package u;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import u.C4069b;

/* loaded from: classes3.dex */
public abstract class i {

    /* loaded from: classes3.dex */
    public static abstract class a {
        public final a a(String str, int i8) {
            e().put(str, String.valueOf(i8));
            return this;
        }

        public final a b(String str, long j8) {
            e().put(str, String.valueOf(j8));
            return this;
        }

        public final a c(String str, String str2) {
            e().put(str, str2);
            return this;
        }

        public abstract i d();

        protected abstract Map e();

        protected abstract a f(Map map);

        public abstract a g(Integer num);

        public abstract a h(h hVar);

        public abstract a i(long j8);

        public abstract a j(byte[] bArr);

        public abstract a k(byte[] bArr);

        public abstract a l(Integer num);

        public abstract a m(String str);

        public abstract a n(String str);

        public abstract a o(long j8);
    }

    public static a a() {
        return new C4069b.C0896b().f(new HashMap());
    }

    public final String b(String str) {
        String str2 = (String) c().get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Map c();

    public abstract Integer d();

    public abstract h e();

    public abstract long f();

    public abstract byte[] g();

    public abstract byte[] h();

    public final int i(String str) {
        String str2 = (String) c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final long j(String str) {
        String str2 = (String) c().get(str);
        if (str2 == null) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }

    public final Map k() {
        return DesugarCollections.unmodifiableMap(c());
    }

    public abstract Integer l();

    public abstract String m();

    public abstract String n();

    public abstract long o();

    public a p() {
        return new C4069b.C0896b().n(n()).g(d()).l(l()).m(m()).j(g()).k(h()).h(e()).i(f()).o(o()).f(new HashMap(c()));
    }
}
