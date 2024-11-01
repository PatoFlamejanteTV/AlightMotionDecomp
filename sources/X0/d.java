package X0;

import V0.g;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes3.dex */
public final class d implements W0.b {

    /* renamed from: e, reason: collision with root package name */
    private static final V0.d f10916e = new V0.d() { // from class: X0.a
        @Override // V0.d
        public final void a(Object obj, Object obj2) {
            d.l(obj, (V0.e) obj2);
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private static final V0.f f10917f = new V0.f() { // from class: X0.b
        @Override // V0.f
        public final void a(Object obj, Object obj2) {
            ((g) obj2).f((String) obj);
        }
    };

    /* renamed from: g, reason: collision with root package name */
    private static final V0.f f10918g = new V0.f() { // from class: X0.c
        @Override // V0.f
        public final void a(Object obj, Object obj2) {
            d.n((Boolean) obj, (g) obj2);
        }
    };

    /* renamed from: h, reason: collision with root package name */
    private static final b f10919h = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final Map f10920a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f10921b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private V0.d f10922c = f10916e;

    /* renamed from: d, reason: collision with root package name */
    private boolean f10923d = false;

    /* loaded from: classes3.dex */
    class a implements V0.a {
        a() {
        }

        @Override // V0.a
        public void a(Object obj, Writer writer) {
            e eVar = new e(writer, d.this.f10920a, d.this.f10921b, d.this.f10922c, d.this.f10923d);
            eVar.k(obj, false);
            eVar.u();
        }

        @Override // V0.a
        public String b(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    /* loaded from: classes3.dex */
    private static final class b implements V0.f {

        /* renamed from: a, reason: collision with root package name */
        private static final DateFormat f10925a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f10925a = simpleDateFormat;
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        @Override // V0.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Date date, g gVar) {
            gVar.f(f10925a.format(date));
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public d() {
        p(String.class, f10917f);
        p(Boolean.class, f10918g);
        p(Date.class, f10919h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(Object obj, V0.e eVar) {
        throw new V0.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(Boolean bool, g gVar) {
        gVar.g(bool.booleanValue());
    }

    public V0.a i() {
        return new a();
    }

    public d j(W0.a aVar) {
        aVar.a(this);
        return this;
    }

    public d k(boolean z8) {
        this.f10923d = z8;
        return this;
    }

    @Override // W0.b
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public d a(Class cls, V0.d dVar) {
        this.f10920a.put(cls, dVar);
        this.f10921b.remove(cls);
        return this;
    }

    public d p(Class cls, V0.f fVar) {
        this.f10921b.put(cls, fVar);
        this.f10920a.remove(cls);
        return this;
    }
}
