package l5;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.leanback.widget.ImageCardView;
import androidx.leanback.widget.Presenter;
import c5.C2041f;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3292y;
import q5.C3770C;

/* loaded from: classes5.dex */
public final class m extends Presenter {

    /* renamed from: a, reason: collision with root package name */
    private int f34741a = -1;

    /* renamed from: b, reason: collision with root package name */
    private int f34742b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f34743c = -1;

    /* renamed from: d, reason: collision with root package name */
    private int f34744d = -1;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f34745e;

    /* loaded from: classes5.dex */
    public static final class a extends ImageCardView {
        a(Context context) {
            super(context);
        }

        @Override // androidx.leanback.widget.BaseCardView, android.view.View
        public void setSelected(boolean z8) {
            m.this.b(this, z8);
            super.setSelected(z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(ImageCardView imageCardView, boolean z8) {
        int i8;
        int i9;
        if (z8) {
            i8 = this.f34741a;
        } else {
            i8 = this.f34742b;
        }
        if (z8) {
            i9 = this.f34744d;
        } else {
            i9 = this.f34743c;
        }
        imageCardView.setBackgroundColor(i8);
        imageCardView.findViewById(R.id.info_field).setBackgroundColor(i8);
        View findViewById = imageCardView.findViewById(R.id.title_text);
        AbstractC3292y.g(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setTextColor(i9);
        View findViewById2 = imageCardView.findViewById(R.id.content_text);
        AbstractC3292y.g(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById2).setTextColor(i9);
    }

    @Override // androidx.leanback.widget.Presenter
    public void onBindViewHolder(Presenter.ViewHolder viewHolder, Object item) {
        AbstractC3292y.i(viewHolder, "viewHolder");
        AbstractC3292y.i(item, "item");
        View view = viewHolder.view;
        AbstractC3292y.g(view, "null cannot be cast to non-null type androidx.leanback.widget.ImageCardView");
        ImageCardView imageCardView = (ImageCardView) view;
        if (item instanceof C2041f) {
            C2041f c2041f = (C2041f) item;
            imageCardView.setTitleText(c2041f.z());
            imageCardView.setContentText(c2041f.a0());
            C3770C c3770c = C3770C.f37260a;
            Context context = viewHolder.view.getContext();
            AbstractC3292y.h(context, "getContext(...)");
            String Q8 = c2041f.Q();
            AbstractC3292y.f(Q8);
            Drawable i8 = c3770c.i(context, Q8);
            Resources resources = imageCardView.getResources();
            imageCardView.setMainImageDimensions(resources.getDimensionPixelSize(R.dimen.tv_card_height), resources.getDimensionPixelSize(R.dimen.tv_card_height));
            if (i8 != null) {
                imageCardView.setMainImage(i8);
            } else {
                imageCardView.setMainImage(this.f34745e);
            }
            imageCardView.setPadding(18, 18, 18, 18);
        }
    }

    @Override // androidx.leanback.widget.Presenter
    public Presenter.ViewHolder onCreateViewHolder(ViewGroup parent) {
        AbstractC3292y.i(parent, "parent");
        this.f34742b = ContextCompat.getColor(parent.getContext(), R.color.white);
        this.f34741a = ContextCompat.getColor(parent.getContext(), R.color.main_blue_pressed);
        this.f34743c = ContextCompat.getColor(parent.getContext(), R.color.black);
        this.f34744d = ContextCompat.getColor(parent.getContext(), R.color.white);
        this.f34745e = ContextCompat.getDrawable(parent.getContext(), R.drawable.vector_uptodown_logo_bag_disabled);
        a aVar = new a(parent.getContext());
        aVar.setFocusable(true);
        aVar.setFocusableInTouchMode(true);
        b(aVar, false);
        return new Presenter.ViewHolder(aVar);
    }

    @Override // androidx.leanback.widget.Presenter
    public void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {
        AbstractC3292y.i(viewHolder, "viewHolder");
        View view = viewHolder.view;
        AbstractC3292y.g(view, "null cannot be cast to non-null type androidx.leanback.widget.ImageCardView");
        ImageCardView imageCardView = (ImageCardView) view;
        imageCardView.setBadgeImage(null);
        imageCardView.setMainImage(null);
    }
}
