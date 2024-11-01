package com.mbridge.msdk.foundation.same.report.b;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.e.e;
import com.mbridge.msdk.foundation.same.report.g;
import com.mbridge.msdk.foundation.same.report.i;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static long f21057a;

    /* renamed from: b, reason: collision with root package name */
    private static long f21058b;

    /* loaded from: classes4.dex */
    private static final class a implements com.mbridge.msdk.foundation.same.report.b.a {
        @Override // com.mbridge.msdk.foundation.same.report.b.a
        public final void a() {
        }

        @Override // com.mbridge.msdk.foundation.same.report.b.a
        public final void a(final String str, final StackTraceElement[] stackTraceElementArr) {
            if (MBridgeConstans.DEBUG) {
                ad.a("AnrMonitorManager", "onAnrHappened: " + str);
            }
            if (c.d(str)) {
                long unused = c.f21058b = System.currentTimeMillis();
                com.mbridge.msdk.foundation.same.f.b.g().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.report.b.c.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str2 = str;
                        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
                        try {
                            if (af.a().a("metrics", "e_t_l", af.a().a("e_t_l", 1)) == 1) {
                                c.a(str2, stackTraceElementArr2);
                            } else {
                                new i(com.mbridge.msdk.foundation.controller.c.m().c()).a("key=m_anr_report&exception=" + c.c(str2) + "&crash_first_index_from_mtg=" + c.b(stackTraceElementArr2), (File) null);
                            }
                        } catch (Exception e8) {
                            ad.a("AnrMonitorManager", "handler anr failed", e8);
                        }
                    }
                });
                return;
            }
            ad.a("AnrMonitorManager", "onAnrHappened: can track false");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject c(String str) throws JSONException {
        JSONObject b9 = d.a(com.mbridge.msdk.foundation.controller.c.m().c()).b(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis())));
        b9.put("crashinfo", str);
        return b9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            for (String str2 : d.a(d.a())) {
                if (!TextUtils.isEmpty(str2) && str.contains(str2)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static String b(StackTraceElement[] stackTraceElementArr) {
        return c(stackTraceElementArr) ? "1" : MBridgeConstans.ENDCARD_URL_TYPE_PL;
    }

    public static String a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr != null && stackTraceElementArr.length != 0) {
            try {
                StringBuilder sb = new StringBuilder();
                for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                    if (stackTraceElement != null) {
                        sb.append(stackTraceElement.toString());
                        sb.append("\r\n");
                    }
                }
                return sb.toString();
            } catch (Exception unused) {
            }
        }
        return "";
    }

    private static boolean b() {
        try {
            return af.a().a("anr_monitor_available", false);
        } catch (Exception e8) {
            ad.a("AnrMonitorManager", "get anr monitor available failed", e8);
            return false;
        }
    }

    private static boolean c(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr != null && stackTraceElementArr.length != 0) {
            try {
                ArrayList arrayList = new ArrayList();
                for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                    if (stackTraceElement != null && !TextUtils.isEmpty(stackTraceElement.toString())) {
                        String stackTraceElement2 = stackTraceElement.toString();
                        if (!TextUtils.isEmpty(stackTraceElement2)) {
                            if (!stackTraceElement2.contains(MBridgeConstans.APPLICATION_STACK_COM_ANDROID)) {
                                if (!stackTraceElement2.contains("com.google")) {
                                    if (!stackTraceElement2.contains("java.lang")) {
                                        if (!stackTraceElement2.contains(MBridgeConstans.APPLICATION_STACK_ANDROID_OS)) {
                                            if (stackTraceElement2.contains(MBridgeConstans.APPLICATION_STACK_ANDROID_APP)) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        arrayList.add(stackTraceElement2);
                    }
                }
                if (arrayList.size() == 0) {
                    return false;
                }
                return d((String) arrayList.get(0));
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("AnrMonitorManager", "isMBridgeFirst exception", e8);
                }
            }
        }
        return false;
    }

    public static void a() {
        if (!b()) {
            ad.a("AnrMonitorManager", "anr monitor is not available");
            return;
        }
        try {
            b.a().a(c(), new a()).start();
        } catch (Exception e8) {
            ad.a("AnrMonitorManager", "start anr monitor failed", e8);
        }
    }

    static /* synthetic */ void a(String str, StackTraceElement[] stackTraceElementArr) throws JSONException {
        try {
            JSONObject c8 = c(str);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception", c8.toString());
            jSONObject.put("crash_first_index_from_mtg", b(stackTraceElementArr));
            e eVar = new e("m_anr_report");
            eVar.a(jSONObject);
            eVar.a(com.mbridge.msdk.foundation.same.report.c.c());
            eVar.a(0);
            eVar.b(1);
            g.a().d().a(eVar);
        } catch (JSONException e8) {
            ad.a("AnrMonitorManager", "reportANRByEventLibrary anr failed", e8);
        }
    }

    private static int c() {
        try {
            int a9 = af.a().a("anr_check_timeout", DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS);
            return a9 <= 0 ? DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS : a9;
        } catch (Exception e8) {
            ad.a("AnrMonitorManager", "get anr check timeout failed", e8);
            return DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS;
        }
    }
}
