package androidx.leanback.app;

import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.leanback.R;

/* loaded from: classes3.dex */
public class ErrorSupportFragment extends BrandedSupportFragment {
    private Drawable mBackgroundDrawable;
    private Button mButton;
    private View.OnClickListener mButtonClickListener;
    private String mButtonText;
    private Drawable mDrawable;
    private ViewGroup mErrorFrame;
    private ImageView mImageView;
    private boolean mIsBackgroundTranslucent = true;
    private CharSequence mMessage;
    private TextView mTextView;

    private static Paint.FontMetricsInt getFontMetricsInt(TextView textView) {
        Paint paint = new Paint(1);
        paint.setTextSize(textView.getTextSize());
        paint.setTypeface(textView.getTypeface());
        return paint.getFontMetricsInt();
    }

    private static void setTopMargin(TextView textView, int i8) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
        marginLayoutParams.topMargin = i8;
        textView.setLayoutParams(marginLayoutParams);
    }

    private void updateBackground() {
        int i8;
        ViewGroup viewGroup = this.mErrorFrame;
        if (viewGroup != null) {
            Drawable drawable = this.mBackgroundDrawable;
            if (drawable != null) {
                viewGroup.setBackground(drawable);
                return;
            }
            Resources resources = viewGroup.getResources();
            if (this.mIsBackgroundTranslucent) {
                i8 = R.color.lb_error_background_color_translucent;
            } else {
                i8 = R.color.lb_error_background_color_opaque;
            }
            viewGroup.setBackgroundColor(resources.getColor(i8));
        }
    }

    private void updateButton() {
        int i8;
        Button button = this.mButton;
        if (button != null) {
            button.setText(this.mButtonText);
            this.mButton.setOnClickListener(this.mButtonClickListener);
            Button button2 = this.mButton;
            if (TextUtils.isEmpty(this.mButtonText)) {
                i8 = 8;
            } else {
                i8 = 0;
            }
            button2.setVisibility(i8);
            this.mButton.requestFocus();
        }
    }

    private void updateImageDrawable() {
        int i8;
        ImageView imageView = this.mImageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.mDrawable);
            ImageView imageView2 = this.mImageView;
            if (this.mDrawable == null) {
                i8 = 8;
            } else {
                i8 = 0;
            }
            imageView2.setVisibility(i8);
        }
    }

    private void updateMessage() {
        int i8;
        TextView textView = this.mTextView;
        if (textView != null) {
            textView.setText(this.mMessage);
            TextView textView2 = this.mTextView;
            if (TextUtils.isEmpty(this.mMessage)) {
                i8 = 8;
            } else {
                i8 = 0;
            }
            textView2.setVisibility(i8);
        }
    }

    public Drawable getBackgroundDrawable() {
        return this.mBackgroundDrawable;
    }

    public View.OnClickListener getButtonClickListener() {
        return this.mButtonClickListener;
    }

    public String getButtonText() {
        return this.mButtonText;
    }

    public Drawable getImageDrawable() {
        return this.mDrawable;
    }

    public CharSequence getMessage() {
        return this.mMessage;
    }

    public boolean isBackgroundTranslucent() {
        return this.mIsBackgroundTranslucent;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.lb_error_fragment, viewGroup, false);
        this.mErrorFrame = (ViewGroup) inflate.findViewById(R.id.error_frame);
        updateBackground();
        installTitleView(layoutInflater, this.mErrorFrame, bundle);
        this.mImageView = (ImageView) inflate.findViewById(R.id.image);
        updateImageDrawable();
        this.mTextView = (TextView) inflate.findViewById(R.id.message);
        updateMessage();
        this.mButton = (Button) inflate.findViewById(R.id.button);
        updateButton();
        Paint.FontMetricsInt fontMetricsInt = getFontMetricsInt(this.mTextView);
        setTopMargin(this.mTextView, viewGroup.getResources().getDimensionPixelSize(R.dimen.lb_error_under_image_baseline_margin) + fontMetricsInt.ascent);
        setTopMargin(this.mButton, viewGroup.getResources().getDimensionPixelSize(R.dimen.lb_error_under_message_baseline_margin) - fontMetricsInt.descent);
        return inflate;
    }

    @Override // androidx.leanback.app.BrandedSupportFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.mErrorFrame.requestFocus();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        boolean z8;
        this.mBackgroundDrawable = drawable;
        if (drawable != null) {
            int opacity = drawable.getOpacity();
            if (opacity != -3 && opacity != -2) {
                z8 = false;
            } else {
                z8 = true;
            }
            this.mIsBackgroundTranslucent = z8;
        }
        updateBackground();
        updateMessage();
    }

    public void setButtonClickListener(View.OnClickListener onClickListener) {
        this.mButtonClickListener = onClickListener;
        updateButton();
    }

    public void setButtonText(String str) {
        this.mButtonText = str;
        updateButton();
    }

    public void setDefaultBackground(boolean z8) {
        this.mBackgroundDrawable = null;
        this.mIsBackgroundTranslucent = z8;
        updateBackground();
        updateMessage();
    }

    public void setImageDrawable(Drawable drawable) {
        this.mDrawable = drawable;
        updateImageDrawable();
    }

    public void setMessage(CharSequence charSequence) {
        this.mMessage = charSequence;
        updateMessage();
    }
}
