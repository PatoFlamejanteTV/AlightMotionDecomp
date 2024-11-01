package com.mbridge.msdk.e.a;

import com.mbridge.msdk.e.a.b;

/* loaded from: classes4.dex */
public final class r<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f20093a;

    /* renamed from: b, reason: collision with root package name */
    public final b.a f20094b;

    /* renamed from: c, reason: collision with root package name */
    public final z f20095c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f20096d;

    /* loaded from: classes4.dex */
    public interface a {
        void a(z zVar);
    }

    /* loaded from: classes4.dex */
    public interface b<T> {
        void a(T t8);
    }

    private r(T t8, b.a aVar) {
        this.f20096d = false;
        this.f20093a = t8;
        this.f20094b = aVar;
        this.f20095c = null;
    }

    public static <T> r<T> a(T t8, b.a aVar) {
        return new r<>(t8, aVar);
    }

    public static <T> r<T> a(z zVar) {
        return new r<>(zVar);
    }

    public final boolean a() {
        return this.f20095c == null;
    }

    private r(z zVar) {
        this.f20096d = false;
        this.f20093a = null;
        this.f20094b = null;
        this.f20095c = zVar;
    }
}
