package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.f0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3039f0 implements IntFunction, LongFunction, Supplier, ObjLongConsumer, BiConsumer, LongBinaryOperator, Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33498a;

    public /* synthetic */ C3039f0(int i8) {
        this.f33498a = i8;
    }

    private final void accept$j$$util$stream$Node$$ExternalSyntheticLambda0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda1(Object obj) {
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        int i8 = this.f33498a;
    }

    @Override // java.util.function.ObjLongConsumer
    public void accept(Object obj, long j8) {
        long[] jArr = (long[]) obj;
        jArr[0] = jArr[0] + 1;
        jArr[1] = jArr[1] + j8;
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        long[] jArr = (long[]) obj;
        long[] jArr2 = (long[]) obj2;
        jArr[0] = jArr[0] + jArr2[0];
        jArr[1] = jArr[1] + jArr2[1];
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return j$.com.android.tools.r8.a.a(this, biConsumer);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f33498a) {
            case 7:
                return Consumer$CC.$default$andThen(this, consumer);
            case 13:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i8) {
        switch (this.f33498a) {
            case 0:
                return new Long[i8];
            case 8:
                return new Object[i8];
            case 9:
                return new Object[i8];
            case 10:
                return new Integer[i8];
            case 11:
                return new Long[i8];
            default:
                return new Double[i8];
        }
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j8) {
        return Long.valueOf(j8);
    }

    @Override // java.util.function.LongBinaryOperator
    public long applyAsLong(long j8, long j9) {
        switch (this.f33498a) {
            case 5:
                return Math.max(j8, j9);
            default:
                return j8 + j9;
        }
    }

    @Override // java.util.function.Supplier
    public Object get() {
        return new long[2];
    }
}
