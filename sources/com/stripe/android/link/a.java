package com.stripe.android.link;

import P2.b;
import Q2.d;
import R2.c;
import S2.a;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.link.LinkActivityContract;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final LinkActivityContract f25198a;

    /* renamed from: b, reason: collision with root package name */
    private final d f25199b;

    /* renamed from: c, reason: collision with root package name */
    private final c f25200c;

    /* renamed from: d, reason: collision with root package name */
    private ActivityResultLauncher f25201d;

    public a(a.InterfaceC0197a linkAnalyticsComponentBuilder, LinkActivityContract linkActivityContract, d linkStore) {
        AbstractC3292y.i(linkAnalyticsComponentBuilder, "linkAnalyticsComponentBuilder");
        AbstractC3292y.i(linkActivityContract, "linkActivityContract");
        AbstractC3292y.i(linkStore, "linkStore");
        this.f25198a = linkActivityContract;
        this.f25199b = linkStore;
        this.f25200c = linkAnalyticsComponentBuilder.build().a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(a this$0, Function1 callback, b bVar) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(callback, "$callback");
        c cVar = this$0.f25200c;
        AbstractC3292y.f(bVar);
        cVar.c(bVar);
        if (bVar instanceof b.C0156b) {
            this$0.f25199b.c();
        }
        callback.invoke(bVar);
    }

    public final void b(P2.d configuration) {
        AbstractC3292y.i(configuration, "configuration");
        LinkActivityContract.a aVar = new LinkActivityContract.a(configuration);
        ActivityResultLauncher activityResultLauncher = this.f25201d;
        if (activityResultLauncher != null) {
            activityResultLauncher.launch(aVar);
        }
        this.f25200c.a();
    }

    public final void c(ActivityResultCaller activityResultCaller, final Function1 callback) {
        AbstractC3292y.i(activityResultCaller, "activityResultCaller");
        AbstractC3292y.i(callback, "callback");
        this.f25201d = activityResultCaller.registerForActivityResult(this.f25198a, new ActivityResultCallback() { // from class: P2.g
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                com.stripe.android.link.a.d(com.stripe.android.link.a.this, callback, (b) obj);
            }
        });
    }

    public final void e() {
        ActivityResultLauncher activityResultLauncher = this.f25201d;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
        }
        this.f25201d = null;
    }
}
