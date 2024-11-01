package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class T3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ boolean f17579a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ F3 f17580b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public T3(F3 f32, boolean z8) {
        this.f17579a = z8;
        this.f17580b = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean m8 = this.f17580b.f18099a.m();
        boolean l8 = this.f17580b.f18099a.l();
        this.f17580b.f18099a.j(this.f17579a);
        if (l8 == this.f17579a) {
            this.f17580b.f18099a.a().K().b("Default data collection state already set to", Boolean.valueOf(this.f17579a));
        }
        if (this.f17580b.f18099a.m() == m8 || this.f17580b.f18099a.m() != this.f17580b.f18099a.l()) {
            this.f17580b.f18099a.a().M().c("Default data collection is different than actual status", Boolean.valueOf(this.f17579a), Boolean.valueOf(m8));
        }
        this.f17580b.K0();
    }
}
