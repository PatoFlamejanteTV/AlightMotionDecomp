package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class R4 extends LinkedHashMap {

    /* renamed from: b, reason: collision with root package name */
    private static final R4 f16432b;

    /* renamed from: a, reason: collision with root package name */
    private boolean f16433a;

    static {
        R4 r42 = new R4();
        f16432b = r42;
        r42.f16433a = false;
    }

    private R4() {
        this.f16433a = true;
    }

    private static int a(Object obj) {
        if (obj instanceof byte[]) {
            return AbstractC2256t4.d((byte[]) obj);
        }
        if (!(obj instanceof InterfaceC2280w4)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public static R4 b() {
        return f16432b;
    }

    private final void h() {
        if (this.f16433a) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final void c(R4 r42) {
        h();
        if (!r42.isEmpty()) {
            putAll(r42);
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        h();
        super.clear();
    }

    public final R4 e() {
        if (isEmpty()) {
            return new R4();
        }
        return new R4(this);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005c A[RETURN] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L5d
            java.util.Map r7 = (java.util.Map) r7
            r0 = 1
            if (r6 == r7) goto L59
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L16
        L14:
            r7 = 0
            goto L5a
        L16:
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L1e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L59
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L35
            goto L14
        L35:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L52
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L52
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L56
        L52:
            boolean r3 = r4.equals(r3)
        L56:
            if (r3 != 0) goto L1e
            goto L14
        L59:
            r7 = 1
        L5a:
            if (r7 == 0) goto L5d
            return r0
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.R4.equals(java.lang.Object):boolean");
    }

    public final void f() {
        this.f16433a = false;
    }

    public final boolean g() {
        return this.f16433a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int i8 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            i8 += a(entry.getValue()) ^ a(entry.getKey());
        }
        return i8;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        h();
        AbstractC2256t4.e(obj);
        AbstractC2256t4.e(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        h();
        for (Object obj : map.keySet()) {
            AbstractC2256t4.e(obj);
            AbstractC2256t4.e(map.get(obj));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        h();
        return super.remove(obj);
    }

    private R4(Map map) {
        super(map);
        this.f16433a = true;
    }
}
