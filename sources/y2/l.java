package Y2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f12027a = new l("Checkbox", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final l f12028b = new l("CheckboxWithPrefilledEmail", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final l f12029c = new l("CheckboxWithPrefilledEmailAndPhone", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final l f12030d = new l("Implied", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final l f12031e = new l("ImpliedWithPrefilledEmail", 4);

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ l[] f12032f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ W5.a f12033g;

    static {
        l[] a9 = a();
        f12032f = a9;
        f12033g = W5.b.a(a9);
    }

    private l(String str, int i8) {
    }

    private static final /* synthetic */ l[] a() {
        return new l[]{f12027a, f12028b, f12029c, f12030d, f12031e};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f12032f.clone();
    }
}
