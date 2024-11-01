package com.mbridge.msdk.foundation.same.net.g;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.net.h.e;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.an;
import com.mbridge.msdk.foundation.tools.ao;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f20898a = "b";

    public static String a(List<com.mbridge.msdk.foundation.same.net.d.b> list) {
        com.mbridge.msdk.foundation.same.net.d.b b9 = b(list, "Content-Type");
        if (b9 != null) {
            String b10 = b9.b();
            if (!TextUtils.isEmpty(b10)) {
                String[] split = b10.split(";");
                for (int i8 = 1; i8 < split.length; i8++) {
                    String[] split2 = split[i8].trim().split("=");
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        return split2[1];
                    }
                }
            }
        }
        return C.UTF8_NAME;
    }

    private static com.mbridge.msdk.foundation.same.net.d.b b(List<com.mbridge.msdk.foundation.same.net.d.b> list, String str) {
        if (list != null) {
            for (int i8 = 0; i8 < list.size(); i8++) {
                com.mbridge.msdk.foundation.same.net.d.b bVar = list.get(i8);
                if (bVar != null && str.equals(bVar.a())) {
                    return bVar;
                }
            }
        }
        return null;
    }

    public static boolean b(List<com.mbridge.msdk.foundation.same.net.d.b> list) {
        return TextUtils.equals(a(list, "Content-Encoding"), "gzip");
    }

    public static String a(List<com.mbridge.msdk.foundation.same.net.d.b> list, String str) {
        com.mbridge.msdk.foundation.same.net.d.b b9 = b(list, str);
        if (b9 != null) {
            return b9.b();
        }
        return "";
    }

    public static void a(e eVar, String str, String str2) {
        if (eVar != null) {
            try {
                if (!an.a(str) && !an.a(str2)) {
                    eVar.a(str, str2);
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    public static void a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (str.startsWith("http")) {
                str = ao.a(str);
            }
            if (!TextUtils.isEmpty(str) && com.mbridge.msdk.f.c.c()) {
                com.mbridge.msdk.foundation.same.net.a.a.a().a(str);
            }
        } catch (Throwable th) {
            ad.b(f20898a, th.getMessage());
        }
    }
}
