package U6;

import java.io.RandomAccessFile;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class r extends AbstractC1453i {

    /* renamed from: e, reason: collision with root package name */
    private final RandomAccessFile f10262e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(boolean z8, RandomAccessFile randomAccessFile) {
        super(z8);
        AbstractC3292y.i(randomAccessFile, "randomAccessFile");
        this.f10262e = randomAccessFile;
    }

    @Override // U6.AbstractC1453i
    protected synchronized void k() {
        this.f10262e.close();
    }

    @Override // U6.AbstractC1453i
    protected synchronized void p() {
        this.f10262e.getFD().sync();
    }

    @Override // U6.AbstractC1453i
    protected synchronized int q(long j8, byte[] array, int i8, int i9) {
        AbstractC3292y.i(array, "array");
        this.f10262e.seek(j8);
        int i10 = 0;
        while (true) {
            if (i10 >= i9) {
                break;
            }
            int read = this.f10262e.read(array, i8, i9 - i10);
            if (read == -1) {
                if (i10 == 0) {
                    return -1;
                }
            } else {
                i10 += read;
            }
        }
        return i10;
    }

    @Override // U6.AbstractC1453i
    protected synchronized long r() {
        return this.f10262e.length();
    }

    @Override // U6.AbstractC1453i
    protected synchronized void t(long j8, byte[] array, int i8, int i9) {
        AbstractC3292y.i(array, "array");
        this.f10262e.seek(j8);
        this.f10262e.write(array, i8, i9);
    }
}
