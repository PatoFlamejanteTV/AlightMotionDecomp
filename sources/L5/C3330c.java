package l5;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.leanback.widget.DetailsOverviewLogoPresenter;
import androidx.leanback.widget.DetailsOverviewRow;
import androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter;
import androidx.leanback.widget.Presenter;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: l5.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3330c extends DetailsOverviewLogoPresenter {

    /* renamed from: l5.c$a */
    /* loaded from: classes5.dex */
    public static final class a extends DetailsOverviewLogoPresenter.ViewHolder {
        public a(View view) {
            super(view);
        }

        @Override // androidx.leanback.widget.DetailsOverviewLogoPresenter.ViewHolder
        public FullWidthDetailsOverviewRowPresenter getParentPresenter() {
            FullWidthDetailsOverviewRowPresenter mParentPresenter = this.mParentPresenter;
            AbstractC3292y.h(mParentPresenter, "mParentPresenter");
            return mParentPresenter;
        }

        @Override // androidx.leanback.widget.DetailsOverviewLogoPresenter.ViewHolder
        public FullWidthDetailsOverviewRowPresenter.ViewHolder getParentViewHolder() {
            FullWidthDetailsOverviewRowPresenter.ViewHolder mParentViewHolder = this.mParentViewHolder;
            AbstractC3292y.h(mParentViewHolder, "mParentViewHolder");
            return mParentViewHolder;
        }
    }

    @Override // androidx.leanback.widget.DetailsOverviewLogoPresenter, androidx.leanback.widget.Presenter
    public void onBindViewHolder(Presenter.ViewHolder viewHolder, Object item) {
        AbstractC3292y.i(viewHolder, "viewHolder");
        AbstractC3292y.i(item, "item");
        DetailsOverviewRow detailsOverviewRow = (DetailsOverviewRow) item;
        View view = viewHolder.view;
        AbstractC3292y.g(view, "null cannot be cast to non-null type android.widget.ImageView");
        ((ImageView) view).setImageDrawable(detailsOverviewRow.getImageDrawable());
        a aVar = (a) viewHolder;
        if (isBoundToImage(aVar, detailsOverviewRow)) {
            aVar.getParentPresenter().notifyOnBindLogo(aVar.getParentViewHolder());
        }
    }

    @Override // androidx.leanback.widget.DetailsOverviewLogoPresenter, androidx.leanback.widget.Presenter
    public Presenter.ViewHolder onCreateViewHolder(ViewGroup parent) {
        AbstractC3292y.i(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.lb_fullwidth_details_overview_logo, parent, false);
        AbstractC3292y.g(inflate, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) inflate;
        Resources resources = parent.getResources();
        imageView.setLayoutParams(new ViewGroup.MarginLayoutParams(resources.getDimensionPixelSize(R.dimen.tv_detail_thumb_width), resources.getDimensionPixelSize(R.dimen.tv_detail_thumb_height)));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return new a(imageView);
    }
}
