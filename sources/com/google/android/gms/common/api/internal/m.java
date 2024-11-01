package com.google.android.gms.common.api.internal;

import Q.AbstractC1383c;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class m implements AbstractC1383c.e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n f16139a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(n nVar) {
        this.f16139a = nVar;
    }

    @Override // Q.AbstractC1383c.e
    public final void a() {
        Handler handler;
        handler = this.f16139a.f16152u.f16117n;
        handler.post(new l(this));
    }
}
