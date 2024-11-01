package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class C extends D {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f33240l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C(AbstractC3018b abstractC3018b, int i8, int i9) {
        super(abstractC3018b, i8);
        this.f33240l = i9;
    }

    @Override // j$.util.stream.AbstractC3018b
    final boolean M() {
        switch (this.f33240l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.AbstractC3018b, j$.util.stream.InterfaceC3048h, j$.util.stream.G
    public final /* bridge */ /* synthetic */ G parallel() {
        switch (this.f33240l) {
            case 0:
                parallel();
                return this;
            default:
                parallel();
                return this;
        }
    }

    @Override // j$.util.stream.AbstractC3018b, j$.util.stream.InterfaceC3048h, j$.util.stream.G
    public final /* bridge */ /* synthetic */ G sequential() {
        switch (this.f33240l) {
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
        switch (this.f33240l) {
            case 0:
                return spliterator();
            default:
                return spliterator();
        }
    }

    @Override // j$.util.stream.InterfaceC3048h
    public final InterfaceC3048h unordered() {
        switch (this.f33240l) {
            case 0:
                return !H() ? this : new A(this, EnumC3037e3.f33487r, 0);
            default:
                return !H() ? this : new A(this, EnumC3037e3.f33487r, 0);
        }
    }
}
