package com.stripe.android.view;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import com.stripe.android.model.o;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import n2.AbstractC3394E;
import n2.AbstractC3395F;

/* renamed from: com.stripe.android.view.b0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2641b0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f28895a;

    /* renamed from: b, reason: collision with root package name */
    private final C0 f28896b;

    /* renamed from: c, reason: collision with root package name */
    private final C2681z f28897c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f28898d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f28899e;

    /* renamed from: f, reason: collision with root package name */
    private final Function1 f28900f;

    public C2641b0(Context context, C0 adapter, C2681z cardDisplayTextFactory, Object obj, Set productUsage, Function1 onDeletedPaymentMethodCallback) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(adapter, "adapter");
        AbstractC3292y.i(cardDisplayTextFactory, "cardDisplayTextFactory");
        AbstractC3292y.i(productUsage, "productUsage");
        AbstractC3292y.i(onDeletedPaymentMethodCallback, "onDeletedPaymentMethodCallback");
        this.f28895a = context;
        this.f28896b = adapter;
        this.f28897c = cardDisplayTextFactory;
        this.f28898d = obj;
        this.f28899e = productUsage;
        this.f28900f = onDeletedPaymentMethodCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C2641b0 this$0, com.stripe.android.model.o paymentMethod, DialogInterface dialogInterface, int i8) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(paymentMethod, "$paymentMethod");
        this$0.h(paymentMethod);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C2641b0 this$0, com.stripe.android.model.o paymentMethod, DialogInterface dialogInterface, int i8) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(paymentMethod, "$paymentMethod");
        this$0.f28896b.x(paymentMethod);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(C2641b0 this$0, com.stripe.android.model.o paymentMethod, DialogInterface dialogInterface) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(paymentMethod, "$paymentMethod");
        this$0.f28896b.x(paymentMethod);
    }

    public final /* synthetic */ AlertDialog d(final com.stripe.android.model.o paymentMethod) {
        String str;
        AbstractC3292y.i(paymentMethod, "paymentMethod");
        o.g gVar = paymentMethod.f25638h;
        if (gVar != null) {
            str = this.f28897c.b(gVar);
        } else {
            str = null;
        }
        AlertDialog create = new AlertDialog.Builder(this.f28895a, AbstractC3395F.f35272a).setTitle(AbstractC3394E.f35233g0).setMessage(str).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.stripe.android.view.Y
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                C2641b0.e(C2641b0.this, paymentMethod, dialogInterface, i8);
            }
        }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.stripe.android.view.Z
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                C2641b0.f(C2641b0.this, paymentMethod, dialogInterface, i8);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.stripe.android.view.a0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C2641b0.g(C2641b0.this, paymentMethod, dialogInterface);
            }
        }).create();
        AbstractC3292y.h(create, "create(...)");
        return create;
    }

    public final /* synthetic */ void h(com.stripe.android.model.o paymentMethod) {
        AbstractC3292y.i(paymentMethod, "paymentMethod");
        this.f28896b.k(paymentMethod);
        if (paymentMethod.f25631a != null) {
            Object obj = this.f28898d;
            if (Q5.s.g(obj)) {
                obj = null;
            }
            android.support.v4.media.a.a(obj);
        }
        this.f28900f.invoke(paymentMethod);
    }
}
