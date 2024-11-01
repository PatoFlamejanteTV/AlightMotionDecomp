package com.google.firebase.installations;

import e1.AbstractC2786d;
import q0.C3626l;

/* loaded from: classes3.dex */
class e implements h {

    /* renamed from: a, reason: collision with root package name */
    private final i f18504a;

    /* renamed from: b, reason: collision with root package name */
    private final C3626l f18505b;

    public e(i iVar, C3626l c3626l) {
        this.f18504a = iVar;
        this.f18505b = c3626l;
    }

    @Override // com.google.firebase.installations.h
    public boolean a(AbstractC2786d abstractC2786d) {
        if (abstractC2786d.k() && !this.f18504a.f(abstractC2786d)) {
            this.f18505b.c(g.a().b(abstractC2786d.b()).d(abstractC2786d.c()).c(abstractC2786d.h()).a());
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.installations.h
    public boolean b(Exception exc) {
        this.f18505b.d(exc);
        return true;
    }
}
