package androidx.leanback.widget;

import android.content.Context;
import android.os.Bundle;
import androidx.leanback.widget.GuidedAction;
import java.util.Calendar;

/* loaded from: classes3.dex */
public class GuidedDatePickerAction extends GuidedAction {
    long mDate;
    String mDatePickerFormat;
    long mMinDate = Long.MIN_VALUE;
    long mMaxDate = Long.MAX_VALUE;

    /* loaded from: classes3.dex */
    public static final class Builder extends BuilderBase<Builder> {
        public Builder(Context context) {
            super(context);
        }

        public GuidedDatePickerAction build() {
            GuidedDatePickerAction guidedDatePickerAction = new GuidedDatePickerAction();
            applyDatePickerValues(guidedDatePickerAction);
            return guidedDatePickerAction;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class BuilderBase<B extends BuilderBase> extends GuidedAction.BuilderBase<B> {
        private long mDate;
        private String mDatePickerFormat;
        private long mMaxDate;
        private long mMinDate;

        public BuilderBase(Context context) {
            super(context);
            this.mMinDate = Long.MIN_VALUE;
            this.mMaxDate = Long.MAX_VALUE;
            this.mDate = Calendar.getInstance().getTimeInMillis();
            hasEditableActivatorView(true);
        }

        protected final void applyDatePickerValues(GuidedDatePickerAction guidedDatePickerAction) {
            super.applyValues(guidedDatePickerAction);
            guidedDatePickerAction.mDatePickerFormat = this.mDatePickerFormat;
            guidedDatePickerAction.mDate = this.mDate;
            long j8 = this.mMinDate;
            long j9 = this.mMaxDate;
            if (j8 <= j9) {
                guidedDatePickerAction.mMinDate = j8;
                guidedDatePickerAction.mMaxDate = j9;
                return;
            }
            throw new IllegalArgumentException("MinDate cannot be larger than MaxDate");
        }

        public B date(long j8) {
            this.mDate = j8;
            return this;
        }

        public B datePickerFormat(String str) {
            this.mDatePickerFormat = str;
            return this;
        }

        public B maxDate(long j8) {
            this.mMaxDate = j8;
            return this;
        }

        public B minDate(long j8) {
            this.mMinDate = j8;
            return this;
        }
    }

    public long getDate() {
        return this.mDate;
    }

    public String getDatePickerFormat() {
        return this.mDatePickerFormat;
    }

    public long getMaxDate() {
        return this.mMaxDate;
    }

    public long getMinDate() {
        return this.mMinDate;
    }

    @Override // androidx.leanback.widget.GuidedAction
    public void onRestoreInstanceState(Bundle bundle, String str) {
        setDate(bundle.getLong(str, getDate()));
    }

    @Override // androidx.leanback.widget.GuidedAction
    public void onSaveInstanceState(Bundle bundle, String str) {
        bundle.putLong(str, getDate());
    }

    public void setDate(long j8) {
        this.mDate = j8;
    }
}
