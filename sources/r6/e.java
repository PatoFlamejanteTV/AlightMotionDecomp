package r6;

import Q5.I;
import R5.AbstractC1435t;
import c6.InterfaceC2072n;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3292y;
import n6.M;
import n6.N;
import n6.O;
import n6.Q;
import p6.EnumC3588a;
import q6.AbstractC3823h;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;

/* loaded from: classes5.dex */
public abstract class e implements p {

    /* renamed from: a, reason: collision with root package name */
    public final U5.g f38793a;

    /* renamed from: b, reason: collision with root package name */
    public final int f38794b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC3588a f38795c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f38796a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f38797b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3822g f38798c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ e f38799d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3822g interfaceC3822g, e eVar, U5.d dVar) {
            super(2, dVar);
            this.f38798c = interfaceC3822g;
            this.f38799d = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            a aVar = new a(this.f38798c, this.f38799d, dVar);
            aVar.f38797b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f38796a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                M m8 = (M) this.f38797b;
                InterfaceC3822g interfaceC3822g = this.f38798c;
                p6.u m9 = this.f38799d.m(m8);
                this.f38796a = 1;
                if (AbstractC3823h.s(interfaceC3822g, m9, this) == e8) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f38800a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f38801b;

        b(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            b bVar = new b(dVar);
            bVar.f38801b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f38800a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                p6.s sVar = (p6.s) this.f38801b;
                e eVar = e.this;
                this.f38800a = 1;
                if (eVar.h(sVar, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(p6.s sVar, U5.d dVar) {
            return ((b) create(sVar, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public e(U5.g gVar, int i8, EnumC3588a enumC3588a) {
        this.f38793a = gVar;
        this.f38794b = i8;
        this.f38795c = enumC3588a;
    }

    static /* synthetic */ Object f(e eVar, InterfaceC3822g interfaceC3822g, U5.d dVar) {
        Object e8 = N.e(new a(interfaceC3822g, eVar, null), dVar);
        if (e8 == V5.b.e()) {
            return e8;
        }
        return I.f8786a;
    }

    @Override // r6.p
    public InterfaceC3821f b(U5.g gVar, int i8, EnumC3588a enumC3588a) {
        U5.g plus = gVar.plus(this.f38793a);
        if (enumC3588a == EnumC3588a.SUSPEND) {
            int i9 = this.f38794b;
            if (i9 != -3) {
                if (i8 != -3) {
                    if (i9 != -2) {
                        if (i8 != -2) {
                            i8 += i9;
                            if (i8 < 0) {
                                i8 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i8 = i9;
            }
            enumC3588a = this.f38795c;
        }
        if (AbstractC3292y.d(plus, this.f38793a) && i8 == this.f38794b && enumC3588a == this.f38795c) {
            return this;
        }
        return i(plus, i8, enumC3588a);
    }

    @Override // q6.InterfaceC3821f
    public Object collect(InterfaceC3822g interfaceC3822g, U5.d dVar) {
        return f(this, interfaceC3822g, dVar);
    }

    protected String e() {
        return null;
    }

    protected abstract Object h(p6.s sVar, U5.d dVar);

    protected abstract e i(U5.g gVar, int i8, EnumC3588a enumC3588a);

    public InterfaceC3821f j() {
        return null;
    }

    public final InterfaceC2072n k() {
        return new b(null);
    }

    public final int l() {
        int i8 = this.f38794b;
        if (i8 == -3) {
            return -2;
        }
        return i8;
    }

    public p6.u m(M m8) {
        return p6.q.c(m8, this.f38793a, l(), this.f38795c, O.ATOMIC, null, k(), 16, null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String e8 = e();
        if (e8 != null) {
            arrayList.add(e8);
        }
        if (this.f38793a != U5.h.f10149a) {
            arrayList.add("context=" + this.f38793a);
        }
        if (this.f38794b != -3) {
            arrayList.add("capacity=" + this.f38794b);
        }
        if (this.f38795c != EnumC3588a.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f38795c);
        }
        return Q.a(this) + '[' + AbstractC1435t.w0(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
