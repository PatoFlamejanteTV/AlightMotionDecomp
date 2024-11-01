package Y0;

import Y0.d;
import androidx.leanback.preference.LeanbackPreferenceDialogFragment;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class f implements V0.e {

    /* renamed from: f, reason: collision with root package name */
    private static final Charset f11746f = Charset.forName(C.UTF8_NAME);

    /* renamed from: g, reason: collision with root package name */
    private static final V0.c f11747g = V0.c.a(LeanbackPreferenceDialogFragment.ARG_KEY).b(Y0.a.b().c(1).a()).a();

    /* renamed from: h, reason: collision with root package name */
    private static final V0.c f11748h = V0.c.a("value").b(Y0.a.b().c(2).a()).a();

    /* renamed from: i, reason: collision with root package name */
    private static final V0.d f11749i = new V0.d() { // from class: Y0.e
        @Override // V0.d
        public final void a(Object obj, Object obj2) {
            f.w((Map.Entry) obj, (V0.e) obj2);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private OutputStream f11750a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f11751b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f11752c;

    /* renamed from: d, reason: collision with root package name */
    private final V0.d f11753d;

    /* renamed from: e, reason: collision with root package name */
    private final i f11754e = new i(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11755a;

        static {
            int[] iArr = new int[d.a.values().length];
            f11755a = iArr;
            try {
                iArr[d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11755a[d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11755a[d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(OutputStream outputStream, Map map, Map map2, V0.d dVar) {
        this.f11750a = outputStream;
        this.f11751b = map;
        this.f11752c = map2;
        this.f11753d = dVar;
    }

    private static ByteBuffer p(int i8) {
        return ByteBuffer.allocate(i8).order(ByteOrder.LITTLE_ENDIAN);
    }

    private long q(V0.d dVar, Object obj) {
        b bVar = new b();
        try {
            OutputStream outputStream = this.f11750a;
            this.f11750a = bVar;
            try {
                dVar.a(obj, this);
                this.f11750a = outputStream;
                long a9 = bVar.a();
                bVar.close();
                return a9;
            } catch (Throwable th) {
                this.f11750a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private f r(V0.d dVar, V0.c cVar, Object obj, boolean z8) {
        long q8 = q(dVar, obj);
        if (z8 && q8 == 0) {
            return this;
        }
        x((v(cVar) << 3) | 2);
        y(q8);
        dVar.a(obj, this);
        return this;
    }

    private f s(V0.f fVar, V0.c cVar, Object obj, boolean z8) {
        this.f11754e.b(cVar, z8);
        fVar.a(obj, this.f11754e);
        return this;
    }

    private static d u(V0.c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar;
        }
        throw new V0.b("Field has no @Protobuf config");
    }

    private static int v(V0.c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar.tag();
        }
        throw new V0.b("Field has no @Protobuf config");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w(Map.Entry entry, V0.e eVar) {
        eVar.a(f11747g, entry.getKey());
        eVar.a(f11748h, entry.getValue());
    }

    private void x(int i8) {
        while ((i8 & (-128)) != 0) {
            this.f11750a.write((i8 & ModuleDescriptor.MODULE_VERSION) | 128);
            i8 >>>= 7;
        }
        this.f11750a.write(i8 & ModuleDescriptor.MODULE_VERSION);
    }

    private void y(long j8) {
        while (((-128) & j8) != 0) {
            this.f11750a.write((((int) j8) & ModuleDescriptor.MODULE_VERSION) | 128);
            j8 >>>= 7;
        }
        this.f11750a.write(((int) j8) & ModuleDescriptor.MODULE_VERSION);
    }

    @Override // V0.e
    public V0.e a(V0.c cVar, Object obj) {
        return i(cVar, obj, true);
    }

    @Override // V0.e
    public V0.e b(V0.c cVar, double d8) {
        return g(cVar, d8, true);
    }

    V0.e g(V0.c cVar, double d8, boolean z8) {
        if (z8 && d8 == 0.0d) {
            return this;
        }
        x((v(cVar) << 3) | 1);
        this.f11750a.write(p(8).putDouble(d8).array());
        return this;
    }

    V0.e h(V0.c cVar, float f8, boolean z8) {
        if (z8 && f8 == 0.0f) {
            return this;
        }
        x((v(cVar) << 3) | 5);
        this.f11750a.write(p(4).putFloat(f8).array());
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public V0.e i(V0.c cVar, Object obj, boolean z8) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z8 && charSequence.length() == 0) {
                return this;
            }
            x((v(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f11746f);
            x(bytes.length);
            this.f11750a.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                i(cVar, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                r(f11749i, cVar, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            return g(cVar, ((Double) obj).doubleValue(), z8);
        }
        if (obj instanceof Float) {
            return h(cVar, ((Float) obj).floatValue(), z8);
        }
        if (obj instanceof Number) {
            return m(cVar, ((Number) obj).longValue(), z8);
        }
        if (obj instanceof Boolean) {
            return o(cVar, ((Boolean) obj).booleanValue(), z8);
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z8 && bArr.length == 0) {
                return this;
            }
            x((v(cVar) << 3) | 2);
            x(bArr.length);
            this.f11750a.write(bArr);
            return this;
        }
        V0.d dVar = (V0.d) this.f11751b.get(obj.getClass());
        if (dVar != null) {
            return r(dVar, cVar, obj, z8);
        }
        V0.f fVar = (V0.f) this.f11752c.get(obj.getClass());
        if (fVar != null) {
            return s(fVar, cVar, obj, z8);
        }
        if (obj instanceof c) {
            return c(cVar, ((c) obj).getNumber());
        }
        if (obj instanceof Enum) {
            return c(cVar, ((Enum) obj).ordinal());
        }
        return r(this.f11753d, cVar, obj, z8);
    }

    @Override // V0.e
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public f c(V0.c cVar, int i8) {
        return k(cVar, i8, true);
    }

    f k(V0.c cVar, int i8, boolean z8) {
        if (z8 && i8 == 0) {
            return this;
        }
        d u8 = u(cVar);
        int i9 = a.f11755a[u8.intEncoding().ordinal()];
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 == 3) {
                    x((u8.tag() << 3) | 5);
                    this.f11750a.write(p(4).putInt(i8).array());
                }
            } else {
                x(u8.tag() << 3);
                x((i8 << 1) ^ (i8 >> 31));
            }
        } else {
            x(u8.tag() << 3);
            x(i8);
        }
        return this;
    }

    @Override // V0.e
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public f d(V0.c cVar, long j8) {
        return m(cVar, j8, true);
    }

    f m(V0.c cVar, long j8, boolean z8) {
        if (z8 && j8 == 0) {
            return this;
        }
        d u8 = u(cVar);
        int i8 = a.f11755a[u8.intEncoding().ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    x((u8.tag() << 3) | 1);
                    this.f11750a.write(p(8).putLong(j8).array());
                }
            } else {
                x(u8.tag() << 3);
                y((j8 >> 63) ^ (j8 << 1));
            }
        } else {
            x(u8.tag() << 3);
            y(j8);
        }
        return this;
    }

    @Override // V0.e
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public f e(V0.c cVar, boolean z8) {
        return o(cVar, z8, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f o(V0.c cVar, boolean z8, boolean z9) {
        return k(cVar, z8 ? 1 : 0, z9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f t(Object obj) {
        if (obj == null) {
            return this;
        }
        V0.d dVar = (V0.d) this.f11751b.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, this);
            return this;
        }
        throw new V0.b("No encoder for " + obj.getClass());
    }
}
