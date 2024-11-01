package y7;

/* loaded from: classes5.dex */
final class n {

    /* renamed from: a, reason: collision with root package name */
    private final byte[][] f41243a;

    /* JADX INFO: Access modifiers changed from: protected */
    public n(m mVar, byte[][] bArr) {
        if (mVar != null) {
            if (bArr != null) {
                if (!AbstractC4249A.k(bArr)) {
                    if (bArr.length == mVar.a()) {
                        for (byte[] bArr2 : bArr) {
                            if (bArr2.length != mVar.c()) {
                                throw new IllegalArgumentException("wrong publicKey format");
                            }
                        }
                        this.f41243a = AbstractC4249A.d(bArr);
                        return;
                    }
                    throw new IllegalArgumentException("wrong publicKey size");
                }
                throw new NullPointerException("publicKey byte array == null");
            }
            throw new NullPointerException("publicKey == null");
        }
        throw new NullPointerException("params == null");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public byte[][] a() {
        return AbstractC4249A.d(this.f41243a);
    }
}
