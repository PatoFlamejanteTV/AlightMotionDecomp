package j$.util.stream;

import j$.util.Spliterator;

/* renamed from: j$.util.stream.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3088p extends AbstractC3076m2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33554b = 2;

    /* renamed from: c, reason: collision with root package name */
    boolean f33555c;

    /* renamed from: d, reason: collision with root package name */
    Object f33556d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3088p(O3 o32, InterfaceC3096q2 interfaceC3096q2) {
        super(interfaceC3096q2);
        this.f33556d = o32;
        this.f33555c = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3088p(C3041f2 c3041f2, InterfaceC3096q2 interfaceC3096q2) {
        super(interfaceC3096q2);
        this.f33556d = c3041f2;
    }

    public /* synthetic */ C3088p(InterfaceC3096q2 interfaceC3096q2) {
        super(interfaceC3096q2);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f33554b) {
            case 0:
                InterfaceC3096q2 interfaceC3096q2 = this.f33538a;
                if (obj != null) {
                    Object obj2 = this.f33556d;
                    if (obj2 != null && obj.equals(obj2)) {
                        return;
                    }
                } else {
                    if (this.f33555c) {
                        return;
                    }
                    this.f33555c = true;
                    obj = null;
                }
                this.f33556d = obj;
                interfaceC3096q2.accept((InterfaceC3096q2) obj);
                return;
            case 1:
                Stream stream = (Stream) ((C3041f2) this.f33556d).f33500n.apply(obj);
                if (stream != null) {
                    try {
                        boolean z8 = this.f33555c;
                        InterfaceC3096q2 interfaceC3096q22 = this.f33538a;
                        if (z8) {
                            Spliterator spliterator = ((Stream) stream.sequential()).spliterator();
                            while (!interfaceC3096q22.m() && spliterator.tryAdvance(interfaceC3096q22)) {
                            }
                        } else {
                            ((Stream) stream.sequential()).forEach(interfaceC3096q22);
                        }
                    } catch (Throwable th) {
                        try {
                            stream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (stream != null) {
                    stream.close();
                    return;
                }
                return;
            default:
                if (this.f33555c) {
                    boolean test = ((O3) this.f33556d).f33337m.test(obj);
                    this.f33555c = test;
                    if (test) {
                        this.f33538a.accept((InterfaceC3096q2) obj);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.AbstractC3076m2, j$.util.stream.InterfaceC3096q2
    public void j() {
        switch (this.f33554b) {
            case 0:
                this.f33555c = false;
                this.f33556d = null;
                this.f33538a.j();
                return;
            default:
                super.j();
                return;
        }
    }

    @Override // j$.util.stream.AbstractC3076m2, j$.util.stream.InterfaceC3096q2
    public final void k(long j8) {
        switch (this.f33554b) {
            case 0:
                this.f33555c = false;
                this.f33556d = null;
                this.f33538a.k(-1L);
                return;
            case 1:
                this.f33538a.k(-1L);
                return;
            default:
                this.f33538a.k(-1L);
                return;
        }
    }

    @Override // j$.util.stream.AbstractC3076m2, j$.util.stream.InterfaceC3096q2
    public boolean m() {
        switch (this.f33554b) {
            case 1:
                this.f33555c = true;
                return this.f33538a.m();
            case 2:
                return !this.f33555c || this.f33538a.m();
            default:
                return super.m();
        }
    }
}
