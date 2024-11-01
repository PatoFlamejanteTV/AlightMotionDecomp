package l5;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.leanback.widget.ImageCardView;
import androidx.leanback.widget.Presenter;
import c5.C2043h;
import com.squareup.picasso.s;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class e extends Presenter {

    /* renamed from: a, reason: collision with root package name */
    private int f34730a = -1;

    /* renamed from: b, reason: collision with root package name */
    private int f34731b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f34732c = -1;

    /* renamed from: d, reason: collision with root package name */
    private int f34733d = -1;

    /* loaded from: classes5.dex */
    public static final class a extends ImageCardView {
        a(Context context) {
            super(context);
        }

        @Override // androidx.leanback.widget.BaseCardView, android.view.View
        public void setSelected(boolean z8) {
            e.this.b(this, z8);
            super.setSelected(z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(ImageCardView imageCardView, boolean z8) {
        int i8;
        int i9;
        if (z8) {
            i8 = this.f34730a;
        } else {
            i8 = this.f34731b;
        }
        if (z8) {
            i9 = this.f34733d;
        } else {
            i9 = this.f34732c;
        }
        imageCardView.setBackgroundColor(i8);
        View findViewById = imageCardView.findViewById(R.id.info_field);
        if (findViewById != null) {
            findViewById.setBackgroundColor(i8);
        }
        TextView textView = (TextView) imageCardView.findViewById(R.id.title_text);
        if (textView != null) {
            textView.setTextColor(i9);
        }
        TextView textView2 = (TextView) imageCardView.findViewById(R.id.content_text);
        if (textView2 != null) {
            textView2.setTextColor(i9);
        }
    }

    @Override // androidx.leanback.widget.Presenter
    public void onBindViewHolder(Presenter.ViewHolder viewHolder, Object item) {
        AbstractC3292y.i(viewHolder, "viewHolder");
        AbstractC3292y.i(item, "item");
        View view = viewHolder.view;
        AbstractC3292y.g(view, "null cannot be cast to non-null type androidx.leanback.widget.ImageCardView");
        ImageCardView imageCardView = (ImageCardView) view;
        if (item instanceof C2043h) {
            C2043h c2043h = (C2043h) item;
            imageCardView.setTitleText(c2043h.q0());
            imageCardView.setContentText(c2043h.N0());
            TextView textView = (TextView) imageCardView.findViewById(R.id.title_text);
            if (textView != null) {
                textView.setVisibility(0);
                textView.setTextColor(this.f34732c);
                textView.setTypeface(J4.j.f4395g.u());
            }
            TextView textView2 = (TextView) imageCardView.findViewById(R.id.content_text);
            if (textView2 != null) {
                textView2.setVisibility(0);
                textView2.setTextColor(this.f34732c);
                textView2.setTypeface(J4.j.f4395g.v());
                textView2.setMaxLines(2);
                textView2.setLines(2);
            }
            Resources resources = imageCardView.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.tv_card_height);
            imageCardView.setMainImageDimensions(dimensionPixelSize, resources.getDimensionPixelSize(R.dimen.tv_card_height));
            s.h().l(c2043h.i0(dimensionPixelSize)).l(R.drawable.shape_bg_placeholder).i(imageCardView.getMainImageView());
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.margin_m);
            imageCardView.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
            return;
        }
        if (item instanceof j5.c) {
            Resources resources2 = imageCardView.getResources();
            imageCardView.setMainImageDimensions(resources2.getDimensionPixelSize(R.dimen.tv_card_height) / 2, resources2.getDimensionPixelSize(R.dimen.tv_card_height) / 2);
            int dimensionPixelSize3 = resources2.getDimensionPixelSize(R.dimen.margin_m) * 5;
            imageCardView.setPadding(dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3);
            imageCardView.setMainImage(ContextCompat.getDrawable(imageCardView.getContext(), R.drawable.vector_plus));
            TextView textView3 = (TextView) imageCardView.findViewById(R.id.title_text);
            if (textView3 != null) {
                textView3.setVisibility(8);
                textView3.setText("");
            }
            TextView textView4 = (TextView) imageCardView.findViewById(R.id.content_text);
            if (textView4 != null) {
                textView4.setVisibility(8);
                textView4.setText("");
            }
        }
    }

    @Override // androidx.leanback.widget.Presenter
    public Presenter.ViewHolder onCreateViewHolder(ViewGroup parent) {
        AbstractC3292y.i(parent, "parent");
        if (parent.getContext() != null) {
            this.f34731b = ContextCompat.getColor(parent.getContext(), R.color.white);
            this.f34730a = ContextCompat.getColor(parent.getContext(), R.color.main_blue_pressed);
            this.f34732c = ContextCompat.getColor(parent.getContext(), R.color.white);
            this.f34733d = ContextCompat.getColor(parent.getContext(), R.color.white);
            a aVar = new a(parent.getContext());
            aVar.setFocusable(true);
            aVar.setFocusableInTouchMode(true);
            b(aVar, false);
            return new Presenter.ViewHolder(aVar);
        }
        return null;
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
