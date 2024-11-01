package com.stripe.android.view;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: com.stripe.android.view.h0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2653h0 {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f28976a;

    /* renamed from: b, reason: collision with root package name */
    private final InputMethodManager f28977b;

    public C2653h0(Activity activity) {
        AbstractC3292y.i(activity, "activity");
        this.f28976a = activity;
        Object systemService = activity.getSystemService("input_method");
        AbstractC3292y.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        this.f28977b = (InputMethodManager) systemService;
    }

    public final /* synthetic */ void a() {
        IBinder iBinder;
        if (this.f28977b.isAcceptingText()) {
            InputMethodManager inputMethodManager = this.f28977b;
            View currentFocus = this.f28976a.getCurrentFocus();
            if (currentFocus != null) {
                iBinder = currentFocus.getWindowToken();
            } else {
                iBinder = null;
            }
            inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
        }
    }
}
