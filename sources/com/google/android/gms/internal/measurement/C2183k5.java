package com.google.android.gms.internal.measurement;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.k5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2183k5 {

    /* renamed from: c, reason: collision with root package name */
    private static final C2183k5 f16803c = new C2183k5();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f16805b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2201m5 f16804a = new L4();

    private C2183k5() {
    }

    public static C2183k5 a() {
        return f16803c;
    }

    public final InterfaceC2210n5 b(Class cls) {
        AbstractC2256t4.f(cls, "messageType");
        InterfaceC2210n5 interfaceC2210n5 = (InterfaceC2210n5) this.f16805b.get(cls);
        if (interfaceC2210n5 == null) {
            InterfaceC2210n5 a9 = this.f16804a.a(cls);
            AbstractC2256t4.f(cls, "messageType");
            AbstractC2256t4.f(a9, "schema");
            InterfaceC2210n5 interfaceC2210n52 = (InterfaceC2210n5) this.f16805b.putIfAbsent(cls, a9);
            if (interfaceC2210n52 != null) {
                return interfaceC2210n52;
            }
            return a9;
        }
        return interfaceC2210n5;
    }

    public final InterfaceC2210n5 c(Object obj) {
        return b(obj.getClass());
    }
}
