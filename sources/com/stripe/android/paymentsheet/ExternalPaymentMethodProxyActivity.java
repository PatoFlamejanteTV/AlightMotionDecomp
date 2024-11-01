package com.stripe.android.paymentsheet;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.stripe.android.paymentsheet.AbstractC2636c;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import v3.C4130j;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class ExternalPaymentMethodProxyActivity extends AppCompatActivity {

    /* renamed from: b, reason: collision with root package name */
    public static final a f26755b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f26756c = 8;

    /* renamed from: a, reason: collision with root package name */
    private boolean f26757a;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f26757a = bundle.getBoolean("has_confirm_started");
        }
        String stringExtra = getIntent().getStringExtra("external_payment_method_type");
        if (stringExtra != null && !this.f26757a) {
            this.f26757a = true;
            C4130j.f40490a.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        String stringExtra = getIntent().getStringExtra("external_payment_method_type");
        AbstractC2636c abstractC2636c = (AbstractC2636c) getIntent().getParcelableExtra("external_payment_method_result");
        if (stringExtra == null && abstractC2636c == null) {
            finish();
            return;
        }
        if (abstractC2636c != null) {
            if (abstractC2636c instanceof AbstractC2636c.C0605c) {
                setResult(-1);
            } else if (abstractC2636c instanceof AbstractC2636c.a) {
                setResult(0);
            } else if (abstractC2636c instanceof AbstractC2636c.d) {
                Intent putExtra = new Intent().putExtra("external_payment_method_error_message", ((AbstractC2636c.d) abstractC2636c).a());
                AbstractC3292y.h(putExtra, "putExtra(...)");
                setResult(1, putExtra);
            }
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        AbstractC3292y.i(outState, "outState");
        outState.putBoolean("has_confirm_started", this.f26757a);
        super.onSaveInstanceState(outState);
    }
}
