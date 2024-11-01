package p5;

import J4.j;
import android.content.Context;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.leanback.widget.Presenter;
import c5.r;
import com.uptodown.R;
import java.io.File;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.Y;
import l6.n;
import q5.C3791p;

/* loaded from: classes5.dex */
public final class g extends Presenter.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private TextView f36349a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f36350b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f36351c;

    /* renamed from: d, reason: collision with root package name */
    private ProgressBar f36352d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(View itemView) {
        super(itemView);
        AbstractC3292y.i(itemView, "itemView");
        View findViewById = itemView.findViewById(R.id.tv_nombre_app);
        AbstractC3292y.h(findViewById, "findViewById(...)");
        this.f36349a = (TextView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_size_download);
        AbstractC3292y.h(findViewById2, "findViewById(...)");
        this.f36350b = (TextView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.tv_date_download);
        AbstractC3292y.h(findViewById3, "findViewById(...)");
        this.f36351c = (TextView) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.progressbar_downloading);
        AbstractC3292y.h(findViewById4, "findViewById(...)");
        this.f36352d = (ProgressBar) findViewById4;
        TextView textView = this.f36349a;
        j.a aVar = j.f4395g;
        textView.setTypeface(aVar.v());
        this.f36350b.setTypeface(aVar.v());
        this.f36351c.setTypeface(aVar.v());
    }

    public final void a(File item, Context context) {
        AbstractC3292y.i(item, "item");
        if (context != null) {
            C3791p a9 = C3791p.f37286s.a(context);
            a9.a();
            String name = item.getName();
            AbstractC3292y.h(name, "getName(...)");
            r Y8 = a9.Y(name);
            a9.i();
            this.f36349a.setText(item.getName());
            this.f36350b.setText(new S4.g().c(item.length()));
            if (Y8 != null && Y8.p() == 0) {
                this.f36349a.setTypeface(j.f4395g.v());
            } else {
                this.f36349a.setTypeface(j.f4395g.v());
            }
            TextView textView = this.f36350b;
            j.a aVar = j.f4395g;
            textView.setTypeface(aVar.v());
            this.f36351c.setTypeface(aVar.v());
            if (Y8 != null && Y8.Z() > 0 && Y8.Z() < 100) {
                TextView textView2 = this.f36350b;
                Y y8 = Y.f34578a;
                Locale locale = Locale.getDefault();
                AbstractC3292y.f(Y8);
                String format = String.format(locale, "%d%%", Arrays.copyOf(new Object[]{Integer.valueOf(Y8.Z())}, 1));
                AbstractC3292y.h(format, "format(...)");
                textView2.setText(format);
                this.f36351c.setVisibility(8);
                this.f36352d.setProgress(Y8.Z());
                this.f36352d.setVisibility(0);
                return;
            }
            P4.a h8 = aVar.h();
            if (h8 != null && Y8 != null && n.s(h8.b(), Y8.Y(), true) && Y8.e0() > 0 && h8.e() == Y8.e0()) {
                this.f36352d.setIndeterminate(true);
                this.f36352d.setVisibility(0);
                this.f36351c.setText(R.string.installing);
                this.f36350b.setText("");
                return;
            }
            long lastModified = item.lastModified();
            DateFormat dateTimeInstance = DateFormat.getDateTimeInstance();
            this.f36351c.setVisibility(0);
            this.f36351c.setText(dateTimeInstance.format(new Date(lastModified)));
            this.f36350b.setText(new S4.g().c(item.length()));
            this.f36352d.setVisibility(4);
        }
    }
}
