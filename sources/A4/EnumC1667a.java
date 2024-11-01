package a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC1667a {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC1667a f14089b = new EnumC1667a("EC", 0, "EC");

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1667a f14090c = new EnumC1667a("RSA", 1, "RSA");

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC1667a[] f14091d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ W5.a f14092e;

    /* renamed from: a, reason: collision with root package name */
    private final String f14093a;

    static {
        EnumC1667a[] a9 = a();
        f14091d = a9;
        f14092e = W5.b.a(a9);
    }

    private EnumC1667a(String str, int i8, String str2) {
        this.f14093a = str2;
    }

    private static final /* synthetic */ EnumC1667a[] a() {
        return new EnumC1667a[]{f14089b, f14090c};
    }

    public static EnumC1667a valueOf(String str) {
        return (EnumC1667a) Enum.valueOf(EnumC1667a.class, str);
    }

    public static EnumC1667a[] values() {
        return (EnumC1667a[]) f14091d.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f14093a;
    }
}
