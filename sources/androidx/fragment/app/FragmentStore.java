package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class FragmentStore {
    private static final String TAG = "FragmentManager";
    private FragmentManagerViewModel mNonConfig;
    private final ArrayList<Fragment> mAdded = new ArrayList<>();
    private final HashMap<String, FragmentStateManager> mActive = new HashMap<>();
    private final HashMap<String, Bundle> mSavedState = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addFragment(@NonNull Fragment fragment) {
        if (!this.mAdded.contains(fragment)) {
            synchronized (this.mAdded) {
                this.mAdded.add(fragment);
            }
            fragment.mAdded = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void burpActive() {
        this.mActive.values().removeAll(Collections.singleton(null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean containsActiveFragment(@NonNull String str) {
        if (this.mActive.get(str) != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void dispatchStateChange(int i8) {
        for (FragmentStateManager fragmentStateManager : this.mActive.values()) {
            if (fragmentStateManager != null) {
                fragmentStateManager.setFragmentManagerState(i8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void dump(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
        String str2 = str + "    ";
        if (!this.mActive.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (FragmentStateManager fragmentStateManager : this.mActive.values()) {
                printWriter.print(str);
                if (fragmentStateManager != null) {
                    Fragment fragment = fragmentStateManager.getFragment();
                    printWriter.println(fragment);
                    fragment.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.mAdded.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i8 = 0; i8 < size; i8++) {
                Fragment fragment2 = this.mAdded.get(i8);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i8);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public Fragment findActiveFragment(@NonNull String str) {
        FragmentStateManager fragmentStateManager = this.mActive.get(str);
        if (fragmentStateManager != null) {
            return fragmentStateManager.getFragment();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public Fragment findFragmentById(@IdRes int i8) {
        for (int size = this.mAdded.size() - 1; size >= 0; size--) {
            Fragment fragment = this.mAdded.get(size);
            if (fragment != null && fragment.mFragmentId == i8) {
                return fragment;
            }
        }
        for (FragmentStateManager fragmentStateManager : this.mActive.values()) {
            if (fragmentStateManager != null) {
                Fragment fragment2 = fragmentStateManager.getFragment();
                if (fragment2.mFragmentId == i8) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public Fragment findFragmentByTag(@Nullable String str) {
        if (str != null) {
            for (int size = this.mAdded.size() - 1; size >= 0; size--) {
                Fragment fragment = this.mAdded.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (FragmentStateManager fragmentStateManager : this.mActive.values()) {
                if (fragmentStateManager != null) {
                    Fragment fragment2 = fragmentStateManager.getFragment();
                    if (str.equals(fragment2.mTag)) {
                        return fragment2;
                    }
                }
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public Fragment findFragmentByWho(@NonNull String str) {
        Fragment findFragmentByWho;
        for (FragmentStateManager fragmentStateManager : this.mActive.values()) {
            if (fragmentStateManager != null && (findFragmentByWho = fragmentStateManager.getFragment().findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int findFragmentIndexInContainer(@NonNull Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.mAdded.indexOf(fragment);
        for (int i8 = indexOf - 1; i8 >= 0; i8--) {
            Fragment fragment2 = this.mAdded.get(i8);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.mAdded.size()) {
                return -1;
            }
            Fragment fragment3 = this.mAdded.get(indexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getActiveFragmentCount() {
        return this.mActive.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public List<FragmentStateManager> getActiveFragmentStateManagers() {
        ArrayList arrayList = new ArrayList();
        for (FragmentStateManager fragmentStateManager : this.mActive.values()) {
            if (fragmentStateManager != null) {
                arrayList.add(fragmentStateManager);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public List<Fragment> getActiveFragments() {
        ArrayList arrayList = new ArrayList();
        for (FragmentStateManager fragmentStateManager : this.mActive.values()) {
            if (fragmentStateManager != null) {
                arrayList.add(fragmentStateManager.getFragment());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public HashMap<String, Bundle> getAllSavedState() {
        return this.mSavedState;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public FragmentStateManager getFragmentStateManager(@NonNull String str) {
        return this.mActive.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public List<Fragment> getFragments() {
        ArrayList arrayList;
        if (this.mAdded.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.mAdded) {
            arrayList = new ArrayList(this.mAdded);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FragmentManagerViewModel getNonConfig() {
        return this.mNonConfig;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public Bundle getSavedState(@NonNull String str) {
        return this.mSavedState.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void makeActive(@NonNull FragmentStateManager fragmentStateManager) {
        Fragment fragment = fragmentStateManager.getFragment();
        if (containsActiveFragment(fragment.mWho)) {
            return;
        }
        this.mActive.put(fragment.mWho, fragmentStateManager);
        if (fragment.mRetainInstanceChangedWhileDetached) {
            if (fragment.mRetainInstance) {
                this.mNonConfig.addRetainedFragment(fragment);
            } else {
                this.mNonConfig.removeRetainedFragment(fragment);
            }
            fragment.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void makeInactive(@NonNull FragmentStateManager fragmentStateManager) {
        Fragment fragment = fragmentStateManager.getFragment();
        if (fragment.mRetainInstance) {
            this.mNonConfig.removeRetainedFragment(fragment);
        }
        if (this.mActive.get(fragment.mWho) == fragmentStateManager && this.mActive.put(fragment.mWho, null) != null && FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void moveToExpectedState() {
        Iterator<Fragment> it = this.mAdded.iterator();
        while (it.hasNext()) {
            FragmentStateManager fragmentStateManager = this.mActive.get(it.next().mWho);
            if (fragmentStateManager != null) {
                fragmentStateManager.moveToExpectedState();
            }
        }
        for (FragmentStateManager fragmentStateManager2 : this.mActive.values()) {
            if (fragmentStateManager2 != null) {
                fragmentStateManager2.moveToExpectedState();
                Fragment fragment = fragmentStateManager2.getFragment();
                if (fragment.mRemoving && !fragment.isInBackStack()) {
                    if (fragment.mBeingSaved && !this.mSavedState.containsKey(fragment.mWho)) {
                        setSavedState(fragment.mWho, fragmentStateManager2.saveState());
                    }
                    makeInactive(fragmentStateManager2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeFragment(@NonNull Fragment fragment) {
        synchronized (this.mAdded) {
            this.mAdded.remove(fragment);
        }
        fragment.mAdded = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void resetActiveFragments() {
        this.mActive.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void restoreAddedFragments(@Nullable List<String> list) {
        this.mAdded.clear();
        if (list != null) {
            for (String str : list) {
                Fragment findActiveFragment = findActiveFragment(str);
                if (findActiveFragment != null) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + findActiveFragment);
                    }
                    addFragment(findActiveFragment);
                } else {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void restoreSaveState(@NonNull HashMap<String, Bundle> hashMap) {
        this.mSavedState.clear();
        this.mSavedState.putAll(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public ArrayList<String> saveActiveFragments() {
        ArrayList<String> arrayList = new ArrayList<>(this.mActive.size());
        for (FragmentStateManager fragmentStateManager : this.mActive.values()) {
            if (fragmentStateManager != null) {
                Fragment fragment = fragmentStateManager.getFragment();
                setSavedState(fragment.mWho, fragmentStateManager.saveState());
                arrayList.add(fragment.mWho);
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + fragment.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public ArrayList<String> saveAddedFragments() {
        synchronized (this.mAdded) {
            try {
                if (this.mAdded.isEmpty()) {
                    return null;
                }
                ArrayList<String> arrayList = new ArrayList<>(this.mAdded.size());
                Iterator<Fragment> it = this.mAdded.iterator();
                while (it.hasNext()) {
                    Fragment next = it.next();
                    arrayList.add(next.mWho);
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + next.mWho + "): " + next);
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setNonConfig(@NonNull FragmentManagerViewModel fragmentManagerViewModel) {
        this.mNonConfig = fragmentManagerViewModel;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public Bundle setSavedState(@NonNull String str, @Nullable Bundle bundle) {
        if (bundle != null) {
            return this.mSavedState.put(str, bundle);
        }
        return this.mSavedState.remove(str);
    }
}
