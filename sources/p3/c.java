package P3;

import Q5.I;
import Q5.t;
import c6.InterfaceC2073o;
import c6.InterfaceC2077s;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3290w;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;
import r6.k;

/* loaded from: classes4.dex */
public abstract class c {

    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC3821f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3821f[] f8067a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC2077s f8068b;

        /* renamed from: P3.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0159a extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3821f[] f8069a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0159a(InterfaceC3821f[] interfaceC3821fArr) {
                super(0);
                this.f8069a = interfaceC3821fArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                return new Object[this.f8069a.length];
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends l implements InterfaceC2073o {

            /* renamed from: a, reason: collision with root package name */
            int f8070a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f8071b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f8072c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC2077s f8073d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(U5.d dVar, InterfaceC2077s interfaceC2077s) {
                super(3, dVar);
                this.f8073d = interfaceC2077s;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                InterfaceC3822g interfaceC3822g;
                Object e8 = V5.b.e();
                int i8 = this.f8070a;
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            t.b(obj);
                            return I.f8786a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC3822g = (InterfaceC3822g) this.f8071b;
                    t.b(obj);
                } else {
                    t.b(obj);
                    interfaceC3822g = (InterfaceC3822g) this.f8071b;
                    Object[] objArr = (Object[]) this.f8072c;
                    InterfaceC2077s interfaceC2077s = this.f8073d;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    Object obj6 = objArr[4];
                    Object obj7 = objArr[5];
                    this.f8071b = interfaceC3822g;
                    this.f8070a = 1;
                    AbstractC3290w.c(6);
                    obj = interfaceC2077s.invoke(obj2, obj3, obj4, obj5, obj6, obj7, this);
                    AbstractC3290w.c(7);
                    if (obj == e8) {
                        return e8;
                    }
                }
                this.f8071b = null;
                this.f8070a = 2;
                if (interfaceC3822g.emit(obj, this) == e8) {
                    return e8;
                }
                return I.f8786a;
            }

            @Override // c6.InterfaceC2073o
            public final Object invoke(InterfaceC3822g interfaceC3822g, Object[] objArr, U5.d dVar) {
                b bVar = new b(dVar, this.f8073d);
                bVar.f8071b = interfaceC3822g;
                bVar.f8072c = objArr;
                return bVar.invokeSuspend(I.f8786a);
            }
        }

        public a(InterfaceC3821f[] interfaceC3821fArr, InterfaceC2077s interfaceC2077s) {
            this.f8067a = interfaceC3821fArr;
            this.f8068b = interfaceC2077s;
        }

        @Override // q6.InterfaceC3821f
        public Object collect(InterfaceC3822g interfaceC3822g, U5.d dVar) {
            InterfaceC3821f[] interfaceC3821fArr = this.f8067a;
            Object a9 = k.a(interfaceC3822g, interfaceC3821fArr, new C0159a(interfaceC3821fArr), new b(null, this.f8068b), dVar);
            if (a9 == V5.b.e()) {
                return a9;
            }
            return I.f8786a;
        }
    }

    public static final InterfaceC3821f a(InterfaceC3821f flow, InterfaceC3821f flow2, InterfaceC3821f flow3, InterfaceC3821f flow4, InterfaceC3821f flow5, InterfaceC3821f flow6, InterfaceC2077s transform) {
        AbstractC3292y.i(flow, "flow");
        AbstractC3292y.i(flow2, "flow2");
        AbstractC3292y.i(flow3, "flow3");
        AbstractC3292y.i(flow4, "flow4");
        AbstractC3292y.i(flow5, "flow5");
        AbstractC3292y.i(flow6, "flow6");
        AbstractC3292y.i(transform, "transform");
        return new a(new InterfaceC3821f[]{flow, flow2, flow3, flow4, flow5, flow6}, transform);
    }
}
