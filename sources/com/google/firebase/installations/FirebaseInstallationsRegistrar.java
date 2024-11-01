package com.google.firebase.installations;

import D0.C1038c;
import D0.F;
import D0.InterfaceC1040e;
import D0.r;
import E0.k;
import a1.AbstractC1658h;
import a1.InterfaceC1659i;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

@Keep
/* loaded from: classes3.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ d1.e lambda$getComponents$0(InterfaceC1040e interfaceC1040e) {
        return new c((A0.f) interfaceC1040e.a(A0.f.class), interfaceC1040e.c(InterfaceC1659i.class), (ExecutorService) interfaceC1040e.b(F.a(C0.a.class, ExecutorService.class)), k.a((Executor) interfaceC1040e.b(F.a(C0.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1038c> getComponents() {
        return Arrays.asList(C1038c.e(d1.e.class).h(LIBRARY_NAME).b(r.l(A0.f.class)).b(r.j(InterfaceC1659i.class)).b(r.k(F.a(C0.a.class, ExecutorService.class))).b(r.k(F.a(C0.b.class, Executor.class))).f(new D0.h() { // from class: d1.f
            @Override // D0.h
            public final Object a(InterfaceC1040e interfaceC1040e) {
                e lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(interfaceC1040e);
                return lambda$getComponents$0;
            }
        }).d(), AbstractC1658h.a(), k1.h.b(LIBRARY_NAME, "18.0.0"));
    }
}
