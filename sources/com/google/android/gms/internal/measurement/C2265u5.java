package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.u5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2265u5 extends C2273v5 {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ AbstractC2218o5 f17029b;

    @Override // com.google.android.gms.internal.measurement.C2273v5, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C2234q5(this.f17029b);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private C2265u5(AbstractC2218o5 abstractC2218o5) {
        super(abstractC2218o5);
        this.f17029b = abstractC2218o5;
    }
}
