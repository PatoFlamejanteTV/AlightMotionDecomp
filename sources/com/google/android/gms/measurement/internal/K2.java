package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import androidx.collection.LruCache;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class K2 extends LruCache {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ I2 f17428a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K2(I2 i22, int i8) {
        super(20);
        this.f17428a = i22;
    }

    @Override // androidx.collection.LruCache
    protected final /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        AbstractC1396p.f(str);
        return I2.z(this.f17428a, str);
    }
}
