package com.google.android.gms.common.api.internal;

import N.C1339b;
import O.a;
import P.C1378b;
import android.util.Log;
import java.util.Map;

/* loaded from: classes3.dex */
final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1339b f16155a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ q f16156b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(q qVar, C1339b c1339b) {
        this.f16156b = qVar;
        this.f16155a = c1339b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        C1378b c1378b;
        a.f fVar;
        a.f fVar2;
        a.f fVar3;
        a.f fVar4;
        q qVar = this.f16156b;
        map = qVar.f16162f.f16113j;
        c1378b = qVar.f16158b;
        n nVar = (n) map.get(c1378b);
        if (nVar == null) {
            return;
        }
        if (this.f16155a.z()) {
            this.f16156b.f16161e = true;
            fVar = this.f16156b.f16157a;
            if (fVar.o()) {
                this.f16156b.i();
                return;
            }
            try {
                q qVar2 = this.f16156b;
                fVar3 = qVar2.f16157a;
                fVar4 = qVar2.f16157a;
                fVar3.m(null, fVar4.c());
                return;
            } catch (SecurityException e8) {
                Log.e("GoogleApiManager", "Failed to get service from broker. ", e8);
                fVar2 = this.f16156b.f16157a;
                fVar2.d("Failed to get service from broker.");
                nVar.H(new C1339b(10), null);
                return;
            }
        }
        nVar.H(this.f16155a, null);
    }
}
