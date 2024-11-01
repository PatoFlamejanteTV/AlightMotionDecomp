package com.google.firebase.messaging;

import D0.C1038c;
import D0.InterfaceC1040e;
import a1.InterfaceC1660j;
import androidx.annotation.Keep;
import b1.InterfaceC1962a;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes4.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(D0.F f8, InterfaceC1040e interfaceC1040e) {
        A0.f fVar = (A0.f) interfaceC1040e.a(A0.f.class);
        android.support.v4.media.a.a(interfaceC1040e.a(InterfaceC1962a.class));
        return new FirebaseMessaging(fVar, null, interfaceC1040e.c(k1.i.class), interfaceC1040e.c(InterfaceC1660j.class), (d1.e) interfaceC1040e.a(d1.e.class), interfaceC1040e.f(f8), (Z0.d) interfaceC1040e.a(Z0.d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C1038c> getComponents() {
        final D0.F a9 = D0.F.a(T0.b.class, s.j.class);
        return Arrays.asList(C1038c.e(FirebaseMessaging.class).h(LIBRARY_NAME).b(D0.r.l(A0.f.class)).b(D0.r.h(InterfaceC1962a.class)).b(D0.r.j(k1.i.class)).b(D0.r.j(InterfaceC1660j.class)).b(D0.r.l(d1.e.class)).b(D0.r.i(a9)).b(D0.r.l(Z0.d.class)).f(new D0.h() { // from class: com.google.firebase.messaging.B
            @Override // D0.h
            public final Object a(InterfaceC1040e interfaceC1040e) {
                FirebaseMessaging lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(D0.F.this, interfaceC1040e);
                return lambda$getComponents$0;
            }
        }).c().d(), k1.h.b(LIBRARY_NAME, "24.0.2"));
    }
}
