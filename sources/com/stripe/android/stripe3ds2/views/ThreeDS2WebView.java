package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.stripe.android.stripe3ds2.views.f;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class ThreeDS2WebView extends WebView {

    /* renamed from: a, reason: collision with root package name */
    private final f f28246a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThreeDS2WebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3292y.i(context, "context");
    }

    private final void a() {
        WebSettings settings = getSettings();
        settings.setCacheMode(2);
        settings.setJavaScriptEnabled(false);
        settings.setAllowContentAccess(false);
        settings.setBlockNetworkImage(true);
        settings.setBlockNetworkLoads(true);
    }

    public final void setOnHtmlSubmitListener$3ds2sdk_release(f.b bVar) {
        this.f28246a.b(bVar);
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient client) {
        AbstractC3292y.i(client, "client");
    }

    public /* synthetic */ ThreeDS2WebView(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3284p abstractC3284p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreeDS2WebView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3292y.i(context, "context");
        f fVar = new f();
        this.f28246a = fVar;
        a();
        super.setWebViewClient(fVar);
    }
}
