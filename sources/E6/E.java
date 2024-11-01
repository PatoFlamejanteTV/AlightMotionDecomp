package E6;

import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class E extends AbstractC1045c {

    /* renamed from: f, reason: collision with root package name */
    private final D6.i f1996f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(D6.a json, D6.i value) {
        super(json, value, null);
        AbstractC3292y.i(json, "json");
        AbstractC3292y.i(value, "value");
        this.f1996f = value;
        X("primitive");
    }

    @Override // E6.AbstractC1045c
    protected D6.i e0(String tag) {
        AbstractC3292y.i(tag, "tag");
        if (tag == "primitive") {
            return s0();
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag".toString());
    }

    @Override // E6.AbstractC1045c
    public D6.i s0() {
        return this.f1996f;
    }

    @Override // B6.c
    public int y(A6.f descriptor) {
        AbstractC3292y.i(descriptor, "descriptor");
        return 0;
    }
}
