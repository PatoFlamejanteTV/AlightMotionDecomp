package com.uptodown.gcm;

import J4.j;
import Q5.I;
import Q5.t;
import U5.d;
import android.app.Activity;
import android.content.Context;
import c5.C2031A;
import c6.InterfaceC2072n;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.S;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AbstractActivityC2691a;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.S;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.J0;
import n6.M;
import n6.N;
import q5.C3784i;

/* loaded from: classes5.dex */
public final class MyFirebaseMessagingService extends FirebaseMessagingService {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30995a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f30996b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f30997c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ MyFirebaseMessagingService f30998d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f30999e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f31000f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.gcm.MyFirebaseMessagingService$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0708a extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f31001a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f31002b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f31003c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ long f31004d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0708a(String str, String str2, long j8, d dVar) {
                super(2, dVar);
                this.f31002b = str;
                this.f31003c = str2;
                this.f31004d = j8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new C0708a(this.f31002b, this.f31003c, this.f31004d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f31001a == 0) {
                    t.b(obj);
                    if (UptodownApp.f29249C.Q()) {
                        j.a aVar = j.f4395g;
                        if (aVar.f() != null) {
                            Activity f8 = aVar.f();
                            if (f8 instanceof AbstractActivityC2691a) {
                                ((AbstractActivityC2691a) f8).b2(this.f31002b, this.f31003c, this.f31004d);
                            }
                        }
                    }
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, d dVar) {
                return ((C0708a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j8, String str, MyFirebaseMessagingService myFirebaseMessagingService, String str2, String str3, d dVar) {
            super(2, dVar);
            this.f30996b = j8;
            this.f30997c = str;
            this.f30998d = myFirebaseMessagingService;
            this.f30999e = str2;
            this.f31000f = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new a(this.f30996b, this.f30997c, this.f30998d, this.f30999e, this.f31000f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f30995a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                C2031A c2031a = new C2031A();
                c2031a.j(this.f30996b);
                c2031a.m(this.f30997c);
                Context applicationContext = this.f30998d.getApplicationContext();
                AbstractC3292y.h(applicationContext, "getApplicationContext(...)");
                c2031a.n(applicationContext);
                J0 c8 = C3445b0.c();
                C0708a c0708a = new C0708a(this.f30999e, this.f31000f, this.f30996b, null);
                this.f30995a = 1;
                if (AbstractC3458i.g(c8, c0708a, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f31005a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f31007c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f31008d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ S f31009e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f31010f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, String str2, S s8, String str3, d dVar) {
            super(2, dVar);
            this.f31007c = str;
            this.f31008d = str2;
            this.f31009e = s8;
            this.f31010f = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new b(this.f31007c, this.f31008d, this.f31009e, this.f31010f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f31005a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                MyFirebaseMessagingService myFirebaseMessagingService = MyFirebaseMessagingService.this;
                String str = this.f31007c;
                String str2 = this.f31008d;
                long j8 = this.f31009e.f34572a;
                String str3 = this.f31010f;
                this.f31005a = 1;
                if (myFirebaseMessagingService.x(str, str2, j8, str3, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object x(String str, String str2, long j8, String str3, d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new a(j8, str3, this, str, str2, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    private final void y(String str) {
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void r(com.google.firebase.messaging.S remoteMessage) {
        String str;
        AbstractC3292y.i(remoteMessage, "remoteMessage");
        AbstractC3292y.h(remoteMessage.s(), "getData(...)");
        if ((!r0.isEmpty()) && (str = (String) remoteMessage.s().get("appId")) != null) {
            S s8 = new S();
            s8.f34572a = -1L;
            try {
                s8.f34572a = Long.parseLong(str);
            } catch (NumberFormatException e8) {
                e8.printStackTrace();
            }
            if (s8.f34572a > 0) {
                String str2 = (String) remoteMessage.s().get("packageName");
                if (!new C3784i().t(str2, getApplicationContext()) && remoteMessage.u() != null) {
                    S.b u8 = remoteMessage.u();
                    AbstractC3292y.f(u8);
                    String a9 = u8.a();
                    S.b u9 = remoteMessage.u();
                    AbstractC3292y.f(u9);
                    AbstractC3462k.d(N.a(C3445b0.b()), null, null, new b(u9.c(), a9, s8, str2, null), 3, null);
                }
            }
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void t(String token) {
        AbstractC3292y.i(token, "token");
        y(token);
    }
}
