package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
final class H1 extends AbstractC3134z0 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f33280h;

    public /* synthetic */ H1(int i8) {
        this.f33280h = i8;
    }

    @Override // j$.util.stream.AbstractC3134z0, j$.util.stream.K3
    public final Object b(AbstractC3018b abstractC3018b, Spliterator spliterator) {
        switch (this.f33280h) {
            case 0:
                return EnumC3037e3.SIZED.r(abstractC3018b.G()) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.b(abstractC3018b, spliterator);
            case 1:
                return EnumC3037e3.SIZED.r(abstractC3018b.G()) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.b(abstractC3018b, spliterator);
            case 2:
                return EnumC3037e3.SIZED.r(abstractC3018b.G()) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.b(abstractC3018b, spliterator);
            default:
                return EnumC3037e3.SIZED.r(abstractC3018b.G()) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.b(abstractC3018b, spliterator);
        }
    }

    @Override // j$.util.stream.AbstractC3134z0, j$.util.stream.K3
    public final Object c(AbstractC3018b abstractC3018b, Spliterator spliterator) {
        switch (this.f33280h) {
            case 0:
                return EnumC3037e3.SIZED.r(abstractC3018b.G()) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.c(abstractC3018b, spliterator);
            case 1:
                return EnumC3037e3.SIZED.r(abstractC3018b.G()) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.c(abstractC3018b, spliterator);
            case 2:
                return EnumC3037e3.SIZED.r(abstractC3018b.G()) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.c(abstractC3018b, spliterator);
            default:
                return EnumC3037e3.SIZED.r(abstractC3018b.G()) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.c(abstractC3018b, spliterator);
        }
    }

    @Override // j$.util.stream.AbstractC3134z0, j$.util.stream.K3
    public final int d() {
        switch (this.f33280h) {
            case 0:
                return EnumC3037e3.f33487r;
            case 1:
                return EnumC3037e3.f33487r;
            case 2:
                return EnumC3037e3.f33487r;
            default:
                return EnumC3037e3.f33487r;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, j$.util.stream.V1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, j$.util.stream.V1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, j$.util.stream.V1] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, j$.util.stream.V1] */
    @Override // j$.util.stream.AbstractC3134z0
    public final V1 f0() {
        switch (this.f33280h) {
            case 0:
                return new Object();
            case 1:
                return new Object();
            case 2:
                return new Object();
            default:
                return new Object();
        }
    }
}
