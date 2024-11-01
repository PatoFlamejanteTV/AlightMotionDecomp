package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import com.google.android.material.internal.MaterialCheckable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@UiThread
/* loaded from: classes3.dex */
public class CheckableGroup<T extends MaterialCheckable<T>> {
    private final Map<Integer, T> checkables = new HashMap();
    private final Set<Integer> checkedIds = new HashSet();
    private OnCheckedStateChangeListener onCheckedStateChangeListener;
    private boolean selectionRequired;
    private boolean singleSelection;

    /* loaded from: classes3.dex */
    public interface OnCheckedStateChangeListener {
        void onCheckedStateChanged(@NonNull Set<Integer> set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkInternal(@NonNull MaterialCheckable<T> materialCheckable) {
        int id = materialCheckable.getId();
        if (this.checkedIds.contains(Integer.valueOf(id))) {
            return false;
        }
        T t8 = this.checkables.get(Integer.valueOf(getSingleCheckedId()));
        if (t8 != null) {
            uncheckInternal(t8, false);
        }
        boolean add = this.checkedIds.add(Integer.valueOf(id));
        if (!materialCheckable.isChecked()) {
            materialCheckable.setChecked(true);
        }
        return add;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCheckedStateChanged() {
        OnCheckedStateChangeListener onCheckedStateChangeListener = this.onCheckedStateChangeListener;
        if (onCheckedStateChangeListener != null) {
            onCheckedStateChangeListener.onCheckedStateChanged(getCheckedIds());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean uncheckInternal(@NonNull MaterialCheckable<T> materialCheckable, boolean z8) {
        int id = materialCheckable.getId();
        if (!this.checkedIds.contains(Integer.valueOf(id))) {
            return false;
        }
        if (z8 && this.checkedIds.size() == 1 && this.checkedIds.contains(Integer.valueOf(id))) {
            materialCheckable.setChecked(true);
            return false;
        }
        boolean remove = this.checkedIds.remove(Integer.valueOf(id));
        if (materialCheckable.isChecked()) {
            materialCheckable.setChecked(false);
        }
        return remove;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addCheckable(T t8) {
        this.checkables.put(Integer.valueOf(t8.getId()), t8);
        if (t8.isChecked()) {
            checkInternal(t8);
        }
        t8.setInternalOnCheckedChangeListener(new MaterialCheckable.OnCheckedChangeListener<T>() { // from class: com.google.android.material.internal.CheckableGroup.1
            @Override // com.google.android.material.internal.MaterialCheckable.OnCheckedChangeListener
            public void onCheckedChanged(T t9, boolean z8) {
                if (z8) {
                    if (!CheckableGroup.this.checkInternal(t9)) {
                        return;
                    }
                } else {
                    CheckableGroup checkableGroup = CheckableGroup.this;
                    if (!checkableGroup.uncheckInternal(t9, checkableGroup.selectionRequired)) {
                        return;
                    }
                }
                CheckableGroup.this.onCheckedStateChanged();
            }
        });
    }

    public void check(@IdRes int i8) {
        T t8 = this.checkables.get(Integer.valueOf(i8));
        if (t8 != null && checkInternal(t8)) {
            onCheckedStateChanged();
        }
    }

    public void clearCheck() {
        boolean z8 = !this.checkedIds.isEmpty();
        Iterator<T> it = this.checkables.values().iterator();
        while (it.hasNext()) {
            uncheckInternal(it.next(), false);
        }
        if (z8) {
            onCheckedStateChanged();
        }
    }

    @NonNull
    public Set<Integer> getCheckedIds() {
        return new HashSet(this.checkedIds);
    }

    @NonNull
    public List<Integer> getCheckedIdsSortedByChildOrder(@NonNull ViewGroup viewGroup) {
        Set<Integer> checkedIds = getCheckedIds();
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
            View childAt = viewGroup.getChildAt(i8);
            if ((childAt instanceof MaterialCheckable) && checkedIds.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    @IdRes
    public int getSingleCheckedId() {
        if (this.singleSelection && !this.checkedIds.isEmpty()) {
            return this.checkedIds.iterator().next().intValue();
        }
        return -1;
    }

    public boolean isSelectionRequired() {
        return this.selectionRequired;
    }

    public boolean isSingleSelection() {
        return this.singleSelection;
    }

    public void removeCheckable(T t8) {
        t8.setInternalOnCheckedChangeListener(null);
        this.checkables.remove(Integer.valueOf(t8.getId()));
        this.checkedIds.remove(Integer.valueOf(t8.getId()));
    }

    public void setOnCheckedStateChangeListener(@Nullable OnCheckedStateChangeListener onCheckedStateChangeListener) {
        this.onCheckedStateChangeListener = onCheckedStateChangeListener;
    }

    public void setSelectionRequired(boolean z8) {
        this.selectionRequired = z8;
    }

    public void setSingleSelection(boolean z8) {
        if (this.singleSelection != z8) {
            this.singleSelection = z8;
            clearCheck();
        }
    }

    public void uncheck(@IdRes int i8) {
        T t8 = this.checkables.get(Integer.valueOf(i8));
        if (t8 != null && uncheckInternal(t8, this.selectionRequired)) {
            onCheckedStateChanged();
        }
    }
}
