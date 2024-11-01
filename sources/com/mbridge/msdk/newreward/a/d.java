package com.mbridge.msdk.newreward.a;

import android.os.SystemClock;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.newout.RewardVideoListener;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import com.mbridge.msdk.newreward.function.common.MBridgeDailyPlayModel;
import com.mbridge.msdk.newreward.function.common.MBridgeSharedPreferenceModel;
import com.mbridge.msdk.out.MBridgeIds;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedDeque;

/* loaded from: classes4.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    private Deque<e> f22043a;

    /* renamed from: c, reason: collision with root package name */
    private RewardVideoListener f22045c;

    /* renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.f.e f22046d;

    /* renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.c.c f22047e;

    /* renamed from: f, reason: collision with root package name */
    private MBridgeIds f22048f;

    /* renamed from: g, reason: collision with root package name */
    private Map f22049g;

    /* renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.newreward.b.b f22050h;

    /* renamed from: b, reason: collision with root package name */
    private final Object f22044b = new Object();

    /* renamed from: i, reason: collision with root package name */
    private int f22051i = 1;

    /* renamed from: j, reason: collision with root package name */
    private int f22052j = 1;

    public d() {
        if (this.f22043a == null) {
            this.f22043a = new ConcurrentLinkedDeque();
        }
    }

    @Override // com.mbridge.msdk.newreward.a.c
    public final boolean d() {
        Iterator<e> it = this.f22043a.iterator();
        while (it.hasNext()) {
            if (it.next().x().c()) {
                return true;
            }
        }
        return false;
    }

    public final void b(Object obj) {
        for (com.mbridge.msdk.newreward.function.d.a.b bVar : (List) obj) {
            e eVar = new e(false, ((Integer) this.f22049g.get("mb_ad_type")).intValue(), bVar.f(), bVar.c(), bVar.g());
            com.mbridge.msdk.newreward.function.f.a aVar = new com.mbridge.msdk.newreward.function.f.a();
            aVar.a(bVar);
            eVar.a(aVar);
            eVar.a(this.f22046d);
            eVar.b(2);
            eVar.f22068a = new f(this.f22047e);
            eVar.a(this.f22045c);
            this.f22043a.add(eVar);
        }
    }

    @Override // com.mbridge.msdk.newreward.a.c
    public final void c() {
        e peek;
        synchronized (this.f22044b) {
            try {
                if (this.f22043a.size() == 0) {
                    this.f22050h.a(com.mbridge.msdk.newreward.function.h.b.a(""));
                    this.f22047e.a(this.f22050h, com.mbridge.msdk.newreward.function.c.e.REPORT_SHOW_START, (Object) null);
                    this.f22045c.onShowFail(this.f22048f, "no adapter_model");
                    a("no adapter_model");
                    return;
                }
                while (a(2) > this.f22051i) {
                    this.f22043a.pollFirst();
                }
                ConcurrentLinkedDeque concurrentLinkedDeque = new ConcurrentLinkedDeque();
                while (true) {
                    if (this.f22043a.size() == 0) {
                        break;
                    }
                    try {
                        peek = this.f22043a.peek();
                    } catch (Exception e8) {
                        if (this.f22043a.size() == 1) {
                            this.f22050h.a(com.mbridge.msdk.newreward.function.h.b.a(""));
                            this.f22045c.onShowFail(this.f22048f, e8.getMessage());
                            a(e8.getMessage());
                            break;
                        }
                    }
                    if (peek.x().c()) {
                        b(peek);
                        peek.f22068a.b(peek);
                        this.f22050h.a(peek);
                        this.f22043a.poll();
                        break;
                    }
                    if (peek.s() == 2 && !peek.x().c()) {
                        if (this.f22043a.size() == 1) {
                            this.f22050h.a(peek);
                            this.f22045c.onShowFail(this.f22048f, "no isReadyCampaign");
                            a("no isReadyCampaign");
                        }
                        this.f22043a.poll();
                    } else {
                        if (this.f22043a.size() == 1) {
                            this.f22050h.a(peek);
                            this.f22045c.onShowFail(this.f22048f, "all campaign is loading");
                            a("all campaign is loading");
                        }
                        concurrentLinkedDeque.push(this.f22043a.poll());
                    }
                }
                while (concurrentLinkedDeque.size() != 0) {
                    this.f22043a.push((e) concurrentLinkedDeque.poll());
                }
                com.mbridge.msdk.newreward.b.b bVar = this.f22050h;
                if (bVar != null) {
                    if (bVar.a() != null) {
                        this.f22047e.a(this.f22050h.a(), com.mbridge.msdk.newreward.function.c.e.REPORT_SHOW_START, (Object) null);
                    } else {
                        this.f22047e.a(this.f22050h, com.mbridge.msdk.newreward.function.c.e.REPORT_SHOW_START, (Object) null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.a.c
    public final void a(Object obj) {
        this.f22045c = (RewardVideoListener) obj;
    }

    @Override // com.mbridge.msdk.newreward.a.c
    public final void a(Object... objArr) {
        com.mbridge.msdk.newreward.function.c.c cVar = (com.mbridge.msdk.newreward.function.c.c) objArr[0];
        this.f22047e = cVar;
        com.mbridge.msdk.newreward.b.b bVar = (com.mbridge.msdk.newreward.b.b) objArr[1];
        this.f22050h = bVar;
        final Map a9 = cVar.a("mb_ad_type", Integer.valueOf(bVar.e()), "mb_ad_is_header_bidding", Boolean.valueOf(this.f22050h.f()), "mb_ad_pid", this.f22050h.d(), "mb_ad_unit_id", this.f22050h.c());
        this.f22048f = (MBridgeIds) this.f22047e.a(a9, com.mbridge.msdk.newreward.function.c.e.CREATE_BIDS);
        com.mbridge.msdk.newreward.function.c.c cVar2 = this.f22047e;
        cVar2.c(cVar2.a("mb_ad_unit_id", this.f22050h.c(), "command_type", com.mbridge.msdk.newreward.function.c.e.UNIT_INIT), new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.a.d.1
            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(com.mbridge.msdk.foundation.c.b bVar2) {
            }

            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(Object obj) {
            }
        });
        com.mbridge.msdk.newreward.function.e.c.a().b().a(this.f22050h.e(), this.f22050h.d(), this.f22050h.c());
        this.f22047e.a((Object) a9, com.mbridge.msdk.newreward.function.c.e.REQ_SETTING, new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.a.d.2
            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(com.mbridge.msdk.foundation.c.b bVar2) {
            }

            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(Object obj) {
                d.this.f22046d = (com.mbridge.msdk.newreward.function.f.e) obj;
                d.this.f22049g = a9;
                if (d.this.f22050h != null) {
                    d.this.f22050h.a(d.this.f22046d);
                }
                ((MBridgeDailyPlayModel) d.this.f22047e.a(a9, com.mbridge.msdk.newreward.function.c.e.CREATE_DAILY)).setMaxPlayCount(d.this.f22046d.b() == null ? 0 : d.this.f22046d.b().d());
            }
        });
        Map map = this.f22049g;
        map.put("command_type", com.mbridge.msdk.newreward.function.c.e.RESTORE_DB);
        this.f22047e.c(map, new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.a.d.3
            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(com.mbridge.msdk.foundation.c.b bVar2) {
            }

            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(Object obj) {
                d.this.b(obj);
            }
        });
        com.mbridge.msdk.newreward.function.c.c cVar3 = this.f22047e;
        cVar3.e(cVar3.a("controller_model", this.f22050h, "command_manager", cVar3, "adapter_manager", this));
        int a10 = af.a().a(MBridgeCommon.SharedPreference.KEY_LOADING_CAPACITY, 1);
        this.f22052j = a10;
        if (a10 <= 0) {
            this.f22052j = 1;
        }
    }

    private void b(e eVar) {
        e eVar2;
        if (eVar == null || TextUtils.isEmpty(eVar.b())) {
            return;
        }
        try {
            Deque<e> deque = this.f22043a;
            if (deque != null) {
                Iterator<e> it = deque.iterator();
                while (it.hasNext()) {
                    eVar2 = it.next();
                    if (eVar2 != null && eVar2.a() && (eVar2.x() == null || !eVar2.x().c())) {
                        if (eVar.b().equals(eVar2.z())) {
                            break;
                        }
                    }
                }
            }
            eVar2 = null;
            if (eVar2 != null) {
                com.mbridge.msdk.newreward.function.c.c cVar = this.f22047e;
                cVar.c(cVar.a("adapter_model", eVar, "queue_first_adapter_model", eVar2), com.mbridge.msdk.newreward.function.c.e.UPDATE_CAM_TOKEN_RULE);
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.a.c
    public final void a(e eVar, b bVar) {
        e peek;
        if (eVar == null || bVar == null) {
            return;
        }
        eVar.a(this.f22046d);
        eVar.a(this.f22045c);
        com.mbridge.msdk.newreward.function.c.c cVar = this.f22047e;
        if (cVar != null) {
            cVar.a(eVar, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_START, (Object) null);
        }
        int integer = MBridgeSharedPreferenceModel.getInstance().getInteger(String.format(MBridgeCommon.SharedPreference.KEY_VCN, this.f22050h.c()), 1);
        this.f22051i = integer;
        if (integer <= 0) {
            this.f22051i = 1;
        }
        if (a(1) < this.f22052j) {
            try {
                synchronized (this.f22044b) {
                    try {
                        if (c(eVar)) {
                            return;
                        }
                        if (d() && !eVar.l()) {
                            if (!TextUtils.isEmpty(eVar.C()) && com.mbridge.msdk.newreward.function.h.a.c(eVar.C())) {
                                com.mbridge.msdk.newreward.function.c.c cVar2 = this.f22047e;
                                if (((Boolean) cVar2.b(cVar2.a("adapter_model", eVar, "command_manager", cVar2, "candidate_type", 1, "reason", new com.mbridge.msdk.foundation.c.b(880038)))).booleanValue()) {
                                    eVar.g(true);
                                    com.mbridge.msdk.newreward.function.c.c cVar3 = this.f22047e;
                                    com.mbridge.msdk.newreward.function.a.b bVar2 = (com.mbridge.msdk.newreward.function.a.b) cVar3.b(cVar3.a("adapter_model", eVar, "command_manager", cVar3, "candidate_type", 2, "reason", new com.mbridge.msdk.foundation.c.b(880038)));
                                    if (bVar2 != null && bVar2.h() == com.mbridge.msdk.newreward.function.a.b.f22129d) {
                                        eVar.x().a(bVar2.a());
                                        a(eVar, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_V3_CAMPAIGN_SUCCESS);
                                        this.f22045c.onLoadSuccess(this.f22048f);
                                        eVar.c(true);
                                        a(eVar, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_VIDEO_CAMPAIGN_SUCCESS);
                                        this.f22045c.onVideoLoadSuccess(this.f22048f);
                                        eVar.d(true);
                                        break;
                                    }
                                }
                            }
                            int integer2 = MBridgeSharedPreferenceModel.getInstance().getInteger(String.format(MBridgeCommon.SharedPreference.KEY_VCN, eVar.A()), 1);
                            if (this.f22043a.size() != 0 && this.f22043a.size() >= integer2) {
                                if (TextUtils.isEmpty(eVar.C()) && (peek = this.f22043a.peek()) != null && peek.x() != null && peek.x().b() != null) {
                                    eVar.x().a(peek.x().b());
                                } else {
                                    for (e eVar2 : this.f22043a) {
                                        com.mbridge.msdk.newreward.function.d.a.b b9 = eVar2.x().b();
                                        if (b9 != null && b9.E() == 1) {
                                            eVar2.a(eVar.z());
                                            eVar.a(true);
                                        }
                                    }
                                }
                                a(eVar, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_V3_CAMPAIGN_SUCCESS);
                                this.f22045c.onLoadSuccess(this.f22048f);
                                eVar.c(true);
                                a(eVar, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_VIDEO_CAMPAIGN_SUCCESS);
                                this.f22045c.onVideoLoadSuccess(this.f22048f);
                                eVar.d(true);
                                break;
                            }
                        }
                        for (e eVar3 : this.f22043a) {
                            if (!eVar3.x().c() && eVar3.s() == 2) {
                                this.f22043a.remove(eVar3);
                                com.mbridge.msdk.foundation.same.report.d.c.a().c(eVar3.z());
                            }
                        }
                        try {
                            List<String> e8 = com.mbridge.msdk.newreward.function.e.c.a().b().e(eVar.p(), eVar.w(), eVar.A());
                            if (e8 != null && e8.size() > 0) {
                                Iterator<String> it = e8.iterator();
                                while (it.hasNext()) {
                                    com.mbridge.msdk.foundation.same.report.d.c.a().c(it.next());
                                }
                            }
                        } catch (Exception e9) {
                            if (MBridgeConstans.DEBUG) {
                                e9.printStackTrace();
                            }
                        }
                        while (a(2) > this.f22051i) {
                            this.f22043a.pollFirst();
                        }
                        this.f22043a.add(eVar);
                        eVar.f22068a = bVar;
                        eVar.a(SystemClock.elapsedRealtime());
                        bVar.a(eVar);
                        return;
                    } finally {
                    }
                }
            } catch (Exception e10) {
                this.f22045c.onVideoLoadFail(new MBridgeIds(), e10.getMessage());
                a(eVar, com.mbridge.msdk.foundation.c.a.b(880020, "errorCode: 3501 errorMessage: " + e10.getMessage()));
                com.mbridge.msdk.newreward.function.e.c.a().b().a(eVar.p(), eVar.w(), eVar.A(), eVar.z(), MBridgeCommon.CampaignState.STATE_LOAD_FAILED_EXCEPTION);
                return;
            }
        }
        this.f22045c.onVideoLoadFail(new MBridgeIds(), "current unit is loading");
        a(eVar, com.mbridge.msdk.foundation.c.a.b(880016, "errorCode: 3501 errorMessage: current unit is loading"));
    }

    @Override // com.mbridge.msdk.newreward.a.c
    public final e b() {
        e peek;
        Deque<e> deque = this.f22043a;
        if (deque == null || deque.size() == 0 || (peek = this.f22043a.peek()) == null) {
            return null;
        }
        return peek;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0062 A[Catch: Exception -> 0x0037, TRY_LEAVE, TryCatch #1 {Exception -> 0x0037, blocks: (B:3:0x0006, B:5:0x000a, B:7:0x0010, B:9:0x0022, B:11:0x002a, B:12:0x003d, B:14:0x0062), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ac A[Catch: Exception -> 0x008f, TRY_LEAVE, TryCatch #0 {Exception -> 0x008f, blocks: (B:17:0x0068, B:19:0x0084, B:23:0x009b, B:25:0x00ac), top: B:16:0x0068 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean c(com.mbridge.msdk.newreward.a.e r10) {
        /*
            r9 = this;
            r0 = 1
            r1 = 0
            java.lang.String r2 = "error_code"
            java.lang.String r3 = "msg"
            java.util.Deque<com.mbridge.msdk.newreward.a.e> r4 = r9.f22043a     // Catch: java.lang.Exception -> L37
            if (r4 == 0) goto L3b
            java.lang.Object r4 = r4.peek()     // Catch: java.lang.Exception -> L37
            if (r4 == 0) goto L3b
            java.util.Deque<com.mbridge.msdk.newreward.a.e> r4 = r9.f22043a     // Catch: java.lang.Exception -> L37
            java.lang.Object r4 = r4.peek()     // Catch: java.lang.Exception -> L37
            com.mbridge.msdk.newreward.a.e r4 = (com.mbridge.msdk.newreward.a.e) r4     // Catch: java.lang.Exception -> L37
            java.lang.String r4 = r4.q()     // Catch: java.lang.Exception -> L37
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L37
            if (r5 != 0) goto L3b
            java.lang.String r5 = "-1"
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Exception -> L37
            if (r4 == 0) goto L3b
            java.util.Deque<com.mbridge.msdk.newreward.a.e> r4 = r9.f22043a     // Catch: java.lang.Exception -> L37
            java.lang.Object r4 = r4.peek()     // Catch: java.lang.Exception -> L37
            com.mbridge.msdk.newreward.a.e r4 = (com.mbridge.msdk.newreward.a.e) r4     // Catch: java.lang.Exception -> L37
            long r4 = r4.o()     // Catch: java.lang.Exception -> L37
            goto L3d
        L37:
            r10 = move-exception
            r0 = 0
            goto Lb8
        L3b:
            r4 = 0
        L3d:
            com.mbridge.msdk.newreward.function.c.c r6 = r9.f22047e     // Catch: java.lang.Exception -> L37
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Exception -> L37
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L37
            java.lang.String r7 = "adapter_model"
            r5[r1] = r7     // Catch: java.lang.Exception -> L37
            r5[r0] = r10     // Catch: java.lang.Exception -> L37
            java.lang.String r7 = "last_response_empty_time"
            r8 = 2
            r5[r8] = r7     // Catch: java.lang.Exception -> L37
            r7 = 3
            r5[r7] = r4     // Catch: java.lang.Exception -> L37
            java.util.Map r4 = r6.a(r5)     // Catch: java.lang.Exception -> L37
            com.mbridge.msdk.newreward.function.c.e r5 = com.mbridge.msdk.newreward.function.c.e.CHECK_IS_REQUEST_CONTROL     // Catch: java.lang.Exception -> L37
            java.lang.Object r4 = r6.b(r4, r5)     // Catch: java.lang.Exception -> L37
            java.util.Map r4 = (java.util.Map) r4     // Catch: java.lang.Exception -> L37
            if (r4 == 0) goto La9
            int r5 = r4.size()     // Catch: java.lang.Exception -> L37
            if (r5 <= 0) goto La9
            com.mbridge.msdk.newout.RewardVideoListener r5 = r9.f22045c     // Catch: java.lang.Exception -> L8f
            com.mbridge.msdk.out.MBridgeIds r6 = new com.mbridge.msdk.out.MBridgeIds     // Catch: java.lang.Exception -> L8f
            r6.<init>()     // Catch: java.lang.Exception -> L8f
            java.lang.Object r7 = r4.get(r3)     // Catch: java.lang.Exception -> L8f
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L8f
            r5.onVideoLoadFail(r6, r7)     // Catch: java.lang.Exception -> L8f
            java.lang.Object r5 = r4.get(r2)     // Catch: java.lang.Exception -> L8f
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch: java.lang.Exception -> L8f
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L8f
            if (r5 != 0) goto L91
            java.lang.Object r1 = r4.get(r2)     // Catch: java.lang.Exception -> L8f
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L8f
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Exception -> L8f
            goto L91
        L8f:
            r10 = move-exception
            goto Lb8
        L91:
            r2 = -1
            if (r1 != r2) goto L98
            r2 = 880018(0xd6d92, float:1.233168E-39)
            goto L9b
        L98:
            r2 = 880002(0xd6d82, float:1.233145E-39)
        L9b:
            java.lang.Object r3 = r4.get(r3)     // Catch: java.lang.Exception -> L8f
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L8f
            com.mbridge.msdk.foundation.c.b r1 = com.mbridge.msdk.foundation.c.a.a(r1, r2, r3)     // Catch: java.lang.Exception -> L8f
            r9.a(r10, r1)     // Catch: java.lang.Exception -> L8f
            goto Laa
        La9:
            r0 = 0
        Laa:
            if (r0 == 0) goto Lbf
            com.mbridge.msdk.foundation.same.report.d.c r1 = com.mbridge.msdk.foundation.same.report.d.c.a()     // Catch: java.lang.Exception -> L8f
            java.lang.String r10 = r10.z()     // Catch: java.lang.Exception -> L8f
            r1.c(r10)     // Catch: java.lang.Exception -> L8f
            goto Lbf
        Lb8:
            boolean r1 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r1 == 0) goto Lbf
            r10.printStackTrace()
        Lbf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.newreward.a.d.c(com.mbridge.msdk.newreward.a.e):boolean");
    }

    private void a(e eVar, com.mbridge.msdk.newreward.function.c.e eVar2) {
        if (eVar == null) {
            return;
        }
        List<CampaignEx> a9 = eVar.x() != null ? eVar.x().a() : null;
        try {
            com.mbridge.msdk.newreward.function.c.c cVar = this.f22047e;
            cVar.a(eVar, eVar2, cVar.a("metrics_data", a9, "auto_load", Integer.valueOf(eVar.B() ? 2 : 1), "cache", 1));
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }

    private void a(e eVar, com.mbridge.msdk.foundation.c.b bVar) {
        eVar.b(2);
        eVar.d(true);
        com.mbridge.msdk.newreward.function.c.c cVar = this.f22047e;
        cVar.a(eVar, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_FAILED, cVar.a("metrics_data", bVar));
    }

    private int a(int i8) {
        int i9 = 0;
        if (this.f22043a.size() == 0) {
            return 0;
        }
        for (e eVar : this.f22043a) {
            if (i8 != 1) {
                if (i8 == 2 && eVar.x().c()) {
                    i9++;
                }
            } else if (eVar.s() == 1) {
                i9++;
            }
        }
        return i9;
    }

    private void a(String str) {
        com.mbridge.msdk.newreward.b.b bVar = this.f22050h;
        if (bVar == null) {
            return;
        }
        com.mbridge.msdk.newreward.function.c.c cVar = this.f22047e;
        cVar.a(bVar, com.mbridge.msdk.newreward.function.c.e.REPORT_SHOW_FAIL, cVar.a("reason", str));
    }

    @Override // com.mbridge.msdk.newreward.a.c
    public final List<e> a() {
        ArrayList arrayList = new ArrayList();
        Deque<e> deque = this.f22043a;
        if (deque != null && deque.size() != 0) {
            Iterator<e> it = this.f22043a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return arrayList;
    }

    public final void a(e eVar) {
        Deque<e> deque;
        if (eVar == null || (deque = this.f22043a) == null) {
            return;
        }
        deque.addLast(eVar);
    }
}
