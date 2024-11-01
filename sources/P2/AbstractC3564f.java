package p2;

import Q5.x;
import R5.AbstractC1435t;
import R5.Q;
import R5.a0;
import g3.EnumC2906e;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n2.C3399b;

/* renamed from: p2.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3564f {

    /* renamed from: a, reason: collision with root package name */
    public static final a f36121a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Set f36122b = a0.i(4, 9, 14);

    /* renamed from: c, reason: collision with root package name */
    private static final Map f36123c = Q.k(x.a(14, a0.i(4, 11)), x.a(15, a0.i(4, 11)), x.a(16, a0.i(4, 9, 14)), x.a(19, a0.i(4, 9, 14, 19)));

    /* renamed from: p2.f$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final Set a(int i8) {
            Set set = (Set) AbstractC3564f.f36123c.get(Integer.valueOf(i8));
            if (set == null) {
                return AbstractC3564f.f36122b;
            }
            return set;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: p2.f$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3564f {

        /* renamed from: j, reason: collision with root package name */
        private static final a f36124j = new a(null);

        /* renamed from: k, reason: collision with root package name */
        private static final Set f36125k = a0.i('-', ' ');

        /* renamed from: d, reason: collision with root package name */
        private final String f36126d;

        /* renamed from: e, reason: collision with root package name */
        private final String f36127e;

        /* renamed from: f, reason: collision with root package name */
        private final int f36128f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f36129g;

        /* renamed from: h, reason: collision with root package name */
        private final C3559a f36130h;

        /* renamed from: i, reason: collision with root package name */
        private final boolean f36131i;

        /* renamed from: p2.f$b$a */
        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String denormalized) {
            super(null);
            AbstractC3292y.i(denormalized, "denormalized");
            this.f36126d = denormalized;
            StringBuilder sb = new StringBuilder();
            for (int i8 = 0; i8 < denormalized.length(); i8++) {
                char charAt = denormalized.charAt(i8);
                if (!f36125k.contains(Character.valueOf(charAt))) {
                    sb.append(charAt);
                }
            }
            String sb2 = sb.toString();
            AbstractC3292y.h(sb2, "toString(...)");
            this.f36127e = sb2;
            int length = sb2.length();
            this.f36128f = length;
            this.f36129g = length == 19;
            this.f36130h = C3559a.f36102b.a(sb2);
            this.f36131i = C3399b.f35318a.a(sb2);
        }

        private final String c(int i8) {
            Set a9 = AbstractC3564f.f36121a.a(i8);
            String U02 = l6.n.U0(this.f36127e, i8);
            int size = a9.size() + 1;
            String[] strArr = new String[size];
            int length = U02.length();
            int i9 = 0;
            int i10 = 0;
            for (Object obj : AbstractC1435t.O0(AbstractC1435t.W0(a9))) {
                int i11 = i9 + 1;
                if (i9 < 0) {
                    AbstractC1435t.w();
                }
                int intValue = ((Number) obj).intValue() - i9;
                if (length > intValue) {
                    String substring = U02.substring(i10, intValue);
                    AbstractC3292y.h(substring, "substring(...)");
                    strArr[i9] = substring;
                    i10 = intValue;
                }
                i9 = i11;
            }
            int i12 = 0;
            while (true) {
                if (i12 < size) {
                    if (strArr[i12] == null) {
                        break;
                    }
                    i12++;
                } else {
                    i12 = -1;
                    break;
                }
            }
            Integer valueOf = Integer.valueOf(i12);
            if (valueOf.intValue() == -1) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue2 = valueOf.intValue();
                String substring2 = U02.substring(i10);
                AbstractC3292y.h(substring2, "substring(...)");
                strArr[intValue2] = substring2;
            }
            ArrayList arrayList = new ArrayList();
            for (int i13 = 0; i13 < size; i13++) {
                String str = strArr[i13];
                if (str == null) {
                    break;
                }
                arrayList.add(str);
            }
            return AbstractC1435t.w0(arrayList, " ", null, null, 0, null, null, 62, null);
        }

        public final C3559a d() {
            return this.f36130h;
        }

        public final String e(int i8) {
            return c(i8);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && AbstractC3292y.d(this.f36126d, ((b) obj).f36126d)) {
                return true;
            }
            return false;
        }

        public final int f() {
            return this.f36128f;
        }

        public final String g() {
            return this.f36127e;
        }

        public final boolean h() {
            return this.f36129g;
        }

        public int hashCode() {
            return this.f36126d.hashCode();
        }

        public final boolean i(int i8) {
            if (this.f36127e.length() != i8 && (!l6.n.T(this.f36127e))) {
                return true;
            }
            return false;
        }

        public final boolean j() {
            if ((!l6.n.T(this.f36127e)) && AbstractC1435t.m0(EnumC2906e.f32115m.c(this.f36127e)) != EnumC2906e.f32125w) {
                return true;
            }
            return false;
        }

        public final boolean k() {
            return this.f36131i;
        }

        public final c l(int i8) {
            if (i8 >= 14 && this.f36127e.length() == i8 && this.f36131i) {
                return new c(this.f36127e);
            }
            return null;
        }

        public String toString() {
            return "Unvalidated(denormalized=" + this.f36126d + ")";
        }
    }

    /* renamed from: p2.f$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3564f {

        /* renamed from: d, reason: collision with root package name */
        private final String f36132d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String value) {
            super(null);
            AbstractC3292y.i(value, "value");
            this.f36132d = value;
        }

        public final String c() {
            return this.f36132d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && AbstractC3292y.d(this.f36132d, ((c) obj).f36132d)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f36132d.hashCode();
        }

        public String toString() {
            return "Validated(value=" + this.f36132d + ")";
        }
    }

    public /* synthetic */ AbstractC3564f(AbstractC3284p abstractC3284p) {
        this();
    }

    private AbstractC3564f() {
    }
}
