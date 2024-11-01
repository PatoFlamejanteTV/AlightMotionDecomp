package com.mbridge.msdk.foundation.same.net.h;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.k;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.net.Aa;
import com.mbridge.msdk.foundation.same.net.l;
import com.mbridge.msdk.foundation.same.net.n;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.out.CustomInfoManager;
import java.io.File;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes4.dex */
public class c {
    private static final String TAG = "c";
    protected Context mContext;

    public c(Context context) {
        if (context == null) {
            this.mContext = com.mbridge.msdk.foundation.controller.c.m().c();
        } else {
            this.mContext = context.getApplicationContext();
        }
    }

    private String asUrlParams(Map<String, String> map) {
        if (map != null && map.size() != 0) {
            StringBuilder sb = new StringBuilder();
            try {
                for (String str : map.keySet()) {
                    if (!TextUtils.isEmpty(str)) {
                        String str2 = map.get(str);
                        if (TextUtils.isEmpty(str2)) {
                            str2 = "";
                        }
                        sb.append("&");
                        sb.append(str);
                        sb.append("=");
                        sb.append(str2);
                    }
                }
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.b(TAG, e8.getMessage());
                }
                sb = null;
            }
            if (sb != null && sb.length() > 0) {
                return sb.toString();
            }
        }
        return null;
    }

    public static void downloadFile(File file, String str, com.mbridge.msdk.foundation.same.net.e eVar) {
        ad.c(TAG, "downloadFile url = " + str);
        n.a().a(file, str, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b3 A[Catch: Exception -> 0x00df, TRY_ENTER, TryCatch #0 {Exception -> 0x00df, blocks: (B:26:0x00b3, B:28:0x00b9, B:53:0x00c4, B:60:0x00e9, B:64:0x0106), top: B:24:0x00b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void post(int r15, java.lang.String r16, com.mbridge.msdk.foundation.same.net.h.e r17, com.mbridge.msdk.foundation.same.net.l r18, com.mbridge.msdk.foundation.same.net.e r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.net.h.c.post(int, java.lang.String, com.mbridge.msdk.foundation.same.net.h.e, com.mbridge.msdk.foundation.same.net.l, com.mbridge.msdk.foundation.same.net.e, boolean, boolean):void");
    }

    public void addExtraParams(String str, e eVar) {
        if (eVar != null) {
            String a9 = Aa.a();
            if (a9 == null) {
                a9 = "";
            }
            eVar.a("channel", a9);
            eVar.a("band_width", com.mbridge.msdk.foundation.same.net.a.a().d() + "");
            eVar.a("open", com.mbridge.msdk.foundation.same.a.f20646R);
            if (com.mbridge.msdk.f.b.a() && !TextUtils.isEmpty(str) && str.contains("setting")) {
                String b9 = Aa.b();
                if (!TextUtils.isEmpty(b9)) {
                    eVar.a("keyword", b9);
                }
            }
            String str2 = eVar.a().get(MBridgeConstans.PROPERTIES_UNIT_ID);
            if (str2 != null) {
                String customInfoByUnitId = CustomInfoManager.getInstance().getCustomInfoByUnitId(str2, str);
                if (!TextUtils.isEmpty(customInfoByUnitId)) {
                    eVar.a("ch_info", customInfoByUnitId);
                }
                k d8 = com.mbridge.msdk.c.h.a().d(com.mbridge.msdk.foundation.controller.c.m().k(), str2);
                if (d8 != null && !TextUtils.isEmpty(d8.a())) {
                    eVar.a("u_stid", d8.a());
                }
            }
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.a()) {
                eVar.a("dev_source", "2");
            }
            if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
                eVar.a("re_domain", "1");
                return;
            }
            return;
        }
        ad.b(TAG, "addExtraParams error, params is null,frame work error");
    }

    public void choiceV3OrV5BySetting(int i8, e eVar, com.mbridge.msdk.foundation.same.net.e eVar2, String str) {
        choiceV3OrV5BySetting(i8, eVar, eVar2, str, new com.mbridge.msdk.foundation.same.net.b());
    }

    public void get(int i8, String str, e eVar, com.mbridge.msdk.foundation.same.net.e eVar2) {
        get(i8, str, eVar, new com.mbridge.msdk.foundation.same.net.b(), eVar2, false, false);
    }

    public void getCampaign(int i8, String str, e eVar, l lVar, com.mbridge.msdk.foundation.same.net.e eVar2) {
        int F8;
        e eVar3;
        try {
            com.mbridge.msdk.c.g a9 = com.mbridge.msdk.c.h.a().a(com.mbridge.msdk.foundation.controller.c.m().k());
            if (TextUtils.isEmpty(str)) {
                F8 = a9.ar();
            } else {
                F8 = a9.F();
            }
            String a10 = com.mbridge.msdk.foundation.same.net.g.d.f().a(str, F8);
            if (lVar == null) {
                lVar = new com.mbridge.msdk.foundation.same.net.b();
            }
            if (F8 < 2) {
                postV5(i8, a10, eVar, eVar2, lVar, true);
                return;
            }
            if (F8 % 2 == 0) {
                if (eVar == null) {
                    eVar = new e();
                }
                eVar3 = eVar;
                JSONArray b9 = com.mbridge.msdk.foundation.db.a.a.a().b();
                if (b9 != null) {
                    String jSONArray = b9.toString();
                    int d8 = com.mbridge.msdk.foundation.same.net.g.d.f().d();
                    if (d8 > 0 && jSONArray.length() > d8) {
                        post(i8, a10, eVar3, lVar, eVar2, true, false);
                        return;
                    }
                    eVar3.a(e.f20972h, jSONArray);
                }
            } else {
                eVar3 = eVar;
            }
            get(i8, a10, eVar3, lVar, eVar2, true, true);
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.b(TAG, e8.getMessage());
            }
        }
    }

    public void getLoadOrSetting(int i8, String str, e eVar, com.mbridge.msdk.foundation.same.net.e eVar2) {
        getLoadOrSetting(i8, str, eVar, new com.mbridge.msdk.foundation.same.net.b(), eVar2, true);
    }

    public void postFocusReport(int i8, String str, e eVar, com.mbridge.msdk.foundation.same.net.e eVar2) {
        post(i8, str, eVar, new com.mbridge.msdk.foundation.same.net.b(), eVar2, false, true);
    }

    public void postV5(int i8, String str, e eVar, com.mbridge.msdk.foundation.same.net.e eVar2) {
        String str2 = eVar.a().get("sign");
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        eVar.a(CampaignEx.JSON_KEY_ST_TS, currentTimeMillis + "");
        eVar.a("st", SameMD5.getMD5(currentTimeMillis + str2));
        post(i8, str, eVar, new com.mbridge.msdk.foundation.same.net.b(), eVar2, false, false);
    }

    public void choiceV3OrV5BySetting(int i8, e eVar, com.mbridge.msdk.foundation.same.net.e eVar2, String str, l lVar) {
        int F8;
        com.mbridge.msdk.c.g a9 = com.mbridge.msdk.c.h.a().a(com.mbridge.msdk.foundation.controller.c.m().k());
        if (TextUtils.isEmpty(str)) {
            F8 = a9.ar();
        } else {
            F8 = a9.F();
        }
        String a10 = com.mbridge.msdk.foundation.same.net.g.d.f().a(str, F8);
        if (F8 < 2) {
            if (lVar == null) {
                postV5(i8, a10, eVar, eVar2);
                return;
            } else {
                postV5(i8, a10, eVar, eVar2, lVar, false);
                return;
            }
        }
        if (F8 % 2 == 0) {
            if (eVar == null) {
                eVar = new e();
            }
            JSONArray b9 = com.mbridge.msdk.foundation.db.a.a.a().b();
            if (b9 != null) {
                String jSONArray = b9.toString();
                int d8 = com.mbridge.msdk.foundation.same.net.g.d.f().d();
                if (d8 > 0 && jSONArray.length() > d8) {
                    post(i8, a10, eVar, eVar2);
                    return;
                }
                eVar.a(e.f20972h, jSONArray);
            }
        }
        e eVar3 = eVar;
        if (lVar == null) {
            getLoadOrSetting(i8, a10, eVar3, eVar2);
        } else {
            getLoadOrSetting(i8, a10, eVar3, lVar, eVar2, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0168 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void get(int r14, java.lang.String r15, com.mbridge.msdk.foundation.same.net.h.e r16, com.mbridge.msdk.foundation.same.net.l r17, com.mbridge.msdk.foundation.same.net.e r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.net.h.c.get(int, java.lang.String, com.mbridge.msdk.foundation.same.net.h.e, com.mbridge.msdk.foundation.same.net.l, com.mbridge.msdk.foundation.same.net.e, boolean, boolean):void");
    }

    public void getLoadOrSetting(int i8, String str, e eVar, l lVar, com.mbridge.msdk.foundation.same.net.e eVar2, boolean z8) {
        get(i8, str, eVar, lVar, eVar2, z8, false);
    }

    public void postV5(int i8, String str, e eVar, com.mbridge.msdk.foundation.same.net.e eVar2, l lVar, boolean z8) {
        String str2 = eVar.a().get("sign");
        if (str2 == null) {
            str2 = "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        eVar.a(CampaignEx.JSON_KEY_ST_TS, currentTimeMillis + "");
        eVar.a("st", SameMD5.getMD5(currentTimeMillis + str2));
        if (lVar != null) {
            post(i8, str, eVar, lVar, eVar2, z8, false);
        } else {
            post(i8, str, eVar, new com.mbridge.msdk.foundation.same.net.b(), eVar2, z8, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void get(int r3, java.lang.String r4, java.util.Map<java.lang.String, java.lang.String> r5, com.mbridge.msdk.foundation.same.net.l r6, com.mbridge.msdk.foundation.same.net.e r7) {
        /*
            r2 = this;
            if (r5 != 0) goto L7
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
        L7:
            com.mbridge.msdk.foundation.controller.c r0 = com.mbridge.msdk.foundation.controller.c.m()
            java.lang.String r0 = r0.k()
            java.lang.String r1 = "app_id"
            r5.put(r1, r0)
            java.lang.String r0 = "sdk_version"
            java.lang.String r1 = "MAL_16.7.31"
            r5.put(r0, r1)
            java.lang.String r0 = "platform"
            java.lang.String r1 = "1"
            r5.put(r0, r1)
            java.lang.String r5 = r2.asUrlParams(r5)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L40
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = "?"
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = r0.toString()
        L40:
            boolean r5 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r5 == 0) goto L5a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "get wx scheme url = "
            r5.append(r0)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = "AppletsModel"
            com.mbridge.msdk.foundation.tools.ad.a(r0, r5)
        L5a:
            r5 = 0
            r0 = 0
            if (r3 == 0) goto L74
            r1 = 1
            if (r3 == r1) goto L6e
            r1 = 2
            if (r3 == r1) goto L65
            goto L7a
        L65:
            com.mbridge.msdk.foundation.same.net.e.c r3 = new com.mbridge.msdk.foundation.same.net.e.c     // Catch: java.lang.Exception -> L6c
            r3.<init>(r5, r4, r0, r7)     // Catch: java.lang.Exception -> L6c
        L6a:
            r0 = r3
            goto L7a
        L6c:
            goto L7a
        L6e:
            com.mbridge.msdk.foundation.same.net.e.d r3 = new com.mbridge.msdk.foundation.same.net.e.d     // Catch: java.lang.Exception -> L6c
            r3.<init>(r5, r4, r0, r7)     // Catch: java.lang.Exception -> L6c
            goto L6a
        L74:
            com.mbridge.msdk.foundation.same.net.e.f r3 = new com.mbridge.msdk.foundation.same.net.e.f     // Catch: java.lang.Exception -> L6c
            r3.<init>(r5, r4, r0, r7)     // Catch: java.lang.Exception -> L6c
            goto L6a
        L7a:
            if (r0 == 0) goto L89
            r0.a(r6)     // Catch: java.lang.Exception -> L89
            int r3 = r0.b()     // Catch: java.lang.Exception -> L89
            r0.a(r3)     // Catch: java.lang.Exception -> L89
            com.mbridge.msdk.foundation.same.net.n.a(r0)     // Catch: java.lang.Exception -> L89
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.net.h.c.get(int, java.lang.String, java.util.Map, com.mbridge.msdk.foundation.same.net.l, com.mbridge.msdk.foundation.same.net.e):void");
    }

    public void post(int i8, String str, e eVar, com.mbridge.msdk.foundation.same.net.e eVar2) {
        post(i8, str, eVar, new com.mbridge.msdk.foundation.same.net.b(), eVar2, false, false);
    }
}
