package Q6;

import Q6.d;
import U6.C1449e;
import U6.InterfaceC1450f;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class j implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    private static final Logger f8989g = Logger.getLogger(e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1450f f8990a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f8991b;

    /* renamed from: c, reason: collision with root package name */
    private final C1449e f8992c;

    /* renamed from: d, reason: collision with root package name */
    private int f8993d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f8994e;

    /* renamed from: f, reason: collision with root package name */
    final d.b f8995f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(InterfaceC1450f interfaceC1450f, boolean z8) {
        this.f8990a = interfaceC1450f;
        this.f8991b = z8;
        C1449e c1449e = new C1449e();
        this.f8992c = c1449e;
        this.f8995f = new d.b(c1449e);
        this.f8993d = 16384;
    }

    private void B(int i8, long j8) {
        byte b9;
        while (j8 > 0) {
            int min = (int) Math.min(this.f8993d, j8);
            long j9 = min;
            j8 -= j9;
            if (j8 == 0) {
                b9 = 4;
            } else {
                b9 = 0;
            }
            i(i8, min, (byte) 9, b9);
            this.f8990a.f(this.f8992c, j9);
        }
    }

    private static void E(InterfaceC1450f interfaceC1450f, int i8) {
        interfaceC1450f.writeByte((i8 >>> 16) & 255);
        interfaceC1450f.writeByte((i8 >>> 8) & 255);
        interfaceC1450f.writeByte(i8 & 255);
    }

    public synchronized void a(m mVar) {
        try {
            if (!this.f8994e) {
                this.f8993d = mVar.f(this.f8993d);
                if (mVar.c() != -1) {
                    this.f8995f.e(mVar.c());
                }
                i(0, 0, (byte) 4, (byte) 1);
                this.f8990a.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void b() {
        try {
            if (!this.f8994e) {
                if (!this.f8991b) {
                    return;
                }
                Logger logger = f8989g;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(L6.c.o(">> CONNECTION %s", e.f8871a.n()));
                }
                this.f8990a.write(e.f8871a.O());
                this.f8990a.flush();
                return;
            }
            throw new IOException("closed");
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f8994e = true;
        this.f8990a.close();
    }

    public synchronized void flush() {
        if (!this.f8994e) {
            this.f8990a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void g(boolean z8, int i8, C1449e c1449e, int i9) {
        byte b9;
        if (!this.f8994e) {
            if (z8) {
                b9 = (byte) 1;
            } else {
                b9 = 0;
            }
            h(i8, b9, c1449e, i9);
        } else {
            throw new IOException("closed");
        }
    }

    void h(int i8, byte b9, C1449e c1449e, int i9) {
        i(i8, i9, (byte) 0, b9);
        if (i9 > 0) {
            this.f8990a.f(c1449e, i9);
        }
    }

    public void i(int i8, int i9, byte b9, byte b10) {
        Logger logger = f8989g;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(e.b(false, i8, i9, b9, b10));
        }
        int i10 = this.f8993d;
        if (i9 <= i10) {
            if ((Integer.MIN_VALUE & i8) == 0) {
                E(this.f8990a, i9);
                this.f8990a.writeByte(b9 & 255);
                this.f8990a.writeByte(b10 & 255);
                this.f8990a.writeInt(i8 & Integer.MAX_VALUE);
                return;
            }
            throw e.c("reserved bit set: %s", Integer.valueOf(i8));
        }
        throw e.c("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i10), Integer.valueOf(i9));
    }

    public synchronized void j(int i8, b bVar, byte[] bArr) {
        try {
            if (!this.f8994e) {
                if (bVar.f8841a != -1) {
                    i(0, bArr.length + 8, (byte) 7, (byte) 0);
                    this.f8990a.writeInt(i8);
                    this.f8990a.writeInt(bVar.f8841a);
                    if (bArr.length > 0) {
                        this.f8990a.write(bArr);
                    }
                    this.f8990a.flush();
                } else {
                    throw e.c("errorCode.httpCode == -1", new Object[0]);
                }
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    void k(boolean z8, int i8, List list) {
        byte b9;
        if (!this.f8994e) {
            this.f8995f.g(list);
            long E8 = this.f8992c.E();
            int min = (int) Math.min(this.f8993d, E8);
            long j8 = min;
            if (E8 == j8) {
                b9 = 4;
            } else {
                b9 = 0;
            }
            if (z8) {
                b9 = (byte) (b9 | 1);
            }
            i(i8, min, (byte) 1, b9);
            this.f8990a.f(this.f8992c, j8);
            if (E8 > j8) {
                B(i8, E8 - j8);
                return;
            }
            return;
        }
        throw new IOException("closed");
    }

    public int p() {
        return this.f8993d;
    }

    public synchronized void q(boolean z8, int i8, int i9) {
        if (!this.f8994e) {
            i(0, 8, (byte) 6, z8 ? (byte) 1 : (byte) 0);
            this.f8990a.writeInt(i8);
            this.f8990a.writeInt(i9);
            this.f8990a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void r(int i8, int i9, List list) {
        byte b9;
        if (!this.f8994e) {
            this.f8995f.g(list);
            long E8 = this.f8992c.E();
            int min = (int) Math.min(this.f8993d - 4, E8);
            long j8 = min;
            if (E8 == j8) {
                b9 = 4;
            } else {
                b9 = 0;
            }
            i(i8, min + 4, (byte) 5, b9);
            this.f8990a.writeInt(i9 & Integer.MAX_VALUE);
            this.f8990a.f(this.f8992c, j8);
            if (E8 > j8) {
                B(i8, E8 - j8);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void t(int i8, b bVar) {
        if (!this.f8994e) {
            if (bVar.f8841a != -1) {
                i(i8, 4, (byte) 3, (byte) 0);
                this.f8990a.writeInt(bVar.f8841a);
                this.f8990a.flush();
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void u(m mVar) {
        int i8;
        try {
            if (!this.f8994e) {
                i(0, mVar.j() * 6, (byte) 4, (byte) 0);
                for (int i9 = 0; i9 < 10; i9++) {
                    if (mVar.g(i9)) {
                        if (i9 == 4) {
                            i8 = 3;
                        } else if (i9 == 7) {
                            i8 = 4;
                        } else {
                            i8 = i9;
                        }
                        this.f8990a.writeShort(i8);
                        this.f8990a.writeInt(mVar.b(i9));
                    }
                }
                this.f8990a.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void v(boolean z8, int i8, int i9, List list) {
        if (!this.f8994e) {
            k(z8, i8, list);
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void z(int i8, long j8) {
        if (!this.f8994e) {
            if (j8 != 0 && j8 <= 2147483647L) {
                i(i8, 4, (byte) 8, (byte) 0);
                this.f8990a.writeInt((int) j8);
                this.f8990a.flush();
            } else {
                throw e.c("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j8));
            }
        } else {
            throw new IOException("closed");
        }
    }
}
