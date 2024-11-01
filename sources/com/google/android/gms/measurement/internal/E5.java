package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class E5 extends F5 {

    /* renamed from: c, reason: collision with root package name */
    private boolean f17198c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public E5(H5 h52) {
        super(h52);
        this.f17229b.C0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void r() {
        if (t()) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void s() {
        if (!this.f17198c) {
            u();
            this.f17229b.B0();
            this.f17198c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean t() {
        if (this.f17198c) {
            return true;
        }
        return false;
    }

    protected abstract boolean u();
}
