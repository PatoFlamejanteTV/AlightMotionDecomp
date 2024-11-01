package com.stripe.android.link;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class LinkForegroundActivity extends AppCompatActivity {

    /* renamed from: b, reason: collision with root package name */
    public static final a f25195b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f25196c = 8;

    /* renamed from: a, reason: collision with root package name */
    private boolean f25197a;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final Intent a(Context context, String popupUrl) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(popupUrl, "popupUrl");
            Intent putExtra = new Intent(context, (Class<?>) LinkForegroundActivity.class).putExtra("LinkPopupUrl", popupUrl);
            AbstractC3292y.h(putExtra, "putExtra(...)");
            return putExtra;
        }

        public final Intent b(Context context, Uri uri) {
            AbstractC3292y.i(context, "context");
            Intent intent = new Intent(context, (Class<?>) LinkForegroundActivity.class);
            intent.setAction("LinkForegroundActivity.redirect");
            intent.setData(uri);
            intent.addFlags(603979776);
            return intent;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private final void k(Intent intent) {
        if (AbstractC3292y.d(intent.getAction(), "LinkForegroundActivity.redirect")) {
            setResult(49871, intent);
            finish();
        }
    }

    private final void l() {
        Uri uri;
        String string;
        this.f25197a = true;
        Bundle extras = getIntent().getExtras();
        if (extras != null && (string = extras.getString("LinkPopupUrl")) != null) {
            uri = Uri.parse(string);
        } else {
            uri = null;
        }
        if (uri == null) {
            setResult(0);
            finish();
            return;
        }
        try {
            new CustomTabsIntent.Builder().setShareState(2).build().launchUrl(this, uri);
        } catch (ActivityNotFoundException e8) {
            setResult(91367, new Intent().putExtra("LinkFailure", e8));
            finish();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean z8;
        super.onCreate(bundle);
        if (bundle != null) {
            z8 = bundle.getBoolean("LinkHasLaunchedPopup");
        } else {
            z8 = false;
        }
        this.f25197a = z8;
        Intent intent = getIntent();
        AbstractC3292y.h(intent, "getIntent(...)");
        k(intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        AbstractC3292y.i(intent, "intent");
        super.onNewIntent(intent);
        k(intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!isFinishing()) {
            if (this.f25197a) {
                setResult(0);
                finish();
            } else {
                l();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        AbstractC3292y.i(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putBoolean("LinkHasLaunchedPopup", this.f25197a);
    }
}
