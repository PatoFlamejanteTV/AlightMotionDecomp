package t5;

import J4.j;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3292y;
import t5.G0;

/* loaded from: classes5.dex */
public final class G0 extends RecyclerView.ViewHolder {

    /* loaded from: classes5.dex */
    public static final class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f39698a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f39699b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f39700c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f39701d;

        a(TextView textView, View view, String str, String str2) {
            this.f39698a = textView;
            this.f39699b = view;
            this.f39700c = str;
            this.f39701d = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(TextView textView, View view, TextView textView2, String str, String str2, View view2) {
            if (textView.getMaxLines() == 3) {
                textView.setMaxLines(Integer.MAX_VALUE);
                view.setVisibility(8);
                textView2.setText(str);
            } else {
                textView.setMaxLines(3);
                view.setVisibility(0);
                textView2.setText(str2);
            }
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f39698a.getViewTreeObserver().removeOnPreDrawListener(this);
            if (s5.u.a(this.f39698a)) {
                final View findViewById = this.f39699b.findViewById(R.id.shadow_description_category_description);
                final TextView textView = (TextView) this.f39699b.findViewById(R.id.tv_read_more_category_description);
                textView.setTypeface(J4.j.f4395g.u());
                textView.setVisibility(0);
                final TextView textView2 = this.f39698a;
                final String str = this.f39700c;
                final String str2 = this.f39701d;
                textView.setOnClickListener(new View.OnClickListener() { // from class: t5.F0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        G0.a.b(textView2, findViewById, textView, str, str2, view);
                    }
                });
                findViewById.setVisibility(0);
                return true;
            }
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G0(View itemView, String str, String str2, String readMore, String readLess) {
        super(itemView);
        AbstractC3292y.i(itemView, "itemView");
        AbstractC3292y.i(readMore, "readMore");
        AbstractC3292y.i(readLess, "readLess");
        if (str != null && str.length() != 0) {
            View findViewById = itemView.findViewById(R.id.tv_top_by_category_description);
            AbstractC3292y.h(findViewById, "findViewById(...)");
            TextView textView = (TextView) findViewById;
            j.a aVar = J4.j.f4395g;
            textView.setTypeface(aVar.v());
            textView.setText(str);
            textView.getViewTreeObserver().addOnPreDrawListener(new a(textView, itemView, readLess, readMore));
            if (str2 != null && str2.length() != 0) {
                View findViewById2 = itemView.findViewById(R.id.tv_top_by_category_title);
                AbstractC3292y.h(findViewById2, "findViewById(...)");
                TextView textView2 = (TextView) findViewById2;
                textView2.setTypeface(aVar.u());
                textView2.setText(str2);
                textView2.setVisibility(0);
                return;
            }
            return;
        }
        itemView.setVisibility(8);
    }
}
