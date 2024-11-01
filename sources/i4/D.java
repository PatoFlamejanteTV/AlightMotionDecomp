package I4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import b5.InterfaceC1973B;
import c5.C2041f;
import com.uptodown.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3292y;
import t5.C4045q0;

/* loaded from: classes5.dex */
public final class D extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f3426a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f3427b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1973B f3428c;

    public D(ArrayList rollbackApps, Context context, InterfaceC1973B listener) {
        AbstractC3292y.i(rollbackApps, "rollbackApps");
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(listener, "listener");
        this.f3426a = rollbackApps;
        this.f3427b = context;
        this.f3428c = listener;
    }

    public final ArrayList a() {
        return this.f3426a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C4045q0 viewHolder, int i8) {
        AbstractC3292y.i(viewHolder, "viewHolder");
        Object obj = this.f3426a.get(i8);
        AbstractC3292y.h(obj, "get(...)");
        viewHolder.c((C2041f) obj, this.f3427b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C4045q0 onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3292y.i(viewGroup, "viewGroup");
        View inflate = LayoutInflater.from(this.f3427b).inflate(R.layout.rollback_item, viewGroup, false);
        AbstractC3292y.f(inflate);
        return new C4045q0(inflate, this.f3428c);
    }

    public final void d(ArrayList arrayList) {
        if (arrayList != null) {
            this.f3426a = new ArrayList(arrayList);
        } else {
            this.f3426a = new ArrayList();
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f3426a.size();
    }
}
