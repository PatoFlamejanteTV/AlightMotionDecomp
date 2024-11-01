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
import com.uptodown.activities.preferences.SettingsPreferences;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import q5.C3794s;
import t5.C4022f;
import t5.M0;
import t5.R0;
import t5.e1;
import t5.g1;

/* loaded from: classes5.dex */
public final class N extends RecyclerView.Adapter {

    /* renamed from: k, reason: collision with root package name */
    public static final a f3506k = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f3507a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1976E f3508b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1978b f3509c;

    /* renamed from: d, reason: collision with root package name */
    private final b5.K f3510d;

    /* renamed from: e, reason: collision with root package name */
    private final b5.t f3511e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f3512f;

    /* renamed from: g, reason: collision with root package name */
    private int f3513g;

    /* renamed from: h, reason: collision with root package name */
    private b f3514h;

    /* renamed from: i, reason: collision with root package name */
    private int f3515i;

    /* renamed from: j, reason: collision with root package name */
    private int f3516j;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private int f3517a;

        public final int a() {
            return this.f3517a;
        }

        public final void b(int i8) {
            this.f3517a = i8;
        }
    }

    public N(ArrayList updates, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Context context, InterfaceC1976E updateListener, InterfaceC1978b appListener, b5.K warningTrackingDisabledListener, b5.t infoClickListener) {
        AbstractC3292y.i(updates, "updates");
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(updateListener, "updateListener");
        AbstractC3292y.i(appListener, "appListener");
        AbstractC3292y.i(warningTrackingDisabledListener, "warningTrackingDisabledListener");
        AbstractC3292y.i(infoClickListener, "infoClickListener");
        this.f3507a = context;
        this.f3508b = updateListener;
        this.f3509c = appListener;
        this.f3510d = warningTrackingDisabledListener;
        this.f3511e = infoClickListener;
        this.f3513g = -1;
        this.f3514h = new b();
        this.f3515i = -1;
        this.f3516j = -1;
        a(updates, arrayList, arrayList2, arrayList3);
    }

    private final void a(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        int i8;
        f(new ArrayList());
        File g8 = new C3794s().g(this.f3507a);
        if (g8.exists() && new C3794s().k(this.f3507a, g8) < 262144000) {
            b().add("warning_not_space");
            i8 = 1;
            this.f3513g = 1;
        } else {
            i8 = 0;
        }
        if (arrayList != null) {
            this.f3514h.b(arrayList.size());
        }
        b().add(this.f3514h);
        this.f3515i = i8 + 1;
        if (!SettingsPreferences.f30529b.j0(this.f3507a)) {
            b().add("tracking_disabled");
            this.f3516j = i8 + 2;
            return;
        }
        if (arrayList != null) {
            b().addAll(arrayList);
        }
        if (arrayList4 != null && !arrayList4.isEmpty()) {
            b().add("title_disable_app");
            b().addAll(arrayList4);
        }
        if (arrayList2 != null && arrayList2.size() > 0) {
            b().add("title_recent_updates");
            b().addAll(arrayList2);
        }
        if (arrayList3 != null && arrayList3.size() > 0) {
            b().add("title_ignored");
            b().addAll(arrayList3);
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = this.f3512f;
        if (arrayList != null) {
            return arrayList;
        }
        AbstractC3292y.y(DataSchemeDataSource.SCHEME_DATA);
        return null;
    }

    public final void c(int i8) {
        Object remove = b().remove(i8);
        AbstractC3292y.g(remove, "null cannot be cast to non-null type com.uptodown.models.App");
        C2041f c2041f = (C2041f) remove;
        c2041f.J0(C2041f.c.f15791b);
        notifyItemRemoved(i8);
        int indexOf = b().indexOf("title_recent_updates") + 1;
        b().add(indexOf, c2041f);
        notifyItemInserted(indexOf);
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
        this.f3512f = arrayList;
    }

    public final void g(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        a(arrayList, arrayList2, arrayList3, arrayList4);
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
            C2041f c2041f = (C2041f) obj;
            if (c2041f.c0() != C2041f.c.f15790a && c2041f.i() != 1) {
                return 1;
            }
            return 0;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            switch (str.hashCode()) {
                case -1764562172:
                    if (str.equals("tracking_disabled")) {
                        return 4;
                    }
                    break;
                case -864119891:
                    if (str.equals("title_recent_updates")) {
                        return 5;
                    }
                    break;
                case 446114743:
                    if (str.equals("warning_not_space")) {
                        return 2;
                    }
                    break;
                case 903589355:
                    if (str.equals("title_ignored")) {
                        return 6;
                    }
                    break;
                case 1477891299:
                    if (str.equals("title_disable_app")) {
                        return 7;
                    }
                    break;
            }
            throw new IllegalArgumentException();
        }
        if (obj instanceof b) {
            return 8;
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
            return;
        }
        if (viewHolder instanceof R0) {
            Object obj2 = b().get(i8);
            AbstractC3292y.g(obj2, "null cannot be cast to non-null type com.uptodown.models.App");
            ((R0) viewHolder).n((C2041f) obj2);
        } else {
            if (viewHolder instanceof t5.S) {
                ((t5.S) viewHolder).b(true);
                return;
            }
            if (viewHolder instanceof e1) {
                ((e1) viewHolder).a(true);
            } else if (viewHolder instanceof M0) {
                ((M0) viewHolder).a(this.f3514h.a());
            } else {
                if (viewHolder instanceof g1) {
                    ((g1) viewHolder).c(!SettingsPreferences.f30529b.j0(this.f3507a));
                    return;
                }
                throw new IllegalArgumentException("ViewHolder unknown!!");
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3292y.i(viewGroup, "viewGroup");
        switch (i8) {
            case 0:
                return new R0(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.update_item, viewGroup, false), this.f3508b, this.f3507a);
            case 1:
                return new C4022f(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.installed_app_item, viewGroup, false), this.f3509c, this.f3507a);
            case 2:
                return new e1(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.warning_not_space_available, viewGroup, false));
            case 3:
            default:
                throw new IllegalArgumentException("viewType unknown");
            case 4:
                return new g1(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tracking_disabled, viewGroup, false), this.f3507a, this.f3510d);
            case 5:
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tv_myappsupdates_title, viewGroup, false);
                String string = this.f3507a.getString(R.string.updates_recent);
                AbstractC3292y.h(string, "getString(...)");
                return new t5.S(inflate, string, null);
            case 6:
                View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tv_myappsupdates_title, viewGroup, false);
                String string2 = this.f3507a.getString(R.string.update_ignored);
                AbstractC3292y.h(string2, "getString(...)");
                return new t5.S(inflate2, string2, null);
            case 7:
                View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tv_myappsupdates_title, viewGroup, false);
                String string3 = this.f3507a.getString(R.string.disabled_apps);
                AbstractC3292y.h(string3, "getString(...)");
                return new t5.S(inflate3, string3, this.f3511e);
            case 8:
                return new M0(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.updates_header, viewGroup, false), this.f3507a);
        }
    }
}
