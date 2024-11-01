package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* renamed from: j$.util.stream.f */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3038f implements InterfaceC3048h {

    /* renamed from: a */
    public final /* synthetic */ BaseStream f33497a;

    private /* synthetic */ C3038f(BaseStream baseStream) {
        this.f33497a = baseStream;
    }

    public static /* synthetic */ InterfaceC3048h w(BaseStream baseStream) {
        if (baseStream == null) {
            return null;
        }
        return baseStream instanceof C3043g ? ((C3043g) baseStream).f33502a : baseStream instanceof DoubleStream ? E.w((DoubleStream) baseStream) : baseStream instanceof java.util.stream.IntStream ? IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) baseStream) : baseStream instanceof LongStream ? C3079n0.w((LongStream) baseStream) : baseStream instanceof java.util.stream.Stream ? C3022b3.w((java.util.stream.Stream) baseStream) : new C3038f(baseStream);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f33497a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BaseStream baseStream = this.f33497a;
        if (obj instanceof C3038f) {
            obj = ((C3038f) obj).f33497a;
        }
        return baseStream.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f33497a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC3048h
    public final /* synthetic */ boolean isParallel() {
        return this.f33497a.isParallel();
    }

    @Override // j$.util.stream.InterfaceC3048h, j$.util.stream.G
    public final /* synthetic */ Iterator iterator() {
        return this.f33497a.iterator();
    }

    @Override // j$.util.stream.InterfaceC3048h
    public final /* synthetic */ InterfaceC3048h onClose(Runnable runnable) {
        return w(this.f33497a.onClose(runnable));
    }

    @Override // j$.util.stream.InterfaceC3048h, j$.util.stream.G
    public final /* synthetic */ InterfaceC3048h parallel() {
        return w(this.f33497a.parallel());
    }

    @Override // j$.util.stream.InterfaceC3048h, j$.util.stream.G
    public final /* synthetic */ InterfaceC3048h sequential() {
        return w(this.f33497a.sequential());
    }

    @Override // j$.util.stream.InterfaceC3048h
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.g0.a(this.f33497a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC3048h
    public final /* synthetic */ InterfaceC3048h unordered() {
        return w(this.f33497a.unordered());
    }
}
