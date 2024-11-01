package com.stripe.android.view;

import android.R;
import android.app.Activity;
import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import com.stripe.android.view.InterfaceC2664n;
import kotlin.jvm.internal.AbstractC3292y;
import n2.AbstractC3395F;

/* renamed from: com.stripe.android.view.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC2664n {

    /* renamed from: com.stripe.android.view.n$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC2664n {

        /* renamed from: a, reason: collision with root package name */
        private final Activity f29115a;

        public a(Activity activity) {
            AbstractC3292y.i(activity, "activity");
            this.f29115a = activity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(DialogInterface dialogInterface, int i8) {
            dialogInterface.dismiss();
        }

        @Override // com.stripe.android.view.InterfaceC2664n
        public void show(String message) {
            AbstractC3292y.i(message, "message");
            if (!this.f29115a.isFinishing()) {
                new AlertDialog.Builder(this.f29115a, AbstractC3395F.f35272a).setMessage(message).setCancelable(true).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.stripe.android.view.m
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i8) {
                        InterfaceC2664n.a.b(dialogInterface, i8);
                    }
                }).create().show();
            }
        }
    }

    void show(String str);
}
