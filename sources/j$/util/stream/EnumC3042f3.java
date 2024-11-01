package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.util.stream.f3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC3042f3 {
    public static final EnumC3042f3 DOUBLE_VALUE;
    public static final EnumC3042f3 INT_VALUE;
    public static final EnumC3042f3 LONG_VALUE;
    public static final EnumC3042f3 REFERENCE;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ EnumC3042f3[] f33501a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, j$.util.stream.f3] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, j$.util.stream.f3] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, j$.util.stream.f3] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, j$.util.stream.f3] */
    static {
        ?? r42 = new Enum("REFERENCE", 0);
        REFERENCE = r42;
        ?? r52 = new Enum("INT_VALUE", 1);
        INT_VALUE = r52;
        ?? r62 = new Enum("LONG_VALUE", 2);
        LONG_VALUE = r62;
        ?? r72 = new Enum("DOUBLE_VALUE", 3);
        DOUBLE_VALUE = r72;
        f33501a = new EnumC3042f3[]{r42, r52, r62, r72};
    }

    public static EnumC3042f3 valueOf(String str) {
        return (EnumC3042f3) Enum.valueOf(EnumC3042f3.class, str);
    }

    public static EnumC3042f3[] values() {
        return (EnumC3042f3[]) f33501a.clone();
    }
}
