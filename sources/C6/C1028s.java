package C6;

import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.C3285q;
import z6.AbstractC4273a;

/* renamed from: C6.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1028s extends j0 implements y6.b {

    /* renamed from: c, reason: collision with root package name */
    public static final C1028s f1094c = new C1028s();

    private C1028s() {
        super(AbstractC4273a.y(C3285q.f34601a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1005a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public int j(double[] dArr) {
        AbstractC3292y.i(dArr, "<this>");
        return dArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.j0
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public double[] w() {
        return new double[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1026p, C6.AbstractC1005a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m(B6.c decoder, int i8, r builder, boolean z8) {
        AbstractC3292y.i(decoder, "decoder");
        AbstractC3292y.i(builder, "builder");
        builder.e(decoder.e(a(), i8));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1005a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public r p(double[] dArr) {
        AbstractC3292y.i(dArr, "<this>");
        return new r(dArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.j0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void z(B6.d encoder, double[] content, int i8) {
        AbstractC3292y.i(encoder, "encoder");
        AbstractC3292y.i(content, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            encoder.y(a(), i9, content[i9]);
        }
    }
}
