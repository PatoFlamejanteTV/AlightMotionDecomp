package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.os.Bundle;

/* loaded from: classes3.dex */
final class U5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f17589a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f17590b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Bundle f17591c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ S5 f17592d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public U5(S5 s52, String str, String str2, Bundle bundle) {
        this.f17589a = str;
        this.f17590b = str2;
        this.f17591c = bundle;
        this.f17592d = s52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17592d.f17574a.t((E) AbstractC1396p.l(this.f17592d.f17574a.y0().H(this.f17589a, this.f17590b, this.f17591c, "auto", this.f17592d.f17574a.x().currentTimeMillis(), false, true)), this.f17589a);
    }
}
