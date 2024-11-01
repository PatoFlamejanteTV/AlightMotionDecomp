package I4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import b5.InterfaceC1977a;
import c5.C2043h;
import com.uptodown.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3292y;
import t5.C4018d;

/* renamed from: I4.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1238q extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private b5.s f3703a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC1977a f3704b;

    /* renamed from: c, reason: collision with root package name */
    private Context f3705c;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f3706d;

    public C1238q(b5.s listener, InterfaceC1977a actionsClickListener, Context context) {
        AbstractC3292y.i(listener, "listener");
        AbstractC3292y.i(actionsClickListener, "actionsClickListener");
        AbstractC3292y.i(context, "context");
        this.f3703a = listener;
        this.f3704b = actionsClickListener;
        this.f3705c = context;
        this.f3706d = new ArrayList();
    }

    public final ArrayList a() {
        return this.f3706d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C4018d holder, int i8) {
        AbstractC3292y.i(holder, "holder");
        Object obj = this.f3706d.get(i8);
        AbstractC3292y.h(obj, "get(...)");
        holder.m((C2043h) obj, i8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C4018d onCreateViewHolder(ViewGroup parent, int i8) {
        AbstractC3292y.i(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.app_info_item_small, parent, false);
        AbstractC3292y.f(inflate);
        return new C4018d(inflate, this.f3703a, this.f3704b, this.f3705c);
    }

    public final void d(ArrayList appList) {
        AbstractC3292y.i(appList, "appList");
        ArrayList arrayList = this.f3706d;
        arrayList.clear();
        arrayList.addAll(appList);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f3706d.size();
    }
}
