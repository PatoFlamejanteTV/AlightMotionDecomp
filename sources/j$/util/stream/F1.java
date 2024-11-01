package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
final class F1 extends AbstractC3134z0 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f33260h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Object f33261i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ Object f33262j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ Object f33263k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F1(EnumC3042f3 enumC3042f3, Object obj, Object obj2, Object obj3, int i8) {
        super(enumC3042f3);
        this.f33260h = i8;
        this.f33261i = obj;
        this.f33263k = obj2;
        this.f33262j = obj3;
    }

    public /* synthetic */ F1(EnumC3042f3 enumC3042f3, BinaryOperator binaryOperator, Object obj, Supplier supplier, int i8) {
        this.f33260h = i8;
        this.f33261i = binaryOperator;
        this.f33263k = obj;
        this.f33262j = supplier;
    }

    @Override // j$.util.stream.AbstractC3134z0
    public final V1 f0() {
        switch (this.f33260h) {
            case 0:
                return new C1((Supplier) this.f33262j, (ObjLongConsumer) this.f33263k, (BinaryOperator) this.f33261i);
            case 1:
                return new I1((Supplier) this.f33262j, (ObjDoubleConsumer) this.f33263k, (BinaryOperator) this.f33261i);
            case 2:
                return new K1(this.f33262j, (BiFunction) this.f33263k, (BinaryOperator) this.f33261i);
            case 3:
                return new O1((Supplier) this.f33262j, (BiConsumer) this.f33263k, (BiConsumer) this.f33261i);
            default:
                return new S1((Supplier) this.f33262j, (ObjIntConsumer) this.f33263k, (BinaryOperator) this.f33261i);
        }
    }
}
