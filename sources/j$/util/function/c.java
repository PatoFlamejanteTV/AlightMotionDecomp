package j$.util.function;

import java.util.function.DoubleUnaryOperator;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements DoubleUnaryOperator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33165a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DoubleUnaryOperator f33166b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DoubleUnaryOperator f33167c;

    public /* synthetic */ c(DoubleUnaryOperator doubleUnaryOperator, DoubleUnaryOperator doubleUnaryOperator2, int i8) {
        this.f33165a = i8;
        this.f33166b = doubleUnaryOperator;
        this.f33167c = doubleUnaryOperator2;
    }

    public final /* synthetic */ DoubleUnaryOperator andThen(DoubleUnaryOperator doubleUnaryOperator) {
        switch (this.f33165a) {
            case 0:
                return DoubleUnaryOperator$CC.$default$andThen(this, doubleUnaryOperator);
            default:
                return DoubleUnaryOperator$CC.$default$andThen(this, doubleUnaryOperator);
        }
    }

    @Override // java.util.function.DoubleUnaryOperator
    public final double applyAsDouble(double d8) {
        switch (this.f33165a) {
            case 0:
                return this.f33166b.applyAsDouble(this.f33167c.applyAsDouble(d8));
            default:
                return this.f33167c.applyAsDouble(this.f33166b.applyAsDouble(d8));
        }
    }

    public final /* synthetic */ DoubleUnaryOperator compose(DoubleUnaryOperator doubleUnaryOperator) {
        switch (this.f33165a) {
            case 0:
                return DoubleUnaryOperator$CC.$default$compose(this, doubleUnaryOperator);
            default:
                return DoubleUnaryOperator$CC.$default$compose(this, doubleUnaryOperator);
        }
    }
}
