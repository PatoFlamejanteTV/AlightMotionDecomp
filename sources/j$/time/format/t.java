package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class t {
    public static final t LENIENT;
    public static final t SMART;
    public static final t STRICT;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ t[] f32934a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, j$.time.format.t] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, j$.time.format.t] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, j$.time.format.t] */
    static {
        ?? r32 = new Enum("STRICT", 0);
        STRICT = r32;
        ?? r42 = new Enum("SMART", 1);
        SMART = r42;
        ?? r52 = new Enum("LENIENT", 2);
        LENIENT = r52;
        f32934a = new t[]{r32, r42, r52};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f32934a.clone();
    }
}
