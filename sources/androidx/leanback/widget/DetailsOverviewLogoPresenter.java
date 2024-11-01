package androidx.leanback.widget;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.leanback.R;
import androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter;
import androidx.leanback.widget.Presenter;

/* loaded from: classes3.dex */
public class DetailsOverviewLogoPresenter extends Presenter {

    /* loaded from: classes3.dex */
    public static class ViewHolder extends Presenter.ViewHolder {
        protected FullWidthDetailsOverviewRowPresenter mParentPresenter;
        protected FullWidthDetailsOverviewRowPresenter.ViewHolder mParentViewHolder;
        private boolean mSizeFromDrawableIntrinsic;

        public ViewHolder(View view) {
            super(view);
        }

        public FullWidthDetailsOverviewRowPresenter getParentPresenter() {
            return this.mParentPresenter;
        }

        public FullWidthDetailsOverviewRowPresenter.ViewHolder getParentViewHolder() {
            return this.mParentViewHolder;
        }

        public boolean isSizeFromDrawableIntrinsic() {
            return this.mSizeFromDrawableIntrinsic;
        }

        public void setSizeFromDrawableIntrinsic(boolean z8) {
            this.mSizeFromDrawableIntrinsic = z8;
        }
    }

    public boolean isBoundToImage(ViewHolder viewHolder, DetailsOverviewRow detailsOverviewRow) {
        if (detailsOverviewRow != null && detailsOverviewRow.getImageDrawable() != null) {
            return true;
        }
        return false;
    }

    @Override // androidx.leanback.widget.Presenter
    public void onBindViewHolder(Presenter.ViewHolder viewHolder, Object obj) {
        float f8;
        DetailsOverviewRow detailsOverviewRow = (DetailsOverviewRow) obj;
        ImageView imageView = (ImageView) viewHolder.view;
        imageView.setImageDrawable(detailsOverviewRow.getImageDrawable());
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        if (isBoundToImage(viewHolder2, detailsOverviewRow)) {
            if (viewHolder2.isSizeFromDrawableIntrinsic()) {
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                layoutParams.width = detailsOverviewRow.getImageDrawable().getIntrinsicWidth();
                layoutParams.height = detailsOverviewRow.getImageDrawable().getIntrinsicHeight();
                if (imageView.getMaxWidth() > 0 || imageView.getMaxHeight() > 0) {
                    float f9 = 1.0f;
                    if (imageView.getMaxWidth() > 0 && layoutParams.width > imageView.getMaxWidth()) {
                        f8 = imageView.getMaxWidth() / layoutParams.width;
                    } else {
                        f8 = 1.0f;
                    }
                    if (imageView.getMaxHeight() > 0 && layoutParams.height > imageView.getMaxHeight()) {
                        f9 = imageView.getMaxHeight() / layoutParams.height;
                    }
                    float min = Math.min(f8, f9);
                    layoutParams.width = (int) (layoutParams.width * min);
                    layoutParams.height = (int) (layoutParams.height * min);
                }
                imageView.setLayoutParams(layoutParams);
            }
            viewHolder2.mParentPresenter.notifyOnBindLogo(viewHolder2.mParentViewHolder);
        }
    }

    public View onCreateView(ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lb_fullwidth_details_overview_logo, viewGroup, false);
    }

    @Override // androidx.leanback.widget.Presenter
    public Presenter.ViewHolder onCreateViewHolder(ViewGroup viewGroup) {
        boolean z8;
        View onCreateView = onCreateView(viewGroup);
        ViewHolder viewHolder = new ViewHolder(onCreateView);
        ViewGroup.LayoutParams layoutParams = onCreateView.getLayoutParams();
        if (layoutParams.width == -2 && layoutParams.height == -2) {
            z8 = true;
        } else {
            z8 = false;
        }
        viewHolder.setSizeFromDrawableIntrinsic(z8);
        return viewHolder;
    }

    @Override // androidx.leanback.widget.Presenter
    public void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {
    }

    public void setContext(ViewHolder viewHolder, FullWidthDetailsOverviewRowPresenter.ViewHolder viewHolder2, FullWidthDetailsOverviewRowPresenter fullWidthDetailsOverviewRowPresenter) {
        viewHolder.mParentViewHolder = viewHolder2;
        viewHolder.mParentPresenter = fullWidthDetailsOverviewRowPresenter;
    }
}
