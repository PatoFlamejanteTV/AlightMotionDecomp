package com.uptodown.activities;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import c5.G;
import c6.InterfaceC2072n;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.J0;
import org.json.JSONArray;
import org.json.JSONObject;
import q5.AbstractC3768A;
import q5.C3775H;
import q5.C3795t;
import q6.AbstractC3815N;
import q6.InterfaceC3813L;

/* loaded from: classes4.dex */
public final class A extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final q6.w f29339a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3813L f29340b;

    /* renamed from: c, reason: collision with root package name */
    private final q6.w f29341c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3813L f29342d;

    /* renamed from: e, reason: collision with root package name */
    private final q6.w f29343e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f29344f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f29345g;

    /* renamed from: h, reason: collision with root package name */
    private final int f29346h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f29347a = new a("NAME", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f29348b = new a("DATE", 1);

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ a[] f29349c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ W5.a f29350d;

        static {
            a[] a9 = a();
            f29349c = a9;
            f29350d = W5.b.a(a9);
        }

        private a(String str, int i8) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f29347a, f29348b};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f29349c.clone();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f29351a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f29352b;

        public b(ArrayList userPreRegisterApps, ArrayList preRegisterApps) {
            AbstractC3292y.i(userPreRegisterApps, "userPreRegisterApps");
            AbstractC3292y.i(preRegisterApps, "preRegisterApps");
            this.f29351a = userPreRegisterApps;
            this.f29352b = preRegisterApps;
        }

        public final ArrayList a() {
            return this.f29352b;
        }

        public final ArrayList b() {
            return this.f29351a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3292y.d(this.f29351a, bVar.f29351a) && AbstractC3292y.d(this.f29352b, bVar.f29352b);
        }

        public int hashCode() {
            return (this.f29351a.hashCode() * 31) + this.f29352b.hashCode();
        }

        public String toString() {
            return "UpcomingReleasesData(userPreRegisterApps=" + this.f29351a + ", preRegisterApps=" + this.f29352b + ')';
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29353a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f29354b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c5.G f29355c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f29356d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f29357a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0 f29358b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Function0 function0, U5.d dVar) {
                super(2, dVar);
                this.f29358b = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f29358b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f29357a == 0) {
                    Q5.t.b(obj);
                    this.f29358b.invoke();
                    return Q5.I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(n6.M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, c5.G g8, Function0 function0, U5.d dVar) {
            super(2, dVar);
            this.f29354b = context;
            this.f29355c = g8;
            this.f29356d = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(this.f29354b, this.f29355c, this.f29356d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            Object e8 = V5.b.e();
            int i8 = this.f29353a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                c5.K d9 = new C3775H(this.f29354b).d(this.f29355c.b());
                if (!d9.b() && (d8 = d9.d()) != null && d8.length() != 0) {
                    String d10 = d9.d();
                    AbstractC3292y.f(d10);
                    JSONObject jSONObject = new JSONObject(d10);
                    if (!jSONObject.isNull("success") && jSONObject.getInt("success") == 1) {
                        Bundle bundle = new Bundle();
                        bundle.putString("type", "removed");
                        new C3795t(this.f29354b).e("preregister", bundle);
                        this.f29355c.i(this.f29354b);
                        J0 c8 = C3445b0.c();
                        a aVar = new a(this.f29356d, null);
                        this.f29353a = 1;
                        if (AbstractC3458i.g(c8, aVar, this) == e8) {
                            return e8;
                        }
                    }
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f29359a;

        /* renamed from: b, reason: collision with root package name */
        int f29360b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f29362d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f29363e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ a f29364f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f29365g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z8, Context context, a aVar, boolean z9, U5.d dVar) {
            super(2, dVar);
            this.f29362d = z8;
            this.f29363e = context;
            this.f29364f = aVar;
            this.f29365g = z9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new d(this.f29362d, this.f29363e, this.f29364f, this.f29365g, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            q6.w wVar;
            q6.w wVar2;
            Object e8 = V5.b.e();
            int i8 = this.f29360b;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        wVar2 = (q6.w) this.f29359a;
                        Q5.t.b(obj);
                        wVar2.setValue(obj);
                        A.this.f29339a.setValue(new AbstractC3768A.c(new b((ArrayList) A.this.f29341c.getValue(), (ArrayList) A.this.f29343e.getValue())));
                        return Q5.I.f8786a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wVar = (q6.w) this.f29359a;
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                A.this.r(false);
                if (this.f29362d) {
                    A.this.f29339a.setValue(AbstractC3768A.a.f37253a);
                }
                wVar = A.this.f29341c;
                A a9 = A.this;
                Context context = this.f29363e;
                this.f29359a = wVar;
                this.f29360b = 1;
                obj = a9.p(context, this);
                if (obj == e8) {
                    return e8;
                }
            }
            wVar.setValue(obj);
            q6.w wVar3 = A.this.f29343e;
            A a10 = A.this;
            Context context2 = this.f29363e;
            a aVar = this.f29364f;
            boolean z8 = this.f29365g;
            this.f29359a = wVar3;
            this.f29360b = 2;
            Object n8 = A.n(a10, context2, aVar, z8, 0, this, 8, null);
            if (n8 == e8) {
                return e8;
            }
            wVar2 = wVar3;
            obj = n8;
            wVar2.setValue(obj);
            A.this.f29339a.setValue(new AbstractC3768A.c(new b((ArrayList) A.this.f29341c.getValue(), (ArrayList) A.this.f29343e.getValue())));
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29366a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f29368c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f29369d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f29370e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context, a aVar, boolean z8, U5.d dVar) {
            super(2, dVar);
            this.f29368c = context;
            this.f29369d = aVar;
            this.f29370e = z8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new e(this.f29368c, this.f29369d, this.f29370e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f29366a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                A a9 = A.this;
                Context context = this.f29368c;
                a aVar = this.f29369d;
                boolean z8 = this.f29370e;
                int size = ((ArrayList) a9.f29343e.getValue()).size();
                this.f29366a = 1;
                obj = a9.m(context, aVar, z8, size, this);
                if (obj == e8) {
                    return e8;
                }
            }
            ArrayList arrayList = (ArrayList) obj;
            if (!arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll((Collection) A.this.f29343e.getValue());
                arrayList2.addAll(arrayList);
                A.this.f29343e.setValue(arrayList2);
                A.this.f29339a.setValue(new AbstractC3768A.c(new b((ArrayList) A.this.f29341c.getValue(), (ArrayList) A.this.f29343e.getValue())));
            } else {
                A.this.f29339a.setValue(AbstractC3768A.b.f37254a);
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29371a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f29373c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f29374d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ a f29375e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f29376f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Context context, boolean z8, a aVar, int i8, U5.d dVar) {
            super(2, dVar);
            this.f29373c = context;
            this.f29374d = z8;
            this.f29375e = aVar;
            this.f29376f = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new f(this.f29373c, this.f29374d, this.f29375e, this.f29376f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            String str2;
            V5.b.e();
            if (this.f29371a == 0) {
                Q5.t.b(obj);
                A.this.s(true);
                ArrayList arrayList = new ArrayList();
                C3775H c3775h = new C3775H(this.f29373c);
                if (this.f29374d) {
                    str = CampaignEx.JSON_KEY_DESC;
                } else {
                    str = "asc";
                }
                if (this.f29375e == a.f29348b) {
                    str2 = "expireDate";
                } else {
                    str2 = "name";
                }
                c5.K O8 = c3775h.O(A.this.f29346h, this.f29376f, str2, str);
                if (!O8.b() && O8.d() != null) {
                    String d8 = O8.d();
                    AbstractC3292y.f(d8);
                    if (d8.length() > 0) {
                        String d9 = O8.d();
                        AbstractC3292y.f(d9);
                        JSONObject jSONObject = new JSONObject(d9);
                        if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            JSONArray jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                            int length = jSONArray.length();
                            for (int i8 = 0; i8 < length; i8++) {
                                JSONObject jSONObject2 = jSONArray.getJSONObject(i8);
                                G.a aVar = c5.G.f15593e;
                                AbstractC3292y.f(jSONObject2);
                                arrayList.add(aVar.b(jSONObject2));
                            }
                        } else if (jSONObject.getInt("success") == 1) {
                            A.this.r(true);
                        }
                    }
                }
                A.this.s(false);
                return arrayList;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29377a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f29378b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Context context, U5.d dVar) {
            super(2, dVar);
            this.f29378b = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new g(this.f29378b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            V5.b.e();
            if (this.f29377a == 0) {
                Q5.t.b(obj);
                ArrayList arrayList = new ArrayList();
                c5.K P8 = new C3775H(this.f29378b).P();
                if (!P8.b() && (d8 = P8.d()) != null && d8.length() != 0) {
                    String d9 = P8.d();
                    AbstractC3292y.f(d9);
                    JSONObject jSONObject = new JSONObject(d9);
                    if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                        JSONArray jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                        int length = jSONArray.length();
                        for (int i8 = 0; i8 < length; i8++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i8);
                            G.a aVar = c5.G.f15593e;
                            AbstractC3292y.f(jSONObject2);
                            arrayList.add(aVar.b(jSONObject2));
                        }
                    }
                }
                return arrayList;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29379a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f29380b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c5.G f29381c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f29382d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f29383a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0 f29384b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Function0 function0, U5.d dVar) {
                super(2, dVar);
                this.f29384b = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f29384b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f29383a == 0) {
                    Q5.t.b(obj);
                    this.f29384b.invoke();
                    return Q5.I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(n6.M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Context context, c5.G g8, Function0 function0, U5.d dVar) {
            super(2, dVar);
            this.f29380b = context;
            this.f29381c = g8;
            this.f29382d = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new h(this.f29380b, this.f29381c, this.f29382d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            Object e8 = V5.b.e();
            int i8 = this.f29379a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                c5.K a9 = new C3775H(this.f29380b).a(this.f29381c.b());
                if (!a9.b() && (d8 = a9.d()) != null && d8.length() != 0) {
                    String d9 = a9.d();
                    AbstractC3292y.f(d9);
                    JSONObject jSONObject = new JSONObject(d9);
                    if (!jSONObject.isNull("success") && jSONObject.getInt("success") == 1) {
                        Bundle bundle = new Bundle();
                        bundle.putString("type", "added");
                        new C3795t(this.f29380b).e("preregister", bundle);
                        this.f29381c.h(this.f29380b);
                        J0 c8 = C3445b0.c();
                        a aVar = new a(this.f29382d, null);
                        this.f29379a = 1;
                        if (AbstractC3458i.g(c8, aVar, this) == e8) {
                            return e8;
                        }
                    }
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    public A() {
        q6.w a9 = AbstractC3815N.a(AbstractC3768A.a.f37253a);
        this.f29339a = a9;
        this.f29340b = a9;
        q6.w a10 = AbstractC3815N.a(new ArrayList());
        this.f29341c = a10;
        this.f29342d = a10;
        this.f29343e = AbstractC3815N.a(new ArrayList());
        this.f29346h = 40;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object m(Context context, a aVar, boolean z8, int i8, U5.d dVar) {
        return AbstractC3458i.g(C3445b0.b(), new f(context, z8, aVar, i8, null), dVar);
    }

    static /* synthetic */ Object n(A a9, Context context, a aVar, boolean z8, int i8, U5.d dVar, int i9, Object obj) {
        int i10;
        if ((i9 & 8) != 0) {
            i10 = 0;
        } else {
            i10 = i8;
        }
        return a9.m(context, aVar, z8, i10, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object p(Context context, U5.d dVar) {
        return AbstractC3458i.g(C3445b0.b(), new g(context, null), dVar);
    }

    public final void g(Context context, c5.G preRegister, Function0 callback) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(preRegister, "preRegister");
        AbstractC3292y.i(callback, "callback");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new c(context, preRegister, callback, null), 2, null);
    }

    public final void h(Context context, a sortByActive, boolean z8, boolean z9) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(sortByActive, "sortByActive");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new d(z9, context, sortByActive, z8, null), 2, null);
    }

    public final void i(Context context, a sortByActive, boolean z8) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(sortByActive, "sortByActive");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new e(context, sortByActive, z8, null), 2, null);
    }

    public final boolean j() {
        return this.f29344f;
    }

    public final InterfaceC3813L k() {
        return this.f29340b;
    }

    public final boolean l() {
        return this.f29345g;
    }

    public final InterfaceC3813L o() {
        return this.f29342d;
    }

    public final void q(Context context, c5.G preRegister, Function0 callback) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(preRegister, "preRegister");
        AbstractC3292y.i(callback, "callback");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new h(context, preRegister, callback, null), 2, null);
    }

    public final void r(boolean z8) {
        this.f29344f = z8;
    }

    public final void s(boolean z8) {
        this.f29345g = z8;
    }
}
