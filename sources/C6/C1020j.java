package C6;

import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.C3278j;
import z6.AbstractC4273a;

/* renamed from: C6.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1020j extends j0 implements y6.b {

    /* renamed from: c, reason: collision with root package name */
    public static final C1020j f1069c = new C1020j();

    private C1020j() {
        super(AbstractC4273a.w(C3278j.f34590a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1005a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public int j(byte[] bArr) {
        AbstractC3292y.i(bArr, "<this>");
        return bArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.j0
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public byte[] w() {
        return new byte[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1026p, C6.AbstractC1005a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m(B6.c decoder, int i8, C1019i builder, boolean z8) {
        AbstractC3292y.i(decoder, "decoder");
        AbstractC3292y.i(builder, "builder");
        builder.e(decoder.C(a(), i8));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1005a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public C1019i p(byte[] bArr) {
        AbstractC3292y.i(bArr, "<this>");
        return new C1019i(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.j0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void z(B6.d encoder, byte[] content, int i8) {
        AbstractC3292y.i(encoder, "encoder");
        AbstractC3292y.i(content, "content");
        for (int i9 = 0; i9 < i8; i9++) {
            encoder.m(a(), i9, content[i9]);
        }
    }
}
