package t;

import java.util.List;
import t.k;

/* loaded from: classes3.dex */
public abstract class u {

    /* loaded from: classes3.dex */
    public static abstract class a {
        public abstract u a();

        public abstract a b(o oVar);

        public abstract a c(List list);

        abstract a d(Integer num);

        abstract a e(String str);

        public abstract a f(x xVar);

        public abstract a g(long j8);

        public abstract a h(long j8);

        public a i(int i8) {
            return d(Integer.valueOf(i8));
        }

        public a j(String str) {
            return e(str);
        }
    }

    public static a a() {
        return new k.b();
    }

    public abstract o b();

    public abstract List c();

    public abstract Integer d();

    public abstract String e();

    public abstract x f();

    public abstract long g();

    public abstract long h();
}
