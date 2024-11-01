package com.uptodown.receivers;

import Q5.I;
import Q5.t;
import U5.d;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import c5.Q;
import c6.InterfaceC2072n;
import com.uptodown.activities.preferences.SettingsPreferences;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.J0;
import n6.M;
import n6.N;
import q5.C3776a;
import q5.C3791p;
import q5.C3795t;
import q5.C3800y;

/* loaded from: classes5.dex */
public final class MyAppUpdatedReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private Context f31012a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f31013a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f31015c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.receivers.MyAppUpdatedReceiver$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0709a extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f31016a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ BroadcastReceiver.PendingResult f31017b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0709a(BroadcastReceiver.PendingResult pendingResult, d dVar) {
                super(2, dVar);
                this.f31017b = pendingResult;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new C0709a(this.f31017b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f31016a == 0) {
                    t.b(obj);
                    this.f31017b.finish();
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, d dVar) {
                return ((C0709a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(BroadcastReceiver.PendingResult pendingResult, d dVar) {
            super(2, dVar);
            this.f31015c = pendingResult;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new a(this.f31015c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            Object e8 = V5.b.e();
            int i8 = this.f31013a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                try {
                    Context context = MyAppUpdatedReceiver.this.f31012a;
                    AbstractC3292y.f(context);
                    String packageName = context.getPackageName();
                    C3791p.a aVar = C3791p.f37286s;
                    Context context2 = MyAppUpdatedReceiver.this.f31012a;
                    AbstractC3292y.f(context2);
                    C3791p a9 = aVar.a(context2);
                    a9.a();
                    AbstractC3292y.f(packageName);
                    Q s02 = a9.s0(packageName);
                    if (s02 != null) {
                        str = s02.l();
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        SettingsPreferences.a aVar2 = SettingsPreferences.f30529b;
                        Context context3 = MyAppUpdatedReceiver.this.f31012a;
                        AbstractC3292y.f(context3);
                        if (aVar2.Q(context3)) {
                            C3776a c3776a = new C3776a();
                            Context context4 = MyAppUpdatedReceiver.this.f31012a;
                            AbstractC3292y.f(context4);
                            c3776a.a(context4, s02.l());
                            C3776a c3776a2 = new C3776a();
                            Context context5 = MyAppUpdatedReceiver.this.f31012a;
                            AbstractC3292y.f(context5);
                            c3776a2.b(context5, s02.l());
                        }
                        a9.M(packageName);
                        String l8 = s02.l();
                        AbstractC3292y.f(l8);
                        a9.B(l8);
                    }
                    a9.t(packageName);
                    a9.i();
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
                J0 c8 = C3445b0.c();
                C0709a c0709a = new C0709a(this.f31015c, null);
                this.f31013a = 1;
                if (AbstractC3458i.g(c8, c0709a, this) == e8) {
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
        int f31018a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f31020c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(BroadcastReceiver.PendingResult pendingResult, d dVar) {
            super(2, dVar);
            this.f31020c = pendingResult;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new b(this.f31020c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f31018a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                MyAppUpdatedReceiver myAppUpdatedReceiver = MyAppUpdatedReceiver.this;
                BroadcastReceiver.PendingResult pendingResult = this.f31020c;
                AbstractC3292y.f(pendingResult);
                this.f31018a = 1;
                if (myAppUpdatedReceiver.c(pendingResult, this) == e8) {
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
    public final Object c(BroadcastReceiver.PendingResult pendingResult, d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new a(pendingResult, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (context != null) {
            this.f31012a = context;
            Bundle bundle = new Bundle();
            bundle.putString("packagename", context.getPackageName());
            bundle.putString("type", "success");
            bundle.putInt("update", 1);
            new C3795t(context).e("install", bundle);
            SettingsPreferences.a aVar = SettingsPreferences.f30529b;
            aVar.U0(context, false);
            aVar.Z0(context, false);
            aVar.e1(context, null);
            C3800y.f37330a.f(context);
            AbstractC3462k.d(N.a(C3445b0.b()), null, null, new b(goAsync(), null), 3, null);
        }
    }
}
