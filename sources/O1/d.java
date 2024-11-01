package O1;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;

/* loaded from: classes4.dex */
public final class d extends a {

    /* renamed from: e, reason: collision with root package name */
    public static final d f6943e;

    /* renamed from: f, reason: collision with root package name */
    public static final d f6944f;

    /* renamed from: g, reason: collision with root package name */
    public static final d f6945g;

    /* renamed from: h, reason: collision with root package name */
    public static final d f6946h;

    /* renamed from: i, reason: collision with root package name */
    public static final d f6947i;

    /* renamed from: j, reason: collision with root package name */
    public static final d f6948j;

    /* renamed from: k, reason: collision with root package name */
    public static final d f6949k;

    /* renamed from: l, reason: collision with root package name */
    public static final d f6950l;

    /* renamed from: m, reason: collision with root package name */
    public static final d f6951m;

    /* renamed from: d, reason: collision with root package name */
    private final int f6952d;

    static {
        x xVar = x.REQUIRED;
        f6943e = new d("A128CBC-HS256", xVar, 256);
        x xVar2 = x.OPTIONAL;
        f6944f = new d("A192CBC-HS384", xVar2, 384);
        f6945g = new d("A256CBC-HS512", xVar, 512);
        f6946h = new d("A128CBC+HS256", xVar2, 256);
        f6947i = new d("A256CBC+HS512", xVar2, 512);
        x xVar3 = x.RECOMMENDED;
        f6948j = new d("A128GCM", xVar3, 128);
        f6949k = new d("A192GCM", xVar2, PsExtractor.AUDIO_STREAM);
        f6950l = new d("A256GCM", xVar3, 256);
        f6951m = new d("XC20P", xVar2, 256);
    }

    public d(String str, x xVar, int i8) {
        super(str, xVar);
        this.f6952d = i8;
    }

    public static d d(String str) {
        d dVar = f6943e;
        if (str.equals(dVar.a())) {
            return dVar;
        }
        d dVar2 = f6944f;
        if (str.equals(dVar2.a())) {
            return dVar2;
        }
        d dVar3 = f6945g;
        if (str.equals(dVar3.a())) {
            return dVar3;
        }
        d dVar4 = f6948j;
        if (str.equals(dVar4.a())) {
            return dVar4;
        }
        d dVar5 = f6949k;
        if (str.equals(dVar5.a())) {
            return dVar5;
        }
        d dVar6 = f6950l;
        if (str.equals(dVar6.a())) {
            return dVar6;
        }
        d dVar7 = f6946h;
        if (str.equals(dVar7.a())) {
            return dVar7;
        }
        d dVar8 = f6947i;
        if (str.equals(dVar8.a())) {
            return dVar8;
        }
        d dVar9 = f6951m;
        if (str.equals(dVar9.a())) {
            return dVar9;
        }
        return new d(str);
    }

    public int c() {
        return this.f6952d;
    }

    public d(String str) {
        this(str, null, 0);
    }
}
