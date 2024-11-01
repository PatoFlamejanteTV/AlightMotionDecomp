package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class C implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private Iterator f17161a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ D f17162b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C(D d8) {
        Bundle bundle;
        this.f17162b = d8;
        bundle = d8.f17170a;
        this.f17161a = bundle.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f17161a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return (String) this.f17161a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
