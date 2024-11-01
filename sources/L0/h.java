package L0;

import J0.AbstractC1253j;
import L0.g;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;

/* loaded from: classes3.dex */
class h implements c {

    /* renamed from: d, reason: collision with root package name */
    private static final Charset f5258d = Charset.forName(C.UTF8_NAME);

    /* renamed from: a, reason: collision with root package name */
    private final File f5259a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5260b;

    /* renamed from: c, reason: collision with root package name */
    private g f5261c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements g.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f5262a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int[] f5263b;

        a(byte[] bArr, int[] iArr) {
            this.f5262a = bArr;
            this.f5263b = iArr;
        }

        @Override // L0.g.d
        public void a(InputStream inputStream, int i8) {
            try {
                inputStream.read(this.f5262a, this.f5263b[0], i8);
                int[] iArr = this.f5263b;
                iArr[0] = iArr[0] + i8;
            } finally {
                inputStream.close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f5265a;

        /* renamed from: b, reason: collision with root package name */
        public final int f5266b;

        b(byte[] bArr, int i8) {
            this.f5265a = bArr;
            this.f5266b = i8;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(File file, int i8) {
        this.f5259a = file;
        this.f5260b = i8;
    }

    private void f(long j8, String str) {
        if (this.f5261c == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            int i8 = this.f5260b / 4;
            if (str.length() > i8) {
                str = "..." + str.substring(str.length() - i8);
            }
            this.f5261c.i(String.format(Locale.US, "%d %s%n", Long.valueOf(j8), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f5258d));
            while (!this.f5261c.t() && this.f5261c.K() > this.f5260b) {
                this.f5261c.G();
            }
        } catch (IOException e8) {
            G0.g.f().e("There was a problem writing to the Crashlytics log.", e8);
        }
    }

    private b g() {
        if (!this.f5259a.exists()) {
            return null;
        }
        h();
        g gVar = this.f5261c;
        if (gVar == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[gVar.K()];
        try {
            this.f5261c.q(new a(bArr, iArr));
        } catch (IOException e8) {
            G0.g.f().e("A problem occurred while reading the Crashlytics log file.", e8);
        }
        return new b(bArr, iArr[0]);
    }

    private void h() {
        if (this.f5261c == null) {
            try {
                this.f5261c = new g(this.f5259a);
            } catch (IOException e8) {
                G0.g.f().e("Could not open log file: " + this.f5259a, e8);
            }
        }
    }

    @Override // L0.c
    public void a() {
        AbstractC1253j.f(this.f5261c, "There was a problem closing the Crashlytics log file.");
        this.f5261c = null;
    }

    @Override // L0.c
    public String b() {
        byte[] c8 = c();
        if (c8 != null) {
            return new String(c8, f5258d);
        }
        return null;
    }

    @Override // L0.c
    public byte[] c() {
        b g8 = g();
        if (g8 == null) {
            return null;
        }
        int i8 = g8.f5266b;
        byte[] bArr = new byte[i8];
        System.arraycopy(g8.f5265a, 0, bArr, 0, i8);
        return bArr;
    }

    @Override // L0.c
    public void d() {
        a();
        this.f5259a.delete();
    }

    @Override // L0.c
    public void e(long j8, String str) {
        h();
        f(j8, str);
    }
}
