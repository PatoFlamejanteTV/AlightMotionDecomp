package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.core.app.NotificationCompat;
import androidx.leanback.preference.LeanbackPreferenceDialogFragment;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import java.io.File;
import java.net.URLEncoder;

/* loaded from: classes4.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public static final String f21140a = "i";

    /* renamed from: b, reason: collision with root package name */
    private final Context f21141b;

    /* renamed from: c, reason: collision with root package name */
    private int f21142c;

    public i(Context context, int i8) {
        this.f21141b = context;
        this.f21142c = i8;
    }

    public final void a(com.mbridge.msdk.foundation.entity.l lVar) {
    }

    public final void b(String str, String str2, String str3, String str4, String str5, boolean z8) {
        try {
            if (!TextUtils.isEmpty(str5)) {
                com.mbridge.msdk.foundation.same.report.e.a aVar = new com.mbridge.msdk.foundation.same.report.e.a(this.f21141b);
                StringBuilder sb = new StringBuilder();
                if (z8) {
                    sb.append("hb=");
                    sb.append(1);
                    sb.append("&");
                }
                sb.append(LeanbackPreferenceDialogFragment.ARG_KEY);
                sb.append("=");
                sb.append(URLEncoder.encode("2000066", "utf-8"));
                sb.append("&");
                sb.append("rid");
                sb.append("=");
                sb.append(URLEncoder.encode(str, "utf-8"));
                sb.append("&");
                sb.append("rid_n");
                sb.append("=");
                sb.append(URLEncoder.encode(str2, "utf-8"));
                sb.append("&");
                sb.append("cid");
                sb.append("=");
                sb.append(URLEncoder.encode(str3, "utf-8"));
                sb.append("&");
                sb.append(MBridgeConstans.PROPERTIES_UNIT_ID);
                sb.append("=");
                sb.append(URLEncoder.encode(str4, "utf-8"));
                sb.append("&");
                sb.append("err_method");
                sb.append("=");
                sb.append(str5);
                if (e.a().b()) {
                    e.a().a(sb.toString());
                } else {
                    aVar.post(0, com.mbridge.msdk.foundation.same.net.g.d.f().f20935c, k.a(sb.toString(), this.f21141b, str4), new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.foundation.same.report.i.2
                        @Override // com.mbridge.msdk.foundation.same.report.e.b
                        public final void onFailed(String str6) {
                        }

                        @Override // com.mbridge.msdk.foundation.same.report.e.b
                        public final void onSuccess(String str6) {
                        }
                    });
                }
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }

    public final void a(String str, com.mbridge.msdk.foundation.entity.e eVar, String str2) {
        com.mbridge.msdk.foundation.same.report.e.a aVar = new com.mbridge.msdk.foundation.same.report.e.a(this.f21141b);
        String a9 = com.mbridge.msdk.foundation.entity.e.a(eVar);
        if (TextUtils.isEmpty(a9)) {
            return;
        }
        if (e.a().b()) {
            e.a().a(a9);
        } else {
            aVar.post(0, com.mbridge.msdk.foundation.same.net.g.d.f().f20935c, k.a(a9, this.f21141b, str2), new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.foundation.same.report.i.9
                @Override // com.mbridge.msdk.foundation.same.report.e.b
                public final void onFailed(String str3) {
                }

                @Override // com.mbridge.msdk.foundation.same.report.e.b
                public final void onSuccess(String str3) {
                }
            });
        }
    }

    public i(Context context) {
        this.f21142c = 0;
        this.f21141b = context.getApplicationContext();
    }

    public final void a(final String str, String str2, String str3, Frame frame) {
        com.mbridge.msdk.foundation.same.report.e.a aVar = new com.mbridge.msdk.foundation.same.report.e.a(this.f21141b);
        com.mbridge.msdk.foundation.same.net.h.e a9 = k.a(str2, this.f21141b, str3);
        if (frame != null) {
            a9.a("session_id", frame.getSessionId());
            a9.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_PARENT_SESSION_ID, frame.getParentSessionId());
        }
        aVar.post(0, com.mbridge.msdk.foundation.same.net.g.d.f().f20935c, a9, new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.foundation.same.report.i.10
            @Override // com.mbridge.msdk.foundation.same.report.e.b
            public final void onFailed(String str4) {
            }

            @Override // com.mbridge.msdk.foundation.same.report.e.b
            public final void onSuccess(String str4) {
                if ("click_duration".equals(str) || "load_duration".equals(str)) {
                    com.mbridge.msdk.foundation.same.f.b.g().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.report.i.10.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.mbridge.msdk.foundation.controller.d.a().b();
                        }
                    });
                }
            }
        });
    }

    public final void a(int i8, int i9, String str, String str2, String str3) {
        Context context = this.f21141b;
        try {
            com.mbridge.msdk.foundation.same.report.e.a aVar = new com.mbridge.msdk.foundation.same.report.e.a(context);
            StringBuilder sb = new StringBuilder();
            sb.append(LeanbackPreferenceDialogFragment.ARG_KEY);
            sb.append("=");
            sb.append(URLEncoder.encode("2000058", "utf-8"));
            sb.append("&");
            sb.append("appid");
            sb.append("=");
            sb.append(URLEncoder.encode(com.mbridge.msdk.foundation.controller.c.m().k(), "utf-8"));
            sb.append("&");
            sb.append("dl_type");
            sb.append("=");
            sb.append(URLEncoder.encode(i8 + "", "utf-8"));
            sb.append("&");
            sb.append("dl_link_type");
            sb.append("=");
            sb.append(URLEncoder.encode(i9 + "", "utf-8"));
            sb.append("&");
            sb.append("rid");
            sb.append("=");
            sb.append(URLEncoder.encode(str, "utf-8"));
            sb.append("&");
            sb.append("rid_n");
            sb.append("=");
            sb.append(URLEncoder.encode(str2, "utf-8"));
            sb.append("&");
            sb.append("cid");
            sb.append("=");
            sb.append(URLEncoder.encode(str3, "utf-8"));
            sb.append("&");
            sb.append("tgt_v");
            sb.append("=");
            sb.append(URLEncoder.encode(z.t(context) + "", "utf-8"));
            sb.append("&");
            sb.append("app_v_n");
            sb.append("=");
            sb.append(URLEncoder.encode(z.p(context) + "", "utf-8"));
            sb.append("&");
            sb.append("app_v_c");
            sb.append("=");
            sb.append(URLEncoder.encode(z.q(context) + "", "utf-8"));
            if (!e.a().b()) {
                aVar.post(0, com.mbridge.msdk.foundation.same.net.g.d.f().f20935c, k.a(sb.toString(), context, ""), new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.foundation.same.report.j.1
                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onFailed(String str4) {
                    }

                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onSuccess(String str4) {
                    }
                });
            } else {
                e.a().a(sb.toString());
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.b("ReportControllerDiff", e8.getMessage());
            }
        }
    }

    public final void a(String str, final File file) {
        new com.mbridge.msdk.foundation.same.report.e.a(this.f21141b).post(0, com.mbridge.msdk.foundation.same.net.g.d.f().f20935c, k.a(this.f21141b, str), new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.foundation.same.report.i.11
            @Override // com.mbridge.msdk.foundation.same.report.e.b
            public final void onFailed(String str2) {
            }

            @Override // com.mbridge.msdk.foundation.same.report.e.b
            public final void onSuccess(String str2) {
                File file2 = file;
                if (file2 != null) {
                    file2.delete();
                }
            }
        });
    }

    public final void a(String str, String str2, String str3, String str4, String str5, boolean z8) {
        try {
            com.mbridge.msdk.foundation.same.report.e.a aVar = new com.mbridge.msdk.foundation.same.report.e.a(this.f21141b);
            StringBuilder sb = new StringBuilder();
            if (z8) {
                sb.append("hb=");
                sb.append(1);
                sb.append("&");
            }
            sb.append(LeanbackPreferenceDialogFragment.ARG_KEY);
            sb.append("=");
            sb.append(URLEncoder.encode("2000065", "utf-8"));
            sb.append("&");
            sb.append("rid");
            sb.append("=");
            sb.append(URLEncoder.encode(str, "utf-8"));
            sb.append("&");
            sb.append("rid_n");
            sb.append("=");
            sb.append(URLEncoder.encode(str2, "utf-8"));
            sb.append("&");
            sb.append("cid");
            sb.append("=");
            sb.append(URLEncoder.encode(str3, "utf-8"));
            sb.append("&");
            sb.append(MBridgeConstans.PROPERTIES_UNIT_ID);
            sb.append("=");
            sb.append(URLEncoder.encode(str4, "utf-8"));
            sb.append("&");
            sb.append(CampaignEx.JSON_KEY_CLICK_URL);
            sb.append("=");
            sb.append(URLEncoder.encode(str5, "utf-8"));
            if (e.a().b()) {
                e.a().a(sb.toString());
            } else {
                aVar.post(0, com.mbridge.msdk.foundation.same.net.g.d.f().f20935c, k.a(sb.toString(), this.f21141b, str4), new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.foundation.same.report.i.1
                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onFailed(String str6) {
                    }

                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onSuccess(String str6) {
                    }
                });
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }

    public final void a(final com.mbridge.msdk.foundation.entity.l lVar, final Boolean bool) {
        if (lVar != null) {
            if (lVar.b().equals(ShareTarget.METHOD_GET)) {
                new com.mbridge.msdk.foundation.same.report.e.a(this.f21141b).get(0, lVar.f(), null, new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.foundation.same.report.i.3
                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onFailed(String str) {
                    }

                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onSuccess(String str) {
                        com.mbridge.msdk.foundation.same.f.b.g().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.report.i.3.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                try {
                                    if (i.this.f21141b != null) {
                                        AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                                        if (lVar != null) {
                                            com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.h.a(i.this.f21141b)).a(lVar.f());
                                            if (bool.booleanValue() && com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.h.a(i.this.f21141b)).b() > 20) {
                                                com.mbridge.msdk.foundation.controller.d.a().b();
                                            }
                                        }
                                    }
                                } catch (Exception e8) {
                                    if (MBridgeConstans.DEBUG) {
                                        ad.a(i.f21140a, "reportNetError", e8);
                                    }
                                }
                            }
                        });
                    }
                });
                return;
            }
            if (lVar.b().equals(ShareTarget.METHOD_POST)) {
                com.mbridge.msdk.foundation.same.report.e.a aVar = new com.mbridge.msdk.foundation.same.report.e.a(this.f21141b);
                if (TextUtils.isEmpty(lVar.a())) {
                    return;
                }
                com.mbridge.msdk.foundation.same.net.h.e a9 = k.a(lVar.a(), this.f21141b, lVar.e());
                if (lVar.d() > 0) {
                    a9.a("retry", lVar.d() + "");
                }
                aVar.post(0, lVar.f(), a9, new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.foundation.same.report.i.4
                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onFailed(String str) {
                        com.mbridge.msdk.foundation.same.f.b.g().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.report.i.4.2
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (i.this.f21141b != null) {
                                    AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                                    if (lVar != null) {
                                        com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.h.a(i.this.f21141b)).a(lVar);
                                    }
                                }
                            }
                        });
                    }

                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onSuccess(String str) {
                        com.mbridge.msdk.foundation.same.f.b.g().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.report.i.4.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (i.this.f21141b != null) {
                                    AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                                    if (lVar != null) {
                                        try {
                                            com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.h.a(i.this.f21141b)).a(lVar.a(), lVar.f(), lVar.c());
                                            if (bool.booleanValue() && com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.h.a(i.this.f21141b)).a() > 0) {
                                                com.mbridge.msdk.foundation.controller.d.a().b();
                                            }
                                        } catch (Exception e8) {
                                            if (MBridgeConstans.DEBUG) {
                                                ad.a(i.f21140a, "reportNetError", e8);
                                            }
                                        }
                                    }
                                }
                            }
                        });
                    }
                });
            }
        }
    }

    public final void a(String str, String str2, String str3, String str4, String str5) {
        try {
            com.mbridge.msdk.foundation.same.report.e.a aVar = new com.mbridge.msdk.foundation.same.report.e.a(this.f21141b);
            StringBuilder sb = new StringBuilder();
            int l8 = z.l(this.f21141b);
            sb.append(LeanbackPreferenceDialogFragment.ARG_KEY);
            sb.append("=");
            sb.append(URLEncoder.encode("2000071", "utf-8"));
            sb.append("&");
            sb.append("rid");
            sb.append("=");
            sb.append(URLEncoder.encode(str, "utf-8"));
            sb.append("&");
            sb.append("rid_n");
            sb.append("=");
            sb.append(URLEncoder.encode(str2, "utf-8"));
            sb.append("&");
            sb.append("cid");
            sb.append("=");
            sb.append(URLEncoder.encode(str3, "utf-8"));
            sb.append("&");
            sb.append(MBridgeConstans.PROPERTIES_UNIT_ID);
            sb.append("=");
            sb.append(URLEncoder.encode(str4, "utf-8"));
            sb.append("&");
            sb.append("reason");
            sb.append("=");
            sb.append(URLEncoder.encode(str5, "utf-8"));
            sb.append("&");
            sb.append("network_type");
            sb.append("=");
            sb.append(URLEncoder.encode(l8 + "", "utf-8"));
            sb.append("&");
            sb.append("result");
            sb.append("=");
            sb.append(URLEncoder.encode(MBridgeConstans.ENDCARD_URL_TYPE_PL, "utf-8"));
            if (e.a().b()) {
                e.a().a(sb.toString());
            } else {
                aVar.post(0, com.mbridge.msdk.foundation.same.net.g.d.f().f20935c, k.a(sb.toString(), this.f21141b, str4), new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.foundation.same.report.i.5
                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onFailed(String str6) {
                    }

                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onSuccess(String str6) {
                    }
                });
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }

    public final void a() {
        try {
            if (k.a()) {
                com.mbridge.msdk.foundation.same.report.e.a aVar = new com.mbridge.msdk.foundation.same.report.e.a(this.f21141b);
                String k8 = com.mbridge.msdk.foundation.controller.c.m().k();
                com.mbridge.msdk.c.g b9 = com.mbridge.msdk.c.h.a().b(k8);
                if (b9 == null) {
                    com.mbridge.msdk.c.h.a();
                    b9 = com.mbridge.msdk.c.i.a();
                }
                int K8 = b9.K();
                String str = "key=2000053&Appid=" + k8 + "&uptips2=" + b9.at() + "&info_status=" + com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().h() + "&iseu=" + K8;
                String c8 = com.mbridge.msdk.foundation.tools.e.c();
                if (!TextUtils.isEmpty(c8)) {
                    str = str + "&gaid=" + c8;
                }
                String str2 = str + "&GDPR_area=" + b9.aG() + "&GDPR_consent=" + com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().g();
                if (e.a().b()) {
                    e.a().a(str2);
                    return;
                }
                aVar.post(0, com.mbridge.msdk.foundation.same.net.g.d.f().f20935c, k.a(str2, this.f21141b, ""), new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.foundation.same.report.i.6
                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onFailed(String str3) {
                    }

                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onSuccess(String str3) {
                    }
                });
                k.b();
            }
        } catch (Throwable th) {
            ad.b(f21140a, th.getMessage());
        }
    }

    public final void a(int i8, String str) {
        new com.mbridge.msdk.foundation.same.report.e.a(this.f21141b).post(0, com.mbridge.msdk.foundation.same.net.g.d.f().f20935c, k.a(NotificationCompat.CATEGORY_EVENT, k.a((Campaign) null, i8, "request"), this.f21141b, str), new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.foundation.same.report.i.7
            @Override // com.mbridge.msdk.foundation.same.report.e.b
            public final void onFailed(String str2) {
            }

            @Override // com.mbridge.msdk.foundation.same.report.e.b
            public final void onSuccess(String str2) {
            }
        });
    }

    public final void a(String str, String str2, String str3) {
        try {
            com.mbridge.msdk.foundation.same.report.e.a aVar = new com.mbridge.msdk.foundation.same.report.e.a(this.f21141b);
            String str4 = "click_type=" + URLEncoder.encode("1", "utf-8") + "&cid=" + URLEncoder.encode(str, "utf-8") + "&" + MBridgeConstans.PROPERTIES_UNIT_ID + "=" + URLEncoder.encode(str2, "utf-8") + "&" + LeanbackPreferenceDialogFragment.ARG_KEY + "=" + URLEncoder.encode("2000027", "utf-8") + "&http_url=" + URLEncoder.encode(str3, "utf-8");
            if (e.a().b()) {
                e.a().a(str4);
            } else {
                aVar.post(0, com.mbridge.msdk.foundation.same.net.g.d.f().f20935c, k.a(str4, this.f21141b, str2), new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.foundation.same.report.i.8
                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onFailed(String str5) {
                    }

                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onSuccess(String str5) {
                    }
                });
            }
        } catch (Exception e8) {
            ad.b(f21140a, e8.getMessage());
        }
    }
}
