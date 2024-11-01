package Z2;

import W5.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f13214a = new a("InputtingPrimaryField", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final a f13215b = new a("VerifyingEmail", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final a f13216c = new a("InputtingRemainingFields", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ a[] f13217d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ W5.a f13218e;

    static {
        a[] a9 = a();
        f13217d = a9;
        f13218e = b.a(a9);
    }

    private a(String str, int i8) {
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f13214a, f13215b, f13216c};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f13217d.clone();
    }
}
