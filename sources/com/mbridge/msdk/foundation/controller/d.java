package com.mbridge.msdk.foundation.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.MBridgeSDK;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.j;
import com.mbridge.msdk.foundation.controller.a;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.l;
import com.mbridge.msdk.foundation.same.net.n;
import com.mbridge.msdk.foundation.same.report.i;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ag;
import com.mbridge.msdk.foundation.tools.x;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.interstitialvideo.out.MBInterstitialVideoHandler;
import com.mbridge.msdk.out.MBRewardVideoHandler;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: e, reason: collision with root package name */
    private static volatile d f20328e;

    /* renamed from: f, reason: collision with root package name */
    private int f20333f;

    /* renamed from: g, reason: collision with root package name */
    private Map<String, Object> f20334g;

    /* renamed from: h, reason: collision with root package name */
    private FastKV f20335h;

    /* renamed from: j, reason: collision with root package name */
    private String f20337j;

    /* renamed from: k, reason: collision with root package name */
    private String f20338k;

    /* renamed from: l, reason: collision with root package name */
    private String f20339l;

    /* renamed from: m, reason: collision with root package name */
    private Context f20340m;

    /* renamed from: n, reason: collision with root package name */
    private String f20341n;

    /* renamed from: o, reason: collision with root package name */
    private com.mbridge.msdk.b.a f20342o;

    /* renamed from: p, reason: collision with root package name */
    private String f20343p;

    /* renamed from: a, reason: collision with root package name */
    public final int f20329a = 4;

    /* renamed from: b, reason: collision with root package name */
    public final int f20330b = 5;

    /* renamed from: c, reason: collision with root package name */
    public final int f20331c = 2;

    /* renamed from: i, reason: collision with root package name */
    private boolean f20336i = false;

    /* renamed from: d, reason: collision with root package name */
    Handler f20332d = new Handler(Looper.getMainLooper()) { // from class: com.mbridge.msdk.foundation.controller.d.6
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            List list;
            List list2;
            try {
                int i8 = message.what;
                if (i8 != 2) {
                    if (i8 != 7) {
                        if (i8 != 9) {
                            if (i8 != 4) {
                                if (i8 == 5) {
                                    String str = (String) message.obj;
                                    if (!TextUtils.isEmpty(str)) {
                                        if (com.mbridge.msdk.foundation.same.report.e.a().b()) {
                                            com.mbridge.msdk.foundation.same.report.e.a().a(str);
                                            return;
                                        } else {
                                            new i(d.this.f20340m, 0).a("load_duration", str, null, null);
                                            return;
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            String str2 = (String) message.obj;
                            if (!TextUtils.isEmpty(str2)) {
                                if (com.mbridge.msdk.foundation.same.report.e.a().b()) {
                                    com.mbridge.msdk.foundation.same.report.e.a().a(str2);
                                    return;
                                } else {
                                    new i(d.this.f20340m, 0).a("click_duration", str2, null, null);
                                    return;
                                }
                            }
                            return;
                        }
                        g gVar = (g) message.obj;
                        com.mbridge.msdk.foundation.tools.g d8 = c.m().d();
                        if (d8 != null && d8.b() && gVar != null && gVar.J() == 1) {
                            com.mbridge.msdk.foundation.same.report.b.d.a(d.this.f20340m).b();
                        }
                        if (d8 != null && d8.a()) {
                            com.mbridge.msdk.foundation.same.report.b.c.a();
                            return;
                        }
                        return;
                    }
                    Object obj = message.obj;
                    if (obj != null && (obj instanceof List) && (list2 = (List) obj) != null) {
                        list2.size();
                        return;
                    }
                    return;
                }
                Object obj2 = message.obj;
                if ((obj2 instanceof List) && (list = (List) obj2) != null && list.size() > 0) {
                    i iVar = new i(d.this.f20340m, 0);
                    for (int i9 = 0; i9 < list.size(); i9++) {
                        l lVar = (l) list.get(i9);
                        Boolean bool = Boolean.FALSE;
                        if (i9 == list.size() - 1) {
                            bool = Boolean.TRUE;
                        }
                        iVar.a(lVar, bool);
                    }
                }
            } catch (Exception unused) {
                ad.b("SDKController", "REPORT HANDLE ERROR!");
            }
        }
    };

    private d() {
    }

    public static d a() {
        if (f20328e == null) {
            synchronized (d.class) {
                try {
                    if (f20328e == null) {
                        f20328e = new d();
                    }
                } finally {
                }
            }
        }
        return f20328e;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006e A[Catch: Exception -> 0x0040, TryCatch #0 {Exception -> 0x0040, blocks: (B:6:0x000a, B:9:0x001c, B:14:0x0046, B:16:0x004c, B:17:0x005c, B:19:0x006e, B:20:0x0084, B:22:0x008e, B:24:0x0094, B:26:0x009a, B:27:0x00a3, B:29:0x00a9, B:32:0x00c7, B:33:0x01da, B:35:0x01e0, B:37:0x01e5, B:39:0x0169, B:41:0x0204, B:42:0x0208, B:47:0x0025, B:49:0x0033), top: B:5:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008e A[Catch: Exception -> 0x0040, TryCatch #0 {Exception -> 0x0040, blocks: (B:6:0x000a, B:9:0x001c, B:14:0x0046, B:16:0x004c, B:17:0x005c, B:19:0x006e, B:20:0x0084, B:22:0x008e, B:24:0x0094, B:26:0x009a, B:27:0x00a3, B:29:0x00a9, B:32:0x00c7, B:33:0x01da, B:35:0x01e0, B:37:0x01e5, B:39:0x0169, B:41:0x0204, B:42:0x0208, B:47:0x0025, B:49:0x0033), top: B:5:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.controller.d.b():void");
    }

    public final void c() {
        Handler handler = this.f20332d;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final void a(Map map, final Context context) {
        Object obj;
        String str;
        if (context != null) {
            if (!TextUtils.isEmpty(MBridgeConstans.DEVELOPER_CUSTOM_PACKAGE)) {
                c.m().f(MBridgeConstans.DEVELOPER_CUSTOM_PACKAGE);
            } else if (map.containsKey(MBridgeConstans.KEY_MBRIDGE_CUSTOM_PACKAGE_NAME) && (obj = map.get(MBridgeConstans.KEY_MBRIDGE_CUSTOM_PACKAGE_NAME)) != null) {
                String str2 = (String) obj;
                if (!TextUtils.isEmpty(str2)) {
                    c.m().f(str2);
                }
            }
            if (map != null) {
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_APPID)) {
                    this.f20337j = (String) map.get(MBridgeConstans.ID_MBRIDGE_APPID);
                }
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_APPKEY)) {
                    this.f20338k = (String) map.get(MBridgeConstans.ID_MBRIDGE_APPKEY);
                }
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_WX_APPID)) {
                    this.f20343p = (String) map.get(MBridgeConstans.ID_MBRIDGE_WX_APPID);
                }
                if (map.containsKey(MBridgeConstans.PACKAGE_NAME_MANIFEST)) {
                    this.f20339l = (String) map.get(MBridgeConstans.PACKAGE_NAME_MANIFEST);
                }
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_STARTUPCRASH)) {
                    this.f20341n = (String) map.get(MBridgeConstans.ID_MBRIDGE_STARTUPCRASH);
                }
            }
            this.f20340m = context.getApplicationContext();
            c.m().b(this.f20340m);
            c.m().d(this.f20337j);
            c.m().e(this.f20338k);
            c.m().a(this.f20343p);
            c.m().c(this.f20339l);
            c.m().a(new a.InterfaceC0397a() { // from class: com.mbridge.msdk.foundation.controller.d.4
            }, this.f20332d);
            try {
                com.mbridge.msdk.foundation.same.net.g.d.f().e();
            } catch (Throwable th) {
                ad.b("SDKController", th.getMessage());
            }
            try {
                n.a(this.f20340m);
            } catch (Exception e8) {
                ad.b("SDKController", e8.getMessage());
            }
            if (this.f20336i) {
                return;
            }
            ag.a(this.f20340m);
            Context applicationContext = this.f20340m.getApplicationContext();
            try {
                if (this.f20335h == null) {
                    try {
                        this.f20335h = new FastKV.Builder(com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_CONFIG), x.a("H+tU+FeXHM==")).build();
                    } catch (Exception unused) {
                        this.f20335h = null;
                    }
                }
                FastKV fastKV = this.f20335h;
                String str3 = "";
                if (fastKV != null) {
                    String string = fastKV.getString(x.a("H+tU+bfPhM=="), "");
                    String string2 = this.f20335h.getString(x.a("H+tU+Fz8"), "");
                    if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f20649U) && TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f20658g)) {
                        com.mbridge.msdk.foundation.same.a.f20649U = com.mbridge.msdk.foundation.a.a.a.a().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
                        com.mbridge.msdk.foundation.same.a.f20658g = com.mbridge.msdk.foundation.a.a.a.a().a("c");
                    }
                    if (TextUtils.isEmpty(string) && TextUtils.isEmpty(string2)) {
                        if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f20649U) || !TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f20658g)) {
                            this.f20335h.putString(x.a("H+tU+bfPhM=="), com.mbridge.msdk.foundation.same.a.f20649U);
                            this.f20335h.putString(x.a("H+tU+Fz8"), com.mbridge.msdk.foundation.same.a.f20658g);
                        }
                    } else {
                        com.mbridge.msdk.foundation.same.a.f20649U = string;
                        com.mbridge.msdk.foundation.same.a.f20658g = string2;
                        com.mbridge.msdk.foundation.a.a.a.a().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.f20649U);
                        com.mbridge.msdk.foundation.a.a.a.a().a("c", com.mbridge.msdk.foundation.same.a.f20658g);
                    }
                } else {
                    SharedPreferences sharedPreferences = applicationContext.getSharedPreferences(x.a("H+tU+FeXHM=="), 0);
                    if (sharedPreferences != null) {
                        str3 = sharedPreferences.getString(x.a("H+tU+bfPhM=="), "");
                        str = sharedPreferences.getString(x.a("H+tU+Fz8"), "");
                    } else {
                        str = "";
                    }
                    if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f20649U) && TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f20658g)) {
                        com.mbridge.msdk.foundation.same.a.f20649U = com.mbridge.msdk.foundation.a.a.a.a().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
                        com.mbridge.msdk.foundation.same.a.f20658g = com.mbridge.msdk.foundation.a.a.a.a().a("c");
                    }
                    if (TextUtils.isEmpty(str3) && TextUtils.isEmpty(str)) {
                        if ((!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f20649U) || !TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f20658g)) && sharedPreferences != null) {
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            edit.putString(x.a("H+tU+bfPhM=="), com.mbridge.msdk.foundation.same.a.f20649U);
                            edit.putString(x.a("H+tU+Fz8"), com.mbridge.msdk.foundation.same.a.f20658g);
                            edit.apply();
                        }
                    } else {
                        com.mbridge.msdk.foundation.same.a.f20649U = str3;
                        com.mbridge.msdk.foundation.same.a.f20658g = str;
                        com.mbridge.msdk.foundation.a.a.a.a().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.f20649U);
                        com.mbridge.msdk.foundation.a.a.a.a().a("c", com.mbridge.msdk.foundation.same.a.f20658g);
                    }
                }
            } catch (Throwable th2) {
                ad.a("SDKController", th2.getMessage(), th2);
            }
            try {
                com.mbridge.msdk.foundation.same.f.b.b().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.controller.d.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        Looper.prepare();
                        d.a(d.this);
                        d.b(d.this);
                        Looper.loop();
                    }
                });
                com.mbridge.msdk.foundation.same.f.b.b().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.controller.d.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        d dVar = d.this;
                        d.a(dVar, dVar.f20337j);
                        if (!TextUtils.isEmpty(d.this.f20337j)) {
                            com.mbridge.msdk.foundation.a.a.a.a().a(MBridgeConstans.SDK_APP_ID, d.this.f20337j);
                        }
                        new i(d.this.f20340m).a();
                        d.this.b();
                    }
                });
                k.c();
            } catch (Exception unused2) {
                ad.b("SDKController", "get app setting failed");
            }
            this.f20336i = true;
            z.f(context);
            long az = h.a().a(this.f20337j).az();
            if (az != 1300) {
                this.f20332d.postDelayed(new Runnable() { // from class: com.mbridge.msdk.foundation.controller.d.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        z.d(context);
                    }
                }, az);
            }
        }
    }

    static /* synthetic */ void b(d dVar) {
        List<com.mbridge.msdk.foundation.entity.a> k8;
        Object newInstance;
        Object newInstance2;
        try {
            g b9 = h.a().b(c.m().k());
            if (b9 == null || (k8 = b9.k()) == null || k8.size() <= 0) {
                return;
            }
            for (com.mbridge.msdk.foundation.entity.a aVar : k8) {
                if (aVar.a() == 287) {
                    if (dVar.f20340m != null && (newInstance = MBInterstitialVideoHandler.class.getConstructor(String.class, String.class).newInstance("", aVar.b())) != null) {
                        MBInterstitialVideoHandler.class.getMethod("loadFormSelfFilling", null).invoke(newInstance, null);
                    }
                } else if (aVar.a() == 94 && (newInstance2 = MBRewardVideoHandler.class.getConstructor(String.class, String.class).newInstance("", aVar.b())) != null) {
                    MBRewardVideoHandler.class.getMethod("loadFormSelfFilling", null).invoke(newInstance2, null);
                }
            }
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                th.printStackTrace();
            }
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x008b -> B:28:0x008e). Please report as a decompilation issue!!! */
    public final void a(Map<String, Object> map, int i8) {
        if (MBridgeSDKFactory.getMBridgeSDK().getStatus() != MBridgeSDK.PLUGIN_LOAD_STATUS.COMPLETED) {
            ad.b("SDKController", "preloaad failed,sdk do not inited");
            return;
        }
        this.f20334g = map;
        this.f20333f = i8;
        c.m().k();
        if (map != null) {
            if (this.f20342o == null) {
                this.f20342o = new com.mbridge.msdk.b.a();
            }
            try {
                Map<String, Object> map2 = this.f20334g;
                if (map2 != null && map2.size() > 0 && this.f20334g.containsKey(MBridgeConstans.PROPERTIES_LAYOUT_TYPE)) {
                    int intValue = ((Integer) this.f20334g.get(MBridgeConstans.PROPERTIES_LAYOUT_TYPE)).intValue();
                    if (intValue == 0) {
                        Map<String, Object> map3 = this.f20334g;
                        int i9 = this.f20333f;
                        try {
                            Class<?> cls = Class.forName("com.mbridge.msdk.mbnative.f.a");
                            cls.getMethod("preload", Map.class, Integer.TYPE).invoke(cls.newInstance(), map3, Integer.valueOf(i9));
                        } catch (Exception unused) {
                        }
                    } else if (1 != intValue && 2 != intValue) {
                        ad.b("SDKController", "unknow layout type in preload");
                    }
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    static /* synthetic */ void a(d dVar) {
        try {
            com.mbridge.msdk.d.b.class.getDeclaredMethod("start", null).invoke(com.mbridge.msdk.d.b.class.getMethod("getInstance", null).invoke(null, null), null);
        } catch (Throwable th) {
            ad.a("SDKController", th.getMessage(), th);
        }
    }

    static /* synthetic */ void a(d dVar, final String str) {
        if (h.a() == null) {
            return;
        }
        h a9 = h.a();
        if (a9 != null) {
            g b9 = a9.b(str);
            if (b9 != null) {
                MBridgeConstans.OMID_JS_SERVICE_URL = b9.W();
                MBridgeConstans.OMID_JS_H5_URL = b9.V();
                if (!TextUtils.isEmpty(b9.y())) {
                    com.mbridge.msdk.foundation.same.net.g.d.f().f20940h = b9.y();
                    com.mbridge.msdk.foundation.same.net.g.d.f().b();
                }
                if (!TextUtils.isEmpty(b9.z())) {
                    com.mbridge.msdk.foundation.same.net.g.d.f().f20944l = b9.z();
                    com.mbridge.msdk.foundation.same.net.g.d.f().c();
                }
            } else {
                MBridgeConstans.OMID_JS_SERVICE_URL = com.mbridge.msdk.c.a.b.f19121b;
                MBridgeConstans.OMID_JS_H5_URL = com.mbridge.msdk.c.a.b.f19120a;
            }
        }
        if (h.a().d(str) && h.a().a(str, 1, (String) null)) {
            if (com.mbridge.msdk.foundation.a.a.a.a().a("is_first_init", 0) == 0) {
                try {
                    com.mbridge.msdk.foundation.a.a.a.a().b("is_first_init", 1);
                    if (TextUtils.isEmpty(com.mbridge.msdk.foundation.tools.e.c())) {
                        dVar.f20332d.postDelayed(new Runnable() { // from class: com.mbridge.msdk.foundation.controller.d.5
                            @Override // java.lang.Runnable
                            public final void run() {
                                new j().a(d.this.f20340m, str, d.this.f20338k);
                            }
                        }, 350L);
                    } else {
                        new j().a(dVar.f20340m, str, dVar.f20338k);
                    }
                    return;
                } catch (Throwable unused) {
                    new j().a(dVar.f20340m, str, dVar.f20338k);
                    return;
                }
            }
            new j().a(dVar.f20340m, str, dVar.f20338k);
        }
    }
}
