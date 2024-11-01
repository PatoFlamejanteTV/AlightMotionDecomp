package Q7;

import Q5.I;
import Q5.t;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import c.C2000h;
import c.C2001i;
import c.C2002j;
import c.C2003k;
import c6.InterfaceC2072n;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.T;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.C3475q0;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f9074a = new m();

    /* renamed from: b, reason: collision with root package name */
    public static UUID f9075b = UUID.randomUUID();

    /* renamed from: c, reason: collision with root package name */
    public static g f9076c = Y7.d.f13152a.o();

    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9077a;

        static {
            int[] iArr = new int[f.values().length];
            iArr[1] = 1;
            iArr[5] = 2;
            iArr[0] = 3;
            iArr[2] = 4;
            iArr[3] = 5;
            iArr[4] = 6;
            f9077a = iArr;
            int[] iArr2 = new int[n.values().length];
            iArr2[5] = 1;
            iArr2[6] = 2;
            iArr2[4] = 3;
            int[] iArr3 = new int[Q7.a.values().length];
            iArr3[0] = 1;
            iArr3[2] = 2;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public int f9078a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f9079b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f9080c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f9081d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Boolean f9082e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ f f9083f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, Boolean bool, f fVar, U5.d dVar) {
            super(2, dVar);
            this.f9080c = str;
            this.f9081d = str2;
            this.f9082e = bool;
            this.f9083f = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            b bVar = new b(this.f9080c, this.f9081d, this.f9082e, this.f9083f, dVar);
            bVar.f9079b = obj;
            return bVar;
        }

        @Override // c6.InterfaceC2072n
        public Object invoke(Object obj, Object obj2) {
            return ((b) create((LiveDataScope) obj, (U5.d) obj2)).invokeSuspend(I.f8786a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            LiveDataScope liveDataScope;
            String str;
            String str2;
            Object e8 = V5.b.e();
            int i8 = this.f9078a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return I.f8786a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                liveDataScope = (LiveDataScope) this.f9079b;
                t.b(obj);
            } else {
                t.b(obj);
                liveDataScope = (LiveDataScope) this.f9079b;
                g gVar = m.f9076c;
                String str3 = this.f9080c;
                if (str3 != null && str3.length() != 0) {
                    str = this.f9080c;
                } else {
                    str = null;
                }
                String j8 = Y7.d.f13152a.m().j(X7.a.NON_IAB_CONSENT_ENCODED);
                String str4 = this.f9081d;
                if (str4.length() == 0) {
                    str2 = null;
                } else {
                    str2 = str4;
                }
                Boolean bool = this.f9082e;
                f fVar = this.f9083f;
                this.f9079b = liveDataScope;
                this.f9078a = 1;
                obj = g.c(gVar, bool, str, str2, j8, null, fVar, this, 16);
                if (obj == e8) {
                    return e8;
                }
            }
            this.f9079b = null;
            this.f9078a = 2;
            if (liveDataScope.emit((String) obj, this) == e8) {
                return e8;
            }
            return I.f8786a;
        }
    }

    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public int f9084a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f9085b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f9086c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Q7.a f9087d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f9088e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Q7.a aVar, int i8, U5.d dVar) {
            super(2, dVar);
            this.f9086c = str;
            this.f9087d = aVar;
            this.f9088e = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            c cVar = new c(this.f9086c, this.f9087d, this.f9088e, dVar);
            cVar.f9085b = obj;
            return cVar;
        }

        @Override // c6.InterfaceC2072n
        public Object invoke(Object obj, Object obj2) {
            c cVar = new c(this.f9086c, this.f9087d, this.f9088e, (U5.d) obj2);
            cVar.f9085b = (LiveDataScope) obj;
            return cVar.invokeSuspend(I.f8786a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            LiveDataScope liveDataScope;
            String str;
            Object a9;
            Object e8 = V5.b.e();
            int i8 = this.f9084a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return I.f8786a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                liveDataScope = (LiveDataScope) this.f9085b;
                t.b(obj);
                a9 = obj;
            } else {
                t.b(obj);
                liveDataScope = (LiveDataScope) this.f9085b;
                g gVar = m.f9076c;
                String j8 = Y7.d.f13152a.m().j(X7.a.GPP_STRING);
                if (AbstractC3292y.d(this.f9086c, "STATE_AND_NATIONAL")) {
                    str = Y7.d.f13165n;
                } else {
                    str = null;
                }
                String str2 = this.f9086c;
                Q7.a aVar = this.f9087d;
                int i9 = this.f9088e;
                this.f9085b = liveDataScope;
                this.f9084a = 1;
                gVar.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(gVar.f9044g);
                j jVar = new j(arrayList, aVar.f9011a, Q7.d.a(i9), null, j8, str, str2, null, null, 392);
                gVar.f9044g.clear();
                a9 = gVar.a(e.DONE, jVar, f.MSPA, this);
                if (a9 == e8) {
                    return e8;
                }
            }
            this.f9085b = null;
            this.f9084a = 2;
            if (liveDataScope.emit((String) a9, this) == e8) {
                return e8;
            }
            return I.f8786a;
        }
    }

    /* loaded from: classes5.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public int f9089a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ T f9090b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ T f9091c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(T t8, T t9, U5.d dVar) {
            super(2, dVar);
            this.f9090b = t8;
            this.f9091c = t9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new d(this.f9090b, this.f9091c, dVar);
        }

        @Override // c6.InterfaceC2072n
        public Object invoke(Object obj, Object obj2) {
            return new d(this.f9090b, this.f9091c, (U5.d) obj2).invokeSuspend(I.f8786a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f9089a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                g gVar = m.f9076c;
                f fVar = (f) this.f9090b.f34573a;
                Q7.c cVar = (Q7.c) this.f9091c.f34573a;
                this.f9089a = 1;
                if (gVar.b(fVar, cVar, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }
    }

    static {
        new LinkedHashMap();
        new LinkedHashMap();
    }

    public final LiveData a(n actionTag, Q7.a acceptanceState) {
        String valueOf;
        int i8;
        AbstractC3292y.i(actionTag, "actionTag");
        AbstractC3292y.i(acceptanceState, "acceptanceState");
        int ordinal = actionTag.ordinal();
        if (ordinal != 4) {
            if (ordinal != 5) {
                if (ordinal != 6) {
                    valueOf = String.valueOf(n.PARTIAL_CONSENT);
                } else {
                    valueOf = String.valueOf(n.REJECT_ALL);
                }
            } else {
                valueOf = String.valueOf(n.ACCEPT_ALL);
            }
        } else {
            valueOf = String.valueOf(n.SAVE_AND_EXIT);
        }
        int ordinal2 = acceptanceState.ordinal();
        if (ordinal2 != 0) {
            i8 = 2;
            if (ordinal2 != 2) {
                i8 = 3;
            }
        } else {
            i8 = 1;
        }
        f9076c.e(valueOf, CampaignEx.JSON_NATIVE_VIDEO_CLICK);
        return CoroutineLiveDataKt.liveData$default((U5.g) null, 0L, new c(Y7.d.f13152a.m().j(X7.a.SAVED_MSPA_JURISDICTION), acceptanceState, i8, null), 3, (Object) null);
    }

    public final LiveData b(n actionTag, f regulation) {
        String valueOf;
        Boolean bool;
        Boolean bool2;
        AbstractC3292y.i(actionTag, "actionTag");
        AbstractC3292y.i(regulation, "regulation");
        int ordinal = actionTag.ordinal();
        String str = null;
        if (ordinal != 4) {
            if (ordinal != 5) {
                if (ordinal != 6) {
                    bool2 = Boolean.FALSE;
                    valueOf = String.valueOf(n.PARTIAL_CONSENT);
                } else {
                    bool2 = Boolean.FALSE;
                    valueOf = String.valueOf(n.REJECT_ALL);
                }
            } else {
                bool2 = Boolean.TRUE;
                valueOf = String.valueOf(n.ACCEPT_ALL);
            }
            bool = bool2;
        } else {
            valueOf = String.valueOf(n.SAVE_AND_EXIT);
            bool = null;
        }
        if (a.f9077a[regulation.ordinal()] == 1) {
            str = Y7.d.f13152a.m().j(X7.a.TC_STRING);
        }
        String str2 = str;
        String j8 = Y7.d.f13152a.m().j(X7.a.GPP_STRING);
        f9076c.e(valueOf, CampaignEx.JSON_NATIVE_VIDEO_CLICK);
        return CoroutineLiveDataKt.liveData$default((U5.g) null, 0L, new b(str2, j8, bool, regulation, null), 3, (Object) null);
    }

    public final Object c(f fVar, int i8, U5.d dVar) {
        Object a9;
        f9076c.e("goToPage", String.valueOf(i8));
        g gVar = f9076c;
        if (gVar.f9044g.size() < 2) {
            a9 = "";
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(gVar.f9044g);
            k kVar = new k(arrayList);
            gVar.f9044g.clear();
            a9 = gVar.a(e.NAVIGATION, kVar, fVar, dVar);
        }
        if (a9 == V5.b.e()) {
            return a9;
        }
        return I.f8786a;
    }

    public final Object d(U5.d dVar) {
        String str;
        g gVar = f9076c;
        f fVar = f.GBC;
        C2001i c2001i = C2001i.f15172a;
        ArrayList arrayList = new ArrayList();
        C2001i.f15174c.forEach(new C2000h(arrayList));
        gVar.getClass();
        O o8 = new O();
        o8.f34569a = true;
        C2001i.f15174c.forEach(new C2002j(o8));
        if (o8.f34569a) {
            str = "All";
        } else {
            O o9 = new O();
            o9.f34569a = true;
            C2001i.f15174c.forEach(new C2003k(o9));
            if (o9.f34569a) {
                str = "Reject";
            } else {
                str = "Partial";
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(gVar.f9044g);
        l lVar = new l(arrayList2, str, arrayList);
        gVar.f9044g.clear();
        Object a9 = gVar.a(e.DONE, lVar, fVar, dVar);
        if (a9 == V5.b.e()) {
            return a9;
        }
        return I.f8786a;
    }

    public final void e(f regulation, boolean z8) {
        Q7.c cVar;
        Q7.c cVar2;
        AbstractC3292y.i(regulation, "regulation");
        T t8 = new T();
        t8.f34573a = regulation;
        T t9 = new T();
        Q7.c cVar3 = Q7.c.TCF_CHANGE_OF_CONSENT;
        t9.f34573a = cVar3;
        int ordinal = regulation.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                if (z8) {
                                    cVar2 = Q7.c.MSPA_MANDATORY;
                                } else if (Y7.d.f13152a.m().h(X7.a.MSPA_SHOWN)) {
                                    cVar2 = Q7.c.MSPA_CHANGE_OF_CONSENT;
                                } else {
                                    cVar2 = Q7.c.MSPA_OPT_OUT;
                                }
                                t9.f34573a = cVar2;
                            }
                        } else {
                            t9.f34573a = Q7.c.GBC_US_OPT_OUT;
                        }
                    } else {
                        if (z8) {
                            cVar = Q7.c.GBC_MANDATORY;
                        } else {
                            cVar = Q7.c.GBC_CHANGE_OF_CONSENT;
                        }
                        t9.f34573a = cVar;
                    }
                } else {
                    t9.f34573a = Q7.c.GBC;
                }
            } else {
                if (z8) {
                    cVar3 = Q7.c.TCF_MANDATORY;
                }
                t9.f34573a = cVar3;
            }
        } else {
            t9.f34573a = Q7.c.USP;
        }
        if (regulation == f.GDPRWITHGBC || regulation == f.USPWITHGBC) {
            t8.f34573a = f.GBC;
        }
        f9076c.e("startOnPage", t8.f34573a + "_1");
        f9075b = UUID.randomUUID();
        AbstractC3462k.d(C3475q0.f35747a, C3445b0.b(), null, new d(t8, t9, null), 2, null);
    }

    public final void f(String identifier, String value) {
        AbstractC3292y.i(identifier, "identifier");
        AbstractC3292y.i(value, "value");
        f9076c.e(identifier, value);
    }
}
