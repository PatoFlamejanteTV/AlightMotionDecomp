package com.uptodown.activities;

import J4.j;
import Q5.InterfaceC1416k;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import c5.C2051p;
import com.uptodown.R;
import com.uptodown.activities.InformationActivity;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import q5.C3788m;

/* loaded from: classes4.dex */
public final class InformationActivity extends AbstractActivityC2691a {

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1416k f29574O = Q5.l.b(new Function0() { // from class: F4.d0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Y4.I c32;
            c32 = InformationActivity.c3(InformationActivity.this);
            return c32;
        }
    });

    /* loaded from: classes4.dex */
    public static final class a extends ClickableSpan {
        a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            AbstractC3292y.i(widget, "widget");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds) {
            AbstractC3292y.i(ds, "ds");
            super.updateDrawState(ds);
            ds.setColor(ContextCompat.getColor(InformationActivity.this, R.color.main_blue));
            ds.setTypeface(J4.j.f4395g.u());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Y4.I c3(InformationActivity informationActivity) {
        return Y4.I.c(informationActivity.getLayoutInflater());
    }

    private final Y4.I d3() {
        return (Y4.I) this.f29574O.getValue();
    }

    private final void e3() {
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        if (drawable != null) {
            d3().f12201c.setNavigationIcon(drawable);
            d3().f12201c.setNavigationContentDescription(getString(R.string.back));
        }
        d3().f12201c.setNavigationOnClickListener(new View.OnClickListener() { // from class: F4.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InformationActivity.f3(InformationActivity.this, view);
            }
        });
        TextView textView = d3().f12208j;
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.u());
        d3().f12202d.setTypeface(aVar.v());
        d3().f12203e.setTypeface(aVar.v());
        d3().f12204f.setTypeface(aVar.v());
        d3().f12206h.setTypeface(aVar.v());
        d3().f12207i.setTypeface(aVar.v());
        d3().f12205g.setTypeface(aVar.v());
        TextView textView2 = d3().f12205g;
        String string = getString(R.string.information_activity_dev_on_board_more_info);
        AbstractC3292y.h(string, "getString(...)");
        textView2.setText(h3(string));
        d3().f12205g.setOnClickListener(new View.OnClickListener() { // from class: F4.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InformationActivity.g3(InformationActivity.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f3(InformationActivity informationActivity, View view) {
        informationActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g3(InformationActivity informationActivity, View view) {
        String string = informationActivity.getString(R.string.url_dev_on_board);
        AbstractC3292y.h(string, "getString(...)");
        String string2 = informationActivity.getString(R.string.support_title);
        AbstractC3292y.h(string2, "getString(...)");
        new C3788m().q(informationActivity, string, string2);
    }

    private final SpannableStringBuilder h3(String str) {
        List<C2051p> d8 = C2051p.f15893f.d(str, "\\[a](.*?)\\[/a]");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(new l6.j("\\[a](.*?)\\[/a]").g(str, new Function1() { // from class: F4.e0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CharSequence i32;
                i32 = InformationActivity.i3((l6.h) obj);
                return i32;
            }
        }));
        for (C2051p c2051p : d8) {
            int R8 = l6.n.R(spannableStringBuilder, c2051p.d(), 0, false, 6, null);
            int length = c2051p.d().length() + R8;
            if (R8 >= 0) {
                spannableStringBuilder.setSpan(new a(), R8, length, 33);
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence i3(l6.h it) {
        AbstractC3292y.i(it, "it");
        return (CharSequence) it.a().get(1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2691a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(d3().getRoot());
        e3();
    }
}
