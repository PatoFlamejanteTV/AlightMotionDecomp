package com.mbridge.msdk.foundation.same.net;

/* loaded from: classes4.dex */
public final class k<T> {

    /* renamed from: a, reason: collision with root package name */
    public com.mbridge.msdk.foundation.same.net.b.a f20998a;

    /* renamed from: b, reason: collision with root package name */
    public com.mbridge.msdk.foundation.same.net.f.c f20999b;

    /* renamed from: c, reason: collision with root package name */
    public T f21000c;

    private k(T t8, com.mbridge.msdk.foundation.same.net.f.c cVar) {
        this.f20998a = null;
        this.f21000c = t8;
        this.f20999b = cVar;
    }

    public static <T> k<T> a(com.mbridge.msdk.foundation.same.net.b.a aVar) {
        return new k<>(aVar);
    }

    public static <T> k<T> a(T t8, com.mbridge.msdk.foundation.same.net.f.c cVar) {
        return new k<>(t8, cVar);
    }

    private k(com.mbridge.msdk.foundation.same.net.b.a aVar) {
        this.f20999b = null;
        this.f21000c = null;
        this.f20998a = aVar;
    }
}
