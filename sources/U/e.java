package u;

import C.C0963g;
import C.C0964h;
import C.C0965i;
import C.C0966j;
import C.InterfaceC0960d;
import C.N;
import C.X;
import android.content.Context;
import u.v;
import v.C4114j;
import v.C4116l;
import w.C4138a;
import w.InterfaceC4139b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class b implements v.a {

        /* renamed from: a, reason: collision with root package name */
        private Context f40113a;

        private b() {
        }

        @Override // u.v.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(Context context) {
            this.f40113a = (Context) w.d.b(context);
            return this;
        }

        @Override // u.v.a
        public v build() {
            w.d.a(this.f40113a, Context.class);
            return new c(this.f40113a);
        }
    }

    /* loaded from: classes3.dex */
    private static final class c extends v {

        /* renamed from: a, reason: collision with root package name */
        private final c f40114a;

        /* renamed from: b, reason: collision with root package name */
        private N5.a f40115b;

        /* renamed from: c, reason: collision with root package name */
        private N5.a f40116c;

        /* renamed from: d, reason: collision with root package name */
        private N5.a f40117d;

        /* renamed from: e, reason: collision with root package name */
        private N5.a f40118e;

        /* renamed from: f, reason: collision with root package name */
        private N5.a f40119f;

        /* renamed from: g, reason: collision with root package name */
        private N5.a f40120g;

        /* renamed from: h, reason: collision with root package name */
        private N5.a f40121h;

        /* renamed from: i, reason: collision with root package name */
        private N5.a f40122i;

        /* renamed from: j, reason: collision with root package name */
        private N5.a f40123j;

        /* renamed from: k, reason: collision with root package name */
        private N5.a f40124k;

        /* renamed from: l, reason: collision with root package name */
        private N5.a f40125l;

        /* renamed from: m, reason: collision with root package name */
        private N5.a f40126m;

        /* renamed from: n, reason: collision with root package name */
        private N5.a f40127n;

        private void g(Context context) {
            this.f40115b = C4138a.a(k.a());
            InterfaceC4139b a9 = w.c.a(context);
            this.f40116c = a9;
            C4114j a10 = C4114j.a(a9, E.c.a(), E.d.a());
            this.f40117d = a10;
            this.f40118e = C4138a.a(C4116l.a(this.f40116c, a10));
            this.f40119f = X.a(this.f40116c, C0963g.a(), C0965i.a());
            this.f40120g = C4138a.a(C0964h.a(this.f40116c));
            this.f40121h = C4138a.a(N.a(E.c.a(), E.d.a(), C0966j.a(), this.f40119f, this.f40120g));
            A.g b9 = A.g.b(E.c.a());
            this.f40122i = b9;
            A.i a11 = A.i.a(this.f40116c, this.f40121h, b9, E.d.a());
            this.f40123j = a11;
            N5.a aVar = this.f40115b;
            N5.a aVar2 = this.f40118e;
            N5.a aVar3 = this.f40121h;
            this.f40124k = A.d.a(aVar, aVar2, a11, aVar3, aVar3);
            N5.a aVar4 = this.f40116c;
            N5.a aVar5 = this.f40118e;
            N5.a aVar6 = this.f40121h;
            this.f40125l = B.s.a(aVar4, aVar5, aVar6, this.f40123j, this.f40115b, aVar6, E.c.a(), E.d.a(), this.f40121h);
            N5.a aVar7 = this.f40115b;
            N5.a aVar8 = this.f40121h;
            this.f40126m = B.w.a(aVar7, aVar8, this.f40123j, aVar8);
            this.f40127n = C4138a.a(w.a(E.c.a(), E.d.a(), this.f40124k, this.f40125l, this.f40126m));
        }

        @Override // u.v
        InterfaceC0960d a() {
            return (InterfaceC0960d) this.f40121h.get();
        }

        @Override // u.v
        u b() {
            return (u) this.f40127n.get();
        }

        private c(Context context) {
            this.f40114a = this;
            g(context);
        }
    }

    public static v.a a() {
        return new b();
    }
}
