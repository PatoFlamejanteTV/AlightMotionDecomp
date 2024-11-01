package N;

import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
abstract class B extends z {

    /* renamed from: k, reason: collision with root package name */
    private static final WeakReference f6318k = new WeakReference(null);

    /* renamed from: b, reason: collision with root package name */
    private WeakReference f6319b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public B(byte[] bArr) {
        super(bArr);
        this.f6319b = f6318k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // N.z
    public final byte[] s0() {
        byte[] bArr;
        synchronized (this) {
            try {
                bArr = (byte[]) this.f6319b.get();
                if (bArr == null) {
                    bArr = t0();
                    this.f6319b = new WeakReference(bArr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArr;
    }

    protected abstract byte[] t0();
}
