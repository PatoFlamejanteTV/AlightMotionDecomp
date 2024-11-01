package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.Pair;
import androidx.core.util.Preconditions;
import com.google.android.material.R;
import com.google.android.material.internal.ManufacturerUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class RangeDateSelector implements DateSelector<Pair<Long, Long>> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new Parcelable.Creator<RangeDateSelector>() { // from class: com.google.android.material.datepicker.RangeDateSelector.3
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public RangeDateSelector createFromParcel(@NonNull Parcel parcel) {
            RangeDateSelector rangeDateSelector = new RangeDateSelector();
            rangeDateSelector.selectedStartItem = (Long) parcel.readValue(Long.class.getClassLoader());
            rangeDateSelector.selectedEndItem = (Long) parcel.readValue(Long.class.getClassLoader());
            return rangeDateSelector;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public RangeDateSelector[] newArray(int i8) {
            return new RangeDateSelector[i8];
        }
    };

    @Nullable
    private CharSequence error;
    private String invalidRangeStartError;

    @Nullable
    private SimpleDateFormat textInputFormat;
    private final String invalidRangeEndError = " ";

    @Nullable
    private Long selectedStartItem = null;

    @Nullable
    private Long selectedEndItem = null;

    @Nullable
    private Long proposedTextStart = null;

    @Nullable
    private Long proposedTextEnd = null;

    private void clearInvalidRange(@NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2) {
        if (textInputLayout.getError() != null && this.invalidRangeStartError.contentEquals(textInputLayout.getError())) {
            textInputLayout.setError(null);
        }
        if (textInputLayout2.getError() != null && " ".contentEquals(textInputLayout2.getError())) {
            textInputLayout2.setError(null);
        }
    }

    private boolean isValidRange(long j8, long j9) {
        return j8 <= j9;
    }

    private void setInvalidRange(@NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2) {
        textInputLayout.setError(this.invalidRangeStartError);
        textInputLayout2.setError(" ");
    }

    private void updateError(@NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2) {
        if (!TextUtils.isEmpty(textInputLayout.getError())) {
            this.error = textInputLayout.getError();
        } else if (!TextUtils.isEmpty(textInputLayout2.getError())) {
            this.error = textInputLayout2.getError();
        } else {
            this.error = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateIfValidTextProposal(@NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2, @NonNull OnSelectionChangedListener<Pair<Long, Long>> onSelectionChangedListener) {
        Long l8 = this.proposedTextStart;
        if (l8 != null && this.proposedTextEnd != null) {
            if (isValidRange(l8.longValue(), this.proposedTextEnd.longValue())) {
                this.selectedStartItem = this.proposedTextStart;
                this.selectedEndItem = this.proposedTextEnd;
                onSelectionChangedListener.onSelectionChanged(getSelection());
            } else {
                setInvalidRange(textInputLayout, textInputLayout2);
                onSelectionChangedListener.onIncompleteSelectionChanged();
            }
        } else {
            clearInvalidRange(textInputLayout, textInputLayout2);
            onSelectionChangedListener.onIncompleteSelectionChanged();
        }
        updateError(textInputLayout, textInputLayout2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultThemeResId(@NonNull Context context) {
        int i8;
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(R.dimen.mtrl_calendar_maximum_default_fullscreen_minor_axis)) {
            i8 = R.attr.materialCalendarTheme;
        } else {
            i8 = R.attr.materialCalendarFullscreenTheme;
        }
        return MaterialAttributes.resolveOrThrow(context, i8, MaterialDatePicker.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultTitleResId() {
        return R.string.mtrl_picker_range_header_title;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @Nullable
    public String getError() {
        if (TextUtils.isEmpty(this.error)) {
            return null;
        }
        return this.error.toString();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public Collection<Long> getSelectedDays() {
        ArrayList arrayList = new ArrayList();
        Long l8 = this.selectedStartItem;
        if (l8 != null) {
            arrayList.add(l8);
        }
        Long l9 = this.selectedEndItem;
        if (l9 != null) {
            arrayList.add(l9);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public Collection<Pair<Long, Long>> getSelectedRanges() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(this.selectedStartItem, this.selectedEndItem));
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public String getSelectionContentDescription(@NonNull Context context) {
        String str;
        String str2;
        Resources resources = context.getResources();
        Pair<String, String> dateRangeString = DateStrings.getDateRangeString(this.selectedStartItem, this.selectedEndItem);
        String str3 = dateRangeString.first;
        if (str3 == null) {
            str = resources.getString(R.string.mtrl_picker_announce_current_selection_none);
        } else {
            str = str3;
        }
        String str4 = dateRangeString.second;
        if (str4 == null) {
            str2 = resources.getString(R.string.mtrl_picker_announce_current_selection_none);
        } else {
            str2 = str4;
        }
        return resources.getString(R.string.mtrl_picker_announce_current_range_selection, str, str2);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public String getSelectionDisplayString(@NonNull Context context) {
        Resources resources = context.getResources();
        Long l8 = this.selectedStartItem;
        if (l8 == null && this.selectedEndItem == null) {
            return resources.getString(R.string.mtrl_picker_range_header_unselected);
        }
        Long l9 = this.selectedEndItem;
        if (l9 == null) {
            return resources.getString(R.string.mtrl_picker_range_header_only_start_selected, DateStrings.getDateString(l8.longValue()));
        }
        if (l8 == null) {
            return resources.getString(R.string.mtrl_picker_range_header_only_end_selected, DateStrings.getDateString(l9.longValue()));
        }
        Pair<String, String> dateRangeString = DateStrings.getDateRangeString(l8, l9);
        return resources.getString(R.string.mtrl_picker_range_header_selected, dateRangeString.first, dateRangeString.second);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean isSelectionComplete() {
        Long l8 = this.selectedStartItem;
        if (l8 != null && this.selectedEndItem != null && isValidRange(l8.longValue(), this.selectedEndItem.longValue())) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public View onCreateTextInputView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle, CalendarConstraints calendarConstraints, @NonNull final OnSelectionChangedListener<Pair<Long, Long>> onSelectionChangedListener) {
        boolean z8;
        String defaultTextInputHint;
        View inflate = layoutInflater.inflate(R.layout.mtrl_picker_text_input_date_range, viewGroup, false);
        final TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(R.id.mtrl_picker_text_input_range_start);
        final TextInputLayout textInputLayout2 = (TextInputLayout) inflate.findViewById(R.id.mtrl_picker_text_input_range_end);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        if (ManufacturerUtils.isDateInputKeyboardMissingSeparatorCharacters()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.invalidRangeStartError = inflate.getResources().getString(R.string.mtrl_picker_invalid_range);
        SimpleDateFormat simpleDateFormat = this.textInputFormat;
        if (simpleDateFormat != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!z8) {
            simpleDateFormat = UtcDates.getDefaultTextInputFormat();
        }
        SimpleDateFormat simpleDateFormat2 = simpleDateFormat;
        Long l8 = this.selectedStartItem;
        if (l8 != null) {
            editText.setText(simpleDateFormat2.format(l8));
            this.proposedTextStart = this.selectedStartItem;
        }
        Long l9 = this.selectedEndItem;
        if (l9 != null) {
            editText2.setText(simpleDateFormat2.format(l9));
            this.proposedTextEnd = this.selectedEndItem;
        }
        if (z8) {
            defaultTextInputHint = simpleDateFormat2.toPattern();
        } else {
            defaultTextInputHint = UtcDates.getDefaultTextInputHint(inflate.getResources(), simpleDateFormat2);
        }
        String str = defaultTextInputHint;
        textInputLayout.setPlaceholderText(str);
        textInputLayout2.setPlaceholderText(str);
        editText.addTextChangedListener(new DateFormatTextWatcher(str, simpleDateFormat2, textInputLayout, calendarConstraints) { // from class: com.google.android.material.datepicker.RangeDateSelector.1
            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            void onInvalidDate() {
                RangeDateSelector.this.proposedTextStart = null;
                RangeDateSelector.this.updateIfValidTextProposal(textInputLayout, textInputLayout2, onSelectionChangedListener);
            }

            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            void onValidDate(@Nullable Long l10) {
                RangeDateSelector.this.proposedTextStart = l10;
                RangeDateSelector.this.updateIfValidTextProposal(textInputLayout, textInputLayout2, onSelectionChangedListener);
            }
        });
        editText2.addTextChangedListener(new DateFormatTextWatcher(str, simpleDateFormat2, textInputLayout2, calendarConstraints) { // from class: com.google.android.material.datepicker.RangeDateSelector.2
            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            void onInvalidDate() {
                RangeDateSelector.this.proposedTextEnd = null;
                RangeDateSelector.this.updateIfValidTextProposal(textInputLayout, textInputLayout2, onSelectionChangedListener);
            }

            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            void onValidDate(@Nullable Long l10) {
                RangeDateSelector.this.proposedTextEnd = l10;
                RangeDateSelector.this.updateIfValidTextProposal(textInputLayout, textInputLayout2, onSelectionChangedListener);
            }
        });
        e.c(editText, editText2);
        return inflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void select(long j8) {
        Long l8 = this.selectedStartItem;
        if (l8 == null) {
            this.selectedStartItem = Long.valueOf(j8);
        } else if (this.selectedEndItem == null && isValidRange(l8.longValue(), j8)) {
            this.selectedEndItem = Long.valueOf(j8);
        } else {
            this.selectedEndItem = null;
            this.selectedStartItem = Long.valueOf(j8);
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void setTextInputFormat(@Nullable SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat != null) {
            simpleDateFormat = (SimpleDateFormat) UtcDates.getNormalizedFormat(simpleDateFormat);
        }
        this.textInputFormat = simpleDateFormat;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i8) {
        parcel.writeValue(this.selectedStartItem);
        parcel.writeValue(this.selectedEndItem);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public Pair<Long, Long> getSelection() {
        return new Pair<>(this.selectedStartItem, this.selectedEndItem);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void setSelection(@NonNull Pair<Long, Long> pair) {
        Long l8 = pair.first;
        if (l8 != null && pair.second != null) {
            Preconditions.checkArgument(isValidRange(l8.longValue(), pair.second.longValue()));
        }
        Long l9 = pair.first;
        this.selectedStartItem = l9 == null ? null : Long.valueOf(UtcDates.canonicalYearMonthDay(l9.longValue()));
        Long l10 = pair.second;
        this.selectedEndItem = l10 != null ? Long.valueOf(UtcDates.canonicalYearMonthDay(l10.longValue())) : null;
    }
}
