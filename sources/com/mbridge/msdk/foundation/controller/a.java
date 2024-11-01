package com.mbridge.msdk.foundation.controller;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.i;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.al;
import com.mbridge.msdk.foundation.tools.g;
import com.mbridge.msdk.foundation.tools.z;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f20291a = c.class.getSimpleName();

    /* renamed from: b, reason: collision with root package name */
    public static HashMap<String, String> f20292b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    protected String f20293c;

    /* renamed from: d, reason: collision with root package name */
    protected Context f20294d;

    /* renamed from: e, reason: collision with root package name */
    protected String f20295e;

    /* renamed from: g, reason: collision with root package name */
    private WeakReference<Activity> f20297g;

    /* renamed from: h, reason: collision with root package name */
    private String f20298h;

    /* renamed from: i, reason: collision with root package name */
    private int f20299i;

    /* renamed from: l, reason: collision with root package name */
    private String f20302l;

    /* renamed from: m, reason: collision with root package name */
    private String f20303m;

    /* renamed from: n, reason: collision with root package name */
    private int f20304n;

    /* renamed from: p, reason: collision with root package name */
    private WeakReference<Context> f20306p;

    /* renamed from: q, reason: collision with root package name */
    private JSONObject f20307q;

    /* renamed from: s, reason: collision with root package name */
    private String f20309s;

    /* renamed from: f, reason: collision with root package name */
    private final g f20296f = new g();

    /* renamed from: j, reason: collision with root package name */
    private JSONObject f20300j = new JSONObject();

    /* renamed from: k, reason: collision with root package name */
    private boolean f20301k = false;

    /* renamed from: o, reason: collision with root package name */
    private ConcurrentHashMap<String, String> f20305o = new ConcurrentHashMap<>();

    /* renamed from: r, reason: collision with root package name */
    private int f20308r = 0;

    /* renamed from: com.mbridge.msdk.foundation.controller.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0397a {
    }

    public final WeakReference<Activity> a() {
        return this.f20297g;
    }

    protected abstract void a(InterfaceC0397a interfaceC0397a);

    public final String b() {
        if (!TextUtils.isEmpty(this.f20302l)) {
            return this.f20302l;
        }
        Context context = this.f20294d;
        if (context != null) {
            return (String) al.a(context, "sp_appKey", "");
        }
        return null;
    }

    public final Context c() {
        return this.f20294d;
    }

    public final g d() {
        return this.f20296f;
    }

    public final Context e() {
        WeakReference<Context> weakReference = this.f20306p;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public final int f() {
        return this.f20299i;
    }

    public final String g() {
        try {
            if (!TextUtils.isEmpty(this.f20295e)) {
                return this.f20295e;
            }
            Context context = this.f20294d;
            if (context != null) {
                String packageName = context.getPackageName();
                this.f20295e = packageName;
                return packageName;
            }
            return null;
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public final String h() {
        if (!TextUtils.isEmpty(this.f20303m)) {
            return this.f20303m;
        }
        Context context = this.f20294d;
        if (context != null) {
            return (String) al.a(context, "sp_wx_appKey", "");
        }
        return null;
    }

    public final JSONObject i() {
        return this.f20307q;
    }

    public final int j() {
        return this.f20308r;
    }

    public final String k() {
        try {
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        if (!TextUtils.isEmpty(this.f20293c)) {
            return this.f20293c;
        }
        Context context = this.f20294d;
        if (context != null) {
            return (String) al.a(context, "sp_appId", "");
        }
        return "";
    }

    public final String l() {
        if (!TextUtils.isEmpty(this.f20309s)) {
            return this.f20309s;
        }
        try {
            String md5 = SameMD5.getMD5(c.m().k() + c.m().b());
            this.f20309s = md5;
            return md5;
        } catch (Exception unused) {
            return "";
        }
    }

    public final void a(WeakReference<Activity> weakReference) {
        this.f20297g = weakReference;
    }

    public final void c(int i8) {
        this.f20308r = i8;
    }

    public final void d(String str) {
        Context context;
        try {
            this.f20293c = str;
            if (TextUtils.isEmpty(str) || (context = this.f20294d) == null) {
                return;
            }
            al.b(context, "sp_appId", str);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void e(String str) {
        Context context;
        try {
            this.f20302l = str;
            if (TextUtils.isEmpty(str) || (context = this.f20294d) == null) {
                return;
            }
            al.b(context, "sp_appKey", str);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void f(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f20295e = str;
    }

    public final void a(Context context) {
        if (context instanceof Activity) {
            this.f20306p = new WeakReference<>(context);
        }
    }

    public final void c(String str) {
        Context context;
        try {
            this.f20298h = str;
            if (TextUtils.isEmpty(str) || (context = this.f20294d) == null) {
                return;
            }
            al.b(context, "applicationIds", str);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void a(int i8) {
        this.f20299i = i8;
    }

    public final void b(int i8) {
        this.f20304n = i8;
    }

    public final void a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f20303m = str;
            Context context = this.f20294d;
            if (context != null) {
                al.b(context, "sp_wx_appKey", str);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void b(String str) {
        try {
            if (this.f20305o != null && !TextUtils.isEmpty(str) && this.f20305o.containsKey(str)) {
                this.f20305o.remove(str);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void b(Context context) {
        this.f20294d = context;
    }

    public final BitmapDrawable a(String str, int i8) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (TextUtils.isEmpty(str) || (concurrentHashMap = this.f20305o) == null || !concurrentHashMap.containsKey(str) || !af.a().a("w_m_r_l", true)) {
            return null;
        }
        String str2 = this.f20305o.get(str);
        BitmapDrawable n8 = ai.n(str2);
        k.a(str, i8, TextUtils.isEmpty(str2) ? 2 : 1, TextUtils.isEmpty(str2) ? "get watermark failed" : n8 != null ? "" : "str to bitmap failed", n8 == null ? 2 : 1, str2);
        return n8;
    }

    public final void a(JSONObject jSONObject) {
        this.f20307q = jSONObject;
    }

    public final void a(final InterfaceC0397a interfaceC0397a, final Handler handler) {
        if (this.f20301k) {
            return;
        }
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.b.a() && com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                Object a9 = al.a(this.f20294d, MBridgeConstans.SP_GA_ID, "");
                Object a10 = al.a(this.f20294d, MBridgeConstans.SP_GA_ID_LIMIT, 0);
                if (a9 instanceof String) {
                    String str = (String) a9;
                    if (!TextUtils.isEmpty(str)) {
                        com.mbridge.msdk.foundation.tools.e.a(str);
                    } else {
                        com.mbridge.msdk.foundation.tools.e.c();
                    }
                    if (a10 instanceof Integer) {
                        com.mbridge.msdk.foundation.tools.e.a(((Integer) a10).intValue());
                    }
                }
            }
        } catch (Exception e8) {
            ad.b(f20291a, e8.getMessage());
        }
        try {
            JSONObject jSONObject = new JSONObject();
            this.f20307q = jSONObject;
            jSONObject.put("webgl", 0);
        } catch (JSONException e9) {
            ad.b(f20291a, e9.getMessage());
        }
        new Thread(new Runnable() { // from class: com.mbridge.msdk.foundation.controller.a.1
            @Override // java.lang.Runnable
            public final void run() {
                int i8;
                try {
                    z.o(a.this.f20294d);
                    a.this.a(interfaceC0397a);
                    a aVar = a.this;
                    h.a(aVar.f20294d, aVar.f20293c);
                } catch (Exception e10) {
                    ad.b(a.f20291a, e10.getMessage());
                }
                if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                    try {
                        if (a.this.f20294d.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                            i8 = 1;
                        } else {
                            i8 = 2;
                        }
                        z.c(i8);
                    } catch (PackageManager.NameNotFoundException unused) {
                        z.c(0);
                    } catch (Throwable th) {
                        ad.b(a.f20291a, th.getMessage());
                    }
                }
                try {
                    com.mbridge.msdk.c.g b9 = h.a().b(c.m().k());
                    if (b9 == null) {
                        h.a();
                        b9 = i.a();
                    }
                    Message obtain = Message.obtain();
                    obtain.obj = b9;
                    obtain.what = 9;
                    handler.sendMessage(obtain);
                } catch (Exception e11) {
                    ad.b(a.f20291a, e11.getMessage());
                }
            }
        }).start();
    }

    public final void a(String str, JSONObject jSONObject) {
        if (af.a().a("w_m_r_l", true)) {
            try {
                if (this.f20300j == null) {
                    this.f20300j = jSONObject;
                } else if (jSONObject != null) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        this.f20300j.put(next, jSONObject.get(next));
                    }
                }
                if (this.f20300j.has(MBridgeConstans.EXTRA_KEY_WM)) {
                    if (this.f20305o == null) {
                        this.f20305o = new ConcurrentHashMap<>();
                    }
                    this.f20305o.put(str, this.f20300j.getString(MBridgeConstans.EXTRA_KEY_WM));
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }
}
