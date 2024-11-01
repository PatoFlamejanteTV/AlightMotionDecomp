package com.uptodown.core.activities;

import J4.j;
import S4.h;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import com.uptodown.core.activities.ConfirmationIntentWrapperActivity;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n6.InterfaceC3487x;

/* loaded from: classes5.dex */
public final class ConfirmationIntentWrapperActivity extends AppCompatActivity {

    /* renamed from: c, reason: collision with root package name */
    public static final a f30674c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private boolean f30675a;

    /* renamed from: b, reason: collision with root package name */
    private final ActivityResultLauncher f30676b;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public ConfirmationIntentWrapperActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: K4.a
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                ConfirmationIntentWrapperActivity.l(ConfirmationIntentWrapperActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3292y.h(registerForActivityResult, "registerForActivityResul…ue\n        finish()\n    }");
        this.f30676b = registerForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(ConfirmationIntentWrapperActivity this$0, ActivityResult activityResult) {
        boolean z8;
        AbstractC3292y.i(this$0, "this$0");
        if (this$0.getPackageManager().getPackageInstaller().getSessionInfo(j.f4395g.l()) != null && r6.getProgress() >= 0.81d) {
            z8 = true;
        } else {
            z8 = false;
        }
        InterfaceC3487x b9 = h.f9444d.b();
        if (b9 != null) {
            b9.v(Boolean.valueOf(z8));
        }
        this$0.f30675a = true;
        this$0.finish();
    }

    private final void m(String str) {
        Intent intent = new Intent("com.uptodown.core.custom_action_installation_status");
        intent.putExtra("com.uptodown.core.installation_status", 2);
        intent.putExtra("com.uptodown.core.error", str);
        sendBroadcast(intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Parcelable parcelableExtra;
        Object parcelableExtra2;
        super.onCreate(bundle);
        Intent intent = getIntent();
        AbstractC3292y.h(intent, "intent");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableExtra2 = intent.getParcelableExtra("com.uptodown.sapk.confirmation_intent", Intent.class);
            parcelableExtra = (Parcelable) parcelableExtra2;
        } else {
            parcelableExtra = intent.getParcelableExtra("com.uptodown.sapk.confirmation_intent");
        }
        try {
            this.f30676b.launch((Intent) parcelableExtra);
        } catch (Exception e8) {
            e8.printStackTrace();
            m("installer_error");
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (!this.f30675a) {
            m("installer_error_aborted");
            j.f4395g.e();
        }
        super.onDestroy();
    }
}
