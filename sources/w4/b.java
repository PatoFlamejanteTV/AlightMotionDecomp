package W4;

import O4.j;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class b extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private TextView f10770a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(View itemView, final j jVar) {
        super(itemView);
        AbstractC3292y.i(itemView, "itemView");
        View findViewById = itemView.findViewById(J4.e.f4181M0);
        AbstractC3292y.h(findViewById, "itemView.findViewById(R.id.tv_device_name)");
        this.f10770a = (TextView) findViewById;
        itemView.setOnClickListener(new View.OnClickListener() { // from class: W4.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b.b(j.this, this, view);
            }
        });
        this.f10770a.setTypeface(J4.j.f4395g.v());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(j jVar, b this$0, View view) {
        int absoluteAdapterPosition;
        AbstractC3292y.i(this$0, "this$0");
        if (jVar != null && (absoluteAdapterPosition = this$0.getAbsoluteAdapterPosition()) != -1) {
            jVar.a(view, absoluteAdapterPosition);
        }
    }

    public final TextView c() {
        return this.f10770a;
    }
}
