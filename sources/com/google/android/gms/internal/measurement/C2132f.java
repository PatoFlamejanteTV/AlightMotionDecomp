package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2132f implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Iterator f16717a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Iterator f16718b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2132f(C2141g c2141g, Iterator it, Iterator it2) {
        this.f16717a = it;
        this.f16718b = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f16717a.hasNext()) {
            return true;
        }
        return this.f16718b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (this.f16717a.hasNext()) {
            return new C2259u(((Integer) this.f16717a.next()).toString());
        }
        if (this.f16718b.hasNext()) {
            return new C2259u((String) this.f16718b.next());
        }
        throw new NoSuchElementException();
    }
}
