package O3;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public static final D f7152a = new D("Complete", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final D f7153b = new D(TypedValues.Custom.NAME, 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ D[] f7154c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ W5.a f7155d;

    static {
        D[] a9 = a();
        f7154c = a9;
        f7155d = W5.b.a(a9);
    }

    private D(String str, int i8) {
    }

    private static final /* synthetic */ D[] a() {
        return new D[]{f7152a, f7153b};
    }

    public static D valueOf(String str) {
        return (D) Enum.valueOf(D.class, str);
    }

    public static D[] values() {
        return (D[]) f7154c.clone();
    }
}
