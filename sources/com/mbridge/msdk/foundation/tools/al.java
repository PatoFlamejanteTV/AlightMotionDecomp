package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.content.SharedPreferences;
import com.mbridge.msdk.foundation.tools.FastKV;

/* loaded from: classes4.dex */
public final class al {

    /* renamed from: a, reason: collision with root package name */
    static FastKV f21265a;

    public static Object a(Context context, String str, Object obj) {
        String str2;
        if (context == null) {
            return obj;
        }
        if (obj != null) {
            str2 = obj.getClass().getSimpleName();
        } else {
            str2 = "";
        }
        com.mbridge.msdk.foundation.controller.d.a();
        if (f21265a == null) {
            try {
                f21265a = new FastKV.Builder(com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_CONFIG), "share_date").build();
            } catch (Exception unused) {
                f21265a = null;
            }
        }
        if (f21265a != null) {
            try {
                if ("String".equals(str2)) {
                    return f21265a.getString(str, (String) obj);
                }
                if ("Integer".equals(str2)) {
                    return Integer.valueOf(f21265a.getInt(str, ((Integer) obj).intValue()));
                }
                if ("Boolean".equals(str2)) {
                    return Boolean.valueOf(f21265a.getBoolean(str, ((Boolean) obj).booleanValue()));
                }
                if ("Float".equals(str2)) {
                    return Float.valueOf(f21265a.getFloat(str, ((Float) obj).floatValue()));
                }
                if ("Long".equals(str2)) {
                    return Long.valueOf(f21265a.getLong(str, ((Long) obj).longValue()));
                }
            } catch (Exception unused2) {
                return obj;
            }
        } else {
            SharedPreferences sharedPreferences = context.getSharedPreferences("share_date", 0);
            if ("String".equals(str2)) {
                return sharedPreferences.getString(str, (String) obj);
            }
            if ("Integer".equals(str2)) {
                return Integer.valueOf(sharedPreferences.getInt(str, ((Integer) obj).intValue()));
            }
            if ("Boolean".equals(str2)) {
                return Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue()));
            }
            if ("Float".equals(str2)) {
                return Float.valueOf(sharedPreferences.getFloat(str, ((Float) obj).floatValue()));
            }
            if ("Long".equals(str2)) {
                return Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue()));
            }
        }
        return obj;
    }

    public static void b(Context context, String str, Object obj) {
        String simpleName = obj.getClass().getSimpleName();
        if (context == null) {
            return;
        }
        com.mbridge.msdk.foundation.controller.d.a();
        if (f21265a == null) {
            try {
                f21265a = new FastKV.Builder(com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_CONFIG), "share_date").build();
            } catch (Exception unused) {
                f21265a = null;
            }
        }
        if (f21265a != null) {
            try {
                if ("String".equals(simpleName)) {
                    f21265a.putString(str, (String) obj);
                } else if ("Integer".equals(simpleName)) {
                    f21265a.putInt(str, ((Integer) obj).intValue());
                } else if ("Boolean".equals(simpleName)) {
                    f21265a.putBoolean(str, ((Boolean) obj).booleanValue());
                } else if ("Float".equals(simpleName)) {
                    f21265a.putFloat(str, ((Float) obj).floatValue());
                } else if ("Long".equals(simpleName)) {
                    f21265a.putLong(str, ((Long) obj).longValue());
                }
                return;
            } catch (Exception unused2) {
                return;
            }
        }
        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences("share_date", 0).edit();
        if ("String".equals(simpleName)) {
            edit.putString(str, (String) obj);
        } else if ("Integer".equals(simpleName)) {
            edit.putInt(str, ((Integer) obj).intValue());
        } else if ("Boolean".equals(simpleName)) {
            edit.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if ("Float".equals(simpleName)) {
            edit.putFloat(str, ((Float) obj).floatValue());
        } else if ("Long".equals(simpleName)) {
            edit.putLong(str, ((Long) obj).longValue());
        }
        edit.apply();
    }
}
