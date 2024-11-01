package com.stripe.android.view;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: com.stripe.android.view.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2638a implements InterfaceC2668p {

    /* renamed from: b, reason: collision with root package name */
    private final ComponentActivity f28890b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f28891c;

    /* renamed from: d, reason: collision with root package name */
    private final LifecycleOwner f28892d;

    public C2638a(ComponentActivity activity, Integer num) {
        AbstractC3292y.i(activity, "activity");
        this.f28890b = activity;
        this.f28891c = num;
        this.f28892d = activity;
    }

    @Override // com.stripe.android.view.InterfaceC2668p
    public Integer a() {
        return this.f28891c;
    }

    @Override // com.stripe.android.view.InterfaceC2668p
    public void b(Class target, Bundle extras, int i8) {
        AbstractC3292y.i(target, "target");
        AbstractC3292y.i(extras, "extras");
        Intent putExtras = new Intent(this.f28890b, (Class<?>) target).putExtras(extras);
        AbstractC3292y.h(putExtras, "putExtras(...)");
        this.f28890b.startActivityForResult(putExtras, i8);
    }

    @Override // com.stripe.android.view.InterfaceC2668p
    public Application c() {
        Application application = this.f28890b.getApplication();
        AbstractC3292y.h(application, "getApplication(...)");
        return application;
    }

    @Override // com.stripe.android.view.InterfaceC2668p
    public LifecycleOwner d() {
        return this.f28892d;
    }
}
