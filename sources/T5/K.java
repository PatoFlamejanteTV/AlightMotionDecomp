package t5;

import J4.j;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.AlignmentSpan;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class K extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private b5.u f39722a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f39723b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f39724c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(View itemView, b5.u listener) {
        super(itemView);
        AbstractC3292y.i(itemView, "itemView");
        AbstractC3292y.i(listener, "listener");
        this.f39722a = listener;
        View findViewById = itemView.findViewById(R.id.tv_language_name_original);
        AbstractC3292y.h(findViewById, "findViewById(...)");
        this.f39723b = (TextView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_language_name_localized);
        AbstractC3292y.h(findViewById2, "findViewById(...)");
        this.f39724c = (TextView) findViewById2;
        TextView textView = this.f39723b;
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.v());
        this.f39724c.setTypeface(aVar.v());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(K k8, c5.y yVar, View view) {
        k8.f39722a.a(yVar);
    }

    public final void b(final c5.y lang, String currentLanguageCode) {
        AbstractC3292y.i(lang, "lang");
        AbstractC3292y.i(currentLanguageCode, "currentLanguageCode");
        this.f39723b.setText(lang.c());
        this.f39724c.setText(lang.b());
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: t5.J
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                K.c(K.this, lang, view);
            }
        });
        if (l6.n.s(lang.a(), "ar", false)) {
            if (!AbstractC3292y.d(currentLanguageCode, "ar")) {
                SpannableString spannableString = new SpannableString(lang.c());
                spannableString.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_OPPOSITE), 0, spannableString.length(), 33);
                this.f39723b.setText(spannableString);
                return;
            }
            return;
        }
        if (AbstractC3292y.d(currentLanguageCode, "ar")) {
            SpannableString spannableString2 = new SpannableString(lang.c());
            spannableString2.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_OPPOSITE), 0, spannableString2.length(), 33);
            this.f39723b.setText(spannableString2);
        }
    }
}
