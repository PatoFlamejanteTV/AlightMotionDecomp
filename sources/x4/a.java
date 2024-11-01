package X4;

import Q5.I;
import Q5.t;
import R5.AbstractC1435t;
import android.content.Context;
import b5.InterfaceC1984h;
import c5.C2041f;
import c5.C2052q;
import c5.F;
import c5.K;
import c6.InterfaceC2072n;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.activities.preferences.SettingsPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.Q;
import kotlin.jvm.internal.T;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.J0;
import n6.M;
import org.json.JSONArray;
import org.json.JSONObject;
import q5.C3775H;
import q5.C3784i;
import q5.C3791p;
import q5.C3800y;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private Context f11207a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC1984h f11208b;

    /* renamed from: c, reason: collision with root package name */
    private final M f11209c;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f11210d;

    /* renamed from: X4.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static final class C0240a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f11211a;

        C0240a(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new C0240a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f11211a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                a aVar = a.this;
                this.f11211a = 1;
                if (aVar.f(this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((C0240a) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f11213a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Q f11215c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f11216d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ T f11217e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: X4.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0241a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11218a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f11219b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ArrayList f11220c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ T f11221d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Q f11222e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0241a(a aVar, ArrayList arrayList, T t8, Q q8, U5.d dVar) {
                super(2, dVar);
                this.f11219b = aVar;
                this.f11220c = arrayList;
                this.f11221d = t8;
                this.f11222e = q8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new C0241a(this.f11219b, this.f11220c, this.f11221d, this.f11222e, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11218a == 0) {
                    t.b(obj);
                    ArrayList arrayList = this.f11219b.f11210d;
                    if (arrayList == null || arrayList.isEmpty()) {
                        InterfaceC1984h interfaceC1984h = this.f11219b.f11208b;
                        if (interfaceC1984h != null) {
                            interfaceC1984h.b();
                            return I.f8786a;
                        }
                        return null;
                    }
                    if (this.f11219b.f11208b == null) {
                        if (!this.f11220c.isEmpty()) {
                            C3800y.f37330a.n(this.f11219b.f11207a, this.f11220c.size(), (String) this.f11221d.f34573a);
                        }
                    } else if (this.f11222e.f34571a == 1) {
                        InterfaceC1984h interfaceC1984h2 = this.f11219b.f11208b;
                        AbstractC3292y.f(interfaceC1984h2);
                        ArrayList arrayList2 = this.f11219b.f11210d;
                        AbstractC3292y.f(arrayList2);
                        interfaceC1984h2.a(arrayList2);
                    } else {
                        InterfaceC1984h interfaceC1984h3 = this.f11219b.f11208b;
                        AbstractC3292y.f(interfaceC1984h3);
                        interfaceC1984h3.b();
                    }
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((C0241a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Q q8, ArrayList arrayList, T t8, U5.d dVar) {
            super(2, dVar);
            this.f11215c = q8;
            this.f11216d = arrayList;
            this.f11217e = t8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(this.f11215c, this.f11216d, this.f11217e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            Object obj2;
            Object e8 = V5.b.e();
            int i8 = this.f11213a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                try {
                    new C3784i().g(new C3784i().C(a.this.f11207a), a.this.f11207a);
                    C2052q c2052q = new C2052q();
                    c2052q.h(a.this.f11207a);
                    C3775H c3775h = new C3775H(a.this.f11207a);
                    if (c2052q.d() != null) {
                        String d8 = c2052q.d();
                        AbstractC3292y.f(d8);
                        K N8 = c3775h.N(d8);
                        if (!N8.b() && N8.d() != null) {
                            String d9 = N8.d();
                            AbstractC3292y.f(d9);
                            JSONObject jSONObject = new JSONObject(d9);
                            if (!jSONObject.isNull("success")) {
                                this.f11215c.f34571a = jSONObject.getInt("success");
                                if (this.f11215c.f34571a == 1 && !jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                                    a.this.f11210d = new ArrayList();
                                    JSONArray jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                                    int length = jSONArray.length();
                                    for (int i9 = 0; i9 < length; i9++) {
                                        JSONObject jSONObject2 = jSONArray.getJSONObject(i9);
                                        F f8 = new F();
                                        AbstractC3292y.f(jSONObject2);
                                        f8.a(jSONObject2);
                                        ArrayList arrayList = a.this.f11210d;
                                        AbstractC3292y.f(arrayList);
                                        arrayList.add(f8);
                                    }
                                }
                            }
                        }
                    }
                    ArrayList arrayList2 = a.this.f11210d;
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        C3791p a9 = C3791p.f37286s.a(a.this.f11207a);
                        a9.a();
                        ArrayList V8 = a9.V();
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = a.this.f11210d;
                        AbstractC3292y.f(arrayList4);
                        int size = arrayList4.size();
                        int i10 = 0;
                        while (true) {
                            str = null;
                            if (i10 >= size) {
                                break;
                            }
                            int size2 = V8.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 >= size2) {
                                    break;
                                }
                                String X8 = ((C2041f) V8.get(i11)).X();
                                if (X8 != null) {
                                    ArrayList arrayList5 = a.this.f11210d;
                                    AbstractC3292y.f(arrayList5);
                                    if (l6.n.s(X8, ((F) arrayList5.get(i10)).c(), true)) {
                                        ArrayList arrayList6 = a.this.f11210d;
                                        AbstractC3292y.f(arrayList6);
                                        arrayList3.add(arrayList6.get(i10));
                                        Object obj3 = V8.get(i11);
                                        AbstractC3292y.h(obj3, "get(...)");
                                        C2041f c2041f = (C2041f) obj3;
                                        if (c2041f.W() == 0) {
                                            c2041f.F0(1);
                                            a9.k1(c2041f);
                                            ArrayList arrayList7 = a.this.f11210d;
                                            AbstractC3292y.f(arrayList7);
                                            Iterator it = arrayList7.iterator();
                                            AbstractC3292y.h(it, "iterator(...)");
                                            while (true) {
                                                if (it.hasNext()) {
                                                    Object next = it.next();
                                                    AbstractC3292y.h(next, "next(...)");
                                                    F f9 = (F) next;
                                                    if (l6.n.t(f9.c(), c2041f.X(), false, 2, null)) {
                                                        this.f11216d.add(f9);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                i11++;
                            }
                            i10++;
                        }
                        a9.i();
                        a.this.f11210d = arrayList3;
                        if (this.f11216d.size() == 1) {
                            ArrayList arrayList8 = this.f11216d;
                            Iterator it2 = V8.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj2 = it2.next();
                                    if (AbstractC3292y.d(((C2041f) obj2).X(), ((F) AbstractC1435t.m0(arrayList8)).c())) {
                                        break;
                                    }
                                } else {
                                    obj2 = null;
                                    break;
                                }
                            }
                            C2041f c2041f2 = (C2041f) obj2;
                            T t8 = this.f11217e;
                            if (c2041f2 != null) {
                                str = c2041f2.z();
                            }
                            t8.f34573a = str;
                        }
                    }
                    SettingsPreferences.f30529b.I0(a.this.f11207a, System.currentTimeMillis());
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
                J0 c8 = C3445b0.c();
                C0241a c0241a = new C0241a(a.this, this.f11216d, this.f11217e, this.f11215c, null);
                this.f11213a = 1;
                obj = AbstractC3458i.g(c8, c0241a, this);
                if (obj == e8) {
                    return e8;
                }
            }
            return obj;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public a(Context context, InterfaceC1984h interfaceC1984h, M scope) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(scope, "scope");
        this.f11207a = context;
        this.f11208b = interfaceC1984h;
        this.f11209c = scope;
        AbstractC3462k.d(scope, null, null, new C0240a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f(U5.d dVar) {
        return AbstractC3458i.g(C3445b0.b(), new b(new Q(), new ArrayList(), new T(), null), dVar);
    }
}
