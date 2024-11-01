package j$.time.zone;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class d {
    public static final d STANDARD;
    public static final d UTC;
    public static final d WALL;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ d[] f33021a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, j$.time.zone.d] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, j$.time.zone.d] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, j$.time.zone.d] */
    static {
        ?? r32 = new Enum("UTC", 0);
        UTC = r32;
        ?? r42 = new Enum("WALL", 1);
        WALL = r42;
        ?? r52 = new Enum("STANDARD", 2);
        STANDARD = r52;
        f33021a = new d[]{r32, r42, r52};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f33021a.clone();
    }
}
