package com.stripe.android.stripe3ds2.views;

import V3.i;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.stripe.android.stripe3ds2.views.f;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import l6.j;

/* loaded from: classes4.dex */
public final class e extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    private static final a f28343d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Pattern f28344e = Pattern.compile("method=\"post\"", 10);

    /* renamed from: f, reason: collision with root package name */
    private static final Pattern f28345f = Pattern.compile("action=\"(.+?)\"", 10);

    /* renamed from: a, reason: collision with root package name */
    private final ThreeDS2WebView f28346a;

    /* renamed from: b, reason: collision with root package name */
    private String f28347b;

    /* renamed from: c, reason: collision with root package name */
    private View.OnClickListener f28348c;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public /* synthetic */ e(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3284p abstractC3284p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(e this$0, String str) {
        AbstractC3292y.i(this$0, "this$0");
        if (str == null) {
            str = "";
        }
        this$0.f28347b = str;
        View.OnClickListener onClickListener = this$0.f28348c;
        if (onClickListener != null) {
            onClickListener.onClick(this$0);
        }
    }

    private final String d(String str) {
        String group;
        Matcher matcher = f28345f.matcher(str);
        if (matcher.find() && (group = matcher.group(1)) != null && !AbstractC3292y.d("https://emv3ds/challenge", group)) {
            return new j(group).f(str, "https://emv3ds/challenge");
        }
        return str;
    }

    private final String e(String str) {
        String replaceAll = f28344e.matcher(str).replaceAll("method=\"get\"");
        AbstractC3292y.h(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public final void c(String str) {
        if (str == null) {
            return;
        }
        this.f28346a.loadDataWithBaseURL(null, f(str), "text/html", C.UTF8_NAME, null);
    }

    public final String f(String html) {
        AbstractC3292y.i(html, "html");
        return d(e(html));
    }

    public final View.OnClickListener getOnClickListener$3ds2sdk_release() {
        return this.f28348c;
    }

    public String getUserEntry() {
        return this.f28347b;
    }

    public final ThreeDS2WebView getWebView() {
        return this.f28346a;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f28348c = onClickListener;
    }

    public final void setOnClickListener$3ds2sdk_release(View.OnClickListener onClickListener) {
        this.f28348c = onClickListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3292y.i(context, "context");
        this.f28347b = "";
        i b9 = i.b(LayoutInflater.from(context), this);
        AbstractC3292y.h(b9, "inflate(...)");
        ThreeDS2WebView webView = b9.f10579b;
        AbstractC3292y.h(webView, "webView");
        this.f28346a = webView;
        webView.setOnHtmlSubmitListener$3ds2sdk_release(new f.b() { // from class: f4.l
            @Override // com.stripe.android.stripe3ds2.views.f.b
            public final void a(String str) {
                com.stripe.android.stripe3ds2.views.e.b(com.stripe.android.stripe3ds2.views.e.this, str);
            }
        });
    }
}
