package t;

import android.util.SparseArray;
import t.f;

/* loaded from: classes3.dex */
public abstract class p {

    /* loaded from: classes3.dex */
    public static abstract class a {
        public abstract p a();

        public abstract a b(s sVar);

        public abstract a c(b bVar);
    }

    /* loaded from: classes3.dex */
    public enum b {
        NOT_SET(0),
        EVENT_OVERRIDE(5);


        /* renamed from: d, reason: collision with root package name */
        private static final SparseArray f39368d;

        /* renamed from: a, reason: collision with root package name */
        private final int f39370a;

        static {
            b bVar = NOT_SET;
            b bVar2 = EVENT_OVERRIDE;
            SparseArray sparseArray = new SparseArray();
            f39368d = sparseArray;
            sparseArray.put(0, bVar);
            sparseArray.put(5, bVar2);
        }

        b(int i8) {
            this.f39370a = i8;
        }
    }

    public static a a() {
        return new f.b();
    }

    public abstract s b();

    public abstract b c();
}
