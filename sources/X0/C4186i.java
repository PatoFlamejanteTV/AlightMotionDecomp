package x0;

import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import y0.AbstractC4234a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: x0.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4186i extends AbstractMap implements Serializable {

    /* renamed from: j, reason: collision with root package name */
    private static final Object f40870j = new Object();

    /* renamed from: a, reason: collision with root package name */
    private transient Object f40871a;

    /* renamed from: b, reason: collision with root package name */
    transient int[] f40872b;

    /* renamed from: c, reason: collision with root package name */
    transient Object[] f40873c;

    /* renamed from: d, reason: collision with root package name */
    transient Object[] f40874d;

    /* renamed from: e, reason: collision with root package name */
    private transient int f40875e;

    /* renamed from: f, reason: collision with root package name */
    private transient int f40876f;

    /* renamed from: g, reason: collision with root package name */
    private transient Set f40877g;

    /* renamed from: h, reason: collision with root package name */
    private transient Set f40878h;

    /* renamed from: i, reason: collision with root package name */
    private transient Collection f40879i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x0.i$a */
    /* loaded from: classes3.dex */
    public class a extends e {
        a() {
            super(C4186i.this, null);
        }

        @Override // x0.C4186i.e
        Object b(int i8) {
            return C4186i.this.K(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x0.i$b */
    /* loaded from: classes3.dex */
    public class b extends e {
        b() {
            super(C4186i.this, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // x0.C4186i.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry b(int i8) {
            return new g(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x0.i$c */
    /* loaded from: classes3.dex */
    public class c extends e {
        c() {
            super(C4186i.this, null);
        }

        @Override // x0.C4186i.e
        Object b(int i8) {
            return C4186i.this.c0(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x0.i$d */
    /* loaded from: classes3.dex */
    public class d extends AbstractSet {
        d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C4186i.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map z8 = C4186i.this.z();
            if (z8 != null) {
                return z8.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int G8 = C4186i.this.G(entry.getKey());
            if (G8 == -1 || !w0.f.a(C4186i.this.c0(G8), entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return C4186i.this.B();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map z8 = C4186i.this.z();
            if (z8 != null) {
                return z8.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!C4186i.this.N()) {
                int E8 = C4186i.this.E();
                int f8 = AbstractC4187j.f(entry.getKey(), entry.getValue(), E8, C4186i.this.S(), C4186i.this.P(), C4186i.this.R(), C4186i.this.T());
                if (f8 == -1) {
                    return false;
                }
                C4186i.this.M(f8, E8);
                C4186i.f(C4186i.this);
                C4186i.this.F();
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C4186i.this.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x0.i$f */
    /* loaded from: classes3.dex */
    public class f extends AbstractSet {
        f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C4186i.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C4186i.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return C4186i.this.L();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map z8 = C4186i.this.z();
            if (z8 != null) {
                return z8.keySet().remove(obj);
            }
            if (C4186i.this.O(obj) != C4186i.f40870j) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C4186i.this.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x0.i$g */
    /* loaded from: classes3.dex */
    public final class g extends AbstractC4180c {

        /* renamed from: a, reason: collision with root package name */
        private final Object f40889a;

        /* renamed from: b, reason: collision with root package name */
        private int f40890b;

        g(int i8) {
            this.f40889a = C4186i.this.K(i8);
            this.f40890b = i8;
        }

        private void a() {
            int i8 = this.f40890b;
            if (i8 == -1 || i8 >= C4186i.this.size() || !w0.f.a(this.f40889a, C4186i.this.K(this.f40890b))) {
                this.f40890b = C4186i.this.G(this.f40889a);
            }
        }

        @Override // x0.AbstractC4180c, java.util.Map.Entry
        public Object getKey() {
            return this.f40889a;
        }

        @Override // x0.AbstractC4180c, java.util.Map.Entry
        public Object getValue() {
            Map z8 = C4186i.this.z();
            if (z8 != null) {
                return AbstractC4176E.a(z8.get(this.f40889a));
            }
            a();
            int i8 = this.f40890b;
            if (i8 != -1) {
                return C4186i.this.c0(i8);
            }
            return AbstractC4176E.b();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Map z8 = C4186i.this.z();
            if (z8 != null) {
                return AbstractC4176E.a(z8.put(this.f40889a, obj));
            }
            a();
            int i8 = this.f40890b;
            if (i8 != -1) {
                Object c02 = C4186i.this.c0(i8);
                C4186i.this.b0(this.f40890b, obj);
                return c02;
            }
            C4186i.this.put(this.f40889a, obj);
            return AbstractC4176E.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x0.i$h */
    /* loaded from: classes3.dex */
    public class h extends AbstractCollection {
        h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            C4186i.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return C4186i.this.d0();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return C4186i.this.size();
        }
    }

    C4186i() {
        H(3);
    }

    private int A(int i8) {
        return P()[i8];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int E() {
        return (1 << (this.f40875e & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int G(Object obj) {
        if (N()) {
            return -1;
        }
        int c8 = AbstractC4190m.c(obj);
        int E8 = E();
        int h8 = AbstractC4187j.h(S(), c8 & E8);
        if (h8 == 0) {
            return -1;
        }
        int b9 = AbstractC4187j.b(c8, E8);
        do {
            int i8 = h8 - 1;
            int A8 = A(i8);
            if (AbstractC4187j.b(A8, E8) == b9 && w0.f.a(obj, K(i8))) {
                return i8;
            }
            h8 = AbstractC4187j.c(A8, E8);
        } while (h8 != 0);
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object K(int i8) {
        return R()[i8];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object O(Object obj) {
        if (N()) {
            return f40870j;
        }
        int E8 = E();
        int f8 = AbstractC4187j.f(obj, null, E8, S(), P(), R(), null);
        if (f8 == -1) {
            return f40870j;
        }
        Object c02 = c0(f8);
        M(f8, E8);
        this.f40876f--;
        F();
        return c02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] P() {
        int[] iArr = this.f40872b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] R() {
        Object[] objArr = this.f40873c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object S() {
        Object obj = this.f40871a;
        Objects.requireNonNull(obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] T() {
        Object[] objArr = this.f40874d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private void W(int i8) {
        int min;
        int length = P().length;
        if (i8 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            V(min);
        }
    }

    private int X(int i8, int i9, int i10, int i11) {
        Object a9 = AbstractC4187j.a(i9);
        int i12 = i9 - 1;
        if (i11 != 0) {
            AbstractC4187j.i(a9, i10 & i12, i11 + 1);
        }
        Object S8 = S();
        int[] P8 = P();
        for (int i13 = 0; i13 <= i8; i13++) {
            int h8 = AbstractC4187j.h(S8, i13);
            while (h8 != 0) {
                int i14 = h8 - 1;
                int i15 = P8[i14];
                int b9 = AbstractC4187j.b(i15, i8) | i13;
                int i16 = b9 & i12;
                int h9 = AbstractC4187j.h(a9, i16);
                AbstractC4187j.i(a9, i16, h8);
                P8[i14] = AbstractC4187j.d(b9, h9, i12);
                h8 = AbstractC4187j.c(i15, i8);
            }
        }
        this.f40871a = a9;
        Z(i12);
        return i12;
    }

    private void Y(int i8, int i9) {
        P()[i8] = i9;
    }

    private void Z(int i8) {
        this.f40875e = AbstractC4187j.d(this.f40875e, 32 - Integer.numberOfLeadingZeros(i8), 31);
    }

    private void a0(int i8, Object obj) {
        R()[i8] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(int i8, Object obj) {
        T()[i8] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object c0(int i8) {
        return T()[i8];
    }

    static /* synthetic */ int f(C4186i c4186i) {
        int i8 = c4186i.f40876f;
        c4186i.f40876f = i8 - 1;
        return i8;
    }

    public static C4186i u() {
        return new C4186i();
    }

    Iterator B() {
        Map z8 = z();
        if (z8 != null) {
            return z8.entrySet().iterator();
        }
        return new b();
    }

    int C() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    int D(int i8) {
        int i9 = i8 + 1;
        if (i9 >= this.f40876f) {
            return -1;
        }
        return i9;
    }

    void F() {
        this.f40875e += 32;
    }

    void H(int i8) {
        boolean z8;
        if (i8 >= 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        w0.h.e(z8, "Expected size must be >= 0");
        this.f40875e = AbstractC4234a.a(i8, 1, 1073741823);
    }

    void J(int i8, Object obj, Object obj2, int i9, int i10) {
        Y(i8, AbstractC4187j.d(i9, 0, i10));
        a0(i8, obj);
        b0(i8, obj2);
    }

    Iterator L() {
        Map z8 = z();
        if (z8 != null) {
            return z8.keySet().iterator();
        }
        return new a();
    }

    void M(int i8, int i9) {
        Object S8 = S();
        int[] P8 = P();
        Object[] R8 = R();
        Object[] T8 = T();
        int size = size();
        int i10 = size - 1;
        if (i8 < i10) {
            Object obj = R8[i10];
            R8[i8] = obj;
            T8[i8] = T8[i10];
            R8[i10] = null;
            T8[i10] = null;
            P8[i8] = P8[i10];
            P8[i10] = 0;
            int c8 = AbstractC4190m.c(obj) & i9;
            int h8 = AbstractC4187j.h(S8, c8);
            if (h8 == size) {
                AbstractC4187j.i(S8, c8, i8 + 1);
                return;
            }
            while (true) {
                int i11 = h8 - 1;
                int i12 = P8[i11];
                int c9 = AbstractC4187j.c(i12, i9);
                if (c9 == size) {
                    P8[i11] = AbstractC4187j.d(i12, i8 + 1, i9);
                    return;
                }
                h8 = c9;
            }
        } else {
            R8[i8] = null;
            T8[i8] = null;
            P8[i8] = 0;
        }
    }

    boolean N() {
        if (this.f40871a == null) {
            return true;
        }
        return false;
    }

    void V(int i8) {
        this.f40872b = Arrays.copyOf(P(), i8);
        this.f40873c = Arrays.copyOf(R(), i8);
        this.f40874d = Arrays.copyOf(T(), i8);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (N()) {
            return;
        }
        F();
        Map z8 = z();
        if (z8 != null) {
            this.f40875e = AbstractC4234a.a(size(), 3, 1073741823);
            z8.clear();
            this.f40871a = null;
            this.f40876f = 0;
            return;
        }
        Arrays.fill(R(), 0, this.f40876f, (Object) null);
        Arrays.fill(T(), 0, this.f40876f, (Object) null);
        AbstractC4187j.g(S());
        Arrays.fill(P(), 0, this.f40876f, 0);
        this.f40876f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map z8 = z();
        if (z8 != null) {
            return z8.containsKey(obj);
        }
        if (G(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map z8 = z();
        if (z8 != null) {
            return z8.containsValue(obj);
        }
        for (int i8 = 0; i8 < this.f40876f; i8++) {
            if (w0.f.a(obj, c0(i8))) {
                return true;
            }
        }
        return false;
    }

    Iterator d0() {
        Map z8 = z();
        if (z8 != null) {
            return z8.values().iterator();
        }
        return new c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        Set set = this.f40878h;
        if (set == null) {
            Set v8 = v();
            this.f40878h = v8;
            return v8;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Map z8 = z();
        if (z8 != null) {
            return z8.get(obj);
        }
        int G8 = G(obj);
        if (G8 == -1) {
            return null;
        }
        p(G8);
        return c0(G8);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.f40877g;
        if (set == null) {
            Set x8 = x();
            this.f40877g = x8;
            return x8;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        int X8;
        int i8;
        if (N()) {
            r();
        }
        Map z8 = z();
        if (z8 != null) {
            return z8.put(obj, obj2);
        }
        int[] P8 = P();
        Object[] R8 = R();
        Object[] T8 = T();
        int i9 = this.f40876f;
        int i10 = i9 + 1;
        int c8 = AbstractC4190m.c(obj);
        int E8 = E();
        int i11 = c8 & E8;
        int h8 = AbstractC4187j.h(S(), i11);
        if (h8 == 0) {
            if (i10 > E8) {
                X8 = X(E8, AbstractC4187j.e(E8), c8, i9);
                i8 = X8;
            } else {
                AbstractC4187j.i(S(), i11, i10);
                i8 = E8;
            }
        } else {
            int b9 = AbstractC4187j.b(c8, E8);
            int i12 = 0;
            while (true) {
                int i13 = h8 - 1;
                int i14 = P8[i13];
                if (AbstractC4187j.b(i14, E8) == b9 && w0.f.a(obj, R8[i13])) {
                    Object obj3 = T8[i13];
                    T8[i13] = obj2;
                    p(i13);
                    return obj3;
                }
                int c9 = AbstractC4187j.c(i14, E8);
                i12++;
                if (c9 == 0) {
                    if (i12 >= 9) {
                        return t().put(obj, obj2);
                    }
                    if (i10 > E8) {
                        X8 = X(E8, AbstractC4187j.e(E8), c8, i9);
                    } else {
                        P8[i13] = AbstractC4187j.d(i14, i10, E8);
                    }
                } else {
                    h8 = c9;
                }
            }
        }
        W(i10);
        J(i9, obj, obj2, c8, i8);
        this.f40876f = i10;
        F();
        return null;
    }

    int q(int i8, int i9) {
        return i8 - 1;
    }

    int r() {
        w0.h.o(N(), "Arrays already allocated");
        int i8 = this.f40875e;
        int j8 = AbstractC4187j.j(i8);
        this.f40871a = AbstractC4187j.a(j8);
        Z(j8 - 1);
        this.f40872b = new int[i8];
        this.f40873c = new Object[i8];
        this.f40874d = new Object[i8];
        return i8;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        Map z8 = z();
        if (z8 != null) {
            return z8.remove(obj);
        }
        Object O8 = O(obj);
        if (O8 == f40870j) {
            return null;
        }
        return O8;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map z8 = z();
        if (z8 != null) {
            return z8.size();
        }
        return this.f40876f;
    }

    Map t() {
        Map w8 = w(E() + 1);
        int C8 = C();
        while (C8 >= 0) {
            w8.put(K(C8), c0(C8));
            C8 = D(C8);
        }
        this.f40871a = w8;
        this.f40872b = null;
        this.f40873c = null;
        this.f40874d = null;
        F();
        return w8;
    }

    Set v() {
        return new d();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        Collection collection = this.f40879i;
        if (collection == null) {
            Collection y8 = y();
            this.f40879i = y8;
            return y8;
        }
        return collection;
    }

    Map w(int i8) {
        return new LinkedHashMap(i8, 1.0f);
    }

    Set x() {
        return new f();
    }

    Collection y() {
        return new h();
    }

    Map z() {
        Object obj = this.f40871a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* renamed from: x0.i$e */
    /* loaded from: classes3.dex */
    private abstract class e implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        int f40884a;

        /* renamed from: b, reason: collision with root package name */
        int f40885b;

        /* renamed from: c, reason: collision with root package name */
        int f40886c;

        private e() {
            this.f40884a = C4186i.this.f40875e;
            this.f40885b = C4186i.this.C();
            this.f40886c = -1;
        }

        private void a() {
            if (C4186i.this.f40875e == this.f40884a) {
            } else {
                throw new ConcurrentModificationException();
            }
        }

        abstract Object b(int i8);

        void c() {
            this.f40884a += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f40885b >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            if (hasNext()) {
                int i8 = this.f40885b;
                this.f40886c = i8;
                Object b9 = b(i8);
                this.f40885b = C4186i.this.D(this.f40885b);
                return b9;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            boolean z8;
            a();
            if (this.f40886c >= 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            AbstractC4184g.c(z8);
            c();
            C4186i c4186i = C4186i.this;
            c4186i.remove(c4186i.K(this.f40886c));
            this.f40885b = C4186i.this.q(this.f40885b, this.f40886c);
            this.f40886c = -1;
        }

        /* synthetic */ e(C4186i c4186i, a aVar) {
            this();
        }
    }

    void p(int i8) {
    }
}
