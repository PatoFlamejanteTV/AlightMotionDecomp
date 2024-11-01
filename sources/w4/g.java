package W4;

import J4.j;
import O4.l;
import android.view.View;
import android.widget.CheckBox;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class g extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    public CheckBox f10783a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(View itemView, final l listener) {
        super(itemView);
        AbstractC3292y.i(itemView, "itemView");
        AbstractC3292y.i(listener, "listener");
        View findViewById = itemView.findViewById(J4.e.f4255l);
        AbstractC3292y.h(findViewById, "itemView.findViewById(R.id.cb_split_item)");
        this.f10783a = (CheckBox) findViewById;
        itemView.setOnClickListener(new View.OnClickListener() { // from class: W4.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g.b(g.this, listener, view);
            }
        });
        this.f10783a.setTypeface(j.f4395g.v());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(g this$0, l listener, View view) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(listener, "$listener");
        int absoluteAdapterPosition = this$0.getAbsoluteAdapterPosition();
        if (absoluteAdapterPosition != -1) {
            listener.a(view, absoluteAdapterPosition);
        }
    }
}
