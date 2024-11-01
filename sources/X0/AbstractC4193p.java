package x0;

import j$.util.Map;
import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import x0.AbstractC4191n;

/* renamed from: x0.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4193p implements Map, Serializable, j$.util.Map {

    /* renamed from: d, reason: collision with root package name */
    static final Map.Entry[] f40905d = new Map.Entry[0];

    /* renamed from: a, reason: collision with root package name */
    private transient r f40906a;

    /* renamed from: b, reason: collision with root package name */
    private transient r f40907b;

    /* renamed from: c, reason: collision with root package name */
    private transient AbstractC4191n f40908c;

    /* renamed from: x0.p$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        Comparator f40909a;

        /* renamed from: b, reason: collision with root package name */
        Object[] f40910b;

        /* renamed from: c, reason: collision with root package name */
        int f40911c = 0;

        /* renamed from: d, reason: collision with root package name */
        boolean f40912d = false;

        /* renamed from: e, reason: collision with root package name */
        C0930a f40913e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: x0.p$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0930a {

            /* renamed from: a, reason: collision with root package name */
            private final Object f40914a;

            /* renamed from: b, reason: collision with root package name */
            private final Object f40915b;

            /* renamed from: c, reason: collision with root package name */
            private final Object f40916c;

            /* JADX INFO: Access modifiers changed from: package-private */
            public C0930a(Object obj, Object obj2, Object obj3) {
                this.f40914a = obj;
                this.f40915b = obj2;
                this.f40916c = obj3;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public IllegalArgumentException a() {
                String valueOf = String.valueOf(this.f40914a);
                String valueOf2 = String.valueOf(this.f40915b);
                String valueOf3 = String.valueOf(this.f40914a);
                String valueOf4 = String.valueOf(this.f40916c);
                StringBuilder sb = new StringBuilder(valueOf.length() + 39 + valueOf2.length() + valueOf3.length() + valueOf4.length());
                sb.append("Multiple entries with same key: ");
                sb.append(valueOf);
                sb.append("=");
                sb.append(valueOf2);
                sb.append(" and ");
                sb.append(valueOf3);
                sb.append("=");
                sb.append(valueOf4);
                return new IllegalArgumentException(sb.toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i8) {
            this.f40910b = new Object[i8 * 2];
        }

        private AbstractC4193p a(boolean z8) {
            Object[] objArr;
            C0930a c0930a;
            C0930a c0930a2;
            if (z8 && (c0930a2 = this.f40913e) != null) {
                throw c0930a2.a();
            }
            int i8 = this.f40911c;
            if (this.f40909a == null) {
                objArr = this.f40910b;
            } else {
                if (this.f40912d) {
                    this.f40910b = Arrays.copyOf(this.f40910b, i8 * 2);
                }
                objArr = this.f40910b;
                if (!z8) {
                    objArr = d(objArr, this.f40911c);
                    if (objArr.length < this.f40910b.length) {
                        i8 = objArr.length >>> 1;
                    }
                }
                f(objArr, i8, this.f40909a);
            }
            this.f40912d = true;
            J i9 = J.i(i8, objArr, this);
            if (z8 && (c0930a = this.f40913e) != null) {
                throw c0930a.a();
            }
            return i9;
        }

        private void c(int i8) {
            int i9 = i8 * 2;
            Object[] objArr = this.f40910b;
            if (i9 > objArr.length) {
                this.f40910b = Arrays.copyOf(objArr, AbstractC4191n.b.a(objArr.length, i9));
                this.f40912d = false;
            }
        }

        private Object[] d(Object[] objArr, int i8) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i9 = i8 - 1; i9 >= 0; i9--) {
                Object obj = objArr[i9 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i9);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i8 - bitSet.cardinality()) * 2];
            int i10 = 0;
            int i11 = 0;
            while (i10 < i8 * 2) {
                if (bitSet.get(i10 >>> 1)) {
                    i10 += 2;
                } else {
                    int i12 = i11 + 1;
                    int i13 = i10 + 1;
                    Object obj2 = objArr[i10];
                    Objects.requireNonNull(obj2);
                    objArr2[i11] = obj2;
                    i11 += 2;
                    i10 += 2;
                    Object obj3 = objArr[i13];
                    Objects.requireNonNull(obj3);
                    objArr2[i12] = obj3;
                }
            }
            return objArr2;
        }

        static void f(Object[] objArr, int i8, Comparator comparator) {
            Map.Entry[] entryArr = new Map.Entry[i8];
            for (int i9 = 0; i9 < i8; i9++) {
                int i10 = i9 * 2;
                Object obj = objArr[i10];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i10 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i9] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i8, G.a(comparator).e(z.d()));
            for (int i11 = 0; i11 < i8; i11++) {
                int i12 = i11 * 2;
                objArr[i12] = entryArr[i11].getKey();
                objArr[i12 + 1] = entryArr[i11].getValue();
            }
        }

        public AbstractC4193p b() {
            return a(true);
        }

        public a e(Object obj, Object obj2) {
            c(this.f40911c + 1);
            AbstractC4184g.a(obj, obj2);
            Object[] objArr = this.f40910b;
            int i8 = this.f40911c;
            objArr[i8 * 2] = obj;
            objArr[(i8 * 2) + 1] = obj2;
            this.f40911c = i8 + 1;
            return this;
        }
    }

    public static AbstractC4193p g() {
        return J.f40829h;
    }

    abstract r a();

    abstract r b();

    abstract AbstractC4191n c();

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public r entrySet() {
        r rVar = this.f40906a;
        if (rVar == null) {
            r a9 = a();
            this.f40906a = a9;
            return a9;
        }
        return rVar;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return z.a(this, obj);
    }

    @Override // java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public r keySet() {
        r rVar = this.f40907b;
        if (rVar == null) {
            r b9 = b();
            this.f40907b = b9;
            return b9;
        }
        return rVar;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    @Override // java.util.Map
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public AbstractC4191n values() {
        AbstractC4191n abstractC4191n = this.f40908c;
        if (abstractC4191n == null) {
            AbstractC4191n c8 = c();
            this.f40908c = c8;
            return c8;
        }
        return abstractC4191n;
    }

    @Override // java.util.Map
    public int hashCode() {
        return M.b(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public String toString() {
        return z.c(this);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}
