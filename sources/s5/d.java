package S5;

import R5.AbstractC1419c;
import d6.InterfaceC2767a;
import d6.InterfaceC2770d;
import i6.m;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class d implements Map, Serializable, InterfaceC2770d {

    /* renamed from: n, reason: collision with root package name */
    public static final a f9723n = new a(null);

    /* renamed from: o, reason: collision with root package name */
    private static final d f9724o;

    /* renamed from: a, reason: collision with root package name */
    private Object[] f9725a;

    /* renamed from: b, reason: collision with root package name */
    private Object[] f9726b;

    /* renamed from: c, reason: collision with root package name */
    private int[] f9727c;

    /* renamed from: d, reason: collision with root package name */
    private int[] f9728d;

    /* renamed from: e, reason: collision with root package name */
    private int f9729e;

    /* renamed from: f, reason: collision with root package name */
    private int f9730f;

    /* renamed from: g, reason: collision with root package name */
    private int f9731g;

    /* renamed from: h, reason: collision with root package name */
    private int f9732h;

    /* renamed from: i, reason: collision with root package name */
    private int f9733i;

    /* renamed from: j, reason: collision with root package name */
    private S5.f f9734j;

    /* renamed from: k, reason: collision with root package name */
    private g f9735k;

    /* renamed from: l, reason: collision with root package name */
    private S5.e f9736l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f9737m;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int c(int i8) {
            return Integer.highestOneBit(m.d(i8, 1) * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int d(int i8) {
            return Integer.numberOfLeadingZeros(i8) + 1;
        }

        public final d e() {
            return d.f9724o;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends C0209d implements Iterator, InterfaceC2767a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d map) {
            super(map);
            AbstractC3292y.i(map, "map");
        }

        @Override // java.util.Iterator
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public c next() {
            a();
            if (b() < e().f9730f) {
                int b9 = b();
                g(b9 + 1);
                h(b9);
                c cVar = new c(e(), c());
                f();
                return cVar;
            }
            throw new NoSuchElementException();
        }

        public final void j(StringBuilder sb) {
            AbstractC3292y.i(sb, "sb");
            if (b() < e().f9730f) {
                int b9 = b();
                g(b9 + 1);
                h(b9);
                Object obj = e().f9725a[c()];
                if (obj == e()) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj);
                }
                sb.append('=');
                Object[] objArr = e().f9726b;
                AbstractC3292y.f(objArr);
                Object obj2 = objArr[c()];
                if (obj2 == e()) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj2);
                }
                f();
                return;
            }
            throw new NoSuchElementException();
        }

        public final int k() {
            int i8;
            if (b() < e().f9730f) {
                int b9 = b();
                g(b9 + 1);
                h(b9);
                Object obj = e().f9725a[c()];
                int i9 = 0;
                if (obj != null) {
                    i8 = obj.hashCode();
                } else {
                    i8 = 0;
                }
                Object[] objArr = e().f9726b;
                AbstractC3292y.f(objArr);
                Object obj2 = objArr[c()];
                if (obj2 != null) {
                    i9 = obj2.hashCode();
                }
                int i10 = i8 ^ i9;
                f();
                return i10;
            }
            throw new NoSuchElementException();
        }
    }

    /* loaded from: classes5.dex */
    public static final class c implements Map.Entry, InterfaceC2770d.a {

        /* renamed from: a, reason: collision with root package name */
        private final d f9738a;

        /* renamed from: b, reason: collision with root package name */
        private final int f9739b;

        public c(d map, int i8) {
            AbstractC3292y.i(map, "map");
            this.f9738a = map;
            this.f9739b = i8;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (AbstractC3292y.d(entry.getKey(), getKey()) && AbstractC3292y.d(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f9738a.f9725a[this.f9739b];
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            Object[] objArr = this.f9738a.f9726b;
            AbstractC3292y.f(objArr);
            return objArr[this.f9739b];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int i8;
            Object key = getKey();
            int i9 = 0;
            if (key != null) {
                i8 = key.hashCode();
            } else {
                i8 = 0;
            }
            Object value = getValue();
            if (value != null) {
                i9 = value.hashCode();
            }
            return i8 ^ i9;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            this.f9738a.n();
            Object[] k8 = this.f9738a.k();
            int i8 = this.f9739b;
            Object obj2 = k8[i8];
            k8[i8] = obj;
            return obj2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* renamed from: S5.d$d, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0209d {

        /* renamed from: a, reason: collision with root package name */
        private final d f9740a;

        /* renamed from: b, reason: collision with root package name */
        private int f9741b;

        /* renamed from: c, reason: collision with root package name */
        private int f9742c;

        /* renamed from: d, reason: collision with root package name */
        private int f9743d;

        public C0209d(d map) {
            AbstractC3292y.i(map, "map");
            this.f9740a = map;
            this.f9742c = -1;
            this.f9743d = map.f9732h;
            f();
        }

        public final void a() {
            if (this.f9740a.f9732h == this.f9743d) {
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final int b() {
            return this.f9741b;
        }

        public final int c() {
            return this.f9742c;
        }

        public final d e() {
            return this.f9740a;
        }

        public final void f() {
            while (this.f9741b < this.f9740a.f9730f) {
                int[] iArr = this.f9740a.f9727c;
                int i8 = this.f9741b;
                if (iArr[i8] < 0) {
                    this.f9741b = i8 + 1;
                } else {
                    return;
                }
            }
        }

        public final void g(int i8) {
            this.f9741b = i8;
        }

        public final void h(int i8) {
            this.f9742c = i8;
        }

        public final boolean hasNext() {
            if (this.f9741b < this.f9740a.f9730f) {
                return true;
            }
            return false;
        }

        public final void remove() {
            a();
            if (this.f9742c != -1) {
                this.f9740a.n();
                this.f9740a.N(this.f9742c);
                this.f9742c = -1;
                this.f9743d = this.f9740a.f9732h;
                return;
            }
            throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
        }
    }

    /* loaded from: classes5.dex */
    public static final class e extends C0209d implements Iterator, InterfaceC2767a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d map) {
            super(map);
            AbstractC3292y.i(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            if (b() < e().f9730f) {
                int b9 = b();
                g(b9 + 1);
                h(b9);
                Object obj = e().f9725a[c()];
                f();
                return obj;
            }
            throw new NoSuchElementException();
        }
    }

    /* loaded from: classes5.dex */
    public static final class f extends C0209d implements Iterator, InterfaceC2767a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(d map) {
            super(map);
            AbstractC3292y.i(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            if (b() < e().f9730f) {
                int b9 = b();
                g(b9 + 1);
                h(b9);
                Object[] objArr = e().f9726b;
                AbstractC3292y.f(objArr);
                Object obj = objArr[c()];
                f();
                return obj;
            }
            throw new NoSuchElementException();
        }
    }

    static {
        d dVar = new d(0);
        dVar.f9737m = true;
        f9724o = dVar;
    }

    private d(Object[] objArr, Object[] objArr2, int[] iArr, int[] iArr2, int i8, int i9) {
        this.f9725a = objArr;
        this.f9726b = objArr2;
        this.f9727c = iArr;
        this.f9728d = iArr2;
        this.f9729e = i8;
        this.f9730f = i9;
        this.f9731g = f9723n.d(A());
    }

    private final int A() {
        return this.f9728d.length;
    }

    private final int E(Object obj) {
        int i8;
        if (obj != null) {
            i8 = obj.hashCode();
        } else {
            i8 = 0;
        }
        return (i8 * (-1640531527)) >>> this.f9731g;
    }

    private final boolean G(Collection collection) {
        boolean z8 = false;
        if (collection.isEmpty()) {
            return false;
        }
        u(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (H((Map.Entry) it.next())) {
                z8 = true;
            }
        }
        return z8;
    }

    private final boolean H(Map.Entry entry) {
        int j8 = j(entry.getKey());
        Object[] k8 = k();
        if (j8 >= 0) {
            k8[j8] = entry.getValue();
            return true;
        }
        int i8 = (-j8) - 1;
        if (!AbstractC3292y.d(entry.getValue(), k8[i8])) {
            k8[i8] = entry.getValue();
            return true;
        }
        return false;
    }

    private final boolean J(int i8) {
        int E8 = E(this.f9725a[i8]);
        int i9 = this.f9729e;
        while (true) {
            int[] iArr = this.f9728d;
            if (iArr[E8] == 0) {
                iArr[E8] = i8 + 1;
                this.f9727c[i8] = E8;
                return true;
            }
            i9--;
            if (i9 < 0) {
                return false;
            }
            int i10 = E8 - 1;
            if (E8 == 0) {
                E8 = A() - 1;
            } else {
                E8 = i10;
            }
        }
    }

    private final void K() {
        this.f9732h++;
    }

    private final void L(int i8) {
        K();
        int i9 = 0;
        if (this.f9730f > size()) {
            o(false);
        }
        this.f9728d = new int[i8];
        this.f9731g = f9723n.d(i8);
        while (i9 < this.f9730f) {
            int i10 = i9 + 1;
            if (J(i9)) {
                i9 = i10;
            } else {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(int i8) {
        S5.c.f(this.f9725a, i8);
        Object[] objArr = this.f9726b;
        if (objArr != null) {
            S5.c.f(objArr, i8);
        }
        O(this.f9727c[i8]);
        this.f9727c[i8] = -1;
        this.f9733i = size() - 1;
        K();
    }

    private final void O(int i8) {
        int g8 = m.g(this.f9729e * 2, A() / 2);
        int i9 = 0;
        int i10 = i8;
        do {
            int i11 = i8 - 1;
            if (i8 == 0) {
                i8 = A() - 1;
            } else {
                i8 = i11;
            }
            i9++;
            if (i9 > this.f9729e) {
                this.f9728d[i10] = 0;
                return;
            }
            int[] iArr = this.f9728d;
            int i12 = iArr[i8];
            if (i12 == 0) {
                iArr[i10] = 0;
                return;
            }
            if (i12 < 0) {
                iArr[i10] = -1;
            } else {
                int i13 = i12 - 1;
                if (((E(this.f9725a[i13]) - i8) & (A() - 1)) >= i9) {
                    this.f9728d[i10] = i12;
                    this.f9727c[i13] = i10;
                }
                g8--;
            }
            i10 = i8;
            i9 = 0;
            g8--;
        } while (g8 >= 0);
        this.f9728d[i10] = -1;
    }

    private final boolean S(int i8) {
        int y8 = y();
        int i9 = this.f9730f;
        int i10 = y8 - i9;
        int size = i9 - size();
        if (i10 < i8 && i10 + size >= i8 && size >= y() / 4) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] k() {
        Object[] objArr = this.f9726b;
        if (objArr != null) {
            return objArr;
        }
        Object[] d8 = S5.c.d(y());
        this.f9726b = d8;
        return d8;
    }

    private final void o(boolean z8) {
        int i8;
        Object[] objArr = this.f9726b;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            i8 = this.f9730f;
            if (i9 >= i8) {
                break;
            }
            int[] iArr = this.f9727c;
            int i11 = iArr[i9];
            if (i11 >= 0) {
                Object[] objArr2 = this.f9725a;
                objArr2[i10] = objArr2[i9];
                if (objArr != null) {
                    objArr[i10] = objArr[i9];
                }
                if (z8) {
                    iArr[i10] = i11;
                    this.f9728d[i11] = i10 + 1;
                }
                i10++;
            }
            i9++;
        }
        S5.c.g(this.f9725a, i10, i8);
        if (objArr != null) {
            S5.c.g(objArr, i10, this.f9730f);
        }
        this.f9730f = i10;
    }

    private final boolean r(Map map) {
        if (size() == map.size() && p(map.entrySet())) {
            return true;
        }
        return false;
    }

    private final void t(int i8) {
        Object[] objArr;
        if (i8 >= 0) {
            if (i8 > y()) {
                int e8 = AbstractC1419c.Companion.e(y(), i8);
                this.f9725a = S5.c.e(this.f9725a, e8);
                Object[] objArr2 = this.f9726b;
                if (objArr2 != null) {
                    objArr = S5.c.e(objArr2, e8);
                } else {
                    objArr = null;
                }
                this.f9726b = objArr;
                int[] copyOf = Arrays.copyOf(this.f9727c, e8);
                AbstractC3292y.h(copyOf, "copyOf(...)");
                this.f9727c = copyOf;
                int c8 = f9723n.c(e8);
                if (c8 > A()) {
                    L(c8);
                    return;
                }
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    private final void u(int i8) {
        if (S(i8)) {
            o(true);
        } else {
            t(this.f9730f + i8);
        }
    }

    private final int w(Object obj) {
        int E8 = E(obj);
        int i8 = this.f9729e;
        while (true) {
            int i9 = this.f9728d[E8];
            if (i9 == 0) {
                return -1;
            }
            if (i9 > 0) {
                int i10 = i9 - 1;
                if (AbstractC3292y.d(this.f9725a[i10], obj)) {
                    return i10;
                }
            }
            i8--;
            if (i8 < 0) {
                return -1;
            }
            int i11 = E8 - 1;
            if (E8 == 0) {
                E8 = A() - 1;
            } else {
                E8 = i11;
            }
        }
    }

    private final int x(Object obj) {
        int i8 = this.f9730f;
        while (true) {
            i8--;
            if (i8 < 0) {
                return -1;
            }
            if (this.f9727c[i8] >= 0) {
                Object[] objArr = this.f9726b;
                AbstractC3292y.f(objArr);
                if (AbstractC3292y.d(objArr[i8], obj)) {
                    return i8;
                }
            }
        }
    }

    public Set B() {
        S5.f fVar = this.f9734j;
        if (fVar == null) {
            S5.f fVar2 = new S5.f(this);
            this.f9734j = fVar2;
            return fVar2;
        }
        return fVar;
    }

    public int C() {
        return this.f9733i;
    }

    public Collection D() {
        g gVar = this.f9735k;
        if (gVar == null) {
            g gVar2 = new g(this);
            this.f9735k = gVar2;
            return gVar2;
        }
        return gVar;
    }

    public final e F() {
        return new e(this);
    }

    public final boolean M(Map.Entry entry) {
        AbstractC3292y.i(entry, "entry");
        n();
        int w8 = w(entry.getKey());
        if (w8 < 0) {
            return false;
        }
        Object[] objArr = this.f9726b;
        AbstractC3292y.f(objArr);
        if (!AbstractC3292y.d(objArr[w8], entry.getValue())) {
            return false;
        }
        N(w8);
        return true;
    }

    public final boolean P(Object obj) {
        n();
        int w8 = w(obj);
        if (w8 < 0) {
            return false;
        }
        N(w8);
        return true;
    }

    public final boolean R(Object obj) {
        n();
        int x8 = x(obj);
        if (x8 < 0) {
            return false;
        }
        N(x8);
        return true;
    }

    public final f T() {
        return new f(this);
    }

    @Override // java.util.Map
    public void clear() {
        n();
        int i8 = this.f9730f - 1;
        if (i8 >= 0) {
            int i9 = 0;
            while (true) {
                int[] iArr = this.f9727c;
                int i10 = iArr[i9];
                if (i10 >= 0) {
                    this.f9728d[i10] = 0;
                    iArr[i9] = -1;
                }
                if (i9 == i8) {
                    break;
                } else {
                    i9++;
                }
            }
        }
        S5.c.g(this.f9725a, 0, this.f9730f);
        Object[] objArr = this.f9726b;
        if (objArr != null) {
            S5.c.g(objArr, 0, this.f9730f);
        }
        this.f9733i = 0;
        this.f9730f = 0;
        K();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        if (w(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        if (x(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return z();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj != this && (!(obj instanceof Map) || !r((Map) obj))) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        int w8 = w(obj);
        if (w8 < 0) {
            return null;
        }
        Object[] objArr = this.f9726b;
        AbstractC3292y.f(objArr);
        return objArr[w8];
    }

    @Override // java.util.Map
    public int hashCode() {
        b v8 = v();
        int i8 = 0;
        while (v8.hasNext()) {
            i8 += v8.k();
        }
        return i8;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final int j(Object obj) {
        n();
        while (true) {
            int E8 = E(obj);
            int g8 = m.g(this.f9729e * 2, A() / 2);
            int i8 = 0;
            while (true) {
                int i9 = this.f9728d[E8];
                if (i9 <= 0) {
                    if (this.f9730f >= y()) {
                        u(1);
                    } else {
                        int i10 = this.f9730f;
                        int i11 = i10 + 1;
                        this.f9730f = i11;
                        this.f9725a[i10] = obj;
                        this.f9727c[i10] = E8;
                        this.f9728d[E8] = i11;
                        this.f9733i = size() + 1;
                        K();
                        if (i8 > this.f9729e) {
                            this.f9729e = i8;
                        }
                        return i10;
                    }
                } else {
                    if (AbstractC3292y.d(this.f9725a[i9 - 1], obj)) {
                        return -i9;
                    }
                    i8++;
                    if (i8 > g8) {
                        L(A() * 2);
                        break;
                    }
                    int i12 = E8 - 1;
                    if (E8 == 0) {
                        E8 = A() - 1;
                    } else {
                        E8 = i12;
                    }
                }
            }
        }
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return B();
    }

    public final Map m() {
        n();
        this.f9737m = true;
        if (size() > 0) {
            return this;
        }
        d dVar = f9724o;
        AbstractC3292y.g(dVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return dVar;
    }

    public final void n() {
        if (!this.f9737m) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean p(Collection m8) {
        AbstractC3292y.i(m8, "m");
        for (Object obj : m8) {
            if (obj != null) {
                try {
                    if (!q((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        n();
        int j8 = j(obj);
        Object[] k8 = k();
        if (j8 < 0) {
            int i8 = (-j8) - 1;
            Object obj3 = k8[i8];
            k8[i8] = obj2;
            return obj3;
        }
        k8[j8] = obj2;
        return null;
    }

    @Override // java.util.Map
    public void putAll(Map from) {
        AbstractC3292y.i(from, "from");
        n();
        G(from.entrySet());
    }

    public final boolean q(Map.Entry entry) {
        AbstractC3292y.i(entry, "entry");
        int w8 = w(entry.getKey());
        if (w8 < 0) {
            return false;
        }
        Object[] objArr = this.f9726b;
        AbstractC3292y.f(objArr);
        return AbstractC3292y.d(objArr[w8], entry.getValue());
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        n();
        int w8 = w(obj);
        if (w8 < 0) {
            return null;
        }
        Object[] objArr = this.f9726b;
        AbstractC3292y.f(objArr);
        Object obj2 = objArr[w8];
        N(w8);
        return obj2;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return C();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        b v8 = v();
        int i8 = 0;
        while (v8.hasNext()) {
            if (i8 > 0) {
                sb.append(", ");
            }
            v8.j(sb);
            i8++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "toString(...)");
        return sb2;
    }

    public final b v() {
        return new b(this);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return D();
    }

    public final int y() {
        return this.f9725a.length;
    }

    public Set z() {
        S5.e eVar = this.f9736l;
        if (eVar == null) {
            S5.e eVar2 = new S5.e(this);
            this.f9736l = eVar2;
            return eVar2;
        }
        return eVar;
    }

    public d() {
        this(8);
    }

    public d(int i8) {
        this(S5.c.d(i8), null, new int[i8], new int[f9723n.c(i8)], 2, 0);
    }
}
