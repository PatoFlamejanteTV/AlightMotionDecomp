package t5;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import b5.InterfaceC1974C;
import com.uptodown.UptodownApp;
import com.uptodown.views.FullHeightImageView;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: t5.t0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4050t0 extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC1974C f40009a;

    /* renamed from: b, reason: collision with root package name */
    private int f40010b;

    /* renamed from: t5.t0$a */
    /* loaded from: classes5.dex */
    public static final class a implements m2.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c5.N f40012b;

        a(c5.N n8) {
            this.f40012b = n8;
        }

        @Override // m2.b
        public void a(Exception e8) {
            AbstractC3292y.i(e8, "e");
            e8.printStackTrace();
            C4050t0.this.f40009a.a(this.f40012b);
        }

        @Override // m2.b
        public void b() {
            if (C4050t0.this.f40010b == 0) {
                View view = C4050t0.this.itemView;
                AbstractC3292y.g(view, "null cannot be cast to non-null type com.uptodown.views.FullHeightImageView");
                if (((FullHeightImageView) view).getWidth() > 0) {
                    C4050t0 c4050t0 = C4050t0.this;
                    View view2 = c4050t0.itemView;
                    AbstractC3292y.g(view2, "null cannot be cast to non-null type com.uptodown.views.FullHeightImageView");
                    c4050t0.f40010b = ((FullHeightImageView) view2).getWidth();
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4050t0(View itemView, InterfaceC1974C listener) {
        super(itemView);
        AbstractC3292y.i(itemView, "itemView");
        AbstractC3292y.i(listener, "listener");
        this.f40009a = listener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(C4050t0 c4050t0, c5.N n8, View view) {
        c4050t0.f40009a.b(n8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(C4050t0 c4050t0, c5.V v8, View view) {
        c4050t0.f40009a.d(v8);
    }

    public final void f(final c5.N screenShot) {
        AbstractC3292y.i(screenShot, "screenShot");
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: t5.s0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4050t0.h(C4050t0.this, screenShot, view);
            }
        });
        View view = this.itemView;
        AbstractC3292y.g(view, "null cannot be cast to non-null type com.uptodown.views.FullHeightImageView");
        ((FullHeightImageView) view).setMinimumWidth(this.f40010b);
        com.squareup.picasso.w l8 = com.squareup.picasso.s.h().l(screenShot.h());
        UptodownApp.a aVar = UptodownApp.f29249C;
        Context context = this.itemView.getContext();
        AbstractC3292y.h(context, "getContext(...)");
        com.squareup.picasso.w n8 = l8.n(aVar.g0(context));
        View view2 = this.itemView;
        AbstractC3292y.g(view2, "null cannot be cast to non-null type com.uptodown.views.FullHeightImageView");
        n8.j((FullHeightImageView) view2, new a(screenShot));
    }

    public final void g(final c5.V video) {
        AbstractC3292y.i(video, "video");
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: t5.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4050t0.i(C4050t0.this, video, view);
            }
        });
        com.squareup.picasso.w l8 = com.squareup.picasso.s.h().l(video.a());
        UptodownApp.a aVar = UptodownApp.f29249C;
        Context context = this.itemView.getContext();
        AbstractC3292y.h(context, "getContext(...)");
        com.squareup.picasso.w n8 = l8.n(aVar.e0(context));
        View view = this.itemView;
        AbstractC3292y.g(view, "null cannot be cast to non-null type com.uptodown.views.FullHeightImageView");
        n8.j((FullHeightImageView) view, new b(video));
    }

    /* renamed from: t5.t0$b */
    /* loaded from: classes5.dex */
    public static final class b implements m2.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c5.V f40014b;

        b(c5.V v8) {
            this.f40014b = v8;
        }

        @Override // m2.b
        public void a(Exception e8) {
            AbstractC3292y.i(e8, "e");
            e8.printStackTrace();
            C4050t0.this.f40009a.c(this.f40014b);
        }

        @Override // m2.b
        public void b() {
        }
    }
}
