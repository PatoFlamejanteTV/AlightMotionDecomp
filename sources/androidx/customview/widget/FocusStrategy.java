package androidx.customview.widget;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes3.dex */
class FocusStrategy {

    /* loaded from: classes3.dex */
    public interface BoundsAdapter<T> {
        void obtainBounds(T t8, Rect rect);
    }

    /* loaded from: classes3.dex */
    public interface CollectionAdapter<T, V> {
        V get(T t8, int i8);

        int size(T t8);
    }

    /* loaded from: classes3.dex */
    private static class SequentialComparator<T> implements Comparator<T> {
        private final BoundsAdapter<T> mAdapter;
        private final boolean mIsLayoutRtl;
        private final Rect mTemp1 = new Rect();
        private final Rect mTemp2 = new Rect();

        SequentialComparator(boolean z8, BoundsAdapter<T> boundsAdapter) {
            this.mIsLayoutRtl = z8;
            this.mAdapter = boundsAdapter;
        }

        @Override // java.util.Comparator
        public int compare(T t8, T t9) {
            Rect rect = this.mTemp1;
            Rect rect2 = this.mTemp2;
            this.mAdapter.obtainBounds(t8, rect);
            this.mAdapter.obtainBounds(t9, rect2);
            int i8 = rect.top;
            int i9 = rect2.top;
            if (i8 < i9) {
                return -1;
            }
            if (i8 > i9) {
                return 1;
            }
            int i10 = rect.left;
            int i11 = rect2.left;
            if (i10 < i11) {
                if (!this.mIsLayoutRtl) {
                    return -1;
                }
                return 1;
            }
            if (i10 > i11) {
                if (this.mIsLayoutRtl) {
                    return -1;
                }
                return 1;
            }
            int i12 = rect.bottom;
            int i13 = rect2.bottom;
            if (i12 < i13) {
                return -1;
            }
            if (i12 > i13) {
                return 1;
            }
            int i14 = rect.right;
            int i15 = rect2.right;
            if (i14 < i15) {
                if (!this.mIsLayoutRtl) {
                    return -1;
                }
                return 1;
            }
            if (i14 > i15) {
                if (this.mIsLayoutRtl) {
                    return -1;
                }
                return 1;
            }
            return 0;
        }
    }

    private FocusStrategy() {
    }

    private static boolean beamBeats(int i8, @NonNull Rect rect, @NonNull Rect rect2, @NonNull Rect rect3) {
        boolean beamsOverlap = beamsOverlap(i8, rect, rect2);
        if (beamsOverlap(i8, rect, rect3) || !beamsOverlap) {
            return false;
        }
        if (isToDirectionOf(i8, rect, rect3) && i8 != 17 && i8 != 66 && majorAxisDistance(i8, rect, rect2) >= majorAxisDistanceToFarEdge(i8, rect, rect3)) {
            return false;
        }
        return true;
    }

