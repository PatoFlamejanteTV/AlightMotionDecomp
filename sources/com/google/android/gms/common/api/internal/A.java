package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* loaded from: classes3.dex */
final class A extends P.r {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Dialog f16071a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ B f16072b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public A(B b9, Dialog dialog) {
        this.f16072b = b9;
        this.f16071a = dialog;
    }

    @Override // P.r
    public final void a() {
        this.f16072b.f16074b.o();
        if (this.f16071a.isShowing()) {
            this.f16071a.dismiss();
        }
    }
}
