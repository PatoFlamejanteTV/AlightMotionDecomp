package com.google.android.gms.internal.measurement;

import j$.util.DesugarCollections;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.o5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2218o5 extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    private Object[] f16918a;

    /* renamed from: b, reason: collision with root package name */
    private int f16919b;

    /* renamed from: c, reason: collision with root package name */
    private Map f16920c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16921d;

    /* renamed from: e, reason: collision with root package name */
    private volatile C2273v5 f16922e;

    /* renamed from: f, reason: collision with root package name */
    private Map f16923f;

    private final int c(Comparable comparable) {
        int i8;
        int i9 = this.f16919b;
        int i10 = i9 - 1;
        if (i10 >= 0) {
            int compareTo = comparable.compareTo((Comparable) ((C2249s5) this.f16918a[i10]).getKey());
            if (compareTo > 0) {
                i8 = i9 + 1;
                return -i8;
            }
            if (compareTo == 0) {
                return i10;
            }
        }
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) / 2;
            int compareTo2 = comparable.compareTo((Comparable) ((C2249s5) this.f16918a[i12]).getKey());
            if (compareTo2 < 0) {
                i10 = i12 - 1;
            } else if (compareTo2 > 0) {
                i11 = i12 + 1;
            } else {
                return i12;
            }
        }
        i8 = i11 + 1;
        return -i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object i(int i8) {
        r();
        Object value = ((C2249s5) this.f16918a[i8]).getValue();
        Object[] objArr = this.f16918a;
        System.arraycopy(objArr, i8 + 1, objArr, i8, (this.f16919b - i8) - 1);
        this.f16919b--;
        if (!this.f16920c.isEmpty()) {
            Iterator it = q().entrySet().iterator();
            this.f16918a[this.f16919b] = new C2249s5(this, (Map.Entry) it.next());
            this.f16919b++;
            it.remove();
        }
        return value;
    }

    private final SortedMap q() {
        r();
        if (this.f16920c.isEmpty() && !(this.f16920c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f16920c = treeMap;
            this.f16923f = treeMap.descendingMap();
        }
        return (SortedMap) this.f16920c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r() {
        if (!this.f16921d) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final int a() {
        return this.f16919b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        r();
        if (this.f16919b != 0) {
            this.f16918a = null;
            this.f16919b = 0;
        }
        if (!this.f16920c.isEmpty()) {
            this.f16920c.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (c(comparable) < 0 && !this.f16920c.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f16922e == null) {
            this.f16922e = new C2273v5(this);
        }
        return this.f16922e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC2218o5)) {
            return super.equals(obj);
        }
        AbstractC2218o5 abstractC2218o5 = (AbstractC2218o5) obj;
        int size = size();
        if (size != abstractC2218o5.size()) {
            return false;
        }
        int i8 = this.f16919b;
        if (i8 != abstractC2218o5.f16919b) {
            return entrySet().equals(abstractC2218o5.entrySet());
        }
        for (int i9 = 0; i9 < i8; i9++) {
            if (!g(i9).equals(abstractC2218o5.g(i9))) {
                return false;
            }
        }
        if (i8 == size) {
            return true;
        }
        return this.f16920c.equals(abstractC2218o5.f16920c);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        r();
        int c8 = c(comparable);
        if (c8 >= 0) {
            return ((C2249s5) this.f16918a[c8]).setValue(obj);
        }
        r();
        if (this.f16918a == null) {
            this.f16918a = new Object[16];
        }
        int i8 = -(c8 + 1);
        if (i8 >= 16) {
            return q().put(comparable, obj);
        }
        int i9 = this.f16919b;
        if (i9 == 16) {
            C2249s5 c2249s5 = (C2249s5) this.f16918a[15];
            this.f16919b = i9 - 1;
            q().put((Comparable) c2249s5.getKey(), c2249s5.getValue());
        }
        Object[] objArr = this.f16918a;
        System.arraycopy(objArr, i8, objArr, i8 + 1, (objArr.length - i8) - 1);
        this.f16918a[i8] = new C2249s5(this, comparable, obj);
        this.f16919b++;
        return null;
    }

    public final Map.Entry g(int i8) {
        if (i8 < this.f16919b) {
            return (C2249s5) this.f16918a[i8];
        }
        throw new ArrayIndexOutOfBoundsException(i8);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int c8 = c(comparable);
        if (c8 >= 0) {
            return ((C2249s5) this.f16918a[c8]).getValue();
        }
        return this.f16920c.get(comparable);
    }

    public final Iterable h() {
        if (this.f16920c.isEmpty()) {
            return Collections.emptySet();
        }
        return this.f16920c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int i8 = this.f16919b;
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            i9 += this.f16918a[i10].hashCode();
        }
        if (this.f16920c.size() > 0) {
            return i9 + this.f16920c.hashCode();
        }
        return i9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set l() {
        return new C2265u5(this);
    }

    public void m() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (!this.f16921d) {
            if (this.f16920c.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = DesugarCollections.unmodifiableMap(this.f16920c);
            }
            this.f16920c = unmodifiableMap;
            if (this.f16923f.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = DesugarCollections.unmodifiableMap(this.f16923f);
            }
            this.f16923f = unmodifiableMap2;
            this.f16921d = true;
        }
    }

    public final boolean o() {
        return this.f16921d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        r();
        Comparable comparable = (Comparable) obj;
        int c8 = c(comparable);
        if (c8 >= 0) {
            return i(c8);
        }
        if (this.f16920c.isEmpty()) {
            return null;
        }
        return this.f16920c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f16919b + this.f16920c.size();
    }

    private AbstractC2218o5() {
        this.f16920c = Collections.emptyMap();
        this.f16923f = Collections.emptyMap();
    }
}
