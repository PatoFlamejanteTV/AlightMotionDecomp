package Y2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f12023a = new k("InsteadOfSaveForFutureUse", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final k f12024b = new k("AlongsideSaveForFutureUse", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ k[] f12025c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ W5.a f12026d;

    static {
        k[] a9 = a();
        f12025c = a9;
        f12026d = W5.b.a(a9);
    }

    private k(String str, int i8) {
    }

    private static final /* synthetic */ k[] a() {
        return new k[]{f12023a, f12024b};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f12025c.clone();
    }
}
