package E6;

import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class I extends AbstractC1045c {

    /* renamed from: f, reason: collision with root package name */
    private final D6.b f2004f;

    /* renamed from: g, reason: collision with root package name */
    private final int f2005g;

    /* renamed from: h, reason: collision with root package name */
    private int f2006h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(D6.a json, D6.b value) {
        super(json, value, null);
        AbstractC3292y.i(json, "json");
        AbstractC3292y.i(value, "value");
        this.f2004f = value;
        this.f2005g = s0().size();
        this.f2006h = -1;
    }

    @Override // C6.V
    protected String a0(A6.f descriptor, int i8) {
        AbstractC3292y.i(descriptor, "descriptor");
        return String.valueOf(i8);
    }

    @Override // E6.AbstractC1045c
    protected D6.i e0(String tag) {
        AbstractC3292y.i(tag, "tag");
        return s0().get(Integer.parseInt(tag));
    }

    @Override // E6.AbstractC1045c
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public D6.b s0() {
        return this.f2004f;
    }

    @Override // B6.c
    public int y(A6.f descriptor) {
        AbstractC3292y.i(descriptor, "descriptor");
        int i8 = this.f2006h;
        if (i8 < this.f2005g - 1) {
            int i9 = i8 + 1;
            this.f2006h = i9;
            return i9;
        }
        return -1;
    }
}
