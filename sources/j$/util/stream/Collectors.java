package j$.util.stream;

import j$.util.AbstractC2998d;
import j$.util.Objects;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

/* loaded from: classes2.dex */
public final class Collectors {

    /* renamed from: a, reason: collision with root package name */
    static final Set f33246a;

    /* renamed from: b, reason: collision with root package name */
    static final Set f33247b;

    static {
        EnumC3053i enumC3053i = EnumC3053i.CONCURRENT;
        EnumC3053i enumC3053i2 = EnumC3053i.UNORDERED;
        EnumC3053i enumC3053i3 = EnumC3053i.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(enumC3053i, enumC3053i2, enumC3053i3));
        Collections.unmodifiableSet(EnumSet.of(enumC3053i, enumC3053i2));
        f33246a = Collections.unmodifiableSet(EnumSet.of(enumC3053i3));
        Collections.unmodifiableSet(EnumSet.of(enumC3053i2, enumC3053i3));
        f33247b = Collections.emptySet();
        Collections.unmodifiableSet(EnumSet.of(enumC3053i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Function function, Function function2, Map map, Object obj) {
        Object apply = function.apply(obj);
        Object requireNonNull = Objects.requireNonNull(function2.apply(obj));
        Object t8 = AbstractC2998d.t(map, apply, requireNonNull);
        if (t8 != null) {
            throw new IllegalStateException(String.format("Duplicate key %s (attempted merging values %s and %s)", apply, t8, requireNonNull));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Map map, Map map2) {
        for (Map.Entry entry : map2.entrySet()) {
            Object key = entry.getKey();
            Object requireNonNull = Objects.requireNonNull(entry.getValue());
            Object t8 = AbstractC2998d.t(map, key, requireNonNull);
            if (t8 != null) {
                throw new IllegalStateException(String.format("Duplicate key %s (attempted merging values %s and %s)", key, t8, requireNonNull));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(double[] dArr, double d8) {
        double d9 = d8 - dArr[1];
        double d10 = dArr[0];
        double d11 = d10 + d9;
        dArr[1] = (d11 - d10) - d9;
        dArr[0] = d11;
    }

    public static Collector<CharSequence, ?, String> joining(CharSequence charSequence) {
        return new C3078n(new C3013a(1, charSequence), new C3068l(24), new C3068l(25), new C3068l(26), f33247b);
    }

    public static <T> Collector<T, ?, List<T>> toList() {
        return new C3078n(new C3068l(20), new C3068l(21), new C3068l(1));
    }

    public static <T, K, U> Collector<T, ?, Map<K, U>> toMap(Function<? super T, ? extends K> function, Function<? super T, ? extends U> function2) {
        return new C3078n(new C3068l(27), new C3073m(0, function, function2), new C3068l(0));
    }
}
