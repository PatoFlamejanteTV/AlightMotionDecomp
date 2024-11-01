package com.mbridge.msdk.c;

import android.content.Context;
import android.text.TextUtils;
import androidx.leanback.preference.LeanbackPreferenceDialogFragment;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static final String f19260a = "j";

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final Context context, final String str, final String str2) {
        if (!com.mbridge.msdk.foundation.same.net.g.d.f().a()) {
            try {
                if (com.mbridge.msdk.foundation.same.net.g.d.f().f20949q) {
                    return;
                }
                com.mbridge.msdk.foundation.same.net.g.d.f().f20949q = true;
                if (System.currentTimeMillis() >= com.mbridge.msdk.foundation.a.a.a.a().b("mkey_spare_host_ts").longValue() + 86400000) {
                    String a9 = com.mbridge.msdk.foundation.a.a.a.a().a("mkey_spare_host");
                    if (!TextUtils.isEmpty(a9)) {
                        for (String str3 : a9.split("\n")) {
                            if (!TextUtils.isEmpty(str3.trim()) && !com.mbridge.msdk.foundation.same.net.g.d.f().f20952t.contains(str3.trim())) {
                                com.mbridge.msdk.foundation.same.net.g.d.f().f20952t.add(str3.trim());
                                com.mbridge.msdk.foundation.same.net.g.d.f().f20955w.add(str3.trim());
                            }
                        }
                        b(context, str, str2);
                        return;
                    }
                }
                new com.mbridge.msdk.foundation.same.net.h.c(context.getApplicationContext()).get(0, com.mbridge.msdk.foundation.same.net.g.d.f().f20934b, new com.mbridge.msdk.foundation.same.net.h.e(), new com.mbridge.msdk.foundation.same.net.c.a() { // from class: com.mbridge.msdk.c.j.2
                    @Override // com.mbridge.msdk.foundation.same.net.c.a
                    public final void a(String str4) {
                        com.mbridge.msdk.foundation.same.net.g.d.f().f20949q = false;
                        ad.a(j.f19260a, "fetch CNDSettingHost failed, errorCode = " + str4);
                    }

                    @Override // com.mbridge.msdk.foundation.same.net.c.a
                    public final void b(String str4) {
                        ad.a(j.f19260a, "fetch CNDSettingHost success, content = " + str4);
                        if (!TextUtils.isEmpty(str4)) {
                            com.mbridge.msdk.foundation.a.a.a.a().a("mkey_spare_host_ts", System.currentTimeMillis());
                            com.mbridge.msdk.foundation.a.a.a.a().a("mkey_spare_host", str4);
                            for (String str5 : str4.split("\n")) {
                                if (!TextUtils.isEmpty(str5.trim()) && !com.mbridge.msdk.foundation.same.net.g.d.f().f20952t.contains(str5.trim())) {
                                    com.mbridge.msdk.foundation.same.net.g.d.f().f20952t.add(str5.trim());
                                    com.mbridge.msdk.foundation.same.net.g.d.f().f20955w.add(str5.trim());
                                }
                            }
                            j.this.b(context, str, str2);
                        }
                    }
                });
                return;
            } catch (Throwable th) {
                com.mbridge.msdk.foundation.same.net.g.d.f().f20949q = false;
                ad.b(f19260a, th.getMessage());
                return;
            }
        }
        a(context, str, str2);
    }

    public final void a(final Context context, final String str, final String str2) {
        if (context == null) {
            return;
        }
        com.mbridge.msdk.foundation.same.net.h.e eVar = new com.mbridge.msdk.foundation.same.net.h.e();
        eVar.a(MBridgeConstans.APP_ID, str);
        eVar.a("sign", SameMD5.getMD5(str + str2));
        try {
            String ax = h.a().a(str).ax();
            if (TextUtils.isEmpty(ax)) {
                ax = "";
            }
            eVar.a("vtag", ax);
        } catch (Throwable th) {
            ad.b(f19260a, th.getMessage());
        }
        if (com.mbridge.msdk.foundation.same.net.g.d.f().f20949q) {
            eVar.a("st_net", com.mbridge.msdk.foundation.same.net.g.d.f().f20951s + "");
        }
        com.mbridge.msdk.foundation.same.net.h.d dVar = new com.mbridge.msdk.foundation.same.net.h.d() { // from class: com.mbridge.msdk.c.j.1
            @Override // com.mbridge.msdk.foundation.same.net.h.d
            public final void a(JSONObject jSONObject) {
                try {
                    j.this.a(1, 0, "");
                } catch (Throwable th2) {
                    ad.b(j.f19260a, th2.getMessage());
                }
                try {
                    if (ai.a(jSONObject)) {
                        if (jSONObject.optInt("vtag_status", 0) == 1) {
                            String g8 = h.a().g(str);
                            if (!TextUtils.isEmpty(g8)) {
                                try {
                                    jSONObject = h.a().a(new JSONObject(g8), jSONObject);
                                } catch (Exception e8) {
                                    ad.b(j.f19260a, e8.getMessage());
                                }
                            }
                        }
                        jSONObject.put("current_time", System.currentTimeMillis());
                        if (com.mbridge.msdk.foundation.same.net.g.d.f().f20950r) {
                            if (TextUtils.isEmpty(jSONObject.optString("hst_st_t"))) {
                                jSONObject.put("hst_st_t", com.mbridge.msdk.foundation.same.net.g.d.f().f20944l);
                            }
                        } else if (TextUtils.isEmpty(jSONObject.optString("hst_st"))) {
                            jSONObject.put("hst_st", com.mbridge.msdk.foundation.same.net.g.d.f().f20940h);
                        }
                        h.a().g(str, jSONObject.toString());
                        com.mbridge.msdk.foundation.same.net.g.d.f().e();
                        try {
                            if (!TextUtils.isEmpty(jSONObject.optString("mraid_js"))) {
                                com.mbridge.msdk.c.b.a.a().a(context, jSONObject.optString("mraid_js"));
                            }
                        } catch (Exception e9) {
                            ad.b(j.f19260a, e9.getMessage());
                        }
                        if (!TextUtils.isEmpty(jSONObject.optString("web_env_url"))) {
                            com.mbridge.msdk.c.b.b.a().a(context, jSONObject.optString("web_env_url"));
                        }
                        j.a(j.this, context, str);
                    } else {
                        h.a().f(str);
                    }
                    j.a(j.this);
                } catch (Exception e10) {
                    ad.b(j.f19260a, e10.getMessage());
                }
            }

            @Override // com.mbridge.msdk.foundation.same.net.h.d
            public final void a(String str3) {
                try {
                    j.this.a(2, 0, str3);
                } catch (Throwable th2) {
                    ad.b(j.f19260a, th2.getMessage());
                }
                if (!com.mbridge.msdk.foundation.same.net.g.d.f().f20950r) {
                    com.mbridge.msdk.foundation.same.net.g.d.f().f20953u++;
                } else {
                    com.mbridge.msdk.foundation.same.net.g.d.f().f20954v++;
                }
                j.this.b(context, str, str2);
                j.a(j.this);
                ad.b(j.f19260a, "get app setting error" + str3);
            }
        };
        com.mbridge.msdk.c.a.c cVar = new com.mbridge.msdk.c.a.c(context);
        String str3 = com.mbridge.msdk.foundation.same.net.g.d.f().f20913G;
        try {
            if (com.mbridge.msdk.foundation.same.net.g.d.f().f20950r && com.mbridge.msdk.foundation.same.net.g.d.f().f20949q && com.mbridge.msdk.foundation.same.net.g.d.f().f20954v < com.mbridge.msdk.foundation.same.net.g.d.f().f20955w.size()) {
                String str4 = com.mbridge.msdk.foundation.same.net.g.d.f().f20955w.get(com.mbridge.msdk.foundation.same.net.g.d.f().f20954v);
                if (!TextUtils.isEmpty(str4)) {
                    if (!str4.startsWith("http")) {
                        if (str4.startsWith("https")) {
                        }
                    }
                    str3 = str4 + "/setting";
                }
            }
        } catch (Throwable th2) {
            ad.b(f19260a, th2.getMessage());
        }
        cVar.get(1, str3, eVar, dVar);
        a(3, 0, "");
    }

    private String b() {
        String str = com.mbridge.msdk.foundation.same.net.g.d.f().f20950r ? com.mbridge.msdk.foundation.same.net.g.d.f().f20914H : com.mbridge.msdk.foundation.same.net.g.d.f().f20913G;
        try {
            if (!com.mbridge.msdk.foundation.same.net.g.d.f().f20950r || !com.mbridge.msdk.foundation.same.net.g.d.f().f20949q || com.mbridge.msdk.foundation.same.net.g.d.f().f20954v >= com.mbridge.msdk.foundation.same.net.g.d.f().f20955w.size()) {
                return str;
            }
            String str2 = com.mbridge.msdk.foundation.same.net.g.d.f().f20955w.get(com.mbridge.msdk.foundation.same.net.g.d.f().f20954v);
            if (TextUtils.isEmpty(str2)) {
                return str;
            }
            if (!str2.startsWith("http") && !str2.startsWith("https")) {
                return str;
            }
            return str2 + "/setting";
        } catch (Throwable th) {
            ad.b(f19260a, th.getMessage());
            return str;
        }
    }

    public final void a(Context context, final String str, String str2, final String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            str = com.mbridge.msdk.foundation.controller.c.m().k();
            str2 = com.mbridge.msdk.foundation.controller.c.m().b();
        }
        if (h.a().e(str3, str) && h.a().a(str, 2, str3)) {
            com.mbridge.msdk.foundation.same.net.h.e eVar = new com.mbridge.msdk.foundation.same.net.h.e();
            String str4 = "[" + str3 + "]";
            eVar.a("unit_ids", str4);
            eVar.a(MBridgeConstans.APP_ID, str);
            eVar.a("sign", SameMD5.getMD5(str + str2));
            try {
                String t8 = h.a().c(str, str4).t();
                if (TextUtils.isEmpty(t8)) {
                    t8 = "";
                }
                eVar.a("vtag", t8);
            } catch (Throwable th) {
                ad.b(f19260a, th.getMessage());
            }
            com.mbridge.msdk.foundation.same.net.h.d dVar = new com.mbridge.msdk.foundation.same.net.h.d() { // from class: com.mbridge.msdk.c.j.3
                @Override // com.mbridge.msdk.foundation.same.net.h.d
                public final void a(JSONObject jSONObject) {
                    try {
                        if (ai.a(jSONObject)) {
                            String optString = jSONObject.optString("vtag", "");
                            String optString2 = jSONObject.optString("rid", "");
                            JSONArray optJSONArray = jSONObject.optJSONArray("unitSetting");
                            if (optJSONArray != null && optJSONArray.length() > 0) {
                                JSONObject optJSONObject = optJSONArray.optJSONObject(0);
                                if (jSONObject.optInt("vtag_status", 0) == 1) {
                                    h.a();
                                    String a9 = com.mbridge.msdk.foundation.a.a.a.a().a(str + "_" + str3);
                                    if (!TextUtils.isEmpty(a9)) {
                                        try {
                                            optJSONObject = h.a().a(new JSONObject(a9), optJSONObject);
                                        } catch (Exception e8) {
                                            e8.printStackTrace();
                                        }
                                    }
                                }
                                optJSONObject.put("current_time", System.currentTimeMillis());
                                optJSONObject.put("vtag", optString);
                                optJSONObject.put("rid", optString2);
                                h.a().a(str, str3, optJSONObject.toString());
                            }
                        } else {
                            h.a().h(str, str3);
                        }
                        j.this.a(1, 1, "");
                    } catch (Exception e9) {
                        ad.b(j.f19260a, e9.getMessage());
                    }
                }

                @Override // com.mbridge.msdk.foundation.same.net.h.d
                public final void a(String str5) {
                    j.this.a(2, 1, "");
                }
            };
            dVar.setUnitId(str3);
            new com.mbridge.msdk.c.a.c(context).get(1, com.mbridge.msdk.foundation.same.net.g.d.f().f20913G, eVar, dVar);
            a(3, 1, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i8, int i9, String str) {
        String str2;
        try {
            com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            dVar.a(LeanbackPreferenceDialogFragment.ARG_KEY, "2000112");
            dVar.a("st_net", Integer.valueOf(com.mbridge.msdk.foundation.same.net.g.d.f().f20951s));
            dVar.a("result", Integer.valueOf(i8));
            dVar.a("type", Integer.valueOf(i9));
            if (i9 == 0) {
                str2 = b();
            } else {
                str2 = com.mbridge.msdk.foundation.same.net.g.d.f().f20950r ? com.mbridge.msdk.foundation.same.net.g.d.f().f20914H : com.mbridge.msdk.foundation.same.net.g.d.f().f20913G;
            }
            dVar.a("url", str2);
            dVar.a("reason", str);
            bVar.a("2000112", dVar);
            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000112", bVar);
        } catch (Throwable th) {
            ad.b(f19260a, th.getMessage());
        }
    }

    static /* synthetic */ void a(j jVar, Context context, String str) {
        g b9;
        h a9 = h.a();
        if (a9 != null && (b9 = a9.b(str)) != null) {
            MBridgeConstans.OMID_JS_SERVICE_URL = b9.W();
            MBridgeConstans.OMID_JS_H5_URL = b9.V();
        }
        com.mbridge.msdk.a.b.a(context);
        com.mbridge.msdk.a.b.b(context);
    }

    static /* synthetic */ void a(j jVar) {
        try {
            new com.mbridge.msdk.foundation.same.report.i(com.mbridge.msdk.foundation.controller.c.m().c()).a();
        } catch (Throwable th) {
            ad.b(f19260a, th.getMessage());
        }
    }
}
