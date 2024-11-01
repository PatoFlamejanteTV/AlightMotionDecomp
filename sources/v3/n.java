package v3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f40526a = new n("InformCancellation", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final n f40527b = new n("ModifyPaymentDetails", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final n f40528c = new n("None", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ n[] f40529d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ W5.a f40530e;

    static {
        n[] a9 = a();
        f40529d = a9;
        f40530e = W5.b.a(a9);
    }

    private n(String str, int i8) {
    }

    private static final /* synthetic */ n[] a() {
        return new n[]{f40526a, f40527b, f40528c};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f40529d.clone();
    }
}
