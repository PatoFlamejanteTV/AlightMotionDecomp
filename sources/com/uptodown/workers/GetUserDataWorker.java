package com.uptodown.workers;

import Q5.I;
import Q5.t;
import U5.d;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import b5.H;
import c5.K;
import c5.T;
import c6.InterfaceC2072n;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.M;
import n6.N;
import org.json.JSONObject;
import q5.C3775H;

/* loaded from: classes5.dex */
public final class GetUserDataWorker extends Worker {

    /* renamed from: b, reason: collision with root package name */
    public static final a f31222b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private Context f31223a;

    /* loaded from: classes5.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.workers.GetUserDataWorker$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0711a extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f31224a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Context f31225b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0711a(Context context, d dVar) {
                super(2, dVar);
                this.f31225b = context;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new C0711a(this.f31225b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                String d8;
                int i8;
                V5.b.e();
                if (this.f31224a == 0) {
                    t.b(obj);
                    K r02 = new C3775H(this.f31225b).r0();
                    if (!r02.b() && (d8 = r02.d()) != null && d8.length() != 0) {
                        String d9 = r02.d();
                        AbstractC3292y.f(d9);
                        JSONObject jSONObject = new JSONObject(d9);
                        if (!jSONObject.isNull("success")) {
                            i8 = jSONObject.getInt("success");
                        } else {
                            i8 = 0;
                        }
                        if (i8 == 1 && !jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            T e8 = T.f15689k.e(this.f31225b);
                            JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                            if (e8 != null) {
                                Context context = this.f31225b;
                                AbstractC3292y.f(jSONObject2);
                                e8.l(context, jSONObject2);
                            }
                            if (e8 != null) {
                                e8.I(this.f31225b);
                            }
                        }
                    }
                    if (r02.e() == 401) {
                        T.f15689k.a(this.f31225b);
                    }
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, d dVar) {
                return ((C0711a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class b extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f31226a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Context f31227b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ H f31228c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Context context, H h8, d dVar) {
                super(2, dVar);
                this.f31227b = context;
                this.f31228c = h8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new b(this.f31227b, this.f31228c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                String d8;
                int i8;
                V5.b.e();
                if (this.f31226a == 0) {
                    t.b(obj);
                    K r02 = new C3775H(this.f31227b).r0();
                    if (!r02.b() && (d8 = r02.d()) != null && d8.length() != 0) {
                        String d9 = r02.d();
                        AbstractC3292y.f(d9);
                        JSONObject jSONObject = new JSONObject(d9);
                        if (!jSONObject.isNull("success")) {
                            i8 = jSONObject.getInt("success");
                        } else {
                            i8 = 0;
                        }
                        if (i8 == 1 && !jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            T e8 = T.f15689k.e(this.f31227b);
                            JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                            if (e8 != null) {
                                Context context = this.f31227b;
                                AbstractC3292y.f(jSONObject2);
                                e8.l(context, jSONObject2);
                            }
                            if (e8 != null) {
                                e8.I(this.f31227b);
                            }
                            if (e8 != null) {
                                this.f31228c.a();
                            }
                        }
                    }
                    if (r02.e() == 401) {
                        T.f15689k.a(this.f31227b);
                    }
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        private a() {
        }

        public final Object a(Context context, d dVar) {
            Object g8 = AbstractC3458i.g(C3445b0.b(), new C0711a(context, null), dVar);
            if (g8 == V5.b.e()) {
                return g8;
            }
            return I.f8786a;
        }

        public final Object b(Context context, H h8, d dVar) {
            Object g8 = AbstractC3458i.g(C3445b0.b(), new b(context, h8, null), dVar);
            if (g8 == V5.b.e()) {
                return g8;
            }
            return I.f8786a;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f31229a;

        b(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f31229a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                a aVar = GetUserDataWorker.f31222b;
                Context context = GetUserDataWorker.this.f31223a;
                this.f31229a = 1;
                if (aVar.a(context, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetUserDataWorker(Context context, WorkerParameters params) {
        super(context, params);
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(params, "params");
        this.f31223a = context;
    }

    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() {
        AbstractC3462k.d(N.a(C3445b0.b()), null, null, new b(null), 3, null);
        ListenableWorker.Result success = ListenableWorker.Result.success();
        AbstractC3292y.h(success, "success(...)");
        return success;
    }
}
