package C6;

import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.C3291x;
import z6.AbstractC4273a;

/* loaded from: classes5.dex */
public final class G extends j0 implements y6.b {

    /* renamed from: c, reason: collision with root package name */
    public static final G f1009c = new G();

    private G() {
        super(AbstractC4273a.A(C3291x.f34603a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1005a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public int j(int[] iArr) {
        AbstractC3292y.i(iArr, "<this>");
        return iArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.j0
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public int[] w() {
        return new int[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1026p, C6.AbstractC1005a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m(B6.c decoder, int i8, F builder, boolean z8) {
        AbstractC3292y.i(decoder, "decoder");
        AbstractC3292y.i(builder, "builder");
        builder.e(decoder.u(a(), i8));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1005a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public F p(int[] iArr) {
        AbstractC3292y.i(iArr, "<this>");
        return new F(iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.j0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void z(B6.d encoder, int[] content, int i8) {
        AbstractC3292y.i(encoder, "encoder");
        AbstractC3292y.i(content, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            encoder.u(a(), i9, content[i9]);
        }
    }
}
