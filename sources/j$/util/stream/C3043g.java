package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.BaseStream;

/* renamed from: j$.util.stream.g */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3043g implements BaseStream {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC3048h f33502a;

    private /* synthetic */ C3043g(InterfaceC3048h interfaceC3048h) {
        this.f33502a = interfaceC3048h;
    }

    public static /* synthetic */ BaseStream w(InterfaceC3048h interfaceC3048h) {
        if (interfaceC3048h == null) {
            return null;
        }
        return interfaceC3048h instanceof C3038f ? ((C3038f) interfaceC3048h).f33497a : interfaceC3048h instanceof G ? F.w((G) interfaceC3048h) : interfaceC3048h instanceof IntStream ? IntStream.Wrapper.convert((IntStream) interfaceC3048h) : interfaceC3048h instanceof InterfaceC3089p0 ? C3084o0.w((InterfaceC3089p0) interfaceC3048h) : interfaceC3048h instanceof Stream ? Stream.Wrapper.convert((Stream) interfaceC3048h) : new C3043g(interfaceC3048h);
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f33502a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC3048h interfaceC3048h = this.f33502a;
        if (obj instanceof C3043g) {
            obj = ((C3043g) obj).f33502a;
        }
        return interfaceC3048h.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f33502a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.f33502a.isParallel();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Iterator iterator() {
        return this.f33502a.iterator();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return w(this.f33502a.onClose(runnable));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return w(this.f33502a.parallel());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return w(this.f33502a.sequential());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(this.f33502a.spliterator());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return w(this.f33502a.unordered());
    }
}
