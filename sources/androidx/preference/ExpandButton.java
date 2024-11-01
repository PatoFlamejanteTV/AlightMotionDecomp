package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
final class ExpandButton extends Preference {
    private long mId;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ExpandButton(@NonNull Context context, List<Preference> list, long j8) {
        super(context);
        initLayout();
        setSummary(list);
        this.mId = j8 + 1000000;
    }

    private void initLayout() {
        setLayoutResource(R.layout.expand_button);
        setIcon(R.drawable.ic_arrow_down_24dp);
        setTitle(R.string.expand_button_title);
        setOrder(RoomDatabase.MAX_BIND_PARAMETER_CNT);
    }

    private void setSummary(List<Preference> list) {
        ArrayList arrayList = new ArrayList();
        CharSequence charSequence = null;
        for (Preference preference : list) {
            CharSequence title = preference.getTitle();
            boolean z8 = preference instanceof PreferenceGroup;
            if (z8 && !TextUtils.isEmpty(title)) {
                arrayList.add((PreferenceGroup) preference);
            }
            if (arrayList.contains(preference.getParent())) {
                if (z8) {
                    arrayList.add((PreferenceGroup) preference);
                }
            } else if (!TextUtils.isEmpty(title)) {
                if (charSequence == null) {
                    charSequence = title;
                } else {
                    charSequence = getContext().getString(R.string.summary_collapsed_preference_list, charSequence, title);
                }
            }
        }
        setSummary(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.preference.Preference
    public long getId() {
        return this.mId;
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(@NonNull PreferenceViewHolder preferenceViewHolder) {
        super.onBindViewHolder(preferenceViewHolder);
        preferenceViewHolder.setDividerAllowedAbove(false);
    }
}
