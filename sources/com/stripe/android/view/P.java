package com.stripe.android.view;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import c6.InterfaceC2072n;
import com.stripe.android.view.O;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public abstract class P {
    public static final void a(View view, ViewModelStoreOwner viewModelStoreOwner, InterfaceC2072n action) {
        AbstractC3292y.i(view, "<this>");
        AbstractC3292y.i(action, "action");
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(view);
        if (viewModelStoreOwner == null) {
            viewModelStoreOwner = ViewTreeViewModelStoreOwner.get(view);
        }
        if (lifecycleOwner != null && viewModelStoreOwner != null) {
            Context applicationContext = view.getContext().getApplicationContext();
            AbstractC3292y.h(applicationContext, "getApplicationContext(...)");
            action.invoke(lifecycleOwner, (O) new ViewModelProvider(viewModelStoreOwner, new O.a(applicationContext)).get(O.class));
        }
    }
}
