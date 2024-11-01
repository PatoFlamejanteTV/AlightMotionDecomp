package t5;

import J4.j;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import com.uptodown.util.views.UsernameTextView;
import kotlin.jvm.internal.AbstractC3292y;
import q5.C3770C;

/* renamed from: t5.i0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4029i0 extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final Context f39913a;

    /* renamed from: b, reason: collision with root package name */
    private final b5.z f39914b;

    /* renamed from: c, reason: collision with root package name */
    private final ImageView f39915c;

    /* renamed from: d, reason: collision with root package name */
    private final UsernameTextView f39916d;

    /* renamed from: e, reason: collision with root package name */
    private final ImageView f39917e;

    /* renamed from: f, reason: collision with root package name */
    private final TextView f39918f;

    /* renamed from: g, reason: collision with root package name */
    private final TextView f39919g;

    /* renamed from: h, reason: collision with root package name */
    private final LinearLayout f39920h;

    /* renamed from: i, reason: collision with root package name */
    private final ImageView f39921i;

    /* renamed from: j, reason: collision with root package name */
    private final TextView f39922j;

    /* renamed from: k, reason: collision with root package name */
    private final ImageView f39923k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4029i0(View itemView, Context context, b5.z listener) {
        super(itemView);
        AbstractC3292y.i(itemView, "itemView");
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(listener, "listener");
        this.f39913a = context;
        this.f39914b = listener;
        View findViewById = itemView.findViewById(R.id.iv_avatar_review);
        AbstractC3292y.h(findViewById, "findViewById(...)");
        this.f39915c = (ImageView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_username_review);
        AbstractC3292y.h(findViewById2, "findViewById(...)");
        UsernameTextView usernameTextView = (UsernameTextView) findViewById2;
        this.f39916d = usernameTextView;
        View findViewById3 = itemView.findViewById(R.id.iv_author_verified_review);
        AbstractC3292y.h(findViewById3, "findViewById(...)");
        this.f39917e = (ImageView) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.tv_date_review);
        AbstractC3292y.h(findViewById4, "findViewById(...)");
        TextView textView = (TextView) findViewById4;
        this.f39918f = textView;
        View findViewById5 = itemView.findViewById(R.id.tv_body_review);
        AbstractC3292y.h(findViewById5, "findViewById(...)");
        TextView textView2 = (TextView) findViewById5;
        this.f39919g = textView2;
        View findViewById6 = itemView.findViewById(R.id.ll_likes_review);
        AbstractC3292y.h(findViewById6, "findViewById(...)");
        this.f39920h = (LinearLayout) findViewById6;
        View findViewById7 = itemView.findViewById(R.id.iv_likes_counter_review);
        AbstractC3292y.h(findViewById7, "findViewById(...)");
        this.f39921i = (ImageView) findViewById7;
        View findViewById8 = itemView.findViewById(R.id.tv_likes_counter_review);
        AbstractC3292y.h(findViewById8, "findViewById(...)");
        TextView textView3 = (TextView) findViewById8;
        this.f39922j = textView3;
        View findViewById9 = itemView.findViewById(R.id.iv_turbo_mark_review);
        AbstractC3292y.h(findViewById9, "findViewById(...)");
        ImageView imageView = (ImageView) findViewById9;
        this.f39923k = imageView;
        j.a aVar = J4.j.f4395g;
        usernameTextView.setTypeface(aVar.u());
        textView.setTypeface(aVar.v());
        textView2.setTypeface(aVar.v());
        textView3.setTypeface(aVar.v());
        imageView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C4029i0 c4029i0, c5.I i8, View view) {
        s5.k.a(c4029i0.f39913a, c4029i0.f39921i);
        if (!C3770C.f37260a.g(i8.f())) {
            c4029i0.f39914b.c(i8);
            c4029i0.f39922j.setText(String.valueOf(i8.h() + 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(C4029i0 c4029i0, c5.I i8, View view) {
        b5.z zVar = c4029i0.f39914b;
        String p8 = i8.p();
        AbstractC3292y.f(p8);
        zVar.d(p8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(C4029i0 c4029i0, c5.I i8, View view) {
        b5.z zVar = c4029i0.f39914b;
        String p8 = i8.p();
        AbstractC3292y.f(p8);
        zVar.d(p8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(C4029i0 c4029i0, View view) {
        c4029i0.f39914b.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(final c5.I r6) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.C4029i0.e(c5.I):void");
    }
}
