package j$.util.stream;

import java.util.function.Supplier;

/* renamed from: j$.util.stream.q0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3094q0 implements Supplier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33564a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EnumC3122w0 f33565b;

    public /* synthetic */ C3094q0(EnumC3122w0 enumC3122w0, int i8) {
        this.f33564a = i8;
        this.f33565b = enumC3122w0;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f33564a) {
            case 0:
                return new AbstractC3118v0(this.f33565b);
            case 1:
                return new AbstractC3118v0(this.f33565b);
            default:
                return new AbstractC3118v0(this.f33565b);
        }
    }
}
