package androidx.leanback.app;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.speech.SpeechRecognizer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.CompletionInfo;
import android.widget.FrameLayout;
import androidx.leanback.R;
import androidx.leanback.widget.ObjectAdapter;
import androidx.leanback.widget.OnItemViewClickedListener;
import androidx.leanback.widget.OnItemViewSelectedListener;
import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.Row;
import androidx.leanback.widget.RowPresenter;
import androidx.leanback.widget.SearchBar;
import androidx.leanback.widget.SearchOrbView;
import androidx.leanback.widget.SpeechRecognitionCallback;
import androidx.leanback.widget.VerticalGridView;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
public class SearchFragment extends Fragment {
    private static final String ARG_PREFIX = "androidx.leanback.app.SearchFragment";
    private static final String ARG_QUERY;
    private static final String ARG_TITLE;
    static final int AUDIO_PERMISSION_REQUEST_CODE = 0;
    static final boolean DEBUG = false;
    private static final String EXTRA_LEANBACK_BADGE_PRESENT = "LEANBACK_BADGE_PRESENT";
    static final int QUERY_COMPLETE = 2;
    static final int RESULTS_CHANGED = 1;
    static final long SPEECH_RECOGNITION_DELAY_MS = 300;
    static final String TAG = "SearchFragment";
    private Drawable mBadgeDrawable;
    private ExternalQuery mExternalQuery;
    private boolean mIsPaused;
    private OnItemViewClickedListener mOnItemViewClickedListener;
    OnItemViewSelectedListener mOnItemViewSelectedListener;
    private boolean mPendingStartRecognitionWhenPaused;
    SearchResultProvider mProvider;
    ObjectAdapter mResultAdapter;
    RowsFragment mRowsFragment;
    SearchBar mSearchBar;
    private SpeechRecognitionCallback mSpeechRecognitionCallback;
    private SpeechRecognizer mSpeechRecognizer;
    int mStatus;
    private String mTitle;
    final ObjectAdapter.DataObserver mAdapterObserver = new ObjectAdapter.DataObserver() { // from class: androidx.leanback.app.SearchFragment.1
        @Override // androidx.leanback.widget.ObjectAdapter.DataObserver
        public void onChanged() {
            SearchFragment searchFragment = SearchFragment.this;
            searchFragment.mHandler.removeCallbacks(searchFragment.mResultsChangedCallback);
            SearchFragment searchFragment2 = SearchFragment.this;
            searchFragment2.mHandler.post(searchFragment2.mResultsChangedCallback);
        }
    };
    final Handler mHandler = new Handler();
    final Runnable mResultsChangedCallback = new Runnable() { // from class: androidx.leanback.app.SearchFragment.2
        @Override // java.lang.Runnable
        public void run() {
            RowsFragment rowsFragment = SearchFragment.this.mRowsFragment;
            if (rowsFragment != null) {
                ObjectAdapter adapter = rowsFragment.getAdapter();
                SearchFragment searchFragment = SearchFragment.this;
                if (adapter != searchFragment.mResultAdapter && (searchFragment.mRowsFragment.getAdapter() != null || SearchFragment.this.mResultAdapter.size() != 0)) {
                    SearchFragment searchFragment2 = SearchFragment.this;
                    searchFragment2.mRowsFragment.setAdapter(searchFragment2.mResultAdapter);
                    SearchFragment.this.mRowsFragment.setSelectedPosition(0);
                }
            }
            SearchFragment.this.updateSearchBarVisibility();
            SearchFragment searchFragment3 = SearchFragment.this;
            int i8 = searchFragment3.mStatus | 1;
            searchFragment3.mStatus = i8;
            if ((i8 & 2) != 0) {
                searchFragment3.updateFocus();
            }
            SearchFragment.this.updateSearchBarNextFocusId();
        }
    };
    private final Runnable mSetSearchResultProvider = new Runnable() { // from class: androidx.leanback.app.SearchFragment.3
        @Override // java.lang.Runnable
        public void run() {
            boolean z8;
            ObjectAdapter objectAdapter;
            SearchFragment searchFragment = SearchFragment.this;
            if (searchFragment.mRowsFragment == null) {
                return;
            }
            ObjectAdapter resultsAdapter = searchFragment.mProvider.getResultsAdapter();
            SearchFragment searchFragment2 = SearchFragment.this;
            ObjectAdapter objectAdapter2 = searchFragment2.mResultAdapter;
            if (resultsAdapter != objectAdapter2) {
                if (objectAdapter2 == null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                searchFragment2.releaseAdapter();
                SearchFragment searchFragment3 = SearchFragment.this;
                searchFragment3.mResultAdapter = resultsAdapter;
                if (resultsAdapter != null) {
                    resultsAdapter.registerObserver(searchFragment3.mAdapterObserver);
                }
                if (!z8 || ((objectAdapter = SearchFragment.this.mResultAdapter) != null && objectAdapter.size() != 0)) {
                    SearchFragment searchFragment4 = SearchFragment.this;
                    searchFragment4.mRowsFragment.setAdapter(searchFragment4.mResultAdapter);
                }
                SearchFragment.this.executePendingQuery();
            }
            SearchFragment.this.updateSearchBarNextFocusId();
            SearchFragment searchFragment5 = SearchFragment.this;
            if (searchFragment5.mAutoStartRecognition) {
                searchFragment5.mHandler.removeCallbacks(searchFragment5.mStartRecognitionRunnable);
                SearchFragment searchFragment6 = SearchFragment.this;
                searchFragment6.mHandler.postDelayed(searchFragment6.mStartRecognitionRunnable, SearchFragment.SPEECH_RECOGNITION_DELAY_MS);
                return;
            }
            searchFragment5.updateFocus();
        }
    };
    final Runnable mStartRecognitionRunnable = new Runnable() { // from class: androidx.leanback.app.SearchFragment.4
        @Override // java.lang.Runnable
        public void run() {
            SearchFragment searchFragment = SearchFragment.this;
            searchFragment.mAutoStartRecognition = false;
            searchFragment.mSearchBar.startRecognition();
        }
    };
    String mPendingQuery = null;
    boolean mAutoStartRecognition = true;
    private SearchBar.SearchBarPermissionListener mPermissionListener = new SearchBar.SearchBarPermissionListener() { // from class: androidx.leanback.app.SearchFragment.5
        @Override // androidx.leanback.widget.SearchBar.SearchBarPermissionListener
        public void requestAudioPermission() {
            PermissionHelper.requestPermissions(SearchFragment.this, new String[]{"android.permission.RECORD_AUDIO"}, 0);
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class ExternalQuery {
        String mQuery;
        boolean mSubmit;

        ExternalQuery(String str, boolean z8) {
            this.mQuery = str;
            this.mSubmit = z8;
        }
    }

    /* loaded from: classes3.dex */
    public interface SearchResultProvider {
        ObjectAdapter getResultsAdapter();

        boolean onQueryTextChange(String str);

        boolean onQueryTextSubmit(String str);
    }

    static {
        String canonicalName = SearchFragment.class.getCanonicalName();
        ARG_QUERY = canonicalName + ".query";
        ARG_TITLE = canonicalName + ".title";
    }

    private void applyExternalQuery() {
        SearchBar searchBar;
        ExternalQuery externalQuery = this.mExternalQuery;
        if (externalQuery != null && (searchBar = this.mSearchBar) != null) {
            searchBar.setSearchQuery(externalQuery.mQuery);
            ExternalQuery externalQuery2 = this.mExternalQuery;
            if (externalQuery2.mSubmit) {
                submitQuery(externalQuery2.mQuery);
            }
            this.mExternalQuery = null;
        }
    }

    public static Bundle createArgs(Bundle bundle, String str) {
        return createArgs(bundle, str, null);
    }

    private void focusOnResults() {
        RowsFragment rowsFragment = this.mRowsFragment;
        if (rowsFragment != null && rowsFragment.getVerticalGridView() != null && this.mResultAdapter.size() != 0 && this.mRowsFragment.getVerticalGridView().requestFocus()) {
            this.mStatus &= -2;
        }
    }

    public static SearchFragment newInstance(String str) {
        SearchFragment searchFragment = new SearchFragment();
        searchFragment.setArguments(createArgs(null, str));
        return searchFragment;
    }

    private void onSetSearchResultProvider() {
        this.mHandler.removeCallbacks(this.mSetSearchResultProvider);
        this.mHandler.post(this.mSetSearchResultProvider);
    }

    private void readArguments(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        String str = ARG_QUERY;
        if (bundle.containsKey(str)) {
            setSearchQuery(bundle.getString(str));
        }
        String str2 = ARG_TITLE;
        if (bundle.containsKey(str2)) {
            setTitle(bundle.getString(str2));
        }
    }

    private void releaseRecognizer() {
        if (this.mSpeechRecognizer != null) {
            this.mSearchBar.setSpeechRecognizer(null);
            this.mSpeechRecognizer.destroy();
            this.mSpeechRecognizer = null;
        }
    }

    private void resultsAvailable() {
        if ((this.mStatus & 2) != 0) {
            focusOnResults();
        }
        updateSearchBarNextFocusId();
    }

    public void displayCompletions(List<String> list) {
        this.mSearchBar.displayCompletions(list);
    }

    void executePendingQuery() {
        String str = this.mPendingQuery;
        if (str != null && this.mResultAdapter != null) {
            this.mPendingQuery = null;
            retrieveResults(str);
        }
    }

    public Drawable getBadgeDrawable() {
        SearchBar searchBar = this.mSearchBar;
        if (searchBar != null) {
            return searchBar.getBadgeDrawable();
        }
        return null;
    }

    public Intent getRecognizerIntent() {
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        boolean z8 = true;
        intent.putExtra("android.speech.extra.PARTIAL_RESULTS", true);
        SearchBar searchBar = this.mSearchBar;
        if (searchBar != null && searchBar.getHint() != null) {
            intent.putExtra("android.speech.extra.PROMPT", this.mSearchBar.getHint());
        }
        if (this.mBadgeDrawable == null) {
            z8 = false;
        }
        intent.putExtra(EXTRA_LEANBACK_BADGE_PRESENT, z8);
        return intent;
    }

    public RowsFragment getRowsFragment() {
        return this.mRowsFragment;
    }

    public String getTitle() {
        SearchBar searchBar = this.mSearchBar;
        if (searchBar != null) {
            return searchBar.getTitle();
        }
        return null;
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        boolean z8;
        if (this.mAutoStartRecognition) {
            if (bundle == null) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.mAutoStartRecognition = z8;
        }
        super.onCreate(bundle);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.lb_search_fragment, viewGroup, false);
        SearchBar searchBar = (SearchBar) ((FrameLayout) inflate.findViewById(R.id.lb_search_frame)).findViewById(R.id.lb_search_bar);
        this.mSearchBar = searchBar;
        searchBar.setSearchBarListener(new SearchBar.SearchBarListener() { // from class: androidx.leanback.app.SearchFragment.6
            @Override // androidx.leanback.widget.SearchBar.SearchBarListener
            public void onKeyboardDismiss(String str) {
                SearchFragment.this.queryComplete();
            }

            @Override // androidx.leanback.widget.SearchBar.SearchBarListener
            public void onSearchQueryChange(String str) {
                SearchFragment searchFragment = SearchFragment.this;
                if (searchFragment.mProvider != null) {
                    searchFragment.retrieveResults(str);
                } else {
                    searchFragment.mPendingQuery = str;
                }
            }

            @Override // androidx.leanback.widget.SearchBar.SearchBarListener
            public void onSearchQuerySubmit(String str) {
                SearchFragment.this.submitQuery(str);
            }
        });
        this.mSearchBar.setSpeechRecognitionCallback(this.mSpeechRecognitionCallback);
        this.mSearchBar.setPermissionListener(this.mPermissionListener);
        applyExternalQuery();
        readArguments(getArguments());
        Drawable drawable = this.mBadgeDrawable;
        if (drawable != null) {
            setBadgeDrawable(drawable);
        }
        String str = this.mTitle;
        if (str != null) {
            setTitle(str);
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        int i8 = R.id.lb_results_frame;
        if (childFragmentManager.findFragmentById(i8) == null) {
            this.mRowsFragment = new RowsFragment();
            getChildFragmentManager().beginTransaction().replace(i8, this.mRowsFragment).commit();
        } else {
            this.mRowsFragment = (RowsFragment) getChildFragmentManager().findFragmentById(i8);
        }
        this.mRowsFragment.setOnItemViewSelectedListener(new OnItemViewSelectedListener() { // from class: androidx.leanback.app.SearchFragment.7
            @Override // androidx.leanback.widget.BaseOnItemViewSelectedListener
            public void onItemSelected(Presenter.ViewHolder viewHolder, Object obj, RowPresenter.ViewHolder viewHolder2, Row row) {
                SearchFragment.this.updateSearchBarVisibility();
                OnItemViewSelectedListener onItemViewSelectedListener = SearchFragment.this.mOnItemViewSelectedListener;
                if (onItemViewSelectedListener != null) {
                    onItemViewSelectedListener.onItemSelected(viewHolder, obj, viewHolder2, row);
                }
            }
        });
        this.mRowsFragment.setOnItemViewClickedListener(this.mOnItemViewClickedListener);
        this.mRowsFragment.setExpand(true);
        if (this.mProvider != null) {
            onSetSearchResultProvider();
        }
        return inflate;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        releaseAdapter();
        super.onDestroy();
    }

    @Override // android.app.Fragment
    public void onPause() {
        releaseRecognizer();
        this.mIsPaused = true;
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onRequestPermissionsResult(int i8, String[] strArr, int[] iArr) {
        if (i8 == 0 && strArr.length > 0 && strArr[0].equals("android.permission.RECORD_AUDIO") && iArr[0] == 0) {
            startRecognition();
        }
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        this.mIsPaused = false;
        if (this.mSpeechRecognitionCallback == null && this.mSpeechRecognizer == null) {
            SpeechRecognizer createSpeechRecognizer = SpeechRecognizer.createSpeechRecognizer(FragmentUtil.getContext(this));
            this.mSpeechRecognizer = createSpeechRecognizer;
            this.mSearchBar.setSpeechRecognizer(createSpeechRecognizer);
        }
        if (this.mPendingStartRecognitionWhenPaused) {
            this.mPendingStartRecognitionWhenPaused = false;
            this.mSearchBar.startRecognition();
        } else {
            this.mSearchBar.stopRecognition();
        }
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        VerticalGridView verticalGridView = this.mRowsFragment.getVerticalGridView();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.lb_search_browse_rows_align_top);
        verticalGridView.setItemAlignmentOffset(0);
        verticalGridView.setItemAlignmentOffsetPercent(-1.0f);
        verticalGridView.setWindowAlignmentOffset(dimensionPixelSize);
        verticalGridView.setWindowAlignmentOffsetPercent(-1.0f);
        verticalGridView.setWindowAlignment(0);
        verticalGridView.setFocusable(false);
        verticalGridView.setFocusableInTouchMode(false);
    }

    void queryComplete() {
        this.mStatus |= 2;
        focusOnResults();
    }

    void releaseAdapter() {
        ObjectAdapter objectAdapter = this.mResultAdapter;
        if (objectAdapter != null) {
            objectAdapter.unregisterObserver(this.mAdapterObserver);
            this.mResultAdapter = null;
        }
    }

    void retrieveResults(String str) {
        if (this.mProvider.onQueryTextChange(str)) {
            this.mStatus &= -3;
        }
    }

    public void setBadgeDrawable(Drawable drawable) {
        this.mBadgeDrawable = drawable;
        SearchBar searchBar = this.mSearchBar;
        if (searchBar != null) {
            searchBar.setBadgeDrawable(drawable);
        }
    }

    public void setOnItemViewClickedListener(OnItemViewClickedListener onItemViewClickedListener) {
        if (onItemViewClickedListener != this.mOnItemViewClickedListener) {
            this.mOnItemViewClickedListener = onItemViewClickedListener;
            RowsFragment rowsFragment = this.mRowsFragment;
            if (rowsFragment != null) {
                rowsFragment.setOnItemViewClickedListener(onItemViewClickedListener);
            }
        }
    }

    public void setOnItemViewSelectedListener(OnItemViewSelectedListener onItemViewSelectedListener) {
        this.mOnItemViewSelectedListener = onItemViewSelectedListener;
    }

    public void setSearchAffordanceColors(SearchOrbView.Colors colors) {
        SearchBar searchBar = this.mSearchBar;
        if (searchBar != null) {
            searchBar.setSearchAffordanceColors(colors);
        }
    }

    public void setSearchAffordanceColorsInListening(SearchOrbView.Colors colors) {
        SearchBar searchBar = this.mSearchBar;
        if (searchBar != null) {
            searchBar.setSearchAffordanceColorsInListening(colors);
        }
    }

    public void setSearchQuery(String str, boolean z8) {
        if (str == null) {
            return;
        }
        this.mExternalQuery = new ExternalQuery(str, z8);
        applyExternalQuery();
        if (this.mAutoStartRecognition) {
            this.mAutoStartRecognition = false;
            this.mHandler.removeCallbacks(this.mStartRecognitionRunnable);
        }
    }

    public void setSearchResultProvider(SearchResultProvider searchResultProvider) {
        if (this.mProvider != searchResultProvider) {
            this.mProvider = searchResultProvider;
            onSetSearchResultProvider();
        }
    }

    @Deprecated
    public void setSpeechRecognitionCallback(SpeechRecognitionCallback speechRecognitionCallback) {
        this.mSpeechRecognitionCallback = speechRecognitionCallback;
        SearchBar searchBar = this.mSearchBar;
        if (searchBar != null) {
            searchBar.setSpeechRecognitionCallback(speechRecognitionCallback);
        }
        if (speechRecognitionCallback != null) {
            releaseRecognizer();
        }
    }

    public void setTitle(String str) {
        this.mTitle = str;
        SearchBar searchBar = this.mSearchBar;
        if (searchBar != null) {
            searchBar.setTitle(str);
        }
    }

    public void startRecognition() {
        if (this.mIsPaused) {
            this.mPendingStartRecognitionWhenPaused = true;
        } else {
            this.mSearchBar.startRecognition();
        }
    }

    void submitQuery(String str) {
        queryComplete();
        SearchResultProvider searchResultProvider = this.mProvider;
        if (searchResultProvider != null) {
            searchResultProvider.onQueryTextSubmit(str);
        }
    }

    void updateFocus() {
        RowsFragment rowsFragment;
        ObjectAdapter objectAdapter = this.mResultAdapter;
        if (objectAdapter != null && objectAdapter.size() > 0 && (rowsFragment = this.mRowsFragment) != null && rowsFragment.getAdapter() == this.mResultAdapter) {
            focusOnResults();
        } else {
            this.mSearchBar.requestFocus();
        }
    }

    void updateSearchBarNextFocusId() {
        ObjectAdapter objectAdapter;
        int i8;
        RowsFragment rowsFragment;
        if (this.mSearchBar != null && (objectAdapter = this.mResultAdapter) != null) {
            if (objectAdapter.size() != 0 && (rowsFragment = this.mRowsFragment) != null && rowsFragment.getVerticalGridView() != null) {
                i8 = this.mRowsFragment.getVerticalGridView().getId();
            } else {
                i8 = 0;
            }
            this.mSearchBar.setNextFocusDownId(i8);
        }
    }

    void updateSearchBarVisibility() {
        int i8;
        int i9;
        ObjectAdapter objectAdapter;
        RowsFragment rowsFragment = this.mRowsFragment;
        if (rowsFragment != null) {
            i8 = rowsFragment.getSelectedPosition();
        } else {
            i8 = -1;
        }
        SearchBar searchBar = this.mSearchBar;
        if (i8 > 0 && (objectAdapter = this.mResultAdapter) != null && objectAdapter.size() != 0) {
            i9 = 8;
        } else {
            i9 = 0;
        }
        searchBar.setVisibility(i9);
    }

    public static Bundle createArgs(Bundle bundle, String str, String str2) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString(ARG_QUERY, str);
        bundle.putString(ARG_TITLE, str2);
        return bundle;
    }

    public void displayCompletions(CompletionInfo[] completionInfoArr) {
        this.mSearchBar.displayCompletions(completionInfoArr);
    }

    public void setSearchQuery(Intent intent, boolean z8) {
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("android.speech.extra.RESULTS");
        if (stringArrayListExtra == null || stringArrayListExtra.size() <= 0) {
            return;
        }
        setSearchQuery(stringArrayListExtra.get(0), z8);
    }

    private void setSearchQuery(String str) {
        this.mSearchBar.setSearchQuery(str);
    }
}
