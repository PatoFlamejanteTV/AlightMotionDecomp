package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.util.stream.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC3053i {
    public static final EnumC3053i CONCURRENT;
    public static final EnumC3053i IDENTITY_FINISH;
    public static final EnumC3053i UNORDERED;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ EnumC3053i[] f33518a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [j$.util.stream.i, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [j$.util.stream.i, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [j$.util.stream.i, java.lang.Enum] */
    static {
        ?? r32 = new Enum("CONCURRENT", 0);
        CONCURRENT = r32;
        ?? r42 = new Enum("UNORDERED", 1);
        UNORDERED = r42;
        ?? r52 = new Enum("IDENTITY_FINISH", 2);
        IDENTITY_FINISH = r52;
        f33518a = new EnumC3053i[]{r32, r42, r52};
    }

    public static EnumC3053i valueOf(String str) {
        return (EnumC3053i) Enum.valueOf(EnumC3053i.class, str);
    }

    public static EnumC3053i[] values() {
        return (EnumC3053i[]) f33518a.clone();
    }
}
