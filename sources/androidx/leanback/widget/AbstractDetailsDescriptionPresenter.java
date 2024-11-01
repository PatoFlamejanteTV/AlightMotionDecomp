package androidx.leanback.widget;

import android.graphics.Paint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.leanback.R;
import androidx.leanback.widget.Presenter;

/* loaded from: classes3.dex */
public abstract class AbstractDetailsDescriptionPresenter extends Presenter {

    /* loaded from: classes3.dex */
    public static class ViewHolder extends Presenter.ViewHolder {
        final TextView mBody;
        final Paint.FontMetricsInt mBodyFontMetricsInt;
        final int mBodyLineSpacing;
        final int mBodyMaxLines;
        final int mBodyMinLines;
        private ViewTreeObserver.OnPreDrawListener mPreDrawListener;
        final TextView mSubtitle;
        final Paint.FontMetricsInt mSubtitleFontMetricsInt;
        final TextView mTitle;
        final Paint.FontMetricsInt mTitleFontMetricsInt;
        final int mTitleLineSpacing;
        final int mTitleMargin;
        final int mTitleMaxLines;
        final int mUnderSubtitleBaselineMargin;
        final int mUnderTitleBaselineMargin;

        public ViewHolder(View view) {
            super(view);
            TextView textView = (TextView) view.findViewById(R.id.lb_details_description_title);
            this.mTitle = textView;
            TextView textView2 = (TextView) view.findViewById(R.id.lb_details_description_subtitle);
            this.mSubtitle = textView2;
            TextView textView3 = (TextView) view.findViewById(R.id.lb_details_description_body);
            this.mBody = textView3;
            this.mTitleMargin = view.getResources().getDimensionPixelSize(R.dimen.lb_details_description_title_baseline) + getFontMetricsInt(textView).ascent;
            this.mUnderTitleBaselineMargin = view.getResources().getDimensionPixelSize(R.dimen.lb_details_description_under_title_baseline_margin);
            this.mUnderSubtitleBaselineMargin = view.getResources().getDimensionPixelSize(R.dimen.lb_details_description_under_subtitle_baseline_margin);
            this.mTitleLineSpacing = view.getResources().getDimensionPixelSize(R.dimen.lb_details_description_title_line_spacing);
            this.mBodyLineSpacing = view.getResources().getDimensionPixelSize(R.dimen.lb_details_description_body_line_spacing);
            this.mBodyMaxLines = view.getResources().getInteger(R.integer.lb_details_description_body_max_lines);
            this.mBodyMinLines = view.getResources().getInteger(R.integer.lb_details_description_body_min_lines);
            this.mTitleMaxLines = textView.getMaxLines();
            this.mTitleFontMetricsInt = getFontMetricsInt(textView);
            this.mSubtitleFontMetricsInt = getFontMetricsInt(textView2);
            this.mBodyFontMetricsInt = getFontMetricsInt(textView3);
            textView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.leanback.widget.AbstractDetailsDescriptionPresenter.ViewHolder.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
                    ViewHolder.this.addPreDrawListener();
                }
            });
        }

        private Paint.FontMetricsInt getFontMetricsInt(TextView textView) {
            Paint paint = new Paint(1);
            paint.setTextSize(textView.getTextSize());
            paint.setTypeface(textView.getTypeface());
            return paint.getFontMetricsInt();
        }

        void addPreDrawListener() {
            if (this.mPreDrawListener != null) {
                return;
            }
            this.mPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: androidx.leanback.widget.AbstractDetailsDescriptionPresenter.ViewHolder.2
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    int i8;
                    if (ViewHolder.this.mSubtitle.getVisibility() == 0 && ViewHolder.this.mSubtitle.getTop() > ViewHolder.this.view.getHeight() && ViewHolder.this.mTitle.getLineCount() > 1) {
                        TextView textView = ViewHolder.this.mTitle;
                        textView.setMaxLines(textView.getLineCount() - 1);
                        return false;
                    }
                    if (ViewHolder.this.mTitle.getLineCount() > 1) {
                        i8 = ViewHolder.this.mBodyMinLines;
                    } else {
                        i8 = ViewHolder.this.mBodyMaxLines;
                    }
                    if (ViewHolder.this.mBody.getMaxLines() != i8) {
                        ViewHolder.this.mBody.setMaxLines(i8);
                        return false;
                    }
                    ViewHolder.this.removePreDrawListener();
                    return true;
                }
            };
            this.view.getViewTreeObserver().addOnPreDrawListener(this.mPreDrawListener);
        }

        public TextView getBody() {
            return this.mBody;
        }

        public TextView getSubtitle() {
            return this.mSubtitle;
        }

        public TextView getTitle() {
            return this.mTitle;
        }

        void removePreDrawListener() {
            if (this.mPreDrawListener != null) {
                this.view.getViewTreeObserver().removeOnPreDrawListener(this.mPreDrawListener);
                this.mPreDrawListener = null;
            }
        }
    }

    private void setTopMargin(TextView textView, int i8) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
        marginLayoutParams.topMargin = i8;
        textView.setLayoutParams(marginLayoutParams);
    }

    protected abstract void onBindDescription(ViewHolder viewHolder, Object obj);

    @Override // androidx.leanback.widget.Presenter
    public final void onBindViewHolder(Presenter.ViewHolder viewHolder, Object obj) {
        boolean z8;
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        onBindDescription(viewHolder2, obj);
        boolean z9 = true;
        if (TextUtils.isEmpty(viewHolder2.mTitle.getText())) {
            viewHolder2.mTitle.setVisibility(8);
            z8 = false;
        } else {
            viewHolder2.mTitle.setVisibility(0);
            viewHolder2.mTitle.setLineSpacing((viewHolder2.mTitleLineSpacing - r8.getLineHeight()) + viewHolder2.mTitle.getLineSpacingExtra(), viewHolder2.mTitle.getLineSpacingMultiplier());
            viewHolder2.mTitle.setMaxLines(viewHolder2.mTitleMaxLines);
            z8 = true;
        }
        setTopMargin(viewHolder2.mTitle, viewHolder2.mTitleMargin);
        if (TextUtils.isEmpty(viewHolder2.mSubtitle.getText())) {
            viewHolder2.mSubtitle.setVisibility(8);
            z9 = false;
        } else {
            viewHolder2.mSubtitle.setVisibility(0);
            if (z8) {
                setTopMargin(viewHolder2.mSubtitle, (viewHolder2.mUnderTitleBaselineMargin + viewHolder2.mSubtitleFontMetricsInt.ascent) - viewHolder2.mTitleFontMetricsInt.descent);
            } else {
                setTopMargin(viewHolder2.mSubtitle, 0);
            }
        }
        if (TextUtils.isEmpty(viewHolder2.mBody.getText())) {
            viewHolder2.mBody.setVisibility(8);
            return;
        }
        viewHolder2.mBody.setVisibility(0);
        viewHolder2.mBody.setLineSpacing((viewHolder2.mBodyLineSpacing - r0.getLineHeight()) + viewHolder2.mBody.getLineSpacingExtra(), viewHolder2.mBody.getLineSpacingMultiplier());
        if (z9) {
            setTopMargin(viewHolder2.mBody, (viewHolder2.mUnderSubtitleBaselineMargin + viewHolder2.mBodyFontMetricsInt.ascent) - viewHolder2.mSubtitleFontMetricsInt.descent);
        } else if (z8) {
            setTopMargin(viewHolder2.mBody, (viewHolder2.mUnderTitleBaselineMargin + viewHolder2.mBodyFontMetricsInt.ascent) - viewHolder2.mTitleFontMetricsInt.descent);
        } else {
            setTopMargin(viewHolder2.mBody, 0);
        }
    }

    @Override // androidx.leanback.widget.Presenter
    public void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {
    }

    @Override // androidx.leanback.widget.Presenter
    public void onViewAttachedToWindow(Presenter.ViewHolder viewHolder) {
        ((ViewHolder) viewHolder).addPreDrawListener();
        super.onViewAttachedToWindow(viewHolder);
    }

    @Override // androidx.leanback.widget.Presenter
    public void onViewDetachedFromWindow(Presenter.ViewHolder viewHolder) {
        ((ViewHolder) viewHolder).removePreDrawListener();
        super.onViewDetachedFromWindow(viewHolder);
    }

    @Override // androidx.leanback.widget.Presenter
    public final ViewHolder onCreateViewHolder(ViewGroup viewGroup) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lb_details_description, viewGroup, false));
    }
}
