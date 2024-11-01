package com.google.android.material.tabs;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class TabLayoutMediator {

    @Nullable
    private RecyclerView.Adapter<?> adapter;
    private boolean attached;
    private final boolean autoRefresh;

    @Nullable
    private TabLayoutOnPageChangeCallback onPageChangeCallback;

    @Nullable
    private TabLayout.OnTabSelectedListener onTabSelectedListener;

    @Nullable
    private RecyclerView.AdapterDataObserver pagerAdapterObserver;
    private final boolean smoothScroll;
    private final TabConfigurationStrategy tabConfigurationStrategy;

    @NonNull
    private final TabLayout tabLayout;

    @NonNull
    private final ViewPager2 viewPager;

    /* loaded from: classes3.dex */
    private class PagerAdapterObserver extends RecyclerView.AdapterDataObserver {
        PagerAdapterObserver() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i8, int i9) {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i8, int i9) {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i8, int i9, int i10) {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i8, int i9) {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i8, int i9, @Nullable Object obj) {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }
    }

    /* loaded from: classes3.dex */
    public interface TabConfigurationStrategy {
        void onConfigureTab(@NonNull TabLayout.Tab tab, int i8);
    }

    /* loaded from: classes3.dex */
    private static class TabLayoutOnPageChangeCallback extends ViewPager2.OnPageChangeCallback {
        private int previousScrollState;
        private int scrollState;

        @NonNull
        private final WeakReference<TabLayout> tabLayoutRef;

        TabLayoutOnPageChangeCallback(TabLayout tabLayout) {
            this.tabLayoutRef = new WeakReference<>(tabLayout);
            reset();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i8) {
            this.previousScrollState = this.scrollState;
            this.scrollState = i8;
            TabLayout tabLayout = this.tabLayoutRef.get();
            if (tabLayout != null) {
                tabLayout.updateViewPagerScrollState(this.scrollState);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i8, float f8, int i9) {
            boolean z8;
            boolean z9;
            TabLayout tabLayout = this.tabLayoutRef.get();
            if (tabLayout != null) {
                int i10 = this.scrollState;
                if (i10 == 2 && this.previousScrollState != 1) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                if (i10 == 2 && this.previousScrollState == 0) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                tabLayout.setScrollPosition(i8, f8, z8, z9, false);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i8) {
            boolean z8;
            TabLayout tabLayout = this.tabLayoutRef.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i8 && i8 < tabLayout.getTabCount()) {
                int i9 = this.scrollState;
                if (i9 != 0 && (i9 != 2 || this.previousScrollState != 0)) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                tabLayout.selectTab(tabLayout.getTabAt(i8), z8);
            }
        }

        void reset() {
            this.scrollState = 0;
            this.previousScrollState = 0;
        }
    }

    /* loaded from: classes3.dex */
    private static class ViewPagerOnTabSelectedListener implements TabLayout.OnTabSelectedListener {
        private final boolean smoothScroll;
        private final ViewPager2 viewPager;

        ViewPagerOnTabSelectedListener(ViewPager2 viewPager2, boolean z8) {
            this.viewPager = viewPager2;
            this.smoothScroll = z8;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(@NonNull TabLayout.Tab tab) {
            this.viewPager.setCurrentItem(tab.getPosition(), this.smoothScroll);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    public TabLayoutMediator(@NonNull TabLayout tabLayout, @NonNull ViewPager2 viewPager2, @NonNull TabConfigurationStrategy tabConfigurationStrategy) {
        this(tabLayout, viewPager2, true, tabConfigurationStrategy);
    }

    public void attach() {
        if (!this.attached) {
            RecyclerView.Adapter<?> adapter = this.viewPager.getAdapter();
            this.adapter = adapter;
            if (adapter != null) {
                this.attached = true;
                TabLayoutOnPageChangeCallback tabLayoutOnPageChangeCallback = new TabLayoutOnPageChangeCallback(this.tabLayout);
                this.onPageChangeCallback = tabLayoutOnPageChangeCallback;
                this.viewPager.registerOnPageChangeCallback(tabLayoutOnPageChangeCallback);
                ViewPagerOnTabSelectedListener viewPagerOnTabSelectedListener = new ViewPagerOnTabSelectedListener(this.viewPager, this.smoothScroll);
                this.onTabSelectedListener = viewPagerOnTabSelectedListener;
                this.tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) viewPagerOnTabSelectedListener);
                if (this.autoRefresh) {
                    PagerAdapterObserver pagerAdapterObserver = new PagerAdapterObserver();
                    this.pagerAdapterObserver = pagerAdapterObserver;
                    this.adapter.registerAdapterDataObserver(pagerAdapterObserver);
                }
                populateTabsFromPagerAdapter();
                this.tabLayout.setScrollPosition(this.viewPager.getCurrentItem(), 0.0f, true);
                return;
            }
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        throw new IllegalStateException("TabLayoutMediator is already attached");
    }

    public void detach() {
        RecyclerView.Adapter<?> adapter;
        if (this.autoRefresh && (adapter = this.adapter) != null) {
            adapter.unregisterAdapterDataObserver(this.pagerAdapterObserver);
            this.pagerAdapterObserver = null;
        }
        this.tabLayout.removeOnTabSelectedListener(this.onTabSelectedListener);
        this.viewPager.unregisterOnPageChangeCallback(this.onPageChangeCallback);
        this.onTabSelectedListener = null;
        this.onPageChangeCallback = null;
        this.adapter = null;
        this.attached = false;
    }

    public boolean isAttached() {
        return this.attached;
    }

    void populateTabsFromPagerAdapter() {
        this.tabLayout.removeAllTabs();
        RecyclerView.Adapter<?> adapter = this.adapter;
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            for (int i8 = 0; i8 < itemCount; i8++) {
                TabLayout.Tab newTab = this.tabLayout.newTab();
                this.tabConfigurationStrategy.onConfigureTab(newTab, i8);
                this.tabLayout.addTab(newTab, false);
            }
            if (itemCount > 0) {
                int min = Math.min(this.viewPager.getCurrentItem(), this.tabLayout.getTabCount() - 1);
                if (min != this.tabLayout.getSelectedTabPosition()) {
                    TabLayout tabLayout = this.tabLayout;
                    tabLayout.selectTab(tabLayout.getTabAt(min));
                }
            }
        }
    }

    public TabLayoutMediator(@NonNull TabLayout tabLayout, @NonNull ViewPager2 viewPager2, boolean z8, @NonNull TabConfigurationStrategy tabConfigurationStrategy) {
        this(tabLayout, viewPager2, z8, true, tabConfigurationStrategy);
    }

    public TabLayoutMediator(@NonNull TabLayout tabLayout, @NonNull ViewPager2 viewPager2, boolean z8, boolean z9, @NonNull TabConfigurationStrategy tabConfigurationStrategy) {
        this.tabLayout = tabLayout;
        this.viewPager = viewPager2;
        this.autoRefresh = z8;
        this.smoothScroll = z9;
        this.tabConfigurationStrategy = tabConfigurationStrategy;
    }
}
