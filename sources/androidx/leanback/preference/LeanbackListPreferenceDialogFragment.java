package androidx.leanback.preference;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArraySet;
import androidx.leanback.widget.VerticalGridView;
import androidx.preference.DialogPreference;
import androidx.preference.ListPreference;
import androidx.preference.MultiSelectListPreference;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public class LeanbackListPreferenceDialogFragment extends LeanbackPreferenceDialogFragment {
    private static final String SAVE_STATE_ENTRIES = "LeanbackListPreferenceDialogFragment.entries";
    private static final String SAVE_STATE_ENTRY_VALUES = "LeanbackListPreferenceDialogFragment.entryValues";
    private static final String SAVE_STATE_INITIAL_SELECTION = "LeanbackListPreferenceDialogFragment.initialSelection";
    private static final String SAVE_STATE_INITIAL_SELECTIONS = "LeanbackListPreferenceDialogFragment.initialSelections";
    private static final String SAVE_STATE_IS_MULTI = "LeanbackListPreferenceDialogFragment.isMulti";
    private static final String SAVE_STATE_MESSAGE = "LeanbackListPreferenceDialogFragment.message";
    private static final String SAVE_STATE_TITLE = "LeanbackListPreferenceDialogFragment.title";
    private CharSequence mDialogMessage;
    private CharSequence mDialogTitle;
    private CharSequence[] mEntries;
    private CharSequence[] mEntryValues;
    private String mInitialSelection;
    Set<String> mInitialSelections;
    private boolean mMulti;

    /* loaded from: classes3.dex */
    public class AdapterMulti extends RecyclerView.Adapter<ViewHolder> implements ViewHolder.OnItemClickListener {
        private final CharSequence[] mEntries;
        private final CharSequence[] mEntryValues;
        private final Set<String> mSelections;

        public AdapterMulti(CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2, Set<String> set) {
            this.mEntries = charSequenceArr;
            this.mEntryValues = charSequenceArr2;
            this.mSelections = new HashSet(set);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.mEntries.length;
        }

        @Override // androidx.leanback.preference.LeanbackListPreferenceDialogFragment.ViewHolder.OnItemClickListener
        public void onItemClick(ViewHolder viewHolder) {
            int adapterPosition = viewHolder.getAdapterPosition();
            if (adapterPosition == -1) {
                return;
            }
            String charSequence = this.mEntryValues[adapterPosition].toString();
            if (this.mSelections.contains(charSequence)) {
                this.mSelections.remove(charSequence);
            } else {
                this.mSelections.add(charSequence);
            }
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) LeanbackListPreferenceDialogFragment.this.getPreference();
            if (multiSelectListPreference.callChangeListener(new HashSet(this.mSelections))) {
                multiSelectListPreference.setValues(new HashSet(this.mSelections));
                LeanbackListPreferenceDialogFragment.this.mInitialSelections = this.mSelections;
            } else if (this.mSelections.contains(charSequence)) {
                this.mSelections.remove(charSequence);
            } else {
                this.mSelections.add(charSequence);
            }
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(ViewHolder viewHolder, int i8) {
            viewHolder.getWidgetView().setChecked(this.mSelections.contains(this.mEntryValues[i8].toString()));
            viewHolder.getTitleView().setText(this.mEntries[i8]);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
            return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.leanback_list_preference_item_multi, viewGroup, false), this);
        }
    }

    /* loaded from: classes3.dex */
    public class AdapterSingle extends RecyclerView.Adapter<ViewHolder> implements ViewHolder.OnItemClickListener {
        private final CharSequence[] mEntries;
        private final CharSequence[] mEntryValues;
        private CharSequence mSelectedValue;

        public AdapterSingle(CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2, CharSequence charSequence) {
            this.mEntries = charSequenceArr;
            this.mEntryValues = charSequenceArr2;
            this.mSelectedValue = charSequence;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.mEntries.length;
        }

        @Override // androidx.leanback.preference.LeanbackListPreferenceDialogFragment.ViewHolder.OnItemClickListener
        public void onItemClick(ViewHolder viewHolder) {
            int adapterPosition = viewHolder.getAdapterPosition();
            if (adapterPosition == -1) {
                return;
            }
            CharSequence charSequence = this.mEntryValues[adapterPosition];
            ListPreference listPreference = (ListPreference) LeanbackListPreferenceDialogFragment.this.getPreference();
            if (adapterPosition >= 0) {
                String charSequence2 = this.mEntryValues[adapterPosition].toString();
                if (listPreference.callChangeListener(charSequence2)) {
                    listPreference.setValue(charSequence2);
                    this.mSelectedValue = charSequence;
                }
            }
            LeanbackListPreferenceDialogFragment.this.getFragmentManager().popBackStack();
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(ViewHolder viewHolder, int i8) {
            viewHolder.getWidgetView().setChecked(this.mEntryValues[i8].equals(this.mSelectedValue));
            viewHolder.getTitleView().setText(this.mEntries[i8]);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
            return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.leanback_list_preference_item_single, viewGroup, false), this);
        }
    }

    /* loaded from: classes3.dex */
    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private final ViewGroup mContainer;
        private final OnItemClickListener mListener;
        private final TextView mTitleView;
        private final Checkable mWidgetView;

        /* loaded from: classes3.dex */
        public interface OnItemClickListener {
            void onItemClick(ViewHolder viewHolder);
        }

        public ViewHolder(@NonNull View view, @NonNull OnItemClickListener onItemClickListener) {
            super(view);
            this.mWidgetView = (Checkable) view.findViewById(R.id.button);
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.container);
            this.mContainer = viewGroup;
            this.mTitleView = (TextView) view.findViewById(android.R.id.title);
            viewGroup.setOnClickListener(this);
            this.mListener = onItemClickListener;
        }

        public ViewGroup getContainer() {
            return this.mContainer;
        }

        public TextView getTitleView() {
            return this.mTitleView;
        }

        public Checkable getWidgetView() {
            return this.mWidgetView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.mListener.onItemClick(this);
        }
    }

    public static LeanbackListPreferenceDialogFragment newInstanceMulti(String str) {
        Bundle bundle = new Bundle(1);
        bundle.putString(LeanbackPreferenceDialogFragment.ARG_KEY, str);
        LeanbackListPreferenceDialogFragment leanbackListPreferenceDialogFragment = new LeanbackListPreferenceDialogFragment();
        leanbackListPreferenceDialogFragment.setArguments(bundle);
        return leanbackListPreferenceDialogFragment;
    }

    public static LeanbackListPreferenceDialogFragment newInstanceSingle(String str) {
        Bundle bundle = new Bundle(1);
        bundle.putString(LeanbackPreferenceDialogFragment.ARG_KEY, str);
        LeanbackListPreferenceDialogFragment leanbackListPreferenceDialogFragment = new LeanbackListPreferenceDialogFragment();
        leanbackListPreferenceDialogFragment.setArguments(bundle);
        return leanbackListPreferenceDialogFragment;
    }

    @Override // androidx.leanback.preference.LeanbackPreferenceDialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i8 = 0;
        if (bundle == null) {
            DialogPreference preference = getPreference();
            this.mDialogTitle = preference.getDialogTitle();
            this.mDialogMessage = preference.getDialogMessage();
            if (preference instanceof ListPreference) {
                this.mMulti = false;
                ListPreference listPreference = (ListPreference) preference;
                this.mEntries = listPreference.getEntries();
                this.mEntryValues = listPreference.getEntryValues();
                this.mInitialSelection = listPreference.getValue();
                return;
            }
            if (preference instanceof MultiSelectListPreference) {
                this.mMulti = true;
                MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) preference;
                this.mEntries = multiSelectListPreference.getEntries();
                this.mEntryValues = multiSelectListPreference.getEntryValues();
                this.mInitialSelections = multiSelectListPreference.getValues();
                return;
            }
            throw new IllegalArgumentException("Preference must be a ListPreference or MultiSelectListPreference");
        }
        this.mDialogTitle = bundle.getCharSequence(SAVE_STATE_TITLE);
        this.mDialogMessage = bundle.getCharSequence(SAVE_STATE_MESSAGE);
        this.mMulti = bundle.getBoolean(SAVE_STATE_IS_MULTI);
        this.mEntries = bundle.getCharSequenceArray(SAVE_STATE_ENTRIES);
        this.mEntryValues = bundle.getCharSequenceArray(SAVE_STATE_ENTRY_VALUES);
        if (this.mMulti) {
            String[] stringArray = bundle.getStringArray(SAVE_STATE_INITIAL_SELECTIONS);
            if (stringArray != null) {
                i8 = stringArray.length;
            }
            ArraySet arraySet = new ArraySet(i8);
            this.mInitialSelections = arraySet;
            if (stringArray != null) {
                Collections.addAll(arraySet, stringArray);
                return;
            }
            return;
        }
        this.mInitialSelection = bundle.getString(SAVE_STATE_INITIAL_SELECTION);
    }

    public RecyclerView.Adapter onCreateAdapter() {
        if (this.mMulti) {
            return new AdapterMulti(this.mEntries, this.mEntryValues, this.mInitialSelections);
        }
        return new AdapterSingle(this.mEntries, this.mEntryValues, this.mInitialSelection);
    }

    @Override // android.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.leanback_list_preference_fragment, viewGroup, false);
        VerticalGridView verticalGridView = (VerticalGridView) inflate.findViewById(android.R.id.list);
        verticalGridView.setWindowAlignment(3);
        verticalGridView.setFocusScrollStrategy(0);
        verticalGridView.setAdapter(onCreateAdapter());
        verticalGridView.requestFocus();
        CharSequence charSequence = this.mDialogTitle;
        if (!TextUtils.isEmpty(charSequence)) {
            ((TextView) inflate.findViewById(R.id.decor_title)).setText(charSequence);
        }
        CharSequence charSequence2 = this.mDialogMessage;
        if (!TextUtils.isEmpty(charSequence2)) {
            TextView textView = (TextView) inflate.findViewById(android.R.id.message);
            textView.setVisibility(0);
            textView.setText(charSequence2);
        }
        return inflate;
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence(SAVE_STATE_TITLE, this.mDialogTitle);
        bundle.putCharSequence(SAVE_STATE_MESSAGE, this.mDialogMessage);
        bundle.putBoolean(SAVE_STATE_IS_MULTI, this.mMulti);
        bundle.putCharSequenceArray(SAVE_STATE_ENTRIES, this.mEntries);
        bundle.putCharSequenceArray(SAVE_STATE_ENTRY_VALUES, this.mEntryValues);
        if (this.mMulti) {
            Set<String> set = this.mInitialSelections;
            bundle.putStringArray(SAVE_STATE_INITIAL_SELECTIONS, (String[]) set.toArray(new String[set.size()]));
        } else {
            bundle.putString(SAVE_STATE_INITIAL_SELECTION, this.mInitialSelection);
        }
    }
}
