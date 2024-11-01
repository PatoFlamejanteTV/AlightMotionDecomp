package com.google.firebase.datatransport;

import D0.C1038c;
import D0.F;
import D0.InterfaceC1040e;
import D0.h;
import D0.r;
import T0.b;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.datatransport.cct.a;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.Arrays;
import java.util.List;
import s.j;
import u.u;

@Keep
/* loaded from: classes3.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ j lambda$getComponents$0(InterfaceC1040e interfaceC1040e) {
        u.f((Context) interfaceC1040e.a(Context.class));
        return u.c().g(a.f15982h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ j lambda$getComponents$1(InterfaceC1040e interfaceC1040e) {
        u.f((Context) interfaceC1040e.a(Context.class));
        return u.c().g(a.f15982h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ j lambda$getComponents$2(InterfaceC1040e interfaceC1040e) {
        u.f((Context) interfaceC1040e.a(Context.class));
        return u.c().g(a.f15981g);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public List<C1038c> getComponents() {
        return Arrays.asList(C1038c.e(j.class).h(LIBRARY_NAME).b(r.l(Context.class)).f(new h() { // from class: T0.c
            @Override // D0.h
            public final Object a(InterfaceC1040e interfaceC1040e) {
                j lambda$getComponents$0;
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(interfaceC1040e);
                return lambda$getComponents$0;
            }
        }).d(), C1038c.c(F.a(T0.a.class, j.class)).b(r.l(Context.class)).f(new h() { // from class: T0.d
            @Override // D0.h
            public final Object a(InterfaceC1040e interfaceC1040e) {
                j lambda$getComponents$1;
                lambda$getComponents$1 = TransportRegistrar.lambda$getComponents$1(interfaceC1040e);
                return lambda$getComponents$1;
            }
        }).d(), C1038c.c(F.a(b.class, j.class)).b(r.l(Context.class)).f(new h() { // from class: T0.e
            @Override // D0.h
            public final Object a(InterfaceC1040e interfaceC1040e) {
                j lambda$getComponents$2;
                lambda$getComponents$2 = TransportRegistrar.lambda$getComponents$2(interfaceC1040e);
                return lambda$getComponents$2;
            }
        }).d(), k1.h.b(LIBRARY_NAME, "19.0.0"));
    }
}
