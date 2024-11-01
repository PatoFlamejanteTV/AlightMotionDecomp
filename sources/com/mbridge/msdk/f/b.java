package com.mbridge.msdk.f;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.out.MBConfiguration;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile Boolean f20230a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile Boolean f20231b;

    public static boolean a() {
        boolean z8;
        if (f20230a == null) {
            try {
                if (Integer.parseInt(String.valueOf(MBConfiguration.SDK_VERSION.charAt(10))) == 2) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                f20230a = Boolean.valueOf(z8);
                return z8;
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("CommonUtils", "isChina", e8);
                }
            }
        }
        if (f20230a == null || !f20230a.booleanValue()) {
            return false;
        }
        return true;
    }

    public static boolean b() {
        boolean z8;
        if (f20231b == null) {
            try {
                if (Integer.parseInt(String.valueOf(MBConfiguration.SDK_VERSION.charAt(10))) == 1) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                f20231b = Boolean.valueOf(z8);
                return z8;
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("CommonUtils", "isOversea", e8);
                }
            }
        }
        if (f20231b == null || !f20231b.booleanValue()) {
            return false;
        }
        return true;
    }
}
