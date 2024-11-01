package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2283x implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f17067a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C2259u f17068b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2283x(C2259u c2259u) {
        this.f17068b = c2259u;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i8 = this.f17067a;
        str = this.f17068b.f17015a;
        if (i8 < str.length()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        String str;
        int i8 = this.f17067a;
        str = this.f17068b.f17015a;
        if (i8 < str.length()) {
            int i9 = this.f17067a;
            this.f17067a = i9 + 1;
            return new C2259u(String.valueOf(i9));
        }
        throw new NoSuchElementException();
    }
}
