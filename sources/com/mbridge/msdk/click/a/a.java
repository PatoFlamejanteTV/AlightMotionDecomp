package com.mbridge.msdk.click.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.foundation.db.n;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.l;
import com.mbridge.msdk.foundation.same.net.g.d;
import com.mbridge.msdk.foundation.same.report.e;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.foundation.tools.ao;
import j$.util.concurrent.ConcurrentHashMap;
import java.net.URLEncoder;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static String f19305a = "mtg_retry_report=1";

    /* renamed from: b, reason: collision with root package name */
    public static int f19306b = 10000;

    /* renamed from: c, reason: collision with root package name */
    public static int f19307c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static int f19308d = 50;

    /* renamed from: e, reason: collision with root package name */
    public static int f19309e = 600000;

    /* renamed from: f, reason: collision with root package name */
    public static int f19310f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static int f19311g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static int f19312h = 2;

    /* renamed from: i, reason: collision with root package name */
    public static int f19313i = 3;

    /* renamed from: j, reason: collision with root package name */
    public static int f19314j = 4;

    /* renamed from: k, reason: collision with root package name */
    public static int f19315k = 5;

    /* renamed from: l, reason: collision with root package name */
    private static String f19316l = "RetryReportControl";

    /* renamed from: o, reason: collision with root package name */
    private static int f19317o;

    /* renamed from: p, reason: collision with root package name */
    private static int f19318p;

    /* renamed from: m, reason: collision with root package name */
    private ConcurrentHashMap<String, com.mbridge.msdk.click.a.b> f19319m;

    /* renamed from: n, reason: collision with root package name */
    private c f19320n;

    /* renamed from: q, reason: collision with root package name */
    private BroadcastReceiver f19321q;

    /* renamed from: r, reason: collision with root package name */
    private final Handler f19322r;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.mbridge.msdk.click.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0390a {

        /* renamed from: a, reason: collision with root package name */
        private static a f19326a = new a();
    }

    /* loaded from: classes4.dex */
    private static class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i8 = message.what;
            if (i8 != 1) {
                if (i8 == 2) {
                    a.a(a.a());
                }
            } else {
                Object obj = message.obj;
                if (obj instanceof String) {
                    a.a().a((String) obj, com.mbridge.msdk.click.a.b.f19327a);
                }
            }
        }
    }

    private a() {
        this.f19319m = new ConcurrentHashMap<>();
        this.f19320n = new c(f19308d);
        this.f19322r = new b(Looper.getMainLooper());
        g a9 = h.a().a(com.mbridge.msdk.foundation.controller.c.m().k());
        f19307c = a9.af();
        f19306b = a9.ah() * 1000;
        f19309e = a9.ai() * 1000;
        f19317o = a9.ae();
        f19318p = a9.ag();
        try {
            if (this.f19321q == null) {
                this.f19321q = new BroadcastReceiver() { // from class: com.mbridge.msdk.click.a.a.2
                    @Override // android.content.BroadcastReceiver
                    public final void onReceive(Context context, Intent intent) {
                        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                            a.this.f19322r.sendEmptyMessage(2);
                        }
                    }
                };
                Context c8 = com.mbridge.msdk.foundation.controller.c.m().c();
                if (c8 != null) {
                    c8.registerReceiver(this.f19321q, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                }
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public static a a() {
        return C0390a.f19326a;
    }

    private void a(com.mbridge.msdk.click.a.b bVar) {
        String str;
        String str2;
        try {
            CampaignEx f8 = bVar.f();
            if (f8 != null) {
                String requestId = f8.getRequestId();
                str2 = f8.getRequestIdNotice();
                str = requestId;
            } else {
                str = "";
                str2 = str;
            }
            a(com.mbridge.msdk.foundation.controller.c.m().c(), bVar.i().toString(), bVar.g(), str, str2, bVar.d());
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    private boolean b(int i8) {
        return i8 == f19311g || i8 == f19312h;
    }

    private static void a(Context context, String str, String str2, String str3, String str4, int i8) {
        if (af.a().a("metrics", "e_t_l", af.a().a("e_t_l", 1)) == 1) {
            com.mbridge.msdk.foundation.same.report.g.a().a(context, str, str2, str3, str4, i8);
            return;
        }
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("key=2000105&");
                stringBuffer.append("url=" + URLEncoder.encode(str2, "utf-8") + "&");
                stringBuffer.append("type=" + i8 + "&");
                if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f20649U)) {
                    stringBuffer.append("b=" + com.mbridge.msdk.foundation.same.a.f20649U + "&");
                }
                if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f20658g)) {
                    stringBuffer.append("c=" + com.mbridge.msdk.foundation.same.a.f20658g + "&");
                }
                if (!TextUtils.isEmpty(str3)) {
                    stringBuffer.append("rid=");
                    stringBuffer.append(str3);
                    stringBuffer.append("&");
                }
                if (!TextUtils.isEmpty(str3)) {
                    stringBuffer.append("rid_n=");
                    stringBuffer.append(str4);
                    stringBuffer.append("&");
                }
                stringBuffer.append("reason=" + URLEncoder.encode(str, "utf-8"));
                if (e.a().b()) {
                    e.a().a(stringBuffer.toString());
                } else {
                    a(context, stringBuffer.toString());
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private static void a(final Context context, final String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            new com.mbridge.msdk.foundation.same.report.e.a(context).post(0, d.f().f20935c, k.a(str, context), new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.click.a.a.1
                @Override // com.mbridge.msdk.foundation.same.report.e.b
                public final void onFailed(String str2) {
                    l lVar = new l();
                    lVar.a(str);
                    lVar.a(System.currentTimeMillis());
                    lVar.a(0);
                    lVar.b(ShareTarget.METHOD_POST);
                    lVar.c(d.f().f20935c);
                    n.a(com.mbridge.msdk.foundation.db.h.a(context)).a(lVar);
                }

                @Override // com.mbridge.msdk.foundation.same.report.e.b
                public final void onSuccess(String str2) {
                    ad.b(a.f19316l, str2);
                }
            });
        } catch (Exception e8) {
            e8.printStackTrace();
            ad.b(f19316l, e8.getMessage());
        }
    }

    private void a(String str) {
        Message obtainMessage = this.f19322r.obtainMessage();
        obtainMessage.what = 1;
        obtainMessage.obj = str;
        this.f19322r.sendMessageDelayed(obtainMessage, f19306b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i8) {
        String str2;
        c cVar = this.f19320n;
        if (cVar != null) {
            com.mbridge.msdk.click.a.b b9 = cVar.b(str);
            this.f19320n.a(str);
            if (b9 == null) {
                com.mbridge.msdk.click.a.b bVar = this.f19319m.get(str);
                if (bVar == null || System.currentTimeMillis() > bVar.j() + f19309e || bVar.h() >= f19307c || i8 == com.mbridge.msdk.click.a.b.f19328b) {
                    return;
                }
                a(str);
                return;
            }
            if (System.currentTimeMillis() <= b9.j() + f19309e) {
                b9.a(i8);
                this.f19319m.put(str, b9);
                if (ao.c(str) == 0) {
                    str2 = str + "?" + f19305a;
                } else {
                    str2 = str + "&" + f19305a;
                }
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), b9.f(), b9.e(), str2, b9.a(), b9.b(), b9.d());
                return;
            }
            if (i8 != com.mbridge.msdk.click.a.b.f19328b) {
                a(b9);
            }
        }
    }

    private boolean a(int i8) {
        return i8 == f19314j || i8 == f19313i;
    }

    public final void a(String str, String str2, CampaignEx campaignEx, String str3, boolean z8, boolean z9, int i8) {
        if ((a(i8) || b(i8) || i8 == f19315k) && !TextUtils.isEmpty(str)) {
            String replace = str.replace("?" + f19305a, "").replace("&" + f19305a, "");
            if (this.f19319m == null) {
                this.f19319m = new ConcurrentHashMap<>();
            }
            com.mbridge.msdk.click.a.b remove = this.f19319m.remove(replace);
            if (remove == null) {
                remove = new com.mbridge.msdk.click.a.b(str, str2);
                remove.b(i8);
                remove.a(z8);
                remove.b(z9);
                remove.a(campaignEx);
                remove.a(str3);
            } else if (remove.c() != com.mbridge.msdk.click.a.b.f19328b) {
                remove.b(str2);
            }
            if ((!a(i8) || f19317o == 0) && ((!b(i8) || f19318p == 0) && i8 != f19315k)) {
                a(remove);
                return;
            }
            if (System.currentTimeMillis() < remove.j() + f19309e) {
                if (this.f19320n == null) {
                    this.f19320n = new c(f19308d);
                }
                this.f19320n.a(replace, remove);
                if (remove.c() == com.mbridge.msdk.click.a.b.f19327a) {
                    if (remove.h() <= f19307c) {
                        a(replace);
                        return;
                    } else {
                        a(remove);
                        return;
                    }
                }
                return;
            }
            if (remove.c() == com.mbridge.msdk.click.a.b.f19327a) {
                a(remove);
            }
        }
    }

    static /* synthetic */ void a(a aVar) {
        c cVar = aVar.f19320n;
        if (cVar != null) {
            Iterator<String> it = cVar.a().iterator();
            while (it.hasNext()) {
                aVar.a(it.next(), com.mbridge.msdk.click.a.b.f19328b);
            }
        }
    }
}
