package U7;

import Q5.I;
import c.C2001i;
import c6.InterfaceC2072n;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.data.storage.SharedStorage;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.C3475q0;

/* loaded from: classes5.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    public final SharedStorage f10287a;

    /* renamed from: b, reason: collision with root package name */
    public final ChoiceCmpCallback f10288b;

    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public int f10289a;

        public a(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new a(dVar);
        }

        @Override // c6.InterfaceC2072n
        public Object invoke(Object obj, Object obj2) {
            return new a((U5.d) obj2).invokeSuspend(I.f8786a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f10289a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                Q7.m mVar = Q7.m.f9074a;
                this.f10289a = 1;
                if (mVar.d(this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public int f10290a;

        public b(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(dVar);
        }

        @Override // c6.InterfaceC2072n
        public Object invoke(Object obj, Object obj2) {
            return new b((U5.d) obj2).invokeSuspend(I.f8786a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f10290a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                Q7.m mVar = Q7.m.f9074a;
                this.f10290a = 1;
                if (mVar.d(this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }
    }

    public j(SharedStorage sharedStorage, ChoiceCmpCallback choiceCmpCallback) {
        AbstractC3292y.i(sharedStorage, "sharedStorage");
        this.f10287a = sharedStorage;
        this.f10288b = choiceCmpCallback;
    }

    @Override // U7.i
    public void a() {
        C2001i c2001i = C2001i.f15172a;
        if (C2001i.f15173b) {
            C2001i.f15174c.setAllOwnedItems();
            SharedStorage sharedStorage = this.f10287a;
            X7.a aVar = X7.a.GBC_CONSENT_STRING;
            sharedStorage.d(aVar, c2001i.a(sharedStorage.k(aVar), C2001i.f15174c));
            ChoiceCmpCallback choiceCmpCallback = this.f10288b;
            if (choiceCmpCallback != null) {
                choiceCmpCallback.onGoogleBasicConsentChange(c2001i.b());
            }
            AbstractC3462k.d(C3475q0.f35747a, C3445b0.b(), null, new a(null), 2, null);
        }
    }

    @Override // U7.i
    public void b() {
        C2001i c2001i = C2001i.f15172a;
        if (C2001i.f15173b) {
            C2001i.f15174c.unsetAllOwnedItems();
            SharedStorage sharedStorage = this.f10287a;
            X7.a aVar = X7.a.GBC_CONSENT_STRING;
            sharedStorage.d(aVar, c2001i.a(sharedStorage.k(aVar), C2001i.f15174c));
            ChoiceCmpCallback choiceCmpCallback = this.f10288b;
            if (choiceCmpCallback != null) {
                choiceCmpCallback.onGoogleBasicConsentChange(c2001i.b());
            }
            AbstractC3462k.d(C3475q0.f35747a, C3445b0.b(), null, new b(null), 2, null);
        }
    }
}
