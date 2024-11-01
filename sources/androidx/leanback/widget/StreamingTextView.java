package androidx.leanback.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.text.style.ReplacementSpan;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import androidx.core.widget.TextViewCompat;
import androidx.leanback.R;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class StreamingTextView extends EditText {
    static final boolean ANIMATE_DOTS_FOR_PENDING = true;
    private static final boolean DEBUG = false;
    private static final boolean DOTS_FOR_PENDING = true;
    private static final boolean DOTS_FOR_STABLE = false;
    private static final Pattern SPLIT_PATTERN = Pattern.compile("\\S+");
    private static final Property<StreamingTextView, Integer> STREAM_POSITION_PROPERTY = new Property<StreamingTextView, Integer>(Integer.class, "streamPosition") { // from class: androidx.leanback.widget.StreamingTextView.1
        @Override // android.util.Property
        public Integer get(StreamingTextView streamingTextView) {
            return Integer.valueOf(streamingTextView.getStreamPosition());
        }

        @Override // android.util.Property
        public void set(StreamingTextView streamingTextView, Integer num) {
            streamingTextView.setStreamPosition(num.intValue());
        }
    };
    private static final long STREAM_UPDATE_DELAY_MILLIS = 50;
    private static final String TAG = "StreamingTextView";
    private static final float TEXT_DOT_SCALE = 1.3f;
    Bitmap mOneDot;
    final Random mRandom;
    int mStreamPosition;
    private ObjectAnimator mStreamingAnimation;
    Bitmap mTwoDot;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class DottySpan extends ReplacementSpan {
        private final int mPosition;
        private final int mSeed;

        public DottySpan(int i8, int i9) {
            this.mSeed = i8;
            this.mPosition = i9;
        }

        @Override // android.text.style.ReplacementSpan
        public void draw(Canvas canvas, CharSequence charSequence, int i8, int i9, float f8, int i10, int i11, int i12, Paint paint) {
            float f9;
            int measureText = (int) paint.measureText(charSequence, i8, i9);
            int width = StreamingTextView.this.mOneDot.getWidth();
            int i13 = width * 2;
            int i14 = measureText / i13;
            int i15 = (measureText % i13) / 2;
            boolean isLayoutRtl = StreamingTextView.isLayoutRtl(StreamingTextView.this);
            StreamingTextView.this.mRandom.setSeed(this.mSeed);
            int alpha = paint.getAlpha();
            for (int i16 = 0; i16 < i14; i16++) {
                int i17 = this.mPosition + i16;
                StreamingTextView streamingTextView = StreamingTextView.this;
                if (i17 >= streamingTextView.mStreamPosition) {
                    break;
                }
                float f10 = (i16 * i13) + i15 + (width / 2);
                if (isLayoutRtl) {
                    f9 = ((measureText + f8) - f10) - width;
                } else {
                    f9 = f8 + f10;
                }
                paint.setAlpha((streamingTextView.mRandom.nextInt(4) + 1) * 63);
                if (StreamingTextView.this.mRandom.nextBoolean()) {
                    canvas.drawBitmap(StreamingTextView.this.mTwoDot, f9, i11 - r3.getHeight(), paint);
                } else {
                    canvas.drawBitmap(StreamingTextView.this.mOneDot, f9, i11 - r3.getHeight(), paint);
                }
            }
            paint.setAlpha(alpha);
        }

        @Override // android.text.style.ReplacementSpan
        public int getSize(Paint paint, CharSequence charSequence, int i8, int i9, Paint.FontMetricsInt fontMetricsInt) {
            return (int) paint.measureText(charSequence, i8, i9);
        }
    }

    public StreamingTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mRandom = new Random();
    }

    private void addColorSpan(SpannableStringBuilder spannableStringBuilder, int i8, String str, int i9) {
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i8), i9, str.length() + i9, 33);
    }

    private void addDottySpans(SpannableStringBuilder spannableStringBuilder, String str, int i8) {
        Matcher matcher = SPLIT_PATTERN.matcher(str);
        while (matcher.find()) {
            int start = matcher.start() + i8;
            spannableStringBuilder.setSpan(new DottySpan(str.charAt(matcher.start()), start), start, matcher.end() + i8, 33);
        }
    }

    private void cancelStreamAnimation() {
        ObjectAnimator objectAnimator = this.mStreamingAnimation;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private Bitmap getScaledBitmap(int i8, float f8) {
        return Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), i8), (int) (r3.getWidth() * f8), (int) (r3.getHeight() * f8), false);
    }

    public static boolean isLayoutRtl(View view) {
        if (1 == view.getLayoutDirection()) {
            return true;
        }
        return false;
    }

    private void startStreamAnimation() {
        cancelStreamAnimation();
        int streamPosition = getStreamPosition();
        int length = length();
        int i8 = length - streamPosition;
        if (i8 > 0) {
            if (this.mStreamingAnimation == null) {
                ObjectAnimator objectAnimator = new ObjectAnimator();
                this.mStreamingAnimation = objectAnimator;
                objectAnimator.setTarget(this);
                this.mStreamingAnimation.setProperty(STREAM_POSITION_PROPERTY);
            }
            this.mStreamingAnimation.setIntValues(streamPosition, length);
            this.mStreamingAnimation.setDuration(i8 * STREAM_UPDATE_DELAY_MILLIS);
            this.mStreamingAnimation.start();
        }
    }

    private void updateText(CharSequence charSequence) {
        setText(charSequence);
        bringPointIntoView(length());
    }

    int getStreamPosition() {
        return this.mStreamPosition;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.mOneDot = getScaledBitmap(R.drawable.lb_text_dot_one, TEXT_DOT_SCALE);
        this.mTwoDot = getScaledBitmap(R.drawable.lb_text_dot_two, TEXT_DOT_SCALE);
        reset();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(StreamingTextView.class.getCanonicalName());
    }

    public void reset() {
        this.mStreamPosition = -1;
        cancelStreamAnimation();
        setText("");
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.wrapCustomSelectionActionModeCallback(this, callback));
    }

    public void setFinalRecognizedText(CharSequence charSequence) {
        updateText(charSequence);
    }

    void setStreamPosition(int i8) {
        this.mStreamPosition = i8;
        invalidate();
    }

    public void updateRecognizedText(String str, List<Float> list) {
    }

    public void updateRecognizedText(String str, String str2) {
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (str2 != null) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) str2);
            addDottySpans(spannableStringBuilder, str2, length);
        }
        this.mStreamPosition = Math.max(str.length(), this.mStreamPosition);
        updateText(new SpannedString(spannableStringBuilder));
        startStreamAnimation();
    }

    public StreamingTextView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mRandom = new Random();
    }
}
