package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2212o implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Iterator f16903a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2212o(Iterator it) {
        this.f16903a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16903a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return new C2259u((String) this.f16903a.next());
    }
}
