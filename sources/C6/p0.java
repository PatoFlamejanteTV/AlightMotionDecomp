package C6;

import kotlin.jvm.internal.AbstractC3292y;
import z6.AbstractC4273a;

/* loaded from: classes5.dex */
public final class p0 extends j0 implements y6.b {

    /* renamed from: c, reason: collision with root package name */
    public static final p0 f1087c = new p0();

    private p0() {
        super(AbstractC4273a.C(kotlin.jvm.internal.W.f34576a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1005a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public int j(short[] sArr) {
        AbstractC3292y.i(sArr, "<this>");
        return sArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.j0
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public short[] w() {
        return new short[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1026p, C6.AbstractC1005a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m(B6.c decoder, int i8, o0 builder, boolean z8) {
        AbstractC3292y.i(decoder, "decoder");
        AbstractC3292y.i(builder, "builder");
        builder.e(decoder.E(a(), i8));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1005a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public o0 p(short[] sArr) {
        AbstractC3292y.i(sArr, "<this>");
        return new o0(sArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.j0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void z(B6.d encoder, short[] content, int i8) {
        AbstractC3292y.i(encoder, "encoder");
        AbstractC3292y.i(content, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            encoder.E(a(), i9, content[i9]);
        }
    }
}
