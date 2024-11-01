package C6;

import kotlin.jvm.internal.AbstractC3292y;
import z6.AbstractC4273a;

/* loaded from: classes5.dex */
public final class D0 extends j0 implements y6.b {

    /* renamed from: c, reason: collision with root package name */
    public static final D0 f1001c = new D0();

    private D0() {
        super(AbstractC4273a.t(Q5.F.f8781b));
    }

    protected int A(short[] collectionSize) {
        AbstractC3292y.i(collectionSize, "$this$collectionSize");
        return Q5.G.q(collectionSize);
    }

    protected short[] B() {
        return Q5.G.e(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1026p, C6.AbstractC1005a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m(B6.c decoder, int i8, C0 builder, boolean z8) {
        AbstractC3292y.i(decoder, "decoder");
        AbstractC3292y.i(builder, "builder");
        builder.e(Q5.F.b(decoder.g(a(), i8).F()));
    }

    protected C0 D(short[] toBuilder) {
        AbstractC3292y.i(toBuilder, "$this$toBuilder");
        return new C0(toBuilder, null);
    }

    protected void E(B6.d encoder, short[] content, int i8) {
        AbstractC3292y.i(encoder, "encoder");
        AbstractC3292y.i(content, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            encoder.r(a(), i9).i(Q5.G.n(content, i9));
        }
    }

    @Override // C6.AbstractC1005a
    public /* bridge */ /* synthetic */ int j(Object obj) {
        return A(((Q5.G) obj).y());
    }

    @Override // C6.AbstractC1005a
    public /* bridge */ /* synthetic */ Object p(Object obj) {
        return D(((Q5.G) obj).y());
    }

    @Override // C6.j0
    public /* bridge */ /* synthetic */ Object w() {
        return Q5.G.c(B());
    }

    @Override // C6.j0
    public /* bridge */ /* synthetic */ void z(B6.d dVar, Object obj, int i8) {
        E(dVar, ((Q5.G) obj).y(), i8);
    }
}
