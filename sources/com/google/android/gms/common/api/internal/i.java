package com.google.android.gms.common.api.internal;

import android.os.Handler;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C2083a;

/* loaded from: classes3.dex */
final class i implements ComponentCallbacks2C2083a.InterfaceC0376a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2085c f16134a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(C2085c c2085c) {
        this.f16134a = c2085c;
    }

    @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C2083a.InterfaceC0376a
    public final void a(boolean z8) {
        Handler handler;
        Handler handler2;
        C2085c c2085c = this.f16134a;
        handler = c2085c.f16117n;
        handler2 = c2085c.f16117n;
        handler.sendMessage(handler2.obtainMessage(1, Boolean.valueOf(z8)));
    }
}
