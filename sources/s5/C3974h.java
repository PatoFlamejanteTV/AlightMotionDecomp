package s5;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.uptodown.R;
import i2.AbstractC2967a;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: s5.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3974h extends AbstractC2967a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f39135a;

    /* renamed from: b, reason: collision with root package name */
    private k2.g f39136b;

    /* renamed from: c, reason: collision with root package name */
    private View f39137c;

    /* renamed from: d, reason: collision with root package name */
    private View f39138d;

    /* renamed from: e, reason: collision with root package name */
    private final View f39139e;

    /* renamed from: f, reason: collision with root package name */
    private final ImageView f39140f;

    public C3974h(View customPlayerUi, h2.e youTubePlayer, Context context) {
        AbstractC3292y.i(customPlayerUi, "customPlayerUi");
        AbstractC3292y.i(youTubePlayer, "youTubePlayer");
        AbstractC3292y.i(context, "context");
        this.f39135a = context;
        this.f39138d = customPlayerUi;
        View findViewById = customPlayerUi.findViewById(R.id.v_player_panel_home);
        AbstractC3292y.h(findViewById, "findViewById(...)");
        this.f39139e = findViewById;
        View findViewById2 = this.f39138d.findViewById(R.id.iv_player_panel_feature);
        AbstractC3292y.h(findViewById2, "findViewById(...)");
        ImageView imageView = (ImageView) findViewById2;
        this.f39140f = imageView;
        k2.g gVar = new k2.g();
        this.f39136b = gVar;
        this.f39137c = customPlayerUi;
        AbstractC3292y.f(gVar);
        youTubePlayer.f(gVar);
        m(imageView, youTubePlayer);
        m(findViewById, youTubePlayer);
    }

    private final void m(View view, final h2.e eVar) {
        view.setOnClickListener(new View.OnClickListener() { // from class: s5.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C3974h.n(h2.e.this, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(h2.e eVar, View view) {
        eVar.play();
    }

    @Override // i2.AbstractC2967a, i2.InterfaceC2969c
    public void i(h2.e youTubePlayer, h2.d state) {
        AbstractC3292y.i(youTubePlayer, "youTubePlayer");
        AbstractC3292y.i(state, "state");
        super.i(youTubePlayer, state);
        if (state == h2.d.PLAYING) {
            this.f39140f.setVisibility(8);
        } else {
            this.f39140f.setVisibility(0);
        }
    }

    public final ImageView l() {
        return this.f39140f;
    }
}
