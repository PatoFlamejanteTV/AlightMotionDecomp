package q6;

import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: q6.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC3828m {

    /* renamed from: a, reason: collision with root package name */
    private static final Function1 f37427a = b.f37430a;

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2072n f37428b = a.f37429a;

    /* renamed from: q6.m$a */
    /* loaded from: classes5.dex */
    static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f37429a = new a();

        a() {
            super(2);
        }

        @Override // c6.InterfaceC2072n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(AbstractC3292y.d(obj, obj2));
        }
    }

    public static final InterfaceC3821f a(InterfaceC3821f interfaceC3821f) {
        if (!(interfaceC3821f instanceof InterfaceC3813L)) {
            return b(interfaceC3821f, f37427a, f37428b);
        }
        return interfaceC3821f;
    }

    private static final InterfaceC3821f b(InterfaceC3821f interfaceC3821f, Function1 function1, InterfaceC2072n interfaceC2072n) {
        if (interfaceC3821f instanceof C3820e) {
            C3820e c3820e = (C3820e) interfaceC3821f;
            if (c3820e.f37410b == function1 && c3820e.f37411c == interfaceC2072n) {
                return interfaceC3821f;
            }
        }
        return new C3820e(interfaceC3821f, function1, interfaceC2072n);
    }

    /* renamed from: q6.m$b */
    /* loaded from: classes5.dex */
    static final class b extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f37430a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return obj;
        }
    }
}
