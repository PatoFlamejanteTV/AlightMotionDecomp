package M4;

import J4.f;
import O4.j;
import Q4.h;
import android.net.nsd.NsdServiceInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class a extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f6167a;

    /* renamed from: b, reason: collision with root package name */
    private j f6168b;

    public a(ArrayList arrayList, j listener) {
        AbstractC3292y.i(listener, "listener");
        this.f6167a = arrayList;
        this.f6168b = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(W4.b holder, int i8) {
        AbstractC3292y.i(holder, "holder");
        TextView c8 = holder.c();
        h.a aVar = h.f8759h;
        ArrayList arrayList = this.f6167a;
        AbstractC3292y.f(arrayList);
        String serviceName = ((NsdServiceInfo) arrayList.get(i8)).getServiceName();
        AbstractC3292y.h(serviceName, "data!![position].serviceName");
        c8.setText(aVar.c(serviceName));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public W4.b onCreateViewHolder(ViewGroup parent, int i8) {
        AbstractC3292y.i(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(f.f4302c, parent, false);
        AbstractC3292y.h(inflate, "from(parent.context).inf…vice_item, parent, false)");
        return new W4.b(inflate, this.f6168b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        ArrayList arrayList = this.f6167a;
        AbstractC3292y.f(arrayList);
        return arrayList.size();
    }
}
