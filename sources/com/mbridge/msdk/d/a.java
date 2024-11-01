package com.mbridge.msdk.d;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.db.f;
import com.mbridge.msdk.foundation.db.h;
import com.mbridge.msdk.foundation.db.o;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.i;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private long f19459a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f19460b;

    /* renamed from: c, reason: collision with root package name */
    private LinkedList<i> f19461c;

    /* renamed from: d, reason: collision with root package name */
    private LinkedList<i> f19462d;

    /* renamed from: e, reason: collision with root package name */
    private int f19463e;

    /* renamed from: f, reason: collision with root package name */
    private int f19464f;

    /* renamed from: g, reason: collision with root package name */
    private f f19465g;

    /* renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.d.a f19466h;

    /* renamed from: i, reason: collision with root package name */
    private o f19467i;

    /* renamed from: j, reason: collision with root package name */
    private h f19468j;

    /* renamed from: k, reason: collision with root package name */
    private Handler f19469k;

    /* renamed from: com.mbridge.msdk.d.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static class C0391a {

        /* renamed from: a, reason: collision with root package name */
        static a f19473a = new a();
    }

    static /* synthetic */ void c(a aVar) {
        try {
            LinkedList<i> linkedList = aVar.f19461c;
            if (linkedList != null && linkedList.size() > 0 && aVar.f19463e < aVar.f19461c.size()) {
                i iVar = aVar.f19461c.get(aVar.f19463e);
                aVar.f19463e++;
                if (aVar.a(iVar)) {
                    aVar.a(iVar.a(), iVar.b(), false);
                }
            } else {
                LinkedList<i> linkedList2 = aVar.f19462d;
                if (linkedList2 != null && linkedList2.size() > 0 && aVar.f19464f < aVar.f19462d.size()) {
                    i iVar2 = aVar.f19462d.get(aVar.f19464f);
                    aVar.f19464f++;
                    if (aVar.a(iVar2)) {
                        aVar.a(iVar2.a(), iVar2.b(), true);
                    }
                }
            }
        } catch (Throwable th) {
            ad.a("LoopTimer", th.getMessage(), th);
        }
    }

    private a() {
        this.f19460b = false;
        this.f19461c = new LinkedList<>();
        this.f19462d = new LinkedList<>();
        this.f19463e = 0;
        this.f19464f = 0;
        this.f19469k = new Handler() { // from class: com.mbridge.msdk.d.a.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                synchronized (a.this) {
                    try {
                        int i8 = message.what;
                        if (i8 != 1) {
                            if (i8 == 2) {
                                a.c(a.this);
                            }
                        } else {
                            if (a.this.f19460b) {
                                return;
                            }
                            a aVar = a.this;
                            a.a(aVar, aVar.f19459a);
                            sendMessageDelayed(obtainMessage(1), a.this.f19459a);
                        }
                    } finally {
                    }
                }
            }
        };
    }

    private boolean a(i iVar) {
        boolean z8 = false;
        if (iVar == null || TextUtils.isEmpty(iVar.b())) {
            return false;
        }
        String b9 = iVar.b();
        try {
            if (this.f19465g != null) {
                com.mbridge.msdk.videocommon.d.a aVar = this.f19466h;
                int a9 = this.f19465g.a(b9, aVar != null ? aVar.f() : 0L);
                if (a9 != -1) {
                    if (a9 != 1) {
                    }
                } else if (!TextUtils.isEmpty(b9)) {
                    LinkedList<i> linkedList = this.f19461c;
                    if (linkedList != null && linkedList.contains(b9)) {
                        this.f19461c.remove(b9);
                    } else {
                        LinkedList<i> linkedList2 = this.f19462d;
                        if (linkedList2 != null && linkedList2.contains(b9)) {
                            this.f19462d.remove(b9);
                        }
                    }
                    o oVar = this.f19467i;
                    if (oVar != null) {
                        oVar.a(b9);
                    }
                }
                try {
                    Handler handler = this.f19469k;
                    handler.sendMessage(handler.obtainMessage(2));
                    return false;
                } catch (Throwable th) {
                    th = th;
                    ad.a("LoopTimer", th.getMessage(), th);
                    return z8;
                }
            }
            return true;
        } catch (Throwable th2) {
            th = th2;
            z8 = true;
        }
    }

    public final void b(String str, String str2) {
        if (this.f19462d.contains(str2)) {
            return;
        }
        this.f19462d.add(new i(str, str2, 287));
        o oVar = this.f19467i;
        if (oVar != null) {
            oVar.a(str, str2, 287);
        }
    }

    private void a(String str, String str2, boolean z8) {
        try {
            Context c8 = c.m().c();
            if (c8 == null) {
                return;
            }
            final com.mbridge.msdk.reward.adapter.c cVar = new com.mbridge.msdk.reward.adapter.c(c8, str, str2);
            cVar.b(z8);
            cVar.a(new com.mbridge.msdk.reward.adapter.a() { // from class: com.mbridge.msdk.d.a.2
                @Override // com.mbridge.msdk.reward.adapter.a
                public final void a(List<CampaignEx> list, com.mbridge.msdk.foundation.same.report.d.b bVar) {
                }

                @Override // com.mbridge.msdk.reward.adapter.a
                public final void a(List<CampaignEx> list, com.mbridge.msdk.foundation.c.b bVar, com.mbridge.msdk.foundation.same.report.d.b bVar2) {
                    a.this.f19469k.sendMessage(a.this.f19469k.obtainMessage(2));
                    cVar.a((com.mbridge.msdk.reward.adapter.a) null);
                }

                @Override // com.mbridge.msdk.reward.adapter.a
                public final void a(String str3, com.mbridge.msdk.foundation.same.report.d.b bVar) {
                    a.this.f19469k.sendMessage(a.this.f19469k.obtainMessage(2));
                    cVar.a((com.mbridge.msdk.reward.adapter.a) null);
                }
            });
            com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
            bVar.c(SameMD5.getMD5(ai.d()));
            bVar.d(str2);
            if (z8) {
                bVar.b(287);
            } else {
                bVar.b(94);
            }
            bVar.i(MBridgeConstans.ENDCARD_URL_TYPE_PL);
            bVar.b("1");
            cVar.a(1, 8000, false, bVar);
        } catch (Exception e8) {
            ad.a("LoopTimer", e8.getMessage(), e8);
        }
    }

    public final void a(String str, String str2) {
        if (this.f19461c.contains(str2)) {
            return;
        }
        this.f19461c.add(new i(str, str2, 94));
        o oVar = this.f19467i;
        if (oVar != null) {
            oVar.a(str, str2, 94);
        }
    }

    public final void a(long j8) {
        if (this.f19468j == null) {
            this.f19468j = h.a(c.m().c());
        }
        if (this.f19467i == null) {
            this.f19467i = o.a(this.f19468j);
        }
        List<i> a9 = this.f19467i.a(287);
        if (a9 != null) {
            this.f19462d.addAll(a9);
            for (i iVar : a9) {
                b(iVar.a(), iVar.b());
            }
        }
        List<i> a10 = this.f19467i.a(94);
        if (a10 != null) {
            this.f19461c.addAll(a10);
            for (i iVar2 : a10) {
                a(iVar2.a(), iVar2.b());
            }
        }
        if (this.f19465g == null) {
            this.f19465g = f.a(this.f19468j);
        }
        if (this.f19466h == null) {
            this.f19466h = com.mbridge.msdk.videocommon.d.b.a().b();
        }
        this.f19459a = j8;
        this.f19460b = false;
        Handler handler = this.f19469k;
        handler.sendMessageDelayed(handler.obtainMessage(1), this.f19459a);
    }

    static /* synthetic */ void a(a aVar, long j8) {
        LinkedList<i> linkedList = aVar.f19461c;
        if (linkedList == null || linkedList.size() <= 0 || aVar.f19463e == 0 || aVar.f19461c.size() <= aVar.f19463e) {
            LinkedList<i> linkedList2 = aVar.f19462d;
            if (linkedList2 == null || linkedList2.size() <= 0 || aVar.f19464f == 0 || aVar.f19462d.size() == aVar.f19464f) {
                aVar.f19464f = 0;
                aVar.f19463e = 0;
                Handler handler = aVar.f19469k;
                handler.sendMessage(handler.obtainMessage(2));
            }
        }
    }
}
