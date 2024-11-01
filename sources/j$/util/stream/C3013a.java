package j$.util.stream;

import j$.util.C3001g;
import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.List;
import java.util.Set;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.LongFunction;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* renamed from: j$.util.stream.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3013a implements Supplier, Consumer, BooleanSupplier, DoubleFunction, Function, LongFunction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33433a;

    /* renamed from: b, reason: collision with root package name */
    public Object f33434b;

    public /* synthetic */ C3013a(int i8) {
        this.f33433a = i8;
    }

    public /* synthetic */ C3013a(int i8, Object obj) {
        this.f33433a = i8;
        this.f33434b = obj;
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.f33433a) {
            case 2:
                ((InterfaceC3096q2) this.f33434b).accept((InterfaceC3096q2) obj);
                return;
            default:
                ((List) this.f33434b).add(obj);
                return;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f33433a) {
            case 2:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }

    public /* synthetic */ Function andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d8) {
        Object apply = ((DoubleFunction) this.f33434b).apply(d8);
        if (apply == null) {
            return null;
        }
        if (apply instanceof G) {
            return F.w((G) apply);
        }
        if (apply instanceof DoubleStream) {
            return E.w((DoubleStream) apply);
        }
        C3001g.a("java.util.stream.DoubleStream", apply.getClass());
        throw null;
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j8) {
        Object apply = ((LongFunction) this.f33434b).apply(j8);
        if (apply == null) {
            return null;
        }
        if (apply instanceof InterfaceC3089p0) {
            return C3084o0.w((InterfaceC3089p0) apply);
        }
        if (apply instanceof LongStream) {
            return C3079n0.w((LongStream) apply);
        }
        C3001g.a("java.util.stream.LongStream", apply.getClass());
        throw null;
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        Object apply = ((Function) this.f33434b).apply(obj);
        if (apply == null) {
            return null;
        }
        if (apply instanceof Stream) {
            return Stream.Wrapper.convert((Stream) apply);
        }
        if (apply instanceof java.util.stream.Stream) {
            return C3022b3.w((java.util.stream.Stream) apply);
        }
        if (apply instanceof IntStream) {
            return IntStream.Wrapper.convert((IntStream) apply);
        }
        if (apply instanceof java.util.stream.IntStream) {
            return IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) apply);
        }
        if (apply instanceof G) {
            return F.w((G) apply);
        }
        if (apply instanceof DoubleStream) {
            return E.w((DoubleStream) apply);
        }
        if (apply instanceof InterfaceC3089p0) {
            return C3084o0.w((InterfaceC3089p0) apply);
        }
        if (apply instanceof LongStream) {
            return C3079n0.w((LongStream) apply);
        }
        C3001g.a("java.util.stream.*Stream", apply.getClass());
        throw null;
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.f33433a) {
            case 0:
                return ((AbstractC3018b) this.f33434b).I();
            case 1:
                Set set = Collectors.f33246a;
                return new j$.util.v0((CharSequence) this.f33434b);
            default:
                return (Spliterator) this.f33434b;
        }
    }

    @Override // java.util.function.BooleanSupplier
    public boolean getAsBoolean() {
        switch (this.f33433a) {
            case 3:
                C3092p3 c3092p3 = (C3092p3) this.f33434b;
                return c3092p3.f33508d.tryAdvance(c3092p3.f33509e);
            case 4:
                C3101r3 c3101r3 = (C3101r3) this.f33434b;
                return c3101r3.f33508d.tryAdvance(c3101r3.f33509e);
            case 5:
                C3111t3 c3111t3 = (C3111t3) this.f33434b;
                return c3111t3.f33508d.tryAdvance(c3111t3.f33509e);
            default:
                I3 i32 = (I3) this.f33434b;
                return i32.f33508d.tryAdvance(i32.f33509e);
        }
    }
}
