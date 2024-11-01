package t5;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class M0 extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final Context f39734a;

    /* renamed from: b, reason: collision with root package name */
    private final TextView f39735b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M0(View itemView, Context context) {
        super(itemView);
        AbstractC3292y.i(itemView, "itemView");
        AbstractC3292y.i(context, "context");
        this.f39734a = context;
        View findViewById = itemView.findViewById(R.id.tv_updates_available_updates);
        AbstractC3292y.h(findViewById, "findViewById(...)");
        TextView textView = (TextView) findViewById;
        this.f39735b = textView;
        textView.setTypeface(J4.j.f4395g.u());
    }

    public final void a(int i8) {
        if (i8 == 0) {
            this.f39735b.setText(this.f39734a.getString(R.string.no_pending_updates));
        } else {
            this.f39735b.setText(this.f39734a.getString(R.string.my_downloads_pending));
        }
    }
}
