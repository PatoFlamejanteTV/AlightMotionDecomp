package C6;

import kotlin.jvm.internal.AbstractC3292y;
import z6.AbstractC4273a;

/* loaded from: classes5.dex */
public final class A extends j0 implements y6.b {

    /* renamed from: c, reason: collision with root package name */
    public static final A f992c = new A();

    private A() {
        super(AbstractC4273a.z(kotlin.jvm.internal.r.f34602a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1005a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public int j(float[] fArr) {
        AbstractC3292y.i(fArr, "<this>");
        return fArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.j0
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public float[] w() {
        return new float[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1026p, C6.AbstractC1005a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m(B6.c decoder, int i8, C1035z builder, boolean z8) {
        AbstractC3292y.i(decoder, "decoder");
        AbstractC3292y.i(builder, "builder");
        builder.e(decoder.B(a(), i8));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1005a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public C1035z p(float[] fArr) {
        AbstractC3292y.i(fArr, "<this>");
        return new C1035z(fArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.j0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void z(B6.d encoder, float[] content, int i8) {
        AbstractC3292y.i(encoder, "encoder");
        AbstractC3292y.i(content, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            encoder.g(a(), i9, content[i9]);
        }
    }
}
