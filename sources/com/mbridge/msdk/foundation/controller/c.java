package com.mbridge.msdk.foundation.controller;

import com.mbridge.msdk.foundation.controller.a;

/* loaded from: classes4.dex */
public class c extends a {

    /* renamed from: f, reason: collision with root package name */
    private static volatile c f20327f;

    private c() {
    }

    public static c m() {
        if (f20327f == null) {
            synchronized (c.class) {
                try {
                    if (f20327f == null) {
                        f20327f = new c();
                    }
                } finally {
                }
            }
        }
        return f20327f;
    }

    @Override // com.mbridge.msdk.foundation.controller.a
    protected final void a(a.InterfaceC0397a interfaceC0397a) {
    }
}
