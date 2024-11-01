package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* renamed from: j$.util.stream.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3107t implements BinaryOperator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33580a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BiConsumer f33581b;

    public /* synthetic */ C3107t(BiConsumer biConsumer, int i8) {
        this.f33580a = i8;
        this.f33581b = biConsumer;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        switch (this.f33580a) {
            case 0:
                return j$.com.android.tools.r8.a.b(this, function);
            case 1:
                return j$.com.android.tools.r8.a.b(this, function);
            default:
                return j$.com.android.tools.r8.a.b(this, function);
        }
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.f33580a) {
            case 0:
                this.f33581b.accept(obj, obj2);
                return obj;
            case 1:
                this.f33581b.accept(obj, obj2);
                return obj;
            default:
                this.f33581b.accept(obj, obj2);
                return obj;
        }
    }
}
