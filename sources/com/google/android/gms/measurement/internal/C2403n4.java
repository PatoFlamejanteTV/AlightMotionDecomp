package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.n4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2403n4 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ F3 f17974a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2403n4(F3 f32) {
        this.f17974a = f32;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b0 A[Catch: RuntimeException -> 0x0029, TRY_ENTER, TryCatch #0 {RuntimeException -> 0x0029, blocks: (B:3:0x000d, B:5:0x0019, B:8:0x002d, B:14:0x00b0, B:16:0x00bc, B:19:0x00d1, B:21:0x00d7, B:24:0x00e4, B:26:0x00ea, B:27:0x0102, B:28:0x0111, B:32:0x0118, B:36:0x013b, B:37:0x0157, B:39:0x0148, B:40:0x015e, B:42:0x0164, B:44:0x016a, B:46:0x0170, B:48:0x0176, B:50:0x017e, B:52:0x0186, B:54:0x018c, B:57:0x0192, B:62:0x0041, B:65:0x0049, B:67:0x0051, B:69:0x0057, B:71:0x005d, B:73:0x0063, B:75:0x006b, B:77:0x0073, B:79:0x007b, B:81:0x0083, B:82:0x008f, B:84:0x00a7), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0117 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0118 A[Catch: RuntimeException -> 0x0029, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0029, blocks: (B:3:0x000d, B:5:0x0019, B:8:0x002d, B:14:0x00b0, B:16:0x00bc, B:19:0x00d1, B:21:0x00d7, B:24:0x00e4, B:26:0x00ea, B:27:0x0102, B:28:0x0111, B:32:0x0118, B:36:0x013b, B:37:0x0157, B:39:0x0148, B:40:0x015e, B:42:0x0164, B:44:0x016a, B:46:0x0170, B:48:0x0176, B:50:0x017e, B:52:0x0186, B:54:0x018c, B:57:0x0192, B:62:0x0041, B:65:0x0049, B:67:0x0051, B:69:0x0057, B:71:0x005d, B:73:0x0063, B:75:0x006b, B:77:0x0073, B:79:0x007b, B:81:0x0083, B:82:0x008f, B:84:0x00a7), top: B:2:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(com.google.android.gms.measurement.internal.C2403n4 r17, boolean r18, android.net.Uri r19, java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2403n4.a(com.google.android.gms.measurement.internal.n4, boolean, android.net.Uri, java.lang.String, java.lang.String):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        String str;
        boolean z8;
        try {
            try {
                this.f17974a.a().K().a("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent == null) {
                    this.f17974a.p().F(activity, bundle);
                    return;
                }
                Uri data = intent.getData();
                if (data == null || !data.isHierarchical()) {
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        String string = extras.getString("com.android.vending.referral_url");
                        if (!TextUtils.isEmpty(string)) {
                            data = Uri.parse(string);
                        }
                    }
                    data = null;
                }
                Uri uri = data;
                if (uri != null && uri.isHierarchical()) {
                    this.f17974a.g();
                    if (d6.f0(intent)) {
                        str = "gs";
                    } else {
                        str = "auto";
                    }
                    String str2 = str;
                    String queryParameter = uri.getQueryParameter("referrer");
                    if (bundle == null) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    this.f17974a.f().D(new RunnableC2424q4(this, z8, uri, str2, queryParameter));
                    this.f17974a.p().F(activity, bundle);
                }
            } catch (RuntimeException e8) {
                this.f17974a.a().G().b("Throwable caught in onActivityCreated", e8);
                this.f17974a.p().F(activity, bundle);
            }
        } finally {
            this.f17974a.p().F(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f17974a.p().E(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f17974a.p().Q(activity);
        C2418p5 r8 = this.f17974a.r();
        r8.f().D(new RunnableC2425q5(r8, r8.x().elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C2418p5 r8 = this.f17974a.r();
        r8.f().D(new RunnableC2431r5(r8, r8.x().elapsedRealtime()));
        this.f17974a.p().S(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f17974a.p().R(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
