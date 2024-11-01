package com.google.android.gms.common.api.internal;

import N.C1339b;
import Q.AbstractC1396p;
import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class B implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final z f16073a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C f16074b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public B(C c8, z zVar) {
        this.f16074b = c8;
        this.f16073a = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f16074b.f16088b) {
            return;
        }
        C1339b b9 = this.f16073a.b();
        if (b9.y()) {
            C c8 = this.f16074b;
            c8.f16092a.startActivityForResult(GoogleApiActivity.a(c8.b(), (PendingIntent) AbstractC1396p.l(b9.v()), this.f16073a.a(), false), 1);
            return;
        }
        C c9 = this.f16074b;
        if (c9.f16091e.b(c9.b(), b9.s(), null) != null) {
            C c10 = this.f16074b;
            c10.f16091e.w(c10.b(), c10.f16092a, b9.s(), 2, this.f16074b);
            return;
        }
        if (b9.s() != 18) {
            this.f16074b.l(b9, this.f16073a.a());
            return;
        }
        C c11 = this.f16074b;
        Dialog r8 = c11.f16091e.r(c11.b(), c11);
        C c12 = this.f16074b;
        c12.f16091e.s(c12.b().getApplicationContext(), new A(this, r8));
    }
}
