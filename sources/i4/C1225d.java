package I4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import b5.InterfaceC1985i;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: I4.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1225d extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3597a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1985i f3598b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f3599c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3600d;

    /* renamed from: e, reason: collision with root package name */
    private boolean[] f3601e;

    public C1225d(ArrayList downloadsCompleted, ArrayList arrayList, Context context, InterfaceC1985i listener) {
        AbstractC3292y.i(downloadsCompleted, "downloadsCompleted");
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(listener, "listener");
        this.f3597a = context;
        this.f3598b = listener;
        b(downloadsCompleted, arrayList);
    }

    private final void a(t5.r rVar, c5.r rVar2, boolean z8, boolean z9) {
        if (rVar2.f() == null) {
            rVar.p(rVar2, z8, z9);
        } else {
            rVar.o(rVar2, z8, z9);
        }
    }

    private final void b(ArrayList arrayList, ArrayList arrayList2) {
        h(new ArrayList());
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            d().addAll(arrayList2);
        }
        if (!arrayList.isEmpty()) {
            d().addAll(arrayList);
        }
        this.f3601e = new boolean[d().size()];
    }

    public final int c() {
        boolean[] zArr = this.f3601e;
        if (zArr == null) {
            return 0;
        }
        AbstractC3292y.f(zArr);
        int i8 = 0;
        for (boolean z8 : zArr) {
            if (z8) {
                i8++;
            }
        }
        return i8;
    }

    public final ArrayList d() {
        ArrayList arrayList = this.f3599c;
        if (arrayList != null) {
            return arrayList;
        }
        AbstractC3292y.y(DataSchemeDataSource.SCHEME_DATA);
        return null;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        boolean[] zArr = this.f3601e;
        AbstractC3292y.f(zArr);
        int length = zArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (zArr[i8]) {
                boolean[] zArr2 = this.f3601e;
                AbstractC3292y.f(zArr2);
                if (i8 < zArr2.length) {
                    arrayList.add(d().get(i8));
                }
            }
        }
        return arrayList;
    }

    public final boolean f() {
        return this.f3600d;
    }

    public final void g(ArrayList downloads, ArrayList arrayList) {
        AbstractC3292y.i(downloads, "downloads");
        b(downloads, arrayList);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return d().size();
    }

    public final void h(ArrayList arrayList) {
        AbstractC3292y.i(arrayList, "<set-?>");
        this.f3599c = arrayList;
    }

    public final void i(int i8) {
        boolean[] zArr = this.f3601e;
        AbstractC3292y.f(zArr);
        AbstractC3292y.f(this.f3601e);
        zArr[i8] = !r1[i8];
        notifyItemChanged(i8);
    }

    public final void j(boolean z8) {
        this.f3600d = z8;
        if (!z8) {
            if (!d().isEmpty()) {
                this.f3601e = new boolean[d().size()];
            } else {
                this.f3601e = new boolean[0];
            }
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        AbstractC3292y.i(viewHolder, "viewHolder");
        Object obj = d().get(i8);
        AbstractC3292y.h(obj, "get(...)");
        boolean z8 = this.f3600d;
        boolean[] zArr = this.f3601e;
        AbstractC3292y.f(zArr);
        a((t5.r) viewHolder, (c5.r) obj, z8, zArr[i8]);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3292y.i(viewGroup, "viewGroup");
        View inflate = LayoutInflater.from(this.f3597a).inflate(R.layout.download_item, viewGroup, false);
        AbstractC3292y.f(inflate);
        return new t5.r(inflate, this.f3598b);
    }
}
