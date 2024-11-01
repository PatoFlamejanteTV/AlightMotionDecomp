package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.y2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2477y2 extends AbstractC2309a1 {

    /* renamed from: b, reason: collision with root package name */
    private boolean f18130b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2477y2(S2 s22) {
        super(s22);
        this.f18099a.k();
    }

    protected abstract boolean A();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void s() {
        if (z()) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void t() {
        if (!this.f18130b) {
            if (!A()) {
                this.f18099a.R();
                this.f18130b = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final void u() {
        if (!this.f18130b) {
            v();
            this.f18099a.R();
            this.f18130b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    protected void v() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean z() {
        if (this.f18130b) {
            return true;
        }
        return false;
    }
}
