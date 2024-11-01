package com.mbridge.msdk.e.a;

import android.util.Log;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public class aa {

    /* renamed from: a, reason: collision with root package name */
    public static String f20007a = "TrackManager_Volley";

    /* renamed from: b, reason: collision with root package name */
    private static final String f20008b = "com.mbridge.msdk.e.a.aa";

    /* loaded from: classes4.dex */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private final List<C0395a> f20009a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f20010b;

        /* renamed from: com.mbridge.msdk.e.a.aa$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        private static class C0395a {

            /* renamed from: a, reason: collision with root package name */
            public final String f20011a;

            /* renamed from: b, reason: collision with root package name */
            public final long f20012b;

            /* renamed from: c, reason: collision with root package name */
            public final long f20013c;
        }

        protected final void finalize() throws Throwable {
            long j8;
            if (!this.f20010b) {
                this.f20010b = true;
                if (this.f20009a.size() == 0) {
                    j8 = 0;
                } else {
                    long j9 = this.f20009a.get(0).f20013c;
                    List<C0395a> list = this.f20009a;
                    j8 = list.get(list.size() - 1).f20013c - j9;
                }
                if (j8 > 0) {
                    long j10 = this.f20009a.get(0).f20013c;
                    aa.b("(%-4d ms) %s", Long.valueOf(j8), "Request on the loose");
                    for (C0395a c0395a : this.f20009a) {
                        long j11 = c0395a.f20013c;
                        aa.b("(+%-4d) [%2d] %s", Long.valueOf(j11 - j10), Long.valueOf(c0395a.f20012b), c0395a.f20011a);
                        j10 = j11;
                    }
                }
                aa.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }
    }

    public static void a(String str, Object... objArr) {
    }

    public static void b(String str, Object... objArr) {
        Log.d(f20007a, d(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        Log.e(f20007a, d(str, objArr));
    }

    private static String d(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i8 = 2;
        while (true) {
            if (i8 < stackTrace.length) {
                if (!stackTrace[i8].getClassName().equals(f20008b)) {
                    String className = stackTrace[i8].getClassName();
                    String substring = className.substring(className.lastIndexOf(46) + 1);
                    str2 = substring.substring(substring.lastIndexOf(36) + 1) + "." + stackTrace[i8].getMethodName();
                    break;
                }
                i8++;
            } else {
                str2 = "<unknown>";
                break;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }

    public static void a(Throwable th, String str, Object... objArr) {
        Log.e(f20007a, d(str, objArr), th);
    }
}
