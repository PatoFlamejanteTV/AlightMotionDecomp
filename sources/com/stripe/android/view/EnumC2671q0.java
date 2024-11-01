package com.stripe.android.view;

import n2.AbstractC3394E;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.stripe.android.view.q0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC2671q0 {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC2671q0 f29150b = new EnumC2671q0("ShippingInfo", 0, AbstractC3394E.f35197I0);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC2671q0 f29151c = new EnumC2671q0("ShippingMethod", 1, AbstractC3394E.f35201K0);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC2671q0[] f29152d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ W5.a f29153e;

    /* renamed from: a, reason: collision with root package name */
    private final int f29154a;

    static {
        EnumC2671q0[] a9 = a();
        f29152d = a9;
        f29153e = W5.b.a(a9);
    }

    private EnumC2671q0(String str, int i8, int i9) {
        this.f29154a = i9;
    }

    private static final /* synthetic */ EnumC2671q0[] a() {
        return new EnumC2671q0[]{f29150b, f29151c};
    }

    public static EnumC2671q0 valueOf(String str) {
        return (EnumC2671q0) Enum.valueOf(EnumC2671q0.class, str);
    }

    public static EnumC2671q0[] values() {
        return (EnumC2671q0[]) f29152d.clone();
    }

    public final int b() {
        return this.f29154a;
    }
}
