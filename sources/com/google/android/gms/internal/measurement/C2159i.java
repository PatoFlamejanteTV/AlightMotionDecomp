package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2159i implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f16750a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C2141g f16751b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2159i(C2141g c2141g) {
        this.f16751b = c2141g;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f16750a < this.f16751b.m()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (this.f16750a < this.f16751b.m()) {
            C2141g c2141g = this.f16751b;
            int i8 = this.f16750a;
            this.f16750a = i8 + 1;
            return c2141g.e(i8);
        }
        throw new NoSuchElementException("Out of bounds index: " + this.f16750a);
    }
}
