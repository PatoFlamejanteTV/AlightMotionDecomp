package j$.util.function;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements BinaryOperator, Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33161a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f33162b;

    public /* synthetic */ a(int i8, Object obj) {
        this.f33161a = i8;
        this.f33162b = obj;
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.f33161a) {
            case 0:
                return j$.com.android.tools.r8.a.b(this, function);
            default:
                return j$.com.android.tools.r8.a.b(this, function);
        }
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f33161a) {
            case 0:
                return ((Comparator) this.f33162b).compare(obj, obj2) >= 0 ? obj : obj2;
            default:
                return ((Comparator) this.f33162b).compare(obj, obj2) <= 0 ? obj : obj2;
        }
    }

    public /* synthetic */ Predicate negate() {
        return Predicate$CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        return !((Predicate) this.f33162b).test(obj);
    }
}
