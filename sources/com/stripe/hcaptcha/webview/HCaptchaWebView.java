package com.stripe.hcaptcha.webview;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContentInfo;
import android.webkit.WebView;
import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.AbstractC3292y;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class HCaptchaWebView extends WebView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HCaptchaWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC3292y.i(context, "context");
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onCheckIsTextEditor() {
        if (AbstractC3292y.d(Looper.myLooper(), Looper.getMainLooper())) {
            return super.onCheckIsTextEditor();
        }
        return false;
    }

    @Override // android.view.View
    public ContentInfo onReceiveContent(ContentInfo payload) {
        AbstractC3292y.i(payload, "payload");
        Log.d("TEST", "got content");
        return super.onReceiveContent(payload);
    }

    @Override // android.view.View
    public boolean performClick() {
        return false;
    }
}
