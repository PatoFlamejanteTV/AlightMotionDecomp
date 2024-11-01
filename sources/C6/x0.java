package C6;

import kotlin.jvm.internal.AbstractC3292y;
import z6.AbstractC4273a;

/* loaded from: classes5.dex */
public final class x0 extends j0 implements y6.b {

    /* renamed from: c, reason: collision with root package name */
    public static final x0 f1130c = new x0();

    private x0() {
        super(AbstractC4273a.r(Q5.A.f8770b));
    }

    protected int A(int[] collectionSize) {
        AbstractC3292y.i(collectionSize, "$this$collectionSize");
        return Q5.B.q(collectionSize);
    }

    protected int[] B() {
        return Q5.B.e(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1026p, C6.AbstractC1005a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m(B6.c decoder, int i8, w0 builder, boolean z8) {
        AbstractC3292y.i(decoder, "decoder");
        AbstractC3292y.i(builder, "builder");
        builder.e(Q5.A.b(decoder.g(a(), i8).n()));
    }

    protected w0 D(int[] toBuilder) {
        AbstractC3292y.i(toBuilder, "$this$toBuilder");
        return new w0(toBuilder, null);
    }

    protected void E(B6.d encoder, int[] content, int i8) {
        AbstractC3292y.i(encoder, "encoder");
        AbstractC3292y.i(content, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            encoder.r(a(), i9).B(Q5.B.n(content, i9));
        }
    }

    @Override // C6.AbstractC1005a
    public /* bridge */ /* synthetic */ int j(Object obj) {
        return A(((Q5.B) obj).y());
    }

    @Override // C6.AbstractC1005a
    public /* bridge */ /* synthetic */ Object p(Object obj) {
        return D(((Q5.B) obj).y());
    }

    @Override // C6.j0
    public /* bridge */ /* synthetic */ Object w() {
        return Q5.B.c(B());
    }

    @Override // C6.j0
    public /* bridge */ /* synthetic */ void z(B6.d dVar, Object obj, int i8) {
        E(dVar, ((Q5.B) obj).y(), i8);
    }
}
