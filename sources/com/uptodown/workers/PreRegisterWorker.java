package com.uptodown.workers;

import J4.j;
import Q5.I;
import Q5.t;
import X4.i;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import b5.r;
import c5.C2043h;
import c5.G;
import c5.K;
import c6.InterfaceC2072n;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.squareup.picasso.s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.M;
import n6.N;
import org.json.JSONArray;
import org.json.JSONObject;
import q5.C3775H;
import q5.C3791p;
import q5.C3800y;

/* loaded from: classes5.dex */
public final class PreRegisterWorker extends Worker {

    /* renamed from: b, reason: collision with root package name */
    public static final a f31233b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private Context f31234a;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f31235a;

        /* loaded from: classes5.dex */
        public static final class a implements r {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PreRegisterWorker f31237a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ G f31238b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f31239c;

            a(PreRegisterWorker preRegisterWorker, G g8, int i8) {
                this.f31237a = preRegisterWorker;
                this.f31238b = g8;
                this.f31239c = i8;
            }

            @Override // b5.r
            public void b(int i8) {
            }

            @Override // b5.r
            public void c(C2043h appInfo) {
                AbstractC3292y.i(appInfo, "appInfo");
                this.f31237a.g(this.f31238b, appInfo, this.f31239c);
            }
        }

        b(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f31235a == 0) {
                t.b(obj);
                ArrayList arrayList = new ArrayList();
                K P8 = new C3775H(PreRegisterWorker.this.f31234a).P();
                if (!P8.b() && P8.d() != null) {
                    String d8 = P8.d();
                    AbstractC3292y.f(d8);
                    if (d8.length() > 0) {
                        String d9 = P8.d();
                        AbstractC3292y.f(d9);
                        JSONObject jSONObject = new JSONObject(d9);
                        if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            JSONArray jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                            int length = jSONArray.length();
                            for (int i8 = 0; i8 < length; i8++) {
                                G.a aVar = G.f15593e;
                                JSONObject jSONObject2 = jSONArray.getJSONObject(i8);
                                AbstractC3292y.h(jSONObject2, "getJSONObject(...)");
                                G b9 = aVar.b(jSONObject2);
                                arrayList.add(b9);
                                b9.h(PreRegisterWorker.this.f31234a);
                            }
                        }
                        C3791p a9 = C3791p.f37286s.a(PreRegisterWorker.this.f31234a);
                        a9.a();
                        ArrayList<G> o02 = a9.o0();
                        a9.i();
                        int i9 = 0;
                        for (G g8 : o02) {
                            int i10 = i9 + 1;
                            Iterator it = arrayList.iterator();
                            AbstractC3292y.h(it, "iterator(...)");
                            boolean z8 = false;
                            while (it.hasNext()) {
                                Object next = it.next();
                                AbstractC3292y.h(next, "next(...)");
                                if (g8.b() == ((G) next).b()) {
                                    z8 = true;
                                }
                            }
                            if (!z8) {
                                new i(PreRegisterWorker.this.f31234a, g8.b(), new a(PreRegisterWorker.this, g8, i9), N.a(C3445b0.b()));
                            }
                            i9 = i10;
                        }
                    }
                }
                return I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f31240a;

        c(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f31240a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                PreRegisterWorker preRegisterWorker = PreRegisterWorker.this;
                this.f31240a = 1;
                if (preRegisterWorker.e(this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f31242a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f31243b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ PreRegisterWorker f31244c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C2043h f31245d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f31246e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ G f31247f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, PreRegisterWorker preRegisterWorker, C2043h c2043h, int i8, G g8, U5.d dVar) {
            super(2, dVar);
            this.f31243b = str;
            this.f31244c = preRegisterWorker;
            this.f31245d = c2043h;
            this.f31246e = i8;
            this.f31247f = g8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new d(this.f31243b, this.f31244c, this.f31245d, this.f31246e, this.f31247f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Bitmap bitmap;
            V5.b.e();
            if (this.f31242a == 0) {
                t.b(obj);
                try {
                    bitmap = s.h().l(this.f31243b).g();
                } catch (IOException unused) {
                    bitmap = null;
                }
                C3800y.f37330a.o(this.f31244c.f31234a, this.f31245d, this.f31246e, bitmap, this.f31247f);
                return I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class e implements m2.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f31249b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ G f31250c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C2043h f31251d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f31252e;

        /* loaded from: classes5.dex */
        static final class a extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f31253a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ PreRegisterWorker f31254b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f31255c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ G f31256d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C2043h f31257e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f31258f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(PreRegisterWorker preRegisterWorker, String str, G g8, C2043h c2043h, int i8, U5.d dVar) {
                super(2, dVar);
                this.f31254b = preRegisterWorker;
                this.f31255c = str;
                this.f31256d = g8;
                this.f31257e = c2043h;
                this.f31258f = i8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f31254b, this.f31255c, this.f31256d, this.f31257e, this.f31258f, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.f31253a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    PreRegisterWorker preRegisterWorker = this.f31254b;
                    String str = this.f31255c;
                    G g8 = this.f31256d;
                    C2043h c2043h = this.f31257e;
                    int i9 = this.f31258f;
                    this.f31253a = 1;
                    if (preRegisterWorker.f(str, g8, c2043h, i9, this) == e8) {
                        return e8;
                    }
                }
                return I.f8786a;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        e(String str, G g8, C2043h c2043h, int i8) {
            this.f31249b = str;
            this.f31250c = g8;
            this.f31251d = c2043h;
            this.f31252e = i8;
        }

        @Override // m2.b
        public void a(Exception exc) {
            C3800y.f37330a.o(PreRegisterWorker.this.f31234a, this.f31251d, this.f31252e, null, this.f31250c);
        }

        @Override // m2.b
        public void b() {
            AbstractC3462k.d(N.a(C3445b0.b()), null, null, new a(PreRegisterWorker.this, this.f31249b, this.f31250c, this.f31251d, this.f31252e, null), 3, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreRegisterWorker(Context context, WorkerParameters params) {
        super(context, params);
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(params, "params");
        this.f31234a = context;
        this.f31234a = j.f4395g.a(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object e(U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new b(null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f(String str, G g8, C2043h c2043h, int i8, U5.d dVar) {
        Object g9 = AbstractC3458i.g(C3445b0.b(), new d(str, this, c2043h, i8, g8, null), dVar);
        if (g9 == V5.b.e()) {
            return g9;
        }
        return I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(G g8, C2043h c2043h, int i8) {
        String j02 = c2043h.j0();
        if (j02 != null) {
            s.h().l(j02).e(new e(j02, g8, c2043h, i8));
        } else {
            C3800y.f37330a.o(this.f31234a, c2043h, i8, null, g8);
        }
    }

    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() {
        ListenableWorker.Result success = ListenableWorker.Result.success();
        AbstractC3292y.h(success, "success(...)");
        try {
            AbstractC3462k.d(N.a(C3445b0.b()), null, null, new c(null), 3, null);
            return success;
        } catch (Exception e8) {
            e8.printStackTrace();
            return ListenableWorker.Result.failure();
        }
    }
}
