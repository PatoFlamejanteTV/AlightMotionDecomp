package com.mbridge.msdk.mbbanner.common.util;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbbanner.common.b.b;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f21686a = "a";

    /* renamed from: b, reason: collision with root package name */
    private final Handler f21687b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    private boolean f21688c;

    public final void b(final b bVar, final com.mbridge.msdk.foundation.c.b bVar2) {
        ad.b(f21686a, "postResourceFail unitId=" + bVar2);
        this.f21687b.post(new Runnable() { // from class: com.mbridge.msdk.mbbanner.common.util.a.4
            @Override // java.lang.Runnable
            public final void run() {
                if (bVar != null) {
                    bVar2.a(a.this.f21688c);
                    bVar.b(bVar2);
                }
            }
        });
    }

    public final void a(boolean z8) {
        this.f21688c = z8;
    }

    public final void a(final b bVar, final CampaignUnit campaignUnit, final String str) {
        ad.b(f21686a, "postCampaignSuccess unitId=" + str);
        this.f21687b.post(new Runnable() { // from class: com.mbridge.msdk.mbbanner.common.util.a.1
            @Override // java.lang.Runnable
            public final void run() {
                b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.a(str, campaignUnit, a.this.f21688c);
                }
            }
        });
    }

    public final void a(final b bVar, final com.mbridge.msdk.foundation.c.b bVar2) {
        this.f21687b.post(new Runnable() { // from class: com.mbridge.msdk.mbbanner.common.util.a.2
            @Override // java.lang.Runnable
            public final void run() {
                if (bVar != null) {
                    bVar2.a(a.this.f21688c);
                    bVar.a(bVar2);
                }
            }
        });
    }

    public final void a(final b bVar, final String str) {
        ad.b(f21686a, "postResourceSuccess unitId=" + str);
        this.f21687b.post(new Runnable() { // from class: com.mbridge.msdk.mbbanner.common.util.a.3
            @Override // java.lang.Runnable
            public final void run() {
                b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.a(str, a.this.f21688c);
                }
            }
        });
    }
}
