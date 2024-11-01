package com.mbridge.msdk.click;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import com.mbridge.msdk.foundation.tools.an;
import com.mbridge.msdk.foundation.tools.ao;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.LoadingActivity;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.scheme.applet.AppletSchemeCallBack;
import com.mbridge.msdk.scheme.applet.AppletsModel;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f19272a = false;

    /* renamed from: b, reason: collision with root package name */
    public static Map<String, Long> f19273b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static Set<String> f19274c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private String f19275d;

    /* renamed from: e, reason: collision with root package name */
    private long f19276e;

    /* renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.foundation.db.h f19277f;

    /* renamed from: g, reason: collision with root package name */
    private Context f19278g;

    /* renamed from: h, reason: collision with root package name */
    private d f19279h;

    /* renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.report.i f19281j;

    /* renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.c.g f19282k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f19283l;

    /* renamed from: o, reason: collision with root package name */
    private boolean f19286o;

    /* renamed from: p, reason: collision with root package name */
    private i f19287p;

    /* renamed from: i, reason: collision with root package name */
    private NativeListener.NativeTrackingListener f19280i = null;

    /* renamed from: m, reason: collision with root package name */
    private boolean f19284m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f19285n = true;

    public a(Context context, String str) {
        this.f19277f = null;
        this.f19278g = null;
        com.mbridge.msdk.c.g b9 = com.mbridge.msdk.c.h.a().b(str);
        this.f19282k = b9;
        if (b9 == null) {
            com.mbridge.msdk.c.h.a();
            this.f19282k = com.mbridge.msdk.c.i.a();
        }
        this.f19283l = this.f19282k.aJ();
        Context applicationContext = context.getApplicationContext();
        this.f19278g = applicationContext;
        this.f19275d = str;
        if (this.f19277f == null) {
            this.f19277f = com.mbridge.msdk.foundation.db.h.a(applicationContext);
        }
        this.f19281j = new com.mbridge.msdk.foundation.same.report.i(this.f19278g);
    }

    static /* synthetic */ void f(a aVar) {
        try {
            Intent intent = new Intent();
            intent.setAction("ExitApp");
            aVar.f19278g.sendBroadcast(intent);
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.a("CommonClickControl", "Exception", e8);
            }
        }
    }

    private boolean b(CampaignEx campaignEx) {
        Long l8;
        if (campaignEx == null) {
            return true;
        }
        try {
            if (2 != campaignEx.getLinkType() && 3 != campaignEx.getLinkType()) {
                return true;
            }
            String id = campaignEx.getId();
            Map<String, Long> map = f19273b;
            if (map == null) {
                return true;
            }
            if (map.containsKey(id) && (l8 = f19273b.get(id)) != null) {
                if (l8.longValue() > System.currentTimeMillis() || f19274c.contains(campaignEx.getId())) {
                    return false;
                }
            }
            f19273b.put(campaignEx.getId(), Long.valueOf(System.currentTimeMillis() + (campaignEx.getClickTimeOutInterval() * 1000)));
            return true;
        } catch (Exception e8) {
            if (!MBridgeConstans.DEBUG) {
                return true;
            }
            e8.printStackTrace();
            return true;
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String str2, boolean z8, boolean z9) {
        if (context == null) {
            return;
        }
        new d(context.getApplicationContext()).a(str, campaignEx, null, str2, z8, z9, com.mbridge.msdk.click.a.a.f19310f);
    }

    public static void a(Context context, final CampaignEx campaignEx, String str, final String str2, boolean z8, boolean z9, final int i8) {
        if (context == null) {
            return;
        }
        final int i9 = TextUtils.isEmpty(str2) ? -1 : str2.startsWith("tcp") ? 1 : 0;
        new d(context.getApplicationContext()).a(str, campaignEx, new f() { // from class: com.mbridge.msdk.click.a.1
            @Override // com.mbridge.msdk.click.f
            public final void a(Object obj) {
            }

            @Override // com.mbridge.msdk.click.f
            public final void b(Object obj) {
                try {
                    com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar.a("result", 2);
                    dVar.a("net_ty", String.valueOf(i9));
                    if (obj != null && (obj instanceof JumpLoaderResult)) {
                        JumpLoaderResult jumpLoaderResult = (JumpLoaderResult) obj;
                        String str3 = jumpLoaderResult.getStatusCode() + "";
                        dVar.a("status_code", str3);
                        if (str3.startsWith("2")) {
                            dVar.a("result", 1);
                        } else {
                            String exceptionMsg = jumpLoaderResult.getExceptionMsg();
                            if (TextUtils.isEmpty(exceptionMsg)) {
                                exceptionMsg = "UNKNOWN EXCEPTION and Status Code is : " + str3;
                            }
                            dVar.a("failingURL", ao.d(str2));
                            dVar.a("reason", exceptionMsg);
                        }
                    }
                    com.mbridge.msdk.foundation.same.report.d.c.a().a(a.a(i8), campaignEx, dVar);
                } catch (Exception e8) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("CommonClickControl", e8.getMessage());
                    }
                }
            }

            @Override // com.mbridge.msdk.click.f
            public final void a(Object obj, String str3) {
                try {
                    String a9 = a.a(i8);
                    com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar.a("result", 2);
                    if (obj instanceof JumpLoaderResult) {
                        JumpLoaderResult jumpLoaderResult = (JumpLoaderResult) obj;
                        String exceptionMsg = jumpLoaderResult.getExceptionMsg();
                        if (!TextUtils.isEmpty(exceptionMsg)) {
                            str3 = exceptionMsg;
                        }
                        dVar.a("reason", str3);
                        dVar.a("status_code", Integer.valueOf(jumpLoaderResult.getStatusCode()));
                    }
                    dVar.a("code", "");
                    dVar.a("failingURL", ao.d(str2));
                    dVar.a("net_ty", String.valueOf(i9));
                    com.mbridge.msdk.foundation.same.report.d.c.a().a(a9, campaignEx, dVar);
                } catch (Exception e8) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("CommonClickControl", e8.getMessage());
                    }
                }
            }
        }, str2, z8, z9, i8);
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String[] strArr, boolean z8, boolean z9) {
        if (context == null || campaignEx == null || TextUtils.isEmpty(str) || strArr == null) {
            return;
        }
        d dVar = new d(context.getApplicationContext());
        for (String str2 : strArr) {
            dVar.a(str, campaignEx, new f() { // from class: com.mbridge.msdk.click.a.2
                @Override // com.mbridge.msdk.click.f
                public final void a(Object obj) {
                }

                @Override // com.mbridge.msdk.click.f
                public final void b(Object obj) {
                }

                @Override // com.mbridge.msdk.click.f
                public final void a(Object obj, String str3) {
                }
            }, str2, z8, z9, com.mbridge.msdk.click.a.a.f19310f);
        }
    }

    private int b() {
        try {
            com.mbridge.msdk.c.g gVar = this.f19282k;
            if (gVar != null) {
                return gVar.X();
            }
            return 1;
        } catch (Exception e8) {
            e8.printStackTrace();
            return 1;
        }
    }

    public final void a(String str) {
        this.f19275d = str;
    }

    public final void a(NativeListener.NativeTrackingListener nativeTrackingListener) {
        this.f19280i = nativeTrackingListener;
    }

    public final void a(i iVar) {
        this.f19287p = iVar;
    }

    public final void a(boolean z8) {
        this.f19285n = z8;
    }

    public final void a() {
        try {
            this.f19280i = null;
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void a(CampaignEx campaignEx, NativeListener.NativeAdListener nativeAdListener) {
        if (nativeAdListener != null && campaignEx != null) {
            nativeAdListener.onAdClick(campaignEx);
        }
        a(campaignEx);
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x02a4 A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:6:0x0009, B:9:0x0010, B:11:0x0033, B:13:0x0039, B:14:0x0040, B:15:0x0048, B:18:0x0062, B:20:0x007a, B:22:0x007e, B:23:0x0085, B:25:0x009f, B:26:0x00a6, B:28:0x00aa, B:29:0x00c0, B:31:0x00c9, B:33:0x00cd, B:34:0x00d4, B:36:0x00e4, B:40:0x00ee, B:42:0x00f4, B:44:0x00fa, B:46:0x0106, B:48:0x010a, B:49:0x0111, B:51:0x0115, B:53:0x011f, B:56:0x0126, B:58:0x012a, B:59:0x0131, B:61:0x014b, B:64:0x0153, B:65:0x0163, B:67:0x0169, B:69:0x016d, B:70:0x0174, B:72:0x017e, B:74:0x0184, B:76:0x018a, B:78:0x0194, B:79:0x019c, B:81:0x01a0, B:82:0x01a7, B:84:0x01b1, B:86:0x01b7, B:87:0x01be, B:89:0x01c4, B:91:0x01d0, B:93:0x01df, B:94:0x01e8, B:96:0x01ec, B:97:0x01f3, B:99:0x01f9, B:100:0x0202, B:102:0x0206, B:105:0x01ff, B:106:0x0213, B:109:0x0223, B:116:0x023a, B:118:0x0244, B:120:0x024c, B:122:0x0254, B:124:0x025d, B:125:0x0264, B:127:0x0272, B:129:0x0279, B:130:0x0280, B:132:0x0284, B:134:0x0299, B:139:0x02a4, B:141:0x02ac, B:142:0x02af, B:144:0x02b5, B:146:0x02b9, B:147:0x02bc, B:150:0x02c2, B:152:0x02c8, B:154:0x02d2, B:156:0x02d6, B:158:0x02da, B:159:0x02dd, B:160:0x02f6, B:162:0x02e8, B:164:0x02f3, B:166:0x02fc, B:168:0x030a, B:173:0x0312, B:174:0x031a, B:175:0x0321, B:177:0x0325, B:178:0x0328, B:181:0x032f, B:183:0x0335, B:185:0x033b, B:189:0x0342, B:191:0x034d, B:193:0x0356, B:195:0x035a, B:197:0x0362, B:198:0x0365, B:200:0x036b, B:202:0x036f, B:203:0x0372, B:205:0x0376, B:207:0x037a, B:208:0x037d, B:210:0x038a, B:212:0x038e), top: B:5:0x0009, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x032d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.mbridge.msdk.foundation.entity.CampaignEx r18) {
        /*
            Method dump skipped, instructions count: 926
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.entity.CampaignEx):void");
    }

    private AppletSchemeCallBack a(NativeListener.NativeTrackingListener nativeTrackingListener, CampaignEx campaignEx, AppletsModel appletsModel, a aVar) {
        return new g(nativeTrackingListener, campaignEx, appletsModel, aVar);
    }

    private void a(Context context, CampaignEx campaignEx, List<String> list) {
        if (context == null) {
            com.mbridge.msdk.foundation.same.report.k.a(com.mbridge.msdk.foundation.controller.c.m().c(), campaignEx, 2, "context is null", this.f19275d);
            return;
        }
        boolean z8 = z.y() == 1;
        boolean z9 = z.u(context) == 1;
        if (z8 && z9) {
            String ghId = campaignEx.getGhId();
            String ghPath = campaignEx.getGhPath();
            String bindId = campaignEx.getBindId();
            String h8 = com.mbridge.msdk.foundation.controller.c.m().h();
            if (!TextUtils.isEmpty(ghId)) {
                try {
                    if (!TextUtils.isEmpty(h8)) {
                        bindId = h8;
                    }
                    Object b9 = z.b(bindId);
                    Class<?> cls = Class.forName("com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Req");
                    Object newInstance = cls.newInstance();
                    cls.getField("userName").set(newInstance, ghId);
                    cls.getField(MBridgeConstans.DYNAMIC_VIEW_WX_PATH).set(newInstance, ghPath);
                    cls.getField("miniprogramType").set(newInstance, cls.getField("MINIPTOGRAM_TYPE_RELEASE").get(null));
                    Class.forName("com.tencent.mm.opensdk.openapi.IWXAPI").getMethod("sendReq", Class.forName("com.tencent.mm.opensdk.modelbase.BaseReq")).invoke(b9, newInstance);
                    com.mbridge.msdk.foundation.same.report.k.a(context, campaignEx, 1, "", this.f19275d);
                    return;
                } catch (Throwable th) {
                    com.mbridge.msdk.foundation.same.report.k.a(context, campaignEx, 2, th.getMessage(), this.f19275d);
                    a(campaignEx, list);
                    return;
                }
            }
            a(campaignEx, list);
            com.mbridge.msdk.foundation.same.report.k.a(context, campaignEx, 2, "ghid is empty", this.f19275d);
            return;
        }
        com.mbridge.msdk.foundation.same.report.k.a(context, campaignEx, 2, "integrated:" + z8 + "-hasWx:" + z9, this.f19275d);
        a(campaignEx, list);
    }

    private void a(CampaignEx campaignEx, List<String> list) {
        if (b() == 2) {
            ah.a(this.f19278g, campaignEx.getClickURL(), campaignEx, this.f19280i, list);
        } else {
            ah.a(this.f19278g, campaignEx.getClickURL(), this.f19280i, campaignEx, list);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0102 A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:3:0x0006, B:6:0x0013, B:7:0x0027, B:10:0x0033, B:11:0x0042, B:12:0x0047, B:14:0x0059, B:18:0x005f, B:21:0x0076, B:23:0x007b, B:25:0x00ed, B:27:0x0102, B:28:0x0105, B:30:0x0109, B:32:0x0113, B:34:0x0117, B:37:0x0124, B:39:0x0128, B:40:0x012f, B:42:0x008c, B:44:0x0098, B:46:0x00a2, B:49:0x00ab, B:51:0x00ca, B:53:0x00d1, B:54:0x00d4, B:57:0x00da, B:58:0x00e3, B:60:0x00e8), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0128 A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:3:0x0006, B:6:0x0013, B:7:0x0027, B:10:0x0033, B:11:0x0042, B:12:0x0047, B:14:0x0059, B:18:0x005f, B:21:0x0076, B:23:0x007b, B:25:0x00ed, B:27:0x0102, B:28:0x0105, B:30:0x0109, B:32:0x0113, B:34:0x0117, B:37:0x0124, B:39:0x0128, B:40:0x012f, B:42:0x008c, B:44:0x0098, B:46:0x00a2, B:49:0x00ab, B:51:0x00ca, B:53:0x00d1, B:54:0x00d4, B:57:0x00da, B:58:0x00e3, B:60:0x00e8), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(final com.mbridge.msdk.foundation.entity.CampaignEx r15, final boolean r16, final java.lang.Boolean r17, final java.util.List<java.lang.String> r18) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.entity.CampaignEx, boolean, java.lang.Boolean, java.util.List):void");
    }

    public final void a(JumpLoaderResult jumpLoaderResult, CampaignEx campaignEx, int i8, boolean z8) {
        if (campaignEx == null || jumpLoaderResult == null) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() - this.f19276e;
            com.mbridge.msdk.foundation.entity.e eVar = new com.mbridge.msdk.foundation.entity.e();
            int l8 = z.l(this.f19278g);
            eVar.a(l8);
            eVar.c(z.a(this.f19278g, l8));
            eVar.b(campaignEx.getRequestId());
            eVar.k(campaignEx.getRequestIdNotice());
            eVar.b(i8);
            eVar.i(currentTimeMillis + "");
            eVar.j(campaignEx.getId());
            eVar.c(jumpLoaderResult.getType());
            if (!TextUtils.isEmpty(jumpLoaderResult.getUrl())) {
                eVar.h(URLEncoder.encode(jumpLoaderResult.getUrl(), "utf-8"));
            }
            eVar.e((this.f19276e / 1000) + "");
            eVar.d(Integer.parseInt(campaignEx.getLandingType()));
            eVar.e(campaignEx.getLinkType());
            eVar.a(this.f19275d);
            eVar.c(jumpLoaderResult.getType());
            if (!TextUtils.isEmpty(jumpLoaderResult.getUrl())) {
                eVar.h(URLEncoder.encode(jumpLoaderResult.getUrl(), "utf-8"));
            }
            if (this.f19283l) {
                eVar.f(jumpLoaderResult.getStatusCode());
                if (!TextUtils.isEmpty(jumpLoaderResult.getHeader())) {
                    eVar.f(URLEncoder.encode(jumpLoaderResult.getHeader(), "utf-8"));
                }
                if (!TextUtils.isEmpty(jumpLoaderResult.getContent())) {
                    eVar.g(URLEncoder.encode(jumpLoaderResult.getContent(), C.UTF8_NAME));
                }
                if (!TextUtils.isEmpty(jumpLoaderResult.getExceptionMsg())) {
                    eVar.d(URLEncoder.encode(jumpLoaderResult.getExceptionMsg(), "utf-8"));
                }
            }
            if (z8) {
                this.f19281j.a("click_jump_error", eVar, this.f19275d);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(eVar);
            String a9 = com.mbridge.msdk.foundation.entity.e.a(arrayList);
            if (an.b(a9)) {
                if (com.mbridge.msdk.foundation.same.report.e.a().b()) {
                    com.mbridge.msdk.foundation.same.report.e.a().a(a9);
                } else {
                    new com.mbridge.msdk.foundation.same.report.i(this.f19278g, 0).a("click_jump_success", a9, null, null);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void a(Campaign campaign, String str) {
        try {
            if (!TextUtils.isEmpty(str) && campaign != null) {
                CampaignEx campaignEx = campaign instanceof CampaignEx ? (CampaignEx) campaign : null;
                if ((!str.startsWith("market://") && !str.startsWith("https://play.google.com/")) || ah.a.a(this.f19278g, str, this.f19280i) || campaignEx == null) {
                    return;
                }
                if (!TextUtils.isEmpty(campaignEx.getPackageName())) {
                    ah.a.a(this.f19278g, "market://details?id=" + campaignEx.getPackageName(), this.f19280i);
                    return;
                }
                if (b() == 2) {
                    ah.a(this.f19278g, campaignEx.getClickURL(), campaignEx, this.f19280i, new ArrayList());
                } else {
                    ah.a(this.f19278g, campaignEx.getClickURL(), this.f19280i, campaignEx, new ArrayList());
                }
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JumpLoaderResult jumpLoaderResult, CampaignEx campaignEx, boolean z8) {
        a(jumpLoaderResult, campaignEx, 1, z8);
    }

    private void a(int i8, String str, CampaignEx campaignEx, NativeListener.NativeTrackingListener nativeTrackingListener, List<String> list) {
        try {
            if (!TextUtils.isEmpty(str)) {
                if (i8 == 2) {
                    ah.a(this.f19278g, str, campaignEx, nativeTrackingListener, list);
                } else {
                    ah.a(this.f19278g, str, nativeTrackingListener, campaignEx, list);
                }
            }
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                ad.a("CommonClickControl", th.getMessage(), th);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a(com.mbridge.msdk.foundation.entity.CampaignEx r9, com.mbridge.msdk.click.entity.JumpLoaderResult r10, boolean r11, int r12, java.util.List<java.lang.String> r13) {
        /*
            r8 = this;
            r0 = 1
            r1 = 0
            if (r11 == 0) goto L7d
            java.lang.String r2 = r9.getLandingType()     // Catch: java.lang.Throwable -> L1c
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> L1c
            if (r2 != r0) goto L20
            android.content.Context r12 = r8.f19278g     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = r10.getUrl()     // Catch: java.lang.Throwable -> L1c
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r3 = r8.f19280i     // Catch: java.lang.Throwable -> L1c
            com.mbridge.msdk.foundation.tools.ah.a(r12, r2, r3, r9, r13)     // Catch: java.lang.Throwable -> L1c
        L19:
            r1 = 1
            goto L7d
        L1c:
            r9 = move-exception
            r0 = 0
            goto La2
        L20:
            r3 = 2
            if (r2 != r3) goto L2f
            android.content.Context r12 = r8.f19278g     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = r10.getUrl()     // Catch: java.lang.Throwable -> L1c
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r3 = r8.f19280i     // Catch: java.lang.Throwable -> L1c
            com.mbridge.msdk.foundation.tools.ah.a(r12, r2, r9, r3, r13)     // Catch: java.lang.Throwable -> L1c
            goto L19
        L2f:
            java.lang.String r2 = r9.getPackageName()     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L70
            android.content.Context r2 = r8.f19278g     // Catch: java.lang.Throwable -> L1c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c
            r3.<init>()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = "market://details?id="
            r3.append(r4)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = r9.getPackageName()     // Catch: java.lang.Throwable -> L1c
            r3.append(r4)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L1c
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r4 = r8.f19280i     // Catch: java.lang.Throwable -> L1c
            boolean r2 = com.mbridge.msdk.foundation.tools.ah.a.a(r2, r3, r4)     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L62
            if (r13 == 0) goto L5e
            java.lang.String r12 = "google_play"
            r13.add(r12)     // Catch: java.lang.Throwable -> L5c
            goto L5e
        L5c:
            r9 = move-exception
            goto La2
        L5e:
            r8.a(r9, r0, r0, r13)     // Catch: java.lang.Throwable -> L5c
            goto L19
        L62:
            java.lang.String r4 = r10.getUrl()     // Catch: java.lang.Throwable -> L1c
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r6 = r8.f19280i     // Catch: java.lang.Throwable -> L1c
            r2 = r8
            r3 = r12
            r5 = r9
            r7 = r13
            r2.a(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L1c
            goto L7d
        L70:
            java.lang.String r4 = r10.getUrl()     // Catch: java.lang.Throwable -> L1c
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r6 = r8.f19280i     // Catch: java.lang.Throwable -> L1c
            r2 = r8
            r3 = r12
            r5 = r9
            r7 = r13
            r2.a(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L1c
        L7d:
            if (r1 == 0) goto L91
            r8.a(r10, r9, r0)     // Catch: java.lang.Throwable -> L8e
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r11 = r8.f19280i     // Catch: java.lang.Throwable -> L8e
            if (r11 == 0) goto Lb0
            java.lang.String r10 = r10.getUrl()     // Catch: java.lang.Throwable -> L8e
            r11.onFinishRedirection(r9, r10)     // Catch: java.lang.Throwable -> L8e
            goto Lb0
        L8e:
            r9 = move-exception
            r0 = r1
            goto La2
        L91:
            r8.a(r10, r9, r0)     // Catch: java.lang.Throwable -> L8e
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r12 = r8.f19280i     // Catch: java.lang.Throwable -> L8e
            if (r12 == 0) goto Lb0
            if (r11 == 0) goto Lb0
            java.lang.String r10 = r10.getUrl()     // Catch: java.lang.Throwable -> L8e
            r12.onRedirectionFailed(r9, r10)     // Catch: java.lang.Throwable -> L8e
            goto Lb0
        La2:
            boolean r10 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r10 == 0) goto Laf
            java.lang.String r10 = "CommonClickControl"
            java.lang.String r11 = r9.getMessage()
            com.mbridge.msdk.foundation.tools.ad.a(r10, r11, r9)
        Laf:
            r1 = r0
        Lb0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.entity.CampaignEx, com.mbridge.msdk.click.entity.JumpLoaderResult, boolean, int, java.util.List):boolean");
    }

    private boolean a(CampaignEx campaignEx, JumpLoaderResult jumpLoaderResult, boolean z8, List<String> list) {
        boolean z9 = false;
        if (z8) {
            try {
                if (com.mbridge.msdk.f.b.a()) {
                    b.a(this.f19278g, this.f19275d, campaignEx, campaignEx.getNoticeUrl(), com.mbridge.msdk.foundation.same.a.f20640L);
                }
                ah.a(this.f19278g, campaignEx.getClickURL(), this.f19280i, campaignEx, list);
                z9 = true;
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("CommonClickControl", th.getMessage(), th);
                }
            }
        }
        a(jumpLoaderResult, campaignEx, true);
        if (z9) {
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f19280i;
            if (nativeTrackingListener != null) {
                nativeTrackingListener.onFinishRedirection(campaignEx, jumpLoaderResult.getUrl());
            }
        } else {
            if (com.mbridge.msdk.f.b.a()) {
                a(jumpLoaderResult, campaignEx, true);
            }
            NativeListener.NativeTrackingListener nativeTrackingListener2 = this.f19280i;
            if (nativeTrackingListener2 != null) {
                nativeTrackingListener2.onRedirectionFailed(campaignEx, jumpLoaderResult.getUrl());
            }
        }
        return z9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00cf, code lost:            if (com.mbridge.msdk.foundation.tools.ah.a.a(r16.f19278g, "market://details?id=" + r17.getPackageName(), r16.f19280i) == false) goto L47;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.mbridge.msdk.foundation.entity.CampaignEx r17, com.mbridge.msdk.click.entity.JumpLoaderResult r18, boolean r19, boolean r20, java.lang.Boolean r21, java.util.List<java.lang.String> r22) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.entity.CampaignEx, com.mbridge.msdk.click.entity.JumpLoaderResult, boolean, boolean, java.lang.Boolean, java.util.List):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0012, code lost:            if (android.text.TextUtils.isEmpty(r5) == false) goto L13;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a(int r4, java.lang.String r5) {
        /*
            r3 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            if (r4 != r0) goto Le
            boolean r4 = com.mbridge.msdk.foundation.tools.ah.a.b(r5)     // Catch: java.lang.Exception -> Lc
            if (r4 == 0) goto L15
            goto L16
        Lc:
            r4 = move-exception
            goto L18
        Le:
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> Lc
            if (r4 != 0) goto L15
            goto L16
        L15:
            r1 = 0
        L16:
            r2 = r1
            goto L1b
        L18:
            r4.printStackTrace()
        L1b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.a.a(int, java.lang.String):boolean");
    }

    private void a(CampaignEx campaignEx, int i8, int i9, List<String> list) {
        try {
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            dVar.a("type", Integer.valueOf(i8));
            dVar.a("result", Integer.valueOf(i9));
            if (list != null) {
                dVar.a("click_path", list.toString());
            }
            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000150", campaignEx, dVar);
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CommonClickControl", e8.getMessage());
            }
        }
    }

    static /* synthetic */ String a(int i8) {
        if (i8 == 1) {
            return "2000136";
        }
        if (i8 == 2) {
            return "2000137";
        }
        if (i8 == 3) {
            return "2000139";
        }
        if (i8 != 4) {
            return "";
        }
        return "2000138";
    }

    static /* synthetic */ void a(a aVar, CampaignEx campaignEx) {
        try {
            Intent intent = new Intent(aVar.f19278g, (Class<?>) LoadingActivity.class);
            intent.setFlags(268435456);
            intent.putExtra(CampaignEx.JSON_KEY_ICON_URL, campaignEx.getIconUrl());
            aVar.f19278g.startActivity(intent);
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.a("CommonClickControl", "Exception", e8);
            }
        }
    }

    static /* synthetic */ void a(a aVar, final boolean z8, final Campaign campaign) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.mbridge.msdk.click.a.5
            @Override // java.lang.Runnable
            public final void run() {
                if (z8 && !a.f19272a && MBridgeConstans.NATIVE_SHOW_LOADINGPAGER) {
                    a.f(a.this);
                }
                if (a.this.f19280i != null && !a.f19272a && MBridgeConstans.NATIVE_SHOW_LOADINGPAGER) {
                    a.this.f19280i.onDismissLoading(campaign);
                }
            }
        });
    }
}
