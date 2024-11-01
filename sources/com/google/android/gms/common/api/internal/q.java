package com.google.android.gms.common.api.internal;

import N.C1339b;
import O.a;
import P.C1378b;
import Q.AbstractC1383c;
import Q.InterfaceC1390j;
import android.os.Handler;
import android.util.Log;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class q implements AbstractC1383c.InterfaceC0162c, P.x {

    /* renamed from: a, reason: collision with root package name */
    private final a.f f16157a;

    /* renamed from: b, reason: collision with root package name */
    private final C1378b f16158b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC1390j f16159c = null;

    /* renamed from: d, reason: collision with root package name */
    private Set f16160d = null;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16161e = false;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C2085c f16162f;

    public q(C2085c c2085c, a.f fVar, C1378b c1378b) {
        this.f16162f = c2085c;
        this.f16157a = fVar;
        this.f16158b = c1378b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        InterfaceC1390j interfaceC1390j;
        if (this.f16161e && (interfaceC1390j = this.f16159c) != null) {
            this.f16157a.m(interfaceC1390j, this.f16160d);
        }
    }

    @Override // P.x
    public final void a(InterfaceC1390j interfaceC1390j, Set set) {
        if (interfaceC1390j != null && set != null) {
            this.f16159c = interfaceC1390j;
            this.f16160d = set;
            i();
        } else {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            c(new C1339b(4));
        }
    }

    @Override // Q.AbstractC1383c.InterfaceC0162c
    public final void b(C1339b c1339b) {
        Handler handler;
        handler = this.f16162f.f16117n;
        handler.post(new p(this, c1339b));
    }

    @Override // P.x
    public final void c(C1339b c1339b) {
        Map map;
        map = this.f16162f.f16113j;
        n nVar = (n) map.get(this.f16158b);
        if (nVar != null) {
            nVar.I(c1339b);
        }
    }

    @Override // P.x
    public final void d(int i8) {
        Map map;
        boolean z8;
        map = this.f16162f.f16113j;
        n nVar = (n) map.get(this.f16158b);
        if (nVar != null) {
            z8 = nVar.f16148q;
            if (z8) {
                nVar.I(new C1339b(17));
            } else {
                nVar.h(i8);
            }
        }
    }
}
