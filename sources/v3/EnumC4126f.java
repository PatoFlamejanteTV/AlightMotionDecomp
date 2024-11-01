package v3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: v3.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC4126f {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC4126f f40480b = new EnumC4126f("Client", 0, "client");

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC4126f f40481c = new EnumC4126f("Server", 1, "server");

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC4126f f40482d = new EnumC4126f("None", 2, "none");

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumC4126f[] f40483e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ W5.a f40484f;

    /* renamed from: a, reason: collision with root package name */
    private final String f40485a;

    static {
        EnumC4126f[] a9 = a();
        f40483e = a9;
        f40484f = W5.b.a(a9);
    }

    private EnumC4126f(String str, int i8, String str2) {
        this.f40485a = str2;
    }

    private static final /* synthetic */ EnumC4126f[] a() {
        return new EnumC4126f[]{f40480b, f40481c, f40482d};
    }

    public static EnumC4126f valueOf(String str) {
        return (EnumC4126f) Enum.valueOf(EnumC4126f.class, str);
    }

    public static EnumC4126f[] values() {
        return (EnumC4126f[]) f40483e.clone();
    }

    public final String b() {
        return this.f40485a;
    }
}
