package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class T5 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ M5 f17582a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ H5 f17583b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public T5(H5 h52, M5 m52) {
        this.f17582a = m52;
        this.f17583b = h52;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        if (this.f17583b.U((String) AbstractC1396p.l(this.f17582a.f17457a)).z() && A3.q(this.f17582a.f17478v).z()) {
            C2324c2 g8 = this.f17583b.g(this.f17582a);
            if (g8 == null) {
                this.f17583b.a().L().a("App info was null when attempting to get app instance id");
                return null;
            }
            return g8.m();
        }
        this.f17583b.a().K().a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
