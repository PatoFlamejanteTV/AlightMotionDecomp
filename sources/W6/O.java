package W6;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class O extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    private final C1498y f10812a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f10813b = true;

    /* renamed from: c, reason: collision with root package name */
    private InputStream f10814c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public O(C1498y c1498y) {
        this.f10812a = c1498y;
    }

    private InterfaceC1490p a() {
        InterfaceC1476d b9 = this.f10812a.b();
        if (b9 == null) {
            return null;
        }
        if (b9 instanceof InterfaceC1490p) {
            return (InterfaceC1490p) b9;
        }
        throw new IOException("unknown object encountered: " + b9.getClass());
    }

    @Override // java.io.InputStream
    public int read() {
        InterfaceC1490p a9;
        if (this.f10814c == null) {
            if (!this.f10813b || (a9 = a()) == null) {
                return -1;
            }
            this.f10813b = false;
            this.f10814c = a9.c();
        }
        while (true) {
            int read = this.f10814c.read();
            if (read >= 0) {
                return read;
            }
            InterfaceC1490p a10 = a();
            if (a10 == null) {
                this.f10814c = null;
                return -1;
            }
            this.f10814c = a10.c();
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i8, int i9) {
        InterfaceC1490p a9;
        int i10 = 0;
        if (this.f10814c == null) {
            if (!this.f10813b || (a9 = a()) == null) {
                return -1;
            }
            this.f10813b = false;
            this.f10814c = a9.c();
        }
        while (true) {
            int read = this.f10814c.read(bArr, i8 + i10, i9 - i10);
            if (read >= 0) {
                i10 += read;
                if (i10 == i9) {
                    return i10;
                }
            } else {
                InterfaceC1490p a10 = a();
                if (a10 == null) {
                    this.f10814c = null;
                    if (i10 < 1) {
                        return -1;
                    }
                    return i10;
                }
                this.f10814c = a10.c();
            }
        }
    }
}
