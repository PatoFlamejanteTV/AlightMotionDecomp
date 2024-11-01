package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class E4 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private Iterator f16278a;

    public E4(Iterator it) {
        this.f16278a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16278a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f16278a.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f16278a.remove();
    }
}
