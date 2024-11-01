package J0;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: J0.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C1252i {

    /* renamed from: b, reason: collision with root package name */
    private static final String f3909b = AbstractC1253j.z(UUID.randomUUID().toString() + System.currentTimeMillis());

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicLong f3910c = new AtomicLong(0);

    /* renamed from: a, reason: collision with root package name */
    private final String f3911a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1252i() {
        byte[] bArr = new byte[10];
        f(bArr);
        e(bArr);
        d(bArr);
        String t8 = AbstractC1253j.t(bArr);
        Locale locale = Locale.US;
        this.f3911a = String.format(locale, "%s%s%s%s", t8.substring(0, 12), t8.substring(12, 16), t8.subSequence(16, 20), f3909b.substring(0, 12)).toUpperCase(locale);
    }

    private static byte[] a(long j8) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) j8);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    private static byte[] b(long j8) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) j8);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    private void d(byte[] bArr) {
        byte[] b9 = b(Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = b9[0];
        bArr[9] = b9[1];
    }

    private void e(byte[] bArr) {
        byte[] b9 = b(f3910c.incrementAndGet());
        bArr[6] = b9[0];
        bArr[7] = b9[1];
    }

    private void f(byte[] bArr) {
        long time = new Date().getTime();
        byte[] a9 = a(time / 1000);
        bArr[0] = a9[0];
        bArr[1] = a9[1];
        bArr[2] = a9[2];
        bArr[3] = a9[3];
        byte[] b9 = b(time % 1000);
        bArr[4] = b9[0];
        bArr[5] = b9[1];
    }

    public String c() {
        return this.f3911a;
    }

    public String toString() {
        return this.f3911a;
    }
}
