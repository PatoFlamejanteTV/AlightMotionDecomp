package j$.util.stream;

import java.util.function.LongBinaryOperator;

/* loaded from: classes2.dex */
final class B1 extends AbstractC3134z0 {

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ LongBinaryOperator f33236h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ long f33237i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B1(EnumC3042f3 enumC3042f3, LongBinaryOperator longBinaryOperator, long j8) {
        super(enumC3042f3);
        this.f33236h = longBinaryOperator;
        this.f33237i = j8;
    }

    @Override // j$.util.stream.AbstractC3134z0
    public final V1 f0() {
        return new T1(this.f33237i, this.f33236h);
    }
}
