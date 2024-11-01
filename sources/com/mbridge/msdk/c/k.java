package com.mbridge.msdk.c;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.ArrayList;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class k extends c {
    public static k c(String str) {
        k kVar = new k();
        try {
            kVar.b(str);
            kVar.p(1);
            kVar.n(1);
            kVar.o(5);
            kVar.c(1);
            kVar.d(1);
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.b("UnitSetting", e8.getMessage());
            }
        }
        return kVar;
    }

    public static k d(String str) {
        k kVar = new k();
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(8);
        arrayList2.add(8);
        kVar.p(1);
        kVar.b(str);
        kVar.a(arrayList);
        kVar.b(arrayList2);
        kVar.n(1);
        kVar.c(-2);
        kVar.d(-2);
        kVar.o(5);
        kVar.a(3600L);
        kVar.h(2);
        kVar.a(1);
        kVar.l(100);
        kVar.e(0);
        kVar.f(1);
        kVar.i(0);
        kVar.m(60);
        kVar.j(10);
        kVar.k(60);
        return kVar;
    }

    public static k e(String str) {
        k kVar = new k();
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(1);
            kVar.a(arrayList);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(30);
            kVar.b(arrayList2);
            kVar.b(str);
            kVar.p(1);
            kVar.n(1);
            kVar.c(-2);
            kVar.d(-2);
            kVar.o(5);
            kVar.a(3600L);
            kVar.h(2);
            kVar.a(3);
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.b("UnitSetting", e8.getMessage());
            }
        }
        return kVar;
    }

    public static k f(String str) {
        k y8 = y();
        y8.a(0);
        return y8;
    }

    public static k g(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return c.a(new JSONObject(str));
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.a("UnitSetting", "parseSetting", e8);
            }
            return null;
        }
    }

    public static k y() {
        return new k();
    }
}
