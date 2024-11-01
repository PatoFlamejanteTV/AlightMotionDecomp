package j$.util.stream;

import j$.util.C3141x;
import j$.util.C3142y;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3068l implements BinaryOperator, Function, BiConsumer, ObjDoubleConsumer, Supplier, LongFunction, IntFunction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33531a;

    public /* synthetic */ C3068l(int i8) {
        this.f33531a = i8;
    }

    @Override // java.util.function.ObjDoubleConsumer
    public void accept(Object obj, double d8) {
        double[] dArr = (double[]) obj;
        switch (this.f33531a) {
            case 4:
                dArr[2] = dArr[2] + 1.0d;
                Collectors.c(dArr, d8);
                dArr[3] = dArr[3] + d8;
                return;
            default:
                Collectors.c(dArr, d8);
                dArr[2] = dArr[2] + d8;
                return;
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.f33531a) {
            case 3:
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                Collectors.c(dArr, dArr2[0]);
                Collectors.c(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                return;
            case 5:
                double[] dArr3 = (double[]) obj;
                double[] dArr4 = (double[]) obj2;
                Collectors.c(dArr3, dArr4[0]);
                Collectors.c(dArr3, dArr4[1]);
                dArr3[2] = dArr3[2] + dArr4[2];
                dArr3[3] = dArr3[3] + dArr4[3];
                return;
            case 21:
                ((List) obj).add(obj2);
                return;
            case 24:
                ((j$.util.v0) obj).a((CharSequence) obj2);
                return;
            default:
                ((LinkedHashSet) obj).add(obj2);
                return;
        }
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f33531a) {
            case 3:
                return j$.com.android.tools.r8.a.a(this, biConsumer);
            case 5:
                return j$.com.android.tools.r8.a.a(this, biConsumer);
            case 21:
                return j$.com.android.tools.r8.a.a(this, biConsumer);
            case 24:
                return j$.com.android.tools.r8.a.a(this, biConsumer);
            default:
                return j$.com.android.tools.r8.a.a(this, biConsumer);
        }
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.f33531a) {
            case 0:
                return j$.com.android.tools.r8.a.b(this, function);
            case 1:
                return j$.com.android.tools.r8.a.b(this, function);
            case 12:
                return j$.com.android.tools.r8.a.b(this, function);
            case 14:
                return j$.com.android.tools.r8.a.b(this, function);
            case 16:
                return j$.com.android.tools.r8.a.b(this, function);
            case 17:
                return j$.com.android.tools.r8.a.b(this, function);
            default:
                return j$.com.android.tools.r8.a.b(this, function);
        }
    }

    /* renamed from: andThen, reason: collision with other method in class */
    public /* synthetic */ Function m5544andThen(Function function) {
        switch (this.f33531a) {
            case 2:
                return Function$CC.$default$andThen(this, function);
            default:
                return Function$CC.$default$andThen(this, function);
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i8) {
        return new Object[i8];
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j8) {
        switch (this.f33531a) {
            case 11:
                return AbstractC3134z0.J(j8);
            case 12:
            default:
                return AbstractC3134z0.V(j8);
            case 13:
                return AbstractC3134z0.T(j8);
        }
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        switch (this.f33531a) {
            case 2:
                Set set = Collectors.f33246a;
                return obj;
            default:
                return ((j$.util.v0) obj).toString();
        }
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f33531a) {
            case 0:
                Map map = (Map) obj;
                Collectors.b(map, (Map) obj2);
                return map;
            case 1:
                List list = (List) obj;
                Set set = Collectors.f33246a;
                list.addAll((List) obj2);
                return list;
            case 12:
                return new N0((F0) obj, (F0) obj2);
            case 14:
                return new N0((H0) obj, (H0) obj2);
            case 16:
                return new N0((J0) obj, (J0) obj2);
            case 17:
                return new N0((L0) obj, (L0) obj2);
            default:
                j$.util.v0 v0Var = (j$.util.v0) obj;
                v0Var.d((j$.util.v0) obj2);
                return v0Var;
        }
    }

    public /* synthetic */ Function compose(Function function) {
        switch (this.f33531a) {
            case 2:
                return Function$CC.$default$compose(this, function);
            default:
                return Function$CC.$default$compose(this, function);
        }
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.f33531a) {
            case 7:
                return new Object();
            case 8:
                return new Object();
            case 9:
                return new Object();
            case 10:
                return new Object();
            case 19:
                return new C3141x();
            case 20:
                return new ArrayList();
            case 22:
                return new C3142y();
            case 23:
                return new j$.util.A();
            case 27:
                return new HashMap();
            default:
                return new LinkedHashSet();
        }
    }
}
