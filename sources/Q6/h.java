package Q6;

import Q6.d;
import U6.C1449e;
import U6.C1452h;
import U6.InterfaceC1451g;
import U6.Z;
import U6.a0;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class h implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    static final Logger f8955e = Logger.getLogger(e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1451g f8956a;

    /* renamed from: b, reason: collision with root package name */
    private final a f8957b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f8958c;

    /* renamed from: d, reason: collision with root package name */
    final d.a f8959d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public interface b {
        void a(boolean z8, int i8, InterfaceC1451g interfaceC1451g, int i9);

        void ackSettings();

        void b(int i8, Q6.b bVar);

        void c(boolean z8, m mVar);

        void d(int i8, Q6.b bVar, C1452h c1452h);

        void headers(boolean z8, int i8, int i9, List list);

        void ping(boolean z8, int i8, int i9);

        void priority(int i8, int i9, int i10, boolean z8);

        void pushPromise(int i8, int i9, List list);

        void windowUpdate(int i8, long j8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(InterfaceC1451g interfaceC1451g, boolean z8) {
        this.f8956a = interfaceC1451g;
        this.f8958c = z8;
        a aVar = new a(interfaceC1451g);
        this.f8957b = aVar;
        this.f8959d = new d.a(4096, aVar);
    }

    private void B(b bVar, int i8, byte b9, int i9) {
        if (i8 == 4) {
            long readInt = this.f8956a.readInt() & 2147483647L;
            if (readInt != 0) {
                bVar.windowUpdate(i9, readInt);
                return;
            }
            throw e.d("windowSizeIncrement was 0", Long.valueOf(readInt));
        }
        throw e.d("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i8));
    }

    static int a(int i8, byte b9, short s8) {
        if ((b9 & 8) != 0) {
            i8--;
        }
        if (s8 <= i8) {
            return (short) (i8 - s8);
        }
        throw e.d("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s8), Integer.valueOf(i8));
    }

    private void h(b bVar, int i8, byte b9, int i9) {
        boolean z8;
        short s8 = 0;
        if (i9 != 0) {
            if ((b9 & 1) != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if ((b9 & 32) == 0) {
                if ((b9 & 8) != 0) {
                    s8 = (short) (this.f8956a.readByte() & 255);
                }
                bVar.a(z8, i9, this.f8956a, a(i8, b9, s8));
                this.f8956a.skip(s8);
                return;
            }
            throw e.d("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }
        throw e.d("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
    }

    private void i(b bVar, int i8, byte b9, int i9) {
        if (i8 >= 8) {
            if (i9 == 0) {
                int readInt = this.f8956a.readInt();
                int readInt2 = this.f8956a.readInt();
                int i10 = i8 - 8;
                Q6.b a9 = Q6.b.a(readInt2);
                if (a9 != null) {
                    C1452h c1452h = C1452h.f10222e;
                    if (i10 > 0) {
                        c1452h = this.f8956a.readByteString(i10);
                    }
                    bVar.d(readInt, a9, c1452h);
                    return;
                }
                throw e.d("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
            }
            throw e.d("TYPE_GOAWAY streamId != 0", new Object[0]);
        }
        throw e.d("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i8));
    }

    private List j(int i8, short s8, byte b9, int i9) {
        a aVar = this.f8957b;
        aVar.f8964e = i8;
        aVar.f8961b = i8;
        aVar.f8965f = s8;
        aVar.f8962c = b9;
        aVar.f8963d = i9;
        this.f8959d.k();
        return this.f8959d.e();
    }

    private void k(b bVar, int i8, byte b9, int i9) {
        boolean z8;
        short s8 = 0;
        if (i9 != 0) {
            if ((b9 & 1) != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if ((b9 & 8) != 0) {
                s8 = (short) (this.f8956a.readByte() & 255);
            }
            if ((b9 & 32) != 0) {
                r(bVar, i9);
                i8 -= 5;
            }
            bVar.headers(z8, i9, -1, j(a(i8, b9, s8), s8, b9, i9));
            return;
        }
        throw e.d("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
    }

    static int p(InterfaceC1451g interfaceC1451g) {
        return (interfaceC1451g.readByte() & 255) | ((interfaceC1451g.readByte() & 255) << 16) | ((interfaceC1451g.readByte() & 255) << 8);
    }

    private void q(b bVar, int i8, byte b9, int i9) {
        boolean z8 = true;
        if (i8 == 8) {
            if (i9 == 0) {
                int readInt = this.f8956a.readInt();
                int readInt2 = this.f8956a.readInt();
                if ((b9 & 1) == 0) {
                    z8 = false;
                }
                bVar.ping(z8, readInt, readInt2);
                return;
            }
            throw e.d("TYPE_PING streamId != 0", new Object[0]);
        }
        throw e.d("TYPE_PING length != 8: %s", Integer.valueOf(i8));
    }

    private void r(b bVar, int i8) {
        boolean z8;
        int readInt = this.f8956a.readInt();
        if ((Integer.MIN_VALUE & readInt) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        bVar.priority(i8, readInt & Integer.MAX_VALUE, (this.f8956a.readByte() & 255) + 1, z8);
    }

    private void t(b bVar, int i8, byte b9, int i9) {
        if (i8 == 5) {
            if (i9 != 0) {
                r(bVar, i9);
                return;
            }
            throw e.d("TYPE_PRIORITY streamId == 0", new Object[0]);
        }
        throw e.d("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i8));
    }

    private void u(b bVar, int i8, byte b9, int i9) {
        short s8 = 0;
        if (i9 != 0) {
            if ((b9 & 8) != 0) {
                s8 = (short) (this.f8956a.readByte() & 255);
            }
            bVar.pushPromise(i9, this.f8956a.readInt() & Integer.MAX_VALUE, j(a(i8 - 4, b9, s8), s8, b9, i9));
            return;
        }
        throw e.d("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
    }

    private void v(b bVar, int i8, byte b9, int i9) {
        if (i8 == 4) {
            if (i9 != 0) {
                int readInt = this.f8956a.readInt();
                Q6.b a9 = Q6.b.a(readInt);
                if (a9 != null) {
                    bVar.b(i9, a9);
                    return;
                }
                throw e.d("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
            }
            throw e.d("TYPE_RST_STREAM streamId == 0", new Object[0]);
        }
        throw e.d("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i8));
    }

    private void z(b bVar, int i8, byte b9, int i9) {
        if (i9 == 0) {
            if ((b9 & 1) != 0) {
                if (i8 == 0) {
                    bVar.ackSettings();
                    return;
                }
                throw e.d("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            }
            if (i8 % 6 == 0) {
                m mVar = new m();
                for (int i10 = 0; i10 < i8; i10 += 6) {
                    int readShort = this.f8956a.readShort() & 65535;
                    int readInt = this.f8956a.readInt();
                    if (readShort != 2) {
                        if (readShort != 3) {
                            if (readShort != 4) {
                                if (readShort == 5 && (readInt < 16384 || readInt > 16777215)) {
                                    throw e.d("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                                }
                            } else if (readInt >= 0) {
                                readShort = 7;
                            } else {
                                throw e.d("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                            }
                        } else {
                            readShort = 4;
                        }
                    } else if (readInt != 0 && readInt != 1) {
                        throw e.d("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                    }
                    mVar.i(readShort, readInt);
                }
                bVar.c(false, mVar);
                return;
            }
            throw e.d("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i8));
        }
        throw e.d("TYPE_SETTINGS streamId != 0", new Object[0]);
    }

    public boolean b(boolean z8, b bVar) {
        try {
            this.f8956a.require(9L);
            int p8 = p(this.f8956a);
            if (p8 >= 0 && p8 <= 16384) {
                byte readByte = (byte) (this.f8956a.readByte() & 255);
                if (z8 && readByte != 4) {
                    throw e.d("Expected a SETTINGS frame but was %s", Byte.valueOf(readByte));
                }
                byte readByte2 = (byte) (this.f8956a.readByte() & 255);
                int readInt = this.f8956a.readInt() & Integer.MAX_VALUE;
                Logger logger = f8955e;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(e.b(true, readInt, p8, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        h(bVar, p8, readByte2, readInt);
                        return true;
                    case 1:
                        k(bVar, p8, readByte2, readInt);
                        return true;
                    case 2:
                        t(bVar, p8, readByte2, readInt);
                        return true;
                    case 3:
                        v(bVar, p8, readByte2, readInt);
                        return true;
                    case 4:
                        z(bVar, p8, readByte2, readInt);
                        return true;
                    case 5:
                        u(bVar, p8, readByte2, readInt);
                        return true;
                    case 6:
                        q(bVar, p8, readByte2, readInt);
                        return true;
                    case 7:
                        i(bVar, p8, readByte2, readInt);
                        return true;
                    case 8:
                        B(bVar, p8, readByte2, readInt);
                        return true;
                    default:
                        this.f8956a.skip(p8);
                        return true;
                }
            }
            throw e.d("FRAME_SIZE_ERROR: %s", Integer.valueOf(p8));
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f8956a.close();
    }

    public void g(b bVar) {
        if (this.f8958c) {
            if (!b(true, bVar)) {
                throw e.d("Required SETTINGS preface not received", new Object[0]);
            }
            return;
        }
        InterfaceC1451g interfaceC1451g = this.f8956a;
        C1452h c1452h = e.f8871a;
        C1452h readByteString = interfaceC1451g.readByteString(c1452h.J());
        Logger logger = f8955e;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(L6.c.o("<< CONNECTION %s", readByteString.n()));
        }
        if (c1452h.equals(readByteString)) {
        } else {
            throw e.d("Expected a connection header but was %s", readByteString.P());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a implements Z {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC1451g f8960a;

        /* renamed from: b, reason: collision with root package name */
        int f8961b;

        /* renamed from: c, reason: collision with root package name */
        byte f8962c;

        /* renamed from: d, reason: collision with root package name */
        int f8963d;

        /* renamed from: e, reason: collision with root package name */
        int f8964e;

        /* renamed from: f, reason: collision with root package name */
        short f8965f;

        a(InterfaceC1451g interfaceC1451g) {
            this.f8960a = interfaceC1451g;
        }

        private void a() {
            int i8 = this.f8963d;
            int p8 = h.p(this.f8960a);
            this.f8964e = p8;
            this.f8961b = p8;
            byte readByte = (byte) (this.f8960a.readByte() & 255);
            this.f8962c = (byte) (this.f8960a.readByte() & 255);
            Logger logger = h.f8955e;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(e.b(true, this.f8963d, this.f8961b, readByte, this.f8962c));
            }
            int readInt = this.f8960a.readInt() & Integer.MAX_VALUE;
            this.f8963d = readInt;
            if (readByte == 9) {
                if (readInt == i8) {
                    return;
                } else {
                    throw e.d("TYPE_CONTINUATION streamId changed", new Object[0]);
                }
            }
            throw e.d("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
        }

        @Override // U6.Z
        public long m(C1449e c1449e, long j8) {
            while (true) {
                int i8 = this.f8964e;
                if (i8 == 0) {
                    this.f8960a.skip(this.f8965f);
                    this.f8965f = (short) 0;
                    if ((this.f8962c & 4) != 0) {
                        return -1L;
                    }
                    a();
                } else {
                    long m8 = this.f8960a.m(c1449e, Math.min(j8, i8));
                    if (m8 == -1) {
                        return -1L;
                    }
                    this.f8964e = (int) (this.f8964e - m8);
                    return m8;
                }
            }
        }

        @Override // U6.Z
        public a0 timeout() {
            return this.f8960a.timeout();
        }

        @Override // U6.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
