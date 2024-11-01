package com.mbridge.msdk.foundation.same.report.d;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.i;
import com.mbridge.msdk.c.k;
import com.mbridge.msdk.e.m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class e {
    private Map<String, String> c(String str, b bVar) {
        d dVar = new d();
        try {
            if (str.equals("2000125")) {
                dVar.a(TypedValues.TransitionType.S_DURATION, Long.valueOf(bVar.l("2000123")));
            } else if (str.equals("2000126")) {
                dVar.a(TypedValues.TransitionType.S_DURATION, Long.valueOf(bVar.l("2000125")));
            } else if (str.equals("2000127")) {
                dVar.a(TypedValues.TransitionType.S_DURATION, Long.valueOf(bVar.l("2000123")));
            } else if (str.equals("2000154")) {
                dVar.a(TypedValues.TransitionType.S_DURATION, Long.valueOf(bVar.l("2000126")));
            } else if (str.equals("2000047")) {
                dVar.a(TypedValues.TransitionType.S_DURATION, Long.valueOf(bVar.l("2000123")));
            } else if (str.equals("2000048")) {
                dVar.a(TypedValues.TransitionType.S_DURATION, Long.valueOf(bVar.l("2000123")));
            } else if (str.equals("2000155")) {
                dVar.a(TypedValues.TransitionType.S_DURATION, Long.valueOf(bVar.l("2000154")));
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
        return dVar.a();
    }

    private Map<String, String> d(String str, b bVar) {
        HashMap hashMap = new HashMap();
        try {
            if (Arrays.asList(a.f21075e).contains(str)) {
                String str2 = "";
                if (bVar != null) {
                    str2 = bVar.d();
                }
                hashMap.put("auto_load", str2);
            }
            if (bVar != null) {
                Map<String, Map<String, String>> p8 = bVar.p();
                String str3 = bVar.f() + str;
                if (p8.containsKey(str3) && p8.get(str3) != null) {
                    hashMap.putAll(p8.get(str3));
                }
                try {
                    Map<String, Map<String, String>> q8 = bVar.q();
                    String str4 = bVar.f() + "_" + bVar.b() + "_" + str;
                    if (q8.containsKey(str4) && q8.get(str4) != null) {
                        hashMap.putAll(q8.get(str4));
                    }
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }
        } catch (Exception e9) {
            if (MBridgeConstans.DEBUG) {
                e9.printStackTrace();
            }
        }
        return hashMap;
    }

    public final void a(String str, m mVar, b bVar, com.mbridge.msdk.foundation.same.report.d.a.a aVar) {
        Map<String, String> c8;
        HashMap hashMap = new HashMap();
        if (bVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            bVar.a(str);
            if (str.equals("2000146")) {
                bVar.j();
            }
            Map<String, String> b9 = b(str, bVar);
            if (b9 != null) {
                hashMap.putAll(b9);
            }
            Map<String, String> a9 = a(str, bVar.i(), mVar);
            if (a9 != null) {
                hashMap.putAll(a9);
            }
            if (Arrays.asList(a.f21074d).contains(str) && (c8 = c(str, bVar)) != null) {
                hashMap.putAll(c8);
            }
            Map<String, String> d8 = d(str, bVar);
            if (d8 != null) {
                hashMap.putAll(d8);
            }
            if (!hashMap.containsKey("lrid") || TextUtils.isEmpty(hashMap.get("lrid"))) {
                hashMap.put("lrid", bVar.f());
            }
            Map<String, String> a10 = a(str, bVar);
            if (a10 != null) {
                hashMap.putAll(a10);
            }
            if (bVar.d() != null && bVar.d().equals("1") && Arrays.asList(a.f21072b).contains(str)) {
                return;
            }
            if (MBridgeConstans.DEBUG) {
                ad.b("MetricsRefactor", "reportkey: " + str + " 详细数据 " + hashMap.toString());
            }
            com.mbridge.msdk.e.e a11 = a(str, hashMap);
            if (mVar != null && a11 != null) {
                mVar.a(a11);
            }
            if (aVar != null) {
                aVar.a();
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }

    public final void b(String str, m mVar, b bVar, com.mbridge.msdk.foundation.same.report.d.a.a aVar) {
        if (bVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            bVar.a(str);
            Map<String, String> a9 = a(str, bVar.i(), mVar);
            if (a9 != null) {
                hashMap.putAll(a9);
            }
            Map<String, String> d8 = d(str, bVar);
            if (d8 != null) {
                hashMap.putAll(d8);
            }
            Map<String, String> a10 = a(str, bVar);
            if (a10 != null) {
                hashMap.putAll(a10);
            }
            if (MBridgeConstans.DEBUG) {
                ad.b("MetricsRefactor", "reportkey: " + str + " 详细数据 " + hashMap.toString());
            }
            com.mbridge.msdk.e.e a11 = a(str, hashMap);
            if (mVar != null && a11 != null) {
                mVar.a(a11);
            }
            if (aVar != null) {
                aVar.a();
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:            if (r24.g().getAdType() == 295) goto L19;     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f4 A[Catch: Exception -> 0x00a3, TryCatch #2 {Exception -> 0x00a3, blocks: (B:21:0x00a6, B:23:0x00ac, B:25:0x00b7, B:27:0x00bd, B:29:0x00e2, B:32:0x00ea, B:33:0x00ee, B:35:0x00f4, B:38:0x00fd, B:40:0x0107, B:42:0x011a, B:43:0x0123, B:44:0x0136, B:46:0x0145, B:47:0x0152, B:50:0x015a, B:52:0x0160, B:54:0x0166, B:55:0x0196, B:57:0x01a0, B:59:0x01a6, B:60:0x01c4, B:61:0x01cf, B:63:0x01d7, B:65:0x01dd, B:66:0x01fb, B:67:0x0206, B:69:0x020e, B:71:0x0214, B:72:0x0232, B:73:0x023d, B:75:0x0245, B:77:0x024b, B:78:0x0269, B:79:0x0274, B:82:0x0297, B:84:0x02a1, B:85:0x02a6, B:87:0x02ac, B:88:0x02ca, B:91:0x02da, B:92:0x0364, B:94:0x036e, B:96:0x037d, B:97:0x039d, B:98:0x03a6, B:101:0x03af, B:103:0x03b5, B:104:0x03f0, B:107:0x03fb, B:109:0x0411, B:110:0x0436, B:112:0x043c, B:113:0x0461, B:115:0x0465, B:117:0x0475, B:118:0x047a, B:120:0x0484, B:121:0x048d, B:123:0x0493, B:124:0x04a0, B:126:0x04be, B:128:0x04c5, B:129:0x04d2, B:131:0x04dc, B:132:0x04e5, B:134:0x04ed, B:136:0x04f4, B:137:0x0501, B:139:0x050b, B:140:0x0514, B:141:0x0521, B:143:0x0529, B:150:0x0535, B:153:0x0543, B:155:0x0565, B:158:0x056e, B:160:0x0575, B:162:0x057d, B:165:0x0586, B:167:0x058d, B:169:0x0599, B:174:0x0622, B:175:0x05a9, B:177:0x05b5, B:179:0x05bf, B:181:0x05d6, B:182:0x05e6, B:185:0x05ed, B:186:0x05df, B:187:0x05c8, B:189:0x05ce, B:191:0x05f5, B:193:0x0603, B:194:0x0614, B:197:0x061b, B:198:0x060c, B:199:0x045a, B:200:0x042f, B:202:0x03cc, B:203:0x03d0, B:205:0x03d6, B:206:0x03ed, B:207:0x02f2, B:209:0x030b, B:210:0x030f, B:211:0x02c5, B:212:0x0313, B:214:0x031f, B:215:0x0324, B:217:0x032a, B:218:0x0344, B:220:0x034a, B:221:0x0361, B:222:0x0341, B:223:0x0186, B:225:0x012d, B:232:0x0658, B:234:0x00c1, B:236:0x00c7, B:237:0x00cf, B:238:0x00d3, B:240:0x00d9, B:241:0x00b1, B:259:0x009e), top: B:13:0x0043 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.Map<java.lang.String, java.lang.String> b(java.lang.String r23, com.mbridge.msdk.foundation.same.report.d.b r24) {
        /*
            Method dump skipped, instructions count: 1641
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.report.d.e.b(java.lang.String, com.mbridge.msdk.foundation.same.report.d.b):java.util.Map");
    }

    private Map<String, String> a(String str, b bVar) {
        return (bVar == null || TextUtils.isEmpty(str)) ? new HashMap() : bVar.j(str);
    }

    private com.mbridge.msdk.e.e a(String str, Map<String, String> map) {
        if (map == null || TextUtils.isEmpty(str)) {
            return null;
        }
        com.mbridge.msdk.e.e eVar = new com.mbridge.msdk.e.e(str);
        try {
            JSONObject jSONObject = new JSONObject(map);
            Boolean b9 = com.mbridge.msdk.foundation.same.b.a().b();
            if (b9 != null) {
                jSONObject.put("r_v_r", b9.booleanValue() ? 1 : 0);
            }
            Boolean c8 = com.mbridge.msdk.foundation.same.b.a().c();
            if (c8 != null) {
                jSONObject.put("n_i_v_r", c8.booleanValue() ? 1 : 0);
            }
            eVar.a(jSONObject);
            eVar.a(0);
            eVar.b(0);
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
        return eVar;
    }

    private Map<String, String> a(String str, String str2, m mVar) {
        d dVar = new d();
        try {
            g b9 = h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
            if (b9 == null) {
                h.a();
                b9 = i.a();
            }
            if (!TextUtils.isEmpty(b9.am())) {
                dVar.a("as_rid", b9.am());
            }
            String N8 = b9.N();
            JSONArray M8 = b9.M();
            if (M8 != null) {
                int i8 = 0;
                while (true) {
                    if (i8 >= M8.length()) {
                        break;
                    }
                    if (str.equals(M8.getString(i8))) {
                        N8 = "1.0";
                        break;
                    }
                    i8++;
                }
            }
            if (!TextUtils.isEmpty(N8)) {
                dVar.a("log_rate", N8);
            } else {
                dVar.a("log_rate", -1);
            }
            if (!TextUtils.isEmpty(str2)) {
                k c8 = h.a().c(com.mbridge.msdk.foundation.controller.c.m().k(), str2);
                if (c8 != null && !TextUtils.isEmpty(c8.s())) {
                    dVar.a("us_rid", c8.s());
                }
                if (c8 != null && !TextUtils.isEmpty(c8.a())) {
                    dVar.a("u_stid", c8.a());
                }
                d a9 = c.a().a(str2);
                if (a9 != null) {
                    if (mVar != null && mVar.f() != null) {
                        try {
                            mVar.f().put("r_stid", a9.b("r_stid"));
                            a9.c("r_stid");
                        } catch (JSONException unused) {
                        }
                    }
                    dVar.a(a9);
                }
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
        return dVar.a();
    }

    private List<CampaignEx> a(b bVar, String str) {
        ArrayList arrayList = new ArrayList();
        if (bVar != null) {
            try {
                String str2 = bVar.f() + str;
                Map<String, Map<String, String>> p8 = bVar.p();
                int i8 = -1;
                if (p8 != null && p8.containsKey(str2)) {
                    try {
                        Object obj = p8.get(str2).get("resource_type");
                        if (obj instanceof String) {
                            i8 = Integer.parseInt((String) obj);
                        } else if (obj instanceof Integer) {
                            i8 = ((Integer) obj).intValue();
                        }
                    } catch (NumberFormatException e8) {
                        if (MBridgeConstans.DEBUG) {
                            e8.printStackTrace();
                        }
                    }
                }
                if (i8 == 1) {
                    List<CampaignEx> h8 = bVar.h() != null ? bVar.h() : bVar.e();
                    if (h8 != null && h8.size() > 0) {
                        arrayList.addAll(h8);
                    }
                } else if (bVar.g() != null) {
                    arrayList.add(bVar.g());
                } else {
                    List<CampaignEx> h9 = bVar.h() != null ? bVar.h() : bVar.e();
                    if (h9 != null && h9.size() > 0) {
                        arrayList.addAll(h9);
                    }
                }
            } catch (Exception e9) {
                if (MBridgeConstans.DEBUG) {
                    e9.printStackTrace();
                }
            }
        }
        return arrayList;
    }
}
