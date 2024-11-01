package com.google.firebase.installations;

import e1.AbstractC2786d;
import q0.C3626l;

/* loaded from: classes3.dex */
class f implements h {

    /* renamed from: a, reason: collision with root package name */
    final C3626l f18506a;

    public f(C3626l c3626l) {
        this.f18506a = c3626l;
    }

    @Override // com.google.firebase.installations.h
    public boolean a(AbstractC2786d abstractC2786d) {
        if (!abstractC2786d.l() && !abstractC2786d.k() && !abstractC2786d.i()) {
            return false;
        }
        this.f18506a.e(abstractC2786d.d());
        return true;
    }

    @Override // com.google.firebase.installations.h
    public boolean b(Exception exc) {
        return false;
    }
}
