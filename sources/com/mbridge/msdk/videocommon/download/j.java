package com.mbridge.msdk.videocommon.download;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.k;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.an;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import com.mbridge.msdk.videocommon.download.h;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f24374e;

    /* renamed from: g, reason: collision with root package name */
    private ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> f24376g;

    /* renamed from: j, reason: collision with root package name */
    private Context f24379j;

    /* renamed from: k, reason: collision with root package name */
    private ExecutorService f24380k;

    /* renamed from: m, reason: collision with root package name */
    private String f24382m;

    /* renamed from: n, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.d.c f24383n;

    /* renamed from: p, reason: collision with root package name */
    private int f24385p;

    /* renamed from: q, reason: collision with root package name */
    private i f24386q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f24387r;

    /* renamed from: c, reason: collision with root package name */
    private List<CampaignEx> f24372c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private boolean f24373d = true;

    /* renamed from: f, reason: collision with root package name */
    private String f24375f = "";

    /* renamed from: h, reason: collision with root package name */
    private c f24377h = new c() { // from class: com.mbridge.msdk.videocommon.download.j.1
        @Override // com.mbridge.msdk.videocommon.download.c
        public final void a(long j8, int i8) {
            if (i8 == 5 || i8 == 4) {
                j.this.f24373d = true;
                j.this.a();
            }
            if (i8 == 2) {
                j.this.f24373d = true;
            }
        }
    };

    /* renamed from: i, reason: collision with root package name */
    private CopyOnWriteArrayList<Map<String, a>> f24378i = new CopyOnWriteArrayList<>();

    /* renamed from: l, reason: collision with root package name */
    private long f24381l = 3600;

    /* renamed from: o, reason: collision with root package name */
    private int f24384o = 1;

    /* renamed from: a, reason: collision with root package name */
    k f24370a = null;

    /* renamed from: b, reason: collision with root package name */
    k f24371b = null;

    public j(Context context, List<CampaignEx> list, ExecutorService executorService, String str, int i8) {
        this.f24385p = 1;
        try {
            boolean a9 = h.a.f24358a.a(i8);
            this.f24387r = a9;
            if (a9) {
                this.f24382m = str;
                this.f24385p = i8;
                this.f24386q = new i(list, str, i8);
                return;
            }
        } catch (Exception unused) {
            this.f24386q = null;
            this.f24387r = false;
        }
        this.f24379j = com.mbridge.msdk.foundation.controller.c.m().c();
        List<CampaignEx> list2 = this.f24372c;
        if (list2 != null && list != null) {
            list2.addAll(list);
        }
        this.f24380k = executorService;
        this.f24382m = str;
        this.f24385p = i8;
        b(this.f24372c);
    }

    private void d() {
        CopyOnWriteArrayList<Map<String, a>> copyOnWriteArrayList;
        if ((this.f24387r && this.f24386q != null) || af.a().a("u_n_c_e_d", true) || (copyOnWriteArrayList = this.f24378i) == null) {
            return;
        }
        try {
            synchronized (copyOnWriteArrayList) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    int i8 = 0;
                    while (i8 < this.f24378i.size()) {
                        Map<String, a> map = this.f24378i.get(i8);
                        Iterator<Map.Entry<String, a>> it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            a value = it.next().getValue();
                            if (value != null) {
                                if (currentTimeMillis - value.g() > this.f24381l * 1000 && value.k() == 1) {
                                    value.b(MBridgeError.ERROR_MESSAGE_DOWNLOAD_DOWNLOAD_TIMEOUT);
                                    value.a(this.f24384o);
                                    value.s();
                                    this.f24378i.remove(map);
                                    i8--;
                                }
                                if (value.k() != 1 && value.k() != 5 && value.k() != 0) {
                                    value.s();
                                    this.f24378i.remove(map);
                                    i8--;
                                }
                            }
                        }
                        i8++;
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void e() {
        CopyOnWriteArrayList<Map<String, a>> copyOnWriteArrayList = this.f24378i;
        if (copyOnWriteArrayList != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    int i8 = 0;
                    while (i8 < this.f24378i.size()) {
                        try {
                            Map<String, a> map = this.f24378i.get(i8);
                            Iterator<Map.Entry<String, a>> it = map.entrySet().iterator();
                            while (it.hasNext()) {
                                a value = it.next().getValue();
                                if (value != null && value.l() != null && value.f()) {
                                    value.r();
                                    this.f24378i.remove(map);
                                    i8--;
                                }
                            }
                            i8++;
                        } finally {
                        }
                    }
                }
            } catch (Throwable unused) {
                ad.b("UnitCacheCtroller", "cleanDisplayTask ERROR");
            }
        }
    }

    private void f(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("cache", 1);
                dVar.a(CampaignEx.JSON_KEY_READY_RATE, Integer.valueOf(b(campaignEx)));
                if (b(campaignEx) == 100) {
                    dVar.a("resumed_breakpoint", "2");
                } else {
                    dVar.a("resumed_breakpoint", "1");
                }
                dVar.a("resource_type", 4);
                dVar.a("scenes", "1");
                dVar.a("url", campaignEx.getVideoUrlEncode());
                com.mbridge.msdk.foundation.same.report.d.c.a().a("m_download_start", campaignEx, dVar);
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    e8.printStackTrace();
                }
            }
        }
    }

    public final CopyOnWriteArrayList<Map<String, a>> c() {
        i iVar;
        if (this.f24387r && (iVar = this.f24386q) != null) {
            return iVar.d();
        }
        return this.f24378i;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:56|57|58|59|(1:61)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01d4, code lost:            r4 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0202, code lost:            if (com.mbridge.msdk.MBridgeConstans.DEBUG != false) goto L93;     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0204, code lost:            com.mbridge.msdk.foundation.tools.ad.b("UnitCacheCtroller", r4.getMessage());     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x020e, code lost:            r12 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0213, code lost:            throw r12;     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r12) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.j.b(java.util.List):void");
    }

    public final void a(com.mbridge.msdk.videocommon.listener.a aVar) {
        i iVar;
        if (this.f24387r && (iVar = this.f24386q) != null) {
            iVar.a(aVar);
        } else {
            this.f24374e = aVar;
        }
    }

    private boolean c(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return false;
        }
        try {
            return campaignEx.getPlayable_ads_without_video() == 2;
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    public final void a(String str, com.mbridge.msdk.videocommon.listener.a aVar) {
        i iVar;
        if (this.f24387r && (iVar = this.f24386q) != null) {
            iVar.a(str, aVar);
            return;
        }
        if (this.f24376g == null) {
            this.f24376g = new ConcurrentHashMap<>();
        }
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f24376g.put(str, aVar);
    }

    public final void a(List<CampaignEx> list) {
        i iVar;
        if (this.f24387r && (iVar = this.f24386q) != null) {
            iVar.a(list);
            return;
        }
        List<CampaignEx> list2 = this.f24372c;
        if (list2 != null && list != null) {
            list2.addAll(list);
        }
        b(this.f24372c);
    }

    private int e(CampaignEx campaignEx) {
        try {
            if (campaignEx.getAdType() == 298) {
                if (this.f24371b == null) {
                    this.f24371b = com.mbridge.msdk.c.h.a().c(com.mbridge.msdk.foundation.controller.c.m().k(), this.f24382m);
                }
                return this.f24371b.p();
            }
            if (campaignEx.getAdType() == 42) {
                return d(null);
            }
            if (this.f24383n == null) {
                this.f24383n = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.f24382m, false);
            }
            return this.f24383n.r();
        } catch (Throwable th) {
            ad.a("UnitCacheCtroller", th.getMessage(), th);
            return 100;
        }
    }

    public final void a(CampaignEx campaignEx) {
        i iVar;
        if (this.f24387r && (iVar = this.f24386q) != null) {
            iVar.a(campaignEx);
            return;
        }
        List<CampaignEx> list = this.f24372c;
        if (list != null && campaignEx != null) {
            list.add(campaignEx);
        }
        b(this.f24372c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x01f1, code lost:            if (r29 != 94) goto L125;     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e8, code lost:            if (r15.isBidCampaign() == false) goto L57;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.mbridge.msdk.videocommon.download.a> a(java.lang.String r28, int r29, boolean r30, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r31, boolean r32, com.mbridge.msdk.foundation.same.report.d.d r33) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.j.a(java.lang.String, int, boolean, java.util.List, boolean, com.mbridge.msdk.foundation.same.report.d.d):java.util.List");
    }

    private int d(CampaignEx campaignEx) {
        try {
            k kVar = this.f24370a;
            if (kVar != null) {
                return kVar.p();
            }
            return 100;
        } catch (Exception e8) {
            if (!MBridgeConstans.DEBUG) {
                return 100;
            }
            ad.b("UnitCacheCtroller", e8.getMessage());
            return 100;
        }
    }

    public j(Context context, CampaignEx campaignEx, ExecutorService executorService, String str, int i8) {
        this.f24385p = 1;
        try {
            boolean a9 = h.a.f24358a.a(i8);
            this.f24387r = a9;
            if (a9) {
                this.f24382m = str;
                this.f24385p = i8;
                this.f24386q = new i(campaignEx, str, i8);
                return;
            }
        } catch (Exception unused) {
            this.f24386q = null;
            this.f24387r = false;
        }
        this.f24379j = com.mbridge.msdk.foundation.controller.c.m().c();
        List<CampaignEx> list = this.f24372c;
        if (list != null && campaignEx != null) {
            list.add(campaignEx);
        }
        this.f24380k = executorService;
        this.f24382m = str;
        this.f24385p = i8;
        b(this.f24372c);
    }

    private int b(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return -1;
        }
        if (campaignEx.getReady_rate() != -1) {
            return campaignEx.getReady_rate();
        }
        return e(campaignEx);
    }

    private boolean b(String str, CampaignEx campaignEx) {
        if (campaignEx.isMraid() || TextUtils.isEmpty(str)) {
            return true;
        }
        if (campaignEx.getLoadTimeoutState() == 1 && !c(campaignEx)) {
            return true;
        }
        if (campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0 || !campaignEx.getRsIgnoreCheckRule().contains(2)) {
            return an.b(H5DownLoadManager.getInstance().getH5ResAddress(str)) || an.b(HTMLResourceManager.getInstance().getHtmlContentFromUrl(str));
        }
        ad.c("UnitCacheCtroller", "Is not check endCard download status : " + str);
        return true;
    }

    public final a b(int i8, boolean z8) {
        i iVar;
        if (this.f24387r && (iVar = this.f24386q) != null) {
            return iVar.c();
        }
        try {
            return a(i8, z8);
        } catch (Throwable th) {
            ad.a("UnitCacheCtroller", th.getMessage(), th);
            return null;
        }
    }

    public final void b() {
        CopyOnWriteArrayList<Map<String, a>> copyOnWriteArrayList;
        if ((!this.f24387r || this.f24386q == null) && (copyOnWriteArrayList = this.f24378i) != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    try {
                        Iterator<Map<String, a>> it = this.f24378i.iterator();
                        while (it.hasNext()) {
                            Map<String, a> next = it.next();
                            if (next != null) {
                                Iterator<Map.Entry<String, a>> it2 = next.entrySet().iterator();
                                while (it2.hasNext()) {
                                    a value = it2.next().getValue();
                                    if (value != null && value.k() == 1) {
                                        value.b("playing and stop download");
                                        value.s();
                                        this.f24378i.remove(next);
                                        return;
                                    }
                                }
                            }
                        }
                    } finally {
                    }
                }
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("UnitCacheCtroller", th.getMessage());
                }
            }
        }
    }

    public final void b(String str) {
        CopyOnWriteArrayList<Map<String, a>> copyOnWriteArrayList;
        i iVar;
        if (this.f24387r && (iVar = this.f24386q) != null) {
            iVar.b(str);
            return;
        }
        try {
            synchronized (this.f24378i) {
                try {
                    if (!TextUtils.isEmpty(str) && (copyOnWriteArrayList = this.f24378i) != null && copyOnWriteArrayList.size() > 0) {
                        Iterator<Map<String, a>> it = this.f24378i.iterator();
                        while (it.hasNext()) {
                            Map<String, a> next = it.next();
                            if (next != null) {
                                for (Map.Entry<String, a> entry : next.entrySet()) {
                                    if (entry != null && TextUtils.equals(entry.getKey(), str)) {
                                        this.f24378i.remove(next);
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.b("UnitCacheCtroller", e8.getMessage());
            }
        }
    }

    public final boolean a(List<CampaignEx> list, String str) {
        if (list == null || list.size() == 0) {
            return false;
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            CampaignEx campaignEx = list.get(i8);
            if (campaignEx == null || !a(new a(com.mbridge.msdk.foundation.controller.c.m().c(), campaignEx, str, this.f24384o), b(campaignEx), false) || !a(campaignEx.getendcard_url(), campaignEx)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01e4, code lost:            if (r5 != 94) goto L123;     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01f8 A[Catch: all -> 0x0033, Exception -> 0x0036, TryCatch #1 {Exception -> 0x0036, blocks: (B:12:0x0019, B:16:0x0025, B:20:0x0077, B:21:0x007c, B:23:0x0084, B:24:0x0094, B:26:0x009a, B:28:0x00a8, B:30:0x00b2, B:31:0x00bc, B:33:0x00c2, B:42:0x00df, B:52:0x00e7, B:56:0x00ee, B:58:0x00fe, B:59:0x0106, B:63:0x0155, B:65:0x0167, B:72:0x0178, B:90:0x017e, B:76:0x0194, B:83:0x019e, B:94:0x01aa, B:96:0x01b7, B:98:0x01c1, B:100:0x01ce, B:105:0x01f2, B:107:0x01f8, B:109:0x01fe, B:114:0x020b, B:121:0x0221, B:124:0x022c, B:127:0x0237, B:129:0x023b, B:131:0x0245, B:136:0x024d, B:139:0x0257, B:141:0x0261, B:147:0x0113, B:149:0x0119, B:151:0x0123, B:154:0x0131, B:156:0x0137, B:169:0x013d, B:158:0x0141, B:160:0x0149, B:180:0x0039, B:182:0x0045, B:185:0x005d, B:186:0x027e, B:191:0x004f), top: B:11:0x0019, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x020b A[Catch: all -> 0x0033, Exception -> 0x0036, TRY_ENTER, TryCatch #1 {Exception -> 0x0036, blocks: (B:12:0x0019, B:16:0x0025, B:20:0x0077, B:21:0x007c, B:23:0x0084, B:24:0x0094, B:26:0x009a, B:28:0x00a8, B:30:0x00b2, B:31:0x00bc, B:33:0x00c2, B:42:0x00df, B:52:0x00e7, B:56:0x00ee, B:58:0x00fe, B:59:0x0106, B:63:0x0155, B:65:0x0167, B:72:0x0178, B:90:0x017e, B:76:0x0194, B:83:0x019e, B:94:0x01aa, B:96:0x01b7, B:98:0x01c1, B:100:0x01ce, B:105:0x01f2, B:107:0x01f8, B:109:0x01fe, B:114:0x020b, B:121:0x0221, B:124:0x022c, B:127:0x0237, B:129:0x023b, B:131:0x0245, B:136:0x024d, B:139:0x0257, B:141:0x0261, B:147:0x0113, B:149:0x0119, B:151:0x0123, B:154:0x0131, B:156:0x0137, B:169:0x013d, B:158:0x0141, B:160:0x0149, B:180:0x0039, B:182:0x0045, B:185:0x005d, B:186:0x027e, B:191:0x004f), top: B:11:0x0019, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084 A[Catch: all -> 0x0033, Exception -> 0x0036, TryCatch #1 {Exception -> 0x0036, blocks: (B:12:0x0019, B:16:0x0025, B:20:0x0077, B:21:0x007c, B:23:0x0084, B:24:0x0094, B:26:0x009a, B:28:0x00a8, B:30:0x00b2, B:31:0x00bc, B:33:0x00c2, B:42:0x00df, B:52:0x00e7, B:56:0x00ee, B:58:0x00fe, B:59:0x0106, B:63:0x0155, B:65:0x0167, B:72:0x0178, B:90:0x017e, B:76:0x0194, B:83:0x019e, B:94:0x01aa, B:96:0x01b7, B:98:0x01c1, B:100:0x01ce, B:105:0x01f2, B:107:0x01f8, B:109:0x01fe, B:114:0x020b, B:121:0x0221, B:124:0x022c, B:127:0x0237, B:129:0x023b, B:131:0x0245, B:136:0x024d, B:139:0x0257, B:141:0x0261, B:147:0x0113, B:149:0x0119, B:151:0x0123, B:154:0x0131, B:156:0x0137, B:169:0x013d, B:158:0x0141, B:160:0x0149, B:180:0x0039, B:182:0x0045, B:185:0x005d, B:186:0x027e, B:191:0x004f), top: B:11:0x0019, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.mbridge.msdk.videocommon.download.a a(int r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.j.a(int, boolean):com.mbridge.msdk.videocommon.download.a");
    }

    public static boolean a(a aVar, int i8) {
        long m8 = aVar.m();
        long j8 = aVar.j();
        if (TextUtils.isEmpty(aVar.e())) {
            ad.a("UnitCacheCtroller", "checkVideoDownload video done return true");
            return true;
        }
        if (i8 == 0) {
            if (aVar.l() != null && !TextUtils.isEmpty(aVar.l().getVideoUrlEncode())) {
                return true;
            }
        } else if (j8 > 0 && m8 * 100 >= j8 * i8) {
            if (i8 != 100 || aVar.k() == 5) {
                return true;
            }
            aVar.s();
            return false;
        }
        return false;
    }

    private static boolean a(a aVar, int i8, boolean z8) {
        long m8 = aVar.m();
        long j8 = aVar.j();
        if (TextUtils.isEmpty(aVar.e())) {
            ad.a("UnitCacheCtroller", "checkVideoDownload video done return true");
            return true;
        }
        CampaignEx l8 = aVar.l();
        if (l8 != null) {
            if (l8.getRsIgnoreCheckRule() != null && l8.getRsIgnoreCheckRule().size() > 0 && l8.getRsIgnoreCheckRule().contains(0)) {
                ad.c("UnitCacheCtroller", "Is not check video download status");
                return true;
            }
            if (l8.getIsTimeoutCheckVideoStatus() == 1 && l8.getVideoCheckType() == 1) {
                return true;
            }
            if (z8 && l8.getVideoCheckType() == 1) {
                if (i8 == 0) {
                    return true;
                }
                if ((j8 != 0 || m8 != 0) && m8 >= (i8 / 100) * j8) {
                    l8.setIsTimeoutCheckVideoStatus(1);
                    return true;
                }
            }
        }
        return a(aVar, i8);
    }

    private boolean a(String str, CampaignEx campaignEx) {
        try {
            if (campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0 || !campaignEx.getRsIgnoreCheckRule().contains(2)) {
                return (campaignEx.isDynamicView() && !ai.l(str)) || an.a(str) || b(str, campaignEx);
            }
            ad.c("UnitCacheCtroller", "Is not check endCard download status : " + str);
            return true;
        } catch (Throwable th) {
            ad.a("UnitCacheCtroller", th.getMessage(), th);
            return false;
        }
    }

    private boolean a(int i8, CampaignEx campaignEx, String str) {
        if (campaignEx.isDynamicView()) {
            return true;
        }
        if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(1)) {
            ad.c("UnitCacheCtroller", "Is not check template download status");
            return true;
        }
        if (!TextUtils.isEmpty(str) && campaignEx.getLoadTimeoutState() == 0) {
            ad.a("UnitCacheCtroller", "check template 下载情况：" + H5DownLoadManager.getInstance().getH5ResAddress(str));
            if (H5DownLoadManager.getInstance().getH5ResAddress(str) == null) {
                return false;
            }
        }
        return true;
    }

    public final a a(String str) {
        i iVar;
        if (this.f24387r && (iVar = this.f24386q) != null) {
            return iVar.a(str);
        }
        CopyOnWriteArrayList<Map<String, a>> copyOnWriteArrayList = this.f24378i;
        if (copyOnWriteArrayList == null) {
            return null;
        }
        synchronized (copyOnWriteArrayList) {
            try {
                try {
                    Iterator<Map<String, a>> it = this.f24378i.iterator();
                    while (it.hasNext()) {
                        Map<String, a> next = it.next();
                        if (next != null && next.containsKey(str)) {
                            return next.get(str);
                        }
                    }
                } catch (Throwable unused) {
                    ad.b("UnitCacheCtroller", "failed to get campaignTast by cid");
                }
                return null;
            } finally {
            }
        }
    }

    private boolean a(CopyOnWriteArrayList<Map<String, a>> copyOnWriteArrayList) {
        try {
            Iterator<Map<String, a>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                Map<String, a> next = it.next();
                if (next != null) {
                    Iterator<Map.Entry<String, a>> it2 = next.entrySet().iterator();
                    while (it2.hasNext()) {
                        if (it2.next().getValue().k() == 1) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ce A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0042 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df A[Catch: all -> 0x0022, TryCatch #1 {all -> 0x0022, blocks: (B:12:0x0016, B:14:0x001f, B:15:0x0025, B:16:0x002b, B:18:0x0031, B:21:0x003a, B:22:0x0042, B:24:0x0048, B:27:0x0058, B:30:0x005f, B:32:0x0065, B:33:0x0067, B:36:0x0073, B:37:0x0083, B:39:0x0094, B:41:0x0098, B:42:0x00a0, B:43:0x00a4, B:49:0x00b9, B:51:0x00bd, B:52:0x00d1, B:54:0x00d5, B:55:0x00db, B:57:0x00df, B:59:0x00e3, B:60:0x00f7, B:62:0x00fb, B:63:0x0129, B:65:0x012e, B:66:0x0134, B:70:0x016b, B:71:0x016f, B:73:0x0174, B:78:0x017c, B:82:0x0182, B:84:0x0186, B:85:0x018f, B:87:0x0193, B:91:0x019d, B:92:0x01a1, B:96:0x01ad, B:100:0x01b3, B:102:0x01b7, B:107:0x01c5, B:113:0x01ce, B:115:0x01d9, B:118:0x01dd, B:121:0x01e1, B:124:0x01e7, B:137:0x01f2, B:142:0x01fa, B:127:0x01ff, B:132:0x020c, B:135:0x0209, B:156:0x0100, B:158:0x0104, B:161:0x0119, B:163:0x011f, B:165:0x0123, B:179:0x0211), top: B:11:0x0016, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012e A[Catch: all -> 0x0022, TryCatch #1 {all -> 0x0022, blocks: (B:12:0x0016, B:14:0x001f, B:15:0x0025, B:16:0x002b, B:18:0x0031, B:21:0x003a, B:22:0x0042, B:24:0x0048, B:27:0x0058, B:30:0x005f, B:32:0x0065, B:33:0x0067, B:36:0x0073, B:37:0x0083, B:39:0x0094, B:41:0x0098, B:42:0x00a0, B:43:0x00a4, B:49:0x00b9, B:51:0x00bd, B:52:0x00d1, B:54:0x00d5, B:55:0x00db, B:57:0x00df, B:59:0x00e3, B:60:0x00f7, B:62:0x00fb, B:63:0x0129, B:65:0x012e, B:66:0x0134, B:70:0x016b, B:71:0x016f, B:73:0x0174, B:78:0x017c, B:82:0x0182, B:84:0x0186, B:85:0x018f, B:87:0x0193, B:91:0x019d, B:92:0x01a1, B:96:0x01ad, B:100:0x01b3, B:102:0x01b7, B:107:0x01c5, B:113:0x01ce, B:115:0x01d9, B:118:0x01dd, B:121:0x01e1, B:124:0x01e7, B:137:0x01f2, B:142:0x01fa, B:127:0x01ff, B:132:0x020c, B:135:0x0209, B:156:0x0100, B:158:0x0104, B:161:0x0119, B:163:0x011f, B:165:0x0123, B:179:0x0211), top: B:11:0x0016, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.j.a():void");
    }
}
