package w2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: w2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC4152a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC4152a f40675a = new EnumC4152a("CustomTabs", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC4152a f40676b = new EnumC4152a("Unknown", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumC4152a[] f40677c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ W5.a f40678d;

    static {
        EnumC4152a[] a9 = a();
        f40677c = a9;
        f40678d = W5.b.a(a9);
    }

    private EnumC4152a(String str, int i8) {
    }

    private static final /* synthetic */ EnumC4152a[] a() {
        return new EnumC4152a[]{f40675a, f40676b};
    }

    public static EnumC4152a valueOf(String str) {
        return (EnumC4152a) Enum.valueOf(EnumC4152a.class, str);
    }

    public static EnumC4152a[] values() {
        return (EnumC4152a[]) f40677c.clone();
    }
}
