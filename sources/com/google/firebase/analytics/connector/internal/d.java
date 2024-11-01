package com.google.firebase.analytics.connector.internal;

import B0.a;
import java.util.HashSet;
import java.util.Set;
import k0.C3223a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    Set f18410a;

    /* renamed from: b, reason: collision with root package name */
    private a.b f18411b;

    /* renamed from: c, reason: collision with root package name */
    private C3223a f18412c;

    /* renamed from: d, reason: collision with root package name */
    private c f18413d;

    public d(C3223a c3223a, a.b bVar) {
        this.f18411b = bVar;
        this.f18412c = c3223a;
        c cVar = new c(this);
        this.f18413d = cVar;
        this.f18412c.b(cVar);
        this.f18410a = new HashSet();
    }
}
