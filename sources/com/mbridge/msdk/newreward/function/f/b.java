package com.mbridge.msdk.newreward.function.f;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final int f22452a;

    /* renamed from: b, reason: collision with root package name */
    private final String f22453b;

    /* renamed from: c, reason: collision with root package name */
    private final String f22454c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f22455d;

    /* renamed from: g, reason: collision with root package name */
    private Handler f22458g;

    /* renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.c.c f22460i;

    /* renamed from: l, reason: collision with root package name */
    private com.mbridge.msdk.newreward.a.d f22463l;

    /* renamed from: j, reason: collision with root package name */
    private volatile boolean f22461j = false;

    /* renamed from: k, reason: collision with root package name */
    private volatile boolean f22462k = false;

    /* renamed from: e, reason: collision with root package name */
    private int f22456e = af.a().a(MBridgeCommon.SettingConfig.KEY_SETTING_CONFIG_LOAD_CHECK_INTERVAL, 120000);

    /* renamed from: h, reason: collision with root package name */
    private long f22459h = af.a().a(MBridgeCommon.SettingConfig.KEY_SETTING_CONFIG_LOAD_TOKEN_VALIDITY_PERIOD, 1800000);

    /* renamed from: f, reason: collision with root package name */
    private boolean f22457f = af.a().a(MBridgeCommon.SettingConfig.KEY_SETTING_CONFIG_LOAD_CHECK_OPTIMIZED, false);

    public b(int i8, String str, String str2, boolean z8) {
        this.f22452a = i8;
        this.f22453b = str;
        this.f22454c = str2;
        this.f22455d = z8;
    }

    public final void a(com.mbridge.msdk.newreward.function.c.c cVar, com.mbridge.msdk.newreward.a.d dVar) {
        if (cVar != null && dVar != null) {
            if (!this.f22457f) {
                a();
                return;
            }
            this.f22463l = dVar;
            this.f22460i = cVar;
            HandlerThread handlerThread = new HandlerThread("load_check_controller");
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper());
            this.f22458g = handler;
            handler.postDelayed(new Runnable() { // from class: com.mbridge.msdk.newreward.function.f.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        b.a(b.this);
                    } catch (Exception e8) {
                        ad.a("LoadCheckController", "startCheckTask error: " + e8.getMessage());
                    }
                    b.this.f22458g.postDelayed(this, b.this.f22456e);
                }
            }, this.f22456e);
            return;
        }
        a();
    }

    private void a() {
        com.mbridge.msdk.newreward.function.e.c.a().b().b(this.f22452a, this.f22453b, this.f22454c);
    }

    private void a(com.mbridge.msdk.newreward.a.e eVar, com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.a.b.b bVar2) {
        eVar.y().a(bVar, bVar2);
    }

    private com.mbridge.msdk.newreward.a.e a(com.mbridge.msdk.newreward.function.d.a.b bVar) {
        com.mbridge.msdk.newreward.a.e eVar = new com.mbridge.msdk.newreward.a.e(false, this.f22452a, bVar.f(), this.f22454c, bVar.g());
        eVar.e(bVar.e());
        eVar.e(30000);
        eVar.f(MBridgeCommon.DEFAULT_LOAD_TIMEOUT);
        eVar.d(this.f22453b);
        eVar.e(true);
        eVar.f(false);
        eVar.g(false);
        return eVar;
    }

    static /* synthetic */ void a(b bVar) {
        if (bVar.f22463l.a() != null) {
            Iterator<com.mbridge.msdk.newreward.a.e> it = bVar.f22463l.a().iterator();
            while (it.hasNext()) {
                if (it.next().s() == 1) {
                    return;
                }
            }
        }
        if (bVar.f22461j) {
            return;
        }
        bVar.f22461j = true;
        com.mbridge.msdk.newreward.function.e.c.a().b().a(bVar.f22452a, bVar.f22453b, bVar.f22454c, bVar.f22455d, new com.mbridge.msdk.newreward.function.e.b() { // from class: com.mbridge.msdk.newreward.function.f.b.2
            @Override // com.mbridge.msdk.newreward.function.e.b
            public final void a(List<com.mbridge.msdk.newreward.function.d.a.b> list) {
                b.a(b.this, list);
            }

            @Override // com.mbridge.msdk.newreward.function.e.b
            public final void a() {
                b.a(b.this, (com.mbridge.msdk.newreward.a.e) null, (com.mbridge.msdk.newreward.function.d.a.b) null);
            }
        });
    }

    static /* synthetic */ void a(b bVar, List list) {
        Iterator it = list.iterator();
        final com.mbridge.msdk.newreward.function.d.a.b bVar2 = null;
        final com.mbridge.msdk.newreward.function.d.a.b bVar3 = null;
        while (it.hasNext()) {
            com.mbridge.msdk.newreward.function.d.a.b bVar4 = (com.mbridge.msdk.newreward.function.d.a.b) it.next();
            if (bVar4.g()) {
                long G8 = bVar4.G();
                if (G8 == 0) {
                    com.mbridge.msdk.newreward.function.e.c.a().b().b(bVar4.a(), bVar4.b(), bVar4.c(), bVar4.e(), 8);
                } else if (TextUtils.isEmpty(bVar4.f())) {
                    com.mbridge.msdk.newreward.function.e.c.a().b().b(bVar4.a(), bVar4.b(), bVar4.c(), bVar4.e(), 8);
                } else if (System.currentTimeMillis() - G8 > bVar.f22459h && bVar4.s() == null) {
                    com.mbridge.msdk.newreward.function.e.c.a().b().b(bVar4.a(), bVar4.b(), bVar4.c(), bVar4.e(), 8);
                } else if (bVar4.q() > 0.0d || bVar4.E() == 1) {
                    if (bVar3 != null && bVar4.q() <= bVar3.q()) {
                    }
                    bVar3 = bVar4;
                } else {
                    com.mbridge.msdk.newreward.function.e.c.a().b().b(bVar4.a(), bVar4.b(), bVar4.c(), bVar4.e(), 8);
                }
            } else if (bVar4.G() == 0) {
                com.mbridge.msdk.newreward.function.e.c.a().b().b(bVar4.a(), bVar4.b(), bVar4.c(), bVar4.e(), 8);
            } else if (bVar4.C() == null || bVar4.C().size() == 0) {
                com.mbridge.msdk.newreward.function.e.c.a().b().b(bVar4.a(), bVar4.b(), bVar4.c(), bVar4.e(), 8);
            } else {
                if (bVar3 != null && bVar4.G() <= bVar3.G()) {
                }
                bVar3 = bVar4;
            }
        }
        if (list.size() != 0 && !bVar.f22462k) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                com.mbridge.msdk.newreward.function.d.a.b bVar5 = (com.mbridge.msdk.newreward.function.d.a.b) it2.next();
                if (bVar5 != bVar3 && bVar5.s() != null && (bVar2 == null || bVar5.G() > bVar2.G())) {
                    bVar2 = bVar5;
                }
            }
        }
        if (!bVar.f22462k && bVar2 != null) {
            bVar.f22462k = true;
            final com.mbridge.msdk.newreward.a.e a9 = bVar.a(bVar2);
            try {
                com.mbridge.msdk.newreward.function.c.c cVar = bVar.f22460i;
                cVar.a(a9, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_CHECK, cVar.a("check_type", "download_start_resource", "campaign", bVar2));
            } catch (Exception e8) {
                ad.b("LoadCheckController", "handlerAnthonyNeedDownloadCampaign error: " + e8.getMessage());
            }
            bVar.a(a9, bVar2, new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.function.f.b.4
                @Override // com.mbridge.msdk.newreward.a.b.b
                public final void a(Object obj) {
                    b.this.f22462k = false;
                    try {
                        b.this.f22460i.a(a9, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_CHECK, b.this.f22460i.a("check_type", "download_success", "campaign", bVar2));
                    } catch (Exception e9) {
                        ad.b("LoadCheckController", "handlerAnthonyNeedDownloadCampaign error: " + e9.getMessage());
                    }
                }

                @Override // com.mbridge.msdk.newreward.a.b.b
                public final void a(com.mbridge.msdk.foundation.c.b bVar6) {
                    b.this.f22462k = false;
                    try {
                        b.this.f22460i.a(a9, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_CHECK, b.this.f22460i.a("check_type", "download_failed", "campaign", bVar2));
                    } catch (Exception e9) {
                        ad.b("LoadCheckController", "handlerAnthonyNeedDownloadCampaign error: " + e9.getMessage());
                    }
                }
            });
        }
        if (bVar3 != null) {
            List<CampaignEx> C8 = bVar3.C();
            final com.mbridge.msdk.newreward.a.e a10 = bVar.a(bVar3);
            if (C8 == null) {
                try {
                    com.mbridge.msdk.newreward.function.c.c cVar2 = bVar.f22460i;
                    cVar2.a(a10, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_CHECK, cVar2.a("check_type", "check_start_campaign"));
                } catch (Exception e9) {
                    ad.b("LoadCheckController", "handlerLoadFailedCampaigns error: " + e9.getMessage());
                }
                com.mbridge.msdk.newreward.function.c.c cVar3 = bVar.f22460i;
                cVar3.a(cVar3.a("command_manager", cVar3, "adapter_model", a10), new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.function.f.b.5
                    @Override // com.mbridge.msdk.newreward.a.b.b
                    public final void a(Object obj) {
                        b.a(b.this, bVar3, a10);
                    }

                    @Override // com.mbridge.msdk.newreward.a.b.b
                    public final void a(com.mbridge.msdk.foundation.c.b bVar6) {
                        b.a(b.this, a10, bVar3);
                    }
                });
                return;
            }
            try {
                com.mbridge.msdk.newreward.function.c.c cVar4 = bVar.f22460i;
                cVar4.a(a10, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_CHECK, cVar4.a("check_type", "check_start_resource"));
            } catch (Exception e10) {
                ad.b("LoadCheckController", "handlerLoadFailedCampaigns error: " + e10.getMessage());
            }
            bVar.a(a10, bVar3, new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.function.f.b.3
                @Override // com.mbridge.msdk.newreward.a.b.b
                public final void a(Object obj) {
                    b.a(b.this, bVar3, a10);
                }

                @Override // com.mbridge.msdk.newreward.a.b.b
                public final void a(com.mbridge.msdk.foundation.c.b bVar6) {
                    b.a(b.this, a10, bVar3);
                }
            });
            return;
        }
        bVar.f22461j = false;
    }

    static /* synthetic */ void a(b bVar, com.mbridge.msdk.newreward.a.e eVar, com.mbridge.msdk.newreward.function.d.a.b bVar2) {
        Map a9;
        bVar.f22461j = false;
        if (eVar == null) {
            return;
        }
        try {
            if (bVar2 == null) {
                a9 = bVar.f22460i.a("check_type", "check_failed");
            } else {
                a9 = bVar.f22460i.a("check_type", "check_failed", "campaign", bVar2);
            }
            bVar.f22460i.a(eVar, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_CHECK, a9);
        } catch (Exception e8) {
            ad.b("LoadCheckController", "reportLoadCheckFailed error: " + e8.getMessage());
        }
    }

    static /* synthetic */ void a(b bVar, com.mbridge.msdk.newreward.function.d.a.b bVar2, com.mbridge.msdk.newreward.a.e eVar) {
        bVar.f22461j = false;
        if (eVar == null) {
            return;
        }
        com.mbridge.msdk.newreward.function.c.c cVar = bVar.f22460i;
        cVar.a(eVar, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_CHECK, cVar.a("check_type", "check_success", "campaign", bVar2));
        eVar.d(true);
        if (!bVar2.g() || bVar2.q() <= 0.0d) {
            bVar.f22463l.a(eVar);
        }
    }
}
