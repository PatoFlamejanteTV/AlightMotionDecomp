package com.mbridge.msdk.foundation.same.net.f;

import j$.util.DesugarCollections;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f20891a;

    /* renamed from: b, reason: collision with root package name */
    private final List<com.mbridge.msdk.foundation.same.net.d.b> f20892b;

    /* renamed from: c, reason: collision with root package name */
    private final int f20893c;

    public b(int i8, List<com.mbridge.msdk.foundation.same.net.d.b> list, InputStream inputStream) {
        this.f20893c = i8;
        this.f20892b = list;
        this.f20891a = inputStream;
    }

    public final InputStream a() {
        return this.f20891a;
    }

    public final List<com.mbridge.msdk.foundation.same.net.d.b> b() {
        return DesugarCollections.unmodifiableList(this.f20892b);
    }

    public final int c() {
        return this.f20893c;
    }
}
