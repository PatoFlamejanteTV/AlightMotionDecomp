package com.google.android.gms.measurement.internal;

import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.a4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2312a4 extends AbstractC2439t {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ F3 f17672e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2312a4(F3 f32, InterfaceC2478y3 interfaceC2478y3) {
        super(interfaceC2478y3);
        this.f17672e = f32;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2439t
    public final void d() {
        AbstractC2439t abstractC2439t;
        if (this.f17672e.f18099a.r()) {
            abstractC2439t = this.f17672e.f17218s;
            abstractC2439t.b(AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        }
    }
}
