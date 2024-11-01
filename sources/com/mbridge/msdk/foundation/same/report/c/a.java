package com.mbridge.msdk.foundation.same.report.c;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f21069a = "a";

    /* renamed from: b, reason: collision with root package name */
    private static a f21070b;

    private a() {
    }

    public static a a() {
        if (f21070b == null) {
            synchronized (a.class) {
                try {
                    if (f21070b == null) {
                        f21070b = new a();
                    }
                } finally {
                }
            }
        }
        return f21070b;
    }
}
