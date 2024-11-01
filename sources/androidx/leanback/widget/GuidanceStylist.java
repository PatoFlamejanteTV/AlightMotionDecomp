package androidx.leanback.widget;

import android.animation.Animator;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.leanback.R;
import java.util.List;

/* loaded from: classes3.dex */
public class GuidanceStylist implements FragmentAnimationProvider {
    private TextView mBreadcrumbView;
    private TextView mDescriptionView;
    private View mGuidanceContainer;
    private ImageView mIconView;
    private TextView mTitleView;

    /* loaded from: classes3.dex */
    public static class Guidance {
        private final String mBreadcrumb;
        private final String mDescription;
        private final Drawable mIconDrawable;
        private final String mTitle;

        public Guidance(String str, String str2, String str3, Drawable drawable) {
            this.mBreadcrumb = str3;
            this.mTitle = str;
            this.mDescription = str2;
            this.mIconDrawable = drawable;
        }

        public String getBreadcrumb() {
            return this.mBreadcrumb;
        }

        public String getDescription() {
            return this.mDescription;
        }

        public Drawable getIconDrawable() {
            return this.mIconDrawable;
        }

        public String getTitle() {
            return this.mTitle;
        }
    }

    public TextView getBreadcrumbView() {
        return this.mBreadcrumbView;
    }

    public TextView getDescriptionView() {
        return this.mDescriptionView;
    }

    public ImageView getIconView() {
        return this.mIconView;
    }

    public TextView getTitleView() {
        return this.mTitleView;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Guidance guidance) {
        View inflate = layoutInflater.inflate(onProvideLayoutId(), viewGroup, false);
        this.mTitleView = (TextView) inflate.findViewById(R.id.guidance_title);
        this.mBreadcrumbView = (TextView) inflate.findViewById(R.id.guidance_breadcrumb);
        this.mDescriptionView = (TextView) inflate.findViewById(R.id.guidance_description);
        this.mIconView = (ImageView) inflate.findViewById(R.id.guidance_icon);
        this.mGuidanceContainer = inflate.findViewById(R.id.guidance_container);
        TextView textView = this.mTitleView;
        if (textView != null) {
            textView.setText(guidance.getTitle());
        }
        TextView textView2 = this.mBreadcrumbView;
        if (textView2 != null) {
            textView2.setText(guidance.getBreadcrumb());
        }
        TextView textView3 = this.mDescriptionView;
        if (textView3 != null) {
            textView3.setText(guidance.getDescription());
        }
        if (this.mIconView != null) {
            if (guidance.getIconDrawable() != null) {
                this.mIconView.setImageDrawable(guidance.getIconDrawable());
            } else {
                this.mIconView.setVisibility(8);
            }
        }
        View view = this.mGuidanceContainer;
        if (view != null && TextUtils.isEmpty(view.getContentDescription())) {
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(guidance.getBreadcrumb())) {
                sb.append(guidance.getBreadcrumb());
                sb.append('\n');
            }
            if (!TextUtils.isEmpty(guidance.getTitle())) {
                sb.append(guidance.getTitle());
                sb.append('\n');
            }
            if (!TextUtils.isEmpty(guidance.getDescription())) {
                sb.append(guidance.getDescription());
                sb.append('\n');
            }
            this.mGuidanceContainer.setContentDescription(sb);
        }
        return inflate;
    }

    public void onDestroyView() {
        this.mBreadcrumbView = null;
        this.mDescriptionView = null;
        this.mIconView = null;
        this.mTitleView = null;
    }

    @Override // androidx.leanback.widget.FragmentAnimationProvider
    public void onImeAppearing(@NonNull List<Animator> list) {
    }

    @Override // androidx.leanback.widget.FragmentAnimationProvider
    public void onImeDisappearing(@NonNull List<Animator> list) {
    }

    public int onProvideLayoutId() {
        return R.layout.lb_guidance;
    }
}
