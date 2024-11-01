package j$.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.util.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC3000f implements Comparator, InterfaceC2999e {
    public static final EnumC3000f INSTANCE;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ EnumC3000f[] f33160a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, j$.util.f] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        INSTANCE = r12;
        f33160a = new EnumC3000f[]{r12};
    }

    public static EnumC3000f valueOf(String str) {
        return (EnumC3000f) Enum.valueOf(EnumC3000f.class, str);
    }

    public static EnumC3000f[] values() {
        return (EnumC3000f[]) f33160a.clone();
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo((Comparable) obj2);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return Collections.reverseOrder();
    }

    @Override // java.util.Comparator
    public final Comparator thenComparing(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return new C2996c(this, comparator, 0);
    }

    @Override // java.util.Comparator
    public final Comparator thenComparing(Function function) {
        Objects.requireNonNull(function);
        return AbstractC2998d.v(this, new C2995b(2, function));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparing(Function function, Comparator comparator) {
        return AbstractC2998d.v(this, Comparator$CC.comparing(function, comparator));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        Objects.requireNonNull(toDoubleFunction);
        return AbstractC2998d.v(this, new C2995b(1, toDoubleFunction));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparingInt(ToIntFunction toIntFunction) {
        Objects.requireNonNull(toIntFunction);
        return AbstractC2998d.v(this, new C2995b(0, toIntFunction));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparingLong(ToLongFunction toLongFunction) {
        Objects.requireNonNull(toLongFunction);
        return AbstractC2998d.v(this, new C2995b(3, toLongFunction));
    }
}
