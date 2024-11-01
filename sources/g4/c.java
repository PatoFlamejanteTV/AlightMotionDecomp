package g4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f32285a = new c("Automatic", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final c f32286b = new c("Never", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final c f32287c = new c("Full", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ c[] f32288d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ W5.a f32289e;

    static {
        c[] a9 = a();
        f32288d = a9;
        f32289e = W5.b.a(a9);
    }

    private c(String str, int i8) {
    }

    private static final /* synthetic */ c[] a() {
        return new c[]{f32285a, f32286b, f32287c};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f32288d.clone();
    }
}
