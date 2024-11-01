package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: classes3.dex */
final class V2 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ T2 f16471a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V2(T2 t22, Handler handler) {
        super(null);
        this.f16471a = t22;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z8) {
        this.f16471a.f();
    }
}
