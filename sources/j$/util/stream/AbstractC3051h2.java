package j$.util.stream;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.h2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3051h2 extends AbstractC3056i2 {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f33516l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC3051h2(AbstractC3018b abstractC3018b, int i8, int i9) {
        super(abstractC3018b, i8);
        this.f33516l = i9;
    }

    @Override // j$.util.stream.AbstractC3018b
    final boolean M() {
        switch (this.f33516l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.InterfaceC3048h
    public final InterfaceC3048h unordered() {
        switch (this.f33516l) {
            case 0:
                return !H() ? this : new AbstractC3051h2(this, EnumC3037e3.f33487r, 1);
            default:
                return !H() ? this : new AbstractC3051h2(this, EnumC3037e3.f33487r, 1);
        }
    }
}
