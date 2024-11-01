package M0;

import M0.F;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.leanback.preference.LeanbackPreferenceDialogFragment;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* renamed from: M0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1331a implements W0.a {

    /* renamed from: a, reason: collision with root package name */
    public static final W0.a f5519a = new C1331a();

    /* renamed from: M0.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static final class C0109a implements V0.d {

        /* renamed from: a, reason: collision with root package name */
        static final C0109a f5520a = new C0109a();

        /* renamed from: b, reason: collision with root package name */
        private static final V0.c f5521b = V0.c.d("arch");

        /* renamed from: c, reason: collision with root package name */
        private static final V0.c f5522c = V0.c.d("libraryName");

        /* renamed from: d, reason: collision with root package name */
        private static final V0.c f5523d = V0.c.d("buildId");

        private C0109a() {
        }

        @Override // V0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.a.AbstractC0091a abstractC0091a, V0.e eVar) {
            eVar.a(f5521b, abstractC0091a.b());
            eVar.a(f5522c, abstractC0091a.d());
            eVar.a(f5523d, abstractC0091a.c());
        }
    }

    /* renamed from: M0.a$b */
    /* loaded from: classes3.dex */
    private static final class b implements V0.d {

        /* renamed from: a, reason: collision with root package name */
        static final b f5524a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final V0.c f5525b = V0.c.d("pid");

        /* renamed from: c, reason: collision with root package name */
        private static final V0.c f5526c = V0.c.d("processName");

        /* renamed from: d, reason: collision with root package name */
        private static final V0.c f5527d = V0.c.d("reasonCode");

        /* renamed from: e, reason: collision with root package name */
        private static final V0.c f5528e = V0.c.d("importance");

        /* renamed from: f, reason: collision with root package name */
        private static final V0.c f5529f = V0.c.d("pss");

        /* renamed from: g, reason: collision with root package name */
        private static final V0.c f5530g = V0.c.d("rss");

        /* renamed from: h, reason: collision with root package name */
        private static final V0.c f5531h = V0.c.d(CampaignEx.JSON_KEY_TIMESTAMP);

        /* renamed from: i, reason: collision with root package name */
        private static final V0.c f5532i = V0.c.d("traceFile");

        /* renamed from: j, reason: collision with root package name */
        private static final V0.c f5533j = V0.c.d("buildIdMappingForArch");

        private b() {
        }

        @Override // V0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.a aVar, V0.e eVar) {
            eVar.c(f5525b, aVar.d());
            eVar.a(f5526c, aVar.e());
            eVar.c(f5527d, aVar.g());
            eVar.c(f5528e, aVar.c());
            eVar.d(f5529f, aVar.f());
            eVar.d(f5530g, aVar.h());
            eVar.d(f5531h, aVar.i());
            eVar.a(f5532i, aVar.j());
            eVar.a(f5533j, aVar.b());
        }
    }

    /* renamed from: M0.a$c */
    /* loaded from: classes3.dex */
    private static final class c implements V0.d {

        /* renamed from: a, reason: collision with root package name */
        static final c f5534a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final V0.c f5535b = V0.c.d(LeanbackPreferenceDialogFragment.ARG_KEY);

        /* renamed from: c, reason: collision with root package name */
        private static final V0.c f5536c = V0.c.d("value");

        private c() {
        }

        @Override // V0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.c cVar, V0.e eVar) {
            eVar.a(f5535b, cVar.b());
            eVar.a(f5536c, cVar.c());
        }
    }

    /* renamed from: M0.a$d */
    /* loaded from: classes3.dex */
    private static final class d implements V0.d {

        /* renamed from: a, reason: collision with root package name */
        static final d f5537a = new d();

        /* renamed from: b, reason: collision with root package name */
        private static final V0.c f5538b = V0.c.d("sdkVersion");

        /* renamed from: c, reason: collision with root package name */
        private static final V0.c f5539c = V0.c.d("gmpAppId");

        /* renamed from: d, reason: collision with root package name */
        private static final V0.c f5540d = V0.c.d("platform");

        /* renamed from: e, reason: collision with root package name */
        private static final V0.c f5541e = V0.c.d("installationUuid");

        /* renamed from: f, reason: collision with root package name */
        private static final V0.c f5542f = V0.c.d("firebaseInstallationId");

        /* renamed from: g, reason: collision with root package name */
        private static final V0.c f5543g = V0.c.d("firebaseAuthenticationToken");

        /* renamed from: h, reason: collision with root package name */
        private static final V0.c f5544h = V0.c.d("appQualitySessionId");

        /* renamed from: i, reason: collision with root package name */
        private static final V0.c f5545i = V0.c.d("buildVersion");

        /* renamed from: j, reason: collision with root package name */
        private static final V0.c f5546j = V0.c.d("displayVersion");

        /* renamed from: k, reason: collision with root package name */
        private static final V0.c f5547k = V0.c.d("session");

        /* renamed from: l, reason: collision with root package name */
        private static final V0.c f5548l = V0.c.d("ndkPayload");

        /* renamed from: m, reason: collision with root package name */
        private static final V0.c f5549m = V0.c.d("appExitInfo");

        private d() {
        }

        @Override // V0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F f8, V0.e eVar) {
            eVar.a(f5538b, f8.m());
            eVar.a(f5539c, f8.i());
            eVar.c(f5540d, f8.l());
            eVar.a(f5541e, f8.j());
            eVar.a(f5542f, f8.h());
            eVar.a(f5543g, f8.g());
            eVar.a(f5544h, f8.d());
            eVar.a(f5545i, f8.e());
            eVar.a(f5546j, f8.f());
            eVar.a(f5547k, f8.n());
            eVar.a(f5548l, f8.k());
            eVar.a(f5549m, f8.c());
        }
    }

    /* renamed from: M0.a$e */
    /* loaded from: classes3.dex */
    private static final class e implements V0.d {

        /* renamed from: a, reason: collision with root package name */
        static final e f5550a = new e();

        /* renamed from: b, reason: collision with root package name */
        private static final V0.c f5551b = V0.c.d("files");

        /* renamed from: c, reason: collision with root package name */
        private static final V0.c f5552c = V0.c.d("orgId");

        private e() {
        }

        @Override // V0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.d dVar, V0.e eVar) {
            eVar.a(f5551b, dVar.b());
            eVar.a(f5552c, dVar.c());
        }
    }

    /* renamed from: M0.a$f */
    /* loaded from: classes3.dex */
    private static final class f implements V0.d {

        /* renamed from: a, reason: collision with root package name */
        static final f f5553a = new f();

        /* renamed from: b, reason: collision with root package name */
        private static final V0.c f5554b = V0.c.d("filename");

        /* renamed from: c, reason: collision with root package name */
        private static final V0.c f5555c = V0.c.d("contents");

        private f() {
        }

        @Override // V0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.d.b bVar, V0.e eVar) {
            eVar.a(f5554b, bVar.c());
            eVar.a(f5555c, bVar.b());
        }
    }

    /* renamed from: M0.a$g */
    /* loaded from: classes3.dex */
    private static final class g implements V0.d {

        /* renamed from: a, reason: collision with root package name */
        static final g f5556a = new g();

        /* renamed from: b, reason: collision with root package name */
        private static final V0.c f5557b = V0.c.d("identifier");

        /* renamed from: c, reason: collision with root package name */
        private static final V0.c f5558c = V0.c.d("version");

        /* renamed from: d, reason: collision with root package name */
        private static final V0.c f5559d = V0.c.d("displayVersion");

        /* renamed from: e, reason: collision with root package name */
        private static final V0.c f5560e = V0.c.d("organization");

        /* renamed from: f, reason: collision with root package name */
        private static final V0.c f5561f = V0.c.d("installationUuid");

        /* renamed from: g, reason: collision with root package name */
        private static final V0.c f5562g = V0.c.d("developmentPlatform");

        /* renamed from: h, reason: collision with root package name */
        private static final V0.c f5563h = V0.c.d("developmentPlatformVersion");

        private g() {
        }

        @Override // V0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.a aVar, V0.e eVar) {
            eVar.a(f5557b, aVar.e());
            eVar.a(f5558c, aVar.h());
            eVar.a(f5559d, aVar.d());
            V0.c cVar = f5560e;
            aVar.g();
            eVar.a(cVar, null);
            eVar.a(f5561f, aVar.f());
            eVar.a(f5562g, aVar.b());
            eVar.a(f5563h, aVar.c());
        }
    }

    /* renamed from: M0.a$h */
    /* loaded from: classes3.dex */
    private static final class h implements V0.d {

        /* renamed from: a, reason: collision with root package name */
        static final h f5564a = new h();

        /* renamed from: b, reason: collision with root package name */
        private static final V0.c f5565b = V0.c.d("clsId");

        private h() {
        }

        @Override // V0.d
        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            android.support.v4.media.a.a(obj);
            b(null, (V0.e) obj2);
        }

        public void b(F.e.a.b bVar, V0.e eVar) {
            throw null;
        }
    }

    /* renamed from: M0.a$i */
    /* loaded from: classes3.dex */
    private static final class i implements V0.d {

        /* renamed from: a, reason: collision with root package name */
        static final i f5566a = new i();

        /* renamed from: b, reason: collision with root package name */
        private static final V0.c f5567b = V0.c.d("arch");

        /* renamed from: c, reason: collision with root package name */
        private static final V0.c f5568c = V0.c.d("model");

        /* renamed from: d, reason: collision with root package name */
        private static final V0.c f5569d = V0.c.d("cores");

        /* renamed from: e, reason: collision with root package name */
        private static final V0.c f5570e = V0.c.d("ram");

        /* renamed from: f, reason: collision with root package name */
        private static final V0.c f5571f = V0.c.d("diskSpace");

        /* renamed from: g, reason: collision with root package name */
        private static final V0.c f5572g = V0.c.d("simulator");

        /* renamed from: h, reason: collision with root package name */
        private static final V0.c f5573h = V0.c.d("state");

        /* renamed from: i, reason: collision with root package name */
        private static final V0.c f5574i = V0.c.d("manufacturer");

        /* renamed from: j, reason: collision with root package name */
        private static final V0.c f5575j = V0.c.d("modelClass");

        private i() {
        }

        @Override // V0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.c cVar, V0.e eVar) {
            eVar.c(f5567b, cVar.b());
            eVar.a(f5568c, cVar.f());
            eVar.c(f5569d, cVar.c());
            eVar.d(f5570e, cVar.h());
            eVar.d(f5571f, cVar.d());
            eVar.e(f5572g, cVar.j());
            eVar.c(f5573h, cVar.i());
            eVar.a(f5574i, cVar.e());
            eVar.a(f5575j, cVar.g());
        }
    }

    /* renamed from: M0.a$j */
    /* loaded from: classes3.dex */
    private static final class j implements V0.d {

        /* renamed from: a, reason: collision with root package name */
        static final j f5576a = new j();

        /* renamed from: b, reason: collision with root package name */
        private static final V0.c f5577b = V0.c.d("generator");

        /* renamed from: c, reason: collision with root package name */
        private static final V0.c f5578c = V0.c.d("identifier");

        /* renamed from: d, reason: collision with root package name */
        private static final V0.c f5579d = V0.c.d("appQualitySessionId");

        /* renamed from: e, reason: collision with root package name */
        private static final V0.c f5580e = V0.c.d("startedAt");

        /* renamed from: f, reason: collision with root package name */
        private static final V0.c f5581f = V0.c.d("endedAt");

        /* renamed from: g, reason: collision with root package name */
        private static final V0.c f5582g = V0.c.d("crashed");

        /* renamed from: h, reason: collision with root package name */
        private static final V0.c f5583h = V0.c.d(MBridgeConstans.DYNAMIC_VIEW_WX_APP);

        /* renamed from: i, reason: collision with root package name */
        private static final V0.c f5584i = V0.c.d("user");

        /* renamed from: j, reason: collision with root package name */
        private static final V0.c f5585j = V0.c.d("os");

        /* renamed from: k, reason: collision with root package name */
        private static final V0.c f5586k = V0.c.d("device");

        /* renamed from: l, reason: collision with root package name */
        private static final V0.c f5587l = V0.c.d("events");

        /* renamed from: m, reason: collision with root package name */
        private static final V0.c f5588m = V0.c.d("generatorType");

        private j() {
        }

        @Override // V0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e eVar, V0.e eVar2) {
            eVar2.a(f5577b, eVar.g());
            eVar2.a(f5578c, eVar.j());
            eVar2.a(f5579d, eVar.c());
            eVar2.d(f5580e, eVar.l());
            eVar2.a(f5581f, eVar.e());
            eVar2.e(f5582g, eVar.n());
            eVar2.a(f5583h, eVar.b());
            eVar2.a(f5584i, eVar.m());
            eVar2.a(f5585j, eVar.k());
            eVar2.a(f5586k, eVar.d());
            eVar2.a(f5587l, eVar.f());
            eVar2.c(f5588m, eVar.h());
        }
    }

    /* renamed from: M0.a$k */
    /* loaded from: classes3.dex */
    private static final class k implements V0.d {

        /* renamed from: a, reason: collision with root package name */
        static final k f5589a = new k();

        /* renamed from: b, reason: collision with root package name */
        private static final V0.c f5590b = V0.c.d("execution");

        /* renamed from: c, reason: collision with root package name */
        private static final V0.c f5591c = V0.c.d("customAttributes");

        /* renamed from: d, reason: collision with root package name */
        private static final V0.c f5592d = V0.c.d("internalKeys");

        /* renamed from: e, reason: collision with root package name */
        private static final V0.c f5593e = V0.c.d("background");

        /* renamed from: f, reason: collision with root package name */
        private static final V0.c f5594f = V0.c.d("currentProcessDetails");

        /* renamed from: g, reason: collision with root package name */
        private static final V0.c f5595g = V0.c.d("appProcessDetails");

        /* renamed from: h, reason: collision with root package name */
        private static final V0.c f5596h = V0.c.d("uiOrientation");

        private k() {
        }

        @Override // V0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.a aVar, V0.e eVar) {
            eVar.a(f5590b, aVar.f());
            eVar.a(f5591c, aVar.e());
            eVar.a(f5592d, aVar.g());
            eVar.a(f5593e, aVar.c());
            eVar.a(f5594f, aVar.d());
            eVar.a(f5595g, aVar.b());
            eVar.c(f5596h, aVar.h());
        }
    }

    /* renamed from: M0.a$l */
    /* loaded from: classes3.dex */
    private static final class l implements V0.d {

        /* renamed from: a, reason: collision with root package name */
        static final l f5597a = new l();

        /* renamed from: b, reason: collision with root package name */
        private static final V0.c f5598b = V0.c.d("baseAddress");

        /* renamed from: c, reason: collision with root package name */
        private static final V0.c f5599c = V0.c.d("size");

        /* renamed from: d, reason: collision with root package name */
        private static final V0.c f5600d = V0.c.d("name");

        /* renamed from: e, reason: collision with root package name */
        private static final V0.c f5601e = V0.c.d("uuid");

        private l() {
        }

        @Override // V0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.a.b.AbstractC0095a abstractC0095a, V0.e eVar) {
            eVar.d(f5598b, abstractC0095a.b());
            eVar.d(f5599c, abstractC0095a.d());
            eVar.a(f5600d, abstractC0095a.c());
            eVar.a(f5601e, abstractC0095a.f());
        }
    }

    /* renamed from: M0.a$m */
    /* loaded from: classes3.dex */
    private static final class m implements V0.d {

        /* renamed from: a, reason: collision with root package name */
        static final m f5602a = new m();

        /* renamed from: b, reason: collision with root package name */
        private static final V0.c f5603b = V0.c.d("threads");

        /* renamed from: c, reason: collision with root package name */
        private static final V0.c f5604c = V0.c.d("exception");

        /* renamed from: d, reason: collision with root package name */
        private static final V0.c f5605d = V0.c.d("appExitInfo");

        /* renamed from: e, reason: collision with root package name */
        private static final V0.c f5606e = V0.c.d("signal");

        /* renamed from: f, reason: collision with root package name */
        private static final V0.c f5607f = V0.c.d("binaries");

        private m() {
        }

        @Override // V0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.a.b bVar, V0.e eVar) {
            eVar.a(f5603b, bVar.f());
            eVar.a(f5604c, bVar.d());
            eVar.a(f5605d, bVar.b());
            eVar.a(f5606e, bVar.e());
            eVar.a(f5607f, bVar.c());
        }
    }

    /* renamed from: M0.a$n */
    /* loaded from: classes3.dex */
    private static final class n implements V0.d {

        /* renamed from: a, reason: collision with root package name */
        static final n f5608a = new n();

        /* renamed from: b, reason: collision with root package name */
        private static final V0.c f5609b = V0.c.d("type");

        /* renamed from: c, reason: collision with root package name */
        private static final V0.c f5610c = V0.c.d("reason");

        /* renamed from: d, reason: collision with root package name */
        private static final V0.c f5611d = V0.c.d(com.mbridge.msdk.foundation.entity.b.JSON_KEY_FRAME_ADS);

        /* renamed from: e, reason: collision with root package name */
        private static final V0.c f5612e = V0.c.d("causedBy");

        /* renamed from: f, reason: collision with root package name */
        private static final V0.c f5613f = V0.c.d("overflowCount");

        private n() {
        }

        @Override // V0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.a.b.c cVar, V0.e eVar) {
            eVar.a(f5609b, cVar.f());
            eVar.a(f5610c, cVar.e());
            eVar.a(f5611d, cVar.c());
            eVar.a(f5612e, cVar.b());
            eVar.c(f5613f, cVar.d());
        }
    }

    /* renamed from: M0.a$o */
    /* loaded from: classes3.dex */
    private static final class o implements V0.d {

        /* renamed from: a, reason: collision with root package name */
        static final o f5614a = new o();

        /* renamed from: b, reason: collision with root package name */
        private static final V0.c f5615b = V0.c.d("name");

        /* renamed from: c, reason: collision with root package name */
        private static final V0.c f5616c = V0.c.d("code");

        /* renamed from: d, reason: collision with root package name */
        private static final V0.c f5617d = V0.c.d("address");

        private o() {
        }

        @Override // V0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.a.b.AbstractC0099d abstractC0099d, V0.e eVar) {
            eVar.a(f5615b, abstractC0099d.d());
            eVar.a(f5616c, abstractC0099d.c());
            eVar.d(f5617d, abstractC0099d.b());
        }
    }

    /* renamed from: M0.a$p */
    /* loaded from: classes3.dex */
    private static final class p implements V0.d {

        /* renamed from: a, reason: collision with root package name */
        static final p f5618a = new p();

        /* renamed from: b, reason: collision with root package name */
        private static final V0.c f5619b = V0.c.d("name");

        /* renamed from: c, reason: collision with root package name */
        private static final V0.c f5620c = V0.c.d("importance");

        /* renamed from: d, reason: collision with root package name */
        private static final V0.c f5621d = V0.c.d(com.mbridge.msdk.foundation.entity.b.JSON_KEY_FRAME_ADS);

        private p() {
        }

        @Override // V0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.a.b.AbstractC0101e abstractC0101e, V0.e eVar) {
            eVar.a(f5619b, abstractC0101e.d());
            eVar.c(f5620c, abstractC0101e.c());
            eVar.a(f5621d, abstractC0101e.b());
        }
    }

    /* renamed from: M0.a$q */
    /* loaded from: classes3.dex */
    private static final class q implements V0.d {

        /* renamed from: a, reason: collision with root package name */
        static final q f5622a = new q();

        /* renamed from: b, reason: collision with root package name */
        private static final V0.c f5623b = V0.c.d("pc");

        /* renamed from: c, reason: collision with root package name */
        private static final V0.c f5624c = V0.c.d("symbol");

        /* renamed from: d, reason: collision with root package name */
        private static final V0.c f5625d = V0.c.d("file");

        /* renamed from: e, reason: collision with root package name */
        private static final V0.c f5626e = V0.c.d(TypedValues.CycleType.S_WAVE_OFFSET);

        /* renamed from: f, reason: collision with root package name */
        private static final V0.c f5627f = V0.c.d("importance");

        private q() {
        }

        @Override // V0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.a.b.AbstractC0101e.AbstractC0103b abstractC0103b, V0.e eVar) {
            eVar.d(f5623b, abstractC0103b.e());
            eVar.a(f5624c, abstractC0103b.f());
            eVar.a(f5625d, abstractC0103b.b());
            eVar.d(f5626e, abstractC0103b.d());
            eVar.c(f5627f, abstractC0103b.c());
        }
    }

    /* renamed from: M0.a$r */
    /* loaded from: classes3.dex */
    private static final class r implements V0.d {

        /* renamed from: a, reason: collision with root package name */
        static final r f5628a = new r();

        /* renamed from: b, reason: collision with root package name */
        private static final V0.c f5629b = V0.c.d("processName");

        /* renamed from: c, reason: collision with root package name */
        private static final V0.c f5630c = V0.c.d("pid");

        /* renamed from: d, reason: collision with root package name */
        private static final V0.c f5631d = V0.c.d("importance");

        /* renamed from: e, reason: collision with root package name */
        private static final V0.c f5632e = V0.c.d("defaultProcess");

        private r() {
        }

        @Override // V0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.a.c cVar, V0.e eVar) {
            eVar.a(f5629b, cVar.d());
            eVar.c(f5630c, cVar.c());
            eVar.c(f5631d, cVar.b());
            eVar.e(f5632e, cVar.e());
        }
    }

    /* renamed from: M0.a$s */
    /* loaded from: classes3.dex */
    private static final class s implements V0.d {

        /* renamed from: a, reason: collision with root package name */
        static final s f5633a = new s();

        /* renamed from: b, reason: collision with root package name */
        private static final V0.c f5634b = V0.c.d("batteryLevel");

        /* renamed from: c, reason: collision with root package name */
        private static final V0.c f5635c = V0.c.d("batteryVelocity");

        /* renamed from: d, reason: collision with root package name */
        private static final V0.c f5636d = V0.c.d("proximityOn");

        /* renamed from: e, reason: collision with root package name */
        private static final V0.c f5637e = V0.c.d("orientation");

        /* renamed from: f, reason: collision with root package name */
        private static final V0.c f5638f = V0.c.d("ramUsed");

        /* renamed from: g, reason: collision with root package name */
        private static final V0.c f5639g = V0.c.d("diskUsed");

        private s() {
        }

        @Override // V0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.c cVar, V0.e eVar) {
            eVar.a(f5634b, cVar.b());
            eVar.c(f5635c, cVar.c());
            eVar.e(f5636d, cVar.g());
            eVar.c(f5637e, cVar.e());
            eVar.d(f5638f, cVar.f());
            eVar.d(f5639g, cVar.d());
        }
    }

    /* renamed from: M0.a$t */
    /* loaded from: classes3.dex */
    private static final class t implements V0.d {

        /* renamed from: a, reason: collision with root package name */
        static final t f5640a = new t();

        /* renamed from: b, reason: collision with root package name */
        private static final V0.c f5641b = V0.c.d(CampaignEx.JSON_KEY_TIMESTAMP);

        /* renamed from: c, reason: collision with root package name */
        private static final V0.c f5642c = V0.c.d("type");

        /* renamed from: d, reason: collision with root package name */
        private static final V0.c f5643d = V0.c.d(MBridgeConstans.DYNAMIC_VIEW_WX_APP);

        /* renamed from: e, reason: collision with root package name */
        private static final V0.c f5644e = V0.c.d("device");

        /* renamed from: f, reason: collision with root package name */
        private static final V0.c f5645f = V0.c.d("log");

        /* renamed from: g, reason: collision with root package name */
        private static final V0.c f5646g = V0.c.d("rollouts");

        private t() {
        }

        @Override // V0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d dVar, V0.e eVar) {
            eVar.d(f5641b, dVar.f());
            eVar.a(f5642c, dVar.g());
            eVar.a(f5643d, dVar.b());
            eVar.a(f5644e, dVar.c());
            eVar.a(f5645f, dVar.d());
            eVar.a(f5646g, dVar.e());
        }
    }

    /* renamed from: M0.a$u */
    /* loaded from: classes3.dex */
    private static final class u implements V0.d {

        /* renamed from: a, reason: collision with root package name */
        static final u f5647a = new u();

        /* renamed from: b, reason: collision with root package name */
        private static final V0.c f5648b = V0.c.d("content");

        private u() {
        }

        @Override // V0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.AbstractC0106d abstractC0106d, V0.e eVar) {
            eVar.a(f5648b, abstractC0106d.b());
        }
    }

    /* renamed from: M0.a$v */
    /* loaded from: classes3.dex */
    private static final class v implements V0.d {

        /* renamed from: a, reason: collision with root package name */
        static final v f5649a = new v();

        /* renamed from: b, reason: collision with root package name */
        private static final V0.c f5650b = V0.c.d("rolloutVariant");

        /* renamed from: c, reason: collision with root package name */
        private static final V0.c f5651c = V0.c.d("parameterKey");

        /* renamed from: d, reason: collision with root package name */
        private static final V0.c f5652d = V0.c.d("parameterValue");

        /* renamed from: e, reason: collision with root package name */
        private static final V0.c f5653e = V0.c.d("templateVersion");

        private v() {
        }

        @Override // V0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.AbstractC0107e abstractC0107e, V0.e eVar) {
            eVar.a(f5650b, abstractC0107e.d());
            eVar.a(f5651c, abstractC0107e.b());
            eVar.a(f5652d, abstractC0107e.c());
            eVar.d(f5653e, abstractC0107e.e());
        }
    }

    /* renamed from: M0.a$w */
    /* loaded from: classes3.dex */
    private static final class w implements V0.d {

        /* renamed from: a, reason: collision with root package name */
        static final w f5654a = new w();

        /* renamed from: b, reason: collision with root package name */
        private static final V0.c f5655b = V0.c.d("rolloutId");

        /* renamed from: c, reason: collision with root package name */
        private static final V0.c f5656c = V0.c.d("variantId");

        private w() {
        }

        @Override // V0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.AbstractC0107e.b bVar, V0.e eVar) {
            eVar.a(f5655b, bVar.b());
            eVar.a(f5656c, bVar.c());
        }
    }

    /* renamed from: M0.a$x */
    /* loaded from: classes3.dex */
    private static final class x implements V0.d {

        /* renamed from: a, reason: collision with root package name */
        static final x f5657a = new x();

        /* renamed from: b, reason: collision with root package name */
        private static final V0.c f5658b = V0.c.d("assignments");

        private x() {
        }

        @Override // V0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.f fVar, V0.e eVar) {
            eVar.a(f5658b, fVar.b());
        }
    }

    /* renamed from: M0.a$y */
    /* loaded from: classes3.dex */
    private static final class y implements V0.d {

        /* renamed from: a, reason: collision with root package name */
        static final y f5659a = new y();

        /* renamed from: b, reason: collision with root package name */
        private static final V0.c f5660b = V0.c.d("platform");

        /* renamed from: c, reason: collision with root package name */
        private static final V0.c f5661c = V0.c.d("version");

        /* renamed from: d, reason: collision with root package name */
        private static final V0.c f5662d = V0.c.d("buildVersion");

        /* renamed from: e, reason: collision with root package name */
        private static final V0.c f5663e = V0.c.d("jailbroken");

        private y() {
        }

        @Override // V0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.AbstractC0108e abstractC0108e, V0.e eVar) {
            eVar.c(f5660b, abstractC0108e.c());
            eVar.a(f5661c, abstractC0108e.d());
            eVar.a(f5662d, abstractC0108e.b());
            eVar.e(f5663e, abstractC0108e.e());
        }
    }

    /* renamed from: M0.a$z */
    /* loaded from: classes3.dex */
    private static final class z implements V0.d {

        /* renamed from: a, reason: collision with root package name */
        static final z f5664a = new z();

        /* renamed from: b, reason: collision with root package name */
        private static final V0.c f5665b = V0.c.d("identifier");

        private z() {
        }

        @Override // V0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.f fVar, V0.e eVar) {
            eVar.a(f5665b, fVar.b());
        }
    }

    private C1331a() {
    }

    @Override // W0.a
    public void a(W0.b bVar) {
        d dVar = d.f5537a;
        bVar.a(F.class, dVar);
        bVar.a(C1332b.class, dVar);
        j jVar = j.f5576a;
        bVar.a(F.e.class, jVar);
        bVar.a(M0.h.class, jVar);
        g gVar = g.f5556a;
        bVar.a(F.e.a.class, gVar);
        bVar.a(M0.i.class, gVar);
        h hVar = h.f5564a;
        bVar.a(F.e.a.b.class, hVar);
        bVar.a(M0.j.class, hVar);
        z zVar = z.f5664a;
        bVar.a(F.e.f.class, zVar);
        bVar.a(A.class, zVar);
        y yVar = y.f5659a;
        bVar.a(F.e.AbstractC0108e.class, yVar);
        bVar.a(M0.z.class, yVar);
        i iVar = i.f5566a;
        bVar.a(F.e.c.class, iVar);
        bVar.a(M0.k.class, iVar);
        t tVar = t.f5640a;
        bVar.a(F.e.d.class, tVar);
        bVar.a(M0.l.class, tVar);
        k kVar = k.f5589a;
        bVar.a(F.e.d.a.class, kVar);
        bVar.a(M0.m.class, kVar);
        m mVar = m.f5602a;
        bVar.a(F.e.d.a.b.class, mVar);
        bVar.a(M0.n.class, mVar);
        p pVar = p.f5618a;
        bVar.a(F.e.d.a.b.AbstractC0101e.class, pVar);
        bVar.a(M0.r.class, pVar);
        q qVar = q.f5622a;
        bVar.a(F.e.d.a.b.AbstractC0101e.AbstractC0103b.class, qVar);
        bVar.a(M0.s.class, qVar);
        n nVar = n.f5608a;
        bVar.a(F.e.d.a.b.c.class, nVar);
        bVar.a(M0.p.class, nVar);
        b bVar2 = b.f5524a;
        bVar.a(F.a.class, bVar2);
        bVar.a(C1333c.class, bVar2);
        C0109a c0109a = C0109a.f5520a;
        bVar.a(F.a.AbstractC0091a.class, c0109a);
        bVar.a(C1334d.class, c0109a);
        o oVar = o.f5614a;
        bVar.a(F.e.d.a.b.AbstractC0099d.class, oVar);
        bVar.a(M0.q.class, oVar);
        l lVar = l.f5597a;
        bVar.a(F.e.d.a.b.AbstractC0095a.class, lVar);
        bVar.a(M0.o.class, lVar);
        c cVar = c.f5534a;
        bVar.a(F.c.class, cVar);
        bVar.a(C1335e.class, cVar);
        r rVar = r.f5628a;
        bVar.a(F.e.d.a.c.class, rVar);
        bVar.a(M0.t.class, rVar);
        s sVar = s.f5633a;
        bVar.a(F.e.d.c.class, sVar);
        bVar.a(M0.u.class, sVar);
        u uVar = u.f5647a;
        bVar.a(F.e.d.AbstractC0106d.class, uVar);
        bVar.a(M0.v.class, uVar);
        x xVar = x.f5657a;
        bVar.a(F.e.d.f.class, xVar);
        bVar.a(M0.y.class, xVar);
        v vVar = v.f5649a;
        bVar.a(F.e.d.AbstractC0107e.class, vVar);
        bVar.a(M0.w.class, vVar);
        w wVar = w.f5654a;
        bVar.a(F.e.d.AbstractC0107e.b.class, wVar);
        bVar.a(M0.x.class, wVar);
        e eVar = e.f5550a;
        bVar.a(F.d.class, eVar);
        bVar.a(C1336f.class, eVar);
        f fVar = f.f5553a;
        bVar.a(F.d.b.class, fVar);
        bVar.a(C1337g.class, fVar);
    }
}
