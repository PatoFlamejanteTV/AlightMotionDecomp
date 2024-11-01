package j$.util.stream;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

/* loaded from: classes2.dex */
final class D1 extends AbstractC3134z0 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f33248h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Object f33249i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D1(EnumC3042f3 enumC3042f3, Object obj, int i8) {
        super(enumC3042f3);
        this.f33248h = i8;
        this.f33249i = obj;
    }

    @Override // j$.util.stream.AbstractC3134z0
    public final V1 f0() {
        switch (this.f33248h) {
            case 0:
                return new U1((LongBinaryOperator) this.f33249i);
            case 1:
                return new G1((DoubleBinaryOperator) this.f33249i);
            case 2:
                return new L1((BinaryOperator) this.f33249i);
            default:
                return new R1((IntBinaryOperator) this.f33249i);
        }
    }
}
