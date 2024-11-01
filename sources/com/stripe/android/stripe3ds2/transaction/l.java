package com.stripe.android.stripe3ds2.transaction;

import a4.C1669c;
import android.app.Application;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.stripe.android.stripe3ds2.transaction.q;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final Application f28122a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f28123b;

    /* renamed from: c, reason: collision with root package name */
    private final c4.q f28124c;

    /* renamed from: d, reason: collision with root package name */
    private final Y3.m f28125d;

    /* renamed from: e, reason: collision with root package name */
    private final List f28126e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f28127f;

    /* renamed from: g, reason: collision with root package name */
    private final U5.g f28128g;

    public l(Application application, boolean z8, c4.q sdkTransactionId, Y3.m uiCustomization, List rootCerts, boolean z9, U5.g workContext) {
        AbstractC3292y.i(application, "application");
        AbstractC3292y.i(sdkTransactionId, "sdkTransactionId");
        AbstractC3292y.i(uiCustomization, "uiCustomization");
        AbstractC3292y.i(rootCerts, "rootCerts");
        AbstractC3292y.i(workContext, "workContext");
        this.f28122a = application;
        this.f28123b = z8;
        this.f28124c = sdkTransactionId;
        this.f28125d = uiCustomization;
        this.f28126e = rootCerts;
        this.f28127f = z9;
        this.f28128g = workContext;
    }

    public final c4.n a() {
        o a9 = o.f28138a.a(this.f28127f);
        Z3.a aVar = new Z3.a(this.f28122a, new Z3.e(this.f28124c), this.f28128g, a9, null, null, null, 0, PsExtractor.VIDEO_STREAM_MASK, null);
        return new j(this.f28124c, new c4.p(), new c4.h(this.f28123b, this.f28126e, aVar), new C1669c(this.f28123b), new c4.f(aVar), new i(aVar, this.f28128g), new q.b(this.f28128g), this.f28125d, aVar, a9);
    }
}
