package n2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class J {

    /* renamed from: b, reason: collision with root package name */
    public static final J f35310b = new J("WeChatPayV1", 0, "wechat_pay_beta=v1");

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ J[] f35311c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ W5.a f35312d;

    /* renamed from: a, reason: collision with root package name */
    private final String f35313a;

    static {
        J[] a9 = a();
        f35311c = a9;
        f35312d = W5.b.a(a9);
    }

    private J(String str, int i8, String str2) {
        this.f35313a = str2;
    }

    private static final /* synthetic */ J[] a() {
        return new J[]{f35310b};
    }

    public static J valueOf(String str) {
        return (J) Enum.valueOf(J.class, str);
    }

    public static J[] values() {
        return (J[]) f35311c.clone();
    }

    public final String b() {
        return this.f35313a;
    }
}
