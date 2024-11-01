package I4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import b5.InterfaceC1978b;
import c5.C2041f;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3292y;
import t5.C4061z;

/* renamed from: I4.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1230i extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3625a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1978b f3626b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f3627c;

    public C1230i(ArrayList apps, Context context, InterfaceC1978b applistener) {
        AbstractC3292y.i(apps, "apps");
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(applistener, "applistener");
        this.f3625a = context;
        this.f3626b = applistener;
        b(apps);
    }

    public final ArrayList a() {
        ArrayList arrayList = this.f3627c;
        if (arrayList != null) {
            return arrayList;
        }
        AbstractC3292y.y(DataSchemeDataSource.SCHEME_DATA);
        return null;
    }

    public final void b(ArrayList apps) {
        AbstractC3292y.i(apps, "apps");
        c(apps);
        notifyDataSetChanged();
    }

    public final void c(ArrayList arrayList) {
        AbstractC3292y.i(arrayList, "<set-?>");
        this.f3627c = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return a().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        AbstractC3292y.i(viewHolder, "viewHolder");
        if (viewHolder instanceof C4061z) {
            Object obj = a().get(i8);
            AbstractC3292y.h(obj, "get(...)");
            ((C4061z) viewHolder).k((C2041f) obj);
            return;
        }
        throw new IllegalArgumentException("ViewHolder unknown!!");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3292y.i(viewGroup, "viewGroup");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.free_up_item, viewGroup, false);
        AbstractC3292y.f(inflate);
        return new C4061z(inflate, this.f3626b, this.f3625a);
    }
}
