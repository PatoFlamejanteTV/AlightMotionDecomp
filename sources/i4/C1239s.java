package I4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import b5.InterfaceC1976E;
import b5.InterfaceC1978b;
import c5.C2041f;
import c5.C2043h;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import t5.C4022f;
import t5.R0;

/* renamed from: I4.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1239s extends RecyclerView.Adapter {

    /* renamed from: f, reason: collision with root package name */
    public static final a f3710f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f3711a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1978b f3712b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1976E f3713c;

    /* renamed from: d, reason: collision with root package name */
    private final b5.t f3714d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f3715e;

    /* renamed from: I4.s$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public C1239s(ArrayList apps, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Context context, InterfaceC1978b appListener, InterfaceC1976E interfaceC1976E, b5.t infoClickListener) {
        AbstractC3292y.i(apps, "apps");
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(appListener, "appListener");
        AbstractC3292y.i(infoClickListener, "infoClickListener");
        this.f3711a = context;
        this.f3712b = appListener;
        this.f3713c = interfaceC1976E;
        this.f3714d = infoClickListener;
        a(apps, arrayList, arrayList2, arrayList3);
    }

    private final void a(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        f(new ArrayList());
        b().addAll(arrayList);
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            b().add("title_system_app");
            b().addAll(arrayList2);
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            b().add("title_disable_app");
            b().addAll(arrayList3);
        }
        if (arrayList4 != null && !arrayList4.isEmpty()) {
            b().add("title_system_service");
            b().addAll(arrayList4);
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = this.f3715e;
        if (arrayList != null) {
            return arrayList;
        }
        AbstractC3292y.y(DataSchemeDataSource.SCHEME_DATA);
        return null;
    }

    public final void c() {
        notifyDataSetChanged();
    }

    public final void d(C2043h appInfo) {
        AbstractC3292y.i(appInfo, "appInfo");
        int i8 = 0;
        for (Object obj : b()) {
            int i9 = i8 + 1;
            if (obj instanceof C2041f) {
                C2041f c2041f = (C2041f) obj;
                if (AbstractC3292y.d(c2041f.Q(), appInfo.v0())) {
                    c2041f.O0(appInfo.r0());
                    notifyItemChanged(i8);
                    return;
                }
            }
            i8 = i9;
        }
    }

    public final void e(HashMap hashMap) {
        AbstractC3292y.i(hashMap, "hashMap");
        int i8 = 0;
        for (Object obj : b()) {
            int i9 = i8 + 1;
            if (obj instanceof C2041f) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    C2041f c2041f = (C2041f) obj;
                    if (AbstractC3292y.d(entry.getKey(), c2041f.Q())) {
                        c2041f.O0((String) entry.getValue());
                        notifyItemChanged(i8);
                    }
                }
            }
            i8 = i9;
        }
    }

    public final void f(ArrayList arrayList) {
        AbstractC3292y.i(arrayList, "<set-?>");
        this.f3715e = arrayList;
    }

    public final void g(ArrayList apps, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        AbstractC3292y.i(apps, "apps");
        a(apps, arrayList, arrayList2, arrayList3);
        notifyDataSetChanged();
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
            if (((C2041f) obj).c0() == C2041f.c.f15790a) {
                return 1;
            }
            return 0;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            int hashCode = str.hashCode();
            if (hashCode != 1477891299) {
                if (hashCode != 1692569964) {
                    if (hashCode == 2032679000 && str.equals("title_system_app")) {
                        return 2;
                    }
                } else if (str.equals("title_system_service")) {
                    return 3;
                }
            } else if (str.equals("title_disable_app")) {
                return 4;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        AbstractC3292y.i(viewHolder, "viewHolder");
        if (viewHolder instanceof C4022f) {
            Object obj = b().get(i8);
            AbstractC3292y.g(obj, "null cannot be cast to non-null type com.uptodown.models.App");
            ((C4022f) viewHolder).c((C2041f) obj);
        } else if (viewHolder instanceof R0) {
            Object obj2 = b().get(i8);
            AbstractC3292y.g(obj2, "null cannot be cast to non-null type com.uptodown.models.App");
            ((R0) viewHolder).n((C2041f) obj2);
        } else {
            if (viewHolder instanceof t5.S) {
                ((t5.S) viewHolder).b(true);
                return;
            }
            throw new IllegalArgumentException("ViewHolder unknown!!");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3292y.i(viewGroup, "viewGroup");
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        if (i8 == 4) {
                            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tv_myappsupdates_title, viewGroup, false);
                            String string = this.f3711a.getString(R.string.disabled_apps);
                            AbstractC3292y.h(string, "getString(...)");
                            return new t5.S(inflate, string, this.f3714d);
                        }
                        throw new IllegalArgumentException("viewType unknown");
                    }
                    View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tv_myappsupdates_title, viewGroup, false);
                    String string2 = this.f3711a.getString(R.string.menu_item_title_system_services);
                    AbstractC3292y.h(string2, "getString(...)");
                    return new t5.S(inflate2, string2, null);
                }
                View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tv_myappsupdates_title, viewGroup, false);
                String string3 = this.f3711a.getString(R.string.system_apps_title);
                AbstractC3292y.h(string3, "getString(...)");
                return new t5.S(inflate3, string3, null);
            }
            return new R0(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.update_item, viewGroup, false), this.f3713c, this.f3711a);
        }
        return new C4022f(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.installed_app_item, viewGroup, false), this.f3712b, this.f3711a);
    }
}
