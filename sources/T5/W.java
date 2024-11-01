package t5;

import J4.j;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c5.C2032B;
import com.uptodown.R;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class W extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final b5.v f39799a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f39800b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f39801c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f39802d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f39803e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f39804f;

    /* renamed from: g, reason: collision with root package name */
    private ImageView f39805g;

    /* renamed from: h, reason: collision with root package name */
    private Context f39806h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(View itemView, b5.v vVar) {
        super(itemView);
        AbstractC3292y.i(itemView, "itemView");
        this.f39799a = vVar;
        View findViewById = itemView.findViewById(R.id.tv_title);
        AbstractC3292y.h(findViewById, "findViewById(...)");
        this.f39800b = (TextView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_msg);
        AbstractC3292y.h(findViewById2, "findViewById(...)");
        this.f39801c = (TextView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.tv_action_01);
        AbstractC3292y.h(findViewById3, "findViewById(...)");
        this.f39802d = (TextView) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.tv_action_02);
        AbstractC3292y.h(findViewById4, "findViewById(...)");
        this.f39803e = (TextView) findViewById4;
        View findViewById5 = itemView.findViewById(R.id.tv_date);
        AbstractC3292y.h(findViewById5, "findViewById(...)");
        this.f39804f = (TextView) findViewById5;
        View findViewById6 = itemView.findViewById(R.id.iv_delete_notification);
        AbstractC3292y.h(findViewById6, "findViewById(...)");
        this.f39805g = (ImageView) findViewById6;
        Context context = itemView.getContext();
        AbstractC3292y.h(context, "getContext(...)");
        this.f39806h = context;
        this.f39802d.setOnClickListener(new View.OnClickListener() { // from class: t5.T
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                W.d(W.this, view);
            }
        });
        this.f39803e.setOnClickListener(new View.OnClickListener() { // from class: t5.U
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                W.e(W.this, view);
            }
        });
        this.f39805g.setOnClickListener(new View.OnClickListener() { // from class: t5.V
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                W.f(W.this, view);
            }
        });
        TextView textView = this.f39800b;
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.v());
        this.f39801c.setTypeface(aVar.v());
        this.f39804f.setTypeface(aVar.v());
        this.f39802d.setTypeface(aVar.u());
        this.f39803e.setTypeface(aVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(W w8, View view) {
        int bindingAdapterPosition;
        if (w8.f39799a != null && (bindingAdapterPosition = w8.getBindingAdapterPosition()) != -1) {
            w8.f39799a.c(bindingAdapterPosition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(W w8, View view) {
        int bindingAdapterPosition;
        if (w8.f39799a != null && (bindingAdapterPosition = w8.getBindingAdapterPosition()) != -1) {
            w8.f39799a.a(bindingAdapterPosition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(W w8, View view) {
        int bindingAdapterPosition;
        if (w8.f39799a != null && (bindingAdapterPosition = w8.getBindingAdapterPosition()) != -1) {
            w8.f39799a.b(bindingAdapterPosition);
        }
    }

    private final String g(String str) {
        switch (str.hashCode()) {
            case -1569440520:
                if (!str.equals("positive_apps")) {
                    return "";
                }
                String string = this.f39806h.getString(R.string.title_positive_apps);
                AbstractC3292y.h(string, "getString(...)");
                return string;
            case -1335458389:
                if (str.equals("delete")) {
                    String string2 = this.f39806h.getString(R.string.option_button_delete);
                    AbstractC3292y.h(string2, "getString(...)");
                    return string2;
                }
                return "";
            case -504325460:
                if (str.equals("open_app")) {
                    String string3 = this.f39806h.getString(R.string.open);
                    AbstractC3292y.h(string3, "getString(...)");
                    return string3;
                }
                return "";
            case -234430262:
                if (str.equals("updates")) {
                    String string4 = this.f39806h.getString(R.string.updates);
                    AbstractC3292y.h(string4, "getString(...)");
                    return string4;
                }
                return "";
            case 212443764:
                str.equals("no_action");
                return "";
            case 1085191854:
                if (str.equals("update_uptodown")) {
                    String string5 = this.f39806h.getString(R.string.action_update);
                    AbstractC3292y.h(string5, "getString(...)");
                    return string5;
                }
                return "";
            case 1117687366:
                if (str.equals("preregister")) {
                    String string6 = this.f39806h.getString(R.string.action_app_details_settings);
                    AbstractC3292y.h(string6, "getString(...)");
                    return string6;
                }
                return "";
            case 1312704747:
                if (str.equals("downloads")) {
                    String string7 = this.f39806h.getString(R.string.downloads_title);
                    AbstractC3292y.h(string7, "getString(...)");
                    return string7;
                }
                return "";
            case 1957569947:
                if (str.equals("install")) {
                    String string8 = this.f39806h.getString(R.string.option_button_install);
                    AbstractC3292y.h(string8, "getString(...)");
                    return string8;
                }
                return "";
            default:
                return "";
        }
    }

    public final void h(C2032B notificationRegistry) {
        AbstractC3292y.i(notificationRegistry, "notificationRegistry");
        this.f39800b.setText(notificationRegistry.f());
        this.f39801c.setText(notificationRegistry.d());
        String e8 = notificationRegistry.e();
        AbstractC3292y.f(e8);
        Date date = new Date(Long.parseLong(e8));
        this.f39804f.setText(DateFormat.getDateTimeInstance().format(Long.valueOf(date.getTime())));
        String a9 = notificationRegistry.a();
        this.f39802d.setVisibility(8);
        this.f39803e.setVisibility(8);
        if (a9 != null && !l6.n.G(a9, "no_action", false, 2, null)) {
            List s02 = l6.n.s0(a9, new String[]{";"}, false, 0, 6, null);
            int size = s02.size();
            if (size != 1) {
                if (size == 2) {
                    this.f39802d.setText(g((String) s02.get(0)));
                    this.f39803e.setText(g((String) s02.get(1)));
                    this.f39802d.setVisibility(0);
                    this.f39803e.setVisibility(0);
                    return;
                }
                return;
            }
            this.f39802d.setText(g((String) s02.get(0)));
            this.f39802d.setVisibility(0);
        }
    }
}