    private static boolean beamsOverlap(int i8, @NonNull Rect rect, @NonNull Rect rect2) {
        if (i8 != 17) {
            if (i8 != 33) {
                if (i8 != 66) {
                    if (i8 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right < rect.left || rect2.left > rect.right) {
                return false;
            }
            return true;
        }
        if (rect2.bottom < rect.top || rect2.top > rect.bottom) {
            return false;
        }
        return true;
    }

    public static <L, T> T findNextFocusInAbsoluteDirection(@NonNull L l8, @NonNull CollectionAdapter<L, T> collectionAdapter, @NonNull BoundsAdapter<T> boundsAdapter, @Nullable T t8, @NonNull Rect rect, int i8) {
        Rect rect2 = new Rect(rect);
        if (i8 != 17) {
            if (i8 != 33) {
                if (i8 != 66) {
                    if (i8 == 130) {
                        rect2.offset(0, -(rect.height() + 1));
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    rect2.offset(-(rect.width() + 1), 0);
                }
            } else {
                rect2.offset(0, rect.height() + 1);
            }
        } else {
            rect2.offset(rect.width() + 1, 0);
        }
        int size = collectionAdapter.size(l8);
        Rect rect3 = new Rect();
        T t9 = null;
        for (int i9 = 0; i9 < size; i9++) {
            T t10 = collectionAdapter.get(l8, i9);
            if (t10 != t8) {
                boundsAdapter.obtainBounds(t10, rect3);
                if (isBetterCandidate(i8, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t9 = t10;
                }
            }
        }
        return t9;
    }

    public static <L, T> T findNextFocusInRelativeDirection(@NonNull L l8, @NonNull CollectionAdapter<L, T> collectionAdapter, @NonNull BoundsAdapter<T> boundsAdapter, @Nullable T t8, int i8, boolean z8, boolean z9) {
        int size = collectionAdapter.size(l8);
        ArrayList arrayList = new ArrayList(size);
        for (int i9 = 0; i9 < size; i9++) {
            arrayList.add(collectionAdapter.get(l8, i9));
        }
        Collections.sort(arrayList, new SequentialComparator(z8, boundsAdapter));
        if (i8 != 1) {
            if (i8 == 2) {
                return (T) getNextFocusable(t8, arrayList, z9);
            }
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
        }
        return (T) getPreviousFocusable(t8, arrayList, z9);
    }

    private static <T> T getNextFocusable(T t8, ArrayList<T> arrayList, boolean z8) {
        int lastIndexOf;
        int size = arrayList.size();
        if (t8 == null) {
            lastIndexOf = -1;
        } else {
            lastIndexOf = arrayList.lastIndexOf(t8);
        }
        int i8 = lastIndexOf + 1;
        if (i8 < size) {
            return arrayList.get(i8);
        }
        if (z8 && size > 0) {
            return arrayList.get(0);
        }
        return null;
    }

    private static <T> T getPreviousFocusable(T t8, ArrayList<T> arrayList, boolean z8) {
        int indexOf;
        int size = arrayList.size();
        if (t8 == null) {
            indexOf = size;
        } else {
            indexOf = arrayList.indexOf(t8);
        }
        int i8 = indexOf - 1;
        if (i8 >= 0) {
            return arrayList.get(i8);
        }
        if (z8 && size > 0) {
            return arrayList.get(size - 1);
        }
        return null;
    }

    private static int getWeightedDistanceFor(int i8, int i9) {
        return (i8 * 13 * i8) + (i9 * i9);
    }

    private static boolean isBetterCandidate(int i8, @NonNull Rect rect, @NonNull Rect rect2, @NonNull Rect rect3) {
        if (!isCandidate(rect, rect2, i8)) {
            return false;
        }
        if (!isCandidate(rect, rect3, i8) || beamBeats(i8, rect, rect2, rect3)) {
            return true;
        }
        if (beamBeats(i8, rect, rect3, rect2) || getWeightedDistanceFor(majorAxisDistance(i8, rect, rect2), minorAxisDistance(i8, rect, rect2)) >= getWeightedDistanceFor(majorAxisDistance(i8, rect, rect3), minorAxisDistance(i8, rect, rect3))) {
            return false;
        }
        return true;
    }

    private static boolean isCandidate(@NonNull Rect rect, @NonNull Rect rect2, int i8) {
        if (i8 != 17) {
            if (i8 != 33) {
                if (i8 != 66) {
                    if (i8 == 130) {
                        int i9 = rect.top;
                        int i10 = rect2.top;
                        if ((i9 >= i10 && rect.bottom > i10) || rect.bottom >= rect2.bottom) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                int i11 = rect.left;
                int i12 = rect2.left;
                if ((i11 >= i12 && rect.right > i12) || rect.right >= rect2.right) {
                    return false;
                }
                return true;
            }
            int i13 = rect.bottom;
            int i14 = rect2.bottom;
            if ((i13 <= i14 && rect.top < i14) || rect.top <= rect2.top) {
                return false;
            }
            return true;
        }
        int i15 = rect.right;
        int i16 = rect2.right;
        if ((i15 <= i16 && rect.left < i16) || rect.left <= rect2.left) {
            return false;
        }
        return true;
    }

    private static boolean isToDirectionOf(int i8, @NonNull Rect rect, @NonNull Rect rect2) {
        if (i8 != 17) {
            if (i8 != 33) {
                if (i8 != 66) {
                    if (i8 == 130) {
                        if (rect.bottom > rect2.top) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                if (rect.right > rect2.left) {
                    return false;
                }
                return true;
            }
            if (rect.top < rect2.bottom) {
                return false;
            }
            return true;
        }
        if (rect.left < rect2.right) {
            return false;
        }
        return true;
    }

    private static int majorAxisDistance(int i8, @NonNull Rect rect, @NonNull Rect rect2) {
        return Math.max(0, majorAxisDistanceRaw(i8, rect, rect2));
    }

    private static int majorAxisDistanceRaw(int i8, @NonNull Rect rect, @NonNull Rect rect2) {
        int i9;
        int i10;
        if (i8 != 17) {
            if (i8 != 33) {
                if (i8 != 66) {
                    if (i8 == 130) {
                        i9 = rect2.top;
                        i10 = rect.bottom;
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    i9 = rect2.left;
                    i10 = rect.right;
                }
            } else {
                i9 = rect.top;
                i10 = rect2.bottom;
            }
        } else {
            i9 = rect.left;
            i10 = rect2.right;
        }
        return i9 - i10;
    }

    private static int majorAxisDistanceToFarEdge(int i8, @NonNull Rect rect, @NonNull Rect rect2) {
        return Math.max(1, majorAxisDistanceToFarEdgeRaw(i8, rect, rect2));
    }

    private static int majorAxisDistanceToFarEdgeRaw(int i8, @NonNull Rect rect, @NonNull Rect rect2) {
        int i9;
        int i10;
        if (i8 != 17) {
            if (i8 != 33) {
                if (i8 != 66) {
                    if (i8 == 130) {
                        i9 = rect2.bottom;
                        i10 = rect.bottom;
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    i9 = rect2.right;
                    i10 = rect.right;
                }
            } else {
                i9 = rect.top;
                i10 = rect2.top;
            }
        } else {
            i9 = rect.left;
            i10 = rect2.left;
        }
        return i9 - i10;
    }

    private static int minorAxisDistance(int i8, @NonNull Rect rect, @NonNull Rect rect2) {
        if (i8 != 17) {
            if (i8 != 33) {
                if (i8 != 66) {
                    if (i8 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }
}
