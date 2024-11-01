package com.google.android.gms.internal.measurement;

import x0.AbstractC4194q;

/* renamed from: com.google.android.gms.internal.measurement.x3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2287x3 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f17076a;

    public C2287x3(InterfaceC2279w3 interfaceC2279w3) {
        w0.h.j(interfaceC2279w3, "BuildInfo must be non-null");
        this.f17076a = !interfaceC2279w3.w();
    }

    public final boolean a(String str) {
        w0.h.j(str, "flagName must not be null");
        if (!this.f17076a) {
            return true;
        }
        return ((AbstractC4194q) A3.f16225a.get()).b(str);
    }
}
