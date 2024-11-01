package x0;

import j$.util.Objects;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import x0.AbstractC4193p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class J extends AbstractC4193p {

    /* renamed from: h, reason: collision with root package name */
    static final AbstractC4193p f40829h = new J(null, new Object[0], 0);

    /* renamed from: e, reason: collision with root package name */
    private final transient Object f40830e;

    /* renamed from: f, reason: collision with root package name */
    final transient Object[] f40831f;

    /* renamed from: g, reason: collision with root package name */
    private final transient int f40832g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class a extends r {

        /* renamed from: c, reason: collision with root package name */
        private final transient AbstractC4193p f40833c;

        /* renamed from: d, reason: collision with root package name */
        private final transient Object[] f40834d;

        /* renamed from: e, reason: collision with root package name */
        private final transient int f40835e;

        /* renamed from: f, reason: collision with root package name */
        private final transient int f40836f;

        /* renamed from: x0.J$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0927a extends AbstractC4192o {
            C0927a() {
            }

            @Override // java.util.List
            /* renamed from: D, reason: merged with bridge method [inline-methods] */
            public Map.Entry get(int i8) {
                w0.h.g(i8, a.this.f40836f);
                int i9 = i8 * 2;
                Object obj = a.this.f40834d[a.this.f40835e + i9];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.f40834d[i9 + (a.this.f40835e ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // x0.AbstractC4191n
            public boolean j() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f40836f;
            }
        }

        a(AbstractC4193p abstractC4193p, Object[] objArr, int i8, int i9) {
            this.f40833c = abstractC4193p;
            this.f40834d = objArr;
            this.f40835e = i8;
            this.f40836f = i9;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public S iterator() {
            return k().iterator();
        }

        @Override // x0.AbstractC4191n
        int c(Object[] objArr, int i8) {
            return k().c(objArr, i8);
        }

        @Override // x0.AbstractC4191n, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.f40833c.get(key))) {
                return false;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // x0.AbstractC4191n
        public boolean j() {
            return true;
        }

        @Override // x0.r
        AbstractC4192o q() {
            return new C0927a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f40836f;
        }
    }

    /* loaded from: classes3.dex */
    static final class b extends r {

        /* renamed from: c, reason: collision with root package name */
        private final transient AbstractC4193p f40838c;

        /* renamed from: d, reason: collision with root package name */
        private final transient AbstractC4192o f40839d;

        b(AbstractC4193p abstractC4193p, AbstractC4192o abstractC4192o) {
            this.f40838c = abstractC4193p;
            this.f40839d = abstractC4192o;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public S iterator() {
            return k().iterator();
        }

        @Override // x0.AbstractC4191n
        int c(Object[] objArr, int i8) {
            return k().c(objArr, i8);
        }

        @Override // x0.AbstractC4191n, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (this.f40838c.get(obj) != null) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // x0.AbstractC4191n
        public boolean j() {
            return true;
        }

        @Override // x0.r
        public AbstractC4192o k() {
            return this.f40839d;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f40838c.size();
        }
    }

    /* loaded from: classes3.dex */
    static final class c extends AbstractC4192o {

        /* renamed from: c, reason: collision with root package name */
        private final transient Object[] f40840c;

        /* renamed from: d, reason: collision with root package name */
        private final transient int f40841d;

        /* renamed from: e, reason: collision with root package name */
        private final transient int f40842e;

        c(Object[] objArr, int i8, int i9) {
            this.f40840c = objArr;
            this.f40841d = i8;
            this.f40842e = i9;
        }

        @Override // java.util.List
        public Object get(int i8) {
            w0.h.g(i8, this.f40842e);
            Object obj = this.f40840c[(i8 * 2) + this.f40841d];
            Objects.requireNonNull(obj);
            return obj;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // x0.AbstractC4191n
        public boolean j() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f40842e;
        }
    }

    private J(Object obj, Object[] objArr, int i8) {
        this.f40830e = obj;
        this.f40831f = objArr;
        this.f40832g = i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static J i(int i8, Object[] objArr, AbstractC4193p.a aVar) {
        if (i8 == 0) {
            return (J) f40829h;
        }
        if (i8 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            AbstractC4184g.a(obj, obj2);
            return new J(null, objArr, 1);
        }
        w0.h.k(i8, objArr.length >> 1);
        Object j8 = j(objArr, i8, r.m(i8), 0);
        if (j8 instanceof Object[]) {
            Object[] objArr2 = (Object[]) j8;
            AbstractC4193p.a.C0930a c0930a = (AbstractC4193p.a.C0930a) objArr2[2];
            if (aVar != null) {
                aVar.f40913e = c0930a;
                Object obj3 = objArr2[0];
                int intValue = ((Integer) objArr2[1]).intValue();
                objArr = Arrays.copyOf(objArr, intValue * 2);
                j8 = obj3;
                i8 = intValue;
            } else {
                throw c0930a.a();
            }
        }
        return new J(j8, objArr, i8);
    }

    private static Object j(Object[] objArr, int i8, int i9, int i10) {
        AbstractC4193p.a.C0930a c0930a = null;
        if (i8 == 1) {
            Object obj = objArr[i10];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i10 ^ 1];
            Objects.requireNonNull(obj2);
            AbstractC4184g.a(obj, obj2);
            return null;
        }
        int i11 = i9 - 1;
        int i12 = -1;
        if (i9 <= 128) {
            byte[] bArr = new byte[i9];
            Arrays.fill(bArr, (byte) -1);
            int i13 = 0;
            for (int i14 = 0; i14 < i8; i14++) {
                int i15 = (i14 * 2) + i10;
                int i16 = (i13 * 2) + i10;
                Object obj3 = objArr[i15];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i15 ^ 1];
                Objects.requireNonNull(obj4);
                AbstractC4184g.a(obj3, obj4);
                int b9 = AbstractC4190m.b(obj3.hashCode());
                while (true) {
                    int i17 = b9 & i11;
                    int i18 = bArr[i17] & 255;
                    if (i18 == 255) {
                        bArr[i17] = (byte) i16;
                        if (i13 < i14) {
                            objArr[i16] = obj3;
                            objArr[i16 ^ 1] = obj4;
                        }
                        i13++;
                    } else {
                        if (obj3.equals(objArr[i18])) {
                            int i19 = i18 ^ 1;
                            Object obj5 = objArr[i19];
                            Objects.requireNonNull(obj5);
                            c0930a = new AbstractC4193p.a.C0930a(obj3, obj4, obj5);
                            objArr[i19] = obj4;
                            break;
                        }
                        b9 = i17 + 1;
                    }
                }
            }
            if (i13 != i8) {
                return new Object[]{bArr, Integer.valueOf(i13), c0930a};
            }
            return bArr;
        }
        if (i9 <= 32768) {
            short[] sArr = new short[i9];
            Arrays.fill(sArr, (short) -1);
            int i20 = 0;
            for (int i21 = 0; i21 < i8; i21++) {
                int i22 = (i21 * 2) + i10;
                int i23 = (i20 * 2) + i10;
                Object obj6 = objArr[i22];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i22 ^ 1];
                Objects.requireNonNull(obj7);
                AbstractC4184g.a(obj6, obj7);
                int b10 = AbstractC4190m.b(obj6.hashCode());
                while (true) {
                    int i24 = b10 & i11;
                    int i25 = sArr[i24] & 65535;
                    if (i25 == 65535) {
                        sArr[i24] = (short) i23;
                        if (i20 < i21) {
                            objArr[i23] = obj6;
                            objArr[i23 ^ 1] = obj7;
                        }
                        i20++;
                    } else {
                        if (obj6.equals(objArr[i25])) {
                            int i26 = i25 ^ 1;
                            Object obj8 = objArr[i26];
                            Objects.requireNonNull(obj8);
                            c0930a = new AbstractC4193p.a.C0930a(obj6, obj7, obj8);
                            objArr[i26] = obj7;
                            break;
                        }
                        b10 = i24 + 1;
                    }
                }
            }
            if (i20 != i8) {
                return new Object[]{sArr, Integer.valueOf(i20), c0930a};
            }
            return sArr;
        }
        int[] iArr = new int[i9];
        Arrays.fill(iArr, -1);
        int i27 = 0;
        int i28 = 0;
        while (i27 < i8) {
            int i29 = (i27 * 2) + i10;
            int i30 = (i28 * 2) + i10;
            Object obj9 = objArr[i29];
            Objects.requireNonNull(obj9);
            Object obj10 = objArr[i29 ^ 1];
            Objects.requireNonNull(obj10);
            AbstractC4184g.a(obj9, obj10);
            int b11 = AbstractC4190m.b(obj9.hashCode());
            while (true) {
                int i31 = b11 & i11;
                int i32 = iArr[i31];
                if (i32 == i12) {
                    iArr[i31] = i30;
                    if (i28 < i27) {
                        objArr[i30] = obj9;
                        objArr[i30 ^ 1] = obj10;
                    }
                    i28++;
                } else {
                    if (obj9.equals(objArr[i32])) {
                        int i33 = i32 ^ 1;
                        Object obj11 = objArr[i33];
                        Objects.requireNonNull(obj11);
                        c0930a = new AbstractC4193p.a.C0930a(obj9, obj10, obj11);
                        objArr[i33] = obj10;
                        break;
                    }
                    b11 = i31 + 1;
                    i12 = -1;
                }
            }
            i27++;
            i12 = -1;
        }
        if (i28 != i8) {
            return new Object[]{iArr, Integer.valueOf(i28), c0930a};
        }
        return iArr;
    }

    static Object k(Object obj, Object[] objArr, int i8, int i9, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i8 == 1) {
            Object obj3 = objArr[i9];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i9 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int b9 = AbstractC4190m.b(obj2.hashCode());
            while (true) {
                int i10 = b9 & length;
                int i11 = bArr[i10] & 255;
                if (i11 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i11])) {
                    return objArr[i11 ^ 1];
                }
                b9 = i10 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int b10 = AbstractC4190m.b(obj2.hashCode());
            while (true) {
                int i12 = b10 & length2;
                int i13 = sArr[i12] & 65535;
                if (i13 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i13])) {
                    return objArr[i13 ^ 1];
                }
                b10 = i12 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int b11 = AbstractC4190m.b(obj2.hashCode());
            while (true) {
                int i14 = b11 & length3;
                int i15 = iArr[i14];
                if (i15 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i15])) {
                    return objArr[i15 ^ 1];
                }
                b11 = i14 + 1;
            }
        }
    }

    @Override // x0.AbstractC4193p
    r a() {
        return new a(this, this.f40831f, 0, this.f40832g);
    }

    @Override // x0.AbstractC4193p
    r b() {
        return new b(this, new c(this.f40831f, 0, this.f40832g));
    }

    @Override // x0.AbstractC4193p
    AbstractC4191n c() {
        return new c(this.f40831f, 1, this.f40832g);
    }

    @Override // x0.AbstractC4193p, java.util.Map
    public Object get(Object obj) {
        Object k8 = k(this.f40830e, this.f40831f, this.f40832g, 0, obj);
        if (k8 == null) {
            return null;
        }
        return k8;
    }

    @Override // java.util.Map
    public int size() {
        return this.f40832g;
    }
}
