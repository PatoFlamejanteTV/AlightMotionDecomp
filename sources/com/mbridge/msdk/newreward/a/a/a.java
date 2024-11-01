package com.mbridge.msdk.newreward.a.a;

import com.mbridge.msdk.newout.RewardVideoListener;
import com.mbridge.msdk.newreward.a.e;
import com.mbridge.msdk.newreward.function.c.c;
import com.mbridge.msdk.out.MBridgeIds;

/* loaded from: classes4.dex */
public abstract class a implements com.mbridge.msdk.newreward.a.b.b {

    /* renamed from: d, reason: collision with root package name */
    private static String f21960d = "LoadController";

    /* renamed from: a, reason: collision with root package name */
    protected c f21961a;

    /* renamed from: b, reason: collision with root package name */
    protected MBridgeIds f21962b;

    /* renamed from: c, reason: collision with root package name */
    protected e f21963c;

    /* renamed from: e, reason: collision with root package name */
    private RewardVideoListener f21964e;

    public a(c cVar) {
        this.f21961a = cVar;
    }

    public final void a(int i8, Object obj) {
        if (i8 == 1) {
            if (this.f21963c.h()) {
                return;
            }
            c cVar = this.f21961a;
            e eVar = this.f21963c;
            cVar.a(eVar, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_V3_CAMPAIGN_SUCCESS, cVar.a("metrics_data", obj, "auto_load", Integer.valueOf(eVar.B() ? 2 : 1), "cache", 2));
            if (this.f21964e != null) {
                this.f21963c.c(true);
                this.f21964e.onLoadSuccess(this.f21962b);
                return;
            }
            return;
        }
        if (i8 != 2) {
            return;
        }
        this.f21963c.b(2);
        if (this.f21963c.i()) {
            return;
        }
        c cVar2 = this.f21961a;
        cVar2.a(this.f21963c, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_VIDEO_CAMPAIGN_SUCCESS, cVar2.a("cache", 2));
        if (this.f21964e != null) {
            this.f21963c.d(true);
            this.f21964e.onVideoLoadSuccess(this.f21962b);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(final com.mbridge.msdk.foundation.c.b bVar) {
        c cVar = this.f21961a;
        cVar.b(cVar.a("adapter_model", this.f21963c, "command_manager", cVar, "scene", 2, "reason", bVar), new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.a.a.a.2
            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(Object obj) {
                a.this.a(1, obj);
                a.this.a(2, obj);
            }

            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(com.mbridge.msdk.foundation.c.b bVar2) {
                a aVar = a.this;
                aVar.a(aVar.f21962b, bVar);
            }
        });
    }

    public final void a(MBridgeIds mBridgeIds, com.mbridge.msdk.foundation.c.b bVar) {
        this.f21963c.b(2);
        if (this.f21963c.i()) {
            return;
        }
        c cVar = this.f21961a;
        cVar.a(this.f21963c, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_FAILED, cVar.a("metrics_data", bVar));
        if (this.f21964e != null) {
            this.f21963c.d(true);
            RewardVideoListener rewardVideoListener = this.f21964e;
            if (rewardVideoListener != null) {
                rewardVideoListener.onVideoLoadFail(mBridgeIds, bVar.b());
            }
        }
    }

    public final void a(e eVar) {
        eVar.b(1);
        this.f21963c = eVar;
        this.f21964e = eVar.D();
        MBridgeIds mBridgeIds = (MBridgeIds) this.f21961a.a((Object) null, com.mbridge.msdk.newreward.function.c.e.CREATE_BIDS);
        this.f21962b = mBridgeIds;
        mBridgeIds.setLocalRequestId(this.f21963c.z());
        this.f21962b.setBidToken(this.f21963c.C());
        c cVar = this.f21961a;
        cVar.c(cVar.a("command_type", com.mbridge.msdk.newreward.function.c.e.PRE_HANDLE_LOAD, "command_manager", cVar, "adapter_model", this.f21963c), new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.a.a.a.1
            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(Object obj) {
                a aVar = a.this;
                c cVar2 = aVar.f21961a;
                cVar2.a(cVar2.a("command_manager", cVar2, "adapter_model", aVar.f21963c), a.this);
            }

            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(com.mbridge.msdk.foundation.c.b bVar) {
                a aVar = a.this;
                aVar.a(aVar.f21962b, bVar);
            }
        });
    }
}
