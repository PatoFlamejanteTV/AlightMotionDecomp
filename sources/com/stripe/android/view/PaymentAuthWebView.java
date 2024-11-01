package com.stripe.android.view;

import B2.y;
import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class PaymentAuthWebView extends WebView {

    /* renamed from: a, reason: collision with root package name */
    private Function0 f28706a;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f28707a = new a();

        a() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5534invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5534invoke();
            return Q5.I.f8786a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentAuthWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3292y.i(context, "context");
    }

    private final void a() {
        clearHistory();
        this.f28706a.invoke();
        loadUrl("about:blank");
        onPause();
        removeAllViews();
        destroyDrawingCache();
    }

    private final void b() {
        String c8 = y.d.c(B2.y.f536b, null, 1, null);
        WebSettings settings = getSettings();
        String userAgentString = getSettings().getUserAgentString();
        if (userAgentString == null) {
            userAgentString = "";
        }
        settings.setUserAgentString(userAgentString + " [" + c8 + "]");
        getSettings().setJavaScriptEnabled(true);
        getSettings().setAllowContentAccess(false);
        getSettings().setDomStorageEnabled(true);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        a();
        super.destroy();
    }

    public final Function0 getOnLoadBlank$payments_core_release() {
        return this.f28706a;
    }

    public final void setOnLoadBlank$payments_core_release(Function0 function0) {
        AbstractC3292y.i(function0, "<set-?>");
        this.f28706a = function0;
    }

    public /* synthetic */ PaymentAuthWebView(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3284p abstractC3284p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentAuthWebView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3292y.i(context, "context");
        this.f28706a = a.f28707a;
        b();
    }
}
