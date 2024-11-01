package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.w5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2281w5 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f17063a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f17064b;

    /* renamed from: c, reason: collision with root package name */
    private Iterator f17065c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ AbstractC2218o5 f17066d;

    private final Iterator a() {
        Map map;
        if (this.f17065c == null) {
            map = this.f17066d.f16920c;
            this.f17065c = map.entrySet().iterator();
        }
        return this.f17065c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i8;
        Map map;
        int i9 = this.f17063a + 1;
        i8 = this.f17066d.f16919b;
        if (i9 >= i8) {
            map = this.f17066d.f16920c;
            if (map.isEmpty() || !a().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        int i8;
        Object[] objArr;
        this.f17064b = true;
        int i9 = this.f17063a + 1;
        this.f17063a = i9;
        i8 = this.f17066d.f16919b;
        if (i9 < i8) {
            objArr = this.f17066d.f16918a;
            return (C2249s5) objArr[this.f17063a];
        }
        return (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i8;
        if (this.f17064b) {
            this.f17064b = false;
            this.f17066d.r();
            int i9 = this.f17063a;
            i8 = this.f17066d.f16919b;
            if (i9 < i8) {
                AbstractC2218o5 abstractC2218o5 = this.f17066d;
                int i10 = this.f17063a;
                this.f17063a = i10 - 1;
                abstractC2218o5.i(i10);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    private C2281w5(AbstractC2218o5 abstractC2218o5) {
        this.f17066d = abstractC2218o5;
        this.f17063a = -1;
    }
}
