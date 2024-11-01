package I4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3292y;
import t5.C4029i0;

/* loaded from: classes5.dex */
public final class B extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f3418a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f3419b;

    /* renamed from: c, reason: collision with root package name */
    private final b5.z f3420c;

    public B(ArrayList datos, Context context, b5.z listener) {
        AbstractC3292y.i(datos, "datos");
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(listener, "listener");
        this.f3418a = datos;
        this.f3419b = context;
        this.f3420c = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C4029i0 viewHolder, int i8) {
        AbstractC3292y.i(viewHolder, "viewHolder");
        Object obj = this.f3418a.get(i8);
        AbstractC3292y.h(obj, "get(...)");
        viewHolder.e((c5.I) obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C4029i0 onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3292y.i(viewGroup, "viewGroup");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.reply, viewGroup, false);
        AbstractC3292y.f(inflate);
        return new C4029i0(inflate, this.f3419b, this.f3420c);
    }

    public final void c(c5.I reply) {
        AbstractC3292y.i(reply, "reply");
        Iterator it = this.f3418a.iterator();
        int i8 = 0;
        while (true) {
            if (it.hasNext()) {
                int i9 = i8 + 1;
                if (((c5.I) it.next()).f() == reply.f()) {
                    break;
                } else {
                    i8 = i9;
                }
            } else {
                i8 = -1;
                break;
            }
        }
        this.f3418a.set(i8, reply);
        notifyItemChanged(i8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f3418a.size();
    }
}
