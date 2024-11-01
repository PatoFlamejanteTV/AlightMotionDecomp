package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class C5 extends AbstractC2439t {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ D5 f17169e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5(D5 d52, InterfaceC2478y3 interfaceC2478y3) {
        super(interfaceC2478y3);
        this.f17169e = d52;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2439t
    public final void d() {
        this.f17169e.z();
        this.f17169e.a().K().a("Starting upload from DelayedRunnable");
        this.f17169e.f17229b.E0();
    }
}
