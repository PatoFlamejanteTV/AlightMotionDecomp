package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.q5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2234q5 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f16947a;

    /* renamed from: b, reason: collision with root package name */
    private Iterator f16948b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ AbstractC2218o5 f16949c;

    private final Iterator a() {
        Map map;
        if (this.f16948b == null) {
            map = this.f16949c.f16923f;
            this.f16948b = map.entrySet().iterator();
        }
        return this.f16948b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i8;
        int i9 = this.f16947a;
        if (i9 > 0) {
            i8 = this.f16949c.f16919b;
            if (i9 <= i8) {
                return true;
            }
        }
        if (a().hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Object[] objArr;
        if (!a().hasNext()) {
            objArr = this.f16949c.f16918a;
            int i8 = this.f16947a - 1;
            this.f16947a = i8;
            return (C2249s5) objArr[i8];
        }
        return (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private C2234q5(AbstractC2218o5 abstractC2218o5) {
        int i8;
        this.f16949c = abstractC2218o5;
        i8 = abstractC2218o5.f16919b;
        this.f16947a = i8;
    }
}
