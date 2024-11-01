package C6;

import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.C3280l;
import z6.AbstractC4273a;

/* renamed from: C6.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1024n extends j0 implements y6.b {

    /* renamed from: c, reason: collision with root package name */
    public static final C1024n f1081c = new C1024n();

    private C1024n() {
        super(AbstractC4273a.x(C3280l.f34592a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1005a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public int j(char[] cArr) {
        AbstractC3292y.i(cArr, "<this>");
        return cArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.j0
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public char[] w() {
        return new char[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1026p, C6.AbstractC1005a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m(B6.c decoder, int i8, C1023m builder, boolean z8) {
        AbstractC3292y.i(decoder, "decoder");
        AbstractC3292y.i(builder, "builder");
        builder.e(decoder.j(a(), i8));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1005a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public C1023m p(char[] cArr) {
        AbstractC3292y.i(cArr, "<this>");
        return new C1023m(cArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.j0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void z(B6.d encoder, char[] content, int i8) {
        AbstractC3292y.i(encoder, "encoder");
        AbstractC3292y.i(content, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            encoder.f(a(), i9, content[i9]);
        }
    }
}
