package com.stripe.android.core.networking;

import B2.F;
import B2.o;
import B2.w;
import android.app.Application;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes4.dex */
public final class SendAnalyticsRequestV2Worker extends CoroutineWorker {

    /* renamed from: a, reason: collision with root package name */
    public static final b f24751a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private static F f24752b = new o(null, null, null, 0, null, 31, null);

    /* renamed from: c, reason: collision with root package name */
    private static Function1 f24753c = a.f24754a;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f24754a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w invoke(Context it) {
            AbstractC3292y.i(it, "it");
            Context applicationContext = it.getApplicationContext();
            AbstractC3292y.g(applicationContext, "null cannot be cast to non-null type android.app.Application");
            return new w((Application) applicationContext);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final Function1 a() {
            return SendAnalyticsRequestV2Worker.f24753c;
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends d {

        /* renamed from: a, reason: collision with root package name */
        Object f24755a;

        /* renamed from: b, reason: collision with root package name */
        Object f24756b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f24757c;

        /* renamed from: e, reason: collision with root package name */
        int f24759e;

        c(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24757c = obj;
            this.f24759e |= Integer.MIN_VALUE;
            return SendAnalyticsRequestV2Worker.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendAnalyticsRequestV2Worker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        AbstractC3292y.i(appContext, "appContext");
        AbstractC3292y.i(params, "params");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object doWork(U5.d r9) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.core.networking.SendAnalyticsRequestV2Worker.doWork(U5.d):java.lang.Object");
    }
}
