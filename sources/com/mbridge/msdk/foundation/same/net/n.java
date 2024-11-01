package com.mbridge.msdk.foundation.same.net;

import android.content.Context;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private static n f21016a;

    /* renamed from: b, reason: collision with root package name */
    private j f21017b;

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.net.e.b f21018c;

    /* renamed from: d, reason: collision with root package name */
    private j f21019d;

    private n() {
    }

    public static void a(i iVar) {
        b().a(iVar);
    }

    private static j b() {
        n nVar = f21016a;
        if (nVar != null) {
            j jVar = nVar.f21019d;
            if (jVar != null) {
                return jVar;
            }
            nVar.f21019d = new j(com.mbridge.msdk.foundation.controller.c.m().c());
            return f21016a.f21019d;
        }
        n nVar2 = new n();
        f21016a = nVar2;
        if (nVar2.f21019d == null) {
            nVar2.f21019d = new j(com.mbridge.msdk.foundation.controller.c.m().c());
        }
        return f21016a.f21019d;
    }

    public static com.mbridge.msdk.foundation.same.net.e.b a() {
        n nVar = f21016a;
        if (nVar != null) {
            com.mbridge.msdk.foundation.same.net.e.b bVar = nVar.f21018c;
            if (bVar != null) {
                return bVar;
            }
            nVar.f21018c = new com.mbridge.msdk.foundation.same.net.e.b(b(), 3);
            return f21016a.f21018c;
        }
        n nVar2 = new n();
        f21016a = nVar2;
        if (nVar2.f21018c == null) {
            nVar2.f21018c = new com.mbridge.msdk.foundation.same.net.e.b(b(), 3);
        }
        return f21016a.f21018c;
    }

    public static void b(i iVar) {
        n nVar = f21016a;
        if (nVar != null) {
            if (nVar.f21017b == null) {
                nVar.f21017b = new j(com.mbridge.msdk.foundation.controller.c.m().c(), null);
            }
        } else {
            n nVar2 = new n();
            f21016a = nVar2;
            if (nVar2.f21017b == null) {
                nVar2.f21017b = new j(com.mbridge.msdk.foundation.controller.c.m().c(), null);
            }
        }
        f21016a.f21017b.a(iVar);
    }

    public static void a(Context context) {
        if (f21016a == null) {
            n nVar = new n();
            f21016a = nVar;
            nVar.f21019d = new j(context.getApplicationContext());
            f21016a.f21018c = new com.mbridge.msdk.foundation.same.net.e.b(b(), 3);
        }
    }
}
