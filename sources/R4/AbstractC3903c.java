package r4;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import o4.AbstractC3532f;
import o4.AbstractC3533g;
import p4.InterfaceC3578c;
import r4.x0;

/* renamed from: r4.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3903c {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r4.c$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC3910i f38331a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC3910i abstractC3910i) {
            super(0);
            this.f38331a = abstractC3910i;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5570invoke();
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5570invoke() {
            ((InterfaceC3578c) this.f38331a).f().invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void a(r0 r0Var, String str, AbstractC3910i abstractC3910i, I i8) {
        InterfaceC3578c interfaceC3578c;
        Boolean bool;
        x0.c cVar = null;
        if (abstractC3910i instanceof InterfaceC3578c) {
            interfaceC3578c = (InterfaceC3578c) abstractC3910i;
        } else {
            interfaceC3578c = null;
        }
        if (interfaceC3578c != null) {
            bool = Boolean.valueOf(interfaceC3578c.a(str, i8));
        } else {
            bool = null;
        }
        if (AbstractC3292y.d(bool, Boolean.TRUE)) {
            cVar = new x0.c(AbstractC3532f.f35946b, Integer.valueOf(AbstractC3533g.f35977u), true, new a(abstractC3910i));
        }
        r0Var.c().setValue(cVar);
    }

    public static final void b(k0 field, String str, AbstractC3910i addressType, I isPlacesAvailable) {
        q0 q0Var;
        w0 w0Var;
        s0 s0Var;
        Object obj;
        AbstractC3292y.i(field, "field");
        AbstractC3292y.i(addressType, "addressType");
        AbstractC3292y.i(isPlacesAvailable, "isPlacesAvailable");
        if (AbstractC3292y.d(field.a(), G.Companion.p())) {
            r0 r0Var = null;
            if (field instanceof q0) {
                q0Var = (q0) field;
            } else {
                q0Var = null;
            }
            if (q0Var != null) {
                w0Var = q0Var.i();
            } else {
                w0Var = null;
            }
            if (w0Var instanceof s0) {
                s0Var = (s0) w0Var;
            } else {
                s0Var = null;
            }
            if (s0Var != null) {
                obj = s0Var.z();
            } else {
                obj = null;
            }
            if (obj instanceof r0) {
                r0Var = (r0) obj;
            }
            if (r0Var != null) {
                a(r0Var, str, addressType, isPlacesAvailable);
            }
        }
    }
}
