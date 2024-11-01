package j$.time.format;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class k implements f {
    public static final k INSENSITIVE;
    public static final k LENIENT;
    public static final k SENSITIVE;
    public static final k STRICT;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ k[] f32912a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, j$.time.format.k] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, j$.time.format.k] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, j$.time.format.k] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, j$.time.format.k] */
    static {
        ?? r42 = new Enum("SENSITIVE", 0);
        SENSITIVE = r42;
        ?? r52 = new Enum("INSENSITIVE", 1);
        INSENSITIVE = r52;
        ?? r62 = new Enum("STRICT", 2);
        STRICT = r62;
        ?? r72 = new Enum("LENIENT", 3);
        LENIENT = r72;
        f32912a = new k[]{r42, r52, r62, r72};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f32912a.clone();
    }

    @Override // j$.time.format.f
    public final boolean j(p pVar, StringBuilder sb) {
        return true;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return "ParseCaseSensitive(true)";
        }
        if (ordinal == 1) {
            return "ParseCaseSensitive(false)";
        }
        if (ordinal == 2) {
            return "ParseStrict(true)";
        }
        if (ordinal == 3) {
            return "ParseStrict(false)";
        }
        throw new IllegalStateException("Unreachable");
    }
}
