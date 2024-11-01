package com.google.firebase;

import D0.C1038c;
import D0.F;
import D0.InterfaceC1040e;
import D0.h;
import D0.r;
import R5.AbstractC1435t;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3473p0;
import n6.I;

@Keep
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    /* loaded from: classes.dex */
    public static final class a implements h {

        /* renamed from: a, reason: collision with root package name */
        public static final a f18396a = new a();

        @Override // D0.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final I a(InterfaceC1040e interfaceC1040e) {
            Object b9 = interfaceC1040e.b(F.a(C0.a.class, Executor.class));
            AbstractC3292y.h(b9, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return AbstractC3473p0.a((Executor) b9);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements h {

        /* renamed from: a, reason: collision with root package name */
        public static final b f18397a = new b();

        @Override // D0.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final I a(InterfaceC1040e interfaceC1040e) {
            Object b9 = interfaceC1040e.b(F.a(C0.c.class, Executor.class));
            AbstractC3292y.h(b9, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return AbstractC3473p0.a((Executor) b9);
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements h {

        /* renamed from: a, reason: collision with root package name */
        public static final c f18398a = new c();

        @Override // D0.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final I a(InterfaceC1040e interfaceC1040e) {
            Object b9 = interfaceC1040e.b(F.a(C0.b.class, Executor.class));
            AbstractC3292y.h(b9, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return AbstractC3473p0.a((Executor) b9);
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements h {

        /* renamed from: a, reason: collision with root package name */
        public static final d f18399a = new d();

        @Override // D0.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final I a(InterfaceC1040e interfaceC1040e) {
            Object b9 = interfaceC1040e.b(F.a(C0.d.class, Executor.class));
            AbstractC3292y.h(b9, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return AbstractC3473p0.a((Executor) b9);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1038c> getComponents() {
        C1038c d8 = C1038c.c(F.a(C0.a.class, I.class)).b(r.k(F.a(C0.a.class, Executor.class))).f(a.f18396a).d();
        AbstractC3292y.h(d8, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C1038c d9 = C1038c.c(F.a(C0.c.class, I.class)).b(r.k(F.a(C0.c.class, Executor.class))).f(b.f18397a).d();
        AbstractC3292y.h(d9, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C1038c d10 = C1038c.c(F.a(C0.b.class, I.class)).b(r.k(F.a(C0.b.class, Executor.class))).f(c.f18398a).d();
        AbstractC3292y.h(d10, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C1038c d11 = C1038c.c(F.a(C0.d.class, I.class)).b(r.k(F.a(C0.d.class, Executor.class))).f(d.f18399a).d();
        AbstractC3292y.h(d11, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return AbstractC1435t.p(d8, d9, d10, d11);
    }
}
