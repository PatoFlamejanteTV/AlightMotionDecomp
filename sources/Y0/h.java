package Y0;

import Y0.h;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final Map f11756a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f11757b;

    /* renamed from: c, reason: collision with root package name */
    private final V0.d f11758c;

    /* loaded from: classes3.dex */
    public static final class a implements W0.b {

        /* renamed from: d, reason: collision with root package name */
        private static final V0.d f11759d = new V0.d() { // from class: Y0.g
            @Override // V0.d
            public final void a(Object obj, Object obj2) {
                h.a.e(obj, (V0.e) obj2);
            }
        };

        /* renamed from: a, reason: collision with root package name */
        private final Map f11760a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        private final Map f11761b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        private V0.d f11762c = f11759d;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void e(Object obj, V0.e eVar) {
            throw new V0.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public h c() {
            return new h(new HashMap(this.f11760a), new HashMap(this.f11761b), this.f11762c);
        }

        public a d(W0.a aVar) {
            aVar.a(this);
            return this;
        }

        @Override // W0.b
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a a(Class cls, V0.d dVar) {
            this.f11760a.put(cls, dVar);
            this.f11761b.remove(cls);
            return this;
        }
    }

    h(Map map, Map map2, V0.d dVar) {
        this.f11756a = map;
        this.f11757b = map2;
        this.f11758c = dVar;
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) {
        new f(outputStream, this.f11756a, this.f11757b, this.f11758c).t(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
