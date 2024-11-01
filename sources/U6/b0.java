package U6;

import Q5.AbstractC1410e;
import U6.Q;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.zip.Inflater;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class b0 extends AbstractC1455k {

    /* renamed from: i, reason: collision with root package name */
    private static final a f10192i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    private static final Q f10193j = Q.a.e(Q.f10156b, "/", false, 1, null);

    /* renamed from: e, reason: collision with root package name */
    private final Q f10194e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC1455k f10195f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f10196g;

    /* renamed from: h, reason: collision with root package name */
    private final String f10197h;

    /* loaded from: classes5.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public b0(Q zipPath, AbstractC1455k fileSystem, Map entries, String str) {
        AbstractC3292y.i(zipPath, "zipPath");
        AbstractC3292y.i(fileSystem, "fileSystem");
        AbstractC3292y.i(entries, "entries");
        this.f10194e = zipPath;
        this.f10195f = fileSystem;
        this.f10196g = entries;
        this.f10197h = str;
    }

    private final Q m(Q q8) {
        return f10193j.k(q8, true);
    }

    @Override // U6.AbstractC1455k
    public void a(Q source, Q target) {
        AbstractC3292y.i(source, "source");
        AbstractC3292y.i(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // U6.AbstractC1455k
    public void d(Q dir, boolean z8) {
        AbstractC3292y.i(dir, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // U6.AbstractC1455k
    public void f(Q path, boolean z8) {
        AbstractC3292y.i(path, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // U6.AbstractC1455k
    public C1454j h(Q path) {
        Long valueOf;
        InterfaceC1451g interfaceC1451g;
        AbstractC3292y.i(path, "path");
        V6.i iVar = (V6.i) this.f10196g.get(m(path));
        Throwable th = null;
        if (iVar == null) {
            return null;
        }
        boolean z8 = !iVar.h();
        boolean h8 = iVar.h();
        if (iVar.h()) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(iVar.g());
        }
        C1454j c1454j = new C1454j(z8, h8, null, valueOf, null, iVar.e(), null, null, 128, null);
        if (iVar.f() == -1) {
            return c1454j;
        }
        AbstractC1453i i8 = this.f10195f.i(this.f10194e);
        try {
            interfaceC1451g = L.d(i8.E(iVar.f()));
            if (i8 != null) {
                try {
                    i8.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (i8 != null) {
                try {
                    i8.close();
                } catch (Throwable th4) {
                    AbstractC1410e.a(th3, th4);
                }
            }
            th = th3;
            interfaceC1451g = null;
        }
        if (th == null) {
            AbstractC3292y.f(interfaceC1451g);
            return V6.j.h(interfaceC1451g, c1454j);
        }
        throw th;
    }

    @Override // U6.AbstractC1455k
    public AbstractC1453i i(Q file) {
        AbstractC3292y.i(file, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // U6.AbstractC1455k
    public AbstractC1453i k(Q file, boolean z8, boolean z9) {
        AbstractC3292y.i(file, "file");
        throw new IOException("zip entries are not writable");
    }

    @Override // U6.AbstractC1455k
    public Z l(Q file) {
        InterfaceC1451g interfaceC1451g;
        AbstractC3292y.i(file, "file");
        V6.i iVar = (V6.i) this.f10196g.get(m(file));
        if (iVar != null) {
            AbstractC1453i i8 = this.f10195f.i(this.f10194e);
            Throwable th = null;
            try {
                interfaceC1451g = L.d(i8.E(iVar.f()));
                if (i8 != null) {
                    try {
                        i8.close();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } catch (Throwable th3) {
                if (i8 != null) {
                    try {
                        i8.close();
                    } catch (Throwable th4) {
                        AbstractC1410e.a(th3, th4);
                    }
                }
                interfaceC1451g = null;
                th = th3;
            }
            if (th == null) {
                AbstractC3292y.f(interfaceC1451g);
                V6.j.k(interfaceC1451g);
                if (iVar.d() == 0) {
                    return new V6.g(interfaceC1451g, iVar.g(), true);
                }
                return new V6.g(new C1460p(new V6.g(interfaceC1451g, iVar.c(), true), new Inflater(true)), iVar.g(), false);
            }
            throw th;
        }
        throw new FileNotFoundException("no such file: " + file);
    }
}
