package com.mbridge.msdk.newreward.function.c.b.a;

import android.text.TextUtils;
import androidx.work.WorkRequest;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.newreward.a.c.a;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import com.mbridge.msdk.newreward.function.common.MBridgeOffsetManager;
import com.mbridge.msdk.newreward.function.d.c.n;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class d implements a.InterfaceC0414a, com.mbridge.msdk.newreward.function.c.b.a {

    /* renamed from: a, reason: collision with root package name */
    com.mbridge.msdk.newreward.function.c.a.a f22149a;

    /* renamed from: b, reason: collision with root package name */
    com.mbridge.msdk.newreward.a.b.b f22150b;

    /* renamed from: c, reason: collision with root package name */
    com.mbridge.msdk.newreward.function.c.c f22151c;

    /* renamed from: d, reason: collision with root package name */
    com.mbridge.msdk.newreward.a.e f22152d;

    /* renamed from: e, reason: collision with root package name */
    com.mbridge.msdk.newreward.function.c.b.b.c f22153e;

    /* renamed from: i, reason: collision with root package name */
    private Map f22157i;

    /* renamed from: f, reason: collision with root package name */
    private String f22154f = UUID.randomUUID().toString();

    /* renamed from: g, reason: collision with root package name */
    private String f22155g = UUID.randomUUID().toString();

    /* renamed from: h, reason: collision with root package name */
    private long f22156h = WorkRequest.MIN_BACKOFF_MILLIS;

    /* renamed from: j, reason: collision with root package name */
    private volatile boolean f22158j = false;

    /* loaded from: classes4.dex */
    private class b implements com.mbridge.msdk.newreward.a.b.b {
        private b() {
        }

        @Override // com.mbridge.msdk.newreward.a.b.b
        public final void a(Object obj) {
            com.mbridge.msdk.newreward.a.c.a.a().a(d.this.f22154f);
            d dVar = d.this;
            dVar.f22150b.a(dVar.f22151c.a("type", 2, "object", obj));
        }

        @Override // com.mbridge.msdk.newreward.a.b.b
        public final void a(com.mbridge.msdk.foundation.c.b bVar) {
            d dVar = d.this;
            com.mbridge.msdk.newreward.function.c.b.b.e eVar = new com.mbridge.msdk.newreward.function.c.b.b.e(bVar, dVar.f22152d, dVar.f22151c, 2);
            com.mbridge.msdk.newreward.function.c.b.b.c cVar = d.this.f22153e;
            if (cVar == null || !cVar.a(eVar)) {
                com.mbridge.msdk.newreward.a.c.a.a().a(d.this.f22154f);
                com.mbridge.msdk.newreward.function.e.c.a().b().a(d.this.f22152d.p(), d.this.f22152d.w(), d.this.f22152d.A(), d.this.f22152d.z(), MBridgeCommon.CampaignState.STATE_LOAD_FAILED_RESOURCE_DOWNLOAD_ERROR);
                d.this.f22150b.a(bVar);
                return;
            }
            d.this.f22153e.a(eVar, this);
        }
    }

    private int b() {
        com.mbridge.msdk.newreward.function.f.e r8;
        com.mbridge.msdk.videocommon.d.c b9;
        try {
            com.mbridge.msdk.newreward.a.e eVar = this.f22152d;
            return (eVar == null || (r8 = eVar.r()) == null || (b9 = r8.b()) == null) ? MBridgeCommon.DEFAULT_LOAD_TIMEOUT : b9.F() * 1000;
        } catch (Exception unused) {
            return MBridgeCommon.DEFAULT_LOAD_TIMEOUT;
        }
    }

    public final void a(com.mbridge.msdk.newreward.function.c.a.a aVar) {
        this.f22149a = aVar;
        this.f22153e = new com.mbridge.msdk.newreward.function.c.b.b.c(aVar);
    }

    @Override // com.mbridge.msdk.newreward.function.c.b.a
    public final void a(com.mbridge.msdk.newreward.function.c.b bVar, com.mbridge.msdk.newreward.a.b.b bVar2) {
        try {
            this.f22150b = bVar2;
            int b9 = b();
            com.mbridge.msdk.newreward.a.c.a.a().a(this.f22154f, b9, this);
            bVar.a(com.mbridge.msdk.newreward.function.c.e.REQ_CAMPAIGN);
            Map map = (Map) bVar.b();
            this.f22157i = map;
            this.f22151c = (com.mbridge.msdk.newreward.function.c.c) map.get("command_manager");
            com.mbridge.msdk.newreward.a.e eVar = (com.mbridge.msdk.newreward.a.e) this.f22157i.get("adapter_model");
            this.f22152d = eVar;
            eVar.f(b9);
            com.mbridge.msdk.newreward.function.c.c cVar = this.f22151c;
            com.mbridge.msdk.newreward.a.e eVar2 = this.f22152d;
            cVar.a(eVar2, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_V3_START, cVar.a("auto_load", Integer.valueOf(eVar2.B() ? 2 : 1), "hst", com.mbridge.msdk.foundation.same.net.g.d.f().a(this.f22152d.C())));
            this.f22149a.a(bVar, new a(bVar, this.f22157i));
            long a9 = af.a().a(MBridgeCommon.SettingConfig.KEY_SETTING_CONFIG_RETRY_STRATEGY, MBridgeCommon.SettingConfig.KEY_SETTING_CONFIG_RETRY_STRATEGY_CAMPAIGN_RETRY_TIMEOUT, 0);
            this.f22156h = a9;
            if (a9 > 0) {
                com.mbridge.msdk.newreward.a.c.a.a().a(this.f22155g, this.f22156h, this);
            }
            com.mbridge.msdk.newreward.function.e.c.a().b().a(this.f22152d.p(), this.f22152d.w(), this.f22152d.A(), this.f22152d.z(), !TextUtils.isEmpty(this.f22152d.C()), this.f22152d.C(), this.f22152d.L());
        } catch (Exception e8) {
            ad.a("LoadControllerReceiver", "action", e8);
            if (this.f22152d != null) {
                com.mbridge.msdk.newreward.function.e.c.a().b().a(this.f22152d.p(), this.f22152d.w(), this.f22152d.A(), this.f22152d.z(), 8);
            }
            com.mbridge.msdk.newreward.a.c.a.a().a(this.f22155g);
            com.mbridge.msdk.newreward.a.c.a.a().a(this.f22154f);
            if (bVar2 != null) {
                bVar2.a(new com.mbridge.msdk.foundation.c.b(880020, e8.getMessage()));
            }
        }
    }

    /* loaded from: classes4.dex */
    private final class a implements com.mbridge.msdk.newreward.a.b.b {

        /* renamed from: b, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.function.c.b f22160b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f22161c;

        public a(com.mbridge.msdk.newreward.function.c.b bVar, Map map) {
            this.f22160b = bVar;
            this.f22161c = map;
        }

        @Override // com.mbridge.msdk.newreward.a.b.b
        public final void a(Object obj) {
            com.mbridge.msdk.foundation.c.b a9;
            com.mbridge.msdk.newreward.a.c.a.a().a(d.this.f22155g);
            if (d.this.f22158j) {
                return;
            }
            d.this.f22158j = true;
            com.mbridge.msdk.newreward.function.d.a.b bVar = (com.mbridge.msdk.newreward.function.d.a.b) obj;
            d dVar = d.this;
            com.mbridge.msdk.newreward.function.c.c cVar = dVar.f22151c;
            com.mbridge.msdk.newreward.a.e eVar = dVar.f22152d;
            cVar.a(eVar, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_V3_RES_SUCCESS, cVar.a("metrics_data", bVar, "auto_load", Integer.valueOf(eVar.B() ? 2 : 1), "result", 1, "cache", 2, "timeout", Integer.valueOf(d.this.f22152d.I()), "hst", bVar != null ? bVar.H() : ""));
            d dVar2 = d.this;
            dVar2.f22150b.a(dVar2.f22151c.a("type", 1, "object", bVar));
            ((MBridgeOffsetManager) d.this.f22151c.a((Object) null, com.mbridge.msdk.newreward.function.c.e.CREATE_OFFSET)).increaseOffset(bVar.s().size());
            d dVar3 = d.this;
            com.mbridge.msdk.newreward.function.c.c cVar2 = dVar3.f22151c;
            cVar2.d(cVar2.a("adapter_model", dVar3.f22152d, "campaign", bVar));
            try {
                d dVar4 = d.this;
                com.mbridge.msdk.newreward.function.c.c cVar3 = dVar4.f22151c;
                cVar3.c(cVar3.a("adapter_model", dVar4.f22152d, "campaign", bVar));
                this.f22160b.a(com.mbridge.msdk.newreward.function.c.e.REQ_DOWN_CAMPAIGN);
                this.f22161c.put("campaign", bVar);
                this.f22160b.a(this.f22161c);
                d dVar5 = d.this;
                dVar5.f22149a.a(this.f22160b, new b());
            } catch (MBridgeError e8) {
                com.mbridge.msdk.newreward.a.c.a.a().a(d.this.f22154f);
                com.mbridge.msdk.newreward.function.e.c.a().b().a(bVar.a(), bVar.b(), bVar.c(), bVar.e(), 403);
                if (e8.getErrorMessage().contains("APP ALREADY INSTALLED")) {
                    a9 = com.mbridge.msdk.foundation.c.a.a(e8.getErrorCode(), 880021, "errorCode: 3507 errorMessage: data load failed, errorMsg is " + e8.getErrorMessage());
                } else {
                    a9 = com.mbridge.msdk.foundation.c.a.a(e8.getErrorCode(), 880003, "errorCode: 3507 errorMessage: data load failed, errorMsg is " + e8.getErrorMessage());
                }
                d.this.f22150b.a(a9);
            }
        }

        @Override // com.mbridge.msdk.newreward.a.b.b
        public final void a(com.mbridge.msdk.foundation.c.b bVar) {
            d dVar = d.this;
            com.mbridge.msdk.newreward.function.c.b.b.e eVar = new com.mbridge.msdk.newreward.function.c.b.b.e(bVar, dVar.f22152d, dVar.f22151c, 1);
            if (!d.this.f22153e.a(eVar)) {
                com.mbridge.msdk.newreward.a.c.a.a().a(d.this.f22155g);
                com.mbridge.msdk.newreward.a.c.a.a().a(d.this.f22154f);
                if (d.this.f22158j) {
                    return;
                }
                d.this.f22158j = true;
                try {
                    d dVar2 = d.this;
                    com.mbridge.msdk.newreward.function.c.c cVar = dVar2.f22151c;
                    com.mbridge.msdk.newreward.a.e eVar2 = dVar2.f22152d;
                    cVar.a(eVar2, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_V3_RES_FAIL, cVar.a("auto_load", Integer.valueOf(eVar2.B() ? 2 : 1), "result", Integer.valueOf(bVar.m() ? 1 : 2), "code", Integer.valueOf(bVar.i()), "reason", bVar.b(), "timeout", Integer.valueOf(d.this.f22152d.I()), "hst", bVar.j(), "err_desc", bVar.l()));
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
                ((MBridgeOffsetManager) d.this.f22151c.a((Object) null, com.mbridge.msdk.newreward.function.c.e.CREATE_OFFSET)).resetOffset();
                if (bVar != null) {
                    try {
                        if (bVar.a("campaign_request_error_type") != null) {
                            com.mbridge.msdk.newreward.function.e.c.a().b().a(d.this.f22152d.p(), d.this.f22152d.w(), d.this.f22152d.A(), d.this.f22152d.z(), ((Integer) bVar.a("campaign_request_error_type")).intValue());
                        }
                    } catch (Exception unused) {
                    }
                }
                d.this.f22150b.a(bVar);
                return;
            }
            d.this.f22153e.a(eVar, this);
        }
    }

    @Override // com.mbridge.msdk.newreward.a.c.a.InterfaceC0414a
    public final void a(String str, long j8) {
        if (TextUtils.equals(str, this.f22154f)) {
            com.mbridge.msdk.newreward.function.e.c.a().b().a(this.f22152d.p(), this.f22152d.w(), this.f22152d.A(), this.f22152d.z(), MBridgeCommon.CampaignState.STATE_LOAD_FAILED_TIMEOUT);
            String a9 = a();
            this.f22150b.a(new com.mbridge.msdk.foundation.c.b(880010, "errorCode: 3401 errorMessage: " + a9));
            return;
        }
        if (!TextUtils.equals(str, this.f22155g) || this.f22153e == null) {
            return;
        }
        com.mbridge.msdk.newreward.function.c.b.b.e eVar = new com.mbridge.msdk.newreward.function.c.b.b.e(null, this.f22152d, this.f22151c, 3);
        com.mbridge.msdk.newreward.function.c.b bVar = new com.mbridge.msdk.newreward.function.c.b();
        bVar.a(com.mbridge.msdk.newreward.function.c.e.REQ_CAMPAIGN);
        com.mbridge.msdk.newreward.function.c.c cVar = this.f22151c;
        bVar.a(cVar.a("adapter_model", this.f22152d, "command_manager", cVar));
        this.f22153e.a(eVar, new a(bVar, this.f22157i));
    }

    private String a() {
        StringBuilder sb = new StringBuilder();
        try {
            com.mbridge.msdk.newreward.a.e eVar = this.f22152d;
            if (eVar != null && eVar.x() != null) {
                com.mbridge.msdk.newreward.function.d.a.b b9 = this.f22152d.x().b();
                if (b9 != null && b9.s() != null && b9.s().size() > 0) {
                    for (com.mbridge.msdk.newreward.function.d.a.a aVar : b9.s()) {
                        if (aVar != null) {
                            n d8 = aVar.d();
                            if (d8 != null && !d8.c()) {
                                sb.append(" video timeout ");
                            }
                            com.mbridge.msdk.newreward.function.d.c.d<?> c8 = aVar.c();
                            if (c8 != null && !c8.c()) {
                                sb.append(" video_template timeout ");
                            }
                            com.mbridge.msdk.newreward.function.d.c.d<?> f8 = aVar.f();
                            if (f8 != null && !f8.c()) {
                                sb.append(" ec_template timeout ");
                            }
                        }
                    }
                } else {
                    sb.append(" load timeout ");
                }
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
        return sb.toString();
    }
}
