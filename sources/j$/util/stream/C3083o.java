package j$.util.stream;

import j$.util.C3141x;
import j$.util.C3142y;
import j$.util.function.Predicate$CC;
import java.util.LinkedHashSet;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleFunction;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* renamed from: j$.util.stream.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3083o implements BiConsumer, DoubleBinaryOperator, Supplier, ObjDoubleConsumer, DoubleFunction, ToDoubleFunction, IntFunction, Predicate, ToIntFunction, IntBinaryOperator, ObjIntConsumer, ObjLongConsumer, LongBinaryOperator, ToLongFunction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33550a;

    public /* synthetic */ C3083o(int i8) {
        this.f33550a = i8;
    }

    @Override // java.util.function.ObjDoubleConsumer
    public void accept(Object obj, double d8) {
        ((C3141x) obj).accept(d8);
    }

    @Override // java.util.function.ObjIntConsumer
    public void accept(Object obj, int i8) {
        switch (this.f33550a) {
            case 19:
                ((C3142y) obj).accept(i8);
                return;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + i8;
                return;
        }
    }

    @Override // java.util.function.ObjLongConsumer
    public void accept(Object obj, long j8) {
        ((j$.util.A) obj).accept(j8);
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.f33550a) {
            case 0:
                ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
                return;
            case 4:
                ((C3141x) obj).b((C3141x) obj2);
                return;
            case 20:
                ((C3142y) obj).b((C3142y) obj2);
                return;
            case 25:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                jArr[0] = jArr[0] + jArr2[0];
                jArr[1] = jArr[1] + jArr2[1];
                return;
            default:
                ((j$.util.A) obj).b((j$.util.A) obj2);
                return;
        }
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f33550a) {
            case 10:
                return Predicate$CC.$default$and(this, predicate);
            case 11:
                return Predicate$CC.$default$and(this, predicate);
            case 12:
                return Predicate$CC.$default$and(this, predicate);
            default:
                return Predicate$CC.$default$and(this, predicate);
        }
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f33550a) {
            case 0:
                return j$.com.android.tools.r8.a.a(this, biConsumer);
            case 4:
                return j$.com.android.tools.r8.a.a(this, biConsumer);
            case 20:
                return j$.com.android.tools.r8.a.a(this, biConsumer);
            case 25:
                return j$.com.android.tools.r8.a.a(this, biConsumer);
            default:
                return j$.com.android.tools.r8.a.a(this, biConsumer);
        }
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d8) {
        return Double.valueOf(d8);
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i8) {
        switch (this.f33550a) {
            case 7:
                return new Double[i8];
            case 14:
                return new Object[i8];
            case 15:
                return new Integer[i8];
            default:
                return Integer.valueOf(i8);
        }
    }

    @Override // java.util.function.DoubleBinaryOperator
    public double applyAsDouble(double d8, double d9) {
        switch (this.f33550a) {
            case 1:
                return Math.min(d8, d9);
            default:
                return Math.max(d8, d9);
        }
    }

    @Override // java.util.function.ToDoubleFunction
    public double applyAsDouble(Object obj) {
        return ((Double) obj).doubleValue();
    }

    @Override // java.util.function.IntBinaryOperator
    public int applyAsInt(int i8, int i9) {
        switch (this.f33550a) {
            case 18:
                return Math.min(i8, i9);
            case 21:
                return i8 + i9;
            default:
                return Math.max(i8, i9);
        }
    }

    @Override // java.util.function.ToIntFunction
    public int applyAsInt(Object obj) {
        return ((Integer) obj).intValue();
    }

    @Override // java.util.function.LongBinaryOperator
    public long applyAsLong(long j8, long j9) {
        return Math.min(j8, j9);
    }

    @Override // java.util.function.ToLongFunction
    public long applyAsLong(Object obj) {
        return ((Long) obj).longValue();
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.f33550a) {
            case 2:
                return new double[4];
            case 9:
                return new double[3];
            default:
                return new long[2];
        }
    }

    public /* synthetic */ Predicate negate() {
        switch (this.f33550a) {
            case 10:
                return Predicate$CC.$default$negate(this);
            case 11:
                return Predicate$CC.$default$negate(this);
            case 12:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.f33550a) {
            case 10:
                return Predicate$CC.$default$or(this, predicate);
            case 11:
                return Predicate$CC.$default$or(this, predicate);
            case 12:
                return Predicate$CC.$default$or(this, predicate);
            default:
                return Predicate$CC.$default$or(this, predicate);
        }
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        switch (this.f33550a) {
            case 10:
                return ((j$.util.C) obj).c();
            case 11:
                return ((j$.util.D) obj).c();
            case 12:
                return ((j$.util.E) obj).c();
            default:
                return ((j$.util.B) obj).c();
        }
    }
}
