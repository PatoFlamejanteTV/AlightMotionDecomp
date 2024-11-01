package W6;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;

/* renamed from: W6.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1491q {

    /* renamed from: a, reason: collision with root package name */
    private OutputStream f10869a;

    public C1491q(OutputStream outputStream) {
        this.f10869a = outputStream;
    }

    public static C1491q a(OutputStream outputStream) {
        return new C1491q(outputStream);
    }

    public static C1491q b(OutputStream outputStream, String str) {
        if (str.equals("DER")) {
            return new C1475c0(outputStream);
        }
        if (str.equals("DL")) {
            return new q0(outputStream);
        }
        return new C1491q(outputStream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1475c0 d() {
        return new C1475c0(this.f10869a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1491q e() {
        return new q0(this.f10869a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(int i8) {
        this.f10869a.write(i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(byte[] bArr, int i8, int i9) {
        this.f10869a.write(bArr, i8, i9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(Enumeration enumeration) {
        while (enumeration.hasMoreElements()) {
            u(((InterfaceC1476d) enumeration.nextElement()).d(), true);
        }
    }

    final void i(InterfaceC1476d[] interfaceC1476dArr) {
        for (InterfaceC1476d interfaceC1476d : interfaceC1476dArr) {
            u(interfaceC1476d.d(), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(boolean z8, int i8, byte b9) {
        if (z8) {
            f(i8);
        }
        r(1);
        f(b9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(boolean z8, int i8, byte b9, byte[] bArr) {
        if (z8) {
            f(i8);
        }
        r(bArr.length + 1);
        f(b9);
        g(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(boolean z8, int i8, byte b9, byte[] bArr, int i9, int i10, byte b10) {
        if (z8) {
            f(i8);
        }
        r(i10 + 2);
        f(b9);
        g(bArr, i9, i10);
        f(b10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(boolean z8, int i8, int i9, byte[] bArr) {
        v(z8, i8, i9);
        r(bArr.length);
        g(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(boolean z8, int i8, byte[] bArr) {
        if (z8) {
            f(i8);
        }
        r(bArr.length);
        g(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(boolean z8, int i8, int i9, byte[] bArr) {
        v(z8, i8, i9);
        f(128);
        g(bArr, 0, bArr.length);
        f(0);
        f(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p(boolean z8, int i8, Enumeration enumeration) {
        if (z8) {
            f(i8);
        }
        f(128);
        h(enumeration);
        f(0);
        f(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q(boolean z8, int i8, InterfaceC1476d[] interfaceC1476dArr) {
        if (z8) {
            f(i8);
        }
        f(128);
        i(interfaceC1476dArr);
        f(0);
        f(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r(int i8) {
        if (i8 > 127) {
            int i9 = i8;
            int i10 = 1;
            while (true) {
                i9 >>>= 8;
                if (i9 == 0) {
                    break;
                } else {
                    i10++;
                }
            }
            f((byte) (i10 | 128));
            for (int i11 = (i10 - 1) * 8; i11 >= 0; i11 -= 8) {
                f((byte) (i8 >> i11));
            }
            return;
        }
        f((byte) i8);
    }

    public void s(InterfaceC1476d interfaceC1476d) {
        if (interfaceC1476d != null) {
            u(interfaceC1476d.d(), true);
            c();
            return;
        }
        throw new IOException("null object detected");
    }

    public void t(AbstractC1492s abstractC1492s) {
        if (abstractC1492s != null) {
            u(abstractC1492s, true);
            c();
            return;
        }
        throw new IOException("null object detected");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(AbstractC1492s abstractC1492s, boolean z8) {
        abstractC1492s.m(this, z8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void v(boolean z8, int i8, int i9) {
        if (!z8) {
            return;
        }
        if (i9 < 31) {
            f(i8 | i9);
            return;
        }
        f(31 | i8);
        if (i9 < 128) {
            f(i9);
            return;
        }
        byte[] bArr = new byte[5];
        int i10 = 4;
        bArr[4] = (byte) (i9 & ModuleDescriptor.MODULE_VERSION);
        do {
            i9 >>= 7;
            i10--;
            bArr[i10] = (byte) ((i9 & ModuleDescriptor.MODULE_VERSION) | 128);
        } while (i9 > 127);
        g(bArr, i10, 5 - i10);
    }

    void c() {
    }
}
