package C6;

import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.C3277i;
import z6.AbstractC4273a;

/* renamed from: C6.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1017g extends j0 implements y6.b {

    /* renamed from: c, reason: collision with root package name */
    public static final C1017g f1062c = new C1017g();

    private C1017g() {
        super(AbstractC4273a.v(C3277i.f34589a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1005a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public int j(boolean[] zArr) {
        AbstractC3292y.i(zArr, "<this>");
        return zArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.j0
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean[] w() {
        return new boolean[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1026p, C6.AbstractC1005a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m(B6.c decoder, int i8, C1015f builder, boolean z8) {
        AbstractC3292y.i(decoder, "decoder");
        AbstractC3292y.i(builder, "builder");
        builder.e(decoder.m(a(), i8));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1005a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public C1015f p(boolean[] zArr) {
        AbstractC3292y.i(zArr, "<this>");
        return new C1015f(zArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.j0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void z(B6.d encoder, boolean[] content, int i8) {
        AbstractC3292y.i(encoder, "encoder");
        AbstractC3292y.i(content, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            encoder.o(a(), i9, content[i9]);
        }
    }
}
