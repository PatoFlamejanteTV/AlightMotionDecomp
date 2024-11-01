package com.mbridge.msdk.videocommon.a;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.i;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.db.f;
import com.mbridge.msdk.foundation.db.h;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.a.d;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.videocommon.d.b;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f24199a = "com.mbridge.msdk.videocommon.a.a";

    /* renamed from: b, reason: collision with root package name */
    private static a f24200b;

    /* renamed from: c, reason: collision with root package name */
    private f f24201c;

    private a() {
        try {
            Context c8 = c.m().c();
            if (c8 != null) {
                this.f24201c = f.a(h.a(c8));
            } else {
                ad.b(f24199a, "RewardCampaignCache get Context is null");
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public static a a() {
        if (f24200b == null) {
            synchronized (a.class) {
                try {
                    if (f24200b == null) {
                        f24200b = new a();
                    }
                } finally {
                }
            }
        }
        return f24200b;
    }

    public final int b(String str, int i8, boolean z8, String str2) {
        List<CampaignEx> a9;
        try {
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            ArrayList arrayList = new ArrayList();
            if (z8) {
                a9 = this.f24201c.a(str, 0, 0, i8, str2);
            } else {
                a9 = this.f24201c.a(str, 0, 0, i8, false);
            }
            if (a9 == null) {
                return 0;
            }
            for (CampaignEx campaignEx : a9) {
                if (campaignEx != null && campaignEx.getReadyState() == 0) {
                    arrayList.add(campaignEx);
                }
            }
            return arrayList.size();
        } catch (Exception e8) {
            e8.printStackTrace();
            return 0;
        }
    }

    public final List<CampaignEx> c(String str, int i8, boolean z8, String str2) {
        long ac;
        List<CampaignEx> a9;
        ArrayList arrayList = null;
        try {
            g b9 = com.mbridge.msdk.c.h.a().b(c.m().k());
            if (b9 != null) {
                ac = b9.ac();
            } else {
                com.mbridge.msdk.c.h.a();
                ac = i.a().ac();
            }
            long j8 = ac * 1000;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (z8) {
                a9 = this.f24201c.a(str, 0, 0, i8, str2);
            } else {
                a9 = this.f24201c.a(str, 0, 0, i8, false);
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (a9 == null) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            try {
                for (CampaignEx campaignEx : a9) {
                    if (campaignEx != null && campaignEx.getReadyState() == 0) {
                        long plctb = campaignEx.getPlctb() * 1000;
                        long timestamp = currentTimeMillis - campaignEx.getTimestamp();
                        if ((plctb <= 0 && j8 >= timestamp) || (plctb > 0 && plctb >= timestamp)) {
                            arrayList2.add(campaignEx);
                        }
                    }
                }
                return arrayList2;
            } catch (Exception e8) {
                e = e8;
                arrayList = arrayList2;
                e.printStackTrace();
                return arrayList;
            }
        } catch (Exception e9) {
            e = e9;
        }
    }

    public final CopyOnWriteArrayList<CampaignEx> a(String str, int i8) {
        List<CampaignEx> a9;
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = null;
        try {
            if (TextUtils.isEmpty(str) || (a9 = this.f24201c.a(str, 0, 0, i8)) == null) {
                return null;
            }
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
            try {
                for (CampaignEx campaignEx : a9) {
                    if (campaignEx != null) {
                        copyOnWriteArrayList2.add(campaignEx);
                    }
                }
                return copyOnWriteArrayList2;
            } catch (Exception e8) {
                e = e8;
                copyOnWriteArrayList = copyOnWriteArrayList2;
                e.printStackTrace();
                return copyOnWriteArrayList;
            }
        } catch (Exception e9) {
            e = e9;
        }
    }

    public final List<CampaignEx> b(String str, int i8, boolean z8) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return this.f24201c.a(str, 0, 0, i8, z8);
        } catch (Exception e8) {
            ad.b(f24199a, e8.getLocalizedMessage());
            return null;
        }
    }

    public final void a(String str, List<CampaignEx> list, String str2, int i8) {
        f fVar;
        if (TextUtils.isEmpty(str) || list == null || list.size() <= 0 || TextUtils.isEmpty(str2) || (fVar = this.f24201c) == null) {
            return;
        }
        fVar.a(str, list, str2, i8);
    }

    public final void b(String str) {
        ConcurrentHashMap<String, com.mbridge.msdk.foundation.entity.c> f8;
        try {
            if (TextUtils.isEmpty(str) || (f8 = this.f24201c.f(str)) == null || f8.size() <= 0) {
                return;
            }
            g b9 = com.mbridge.msdk.c.h.a().b(c.m().k());
            if (b9 == null) {
                com.mbridge.msdk.c.h.a();
                b9 = i.a();
            }
            long ac = b9 != null ? b9.ac() : 0L;
            long currentTimeMillis = System.currentTimeMillis();
            for (com.mbridge.msdk.foundation.entity.c cVar : f8.values()) {
                if (cVar != null) {
                    long e8 = cVar.e();
                    if (e8 <= 0) {
                        e8 = ac;
                    }
                    if (cVar.f() + (e8 * 1000) < currentTimeMillis && !TextUtils.isEmpty(cVar.a())) {
                        ad.b("HBOPTIMIZE", "不在有效期范围内 删除" + cVar.a());
                        c(str, cVar.a());
                    }
                }
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public final void a(String str, List<CampaignEx> list) {
        f fVar;
        if (TextUtils.isEmpty(str) || list == null || list.size() <= 0 || (fVar = this.f24201c) == null) {
            return;
        }
        fVar.b(str, list);
    }

    public final void a(String str, List<CampaignEx> list, String str2) {
        f fVar;
        try {
            if (TextUtils.isEmpty(str) || list == null || list.size() <= 0 || (fVar = this.f24201c) == null) {
                return;
            }
            fVar.a(str, list, str2);
        } catch (Exception e8) {
            ad.b(f24199a, e8.getMessage());
        }
    }

    public final synchronized void c(String str, String str2) {
        try {
            this.f24201c.c(str2, str);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void a(String str, String str2) {
        if (this.f24201c == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f24201c.f(str, str2);
    }

    public final synchronized void c(String str, int i8) {
        int j8;
        try {
            try {
                g b9 = com.mbridge.msdk.c.h.a().b(c.m().k());
                if (b9 == null) {
                    com.mbridge.msdk.c.h.a();
                    b9 = i.a();
                }
                j8 = b9.j();
            } catch (Exception e8) {
                ad.b(f24199a, e8.getMessage());
            }
            if (j8 == 0) {
                return;
            }
            List<CampaignEx> b10 = this.f24201c.b(str, i8, j8 == 2);
            if (b10 != null && b10.size() > 0) {
                for (CampaignEx campaignEx : b10) {
                    String requestIdNotice = campaignEx.getRequestIdNotice();
                    String id = campaignEx.getId();
                    com.mbridge.msdk.videocommon.a.b(campaignEx.getCampaignUnitId() + "_" + id + "_" + requestIdNotice + "_" + campaignEx.getCMPTEntryUrl());
                }
            }
            this.f24201c.a(str, i8, j8 == 2);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final List<CampaignEx> a(String str, int i8, boolean z8) {
        return a(str, i8, z8, "");
    }

    public final CopyOnWriteArrayList<CampaignEx> a(String str, int i8, boolean z8, String str2) {
        List<CampaignEx> a9;
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = null;
        try {
            com.mbridge.msdk.videocommon.d.a b9 = b.a().b();
            long f8 = b9 != null ? b9.f() : 0L;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (z8) {
                a9 = this.f24201c.a(str, 0, 0, i8, str2);
            } else {
                a9 = this.f24201c.a(str, 0, 0, i8, false);
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (a9 == null) {
                return null;
            }
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
            try {
                for (CampaignEx campaignEx : a9) {
                    if (campaignEx != null) {
                        if (campaignEx.getReadyState() != 0 && campaignEx.getLoadTimeoutState() != 1) {
                        }
                        long plct = campaignEx.getPlct() * 1000;
                        long timestamp = currentTimeMillis - campaignEx.getTimestamp();
                        if ((plct > 0 && plct >= timestamp) || (plct <= 0 && f8 >= timestamp)) {
                            copyOnWriteArrayList2.add(campaignEx);
                        }
                    }
                }
                return copyOnWriteArrayList2;
            } catch (Exception e8) {
                e = e8;
                copyOnWriteArrayList = copyOnWriteArrayList2;
                e.printStackTrace();
                return copyOnWriteArrayList;
            }
        } catch (Exception e9) {
            e = e9;
        }
    }

    public final void b(String str, String str2) {
        f fVar = this.f24201c;
        if (fVar != null) {
            fVar.e(str, str2);
        }
    }

    public final void b(String str, int i8) {
        int size;
        try {
            List<com.mbridge.msdk.foundation.entity.c> d8 = this.f24201c.d(str);
            if (d8 == null || d8.size() <= 0 || (size = d8.size() - i8) <= 0) {
                return;
            }
            for (int i9 = 0; i9 < size; i9++) {
                c(str, d8.get(i9).a());
                d.c(str, d8.get(i9).a());
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final List<CampaignEx> a(List<CampaignEx> list) {
        ArrayList arrayList = null;
        if (list == null) {
            return null;
        }
        try {
            com.mbridge.msdk.videocommon.d.a b9 = b.a().b();
            long f8 = b9 != null ? b9.f() : 0L;
            long currentTimeMillis = System.currentTimeMillis();
            if (list.size() <= 0) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            try {
                for (CampaignEx campaignEx : list) {
                    if (campaignEx != null) {
                        long plct = campaignEx.getPlct() * 1000;
                        long timestamp = currentTimeMillis - campaignEx.getTimestamp();
                        if ((plct > 0 && plct >= timestamp) || (plct <= 0 && f8 >= timestamp)) {
                            arrayList2.add(campaignEx);
                        }
                    }
                }
                return arrayList2;
            } catch (Exception e8) {
                e = e8;
                arrayList = arrayList2;
                e.printStackTrace();
                return arrayList;
            }
        } catch (Exception e9) {
            e = e9;
        }
    }

    public final List<com.mbridge.msdk.foundation.entity.c> a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return this.f24201c.d(str);
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public final void a(CampaignEx campaignEx, String str) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (campaignEx.isBidCampaign()) {
                    d.c(str, campaignEx.getRequestId());
                }
                this.f24201c.a(campaignEx.getId(), str, campaignEx.isBidCampaign(), campaignEx.getRequestId());
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    public final void a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(campaignEx.getId())) {
                    return;
                }
                this.f24201c.b(campaignEx.getId(), campaignEx.getRequestId());
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    public final void a(String str, String str2, List<CampaignEx> list) {
        try {
            if (TextUtils.isEmpty(str2) || list == null || list.size() <= 0) {
                return;
            }
            this.f24201c.a(list, str, str2, 0);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final synchronized void a(long j8, String str) {
        try {
            this.f24201c.a(j8, str);
        } catch (Exception e8) {
            e8.printStackTrace();
            ad.b(f24199a, e8.getMessage());
        }
    }
}
