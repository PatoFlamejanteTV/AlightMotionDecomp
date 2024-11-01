package I4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import c5.C2041f;
import c5.C2043h;
import com.uptodown.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import t5.C4008A;
import t5.C4015b0;

/* renamed from: I4.w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1243w extends RecyclerView.Adapter {

    /* renamed from: g, reason: collision with root package name */
    public static final a f3721g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private C2043h f3722a;

    /* renamed from: b, reason: collision with root package name */
    private C2041f f3723b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f3724c;

    /* renamed from: d, reason: collision with root package name */
    private final b5.w f3725d;

    /* renamed from: e, reason: collision with root package name */
    private final int f3726e;

    /* renamed from: f, reason: collision with root package name */
    private int f3727f;

    /* renamed from: I4.w$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public C1243w(C2043h appInfo, C2041f c2041f, Context context, b5.w listener, int i8) {
        AbstractC3292y.i(appInfo, "appInfo");
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(listener, "listener");
        this.f3722a = appInfo;
        this.f3723b = c2041f;
        this.f3724c = context;
        this.f3725d = listener;
        this.f3726e = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C1243w c1243w, View view) {
        c1243w.f3725d.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C1243w c1243w, View view) {
        c1243w.f3725d.f();
    }

    public final void e(C2041f c2041f) {
        this.f3723b = c2041f;
    }

    public final void f(ArrayList arrayList) {
        this.f3722a.p1(arrayList);
    }

    public final void g(int i8) {
        this.f3727f = i8;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        ArrayList t02 = this.f3722a.t0();
        AbstractC3292y.f(t02);
        return t02.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i8) {
        if (i8 == 0) {
            return 0;
        }
        ArrayList t02 = this.f3722a.t0();
        AbstractC3292y.f(t02);
        if (i8 < t02.size()) {
            return 1;
        }
        return 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        AbstractC3292y.i(viewHolder, "viewHolder");
        if (viewHolder instanceof C4008A) {
            C2041f c2041f = this.f3723b;
            if (c2041f != null) {
                ((C4008A) viewHolder).a(c2041f);
                return;
            } else {
                ((C4008A) viewHolder).b(this.f3722a);
                return;
            }
        }
        if (viewHolder instanceof C4015b0) {
            ((C4015b0) viewHolder).h(this.f3722a, this.f3723b, i8);
            return;
        }
        if (viewHolder instanceof t5.L) {
            if (this.f3726e > 20) {
                t5.L l8 = (t5.L) viewHolder;
                l8.a().setOnClickListener(new View.OnClickListener() { // from class: I4.u
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C1243w.c(C1243w.this, view);
                    }
                });
                l8.b().setOnClickListener(new View.OnClickListener() { // from class: I4.v
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C1243w.d(C1243w.this, view);
                    }
                });
                if (this.f3727f <= 0) {
                    l8.a().setVisibility(4);
                } else {
                    l8.a().setVisibility(0);
                }
                int i9 = this.f3727f + 1;
                ArrayList t02 = this.f3722a.t0();
                AbstractC3292y.f(t02);
                if (t02.size() >= 20 && i9 * 20 != this.f3726e - 1) {
                    l8.b().setVisibility(0);
                } else {
                    l8.b().setVisibility(4);
                }
                l8.d().setText(String.valueOf(i9));
                return;
            }
            ((t5.L) viewHolder).c().setVisibility(8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3292y.i(viewGroup, "viewGroup");
        if (i8 != 0) {
            if (i8 != 1) {
                View inflate = LayoutInflater.from(this.f3724c).inflate(R.layout.load_more_versions, viewGroup, false);
                AbstractC3292y.f(inflate);
                return new t5.L(inflate);
            }
            View inflate2 = LayoutInflater.from(this.f3724c).inflate(R.layout.old_version_item, viewGroup, false);
            AbstractC3292y.f(inflate2);
            return new C4015b0(inflate2, this.f3725d);
        }
        View inflate3 = LayoutInflater.from(this.f3724c).inflate(R.layout.header_installed_app, viewGroup, false);
        AbstractC3292y.f(inflate3);
        return new C4008A(inflate3, this.f3724c);
    }
}
