package com.mbridge.msdk.e.a.a;

import j$.util.DesugarCollections;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final int f19996a;

    /* renamed from: b, reason: collision with root package name */
    private final List<com.mbridge.msdk.e.a.i> f19997b;

    /* renamed from: c, reason: collision with root package name */
    private final int f19998c;

    /* renamed from: d, reason: collision with root package name */
    private final InputStream f19999d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f20000e;

    public f(int i8, List<com.mbridge.msdk.e.a.i> list) {
        this(i8, list, -1, null);
    }

    public final int a() {
        return this.f19996a;
    }

    public final List<com.mbridge.msdk.e.a.i> b() {
        return DesugarCollections.unmodifiableList(this.f19997b);
    }

    public final int c() {
        return this.f19998c;
    }

    public final InputStream d() {
        InputStream inputStream = this.f19999d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.f20000e != null) {
            return new ByteArrayInputStream(this.f20000e);
        }
        return null;
    }

    public f(int i8, List<com.mbridge.msdk.e.a.i> list, int i9, InputStream inputStream) {
        this.f19996a = i8;
        this.f19997b = list;
        this.f19998c = i9;
        this.f19999d = inputStream;
        this.f20000e = null;
    }
}
