package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class u {
    public static final u ALWAYS;
    public static final u EXCEEDS_PAD;
    public static final u NEVER;
    public static final u NORMAL;
    public static final u NOT_NEGATIVE;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ u[] f32935a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, j$.time.format.u] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, j$.time.format.u] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, j$.time.format.u] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, j$.time.format.u] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, j$.time.format.u] */
    static {
        ?? r52 = new Enum("NORMAL", 0);
        NORMAL = r52;
        ?? r62 = new Enum("ALWAYS", 1);
        ALWAYS = r62;
        ?? r72 = new Enum("NEVER", 2);
        NEVER = r72;
        ?? r8 = new Enum("NOT_NEGATIVE", 3);
        NOT_NEGATIVE = r8;
        ?? r9 = new Enum("EXCEEDS_PAD", 4);
        EXCEEDS_PAD = r9;
        f32935a = new u[]{r52, r62, r72, r8, r9};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f32935a.clone();
    }
}
