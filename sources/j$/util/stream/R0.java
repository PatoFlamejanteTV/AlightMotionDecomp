package j$.util.stream;

import j$.util.C3001g;
import j$.util.stream.IntStream;
import java.util.function.IntFunction;
import java.util.function.LongFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class R0 implements LongFunction, IntFunction {

    /* renamed from: a, reason: collision with root package name */
    public IntFunction f33356a;

    @Override // java.util.function.IntFunction
    public Object apply(int i8) {
        Object apply = this.f33356a.apply(i8);
        if (apply == null) {
            return null;
        }
        if (apply instanceof IntStream) {
            return IntStream.Wrapper.convert((IntStream) apply);
        }
        if (apply instanceof java.util.stream.IntStream) {
            return IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) apply);
        }
        C3001g.a("java.util.stream.IntStream", apply.getClass());
        throw null;
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j8) {
        return AbstractC3134z0.D(j8, this.f33356a);
    }
}
