package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.mbridge.msdk.MBridgeConstans;
import l0.q;
import x0.AbstractC4192o;
import x0.r;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final r f18403a = r.y("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC4192o f18404b = AbstractC4192o.y("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC4192o f18405c = AbstractC4192o.v("auto", MBridgeConstans.DYNAMIC_VIEW_WX_APP, "am");

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC4192o f18406d = AbstractC4192o.u("_r", "_dbg");

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC4192o f18407e = new AbstractC4192o.a().e(l0.r.f34626a).e(l0.r.f34627b).f();

    /* renamed from: f, reason: collision with root package name */
    private static final AbstractC4192o f18408f = AbstractC4192o.u("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static String a(String str) {
        String a9 = q.a(str);
        if (a9 != null) {
            return a9;
        }
        return str;
    }

    public static void b(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
    }

    public static boolean c(String str, Bundle bundle) {
        if (f18404b.contains(str)) {
            return false;
        }
        if (bundle != null) {
            AbstractC4192o abstractC4192o = f18406d;
            int size = abstractC4192o.size();
            int i8 = 0;
            while (i8 < size) {
                Object obj = abstractC4192o.get(i8);
                i8++;
                if (bundle.containsKey((String) obj)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public static boolean d(String str, String str2) {
        if (!"_ce1".equals(str2) && !"_ce2".equals(str2)) {
            if ("_ln".equals(str2)) {
                if (str.equals("fcm") || str.equals("fiam")) {
                    return true;
                }
                return false;
            }
            if (f18407e.contains(str2)) {
                return false;
            }
            AbstractC4192o abstractC4192o = f18408f;
            int size = abstractC4192o.size();
            int i8 = 0;
            while (i8 < size) {
                Object obj = abstractC4192o.get(i8);
                i8++;
                if (str2.matches((String) obj)) {
                    return false;
                }
            }
            return true;
        }
        if (str.equals("fcm") || str.equals("frc")) {
            return true;
        }
        return false;
    }

    public static boolean e(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!g(str) || bundle == null) {
            return false;
        }
        AbstractC4192o abstractC4192o = f18406d;
        int size = abstractC4192o.size();
        int i8 = 0;
        while (i8 < size) {
            Object obj = abstractC4192o.get(i8);
            i8++;
            if (bundle.containsKey((String) obj)) {
                return false;
            }
        }
        str.hashCode();
        char c8 = 65535;
        switch (str.hashCode()) {
            case 101200:
                if (str.equals("fcm")) {
                    c8 = 0;
                    break;
                }
                break;
            case 101230:
                if (str.equals("fdl")) {
                    c8 = 1;
                    break;
                }
                break;
            case 3142703:
                if (str.equals("fiam")) {
                    c8 = 2;
                    break;
                }
                break;
        }
        switch (c8) {
            case 0:
                bundle.putString("_cis", "fcm_integration");
                return true;
            case 1:
                bundle.putString("_cis", "fdl_integration");
                return true;
            case 2:
                bundle.putString("_cis", "fiam_integration");
                return true;
            default:
                return false;
        }
    }

    public static boolean f(String str) {
        if (!f18403a.contains(str)) {
            return true;
        }
        return false;
    }

    public static boolean g(String str) {
        if (!f18405c.contains(str)) {
            return true;
        }
        return false;
    }
}
