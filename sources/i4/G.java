package I4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import b5.InterfaceC1978b;
import c5.C2041f;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import t5.C4019d0;
import t5.V0;

/* loaded from: classes5.dex */
public final class G extends RecyclerView.Adapter {

    /* renamed from: f, reason: collision with root package name */
    public static final a f3437f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f3438a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1978b f3439b;

    /* renamed from: c, reason: collision with root package name */
    private final b5.F f3440c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f3441d;

    /* renamed from: e, reason: collision with root package name */
    private int f3442e;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public G(ArrayList apps, Context context, InterfaceC1978b applistener, b5.F uptodownProtectListener) {
        AbstractC3292y.i(apps, "apps");
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(applistener, "applistener");
        AbstractC3292y.i(uptodownProtectListener, "uptodownProtectListener");
        this.f3438a = context;
        this.f3439b = applistener;
        this.f3440c = uptodownProtectListener;
        this.f3442e = -1;
        a(apps);
    }

    private final void a(ArrayList arrayList) {
        d(new ArrayList());
        b().add("uptodown_protect");
        this.f3442e = 0;
        b().addAll(arrayList);
    }

    public final ArrayList b() {
        ArrayList arrayList = this.f3441d;
        if (arrayList != null) {
            return arrayList;
        }
        AbstractC3292y.y(DataSchemeDataSource.SCHEME_DATA);
        return null;
    }

    public final void c(ArrayList apps) {
        AbstractC3292y.i(apps, "apps");
        a(apps);
        notifyDataSetChanged();
    }

    public final void d(ArrayList arrayList) {
        AbstractC3292y.i(arrayList, "<set-?>");
        this.f3441d = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return b().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i8) {
        Object obj = b().get(i8);
        AbstractC3292y.h(obj, "get(...)");
        if (obj instanceof C2041f) {
            return 0;
        }
        if (obj instanceof String) {
            if (AbstractC3292y.d((String) obj, "uptodown_protect")) {
                return 3;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        AbstractC3292y.i(viewHolder, "viewHolder");
        if (viewHolder instanceof C4019d0) {
            Object obj = b().get(i8);
            AbstractC3292y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
            ((C4019d0) viewHolder).c((C2041f) obj);
        } else {
            if (viewHolder instanceof V0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = b().iterator();
                AbstractC3292y.h(it, "iterator(...)");
                while (it.hasNext()) {
                    Object next = it.next();
                    AbstractC3292y.h(next, "next(...)");
                    if (next instanceof C2041f) {
                        arrayList.add(next);
                    }
                }
                ((V0) viewHolder).d(arrayList, this.f3438a);
                return;
            }
            throw new IllegalArgumentException("ViewHolder unknown!!");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3292y.i(viewGroup, "viewGroup");
        if (i8 != 0) {
            if (i8 == 3) {
                return new V0(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.uptodown_protect, viewGroup, false), this.f3440c);
            }
            throw new IllegalArgumentException("viewType unknown");
        }
        return new C4019d0(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.app_positive, viewGroup, false), this.f3439b, this.f3438a);
    }
}
