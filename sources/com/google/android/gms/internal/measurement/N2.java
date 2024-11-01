package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
final class N2 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ L2 f16405a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N2(L2 l22, Handler handler) {
        super(null);
        this.f16405a = l22;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z8) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.f16405a.f16350a;
        atomicBoolean.set(true);
    }
}
