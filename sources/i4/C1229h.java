package I4;

import R5.AbstractC1435t;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.recyclerview.widget.RecyclerView;
import b5.InterfaceC1988l;
import com.uptodown.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import t5.C4055w;

/* renamed from: I4.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1229h extends RecyclerView.Adapter {

    /* renamed from: j, reason: collision with root package name */
    public static final a f3612j = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f3613a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1988l f3614b;

    /* renamed from: c, reason: collision with root package name */
    private int f3615c;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f3616d;

    /* renamed from: e, reason: collision with root package name */
    private final Animation f3617e;

    /* renamed from: f, reason: collision with root package name */
    private final Animation f3618f;

    /* renamed from: g, reason: collision with root package name */
    private Handler f3619g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f3620h;

    /* renamed from: i, reason: collision with root package name */
    private final c f3621i;

    /* renamed from: I4.h$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: I4.h$b */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private c5.r f3622a;

        /* renamed from: b, reason: collision with root package name */
        private int f3623b;

        public b(c5.r download, int i8) {
            AbstractC3292y.i(download, "download");
            this.f3622a = download;
            this.f3623b = i8;
        }

        public final c5.r a() {
            return this.f3622a;
        }

        public final int b() {
            return this.f3623b;
        }

        public final void c(c5.r rVar) {
            AbstractC3292y.i(rVar, "<set-?>");
            this.f3622a = rVar;
        }

        public final void d(int i8) {
            this.f3623b = i8;
        }
    }

    /* renamed from: I4.h$c */
    /* loaded from: classes5.dex */
    public static final class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1229h.this.f().size() == 1) {
                C1229h.this.f3620h = false;
            } else {
                C1229h c1229h = C1229h.this;
                c1229h.f3620h = true ^ c1229h.f3620h;
            }
            C1229h.this.notifyItemChanged(0);
            Handler handler = C1229h.this.f3619g;
            if (handler != null) {
                handler.postDelayed(this, 5000L);
            }
        }
    }

    public C1229h(Context context, InterfaceC1988l listener) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(listener, "listener");
        this.f3613a = context;
        this.f3614b = listener;
        this.f3616d = new ArrayList();
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.slide_back_in);
        AbstractC3292y.h(loadAnimation, "loadAnimation(...)");
        this.f3617e = loadAnimation;
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.slide_in_bottom);
        AbstractC3292y.h(loadAnimation2, "loadAnimation(...)");
        this.f3618f = loadAnimation2;
        this.f3621i = new c();
        loadAnimation.setDuration(300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(C1229h c1229h, View view) {
        c1229h.f3614b.a();
    }

    public final void e(c5.r download) {
        AbstractC3292y.i(download, "download");
        this.f3616d.add(new b(download, -1));
        if (this.f3616d.size() > 1) {
            this.f3620h = true;
        }
    }

    public final ArrayList f() {
        return this.f3616d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.f3616d.size() >= 1) {
            return 1;
        }
        return 0;
    }

    public final void h(c5.r download) {
        AbstractC3292y.i(download, "download");
        Iterator it = this.f3616d.iterator();
        int i8 = 0;
        while (true) {
            if (it.hasNext()) {
                int i9 = i8 + 1;
                b bVar = (b) it.next();
                if (bVar.a().y() == download.y() || (AbstractC3292y.d(bVar.a().Y(), download.Y()) && bVar.a().e0() == download.e0())) {
                    break;
                } else {
                    i8 = i9;
                }
            } else {
                i8 = -1;
                break;
            }
        }
        if (i8 > -1) {
            this.f3616d.remove(i8);
            this.f3615c--;
            if (this.f3616d.size() > 1) {
                this.f3620h = true;
            }
        }
    }

    public final void i(ArrayList downloadsInQueue) {
        AbstractC3292y.i(downloadsInQueue, "downloadsInQueue");
        this.f3616d.clear();
        Iterator it = downloadsInQueue.iterator();
        AbstractC3292y.h(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC3292y.h(next, "next(...)");
            this.f3616d.add(new b((c5.r) next, -1));
        }
        notifyDataSetChanged();
    }

    public final void j(c5.r rVar, int i8) {
        if (rVar != null && (!this.f3616d.isEmpty())) {
            ((b) AbstractC1435t.m0(this.f3616d)).c(rVar);
            ((b) AbstractC1435t.m0(this.f3616d)).d(i8);
            notifyItemChanged(0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        AbstractC3292y.i(viewHolder, "viewHolder");
        Object obj = this.f3616d.get(viewHolder.getAbsoluteAdapterPosition());
        AbstractC3292y.h(obj, "get(...)");
        b bVar = (b) obj;
        if (viewHolder instanceof C4055w) {
            C4055w c4055w = (C4055w) viewHolder;
            c4055w.c().setText(String.valueOf(this.f3616d.size()));
            if (this.f3620h) {
                if (c4055w.c().getVisibility() != 0) {
                    c4055w.c().setVisibility(0);
                    c4055w.a().setVisibility(8);
                    c4055w.c().startAnimation(this.f3618f);
                }
            } else if (c4055w.a().getVisibility() != 0) {
                c4055w.c().setVisibility(8);
                c4055w.a().setVisibility(0);
                c4055w.a().startAnimation(this.f3618f);
            }
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: I4.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1229h.g(C1229h.this, view);
                }
            });
            int b9 = bVar.b();
            if (b9 != 199 && b9 != 200 && b9 != 205) {
                c4055w.b().setIndeterminate(false);
                int Z8 = bVar.a().Z();
                if (1 <= Z8 && Z8 < 101) {
                    c4055w.b().setProgress(bVar.a().Z());
                }
            } else {
                c4055w.b().setIndeterminate(true);
            }
            if (this.f3619g == null) {
                Handler handler = new Handler(Looper.getMainLooper());
                this.f3619g = handler;
                handler.postDelayed(this.f3621i, 5000L);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3292y.i(viewGroup, "viewGroup");
        View inflate = LayoutInflater.from(this.f3613a).inflate(R.layout.floating_queue_item, viewGroup, false);
        AbstractC3292y.f(inflate);
        return new C4055w(inflate);
    }
}
