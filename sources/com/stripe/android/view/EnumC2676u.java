package com.stripe.android.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.stripe.android.view.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC2676u {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC2676u f29214a = new EnumC2676u("None", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC2676u f29215b = new EnumC2676u("PostalCode", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC2676u f29216c = new EnumC2676u("Full", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC2676u[] f29217d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ W5.a f29218e;

    static {
        EnumC2676u[] a9 = a();
        f29217d = a9;
        f29218e = W5.b.a(a9);
    }

    private EnumC2676u(String str, int i8) {
    }

    private static final /* synthetic */ EnumC2676u[] a() {
        return new EnumC2676u[]{f29214a, f29215b, f29216c};
    }

    public static EnumC2676u valueOf(String str) {
        return (EnumC2676u) Enum.valueOf(EnumC2676u.class, str);
    }

    public static EnumC2676u[] values() {
        return (EnumC2676u[]) f29217d.clone();
    }
}
