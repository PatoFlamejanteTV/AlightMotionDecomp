package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.l0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3069l0 extends AbstractC3074m0 {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f33532l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC3069l0(AbstractC3018b abstractC3018b, int i8, int i9) {
        super(abstractC3018b, i8);
        this.f33532l = i9;
    }

    @Override // j$.util.stream.AbstractC3018b
    final boolean M() {
        switch (this.f33532l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.AbstractC3018b, j$.util.stream.InterfaceC3048h, j$.util.stream.G
    public final /* bridge */ /* synthetic */ InterfaceC3089p0 parallel() {
        switch (this.f33532l) {
            case 0:
                parallel();
                return this;
            default:
                parallel();
                return this;
        }
    }

    @Override // j$.util.stream.AbstractC3018b, j$.util.stream.InterfaceC3048h, j$.util.stream.G
    public final /* bridge */ /* synthetic */ InterfaceC3089p0 sequential() {
        switch (this.f33532l) {
            case 0:
                sequential();
                return this;
            default:
                sequential();
                return this;
        }
    }

    @Override // j$.util.stream.AbstractC3018b, j$.util.stream.InterfaceC3048h
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        switch (this.f33532l) {
            case 0:
                return spliterator();
            default:
                return spliterator();
        }
    }

    @Override // j$.util.stream.InterfaceC3048h
    public final InterfaceC3048h unordered() {
        switch (this.f33532l) {
            case 0:
                return !H() ? this : new C3129y(this, EnumC3037e3.f33487r, 4);
            default:
                return !H() ? this : new C3129y(this, EnumC3037e3.f33487r, 4);
        }
    }
}
