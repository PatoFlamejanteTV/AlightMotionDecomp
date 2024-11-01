package V6;

import Q5.InterfaceC1416k;
import Q5.l;
import Q5.r;
import Q5.x;
import R5.AbstractC1435t;
import U6.AbstractC1453i;
import U6.AbstractC1455k;
import U6.C1454j;
import U6.Q;
import U6.Z;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import l6.n;

/* loaded from: classes5.dex */
public final class h extends AbstractC1455k {

    /* renamed from: f, reason: collision with root package name */
    private static final a f10679f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    private static final Q f10680g = Q.a.e(Q.f10156b, "/", false, 1, null);

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC1416k f10681e;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: V6.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0227a extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0227a f10682a = new C0227a();

            C0227a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(i entry) {
                AbstractC3292y.i(entry, "entry");
                return Boolean.valueOf(h.f10679f.c(entry.a()));
            }
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean c(Q q8) {
            return !n.q(q8.f(), ".class", true);
        }

        public final Q b() {
            return h.f10680g;
        }

        public final List d(ClassLoader classLoader) {
            AbstractC3292y.i(classLoader, "<this>");
            Enumeration<URL> resources = classLoader.getResources("");
            AbstractC3292y.h(resources, "getResources(\"\")");
            ArrayList<URL> list = Collections.list(resources);
            AbstractC3292y.h(list, "list(this)");
            ArrayList arrayList = new ArrayList();
            for (URL it : list) {
                a aVar = h.f10679f;
                AbstractC3292y.h(it, "it");
                r e8 = aVar.e(it);
                if (e8 != null) {
                    arrayList.add(e8);
                }
            }
            Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
            AbstractC3292y.h(resources2, "getResources(\"META-INF/MANIFEST.MF\")");
            ArrayList<URL> list2 = Collections.list(resources2);
            AbstractC3292y.h(list2, "list(this)");
            ArrayList arrayList2 = new ArrayList();
            for (URL it2 : list2) {
                a aVar2 = h.f10679f;
                AbstractC3292y.h(it2, "it");
                r f8 = aVar2.f(it2);
                if (f8 != null) {
                    arrayList2.add(f8);
                }
            }
            return AbstractC1435t.G0(arrayList, arrayList2);
        }

        public final r e(URL url) {
            AbstractC3292y.i(url, "<this>");
            if (!AbstractC3292y.d(url.getProtocol(), "file")) {
                return null;
            }
            return x.a(AbstractC1455k.f10245b, Q.a.d(Q.f10156b, new File(url.toURI()), false, 1, null));
        }

        public final r f(URL url) {
            int X8;
            AbstractC3292y.i(url, "<this>");
            String url2 = url.toString();
            AbstractC3292y.h(url2, "toString()");
            if (!n.B(url2, "jar:file:", false, 2, null) || (X8 = n.X(url2, "!", 0, false, 6, null)) == -1) {
                return null;
            }
            Q.a aVar = Q.f10156b;
            String substring = url2.substring(4, X8);
            AbstractC3292y.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return x.a(j.d(Q.a.d(aVar, new File(URI.create(substring)), false, 1, null), AbstractC1455k.f10245b, C0227a.f10682a), b());
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ClassLoader f10683a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ClassLoader classLoader) {
            super(0);
            this.f10683a = classLoader;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List invoke() {
            return h.f10679f.d(this.f10683a);
        }
    }

    public h(ClassLoader classLoader, boolean z8) {
        AbstractC3292y.i(classLoader, "classLoader");
        this.f10681e = l.b(new b(classLoader));
        if (z8) {
            p().size();
        }
    }

    private final Q o(Q q8) {
        return f10680g.k(q8, true);
    }

    private final List p() {
        return (List) this.f10681e.getValue();
    }

    private final String q(Q q8) {
        return o(q8).j(f10680g).toString();
    }

    @Override // U6.AbstractC1455k
    public void a(Q source, Q target) {
        AbstractC3292y.i(source, "source");
        AbstractC3292y.i(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // U6.AbstractC1455k
    public void d(Q dir, boolean z8) {
        AbstractC3292y.i(dir, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // U6.AbstractC1455k
    public void f(Q path, boolean z8) {
        AbstractC3292y.i(path, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // U6.AbstractC1455k
    public C1454j h(Q path) {
        AbstractC3292y.i(path, "path");
        if (!f10679f.c(path)) {
            return null;
        }
        String q8 = q(path);
        for (r rVar : p()) {
            C1454j h8 = ((AbstractC1455k) rVar.a()).h(((Q) rVar.b()).l(q8));
            if (h8 != null) {
                return h8;
            }
        }
        return null;
    }

    @Override // U6.AbstractC1455k
    public AbstractC1453i i(Q file) {
        AbstractC3292y.i(file, "file");
        if (f10679f.c(file)) {
            String q8 = q(file);
            for (r rVar : p()) {
                try {
                    return ((AbstractC1455k) rVar.a()).i(((Q) rVar.b()).l(q8));
                } catch (FileNotFoundException unused) {
                }
            }
            throw new FileNotFoundException("file not found: " + file);
        }
        throw new FileNotFoundException("file not found: " + file);
    }

    @Override // U6.AbstractC1455k
    public AbstractC1453i k(Q file, boolean z8, boolean z9) {
        AbstractC3292y.i(file, "file");
        throw new IOException("resources are not writable");
    }

    @Override // U6.AbstractC1455k
    public Z l(Q file) {
        AbstractC3292y.i(file, "file");
        if (f10679f.c(file)) {
            String q8 = q(file);
            for (r rVar : p()) {
                try {
                    return ((AbstractC1455k) rVar.a()).l(((Q) rVar.b()).l(q8));
                } catch (FileNotFoundException unused) {
                }
            }
            throw new FileNotFoundException("file not found: " + file);
        }
        throw new FileNotFoundException("file not found: " + file);
    }
}
