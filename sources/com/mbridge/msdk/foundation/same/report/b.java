package com.mbridge.msdk.foundation.same.report;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.ad;
import org.json.JSONArray;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static String f21047a = "DomainReport";

    public static boolean a(com.mbridge.msdk.c.g gVar, String str) {
        if (gVar == null) {
            return true;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            int O8 = gVar.O();
            JSONArray M8 = gVar.M();
            JSONArray L8 = gVar.L();
            if (L8 != null) {
                for (int i8 = 0; i8 < L8.length(); i8++) {
                    if (str.contains(L8.getString(i8))) {
                        return false;
                    }
                }
            }
            if (O8 != 2) {
                return true;
            }
            if (M8 != null) {
                for (int i9 = 0; i9 < M8.length(); i9++) {
                    if (str.contains(M8.getString(i9))) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e8) {
            ad.b(f21047a, e8.getMessage());
            return true;
        }
    }
}
