package com.mbridge.msdk.dycreator.binding;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static volatile c f19857a;

    private c() {
    }

    public static c a() {
        if (f19857a == null) {
            synchronized (c.class) {
                try {
                    if (f19857a == null) {
                        f19857a = new c();
                    }
                } finally {
                }
            }
        }
        return f19857a;
    }
}
