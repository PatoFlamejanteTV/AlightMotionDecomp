package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class T4 extends AbstractC2439t {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ F4 f17581e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T4(F4 f42, InterfaceC2478y3 interfaceC2478y3) {
        super(interfaceC2478y3);
        this.f17581e = f42;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2439t
    public final void d() {
        this.f17581e.a().L().a("Tasks have been queued for a long time");
    }
}
