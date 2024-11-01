package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class M3 extends O3 {

    /* renamed from: a, reason: collision with root package name */
    private int f16395a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final int f16396b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ J3 f16397c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public M3(J3 j32) {
        this.f16397c = j32;
        this.f16396b = j32.r();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f16395a < this.f16396b) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.P3
    public final byte w() {
        int i8 = this.f16395a;
        if (i8 < this.f16396b) {
            this.f16395a = i8 + 1;
            return this.f16397c.q(i8);
        }
        throw new NoSuchElementException();
    }
}
