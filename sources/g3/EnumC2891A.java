package g3;

import androidx.core.os.EnvironmentCompat;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: g3.A, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC2891A {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC2891A f31939b = new EnumC2891A("AMOUNTS", 0, "amounts");

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC2891A f31940c = new EnumC2891A("DESCRIPTOR_CODE", 1, "descriptor_code");

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC2891A f31941d = new EnumC2891A("UNKNOWN", 2, EnvironmentCompat.MEDIA_UNKNOWN);

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumC2891A[] f31942e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ W5.a f31943f;

    /* renamed from: a, reason: collision with root package name */
    private final String f31944a;

    static {
        EnumC2891A[] a9 = a();
        f31942e = a9;
        f31943f = W5.b.a(a9);
    }

    private EnumC2891A(String str, int i8, String str2) {
        this.f31944a = str2;
    }

    private static final /* synthetic */ EnumC2891A[] a() {
        return new EnumC2891A[]{f31939b, f31940c, f31941d};
    }

    public static W5.a b() {
        return f31943f;
    }

    public static EnumC2891A valueOf(String str) {
        return (EnumC2891A) Enum.valueOf(EnumC2891A.class, str);
    }

    public static EnumC2891A[] values() {
        return (EnumC2891A[]) f31942e.clone();
    }

    public final String c() {
        return this.f31944a;
    }
}
