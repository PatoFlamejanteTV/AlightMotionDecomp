package androidx.leanback.widget.picker;

/* loaded from: classes3.dex */
public class PickerColumn {
    private int mCurrentValue;
    private String mLabelFormat;
    private int mMaxValue;
    private int mMinValue;
    private CharSequence[] mStaticLabels;

    public int getCount() {
        return (this.mMaxValue - this.mMinValue) + 1;
    }

    public int getCurrentValue() {
        return this.mCurrentValue;
    }

    public CharSequence getLabelFor(int i8) {
        CharSequence[] charSequenceArr = this.mStaticLabels;
        if (charSequenceArr == null) {
            return String.format(this.mLabelFormat, Integer.valueOf(i8));
        }
        return charSequenceArr[i8];
    }

    public String getLabelFormat() {
        return this.mLabelFormat;
    }

    public int getMaxValue() {
        return this.mMaxValue;
    }

    public int getMinValue() {
        return this.mMinValue;
    }

    public CharSequence[] getStaticLabels() {
        return this.mStaticLabels;
    }

    public void setCurrentValue(int i8) {
        this.mCurrentValue = i8;
    }

    public void setLabelFormat(String str) {
        this.mLabelFormat = str;
    }

    public void setMaxValue(int i8) {
        this.mMaxValue = i8;
    }

    public void setMinValue(int i8) {
        this.mMinValue = i8;
    }

    public void setStaticLabels(CharSequence[] charSequenceArr) {
        this.mStaticLabels = charSequenceArr;
    }
}
