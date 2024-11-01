package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.z3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2485z3 extends AbstractC2464w3 {

    /* renamed from: b, reason: collision with root package name */
    private boolean f18168b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2485z3(S2 s22) {
        super(s22);
        this.f18099a.k();
    }

    protected void l() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void m() {
        if (p()) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void n() {
        if (!this.f18168b) {
            if (!q()) {
                this.f18099a.R();
                this.f18168b = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final void o() {
        if (!this.f18168b) {
            l();
            this.f18099a.R();
            this.f18168b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean p() {
        if (this.f18168b) {
            return true;
        }
        return false;
    }

    protected abstract boolean q();
}
