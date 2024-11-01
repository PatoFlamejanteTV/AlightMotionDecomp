package Q5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f8803a = new o("SYNCHRONIZED", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final o f8804b = new o("PUBLICATION", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final o f8805c = new o("NONE", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ o[] f8806d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ W5.a f8807e;

    static {
        o[] a9 = a();
        f8806d = a9;
        f8807e = W5.b.a(a9);
    }

    private o(String str, int i8) {
    }

    private static final /* synthetic */ o[] a() {
        return new o[]{f8803a, f8804b, f8805c};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f8806d.clone();
    }
}
