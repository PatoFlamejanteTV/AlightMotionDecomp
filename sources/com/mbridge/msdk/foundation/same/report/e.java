package com.mbridge.msdk.foundation.same.report;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static volatile e f21113a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f21114b = false;

    private e() {
    }

    public static synchronized e a() {
        e eVar;
        synchronized (e.class) {
            try {
                if (f21113a == null) {
                    f21113a = new e();
                }
                eVar = f21113a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public final synchronized boolean b() {
        return false;
    }

    public final synchronized void a(String str) {
    }
}
