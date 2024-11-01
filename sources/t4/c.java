package t4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f39571a = new c("Focused", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final c f39572b = new c("UnfocusedEmpty", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final c f39573c = new c("UnfocusedNotEmpty", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ c[] f39574d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ W5.a f39575e;

    static {
        c[] a9 = a();
        f39574d = a9;
        f39575e = W5.b.a(a9);
    }

    private c(String str, int i8) {
    }

    private static final /* synthetic */ c[] a() {
        return new c[]{f39571a, f39572b, f39573c};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f39574d.clone();
    }
}
